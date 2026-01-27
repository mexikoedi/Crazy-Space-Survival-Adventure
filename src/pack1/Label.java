package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.time.LocalDate;
import javax.swing.JLabel;

public class Label extends JLabel {
  private LocalDate currentDate = LocalDate.now();
  private int currentYear = currentDate.getYear();
  private static final long serialVersionUID = 1L;

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    if (Var.imSpiel) {
      g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
      g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);
      g.setColor(new Color(0, 230, 115));
      g.setFont(new Font("Arial", Font.BOLD, 35));
      g.drawString("Schrott: " + Var.schrott, 10, 30);
      g.drawImage(Var.iLeben, 610, 505, 50, 50, null);
      g.setFont(new Font("Arial", Font.BOLD, 55));
      g.drawString("" + Var.leben, 670, 550);
      g.setFont(new Font("Arial", Font.BOLD, 25));
      g.drawString("/ " + Var.maxleben, 730, 545);
      g.drawImage(Var.iammo, 20, 495, 56, 65, null);
      g.setFont(new Font("Arial", Font.BOLD, 55));
      g.drawString("" + Var.ammo, 90, 550);
      g.setFont(new Font("Arial", Font.BOLD, 25));
      g.drawString("/ " + Var.maxammo, 155, 545);

      for (int i = 0; i <= 4; i++) {
        g.drawImage(Var.ischrott1, Var.schrottx1[i], Var.schrotty1[i], 88, 78, null);
      }

      for (int i = 0; i <= 1; i++) {
        g.drawImage(Var.ischrott2, Var.schrottx2[i], Var.schrotty2[i], 88, 78, null);
      }

      g.drawImage(Var.ischrott3, Var.schrottx3, Var.schrotty3, 88, 78, null);

      for (int i = 0; i <= 4; i++) {
        g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 60, 60, null);
      }

      if (Var.schusskollision == true) {
        g.drawImage(Var.gifgegner, Var.posgegnerx, Var.posgegnery, 60, 60, null);
      }

      if (Var.bolschuss == true) {
        g.drawImage(Var.gifschuss, Var.schussx - 130, Var.schussy - 150, 283, 283, null);
      }

      if (Var.flammeanimation == 0) {
        g.drawImage(Var.iflamme1, Var.x, Var.y + 45, 50, 50, null);
      } else if (Var.flammeanimation == 1) {
        g.drawImage(Var.iflamme2, Var.x, Var.y + 45, 50, 50, null);
      }

      g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);

      if (Var.schildanzahl > 0 && Var.schildanzahl <= Var.ischild.length) {
        g.drawImage(Var.ischild[Var.schildanzahl - 1], Var.x - 125, Var.y - 20, 300, 100, null);

      } else if (Var.schildanzahl > Var.ischild.length) {
        g.drawImage(Var.ischild[Var.schildarraymax], Var.x - 125, Var.y - 20, 300, 100, null);
      }

      if (Var.kollidiert) {
        g.drawImage(Var.gifexplosion, Var.x - 10, Var.y - 10, 71, 100, null);

        if (Var.expanimation > 1 && Var.expanimation <= 4) {
          g.setColor(new Color(230, 0, 0, 45));
          g.fillRect(0, 0, Var.screenwidth, Var.screenheight);
        } else if (Var.expanimation >= 6 && Var.expanimation <= 9) {
          g.setColor(new Color(230, 0, 0, 45));
          g.fillRect(0, 0, Var.screenwidth, Var.screenheight);
        }

        repaint();
      }

      repaint();

    } else if (Var.imMenue || Var.imSteuerung || Var.imShop || Var.imInfo) {
      g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
      g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);

      if (Var.schusskollision == false) {
        g.drawImage(Var.gifgegner, Var.posgegnerx, Var.posgegnery, 60, 60, null);
      }

      if (Var.bolschuss == false) {
        g.drawImage(Var.gifschuss, Var.schussx - 130, Var.schussy - 150, 283, 283, null);
      }

      if (Var.flammeanimation == 0) {
        g.drawImage(Var.iflamme1, Var.x, Var.y + 45, 50, 50, null);
      } else if (Var.flammeanimation == 1) {
        g.drawImage(Var.iflamme2, Var.x, Var.y + 45, 50, 50, null);
      }

      g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);

      if (Var.schildanzahl > 0 && Var.schildanzahl <= Var.ischild.length) {
        g.drawImage(Var.ischild[Var.schildanzahl - 1], Var.x - 125, Var.y - 20, 300, 100, null);

      } else if (Var.schildanzahl > Var.ischild.length) {
        g.drawImage(Var.ischild[Var.schildarraymax], Var.x - 125, Var.y - 20, 300, 100, null);
      }

      for (int i = 0; i <= 4; i++) {
        g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 60, 60, null);
      }

      g.setColor(new Color(100, 100, 100, 128));
      g.fillRect(0, 0, Var.screenwidth, Var.screenheight);

      if (Var.verloren) {
        g.setColor(new Color(0, 230, 115));
        g.setFont(new Font("Arial", Font.BOLD, 35));
        g.drawString("Schrott " + Var.schrott, 310, 180);
        repaint();
      }

      if (Var.imShop) {
        g.setColor(new Color(0, 230, 115));
        g.setFont(new Font("Arial", Font.BOLD, 35));
        g.drawString("Schrott (S): " + Var.schrott, 310, 180);
        g.drawString("+1 Maxleben", 85, 340);
        g.drawString("+10 Schuss", 100, 415);
        g.drawString("+1 Plasmaschild", 20, 485);
        g.drawString("Stufe " + Var.up1anzahl, 550, 340);
        g.drawString("Stufe " + Var.up2anzahl, 550, 415);
        g.drawString("Stufe " + Var.up3anzahl, 550, 485);
        g.drawString(Var.up1preis + " S", 310, 340);
        g.drawString(Var.up2preis + " S", 310, 415);
        g.drawString(Var.up3preis + " S", 310, 485);
        g.drawString(Var.uplebenpreis + " S", 700, 185);
        g.drawString("+1 Leben", 525, 235);
        g.setColor(Color.BLACK);
        g.drawLine(50, 362, 750, 362);
        g.drawLine(50, 438, 750, 438);
        g.drawLine(300, 300, 300, 500);
        repaint();
      }

      if (Var.imSteuerung) {
        g.setColor(new Color(0, 230, 115));
        g.setFont(new Font("Arial", Font.BOLD, 35));
        g.drawString("Hoch, runter, rechts und links mit den Pfeil ", 10, 180);
        g.drawString("Tasten.", 10, 230);
        g.drawString("Schießen mit der Leertaste.", 10, 310);
        g.drawString("Benutze ESC für das Menü und navigiere dich", 10, 390);
        g.drawString("mit der Maus darin.", 10, 440);
        repaint();
      }

      if (Var.imInfo) {
        g.setColor(new Color(0, 230, 115));
        g.setFont(new Font("Arial", Font.BOLD, 35));
        g.drawString("Versuche so lange zu überleben wie du nur", 10, 180);
        g.drawString("kannst.", 10, 230);
        g.drawString("Vermeide die Asteroiden.", 10, 310);
        g.drawString("Sammel Schrott ein und nutze Upgrades um", 10, 390);
        g.drawString("länger zu überleben.", 10, 440);
        g.setColor(new Color(0, 1, 1));
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("© 2020-" + currentYear + " mexikoedi", 10, 520);
        g.drawString("All rights reserved.", 10, 550);
        repaint();
      }
    }
  }
}
