package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class StatisticsTestForumSuite {
    private Statistics statistics;
    private StatisticsCalculator calculator;

    @BeforeEach
    void setUp() {
        statistics = Mockito.mock(Statistics.class);
        calculator = new StatisticsCalculator();
    }

    @Test
    void testCalculateAdvStatisticsZeroPosts() {
        // Given
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(10);
        List<String> users = new ArrayList<>();
        users.add("Jacob");
        when(statistics.usersNames()).thenReturn(users);
        // When
        calculator.calculateAdvStatistics(statistics);
        // Then
        assertEquals(0, calculator.getAverageNumberOfPostsPerUser());
        assertEquals(10, calculator.getAverageNumberOfCommentsPerUser());
        assertEquals(0, calculator.getAverageNumberOfCommentsPerPost());
    }
    @Test
    void testCalculateAdvStatistics1000Posts() {
        // Given
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(500);
        List<String> users = new ArrayList<>();
        users.add("Jacob");
        when(statistics.usersNames()).thenReturn(users);
        // When
        calculator.calculateAdvStatistics(statistics);
        // Then
        assertEquals(1000, calculator.getAverageNumberOfPostsPerUser());
        assertEquals(500, calculator.getAverageNumberOfCommentsPerUser());
        assertEquals(0.5, calculator.getAverageNumberOfCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsNoComments() {
        // Given
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(0);
        List<String> users = new ArrayList<>();
        users.add("Jacob");
        when(statistics.usersNames()).thenReturn(users);
        // When
        calculator.calculateAdvStatistics(statistics);
        // Then
        assertEquals(0, calculator.getAverageNumberOfCommentsPerPost());
        assertEquals(0, calculator.getAverageNumberOfCommentsPerUser());
        assertEquals(100, calculator.getAverageNumberOfPostsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsCommentsLessThanPosts() {
        // Given
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(50);
        List<String> users = new ArrayList<>();
        users.add("Jacob");
        when(statistics.usersNames()).thenReturn(users);
        // When
        calculator.calculateAdvStatistics(statistics);
        // Then
        assertEquals(0.5, calculator.getAverageNumberOfCommentsPerPost());
        assertEquals(50, calculator.getAverageNumberOfCommentsPerUser());
        assertEquals(100, calculator.getAverageNumberOfPostsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsCommentsMoreThanPosts() {
        // Given
        when(statistics.postsCount()).thenReturn(50);
        when(statistics.commentsCount()).thenReturn(100);
        List<String> users = new ArrayList<>();
        users.add("Jacob");
        when(statistics.usersNames()).thenReturn(users);
        // When
        calculator.calculateAdvStatistics(statistics);
        // Then
        assertEquals(2, calculator.getAverageNumberOfCommentsPerPost());
        assertEquals(100, calculator.getAverageNumberOfCommentsPerUser());
        assertEquals(50, calculator.getAverageNumberOfPostsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsNoUsers() {
        // Given
        when(statistics.postsCount()).thenReturn(50);
        when(statistics.commentsCount()).thenReturn(100);
        List<String> users = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(users);
        // When
        calculator.calculateAdvStatistics(statistics);
        // Then
        assertEquals(0, calculator.getAverageNumberOfPostsPerUser());
        assertEquals(0, calculator.getAverageNumberOfCommentsPerUser());
        assertEquals(2, calculator.getAverageNumberOfCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatistics100Users() {
        // Given
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(100);
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("User" + i);
        }
        when(statistics.usersNames()).thenReturn(users);
        // When
        calculator.calculateAdvStatistics(statistics);
        // Then
        assertEquals(1, calculator.getAverageNumberOfPostsPerUser());
        assertEquals(1, calculator.getAverageNumberOfCommentsPerUser());
        assertEquals(1, calculator.getAverageNumberOfCommentsPerPost());
    }
}
