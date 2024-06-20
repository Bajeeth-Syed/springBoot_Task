package com.MongoSpring.MongoSpring.Controller;

import com.MongoSpring.MongoSpring.Model.Student;
import com.MongoSpring.MongoSpring.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    // i am using StudentRepo class and store the values in studentRepo variable
    StudentRepo studentRepo;

    @PostMapping("/addStudent")
    // any function(@RequestBody Model-class anyname)
    public void addStudent(@RequestBody Student student){
        studentRepo.save(student);
    }

    @GetMapping("/allStudent")
    // return type should be list because sending all the data
    public List<Student> allStudent(){
        // @Autowired variable
        return studentRepo.findAll();
    }

    //get by id
    @GetMapping("/getStudent/{id}")
    // return type Model class because we have send one document
    public Student getStudent(@PathVariable int id){
        // @Autowired variable
        return studentRepo.findById(id).orElse(null);
    }

    //updating the data
    @PutMapping("/updateStudent")
    public void updateStudent(@RequestBody Student student){
        // fetch the object by id
        Student data = studentRepo.findById(student.getRno()).orElse(null);
        System.out.println(data);

        //do the operation
        if(data!=null){
            data.setName(student.getName());
            data.setAddress(student.getAddress());
            studentRepo.save(data);
        }
    }

    //delete the data
    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable int id){
        studentRepo.deleteById(id);
    }
}
