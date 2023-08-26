package com.daaw.avee.comp.Common;
/* loaded from: classes.dex */
public class MeasureDefs {
    public static final String textAlbum = "{Album}";
    public static final String textArtist = "{Artist}";
    public static final String textArtistAndTitle = "{ArtistAndTitle}";
    public static final String textArtistOrTitle = "{ArtistOrTitle}";
    public static final String textFps = "{Fps}";
    public static final String textFrameTime = "{FrameTime}";
    public static final String textGradualResLoad = "{GradualResLoad}";
    public static final String textMarkedArtistAndTitle = "{MarkedArtistAndTitle}";
    public static final String textRTSwitch = "{RTSwitch}";
    public static final String textResLoad = "{ResLoad}";
    public static final String textStatFlush = "{StatFlush}";
    public static final String textTimeCurrent = "{TimeCurrent}";
    public static final String textTimeLength = "{TimeLength}";
    public static final String textTimeRemaining = "{TimeRemaining}";
    public static final String textTitle = "{Title}";
    public static final String textWaitResLoad = "{WaitResLoad}";
    public static final String Constant = "Constant";
    public static final String beat = "Beat";
    public static final String totalTime = "TotalTime";
    public static final String totalTimeBackward = "TotalTimeBackward";
    public static final String totalTimeWhenPlaying = "TotalTimeWhenPlaying";
    public static final String totalTimeAndBeat = "TotalTimeAndBeat";
    public static final String trackPosition = "TrackPosition";
    public static final String beatRandomShake = "BeatRandomShake";
    public static final String beatCamShakeRotMore = "BeatCamShakeRotMore";
    public static final String beatCamShakeRotLess = "BeatCamShakeRotLess";
    public static final String constantCamShakeRotMore = "ConstantShakeRotMore";
    public static final String constantCamShakeRotLess = "ConstantShakeRotLess";
    public static final String peakBarIndex = "PeakBarIndex";
    public static final String beatTriggerAnim = "BeatTriggerAnim";
    public static final String[] measures1dMVar = {Constant, beat, totalTime, totalTimeBackward, totalTimeWhenPlaying, totalTimeAndBeat, trackPosition, beatRandomShake, beatCamShakeRotMore, beatCamShakeRotLess, constantCamShakeRotMore, constantCamShakeRotLess, peakBarIndex, beatTriggerAnim};
    public static final String beatCamShakeMore = "BeatCamShakeMore";
    public static final String beatCamShakeLess = "BeatCamShakeLess";
    public static final String constantCamShakeMore = "ConstantShakeMore";
    public static final String constantCamShakeLess = "ConstantShake";
    public static final String[] measures2dMVar = {Constant, beat, totalTime, totalTimeBackward, totalTimeWhenPlaying, totalTimeAndBeat, trackPosition, beatRandomShake, beatCamShakeMore, beatCamShakeLess, constantCamShakeMore, constantCamShakeLess};
    public static final String Nothing = "Nothing";
    public static final String[] measures1d = {Nothing, beat, totalTime, totalTimeBackward, totalTimeWhenPlaying, totalTimeAndBeat, trackPosition, beatRandomShake, beatCamShakeRotMore, beatCamShakeRotLess, constantCamShakeRotMore, constantCamShakeRotLess, beatTriggerAnim};
    public static final String isPlaying = "IsPlaying";
    public static final MeasureDef[] measures = {new MeasureDef(isPlaying, "", ""), new MeasureDef(Constant, "X", "Y"), new MeasureDef(Nothing, "X", "Y"), new MeasureDef(beat, "X Amount", "Y Amount"), new MeasureDef(totalTime, "X Speed", "Y Speed"), new MeasureDef(totalTimeBackward, "X Speed", "Y Speed"), new MeasureDef(totalTimeWhenPlaying, "X Speed", "Y Speed"), new MeasureDef(totalTimeAndBeat, "Speed", "Beat Amount", true), new MeasureDef(trackPosition, "Amount", "Amount"), new MeasureDef(beatRandomShake, "Amount", "Speed", true), new MeasureDef(beatCamShakeMore, "Amount", "Speed", true), new MeasureDef(beatCamShakeLess, "Amount", "Speed", true), new MeasureDef(beatCamShakeRotMore, "Amount", "Speed", true), new MeasureDef(beatCamShakeRotLess, "Amount", "Speed", true), new MeasureDef(constantCamShakeLess, "Amount", "Speed", true), new MeasureDef(constantCamShakeLess, "Amount", "Speed", true), new MeasureDef(constantCamShakeRotMore, "Amount", "Speed", true), new MeasureDef(constantCamShakeRotLess, "Amount", "Speed", true), new MeasureDef(peakBarIndex, "Amount", "Smoothness", true), new MeasureDef(beatTriggerAnim, "Threshold", "Speed", true)};

    /* loaded from: classes.dex */
    public static class MeasureDef {
        public final String argAHint;
        public final String argBHint;
        public boolean isBUsedFor1d;
        public final String name;

        public MeasureDef(String str, String str2, String str3) {
            this.name = str;
            this.argAHint = str2;
            this.argBHint = str3;
            this.isBUsedFor1d = false;
        }

        public MeasureDef(String str, String str2, String str3, boolean z) {
            this.name = str;
            this.argAHint = str2;
            this.argBHint = str3;
            this.isBUsedFor1d = z;
        }
    }

    public static MeasureDef getMeasureDefByName(String str) {
        int i = 0;
        while (true) {
            MeasureDef[] measureDefArr = measures;
            if (i >= measureDefArr.length) {
                return null;
            }
            if (measureDefArr[i].name.equals(str)) {
                return measures[i];
            }
            i++;
        }
    }

    public static String getHintArgA(String str) {
        MeasureDef measureDefByName = getMeasureDefByName(str);
        if (measureDefByName != null) {
            return measureDefByName.argAHint;
        }
        return null;
    }

    public static String getHintArgB(String str) {
        MeasureDef measureDefByName = getMeasureDefByName(str);
        if (measureDefByName != null) {
            return measureDefByName.argBHint;
        }
        return null;
    }

    public static boolean getHintArgBisUsedFor1d(String str) {
        MeasureDef measureDefByName = getMeasureDefByName(str);
        if (measureDefByName != null) {
            return measureDefByName.isBUsedFor1d;
        }
        return false;
    }
}
