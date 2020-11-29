package com.article.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "libelle", types = { Article.class })
public interface ArticleProjection {
	public String getLibelle();

}
