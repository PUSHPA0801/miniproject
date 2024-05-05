package com.prince.prince.Controller;

import com.prince.prince.Entity.Student;
import com.prince.prince.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("addstudent")
    public Student postDetails(@RequestBody Student student){

        return studentService.details(student);
    }
    @PutMapping("updateStudent")
    public Student updateStudentDetails(@RequestBody Student student){

        return studentService.updateDetails(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudentDetails(@PathVariable int id){

        return studentService.deleteDetails(id);
    }

    @GetMapping("/getStudent")
    public List<Student> getDetails(){

        return studentService.getAllDetails();
    }

}
