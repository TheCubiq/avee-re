package com.daaw.avee.comp.Visualizer.Path;

import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.Vec4f;
import java.util.List;
/* loaded from: classes.dex */
public class SegmentContour {
    Vec4f[] segments;

    public SegmentContour(List<Vec4f> list) {
        this.segments = new Vec4f[list.size()];
        int i = 0;
        while (true) {
            Vec4f[] vec4fArr = this.segments;
            if (i >= vec4fArr.length) {
                return;
            }
            vec4fArr[i] = list.get(i);
            i++;
        }
    }

    public float getLength() {
        float f = 0.0f;
        int i = 0;
        while (true) {
            Vec4f[] vec4fArr = this.segments;
            if (i >= vec4fArr.length) {
                return f;
            }
            Vec4f vec4f = vec4fArr[i];
            f += Vec2f.length(vec4f.x1 - vec4f.x2, vec4f.y1 - vec4f.y2);
            i++;
        }
    }

    public boolean getPosTan(float f, float[] fArr, float[] fArr2) {
        if ((fArr != null && fArr.length < 2) || (fArr2 != null && fArr2.length < 2)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        float f2 = 0.0f;
        int i = 0;
        while (true) {
            Vec4f[] vec4fArr = this.segments;
            if (i >= vec4fArr.length) {
                return true;
            }
            Vec4f vec4f = vec4fArr[i];
            Vec2f vec2f = new Vec2f(vec4f.x2 - vec4f.x1, vec4f.y2 - vec4f.y1);
            float length = Vec2f.length(vec2f.x, vec2f.y) + f2;
            if (f < length) {
                float f3 = f - f2;
                vec2f.normalize();
                fArr2[0] = vec2f.x;
                fArr2[1] = vec2f.y;
                fArr[0] = vec4f.x1 + (vec2f.x * f3);
                fArr[1] = vec4f.y1 + (vec2f.y * f3);
                return true;
            }
            i++;
            f2 = length;
        }
    }
}
