package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageView extends JFrame {
    private ImageIcon myImage1 = new ImageIcon ("C:\\Users\\Gorkem\\workspace\\ImageGallery-v2\\src\\resources\\img-1.jpg");
    private ImageIcon myImage2 = new ImageIcon ("C:\\Users\\Gorkem\\workspace\\ImageGallery-v2\\src\\resources\\img-2.jpg");
    private ImageIcon myImage3 = new ImageIcon ("C:\\Users\\Gorkem\\workspace\\ImageGallery-v2\\src\\resources\\img-3.jpg");
    private ImageIcon myImage4 = new ImageIcon ("C:\\Users\\Gorkem\\workspace\\ImageGallery-v2\\src\\resources\\img-4.jpg");
    JPanel imageGallery = new JPanel();
    private ImageIcon[] myImages = new ImageIcon[4];
    private int curImageIndex=0;

    public ImageView () {
    	setTitle("Image Gallery v2.00");
    	getContentPane().setBackground(new Color(25, 65, 25));
            imageGallery.setPreferredSize(new Dimension(0, 0));
            imageGallery.setMinimumSize(new Dimension(0, 0));
            imageGallery.setMaximumSize(new Dimension(0, 0));
            imageGallery.setBounds(25, 105, 734, 350);
            JLabel label = new JLabel (myImage1);
            label.setAlignmentX(Component.CENTER_ALIGNMENT);
            myImages[0]=myImage1;
            myImages[1]=myImage2;
            myImages[2]=myImage3;
            myImages[3]=myImage4;
            getContentPane().setLayout(null);
            
            JPanel header = new JPanel();
            header.setBounds(0, 0, 784, 80);
            header.setBackground(new Color(25, 75, 25));
            getContentPane().add(header);
            header.setLayout(null);
            
            JLabel lblImageGalery = new JLabel("Image Gallery");
            lblImageGalery.setForeground(new Color(255, 255, 255));
            lblImageGalery.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 32));
            lblImageGalery.setBounds(25, 0, 185, 80);
            header.add(lblImageGalery);
            
            JLabel label_4 = new JLabel("");
            label_4.setHorizontalAlignment(SwingConstants.CENTER);
            label_4.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\ImageGallery-v2\\src\\resources\\settings_1.png"));
            label_4.setBounds(724, 0, 60, 80);
            header.add(label_4);
            
            JLabel label_5 = new JLabel("");
            label_5.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\ImageGallery-v2\\src\\resources\\list_1.png"));
            label_5.setHorizontalAlignment(SwingConstants.CENTER);
            label_5.setBounds(664, 0, 60, 80);
            header.add(label_5);

            getContentPane().add(imageGallery);
            imageGallery.setLayout(new BorderLayout(0, 0));
            imageGallery.add(label);

            JButton PREVIOUS = new JButton ("");
            PREVIOUS.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\ImageGallery-v2\\src\\resources\\arrow-left.png"));
            PREVIOUS.setFocusPainted(false);
            PREVIOUS.setDefaultCapable(false);
            PREVIOUS.setContentAreaFilled(false);
            PREVIOUS.setBorderPainted(false);
            JButton NEXT = new JButton ("");
            NEXT.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\ImageGallery-v2\\src\\resources\\arrow-right.png"));
            NEXT.setFocusPainted(false);
            NEXT.setDefaultCapable(false);
            NEXT.setContentAreaFilled(false);
            NEXT.setBorderPainted(false);
            NEXT.setBackground(new Color(25, 75, 25));

            JPanel menu = new JPanel();
            menu.setBounds(149, 481, 490, 80);
            menu.setLayout(new GridLayout(1,2));
            menu.setBackground(new Color(25, 75, 25));
            menu.add(PREVIOUS);
            
            JLabel lblNewLabel = new JLabel("");
            lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\ImageGallery-v2\\src\\resources\\hr.png"));
            menu.add(lblNewLabel);
            
            JLabel label_1 = new JLabel("");
            label_1.setHorizontalAlignment(SwingConstants.CENTER);
            label_1.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\ImageGallery-v2\\src\\resources\\fb2.png"));
            menu.add(label_1);
            
            JLabel lblNewLabel_1 = new JLabel("");
            lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\ImageGallery-v2\\src\\resources\\hr.png"));
            menu.add(lblNewLabel_1);
            
            JLabel label_2 = new JLabel("");
            label_2.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\ImageGallery-v2\\src\\resources\\google.png"));
            label_2.setHorizontalAlignment(SwingConstants.CENTER);
            menu.add(label_2);
            
            JLabel label_3 = new JLabel("");
            label_3.setHorizontalAlignment(SwingConstants.CENTER);
            label_3.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\ImageGallery-v2\\src\\resources\\hr.png"));
            menu.add(label_3);
            menu.add(NEXT);

            getContentPane().add(menu);
            
            JPanel footer = new JPanel();
            footer.setBackground(new Color(25, 75, 25));
            footer.setBounds(0, 481, 784, 80);
            getContentPane().add(footer);

            //register listener
            PreviousButtonListener PreviousButton = new PreviousButtonListener ();
            NextButtonListener NextButton = new NextButtonListener ();

            //add listeners to corresponding components 
            PREVIOUS.addActionListener(PreviousButton);
            NEXT.addActionListener(NextButton);

        }

    public static void main (String [] args) {
            ImageView frame = new ImageView();
            frame.setSize(800,600);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
    }

    class PreviousButtonListener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
                if(curImageIndex>0 && curImageIndex <= 3) {   
                		imageGallery.remove(0);
                        curImageIndex=curImageIndex-1;
                        ImageIcon TheImage= myImages[curImageIndex];
                        imageGallery.add(new JLabel (TheImage));
                        imageGallery.validate();
                        imageGallery.repaint(); 
                    }else {   
                        imageGallery.remove(0);
                        imageGallery.add(new JLabel (myImage1));
                        curImageIndex=0;
                        imageGallery.validate();
                        imageGallery.repaint();
                    }
            }
    }

    class NextButtonListener implements ActionListener {
    	public void actionPerformed(ActionEvent e){
    		if(curImageIndex>=0 && curImageIndex < 3) {   
    				imageGallery.remove(0);
                    curImageIndex = curImageIndex + 1;
                    ImageIcon TheImage= myImages[curImageIndex];
                    imageGallery.add(new JLabel (TheImage));
                    imageGallery.validate();
                    imageGallery.repaint(); 
            }else {   
                    imageGallery.remove(0);
                    imageGallery.add(new JLabel (myImage4));
                    curImageIndex=3;
                    imageGallery.validate();
                    imageGallery.repaint();
            }
        }
    }
}