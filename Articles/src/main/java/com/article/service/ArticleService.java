package com.article.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.article.entities.Article;
import com.article.entities.Client;

public interface ArticleService {
	Article saveArticle(Article article);
	Article updateArticle(Article a);
	void deleteArticle(Article a);
	 void deleteArticleById(Long id);
	 Article getArticle(Long id);
	List<Article> getAllArticles();
	Page<Article> getAllArticlesParPage(int page, int size);
	List<Article> findByLibelle(String libelle);
	List<Article> findByLibelleContains(String libelle);
	List<Article> findByLibellePrix (String libelle, Double prix);
	List<Article> findByClient (Client client);
	List<Article> findByClientIdClient(Long id);
	List<Article> findByOrderByLibelleAsc();
	List<Article> trierLibellePrix();

}
