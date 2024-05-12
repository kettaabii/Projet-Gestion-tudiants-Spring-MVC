package com.repository;
import com.modals.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("StudentRepository")
public interface StudentRepository extends JpaRepository<Students, String> {


}

