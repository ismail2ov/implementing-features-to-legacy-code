package com.github.ismail2ov.sproutmethod;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RequiredArgsConstructor
public class TransactionGate {
    private final TransactionBundle transactionBundle;

    public void postEntries(List<Article> articles) {
        List<Article> articlesToAdd = new ArrayList<>();
        for (Article article : articles) {
            if (!transactionBundle.getArticlesManager().contains(article)) {
                article.postDate();
                articlesToAdd.add(article);
            }
            article.postDate();
        }
        transactionBundle.getArticlesManager().addAll(articlesToAdd);
    }
}