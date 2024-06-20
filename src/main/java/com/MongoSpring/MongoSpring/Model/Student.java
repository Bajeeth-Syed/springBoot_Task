package com.MongoSpring.MongoSpring.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="AllStudent")
//this is for no need of coding for getter and setter and constructor
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student   {
    @Id
    private int rno;

    private String name;

    private String address;
}
