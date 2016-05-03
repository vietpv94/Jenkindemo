package com.example.vietpham.myapplication;

/**
 * Created by vietpham on 5/3/16.
 */
public class Jenkin {
    public String convert(int score) {
        if(score >= 80) {
            return "A";
        }
        if(score >= 70) {
            return "B";
        }
        if(score >= 60) {
            return "C";
        }
        if(score >= 50){
            return "D";
        }
        return "F";
        //TODO
        //FIXME
    }

}
