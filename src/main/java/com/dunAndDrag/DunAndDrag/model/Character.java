package com.dunAndDrag.DunAndDrag.model;

import javax.persistence.*;

@Entity
@Table
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
}
