package javaapplication;

import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.geom.Rectangle2D;

public class Animation extends Applet implements Runnable {

Shape rec;
Image h1,img,bg1,bg2,bg3,bg4,bg5;
Font f1,f2,f3,f4;
Color red,blue,green,brown,white,black,yellow,g1,c;

public void init() {
    rec = new Rectangle2D.Float(30,30,1180,550);
    repaint();
    Thread th = new Thread(this);
    th.start();

    red = Color.red;
    yellow = Color.yellow;
    blue = new Color(135,206,250);
    g1 = new Color(164,191,114);
    green = Color.green;
    white = Color.white;
    black = Color.black;
    brown = new Color(139,69,19);

h1 = getImage(getCodeBase(),"h1.png");
img = getImage(getCodeBase(),"sun.png");
bg1 = getImage(getCodeBase(),"c1.png");
}
public void run() 
{
    try {
        while(true) 
        {

            System.out.println(10);
            c = new Color(204,204,255);
            repaint();
            Thread.sleep(10000);
            System.out.println(2);
            c = new Color(153,153,255);
            repaint();
            Thread.sleep(1000);
            System.out.println(2);
            c = new Color(102,102,255);
            repaint();
            Thread.sleep(1000); 
            System.out.println(2);
            c = new Color(51,51,255);
            repaint();
            Thread.sleep(1000); 
            System.out.println(2);
            c = new Color(0,0,255);
            repaint();
            Thread.sleep(1000); 
            System.out.println(2);
            c = new Color(0,0,204);
            repaint();
            Thread.sleep(1000); 
            System.out.println(2);
            c = new Color(0,0,153);
            repaint();
            Thread.sleep(1000); 
            System.out.println(2);
            c = new Color(0,0,102);
            repaint();
            Thread.sleep(1000); 
            System.out.println(2);
            c = new Color(0,0,51);
            repaint();
            Thread.sleep(1000); 
        }
    } 
    catch (Exception ex) 
    {
        ex.printStackTrace();
    }
}
public void update(Graphics g) 
{
    paint(g);
}
public void paint(Graphics g) 
{
for(int sun=40;sun<550;sun++)

g.drawImage(img,950,sun,200,200,this);

    try
    {
        Thread.sleep(50);
    }
    catch(Exception e)
    {

    }

g.setColor(black);
g.fillRect(20,20,1200,700);

g.setColor(g1);
g.fillRect(30,510,1180,200);

Graphics2D d = (Graphics2D) g;
d.setColor(c);
d.fill(rec);

g.drawImage(h1,300,220,700,400,this); 
}

}