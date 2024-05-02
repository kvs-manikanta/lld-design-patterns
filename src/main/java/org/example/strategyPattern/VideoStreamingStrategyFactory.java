package org.example.strategyPattern;

public class VideoStreamingStrategyFactory
{
    public static  QualityAdjustmentStrategy getStrategy(VideoQuality videoQuality){
        return switch (videoQuality) {
            case LOW -> new LowQualityStrategy();
            case MEDIUM -> new MediumQualityStrategy();
            case HIGH -> new HighQualityStrategy();
            default -> null;
        };
    }
}