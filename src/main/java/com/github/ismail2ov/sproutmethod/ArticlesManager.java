package com.github.ismail2ov.sproutmethod;

import java.util.List;

public interface ArticlesManager {
    void addAll(List<Article> articles);

    void add(Article article);

    boolean contains(Article article);
}
