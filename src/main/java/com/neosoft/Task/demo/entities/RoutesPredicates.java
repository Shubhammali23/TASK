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
public class RoutesPredicates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//pk
    @JoinColumn(name = "MstFilter")
    private String mstFiltersId;//fk
    @JoinColumn(name = "ApiRoutes")
    private String apiRouteId;//fk
    private String template;

}
