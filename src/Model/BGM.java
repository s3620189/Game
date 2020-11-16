package Model;

import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.*;


public class BGM {
    public volatile static boolean flag=true;

    public static void main(String[] args) throws InterruptedException {

        AePlayWave playWave = new AePlayWave("testBGM2.wav");
        playWave.start();
        Thread.sleep(5000);
        playWave.interrupt();
        System.out.println(playWave.isAlive()+"------------------");



    }

    public void playBGM(String path)
    {

        AePlayWave playWave = new AePlayWave(path);
        playWave.start();
    }

}



class AePlayWave extends Thread {

    protected static final boolean DEBUG = true;

    protected InputStream inputStream;

    public AePlayWave(String path) {

        InputStream inputStream = BGM.class.getResourceAsStream(path);
        this.inputStream = inputStream;
        if (DEBUG) System.out.println("AePlayWave constructor");
    }

    @Override
    public void run() {
        if (DEBUG) System.out.println("AePlayWave running");

        AudioInputStream audioInputStream = verifyInputStream();
        if (audioInputStream == null) {
            return;
        }

        AudioFormat format = audioInputStream.getFormat();
        SourceDataLine audioLine = openInputStream(format);

        if (DEBUG) System.out.println(audioLine.getLineInfo()+"  info");

        if (audioLine != null) {

            audioLine.start();

            playInputStream(audioInputStream, audioLine);
        }

    }

    protected AudioInputStream verifyInputStream() {
        if (DEBUG) System.out.println("AePlayWave verifyInputStream");
        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(inputStream);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return audioInputStream;
    }

    protected SourceDataLine openInputStream(AudioFormat format) {
        if (DEBUG) System.out.println("AePlayWave openInputStream");
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
        SourceDataLine audioLine = null;
        if (DEBUG) System.out.println("AePlayWave openInputStream try");
        try {
            audioLine = (SourceDataLine) AudioSystem.getLine(info);
            if (DEBUG) System.out.println("AePlayWave openInputStream getLine");
            audioLine.open(format);
            if (DEBUG) System.out.println("AePlayWave openInputStream open");
        } catch (LineUnavailableException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return audioLine;
    }

    protected void playInputStream(AudioInputStream audioInputStream,
                                   SourceDataLine audioLine) {
        if (DEBUG) System.out.println("AePlayWave playInputStream");
        int externalBufferSize = (int) audioInputStream.getFrameLength() * 4;
        if (DEBUG) System.out.println("AePlayWave playInputStream externalBufferSize:"
                + externalBufferSize);
        int nBytesRead = 0;
        byte[] abData = new byte[externalBufferSize];

        try {
            if (DEBUG) System.out.println("Bytes read:" + nBytesRead);
            while (nBytesRead != -1) {
                nBytesRead = audioInputStream.read(abData, 0, abData.length);
                if (nBytesRead >= 0) {
                    if (DEBUG) System.out.println("Bytes read:" + nBytesRead);
                    audioLine.available();
                    if (DEBUG) System.out.println( audioLine.available()+"  over2" );

                    audioLine.write(abData, 0, nBytesRead);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } finally {
            audioLine.drain();
            audioLine.close();
        }
    }
}




