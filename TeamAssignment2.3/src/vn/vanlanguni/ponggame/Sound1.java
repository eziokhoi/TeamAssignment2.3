package vn.vanlanguni.ponggame;

import java.applet.Applet;
import java.applet.AudioClip;

public class Sound1 {

    public static final Sound1 bgMusic = new Sound1("/1.wav");
    public static final Sound1 bg = new Sound1("/3.wav");
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
            new Thread() { 
                public void run(){
                    //clip.play();
                    clip.play();

                }
            }.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //plays the audio in a loop
    public void loop(){
    	try{
    		new Thread() {
    			public void run(){
    				clip.loop();
    			}
    		}.start();
    	} catch (Exception e){
    		e.printStackTrace();
    	}
     
    }
  
    
    public void stop(){
        clip.stop();
    }

}
