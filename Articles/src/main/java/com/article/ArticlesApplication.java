package com.article;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.article.entities.Article;
import com.article.restcontrollers.ArticleRESTController;
import com.article.service.ArticleService;

@SpringBootApplication
public class ArticlesApplication implements CommandLineRunner {
	@Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(ArticlesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Article.class);
		
	}

}
