package com.example.sjh.dao;

import com.example.sjh.pojo.stugrade;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class gradedao {
    public static Map<Integer, stugrade>gra;
    static {
        gra=new HashMap<Integer,stugrade>();
        gra.put(1,new stugrade(1,"语文","老刘"));
        gra.put(2,new stugrade(2,"数学","老红"));
        gra.put(3,new stugrade(3,"英语","老暗"));
    }
    public Collection<stugrade>get(){
        return gra.values();
    }
    public void addone(stugrade stu){
        gra.put(stu.getCourceID(),stu);
    }
}
