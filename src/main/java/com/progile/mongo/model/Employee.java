package com.progile.mongo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.fasterxml.jackson.annotation.JsonInclude.*;

@Getter
@Setter
@NoArgsConstructor
@Document
@ToString
public class Employee {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
//    @JsonIgnore
    private String id;
    private String firstName;
    private String lastName;
    @JsonInclude(Include.NON_NULL)
    private Address address;
    private int salary;

    public Employee(String firstName, String lastName, Address address, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
    }
}
