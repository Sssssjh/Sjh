package com.example.sjh.controller;

import com.example.sjh.dao.gradedao;
import com.example.sjh.dao.studentdao;
import com.example.sjh.pojo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {
    @Autowired
    studentdao st;
    @Autowired
    gradedao gd;
    @PostMapping("/add")
    public String add(@RequestParam("ID")Integer ID,@RequestParam("username")String stuname,@RequestParam("cID")Integer cID,@RequestParam("cource")String cource,@RequestParam("classname")String classname,@RequestParam("grade")Integer grade,@RequestParam("teacher")String teacher){
        st.add(new student(ID,cID,stuname,cource,grade,teacher,classname,null));
        return "redirect:/msg";
    }
    @PostMapping("/add2")
    public String add2(@RequestParam("stuname")String stuname,@RequestParam("cource")String cource,@RequestParam("grade")Integer grade){
        st.add(new student(null,null,stuname,cource,grade,null,null,null));
        return "redirect:/msg";
    }
}
