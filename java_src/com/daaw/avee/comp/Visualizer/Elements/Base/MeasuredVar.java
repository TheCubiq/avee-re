package com.daaw.avee.comp.Visualizer.Elements.Base;

import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.comp.Common.MeasureDefs;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Meter;
import java.util.Locale;
/* loaded from: classes.dex */
public class MeasuredVar {
    private String measure;
    private Vec2f measureArg = new Vec2f(0.0f, 0.0f);
    private Vec2f lastMeasured = new Vec2f(0.0f, 0.0f);

    public static final MeasuredVar AsNothing() {
        return new MeasuredVar(MeasureDefs.Nothing, 0.5f, 0.5f);
    }

    public MeasuredVar(MeasuredVar measuredVar) {
        this.measure = measuredVar.measure;
        this.measureArg.x = measuredVar.measureArg.x;
        this.measureArg.y = measuredVar.measureArg.y;
        Validate();
    }

    public MeasuredVar(String str, float f) {
        this.measure = str;
        this.measureArg.x = f;
        this.measureArg.y = f;
        Validate();
    }

    public MeasuredVar(String str, Vec2f vec2f) {
        this.measure = str;
        this.measureArg.x = vec2f.x;
        this.measureArg.y = vec2f.y;
        Validate();
    }

    public MeasuredVar(String str, float f, float f2) {
        this.measure = str;
        this.measureArg.x = f;
        this.measureArg.y = f2;
        Validate();
    }

    private void Validate() {
        String str = this.measure;
        if (str == null || str.length() < 1) {
            this.measure = "";
        }
    }

    /* renamed from: clone */
    public MeasuredVar m7clone() {
        return new MeasuredVar(this.measure, this.measureArg.x, this.measureArg.y);
    }

    public String toString() {
        return String.format(Locale.US, "%s %f %f", this.measure, Float.valueOf(this.measureArg.x), Float.valueOf(this.measureArg.y));
    }

    public void toString(StringBuilder sb) {
        sb.append(this.measure);
        sb.append(" ");
        sb.append(this.measureArg.x);
        sb.append(" ");
        sb.append(this.measureArg.y);
    }

    public void toDisplayString1d(StringBuilder sb, boolean z) {
        boolean hintArgBisUsedFor1d = MeasureDefs.getHintArgBisUsedFor1d(this.measure);
        if (!MeasureDefs.Constant.equals(this.measure) && !MeasureDefs.Nothing.equals(this.measure)) {
            sb.append(this.measure);
            sb.append("(");
            sb.append(String.format(Locale.US, "%.3f", Float.valueOf(this.measureArg.x)));
            if (hintArgBisUsedFor1d) {
                sb.append(" ");
                sb.append(String.format(Locale.US, "%.3f", Float.valueOf(this.measureArg.y)));
            }
            sb.append(")");
        } else if (z) {
            sb.append(String.format(Locale.US, "%.3f", Float.valueOf(this.measureArg.x)));
            if (hintArgBisUsedFor1d) {
                sb.append(" ");
                sb.append(String.format(Locale.US, "%.3f", Float.valueOf(this.measureArg.y)));
            }
        } else {
            sb.append("(");
            sb.append(String.format(Locale.US, "%.3f", Float.valueOf(this.measureArg.x)));
            if (hintArgBisUsedFor1d) {
                sb.append(" ");
                sb.append(String.format(Locale.US, "%.3f", Float.valueOf(this.measureArg.y)));
            }
            sb.append(")");
        }
    }

    public void toDisplayString(StringBuilder sb, boolean z) {
        if (!MeasureDefs.Constant.equals(this.measure) && !MeasureDefs.Nothing.equals(this.measure)) {
            sb.append(this.measure);
            sb.append("(");
            sb.append(String.format(Locale.US, "%.3f", Float.valueOf(this.measureArg.x)));
            sb.append(" ");
            sb.append(String.format(Locale.US, "%.3f", Float.valueOf(this.measureArg.y)));
            sb.append(")");
        } else if (z) {
            sb.append(String.format(Locale.US, "%.3f", Float.valueOf(this.measureArg.x)));
            sb.append(" ");
            sb.append(String.format(Locale.US, "%.3f", Float.valueOf(this.measureArg.y)));
        } else {
            sb.append("(");
            sb.append(String.format(Locale.US, "%.3f", Float.valueOf(this.measureArg.x)));
            sb.append(" ");
            sb.append(String.format(Locale.US, "%.3f", Float.valueOf(this.measureArg.y)));
            sb.append(")");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        return r6.clone();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MeasuredVar FromString(String str, MeasuredVar measuredVar) {
        if (str == null) {
            if (measuredVar != null) {
                return measuredVar.m7clone();
            }
            return null;
        }
        try {
            int indexOf = str.indexOf(" ");
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(" ", i);
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new MeasuredVar(str.substring(0, indexOf), Float.parseFloat(str.substring(i, indexOf2)), Float.parseFloat(str.substring(indexOf2 + 1)));
            }
            return null;
        } catch (NumberFormatException unused) {
            if (measuredVar != null) {
                return measuredVar.m7clone();
            }
            return null;
        }
    }

    public String getMeasure() {
        return this.measure;
    }

    public float getMeasureArgF() {
        return this.measureArg.x;
    }

    public Vec2f getMeasureArgVec2f() {
        return this.measureArg;
    }

    public float measure(Meter meter) {
        Vec2f measureVec2f = meter.measureVec2f(this.measure, this.measureArg, this.lastMeasured);
        this.lastMeasured = measureVec2f;
        return measureVec2f.x;
    }

    public float measure(Meter meter, float f) {
        this.lastMeasured.x = f;
        this.lastMeasured.y = f;
        Vec2f measureVec2f = meter.measureVec2f(this.measure, this.measureArg, this.lastMeasured);
        this.lastMeasured = measureVec2f;
        return measureVec2f.x;
    }

    public Vec2f measureVec2f(Meter meter) {
        Vec2f measureVec2f = meter.measureVec2f(this.measure, this.measureArg, this.lastMeasured);
        this.lastMeasured = measureVec2f;
        return measureVec2f;
    }

    public Vec2f measureVec2fMaxValue(Meter meter) {
        return new Vec2f(1.0f, 1.0f);
    }

    public String measureText(Meter meter) {
        return meter.measureText(this.measure);
    }

    public void onApplyCustomization(CustomPropertiesList customPropertiesList, String str, float f) {
        onApplyCustomization(customPropertiesList, str, f, f);
    }

    public void onApplyCustomization(CustomPropertiesList customPropertiesList, String str, float f, float f2) {
        if (customPropertiesList == null) {
            return;
        }
        this.measure = customPropertiesList.getChild("measureWhat").getTypeName(str);
        this.measureArg.x = customPropertiesList.getPropertyFloat("A", f);
        this.measureArg.y = customPropertiesList.getPropertyFloat("B", f2);
        Validate();
    }

    public void onReadCustomizationPos(CustomPropertiesList customPropertiesList) {
        customPropertiesList.putEmptyChild("measureWhat", this.measure, "misc", new String[]{MeasureDefs.Nothing, MeasureDefs.beatCamShakeMore, MeasureDefs.beatCamShakeLess, MeasureDefs.beatRandomShake, MeasureDefs.constantCamShakeMore, MeasureDefs.constantCamShakeLess, MeasureDefs.trackPosition});
        if (this.measure.equals(MeasureDefs.Nothing)) {
            return;
        }
        customPropertiesList.putPropertyFloatAsRange("A", this.measureArg.x, "misc", 0.0f, 2.0f, MeasureDefs.getHintArgA(this.measure));
        customPropertiesList.putPropertyFloatAsRange("B", this.measureArg.y, "misc", 0.0f, 2.0f, MeasureDefs.getHintArgB(this.measure));
    }

    public void onReadCustomizationSpeed(CustomPropertiesList customPropertiesList) {
        customPropertiesList.putEmptyChild("measureWhat", this.measure, "misc", MeasureDefs.measures1d);
        if (this.measure.equals(MeasureDefs.Nothing)) {
            return;
        }
        customPropertiesList.putPropertyFloatAsRange("A", this.measureArg.x, "misc", 0.0f, 2.0f, MeasureDefs.getHintArgA(this.measure));
        customPropertiesList.putPropertyFloatAsRange("B", this.measureArg.y, "misc", 0.0f, 2.0f, MeasureDefs.getHintArgB(this.measure));
    }

    public void onReadCustomizationScale(CustomPropertiesList customPropertiesList) {
        customPropertiesList.putEmptyChild("measureWhat", this.measure, "misc", MeasureDefs.measures1d);
        if (this.measure.equals(MeasureDefs.Nothing)) {
            return;
        }
        customPropertiesList.putPropertyFloatAsRange("A", this.measureArg.x, "misc", -1.0f, 1.0f, MeasureDefs.getHintArgA(this.measure));
        customPropertiesList.putPropertyFloatAsRange("B", this.measureArg.y, "misc", -1.0f, 1.0f, MeasureDefs.getHintArgB(this.measure));
    }

    public void onReadCustomization1D(CustomPropertiesList customPropertiesList) {
        customPropertiesList.putEmptyChild("measureWhat", this.measure, "misc", MeasureDefs.measures1d);
        if (this.measure.equals(MeasureDefs.Nothing)) {
            return;
        }
        customPropertiesList.putPropertyFloatAsRange("A", this.measureArg.x, "misc", 0.0f, 1.0f, MeasureDefs.getHintArgA(this.measure));
        customPropertiesList.putPropertyFloatAsRange("B", this.measureArg.y, "misc", 0.0f, 1.0f, MeasureDefs.getHintArgB(this.measure));
    }
}
