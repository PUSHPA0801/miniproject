package com.prince.prince.Service;

import com.prince.prince.Entity.Student;
import com.prince.prince.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student details(Student student){
            return studentRepo.save(student);
    }

    public Student updateDetails(Student student){
           Student updateStudent=studentRepo.findById(student.getId()).orElse(null);
           if(updateStudent!=null){
               updateStudent.setEmail(student.getEmail());
               updateStudent.setPassword(student.getPassword());
               studentRepo.save(updateStudent);
               return updateStudent;
           }
        return null;
    }

    public String deleteDetails(int id){
        studentRepo.deleteById(id);
        return "deleted";
    }

    public List<Student> getAllDetails(){
        return studentRepo.findAll();
    }

}
