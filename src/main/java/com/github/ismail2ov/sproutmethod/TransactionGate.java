package com.github.ismail2ov.sproutmethod;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class TransactionGate {
    private final TransactionBundle transactionBundle;

    public void postEntries(List<Article> articles) {
        List<Article> articlesToAdd = uniqueArticles(articles);
        for (Article article : articles) {
            article.postDate();
        }
        transactionBundle.getArticlesManager().addAll(articlesToAdd);
    }

    public List<Article> uniqueArticles(List<Article> articles) {
        List<Article> result = new ArrayList<>();
        for (Article article : articles) {
            if (!transactionBundle.getArticlesManager().contains(article)) {
                result.add(article);
            }
        }

        return result;
    }
}