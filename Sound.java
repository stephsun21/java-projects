//  Sound.java       Author: Stephanie
//
// A class to load sound files from computer
import java.applet.Applet;
import java.applet.AudioClip;
 
public class Sound
{
  //loading the sound files 
  public static final AudioClip crossAud = Applet.newAudioClip(NoughtsCrossesPanel.class.getResource("cross.wav"));
  public static final AudioClip clapping = Applet.newAudioClip(NoughtsCrossesPanel.class.getResource("clapping.wav"));
  public static final AudioClip noughtAud = Applet.newAudioClip(NoughtsCrossesPanel.class.getResource("4.wav"));
  public static final AudioClip flatAud = Applet.newAudioClip(NoughtsCrossesPanel.class.getResource("flatt.wav"));
}