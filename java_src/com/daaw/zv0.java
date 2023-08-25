package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class zv0 implements Interpolator {

    /* renamed from: a */
    public float[] f35561a;

    /* renamed from: b */
    public float[] f35562b;

    public zv0(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public zv0(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m10117k = so1.m10117k(resources, theme, attributeSet, C0567a3.f2735l);
        m1860d(m10117k, xmlPullParser);
        m10117k.recycle();
    }

    /* renamed from: a */
    public final void m1863a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m1862b(path);
    }

    /* renamed from: b */
    public final void m1862b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f35561a = new float[min];
        this.f35562b = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
            this.f35561a[i2] = fArr[0];
            this.f35562b[i2] = fArr[1];
        }
        if (Math.abs(this.f35561a[0]) <= 1.0E-5d && Math.abs(this.f35562b[0]) <= 1.0E-5d) {
            int i3 = min - 1;
            if (Math.abs(this.f35561a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f35562b[i3] - 1.0f) <= 1.0E-5d) {
                float f = 0.0f;
                int i4 = 0;
                while (i < min) {
                    float[] fArr2 = this.f35561a;
                    int i5 = i4 + 1;
                    float f2 = fArr2[i4];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                    }
                    fArr2[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f35561a[0]);
        sb.append(",");
        sb.append(this.f35562b[0]);
        sb.append(" end:");
        int i6 = min - 1;
        sb.append(this.f35561a[i6]);
        sb.append(",");
        sb.append(this.f35562b[i6]);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public final void m1861c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m1862b(path);
    }

    /* renamed from: d */
    public final void m1860d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (so1.m10118j(xmlPullParser, "pathData")) {
            String m10119i = so1.m10119i(typedArray, xmlPullParser, "pathData", 4);
            Path m25796e = bw0.m25796e(m10119i);
            if (m25796e != null) {
                m1862b(m25796e);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m10119i);
        } else if (!so1.m10118j(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else {
            if (!so1.m10118j(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            float m10122f = so1.m10122f(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float m10122f2 = so1.m10122f(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean m10118j = so1.m10118j(xmlPullParser, "controlX2");
            if (m10118j != so1.m10118j(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (m10118j) {
                m1863a(m10122f, m10122f2, so1.m10122f(typedArray, xmlPullParser, "controlX2", 2, 0.0f), so1.m10122f(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            } else {
                m1861c(m10122f, m10122f2);
            }
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f35561a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f35561a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f35561a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f35562b[i];
        }
        float[] fArr2 = this.f35562b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }
}
