package com.company;

public class Main {

    public static void main(String[] args) {
        int mk1 = 100;
        int mk2 = 88;
        int mk3 = 99;
        int total = mk1 + mk2 + mk3;
        int avg = total / 3;
        String grd;

        if(avg >= 50){
            grd = "Pass";
        }else {
            grd = "Fail";
        }

        System.out.println("Total : "+total);
        System.out.println("Average : "+avg);
        System.out.println("Grade : "+grd);
    }
}
