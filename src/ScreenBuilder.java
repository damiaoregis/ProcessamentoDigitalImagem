import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScreenBuilder{
    
    public static void makeMainPanel(Image imageOps, BufferedImage img){

        JButton buttonSeeRed = new JButton("Ver banda vermelho");
        setButtonEvent(buttonSeeRed, 1, imageOps, img);
        JButton buttonSeeGreen = new JButton("Ver banda verde");
        setButtonEvent(buttonSeeGreen, 2, imageOps, img);
        JButton buttonSeeBlue = new JButton("Ver banda azul");
        setButtonEvent(buttonSeeBlue, 3, imageOps, img);
        JButton buttonYuvToRgb = new JButton("YUV para RGB");
        setButtonEvent(buttonYuvToRgb, 4, imageOps, img);
        JPanel jPanel = new JPanel();

        jPanel.add(buttonSeeRed);
        jPanel.add(buttonSeeGreen);
        jPanel.add(buttonSeeBlue);
        jPanel.add(buttonYuvToRgb);

        

        JFrame window = new JFrame("Processamento de imagens");
        window.add(jPanel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
    }

    


    private static void setButtonEvent(JButton button, int type, Image imageOps, BufferedImage img ){
        if (type == 1){
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                  imageOps.bandaRedAndShow(img);
                }
              });
        }else if(type == 2){
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    imageOps.bandaGreenAndShow(img);
                }
              });

        }else if (type == 3){
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    imageOps.bandaBlueAndShow(img);
                }
              });
        }else{
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    imageOps.showImage(imageOps.yuvToRgb2(imageOps.rgbToYuv2()));
                }
              });
        }
    }






}