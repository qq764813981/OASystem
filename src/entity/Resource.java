package entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Entity
@Table(name = "t_resource")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int tag;  //学习资源类别，0前端，1后端，2其他

    @Column(nullable = false)
    private String name;

    private String describe = "";

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date time = new Date(System.currentTimeMillis());
}
