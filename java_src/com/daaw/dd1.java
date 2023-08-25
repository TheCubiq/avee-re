package com.daaw;

import android.graphics.Color;
import android.graphics.Paint;
import java.util.List;
/* loaded from: classes.dex */
public class dd1 extends AbstractC0901c {

    /* renamed from: c */
    public Paint f6947c = lv0.m16490c().m16489a();

    /* renamed from: d */
    public float[] f6948d = new float[3];

    @Override // com.daaw.InterfaceC0841bh
    /* renamed from: a */
    public void mo10753a() {
        int size = this.f5307b.size();
        float width = this.f5306a.f3191g.getWidth() / 2.0f;
        C0627ah c0627ah = this.f5306a;
        int i = c0627ah.f3185a;
        float f = c0627ah.f3186b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = (i3 / (i - 1)) * f;
            float f3 = this.f5306a.f3187c;
            int m25711e = m25711e(f2, f3);
            int i4 = 0;
            while (i4 < m25711e) {
                double d = i4;
                Double.isNaN(d);
                double d2 = m25711e;
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
                float[] fArr = this.f6948d;
                fArr[0] = (float) ((d4 * 180.0d) / 3.141592653589793d);
                fArr[1] = f2 / f;
                fArr[2] = this.f5306a.f3190f;
                this.f6947c.setColor(Color.HSVToColor(fArr));
                this.f6947c.setAlpha(m25710f());
                C0627ah c0627ah2 = this.f5306a;
                c0627ah2.f3191g.drawCircle(f4, f5, f3 - c0627ah2.f3188d, this.f6947c);
                List<C3073tg> list = this.f5307b;
                if (i2 >= size) {
                    list.add(new C3073tg(f4, f5, this.f6948d));
                } else {
                    list.get(i2).m9187f(f4, f5, this.f6948d);
                }
                i2++;
                i4++;
                i = i5;
            }
        }
    }
}
