package com.example.sjh.dao;

import com.example.sjh.pojo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class studentdao {
    public static Map<Integer, student>stu;
    @Autowired
    gradedao gra;
    static {
        stu=new HashMap<Integer,student>();
        stu.put(1,new student(210216101,001,"施嘉辉","语文",100,"刘老师","物联2161",1));
        stu.put(2,new student(210216102,002,"刘德华","数学",50,"陈老师","物联2161",2));
        stu.put(3,new student(210216103,003,"阿华","英语",60,"梅老师","物联2161",3));
    }
    //查询
    public Collection<student>getall(){
        return stu.values();
    }
    //增加
    private static Integer ID=4;
    public void add(student st){
        if (st.getTimer()==null){
            st.setTimer(ID++);
        }
//        if (st.getGrade()==null){
//            st.setGrade(gra.getgrade(st.getName()));
//        }
        stu.put(st.getTimer(),st);
    }
    public Integer getID(String name){
        Integer a=stu.get(name).getID();
        return a;
    }
    //删除
    public void delete(Integer ID){
        stu.remove(ID);
    }
    public student getby(Integer ID){
        return stu.get(ID);
    }
}
