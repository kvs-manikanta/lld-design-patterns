package org.example.strategyPattern;


public interface QualityAdjustmentStrategy {
    VideoQuality supportsType();

    Video setQuality(Video video);
}
