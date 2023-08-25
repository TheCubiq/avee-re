package com.daaw;

import android.graphics.Color;
import android.graphics.Paint;
import java.util.List;
/* loaded from: classes.dex */
public class dd1 extends c {
    public Paint c = lv0.c().a();
    public float[] d = new float[3];

    @Override // com.daaw.bh
    public void a() {
        int size = this.b.size();
        float width = this.a.g.getWidth() / 2.0f;
        ah ahVar = this.a;
        int i = ahVar.a;
        float f = ahVar.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = (i3 / (i - 1)) * f;
            float f3 = this.a.c;
            int e = e(f2, f3);
            int i4 = 0;
            while (i4 < e) {
                double d = i4;
                Double.isNaN(d);
                double d2 = e;
                Double.isNaN(d2);
                Double.isNaN(d2);
                int i5 = i;
                double d3 = (i3 + 1) % 2;
                Double.isNaN(d3);
                double d4 = ((d * 6.283185307179586d) / d2) + ((3.141592653589793d / d2) * d3);
                double d5 = f2;
                double cos = Math.cos(d4);
                Double.isNaN(d5);
                float f4 = ((float) (cos * d5)) + width;
                double sin = Math.sin(d4);
                Double.isNaN(d5);
                float f5 = ((float) (d5 * sin)) + width;
                float[] fArr = this.d;
                fArr[0] = (float) ((d4 * 180.0d) / 3.141592653589793d);
                fArr[1] = f2 / f;
                fArr[2] = this.a.f;
                this.c.setColor(Color.HSVToColor(fArr));
                this.c.setAlpha(f());
                ah ahVar2 = this.a;
                ahVar2.g.drawCircle(f4, f5, f3 - ahVar2.d, this.c);
                List<tg> list = this.b;
                if (i2 >= size) {
                    list.add(new tg(f4, f5, this.d));
                } else {
                    list.get(i2).f(f4, f5, this.d);
                }
                i2++;
                i4++;
                i = i5;
            }
        }
    }
}
