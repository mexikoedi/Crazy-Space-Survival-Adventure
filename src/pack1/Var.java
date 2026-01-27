package pack1;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Var {
  static JFrame jf1;
  static int screenwidth = 800, screenheight = 600;
  static int backgroundY1 = 0, backgroundY2 = -600, backgroundspeed = 9;
  static int x = 400, y = 400;
  static int speedup = 3, speeddown = 2, speedleft = 4, speedright = 4;
  static int flammeanimation;
  static int schrott = 0, leben = 3, maxleben = 3;
  static int up1anzahl = 0, up2anzahl = 0, up3anzahl = 0;
  static int up1preis = 100, up2preis = 100, up3preis = 50, uplebenpreis = 50;
  static int schildanzahl = 0, schildarraymax = 3;
  static int ammo = 10, maxammo = 10;
  static JButton btnresume, btnshop, btnsteuerung, btnexit, btninfo;
  static JButton btnmute;
  static JButton btnupgrade1, btnupgrade2, btnupgrade3, btnleben;
  static Label lbl1;
  static int gegnerx[] = new int[5], gegnery[] = new int[5];
  static int gegnerspeed[] = new int[5];
  static int schrottx1[] = new int[5], schrotty1[] = new int[5];
  static int schrottx2[] = new int[5], schrotty2[] = new int[5];
  static int schrottx3, schrotty3;
  static int schrottspeed1[] = new int[5], schrottspeed2[] = new int[2], schrottspeed3;
  static int expanimation;
  static int schussx, schussy;
  static int posgegnerx, posgegnery;
  static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
  static boolean kollidiert = false, verloren = false;
  static boolean imSpiel = true,
      imMenue = false,
      imSteuerung = false,
      imShop = false,
      imInfo = false;
  static boolean bolschuss = false;
  static boolean schusskollision = false;
  static BufferedImage ib1, ib2;
  static BufferedImage irakete, iflamme1, iflamme2;
  static BufferedImage igegner1;
  static BufferedImage ischrott1, ischrott2, ischrott3;
  static BufferedImage iLeben;
  static BufferedImage ischild[] = new BufferedImage[4];
  static BufferedImage iammo;
  static Image gifexplosion;
  static Image gifschuss;
  static Image gifgegner;

  public Var() {
    ClassLoader cl = this.getClass().getClassLoader();

    try {
      // Icon
      Image icon = Toolkit.getDefaultToolkit().getImage(cl.getResource("icon.png"));
      jf1.setIconImage(icon);
      // Background (use classpath resources instead of File paths)
      ib1 = ImageIO.read(cl.getResourceAsStream("b1.png"));
      ib2 = ImageIO.read(cl.getResourceAsStream("b1.png"));
      // Rakete
      irakete = ImageIO.read(cl.getResourceAsStream("rakete.png"));
      // Flamme
      iflamme1 = ImageIO.read(cl.getResourceAsStream("flamme 1.1.png"));
      iflamme2 = ImageIO.read(cl.getResourceAsStream("flamme 1.2.png"));
      // Gegner
      igegner1 = ImageIO.read(cl.getResourceAsStream("gegner1.png"));
      gifgegner = Toolkit.getDefaultToolkit().createImage(cl.getResource("gegner.gif"));
      // Leben
      iLeben = ImageIO.read(cl.getResourceAsStream("leben.png"));
      // Schrott
      ischrott1 = ImageIO.read(cl.getResourceAsStream("schrott1.png"));
      ischrott2 = ImageIO.read(cl.getResourceAsStream("schrott2.png"));
      ischrott3 = ImageIO.read(cl.getResourceAsStream("schrott3.png"));
      // Explosion
      gifexplosion = Toolkit.getDefaultToolkit().createImage(cl.getResource("explosion.gif"));

      // Schild
      for (int i = 0; i < ischild.length; i++) {
        ischild[i] = ImageIO.read(cl.getResourceAsStream("schild" + (i + 1) + ".png"));
      }

      // Schuss
      gifschuss = Toolkit.getDefaultToolkit().createImage(cl.getResource("schuss.gif"));
      // Munition
      iammo = ImageIO.read(cl.getResourceAsStream("ammo.png"));
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Bilder konnten nicht geladen werden");
    }

    gegnerspeed[0] = 3;
    gegnerspeed[1] = 4;
    gegnerspeed[2] = 3;
    gegnerspeed[3] = 4;
    gegnerspeed[4] = 3;
    schrottspeed1[0] = 2;
    schrottspeed1[1] = 3;
    schrottspeed1[2] = 2;
    schrottspeed1[3] = 4;
    schrottspeed1[4] = 3;
    schrottspeed2[0] = 4;
    schrottspeed2[1] = 5;
    schrottspeed3 = 6;
    Music.music(cl.getResource("track1.wav"));
  }
}
