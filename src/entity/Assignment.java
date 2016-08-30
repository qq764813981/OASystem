package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Entity
@Table(name = "t_assignment")
public class Assignment {
    @Id
    @GenericGenerator(name="assignment_uuid", strategy = "uuid")
    @GeneratedValue(generator = "assignment_uuid")
    private String id;

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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getExecutorId() {
        return executorId;
    }

    public void setExecutorId(int executorId) {
        this.executorId = executorId;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getAccomplish() {
        return accomplish;
    }

    public void setAccomplish(int accomplish) {
        this.accomplish = accomplish;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
