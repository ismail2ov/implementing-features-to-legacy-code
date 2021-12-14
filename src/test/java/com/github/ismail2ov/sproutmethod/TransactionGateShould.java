package com.github.ismail2ov.sproutmethod;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TransactionGateShould {

    @Mock
    TransactionBundle transactionBundle;

    @Mock
    ArticlesManager articlesManager;

    @InjectMocks
    TransactionGate transactionGate;

    @Test
    void return_empty_list_when_input_is_empty() {
        List<Article> articles = Collections.emptyList();

        List<Article> actual = transactionGate.uniqueArticles(articles);

        assertThat(actual).isEmpty();
    }

    @Test
    void returns_the_same_list_when_articles_are_not_duplicates() {
        Article article1 = new Article();
        Article article2 = new Article();
        List<Article> articles = Arrays.asList(article1, article2);
        when(transactionBundle.getArticlesManager()).thenReturn(articlesManager);
        when(articlesManager.contains(article1)).thenReturn(false);
        when(articlesManager.contains(article2)).thenReturn(false);

        List<Article> actual = transactionGate.uniqueArticles(articles);

        assertThat(actual).containsExactly(article1, article2);
    }

    @Test
    void return_list_without_duplicated_articles() {
        Article article1 = buildArticle();
        Article article2 = buildArticle();
        List<Article> articles = Arrays.asList(article1, article2, article1);
        when(transactionBundle.getArticlesManager()).thenReturn(articlesManager);
        when(articlesManager.contains(article1)).thenReturn(false, true);
        when(articlesManager.contains(article2)).thenReturn(false);

        List<Article> actual = transactionGate.uniqueArticles(articles);

        assertThat(actual).containsExactly(article1, article2);
    }

    private Article buildArticle() {
        Article result = new Article();
        result.setId(UUID.randomUUID());

        return result;
    }
}