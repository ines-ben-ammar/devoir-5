package com.article.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.article.entities.Article;
import com.article.entities.Client;
import com.article.repos.ArticleRepository;
@Service
public class ArticleServiceImpl implements ArticleService{
@Autowired
	ArticleRepository articleRepository;
	@Override
	public Article saveArticle(Article article) {
		
		return articleRepository.save(article);
	}

	@Override
	public Article updateArticle(Article a) {
		return articleRepository.save(a);
	}

	@Override
	public void deleteArticle(Article a) {
		articleRepository.delete(a);
		
	}

	@Override
	public void deleteArticleById(Long id) {
		articleRepository.deleteById(id);
		
	}

	@Override
	public Article getArticle(Long id) {
		
		return articleRepository.findById(id).get();
		
	}

	@Override
	public List<Article> getAllArticles() {
		
		return articleRepository.findAll();
	}

	@Override
	public Page<Article> getAllArticlesParPage(int page, int size) {
		return articleRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Article> findByLibelle(String libelle) {
		
		return articleRepository.findByLibelle(libelle);
	}

	@Override
	public List<Article> findByLibelleContains(String libelle) {
		
		return articleRepository.findByLibelleContains(libelle);
	}

	@Override
	public List<Article> findByLibellePrix(String libelle, Double prix) {
		
		return null ;
	}

	@Override
	public List<Article> findByClient(Client client) {
		
		return articleRepository.findByClient(client);
	}

	@Override
	public List<Article> findByClientIdClient(Long id) {
		
		return articleRepository.findByClientIdClient(id);
	}

	@Override
	public List<Article> findByOrderByLibelleAsc() {
	
		return articleRepository.findByOrderByLibelleAsc();
	}

	@Override
	public List<Article> trierLibellePrix() {
		return articleRepository.trierArticlesLibellesPrix();
	}
	
	

}
