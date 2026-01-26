package pack1;

public class Schwierigkeit {

  public Schwierigkeit() {

    if (Var.imSpiel = true) {

      new java.util.Timer()
          .schedule(
              new java.util.TimerTask() {
                @Override
                public void run() {
                  if (Var.imSpiel = true) {
                    Var.speedup = 4;
                    Var.speeddown = 3;
                    Var.speedleft = 5;
                    Var.speedright = 5;

                    Var.gegnerspeed[0] = 4;
                    Var.gegnerspeed[1] = 5;
                    Var.gegnerspeed[2] = 4;
                    Var.gegnerspeed[3] = 5;
                    Var.gegnerspeed[4] = 4;

                    Var.schrottspeed1[0] = 3;
                    Var.schrottspeed1[1] = 4;
                    Var.schrottspeed1[2] = 3;
                    Var.schrottspeed1[3] = 5;
                    Var.schrottspeed1[4] = 4;

                    Var.schrottspeed2[0] = 5;
                    Var.schrottspeed2[1] = 6;

                    Var.schrottspeed3 = 7;
                  }
                }
              },
              100000);

      new java.util.Timer()
          .schedule(
              new java.util.TimerTask() {
                @Override
                public void run() {
                  if (Var.imSpiel = true) {
                    Var.speedup = 5;
                    Var.speeddown = 4;
                    Var.speedleft = 6;
                    Var.speedright = 6;

                    Var.gegnerspeed[0] = 5;
                    Var.gegnerspeed[1] = 6;
                    Var.gegnerspeed[2] = 5;
                    Var.gegnerspeed[3] = 6;
                    Var.gegnerspeed[4] = 5;

                    Var.schrottspeed1[0] = 4;
                    Var.schrottspeed1[1] = 5;
                    Var.schrottspeed1[2] = 4;
                    Var.schrottspeed1[3] = 6;
                    Var.schrottspeed1[4] = 5;

                    Var.schrottspeed2[0] = 6;
                    Var.schrottspeed2[1] = 7;

                    Var.schrottspeed3 = 8;
                  }
                }
              },
              200000);

      new java.util.Timer()
          .schedule(
              new java.util.TimerTask() {
                @Override
                public void run() {
                  if (Var.imSpiel = true) {
                    Var.speedup = 6;
                    Var.speeddown = 5;
                    Var.speedleft = 7;
                    Var.speedright = 7;

                    Var.gegnerspeed[0] = 6;
                    Var.gegnerspeed[1] = 7;
                    Var.gegnerspeed[2] = 6;
                    Var.gegnerspeed[3] = 7;
                    Var.gegnerspeed[4] = 6;

                    Var.schrottspeed1[0] = 5;
                    Var.schrottspeed1[1] = 6;
                    Var.schrottspeed1[2] = 5;
                    Var.schrottspeed1[3] = 7;
                    Var.schrottspeed1[4] = 6;

                    Var.schrottspeed2[0] = 7;
                    Var.schrottspeed2[1] = 8;

                    Var.schrottspeed3 = 9;
                  }
                }
              },
              300000);
    }
  }
}
