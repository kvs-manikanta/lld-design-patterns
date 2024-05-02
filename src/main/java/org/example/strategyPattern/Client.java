package org.example.strategyPattern;


public class Client {

    public static void main(String[] args) {
        Video video=new Video("Web Series",VideoQuality.HIGH);
        VideoStreamingManager videoStreamingManager=new VideoStreamingManager(video);

        videoStreamingManager.streamVideo();
        
    }
}
