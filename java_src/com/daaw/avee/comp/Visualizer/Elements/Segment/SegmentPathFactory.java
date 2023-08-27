package com.daaw.avee.comp.Visualizer.Elements.Segment;

import com.daaw.avee.Common.tlog;
/* loaded from: classes.dex */
public class SegmentPathFactory {
    public static final String typeNameNone = "None";
    public static final String[] typeNames = {"HorizontalLine", SegmentPathCircle.typeName, SegmentPathSided.typeName, "Letter"};
    public static final String[] typeNamesCelebration = {"HorizontalLine", SegmentPathCircle.typeName, SegmentPathSided.typeName, "Letter", SegmentPathYear.typeName};
    public static final String[] typeNamesClosedAndNone = {"None", SegmentPathCircle.typeName, SegmentPathSided.typeName};

    public static ISegmentPath create(String str, ISegmentPath iSegmentPath) {
        if (getTypeName(iSegmentPath).equals(str)) {
            return iSegmentPath;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2022305722:
                if (str.equals("Letter")) {
                    c = 4;
                    break;
                }
                break;
            case 2433880:
                if (str.equals("None")) {
                    c = 0;
                    break;
                }
                break;
            case 2751581:
                if (str.equals(SegmentPathYear.typeName)) {
                    c = 5;
                    break;
                }
                break;
            case 1536319149:
                if (str.equals(SegmentPathSided.typeName)) {
                    c = 3;
                    break;
                }
                break;
            case 1802881624:
                if (str.equals("HorizontalLine")) {
                    c = 1;
                    break;
                }
                break;
            case 2018617584:
                if (str.equals(SegmentPathCircle.typeName)) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c == 5) {
                                return new SegmentPathYear();
                            }
                            tlog.w("unknown typeName: " + str);
                            return iSegmentPath;
                        }
                        return new SegmentPathLetter();
                    }
                    return new SegmentPathSided();
                }
                return new SegmentPathCircle();
            }
            return new SegmentPathHorizontalLine();
        }
        return null;
    }

    public static String getTypeName(ISegmentPath iSegmentPath) {
        if (iSegmentPath == null) {
            return "None";
        }
        if (iSegmentPath instanceof SegmentPathHorizontalLine) {
            return "HorizontalLine";
        }
        if (iSegmentPath instanceof SegmentPathCircle) {
            return SegmentPathCircle.typeName;
        }
        if (iSegmentPath instanceof SegmentPathSided) {
            return SegmentPathSided.typeName;
        }
        if (iSegmentPath instanceof SegmentPathLetter) {
            return "Letter";
        }
        if (iSegmentPath instanceof SegmentPathYear) {
            return SegmentPathYear.typeName;
        }
        tlog.w("unknown instance type");
        return "unk";
    }
}
