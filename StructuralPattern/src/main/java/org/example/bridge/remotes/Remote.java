package org.example.bridge.remotes;

/**
 * Remote classes act as an abstraction.
 */
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
