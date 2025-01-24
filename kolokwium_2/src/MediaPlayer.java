public interface MediaPlayer {
    void play(String trackName);
    void pause();
    String getCurrentTrack();
}

class AudioPlayer implements MediaPlayer {
    private String currentTrack;

    @Override
    public void play(String trackName) {
        currentTrack = trackName;
        System.out.println("Teraz gra: " + trackName);
    }

    @Override
    public void pause() {
        System.out.println("Audio wstrzymane.");
    }

    @Override
    public String getCurrentTrack() {
        return currentTrack;
    }
}

class VideoPlayer implements MediaPlayer {
    private String currentTrack;

    @Override
    public void play(String trackName) {
        System.out.println("Teraz odtwarza: " + trackName);
    }

    @Override
    public void pause() {
        System.out.println("Video wstrzymane.");
    }

    @Override
    public String getCurrentTrack() {
        return currentTrack;
    }
}
