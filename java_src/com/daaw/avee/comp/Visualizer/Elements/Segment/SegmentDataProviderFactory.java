package com.daaw.avee.comp.Visualizer.Elements.Segment;

import com.daaw.avee.Common.tlog;
/* loaded from: classes.dex */
public class SegmentDataProviderFactory {
    public static final String typeNameNone = "None";
    public static final String[] typeNames = {SegmentAudioWaveformData.typeName, SegmentAudioSpectrumData.typeName, SegmentAudioSpectrumDataPhaseS.typeName};

    public static ISegmentDataProvider create(String str, ISegmentDataProvider iSegmentDataProvider) {
        if (getTypeName(iSegmentDataProvider, "None").equals(str)) {
            return iSegmentDataProvider;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2067891215:
                if (str.equals(SegmentAudioSpectrumData.typeName)) {
                    c = 2;
                    break;
                }
                break;
            case 2433880:
                if (str.equals("None")) {
                    c = 0;
                    break;
                }
                break;
            case 319881825:
                if (str.equals(SegmentAudioSpectrumDataPhaseS.typeName)) {
                    c = 3;
                    break;
                }
                break;
            case 668852061:
                if (str.equals(SegmentAudioWaveformData.typeName)) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c == 3) {
                        return new SegmentAudioSpectrumDataPhaseS();
                    }
                    tlog.w("unknown typeName: " + str);
                    return iSegmentDataProvider == null ? new SegmentAudioSpectrumDataPhaseS() : iSegmentDataProvider;
                }
                return new SegmentAudioSpectrumData();
            }
            return new SegmentAudioWaveformData();
        }
        return null;
    }

    public static String getTypeName(ISegmentDataProvider iSegmentDataProvider, String str) {
        if (iSegmentDataProvider == null) {
            return str;
        }
        if (iSegmentDataProvider instanceof SegmentAudioWaveformData) {
            return SegmentAudioWaveformData.typeName;
        }
        if (iSegmentDataProvider instanceof SegmentAudioSpectrumData) {
            return SegmentAudioSpectrumData.typeName;
        }
        if (iSegmentDataProvider instanceof SegmentAudioSpectrumDataPhaseS) {
            return SegmentAudioSpectrumDataPhaseS.typeName;
        }
        tlog.w("unknown instance type");
        return str;
    }
}
