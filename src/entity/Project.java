package entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Entity
@Table(name = "t_project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date start = new Date(System.currentTimeMillis());

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date deadline;

    @Column(nullable = false)
    private int memberNumber = 0;

    @Column(nullable = false)
    private int rate = 0;   //0 -- 100， 100则已完成

    private String requestDocument = "";

    private String systemDocument = "";

    @OneToMany(targetEntity = entity.Assignment.class, mappedBy = "project")
    private List<Assignment> assignmentList = new ArrayList<>();

    @ManyToMany(targetEntity = entity.User.class)
    @JoinTable(name = "t_user_project",
                joinColumns = @JoinColumn(name = "project_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
    private List<User> userList = new ArrayList<>();
}
