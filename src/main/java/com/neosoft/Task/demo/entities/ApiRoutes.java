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
public class ApiRoutes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//pk
    @Column(unique = true)
    private String name;//uk
    private String discription;
    private String uri;
    private String apikey;
    private String metadata;
    private String filters;
    private String predicates;

}
