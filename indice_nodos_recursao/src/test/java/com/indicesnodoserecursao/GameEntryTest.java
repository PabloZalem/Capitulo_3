package com.indicesnodoserecursao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.indicesnodoserecursao.jogodearranjo.GameEntry;

public class GameEntryTest {
    GameEntry entry;

    @Test
    public void testGameEntry() {
        entry = new GameEntry("Pablo", 100);
    }

    @Test
    public void getNamePlayer() throws Exception {
        entry = new GameEntry("Pablo", 100);
        assertEquals("Pablo", entry.getName());
    }

    @Test
    public void getScorePlayer() throws Exception {
        entry = new GameEntry("Pablo", 100);
        assertEquals(100, entry.getScore());
    }

    @Test
    public void getCreateToString() throws Exception {
        entry = new GameEntry("Pablo", 100);
        assertEquals("Nome: Pablo, Score: 100", entry.toString());
    }

    @Test
    public void getCreateToStringWithAnotherPlayer() throws Exception {
        entry = new GameEntry("Maria", 200);
        assertEquals("Nome: Maria, Score: 200", entry.toString());
    }
}
