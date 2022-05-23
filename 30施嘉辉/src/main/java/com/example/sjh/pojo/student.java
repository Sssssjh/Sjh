package com.example.sjh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class student {
    Integer ID;
    Integer courceID;
    String name;
    String cource;
    Integer grade;
    String teachername;
    String classname;
    Integer timer;
}
