package com.daaw;

import android.graphics.Color;
import android.graphics.Paint;
import java.util.List;
/* loaded from: classes.dex */
public class s20 extends c {
    public Paint c = lv0.c().a();
    public float[] d = new float[3];
    public float e = 1.2f;

    @Override // com.daaw.bh
    public void a() {
        int size = this.b.size();
        float f = 2.0f;
        float width = this.a.g.getWidth() / 2.0f;
        ah ahVar = this.a;
        int i = ahVar.a;
        float f2 = ahVar.d;
        float f3 = ahVar.b;
        float f4 = ahVar.c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float f5 = i2;
            float f6 = i;
            float f7 = (f5 / (i - 1)) * f3;
            float max = Math.max(1.5f + f2, (i2 == 0 ? 0.0f : ((f5 - (f6 / f)) / f6) * this.e * f4) + f4);
            int min = Math.min(e(f7, max), i * 2);
            int i4 = 0;
            while (i4 < min) {
                float f8 = f4;
                double d = i4;
                Double.isNaN(d);
                int i5 = i2;
                double d2 = min;
                Double.isNaN(d2);
                Double.isNaN(d2);
                int i6 = min;
                int i7 = i4;
                double d3 = (i5 + 1) % 2;
                Double.isNaN(d3);
                double d4 = ((d * 6.283185307179586d) / d2) + ((3.141592653589793d / d2) * d3);
                double d5 = f7;
                double cos = Math.cos(d4);
                Double.isNaN(d5);
                float f9 = ((float) (cos * d5)) + width;
                double sin = Math.sin(d4);
                Double.isNaN(d5);
                float f10 = ((float) (d5 * sin)) + width;
                float[] fArr = this.d;
                fArr[0] = (float) ((d4 * 180.0d) / 3.141592653589793d);
                fArr[1] = f7 / f3;
                fArr[2] = this.a.f;
                this.c.setColor(Color.HSVToColor(fArr));
                this.c.setAlpha(f());
                this.a.g.drawCircle(f9, f10, max - f2, this.c);
                List<tg> list = this.b;
                if (i3 >= size) {
                    list.add(new tg(f9, f10, this.d));
                } else {
                    list.get(i3).f(f9, f10, this.d);
                }
                i3++;
                i4 = i7 + 1;
                i2 = i5;
                f4 = f8;
                min = i6;
            }
            i2++;
            f4 = f4;
            f = 2.0f;
        }
    }
}
