package com.daaw.avee.comp.EqualizerUI;

import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.UtilsSerialize;
import java.util.Locale;
/* loaded from: classes.dex */
public class EQPreset {
    public static final EQPreset empty = new EQPreset("Unnamed", 0);
    public final String name;
    public Point[] points;

    public EQPreset(String str, int i) {
        this.name = str;
        this.points = new Point[i];
    }

    public void resize(int i) {
        this.points = new Point[i];
    }

    public static EQPreset clone(EQPreset eQPreset) {
        EQPreset eQPreset2 = new EQPreset(eQPreset.name, eQPreset.points.length);
        int i = 0;
        while (true) {
            Point[] pointArr = eQPreset.points;
            if (i >= pointArr.length) {
                return eQPreset2;
            }
            eQPreset2.points[i] = new Point(pointArr[i].freq, eQPreset.points[i].value);
            i++;
        }
    }

    public static EQPreset deserialize(String str) {
        String[] deserializeIterable = UtilsSerialize.deserializeIterable(";", str);
        EQPreset eQPreset = new EQPreset("Default", deserializeIterable.length);
        for (int i = 0; i < deserializeIterable.length; i++) {
            eQPreset.points[i] = Point.fromString(deserializeIterable[i]);
        }
        return eQPreset;
    }

    public static String serialize(EQPreset eQPreset) {
        return UtilsSerialize.serializeArray(";", eQPreset.points);
    }

    public void normalizeValues(float f) {
        for (Point point : this.points) {
            point.value /= f;
        }
    }

    /* loaded from: classes.dex */
    public static class Point {
        public float freq;
        public float value;

        public Point(float f, float f2) {
            this.freq = f;
            this.value = f2;
        }

        public String toString() {
            return String.format(Locale.US, "%.3f:%.3f", Float.valueOf(this.freq), Float.valueOf(this.value));
        }

        public static Point fromString(String str) {
            Point point = new Point(0.0f, 0.0f);
            int indexOf = str.indexOf(":");
            if (indexOf < 0) {
                return point;
            }
            point.freq = Utils.strToFloatSafe(str.substring(0, indexOf));
            point.value = Utils.strToFloatSafe(str.substring(indexOf + 1));
            return point;
        }
    }
}
