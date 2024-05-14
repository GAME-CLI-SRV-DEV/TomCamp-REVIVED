package com.outfit7;
import javax.swing.*;
import java.awt.*;

public class talkingtomcamp {
    private JFrame window;
    private Image balloon;
    private Image blaster;
    private Image rubbersquad;
    private Image ninja;
    private Image slinger;
    private Image Jetpack;
    private Image Wingsuit;
    private Image Dryer;
    private Image balloonme1;
    private Image balloonme2;
    private Image blastermerged;
    private Image rubbersquadm1;
    private Image ninjamerged1;
    private Image ninjamerged2;
    private Image slingermerged1;
    private Image slingermerged2;
    private Image AirStrikeJetPack;
    private Image AirStrikeWingsuit;
    private Image AirStrikeAirship;


    public void start() {
            // Create a new window
            window = new JFrame("Talking Tom Camp Java Edition: Project Remastered");

            // Set the window to full screen
            window.setExtendedState(JFrame.MAXIMIZED_BOTH);

            // Optionally, you can also remove the window decorations (title bar, minimize/maximize/close buttons, etc.)
            // Note: undecorated windows cannot be resized or closed with the window system controls.
            window.setUndecorated(true);

            // Make the window visible
            window.setVisible(true);
        talkingtomcamp talkingtomcamp = this;
        talkingtomcamp.loadpicture();
            // Here you can add more components to your window
            // and implement the logic of your game
        }
        public void loadpicture() {
            balloon = new ImageIcon("src\\main\\resources\\images\\troops\\Balloon.png").getImage();
            blaster = new ImageIcon("src\\main\\resources\\images\\troops\\Blaster.png").getImage();
            rubbersquad = new ImageIcon("src\\main\\resources\\images\\troops\\Rubbersquad.png").getImage();
            ninja = new ImageIcon("src\\main\\resources\\images\\troops\\Ninja.png").getImage();
            slinger = new ImageIcon("src\\main\\resources\\images\\troops\\Slinger.png").getImage();
            JetPack = new ImageIcon("src\\main\\resources\\images\\troops\\Balloon.png").getImage();
            Wingsuit = new ImageIcon("src\\main\\resources\\images\\troops\\Blaster.png").getImage();
            Dryer = new ImageIcon("src\\main\\resources\\images\\troops\\Rubbersquad.png").getImage();
            AirShip = new ImageIcon("src\\main\\resources\\images\\troops\\Airship.png").getImage();
            Mecha = new ImageIcon("src\\main\\resources\\images\\troops\\Mecha.png").getImage();
        }

    }

