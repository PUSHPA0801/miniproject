package com.prince.prince.Repository;

import com.prince.prince.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository <Student,Integer> {
}
