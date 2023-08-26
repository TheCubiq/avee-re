package com.daaw.avee.comp.Visualizer.Elements.Base;

import android.text.TextUtils;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.comp.Common.MeasureDefs;
import com.daaw.avee.comp.Visualizer.Meter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class MVariableFloat {
    private final List<MeasuredVar> measures;
    private float tmpResult;

    public static final MVariableFloat AsNothing() {
        return new MVariableFloat(MeasuredVar.AsNothing());
    }

    public static MVariableFloat CreateConstantFloat(float f) {
        return new MVariableFloat(new MeasuredVar(MeasureDefs.Constant, f));
    }

    public static MVariableFloat CreateConstantVec2f(float f, float f2) {
        return new MVariableFloat(new MeasuredVar(MeasureDefs.Constant, f, f2));
    }

    public MVariableFloat(MeasuredVar measuredVar) {
        this.tmpResult = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.measures = arrayList;
        arrayList.add(measuredVar);
    }

    public MVariableFloat(MVariableFloat mVariableFloat, int i, int i2) {
        this.tmpResult = 0.0f;
        this.measures = new ArrayList(i2);
        int i3 = 0;
        while (i < mVariableFloat.measures.size() && i2 > i3) {
            i3++;
            this.measures.add(new MeasuredVar(mVariableFloat.measures.get(i)));
            i++;
        }
    }

    public MVariableFloat(MVariableFloat mVariableFloat, MeasuredVar measuredVar) {
        this.tmpResult = 0.0f;
        this.measures = new ArrayList(mVariableFloat.measures.size() + 1);
        for (int i = 0; i < mVariableFloat.measures.size(); i++) {
            this.measures.add(new MeasuredVar(mVariableFloat.measures.get(i)));
        }
        this.measures.add(new MeasuredVar(measuredVar));
    }

    public MVariableFloat(MVariableFloat mVariableFloat) {
        this.tmpResult = 0.0f;
        this.measures = new ArrayList(mVariableFloat.measures.size());
        for (int i = 0; i < mVariableFloat.measures.size(); i++) {
            this.measures.add(new MeasuredVar(mVariableFloat.measures.get(i)));
        }
    }

    public MVariableFloat() {
        this.tmpResult = 0.0f;
        this.measures = new ArrayList();
    }

    private MVariableFloat(List<MeasuredVar> list) {
        this.tmpResult = 0.0f;
        this.measures = list;
    }

    public String toString() {
        if (this.measures.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            this.measures.get(i).toString(sb);
            i++;
            if (i < this.measures.size()) {
                sb.append(";");
            } else {
                return sb.toString();
            }
        }
    }

    public String getDisplayString1d() {
        StringBuilder sb = new StringBuilder();
        if (this.measures.size() > 1) {
            int i = 0;
            while (true) {
                this.measures.get(i).toDisplayString1d(sb, false);
                i++;
                if (i >= this.measures.size()) {
                    break;
                }
                sb.append("+");
            }
        } else if (this.measures.size() == 1) {
            this.measures.get(0).toDisplayString1d(sb, true);
        }
        return sb.toString();
    }

    public String getDisplayString() {
        StringBuilder sb = new StringBuilder();
        if (this.measures.size() > 1) {
            int i = 0;
            while (true) {
                this.measures.get(i).toDisplayString(sb, false);
                i++;
                if (i >= this.measures.size()) {
                    break;
                }
                sb.append("+");
            }
        } else if (this.measures.size() == 1) {
            this.measures.get(0).toDisplayString(sb, true);
        }
        return sb.toString();
    }

    public float getDisplayValueX() {
        float f = 0.0f;
        if (this.measures.size() > 1) {
            for (int i = 0; i < this.measures.size(); i++) {
                f += this.measures.get(i).getMeasureArgF();
            }
            return f / this.measures.size();
        } else if (this.measures.size() == 1) {
            return this.measures.get(0).getMeasureArgF();
        } else {
            return 0.0f;
        }
    }

    public static MVariableFloat FromString(String str, MVariableFloat mVariableFloat) {
        String[] split = TextUtils.split(str, ";");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            MeasuredVar FromString = MeasuredVar.FromString(str2, null);
            if (FromString != null) {
                arrayList.add(FromString);
            }
        }
        return arrayList.size() <= 0 ? mVariableFloat : new MVariableFloat(arrayList);
    }

    public int getMeasuredVarCount() {
        return this.measures.size();
    }

    public void setMeasuredVar(int i, MeasuredVar measuredVar) {
        this.measures.set(i, measuredVar);
    }

    public MeasuredVar getMeasuredVar(int i) {
        return this.measures.get(i);
    }

    public float getValueAsFloat(Meter meter, float f) {
        this.tmpResult = 0.0f;
        for (int i = 0; i < this.measures.size(); i++) {
            this.tmpResult += this.measures.get(i).measure(meter, f);
        }
        return this.tmpResult;
    }

    public float getValueAsFloat(Meter meter) {
        this.tmpResult = 0.0f;
        for (int i = 0; i < this.measures.size(); i++) {
            this.tmpResult += this.measures.get(i).measure(meter);
        }
        return this.tmpResult;
    }

    public Vec2f getValueAsVec2f(Meter meter, Vec2f vec2f) {
        vec2f.x = 0.0f;
        vec2f.y = 0.0f;
        for (int i = 0; i < this.measures.size(); i++) {
            Vec2f measureVec2f = this.measures.get(i).measureVec2f(meter);
            vec2f.x += measureVec2f.x;
            vec2f.y += measureVec2f.y;
        }
        return vec2f;
    }
}
