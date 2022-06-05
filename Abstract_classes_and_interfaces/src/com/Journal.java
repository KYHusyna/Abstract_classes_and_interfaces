package com;

abstract class Journal {
    public String news = "News";
    public String fashion = "Clothes";
    public int pages = 32;

    int pagesCount() {
        return pages;
    }

    int pagesCount(int pages) {
        return pages;
    }

    abstract void journalInfo();
}

