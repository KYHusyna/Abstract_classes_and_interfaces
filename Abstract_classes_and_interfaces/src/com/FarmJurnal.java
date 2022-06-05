package com;

public class FarmJurnal extends Journal {
    public String caring_flowers = "How to care flower";
    public String animal = "Animal name";
    public String Care_animal="How to care animal";
    public byte pages = 21;

    int pagesCount(){
        return pages;
    }
    int pagesCount(byte pages){
        return this.pages;
    }

    void journalInfo(){System.out.println("Farm journal info");};
}
