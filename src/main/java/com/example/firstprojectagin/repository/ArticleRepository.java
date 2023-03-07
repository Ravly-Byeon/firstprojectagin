package com.example.firstprojectagin.repository;

import com.example.firstprojectagin.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
