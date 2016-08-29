package entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Entity
@Table(name = "t_assignment")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, name = "executor_id")
    private int executorId = 0;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date deadline;

    @Column(nullable = false)
    private String describe;

    @Column(nullable = false)
    private int accomplish = 0; //0未完成，1已完成

    @Column(nullable = false)
    private int score = 0;

    @ManyToOne(targetEntity = entity.Project.class)
    @JoinColumn(name = "project_id", referencedColumnName = "id", nullable = false)
    private Project project;
}
