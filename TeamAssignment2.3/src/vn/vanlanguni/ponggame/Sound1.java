package vn.vanlanguni.ponggame;

import java.applet.Applet;
import java.applet.AudioClip;

public class Sound1 {

    public static final Sound1 bgMusic = new Sound1("/nhac.wav");
    public static final Sound1 hitpaddle = new Sound1("/Ball.wav");

    private AudioClip clip;

    public Sound1(String Ball) {
        try {
            // gets the sound file that is passed in the constructor
            clip = Applet.newAudioClip(Sound1.class.getResource(Ball));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // plays the music, obviously
    public void play() {
        try {
            new Thread() { //multi-tasking stuff
                public void run(){
                    //clip.play();
                    clip.loop();

                }
            }.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //plays the audio in a loop
    public void loop(){
        play();
    }

}