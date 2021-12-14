package com.github.ismail2ov.sproutmethod;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TransactionBundle {
    private final ArticlesManager articlesManager;

    public ArticlesManager getArticlesManager() {
        return articlesManager;
    }
}
