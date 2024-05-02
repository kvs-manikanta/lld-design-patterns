package org.example.strategyPattern;

public class MediumQualityStrategy implements QualityAdjustmentStrategy
{
    @Override
    public VideoQuality supportsType(){
        return VideoQuality.MEDIUM;
    }

    @Override
    public Video setQuality(Video video){
        video.setCodec(VideoCodec.H265);
        video.setBitrate(1000);
        System.out.println("Presenting medium quality");
        return video;
    }

}