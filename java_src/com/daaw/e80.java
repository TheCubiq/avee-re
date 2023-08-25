package com.daaw;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class e80 {

    /* loaded from: classes.dex */
    public static final class a {
        public final int[] a;
        public final float[] b;

        public a(int i, int i2) {
            this.a = new int[]{i, i2};
            this.b = new float[]{0.0f, 1.0f};
        }

        public a(int i, int i2, int i3) {
            this.a = new int[]{i, i2, i3};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }

        public a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; i++) {
                this.a[i] = list.get(i).intValue();
                this.b[i] = list2.get(i).floatValue();
            }
        }
    }

    public static a a(a aVar, int i, int i2, boolean z, int i3) {
        return aVar != null ? aVar : z ? new a(i, i3, i2) : new a(i, i2);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray k = so1.k(resources, theme, attributeSet, r21.A);
        float f = so1.f(k, xmlPullParser, "startX", r21.J, 0.0f);
        float f2 = so1.f(k, xmlPullParser, "startY", r21.K, 0.0f);
        float f3 = so1.f(k, xmlPullParser, "endX", r21.L, 0.0f);
        float f4 = so1.f(k, xmlPullParser, "endY", r21.M, 0.0f);
        float f5 = so1.f(k, xmlPullParser, "centerX", r21.E, 0.0f);
        float f6 = so1.f(k, xmlPullParser, "centerY", r21.F, 0.0f);
        int g = so1.g(k, xmlPullParser, "type", r21.D, 0);
        int b = so1.b(k, xmlPullParser, "startColor", r21.B, 0);
        boolean j = so1.j(xmlPullParser, "centerColor");
        int b2 = so1.b(k, xmlPullParser, "centerColor", r21.I, 0);
        int b3 = so1.b(k, xmlPullParser, "endColor", r21.C, 0);
        int g2 = so1.g(k, xmlPullParser, "tileMode", r21.H, 0);
        float f7 = so1.f(k, xmlPullParser, "gradientRadius", r21.G, 0.0f);
        k.recycle();
        a a2 = a(c(resources, xmlPullParser, attributeSet, theme), b, b3, j, b2);
        if (g != 1) {
            return g != 2 ? new LinearGradient(f, f2, f3, f4, a2.a, a2.b, d(g2)) : new SweepGradient(f5, f6, a2.a, a2.b);
        } else if (f7 > 0.0f) {
            return new RadialGradient(f5, f6, f7, a2.a, a2.b, d(g2));
        } else {
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.daaw.e80.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = com.daaw.r21.N
            android.content.res.TypedArray r3 = com.daaw.so1.k(r9, r12, r11, r3)
            int r5 = com.daaw.r21.O
            boolean r6 = r3.hasValue(r5)
            int r7 = com.daaw.r21.P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            com.daaw.e80$a r9 = new com.daaw.e80$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.e80.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):com.daaw.e80$a");
    }

    public static Shader.TileMode d(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
