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
public class LoadBalancedAPI {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//pk
    @Column(unique = true)
    private String instanceId;//uk
    private String port;
    private String host;
    private String metadata;
    private String url;
    private String secure;
}
