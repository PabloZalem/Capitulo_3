package com.indicesnodoserecursao.jogodearranjo;

public class Scores {
    private static final int MAX_SCORES = 10;
    private GameEntry[] entries;
    private int numEntries;

    public Scores() {
        entries = new GameEntry[MAX_SCORES];
        numEntries = 0;
    }

    public void add(GameEntry e) {
        int newScore = e.getScore();

        if (numEntries == MAX_SCORES) {
            if (newScore < entries[MAX_SCORES - 1].getScore()) {
                return;
            }
        } else {
            numEntries++;
        }

        int j = numEntries - 1;

        for (; (j >= 1) && (newScore > entries[j - 1].getScore()); j--) {
            entries[j] = entries[j - 1];
        }
        entries[j] = e;
    }

    public GameEntry remove(int i) {
        if ((i < 0) || (i >= numEntries)) {
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        }

        GameEntry temp = entries[i];

        for (int j = i; j < numEntries - 1; j++) {
            entries[j] = entries[j + 1];
        }

        entries[numEntries - 1] = null;
        numEntries--;

        return temp;
    }

    @Override
    public String toString() {
        String s = "[";

        for (int i = 0; i < numEntries - 1; i++) {
            if (i > 0) {
                s += ", ";
            }

            s += entries[i];
        }

        return s + "]";
    }

}