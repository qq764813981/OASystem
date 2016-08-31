package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Entity
@Table(name = "t_project")
public class Project {
    @Id
    @GenericGenerator(name="project_uuid", strategy = "uuid")
    @GeneratedValue(generator = "project_uuid")
    private String id;

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

    private String requestDocument = "";  //绝对路径

    private String systemDocument = "";   //绝对路径

    @OneToMany(targetEntity = entity.Assignment.class, mappedBy = "project")
    private List<Assignment> assignmentList = new ArrayList<>();

    @ManyToMany(targetEntity = entity.User.class)
    @JoinTable(name = "t_user_project",
                joinColumns = @JoinColumn(name = "project_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
    private List<User> userList = new ArrayList<>();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getRequestDocument() {
        return requestDocument;
    }

    public void setRequestDocument(String requestDocument) {
        this.requestDocument = requestDocument;
    }

    public String getSystemDocument() {
        return systemDocument;
    }

    public void setSystemDocument(String systemDocument) {
        this.systemDocument = systemDocument;
    }

    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(List<Assignment> assignmentList) {
        this.assignmentList = assignmentList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
