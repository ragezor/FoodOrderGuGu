package com.neu.foodorder.entity;

public class Word {

    private  int wordid;
    private  String word;

    public Word(int wordid, String word) {
        this.wordid = wordid;
        this.word = word;
    }

    public int getWordid() {
        return wordid;
    }

    public void setWordid(int wordid) {
        this.wordid = wordid;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Word{" +
                "wordid=" + wordid +
                ", word='" + word + '\'' +
                '}';
    }

    public Word() {super();

    }
}
