package com.trybe.gestaotime.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Torcedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "torcedores")
    private List<Time> times = new ArrayList<>();

}
