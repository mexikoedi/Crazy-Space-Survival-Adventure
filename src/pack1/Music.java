package pack1;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Music {

	public static synchronized void music(String track) {

		final String trackname = track;

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {

					try {

						Clip clip = AudioSystem.getClip();
						AudioInputStream inputstream = AudioSystem.getAudioInputStream(new File(trackname));
						clip.open(inputstream);
						clip.loop(Clip.LOOP_CONTINUOUSLY);
						FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
						volume.setValue(-10);
						Thread.sleep(clip.getMicrosecondLength() / 1000);
						clip.stop(); 
						clip.close();

					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Audio konnte nicht geladen werden");
					}
				}

			}
		}).start();
	}

}
