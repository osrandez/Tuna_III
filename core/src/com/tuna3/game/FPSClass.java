package com.tuna3.game;

import com.badlogic.gdx.utils.TimeUtils;

public class FPSClass {
    private static long lastFPSCountTime = TimeUtils.nanoTime();
    private static int FPSCount = 0;
    private static int secondFPSCount = FPSCount;

    public static int getFPS(){
        if(TimeUtils.nanoTime() - lastFPSCountTime >1000000000){
            secondFPSCount = FPSCount;
            lastFPSCountTime = TimeUtils.nanoTime();
            FPSCount = 0;
        }
        FPSCount++;
        return secondFPSCount;
    }
}
