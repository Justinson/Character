/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Justinson
 */
public class Panda {

    public void draw(Graphics graphics) {

        graphics.setColor(Color.white);
        graphics.drawRect(x, y, width, height);
//        graphics.setColor(Color.white);
//        graphics.fillOval(250, 140 , 100, 100);
//        graphics.fillOval(140, 140, 100, 100);
//        
//        graphics.setColor(Color.blue);
//        graphics.fillOval(170, 160, 35, 50);
//        graphics.fillOval(292, 160, 35, 50);
//        graphics.setColor(Color.white);
//        graphics.fillOval(x, y, width, height);
//        graphics.setColor(Color.white);
//        graphics.fillOval(190, 230, 50, 35);
//        graphics.fillOval(260, 230, 50, 35);
//        graphics.setColor(Color.white);
//        graphics.fillOval(210, 238, 38, 25);

        //head(white)  
        graphics.fillOval(getX() + (width * 20 / 100), getY() + (getHeight() * 40 / 100), getWidth() * 60 / 100, getHeight() * 60 / 100);
//      //eyes(black)  
        graphics.setColor(Color.black);
        graphics.fillOval(getX() + (width * 30 / 100), getY() + (getHeight() * 55 / 100), getWidth() * 15 / 100, getHeight() * 20 / 100);
        graphics.fillOval(getX() + (width * 50 / 100), getY() + (getHeight() * 55 / 100), getWidth() * 15 / 100, getHeight() * 20 / 100);
//      //eyes(white)
        graphics.setColor(Color.white);
        graphics.fillOval(getX() + (width * 50 / 100), getY() + (getHeight() * 62 / 100), getWidth() * 5 / 100, getHeight() * 10 / 100);
        graphics.fillOval(getX() + (width * 30 / 100), getY() + (getHeight() * 62 / 100), getWidth() * 5 / 100, getHeight() * 10 / 100);
        //body(white)     
        graphics.drawRect(x, y, width, height);
        graphics.fillRoundRect(getX() + (width * 25 / 100), getY() + (getHeight() * 100 / 100), getWidth() * 50 / 100, getHeight() * 70 / 100, getWidth() * 35 / 100, getHeight() * 35 / 100);
        //ears(black)
        graphics.setColor(Color.black);
        graphics.fillOval(getX() + (width * 18 / 100), getY() + (getHeight() * 35 / 100), getWidth() * 15 / 100, getHeight() * 20 / 100);
        graphics.fillOval(getX() + (width * 60 / 100), getY() + (getHeight() * 35 / 100), getWidth() * 15 / 100, getHeight() * 20 / 100);
        //nose(black)             
        graphics.fillOval(getX() + (width * 42 / 100), getY() + (getHeight() * 77 / 100), getWidth() * 10 / 100, getHeight() * 5 / 100);        
        //nose(white)
        graphics.setColor(Color.white);
        graphics.fillOval(getX() + (width * 43 / 100), getY() + (getHeight() * 80 / 100), getWidth() * 3 / 100, getHeight() * 3 / 100);        
        graphics.fillOval(getX() + (width * 48 / 100), getY() + (getHeight() * 80 / 100), getWidth() * 3 / 100, getHeight() * 3 / 100);        
        //arms(black)
        graphics.setColor(Color.black);
        graphics.fillRoundRect(getX() + (width * -20 / 100), getY() + (getHeight() * 110 / 100), getWidth() * 50 / 100, getHeight() * 10 / 100, getWidth() * 90 / 100, getHeight() * 90 / 100);
        graphics.fillRoundRect(getX() + (width * 70 / 100), getY() + (getHeight() * 110 / 100), getWidth() * 10 / 100, getHeight() * 50 / 100, getWidth() * 90 / 100, getHeight() * 90 / 100);
        //legs(black)
        graphics.fillRoundRect(getX() + (width * 55 / 100), getY() + (getHeight() * 160 / 100), getWidth() * 15 / 100, getHeight() * 50 / 100, getWidth() * 90 / 100, getHeight() * 90 / 100);
        graphics.fillRoundRect(getX() + (width * 30 / 100), getY() + (getHeight() * 160 / 100), getWidth() * 15 / 100, getHeight() * 50 / 100, getWidth() * 90 / 100, getHeight() * 90 / 100);
        //lightsaber(cyan/gray)
        graphics.setColor(Color.cyan);
        graphics.fillRect(getX() + (width * -25 / 100), getY() + (getHeight() * 0 / 100), getWidth() * 6 / 100, getHeight() * 125 / 100);
        graphics.setColor(Color.GRAY);
        graphics.fillRect(getX() + (width * -25 / 100), getY() + (getHeight() * 100 / 100), getWidth() * 6 / 100, getHeight() * 25 / 100);       
        graphics.fillRoundRect(getX() + (width * -53 / 200), getY() + (getHeight() * 95 / 100), getWidth() * 9 / 100, getHeight() * 7 / 100, getWidth() * 5 / 100, getHeight() * 3 / 100);
        graphics.fillRoundRect(getX() + (width * -53 / 200), getY() + (getHeight() * 120 / 100), getWidth() * 9 / 100, getHeight() * 7 / 100, getWidth() * 5 / 100, getHeight() * 3 / 100);
        //hand(black)
        graphics.setColor(Color.black);
        graphics.fillOval(getX() + (width * -25 / 100), getY() + (getHeight() * 110 / 100), getWidth() * 10 / 100, getHeight() * 10 / 100); 
        //ears(white)
        graphics.setColor(Color.white);
        graphics.fillOval(getX() + (width * 25 / 100), getY() + (getHeight() * 46 / 100), getWidth() * 7 / 100, getHeight() * 10 / 100);
        graphics.fillOval(getX() + (width * 60 / 100), getY() + (getHeight() * 46 / 100), getWidth() * 7 / 100, getHeight() * 10 / 100);
        //mouth(black)
        graphics.setColor(Color.black);
        graphics.drawOval(getX() + (width * 43 / 100), getY() + (getHeight() * 81 / 100), getWidth() * 7 / 100, getHeight() * 10 / 100);
        //right foot(black/white)
        graphics.setColor(Color.black);
        graphics.fillOval(getX() + (width * 50 / 100), getY() + (getHeight() * 202 / 100), getWidth() * 15 / 100, getHeight() * 10 / 100);
        graphics.setColor(Color.white);
        //left foot(black/white)   
        graphics.setColor(Color.black);
        graphics.fillOval(getX() + (width * 25 / 100), getY() + (getHeight() * 202 / 100), getWidth() * 15 / 100, getHeight() * 10 / 100);
        graphics.setColor(Color.white);
          
        
        
//        graphics.drawRect(x, y, width, height);
//          int[] x5 = new int[3];
//          x5[0] = x + (width / 2);
//          x5[1] = x;
//          x5[2] = x + width;
//          
//          int[] y5 = new int[3];
//          y5[0] = y;
//          y5[1] = y + width / 3;
//          y5[2] = y + width;
//          
//          graphics.fillPolygon(x5, y5, 3);
//          
    }

    public Panda(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

//<editor-fold defaultstate="collapsed" desc="Properties">
    private int x;
    private int y;
    private int height;
    private int width;

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }
//</editor-fold>

}
