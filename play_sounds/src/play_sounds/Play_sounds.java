/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play_sounds;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Julian
 */
public class Play_sounds {

    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JLabel lab;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buttons form = new Buttons();
        form.setVisible(true);
        
       
    }
  
   
 
           
    
  
    static void PlaySound(File Sound)
    {
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000);    
        }catch(LineUnavailableException | UnsupportedAudioFileException | IOException | InterruptedException e){
            
        }
        
        
            
                    
    }
    
}
