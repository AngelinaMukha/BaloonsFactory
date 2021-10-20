package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Animation extends JComponent implements Runnable {
    Baloon b;
    public Animation(Baloon b){
        this.b=b;
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        g2.setColor(b.color);
        Ellipse2D el = new Ellipse2D.Double(b.x1, b.y1 , b.x2, b.y2);

        g2.fill(el);


        Color color=new Color(255,0,0);




            if((b.color.equals(color)) && (b.y1<400)){
                b.x2=0;
                b.y2=0;
                repaint();
            }

        }


    @Override
    public void run() {
        while (b.y1>200){

            b.y1-=b.speed;
            try {
                Thread.currentThread().sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();

        }
        b.x2+=10;
        b.y2+=10;
        try {
            Thread.currentThread().sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.x2=0;
        b.y2=0;
        repaint();
    }
}
