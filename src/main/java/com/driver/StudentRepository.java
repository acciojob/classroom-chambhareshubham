package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {
    HashMap<String,Student>Studentdb = new HashMap<>();
    HashMap<String,Teacher> Teacherdb= new HashMap<>();
    HashMap<String,String> teacherStudentHashMap= new HashMap<>();
    public void addStudent(Student student){
        Studentdb.put(student.getName(),student);
    }
    public void addTeacher(Teacher teacher){
        Teacherdb.put(teacher.getName(),teacher);
    }
    public void addStudentTeacher(String student,String teacher){
        teacherStudentHashMap.put(student,teacher);
    }
    public List<Student> getallStudent(){
        List<Student>list= new ArrayList<>();
        for(Student student: Studentdb.values()){
            list.add(student);
        }
        return list;
    }
    public List<Teacher> getallteacher (){
        List<Teacher>list= new ArrayList<>();
        for(Teacher teacher: Teacherdb.values()){
            list.add(teacher);
        }
        return list;
    }
    public HashMap<String,String> Studentteacher(){
        return this.teacherStudentHashMap;
    }
public void deleteTeacher(String name){
      Teacherdb.remove(name);
}
public void deleteAllTeacher(){
        Teacherdb.clear();
}
}
