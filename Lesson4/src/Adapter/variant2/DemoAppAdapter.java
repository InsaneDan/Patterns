package Adapter.variant2;

public class DemoAppAdapter {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "audioFile1.mp3");
        audioPlayer.play("avi", "audioFile2.avi");
        audioPlayer.play("mov", "audioFile3.mov");
        audioPlayer.play("mp4", "audioFile4.mp4");
        audioPlayer.play("midi", "audioFile5.midi");
        audioPlayer.play("ERR", "audioFile6.ERR");
    }
}

/* РЕЗУЛЬТАТ (консоль):

Playing mp3 file (default): audioFile1.mp3
Playing AVI: audioFile2.avi
Playing MOV: audioFile3.mov
Playing MP4: audioFile4.mp4
Playing MIDI: audioFile5.midi
Error. 'ERR' format is not supported
*/