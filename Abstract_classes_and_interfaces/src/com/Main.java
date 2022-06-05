package com;

public class Main {
    public static void main(String[] args) {
         //abstract class
        {
            //Journal magazine = new Journal(); not abstract class
            Journal magazineFir;

            // abstract class processing options
            Journal magazine = new FarmJurnal();
            System.out.println("Abstract journal take parameters from child class: " + magazine.news +
                    ", " + magazine.fashion + ", " + magazine.pages);
            magazine.journalInfo();

            magazineFir = magazine;
            System.out.println("Abstract journal adduction parameters from child class: " + magazineFir.news +
                    ", " + magazineFir.fashion + ", " + magazineFir.pages);
            magazine.journalInfo();

            FarmJurnal farm_life = new FarmJurnal();
            magazineFir = (Journal) farm_life;
            System.out.println("Abstract journal convert parameters from child class: " + magazineFir.news +
                    ", " + magazineFir.fashion + ", " + magazineFir.pages);
            magazine.journalInfo();
        }

        //abstract interface
        {
            System.out.println("\nInterface in practice:\n");
            Third unity = new Third();
            System.out.println("first class elements:" + unity.first.getFirstEl() + "\nsecond class elements:" +
                    unity.second.getSecondEl() +
                    "\nunity elements:" + unity.unity + "\nthird class element:" + unity.getThirdEl());

            System.out.println("Interface output return parameters:\n");
            System.out.println(unity.first.outputFirstEL());
            System.out.println(unity.second.outputSecondEL());
            System.out.println("unity:" + unity.getUnity());
            System.out.println(unity.outputThirdEl());

            First first = new First();
            Second second = new Second();
            System.out.println("some variant interface output return parameters:\n");
            System.out.println("first class elements:" + first.getFirstEl() +
                    "\nsecond class elements:" + second.getSecondEl() +
                    "\nunity elements:" + unity.unity + "\nthird class element:" + unity.getThirdEl());

            First_SecondInterImpl AB = new First_SecondInterImpl();
            System.out.println(AB.firstInter + " " + AB.secondInter);
            System.out.println(AB.getFirstInter() + " " + AB.getSecondInter());
        }
    }

    public int getUnity() {
        return 0;
    }
}

class First {
    int firstEl = 10;
    int getFirstEl() {
        return firstEl;
    }
    int outputFirstEL() {
        System.out.println("First element:");
        return 1010;
    }
}

class Second {
    int secondEl = 20;
    int getSecondEl() {
        return secondEl;
    }
    int outputSecondEL() {
        System.out.println("Second element");
        return 2020;
    }
}

class Third implements Unity {
    int thirdEl = 30;
    int outputThirdEl() {
        System.out.println("Third element:");
        return 3030;
    }
    int getThirdEl() {
        return thirdEl;
    }
    @Override
    public int getUnity() {
        return 909090;
    }
}

class First_SecondInterImpl implements FirstInter, SecondInter {
    public int first() {
        return 1;
    }
    public int second() {
        return 2;
    }
    public int getFirstInter() {
        return 1;
    }
    @Override
    public int getSecondInter() {
        return 2;
    }
}

interface FirstInter {
    int firstInter = 11;
    int getFirstInter();
}

interface SecondInter {
    int secondInter = 22;
    int getSecondInter();
}

interface Unity {
    int unity = 999;
    First first = new First();
    Second second = new Second();
    int getUnity();
}
