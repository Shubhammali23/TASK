package com.neosoft.Task.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//pk
    @Column(unique = true)
    private String name;//uk
    private String discription;
    private String uri;
    private String spType;//(AISP / PISP / BOTH)
    private String document;

}
