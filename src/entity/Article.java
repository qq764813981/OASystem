package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Entity
@Table(name = "t_article")
public class Article {
    @Id
    @GenericGenerator(name="article_uuid", strategy = "uuid")
    @GeneratedValue(generator = "article_uuid")
    private String id;

    @Column(nullable = false)
    private String content;

    @Temporal(TemporalType.DATE)
    private Date time = new Date(System.currentTimeMillis());

    @ManyToOne(targetEntity = entity.User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
