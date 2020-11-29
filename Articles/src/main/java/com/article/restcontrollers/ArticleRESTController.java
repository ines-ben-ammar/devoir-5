package com.article.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.article.entities.Article;
import com.article.service.ArticleService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ArticleRESTController {
	@Autowired
ArticleService articleService;
	@RequestMapping(method=RequestMethod.GET)
	public List<Article> getAllArticles(){
		return articleService.getAllArticles();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Article getArticleById(@PathVariable("id") Long id) {
	return articleService.getArticle(id);
	 }
	@RequestMapping(method = RequestMethod.POST)
	public Article createArticle(@RequestBody Article article) {
	return articleService.saveArticle(article);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Article updateArticle(@RequestBody Article article) {
	return articleService.updateArticle(article);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteArticle(@PathVariable("id") Long id)
	{
	articleService.deleteArticleById(id);
	}
	@RequestMapping(value="/articleclt/{idClient}",method = RequestMethod.GET)
	public List<Article> getArticlesByClientId(@PathVariable("idClient") Long id) {
	return articleService.findByClientIdClient(id);
	}
	
}
