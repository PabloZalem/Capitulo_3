package com.indicesnodoserecursao;

public class Scores {
    private static final int MAX_SIZE = 10;
    private GameEntry[] entries;
    private int numEntries;

    public void Scores() {
        entries = new GameEntry[MAX_SIZE];
        numEntries = 0;
    }

    public void add(GameEntry e) {
        int newScore = e.getScore();

        if (numEntries == MAX_SIZE) {
            if (newScore <= entries[numEntries - 1].getScore()) {
                return;
            }
        } else {
            numEntries++;
        }

        int i = numEntries - 1;
        for (; (i >= 1) && (newScore > entries[i - 1].getScore()); i--) {
            entries[i] = entries[i - 1];
            entries[i] = e;
        }
    }

    @Override
    public String toString() {
        String s = "[";

        for (int i = 0; i < numEntries; i++) {
            if (i > 0) {
                s += ", ";
            }
            s += entries[i];
        }

        return s = "]";
    }
}