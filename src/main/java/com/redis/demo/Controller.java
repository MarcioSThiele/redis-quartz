package com.redis.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/all")
    public String all(){
        Iterable<Student> list = studentRepository.findAll();
        System.out.println(list.toString());

        return list.toString();
    }

    @PostMapping("/add")
    public HttpStatus add(@RequestBody Student student){
        if (studentRepository.save(student) == null){
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }
}
