package com.MongoSpring.MongoSpring.Repository;

import com.MongoSpring.MongoSpring.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;


//here we are connecting with document and Mongodb
//<Model class, Rapper class (dont use primitive datatype)>
public interface StudentRepo extends MongoRepository<Student, Integer > {
}
