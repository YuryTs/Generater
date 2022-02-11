package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] worldListOne = {"круглосуточный", "трех-званный", "300000-футовый"};
        String[] worldListTwo = {"чистый продукт", "использованный с выгодой", "по требованию"};
        String[] worldListThree = {"процесс", "талант","уровень завоеванного внимания","зебра"};

        int oneLenght = worldListOne.length;
        int twoLenght = worldListTwo.length;
        int threeLenght = worldListThree.length;

        int rand1 = (int)(Math.random()*oneLenght);
        int rand2 = (int)(Math.random()*twoLenght);
        int rand3 = (int)(Math.random()*threeLenght);

        String phrase = worldListOne[rand1]+" "+worldListTwo[rand2]+" "+worldListThree[rand3];

        System.out.println("Все что нам нужно так это: "+phrase);
    }
}
