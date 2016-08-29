package entity;

import javax.persistence.*;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Entity
@Table(name = "t_scheme")
public class Scheme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String front;

    @Column(nullable = false)
    private String back;

}
