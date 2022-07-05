package com.progile.mongo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String line1;
    private String line2;
    private String city;
    private String state;
    private int zipCode;

}
