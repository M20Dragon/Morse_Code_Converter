import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

/**
 * Created by timurguler on 4/4/16.
 */
//Fix issue with Carbon Component Manager
class BeethovenTest
{
    private static String passedCodeString;
    public BeethovenTest(String morseCodeString)
    {
        passedCodeString = morseCodeString;
    }
    private static float SAMPLE_RATE = 8000f;

    private static void tone(int hz, int msecs)
            throws LineUnavailableException
    {
        tone(hz, msecs, 1.0);
    }

    private static void tone(int hz, int msecs, double vol)
            throws LineUnavailableException
    {
        byte[] buf = new byte[1];
        AudioFormat af =
                new AudioFormat(
                        SAMPLE_RATE, // samHELLOpleRate
                        8,           // sampleSizeInBits
                        1,           // channels
                        true,        // signed
                        false);      // bigEndian
        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af);
        sdl.start();
        for (int i=0; i < msecs*8; i++)
        {
            double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
            buf[0] = (byte)(Math.sin(angle) * 127.0 * vol);
            sdl.write(buf,0,1);
        }
        sdl.drain();
        sdl.stop();
        sdl.close();
    }
    public static void main()
    {
        try
        {
            for (int l = 0; l <= passedCodeString.length(); l++)
            {
                if (passedCodeString.substring(l, l + 1).equals("."))
                {
                    BeethovenTest.tone(900, 40);
                    Thread.sleep(20);
                }
                else if (passedCodeString.substring(l, l + 1).equals("-"))
                {
                    BeethovenTest.tone(900, 120);
                    Thread.sleep(20);
                }
                else if (passedCodeString.substring(l, l + 1).equals("/"))
                {
                    Thread.sleep(300);
                }
            }
        }
        catch (Exception e)
        {

        }


    }
}