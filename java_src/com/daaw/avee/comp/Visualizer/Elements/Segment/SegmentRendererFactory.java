package com.daaw.avee.comp.Visualizer.Elements.Segment;

import com.daaw.avee.Common.tlog;
/* loaded from: classes.dex */
public class SegmentRendererFactory {
    public static final String typeNameNone = "None";
    public static final String[] typeNames = {"None", "Bars", "Line", SegmentRendererSharpBar.typeName, SegmentRendererRoundBar.typeName};

    public static ISegmentRenderer create(String str, ISegmentRenderer iSegmentRenderer) {
        if (getTypeName(iSegmentRenderer).equals(str)) {
            return iSegmentRenderer;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 2063072:
                if (str.equals("Bars")) {
                    c = 1;
                    break;
                }
                break;
            case 2368532:
                if (str.equals("Line")) {
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
            case 431547818:
                if (str.equals(SegmentRendererSharpBar.typeName)) {
                    c = 3;
                    break;
                }
                break;
            case 1998378318:
                if (str.equals(SegmentRendererRoundBar.typeName)) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c == 4) {
                            return new SegmentRendererRoundBar();
                        }
                        tlog.w("unknown typeName: " + str);
                        return iSegmentRenderer;
                    }
                    return new SegmentRendererSharpBar();
                }
                return new SegmentRendererLine();
            }
            return new SegmentRendererBar();
        }
        return null;
    }

    public static String getTypeName(ISegmentRenderer iSegmentRenderer) {
        if (iSegmentRenderer == null) {
            return "None";
        }
        if (iSegmentRenderer instanceof SegmentRendererBar) {
            return "Bars";
        }
        if (iSegmentRenderer instanceof SegmentRendererLine) {
            return "Line";
        }
        if (iSegmentRenderer instanceof SegmentRendererSharpBar) {
            return SegmentRendererSharpBar.typeName;
        }
        if (iSegmentRenderer instanceof SegmentRendererRoundBar) {
            return SegmentRendererRoundBar.typeName;
        }
        tlog.w("unknown instance type");
        return "unk";
    }
}
