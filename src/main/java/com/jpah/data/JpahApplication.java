package com.jpah.data;

import com.jpah.data.model.Categories;
import com.jpah.data.repository.CategoryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpahApplication {

	public static void main(String[] args) {
		          ApplicationContext context=SpringApplication.run(JpahApplication.class, args);
                          CategoryRepository cr= context.getBean("categoryRepository",CategoryRepository.class);
                          Categories category=new Categories();
                          category.setCategory("Social");
                          cr.saveCategory(category);
	}
}
