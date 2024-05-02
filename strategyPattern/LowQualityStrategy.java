package org.example.strategyPattern;

public class LowQualityStrategy implements QualityAdjustmentStrategy
{
    @Override
    public VideoQuality supportsType(){
        return VideoQuality.LOW;
    }

    @Override
    public Video setQuality(Video video){
        video.setCodec(VideoCodec.H264);
        video.setBitrate(500);
        System.out.println("Presenting Low quality");
        return video;
    }
}