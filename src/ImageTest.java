import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageTest{
    
    public static BufferedImage readImage(String path) throws java.io.IOException{
        String imagePath = path; //"./img2.jpeg";
        
        BufferedImage myPicture = ImageIO.read(new File(imagePath));
        //System.out.println(myPicture.toString());
        return myPicture;
    }

    public static Graphics2D transformGraphics2d(BufferedImage myPicture) throws java.io.IOException{
        Graphics2D g = (Graphics2D) myPicture.getGraphics();
        g.setStroke(new BasicStroke(3));
        g.setColor(Color.BLUE);
        g.drawRect(10, 10, myPicture.getWidth() - 20, myPicture.getHeight() - 20);
        
        return g;
    }

    public static BufferedImage chooseImage() throws java.io.IOException{
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG & GIF Images", "jpg", "gif");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        BufferedImage choosenImage = null;
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " +
            chooser.getSelectedFile().getName());

            BufferedImage myPicture = ImageIO.read(chooser.getSelectedFile());

            return myPicture;
        }
        else{
            return choosenImage;
        }
    }
    
    public static void main(String args[]){
        //System.out.println("Works");
        
        try{
            //BufferedImage image = ImageTest.readImage("./img2.jpeg");
            
            Image imgObj = new Image();
            
            
            imgObj.showImage(ImageTest.chooseImage());

            


            //Graphics2D image2D = ImageTest.transformGraphics2d(image);
            //System.out.println(image2D.getBackground().toString());
            /*JLabel picLabel = new JLabel(new ImageIcon(image));
            JPanel jPanel = new JPanel();
            jPanel.add(picLabel);
            JFrame f = new JFrame();
            f.setSize(new Dimension(image.getWidth(), image.getHeight()));
            f.add(jPanel);
            f.setVisible(true);*/

            


            //imgObj.show();
            //imgObj.getR();

            //imgObj.getRGBHex();

            //imgObj.getR();
            //imgObj.bandaGreen();
           /* imgObj.bandaBlue();

            imgObj.show();

            imgObj.saveImageToDisk("BlueTheme");
            */
            
            //imgObj.bandaRed();
		//imgObj.bandaGreen();
		//imgObj.bandaBlue();

            //imgObj.show();

            //imgObj.saveImageToDisk("RedTheme");
            
            //imgObj.bandaGreen();

            //imgObj.show();

            //imgObj.saveImageToDisk("GreenTheme");
            
	    //imgObj.rgbToYuv();

		//imgObj.rgbToYuv2();

		//imgObj.yuvToRgb2(imgObj.rgbToYuv2());
        //imgObj.showImage(imgObj.yuvToRgb2(imgObj.rgbToYuv2()));
        //ScreenBuilder sb = new ScreenBuilder(imgObj);
        //ScreenBuilder.makeMainPanel(imgObj, image);
        
		

            //imgObj.show();
	   /*	
            BufferedImage imageYuvToRgb = null;
            imageYuvToRgb = imgObj.yuvToRgb(imgObj.getImage());

            imgObj.showImage(imageYuvToRgb);
		*/
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
