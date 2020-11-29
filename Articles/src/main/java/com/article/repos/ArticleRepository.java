package com.article.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.article.entities.Article;
import com.article.entities.Client;

@RepositoryRestResource(path = "rest")
public interface ArticleRepository extends JpaRepository<Article, Long> {
List<Article> findByLibelle(String libelle );
List<Article> findByLibelleContains(String libelle);
/*@Query("select a from Article a where a.libelle like %?1 and a.prixUnitaire > ?2")
List<Article> findByLibellePrix (String libelle, Double prix);*/
@Query("select a from Article a where a.libelle like %:libelle and a.prixUnitaire > :prixUnitaire")
List<Article> findByLibellePrix (@Param("libelle") String libelle,@Param("prixUnitaire") Double prix);
@Query("select a from Article a where a.client = ?1")
List<Article> findByClient (Client client);
List<Article> findByClientIdClient(Long id);
List<Article> findByOrderByLibelleAsc();
@Query("select a from Article a order by a.libelle ASC, a.prixUnitaire DESC")
List<Article> trierArticlesLibellesPrix ();

}
