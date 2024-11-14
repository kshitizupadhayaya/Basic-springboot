package com.jpa.test.dbcucandsc.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDAO dao;

    public StudentService(StudentDAO dao) {
        this.dao = dao;
    }

    public String  addStudent(Student student)
    {
               dao.save(student);
        return  "new student has been added in your  database,roolnum="+student.getId();
    }

    public String  addStudents(List<Student> student)
    {
        dao.saveAll(student);
        return  " All new student has been added in your  database,";
    }
    public String deleteStudent(int id)
    {
        Student student=dao.getById(id);
        dao.delete(student);
        return "Id number is deleted :"+id;
    }

    public String  updateStudent(Student student)
    {
        dao.save(student);
        return  " Id number is updated :,"+student.getId();
    }
public Student  getStudent(int id)
{
    return dao.findById(id).get();
}



}
