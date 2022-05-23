package com.example.sjh.controller;

import com.example.sjh.dao.studentdao;
import com.example.sjh.pojo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GaiController {
    @Autowired
    studentdao stu;

    @GetMapping("/delete/{ID}")
    public String delete(@PathVariable("ID")Integer id){
        stu.delete(id);
        return "redirect:/msg";
    }
    @GetMapping("/xiugai/{ID}")
    public String xiu(@PathVariable("ID")Integer id, Model model){
        student st=stu.getby(id);
        model.addAttribute("mss",st);
        return "edit";
    }
    @PostMapping("/update")
    public String update(@RequestParam("ID")Integer ID,@RequestParam("username")String stuname,@RequestParam("cID")Integer cID,@RequestParam("cource")String cource,@RequestParam("classname")String classname,@RequestParam("grade")Integer grade,@RequestParam("teacher")String teacher,Integer timer){
        stu.add(new student(ID,cID,stuname,cource,grade,teacher,classname,timer));
        return "redirect:/msg";
    }
}
