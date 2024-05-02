package org.example.strategyPattern;

public class HighQualityStrategy implements QualityAdjustmentStrategy
{

    @Override
    public VideoQuality supportsType(){
        return VideoQuality.HIGH;
    }

    @Override
    public Video setQuality(Video video){
        video.setCodec(VideoCodec.VP9);
        video.setBitrate(2000);
        System.out.println("Presenting high quality");
        return video;
    }

}