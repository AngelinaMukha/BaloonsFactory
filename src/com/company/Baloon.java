package com.company;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Baloon{
    Random random=new Random();
    int rgb=random.nextInt(16);
    Color color;
    int speed = random.nextInt(5)+6;
    ColorBaloon[] arr=ColorBaloon.values();
    int x1=random.nextInt(940);
    int y1=730;
    int x2=50;
    int y2=70;
    public Baloon(){
        Color color=new Color(arr[rgb].getR(),arr[rgb].getG(),arr[rgb].getB());
        this.color=color;
        Ellipse2D el = new Ellipse2D.Double(x1,y1,x2,y2);

    }
}
enum ColorBaloon{
    BLACK(0,0,0),
    RED(255,0,0),
    WHITE(255,255,255),
    BLUE(0,0,25),
    GREEN(0, 255, 0),
    GRAY(113,113,133),
    YELLOW(245,254,0),
    PINK(255,19,250),
    ORANGE(255,134,18),
    PURPLE(164,27,255),
    DARKRED(131,37,21),
    CYAN(47,242,255),
    SWAMP(23,138,90),
    BROWN(142,96,23),
    LIGHTBLUE(162,211,255),
    LIGHTGREEN(208,255,94);
    private int r;
    private int g;
    private int b;
    ColorBaloon(int r, int g, int b){
        this.r=r;
        this.g=g;
        this.b=b;
    }
    public int getR(){
        return r;
    }
    public int getG(){
        return g;
    }
    public int getB(){
        return b;
    }

}

