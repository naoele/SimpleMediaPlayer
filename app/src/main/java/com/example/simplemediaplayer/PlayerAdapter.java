package com.example.simplemediaplayer;

/**
 * {@link MainActivity}が{@link MediaPlayerHolder}のメディア再生を制御できるようにします。
 */
public interface PlayerAdapter {

    void loadMedia(int resourceId);

    void release();

    boolean isPlaying();

    void play();

    void reset();

    void pause();

    void initializeProgressCallback();

    void seekTo(int position);
}
