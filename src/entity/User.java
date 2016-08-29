package entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name = "";

    @Column(nullable = false)
    private String account;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private int tag;   //0普通，1管理员

    private String photo = "";

    private int sex = 3;   //0男，1女，3未知

    private String phone = "";

    private String email = "";

    @Temporal(TemporalType.DATE)
    private Date birthday = new Date(System.currentTimeMillis());

    private int projectNumber = 0;

    private int score = 0;

    @OneToMany(targetEntity = entity.Article.class, mappedBy = "user")
    private List<Article> articleList = new ArrayList<>();

    @ManyToMany(targetEntity = entity.Project.class)
    @JoinTable(name = "t_user_project"
            , joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id")
            ,inverseJoinColumns = @JoinColumn(name = "project_id", referencedColumnName = "id"))
    private List<Project> projectList = new ArrayList<>();
}
