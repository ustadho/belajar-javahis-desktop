package com.javahis.belajar;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author Administrator
 */
public class desktopImage extends JDesktopPane{
    private Image image;

    public desktopImage() {
        image=new ImageIcon(getClass().getResource("Wipro.JPG")).getImage();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        try{
            if(g!=null){
                g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
//                g.drawImage(image,
//                            (this.getSize().width - image.getWidth(null)) / 2,
//                            (this.getSize().height - image.getHeight(null)) / 2,
//                            null);

            }
        }catch(NullPointerException ne){
            System.err.println(ne.getMessage());
        }
    }



}
