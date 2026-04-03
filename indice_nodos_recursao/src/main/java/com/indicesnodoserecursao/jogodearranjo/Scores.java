package com.indicesnodoserecursao.jogodearranjo;

public class Scores {
    private static final int MAX_STORE = 10;
    private GameEntry[] entries;
    private int numEntries;

    public Scores() {
        entries = new GameEntry[MAX_STORE];
        numEntries = 0;
    }

    public void add(GameEntry entry) {
        int newScore = entry.getScore();

        if(numEntries == MAX_STORE) {
            if (newScore <= entries[numEntries-1].getScore()) {
                return;
            }
        } else {
            numEntries++;
        }

        int i = numEntries - 1;

        for(; (i >= 1) && (newScore > entries[i-1].getScore()); i--) {
            entries[i] = entries[i-1];
        }
        entries[i] = entry;
    }

    public GameEntry remove(int i) {
        if(i < 0 || i >= numEntries) {
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        }

        GameEntry temp = entries[i];

        for(int j = i; j < numEntries - 1; j++) {
            entries[j] = entries[j+1];
        }
        entries[numEntries - 1] = null;
        numEntries--;

        return temp;
    }

    @Override
    public String toString() {
        String s = "[";

        for(int i = 0; i < numEntries; i++) {
            if (i >  0) {
                s += ", ";
            }

            s += entries[i];
        }
        s += "]";
        return s;
    }
}