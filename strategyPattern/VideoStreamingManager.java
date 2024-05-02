package org.example.strategyPattern;

public class VideoStreamingManager {
    private Video video;

    public VideoStreamingManager(Video video) {
        this.video = video;
    }

    public Video streamVideo() {
        QualityAdjustmentStrategy qualityAdjustmentStrategy = VideoStreamingStrategyFactory.getStrategy(video.getVideoQuality());
        return qualityAdjustmentStrategy.setQuality(video);
    }


}