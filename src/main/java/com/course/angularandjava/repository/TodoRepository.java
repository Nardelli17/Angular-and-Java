package com.course.angularandjava.repository;

import com.course.angularandjava.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
