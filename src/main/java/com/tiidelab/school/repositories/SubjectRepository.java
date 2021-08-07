package com.tiidelab.school.repositories;

import com.tiidelab.school.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
