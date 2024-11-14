package com.jpa.test.dbcucandsc.entities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController
{
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/add")
    public String  addStudent( @RequestBody Student student)
    {
 return      studentService.addStudent(student);
    }
    @PostMapping("/bulkaddd")
    public String  addStudents(@RequestBody List<Student> students)
    {
        return      studentService.addStudents(students);
    }
    @DeleteMapping("/all/{id}")
    public String  deleteStudent(@PathVariable int id)
    {
        return studentService.deleteStudent(id);
    }
    @PutMapping("/add")

    public String UpdateStudent( @RequestBody Student student)
    {
        return studentService.updateStudent(student);
    }
    @RequestMapping("/all/{id}")
    public Student getStudent(@PathVariable int id)
    {
        return studentService.getStudent(id);
    }

}
