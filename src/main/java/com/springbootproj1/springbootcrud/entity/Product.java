package com.springbootproj1.springbootcrud.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Product {


    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;

    //added lambok so dont need getter and setter
}
