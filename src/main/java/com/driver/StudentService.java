package com.driver;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class StudentService {
StudentRepository obj = new StudentRepository();
public void addStudent(Student student){
    obj.addStudent(student);
}
public void  addTeacher(Teacher teacher){
    obj.addTeacher(teacher);
}
public void addStudentTeacher(String student,String teacher){
    obj.addStudentTeacher(student,teacher);
}
public Student getAstudent(String name){
    List<Student>list= obj.getallStudent();
    Student ans = null;
    for(Student student: list){
       if(student.getName()==name){
           ans=student;
       }
    }
    return ans;
}
public Teacher getaTeacher(String name){
    List<Teacher>list= obj.getallteacher();
    Teacher ans = null;
    for(Teacher teacher: list){
        if(teacher.getName()==name){
            ans=teacher;
        }
    }
    return ans;

}
public  List<String> studentTeacherList(String name){
    HashMap<String,String>hm = obj.Studentteacher();
    List<String>list= new ArrayList<>();
    for(String student: hm.keySet()){
        if(hm.get(student)==name){
            list.add(student);
        }
    }
    return list;
}

public List<String> getAllstudet(){
    List<Student>students=obj.getallStudent();
    List<String>ans=new ArrayList<>();
    for(Student studnet: students){
        ans.add(studnet.getName());
    }
    return ans;
}
public void deleteTeacher(String name){
    obj.deleteTeacher(name);
}
public void deleteAllteacher(){
    obj.deleteAllTeacher();
}

}
