package com.course.angularandjava;

import com.course.angularandjava.model.Todo;
import com.course.angularandjava.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class AngularandjavaApplication {
	@Autowired
	private TodoRepository todoRepository;
	@Bean
	public CommandLineRunner init() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Todo todo = new Todo();
				todo.setDescription("Spring study");
				todo.setCreatedDate(LocalDateTime.now());
				todoRepository.save(todo);
			}
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(AngularandjavaApplication.class, args);
		Todo todo = new Todo();

	}

}
