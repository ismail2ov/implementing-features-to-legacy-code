package com.github.ismail2ov.sproutmethod;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TransactionGate {
    private final TransactionBundle transactionBundle;

    public void postEntries(List<Article> articles) {
        for (Article article : articles) {
            article.postDate();
        }
        transactionBundle.getArticlesManager().addAll(articles);
    }
}