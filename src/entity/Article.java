package entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Entity
@Table(name = "t_article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String content;

    @Temporal(TemporalType.DATE)
    private Date time = new Date(System.currentTimeMillis());

    @ManyToOne(targetEntity = entity.User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;
}
