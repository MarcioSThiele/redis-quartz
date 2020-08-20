package com.redis.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@RedisHash("Student")
public class Student implements Serializable {
    private String id;
    private String name;
    private String gender;
    private String grade;
}
