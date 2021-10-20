package com.company;
import javax.swing.*;
import java.awt.*;
public class Main extends JFrame{
    public static void main(String args[]) throws InterruptedException {
        Factory f1=new Factory();
        Factory f2=new Factory();
        Factory f3=new Factory();
        f1.start();
        f2.start();
        f3.start();
        f1.join();
        f2.join();
        f3.join();

        JFrame w= new JFrame("Baloons Factory");
        w.setVisible(true);
        w.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit= Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();
        w.setBounds(screen.width/2-450, screen.height/2-300, 900,600);
        for(int i=Storage.arr.size()-1;i>=0;i--) {
            Animation a = new Animation(Storage.arr.get(i));
            Thread a1 = new Thread(a);
            w.add(a);
            a1.start();
            a1.join();
            System.out.println("Baloon - blow up");
        }
    }
}