package com.daaw.avee.comp.Visualizer;
/* loaded from: classes.dex */
public class FrameStats {
    public int frameResourcesLoadingCount = 0;
    public int fps = 0;
    public int fpsAcc = 0;
    public int statFlushCount = 0;
    public int statFlushCounter = 0;
    public int statResourceLoadCount = 0;
    public int statResourceLoadCounter = 0;
    public int statGradualResourceLoadCount = 0;
    public int statGradualResourceLoadCounter = 0;
    public int statRTSwitchCounter = 0;
    public int statRTSwitchCount = 0;

    public int getFrameResourcesLoadingCount() {
        return this.frameResourcesLoadingCount;
    }

    public int getFps() {
        return this.fps;
    }

    public int getStatFlushCount() {
        return this.statFlushCount;
    }

    public int getStatResourceLoadCount() {
        return this.statResourceLoadCount;
    }

    public int getStatGradualResourceLoadCount() {
        return this.statGradualResourceLoadCount;
    }

    public int getStatRTSwitchCount() {
        return this.statRTSwitchCount;
    }
}
