package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Entity
@Table(name = "t_scheme")
public class Scheme {
    @Id
    @GenericGenerator(name="scheme_uuid", strategy = "uuid")
    @GeneratedValue(generator = "scheme_uuid")
    private String id;

    @Column(nullable = false)
    private String front;

    @Column(nullable = false)
    private String back;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }
}
