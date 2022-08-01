package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String name;
    @Column
    private String last_name;
    @Column
    private int age;
    @Column(unique = true)
    private String email;

}
