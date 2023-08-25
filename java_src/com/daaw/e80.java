package com.daaw;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class e80 {

    /* renamed from: com.daaw.e80$a */
    /* loaded from: classes.dex */
    public static final class C1169a {

        /* renamed from: a */
        public final int[] f8250a;

        /* renamed from: b */
        public final float[] f8251b;

        public C1169a(int i, int i2) {
            this.f8250a = new int[]{i, i2};
            this.f8251b = new float[]{0.0f, 1.0f};
        }

        public C1169a(int i, int i2, int i3) {
            this.f8250a = new int[]{i, i2, i3};
            this.f8251b = new float[]{0.0f, 0.5f, 1.0f};
        }

        public C1169a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f8250a = new int[size];
            this.f8251b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f8250a[i] = list.get(i).intValue();
                this.f8251b[i] = list2.get(i).floatValue();
            }
        }
    }

    /* renamed from: a */
    public static C1169a m23670a(C1169a c1169a, int i, int i2, boolean z, int i3) {
        return c1169a != null ? c1169a : z ? new C1169a(i, i3, i2) : new C1169a(i, i2);
    }

    /* renamed from: b */
    public static Shader m23669b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray m10117k = so1.m10117k(resources, theme, attributeSet, r21.f24743A);
        float m10122f = so1.m10122f(m10117k, xmlPullParser, "startX", r21.f24752J, 0.0f);
        float m10122f2 = so1.m10122f(m10117k, xmlPullParser, "startY", r21.f24753K, 0.0f);
        float m10122f3 = so1.m10122f(m10117k, xmlPullParser, "endX", r21.f24754L, 0.0f);
        float m10122f4 = so1.m10122f(m10117k, xmlPullParser, "endY", r21.f24755M, 0.0f);
        float m10122f5 = so1.m10122f(m10117k, xmlPullParser, "centerX", r21.f24747E, 0.0f);
        float m10122f6 = so1.m10122f(m10117k, xmlPullParser, "centerY", r21.f24748F, 0.0f);
        int m10121g = so1.m10121g(m10117k, xmlPullParser, "type", r21.f24746D, 0);
        int m10126b = so1.m10126b(m10117k, xmlPullParser, "startColor", r21.f24744B, 0);
        boolean m10118j = so1.m10118j(xmlPullParser, "centerColor");
        int m10126b2 = so1.m10126b(m10117k, xmlPullParser, "centerColor", r21.f24751I, 0);
        int m10126b3 = so1.m10126b(m10117k, xmlPullParser, "endColor", r21.f24745C, 0);
        int m10121g2 = so1.m10121g(m10117k, xmlPullParser, "tileMode", r21.f24750H, 0);
        float m10122f7 = so1.m10122f(m10117k, xmlPullParser, "gradientRadius", r21.f24749G, 0.0f);
        m10117k.recycle();
        C1169a m23670a = m23670a(m23668c(resources, xmlPullParser, attributeSet, theme), m10126b, m10126b3, m10118j, m10126b2);
        if (m10121g != 1) {
            return m10121g != 2 ? new LinearGradient(m10122f, m10122f2, m10122f3, m10122f4, m23670a.f8250a, m23670a.f8251b, m23667d(m10121g2)) : new SweepGradient(m10122f5, m10122f6, m23670a.f8250a, m23670a.f8251b);
        } else if (m10122f7 > 0.0f) {
            return new RadialGradient(m10122f5, m10122f6, m10122f7, m23670a.f8250a, m23670a.f8251b, m23667d(m10121g2));
        } else {
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1169a m23668c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray m10117k = so1.m10117k(resources, theme, attributeSet, r21.f24756N);
                int i = r21.f24757O;
                boolean hasValue = m10117k.hasValue(i);
                int i2 = r21.f24758P;
                boolean hasValue2 = m10117k.hasValue(i2);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color = m10117k.getColor(i, 0);
                float f = m10117k.getFloat(i2, 0.0f);
                m10117k.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f));
            }
        }
        if (arrayList2.size() > 0) {
            return new C1169a(arrayList2, arrayList);
        }
        return null;
    }

    /* renamed from: d */
    public static Shader.TileMode m23667d(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
