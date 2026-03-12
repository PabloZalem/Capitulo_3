package com.indicesnodoserecursao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ScoresTest {
    private Scores scores;

    @BeforeEach
    void setUp() {
        scores = new Scores();
    }

    @Test
    void testAddToEmptyList() {
        GameEntry entry = new GameEntry("Player1", 100);
        scores.add(entry);
        assertTrue(scores.toString().contains("Player1"));
    }

    @Test
    void testAddMultipleEntriesInOrder() {
        scores.add(new GameEntry("Player1", 100));
        scores.add(new GameEntry("Player2", 90));
        scores.add(new GameEntry("Player3", 80));
        
        String result = scores.toString();
        assertTrue(result.contains("Player1"));
        assertTrue(result.contains("Player2"));
        assertTrue(result.contains("Player3"));
    }

    @Test
    void testAddWhenCapacityFull() {
        for (int i = 0; i < 10; i++) {
            scores.add(new GameEntry("Player" + i, 100 - i));
        }
        
        scores.add(new GameEntry("NewPlayer", 95));
        assertTrue(scores.toString().contains("NewPlayer"));
    }

    @Test
    void testAddLowScoreWhenCapacityFull() {
        for (int i = 0; i < 10; i++) {
            scores.add(new GameEntry("Player" + i, 100 - i));
        }
        
        scores.add(new GameEntry("LowScore", 50));
        assertFalse(scores.toString().contains("LowScore"));
    }

    @Test
    void testAddHighScoreWhenCapacityFull() {
        for (int i = 0; i < 10; i++) {
            scores.add(new GameEntry("Player" + i, 100 - i));
        }
        
        scores.add(new GameEntry("HighScore", 150));
        assertTrue(scores.toString().contains("HighScore"));
    }
}
