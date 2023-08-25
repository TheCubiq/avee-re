package com.daaw;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public class u71 {

    /* renamed from: a */
    public static final Pattern f28759a = Pattern.compile("[\\s,]*");

    /* renamed from: b */
    public static final RectF f28760b = new RectF();

    /* renamed from: c */
    public static final Matrix f28761c = new Matrix();

    /* renamed from: d */
    public static final Matrix f28762d = new Matrix();

    /* renamed from: a */
    public static float m8458a(float f, float f2, float f3, float f4) {
        return ((float) Math.toDegrees(Math.atan2(f, f2) - Math.atan2(f3, f4))) % 360.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if ("lhvcsqta".indexOf(java.lang.Character.toLowerCase(r4)) >= 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0194 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Path m8457b(String str) {
        char c;
        boolean z;
        float m7687d;
        float m7687d2;
        int length = str.length();
        uv0 uv0Var = new uv0(str, 0);
        uv0Var.m7682i();
        Path path = new Path();
        float f = 0.0f;
        char c2 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (true) {
            int i = uv0Var.f29560d;
            if (i >= length) {
                return path;
            }
            char charAt = str.charAt(i);
            if (charAt != '+' && charAt != '-') {
                switch (charAt) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        break;
                    default:
                        uv0Var.m7690a();
                        c2 = charAt;
                        c = c2;
                        break;
                }
                z = true;
                switch (c2) {
                    case 'A':
                    case p21.f22304P0 /* 97 */:
                        float m7687d3 = uv0Var.m7687d();
                        float m7687d4 = uv0Var.m7687d();
                        float m7687d5 = uv0Var.m7687d();
                        int m7688c = uv0Var.m7688c();
                        int m7688c2 = uv0Var.m7688c();
                        float m7687d6 = uv0Var.m7687d();
                        float m7687d7 = uv0Var.m7687d();
                        if (c2 == 'a') {
                            m7687d6 += f2;
                            m7687d7 += f3;
                        }
                        float f8 = m7687d6;
                        float f9 = m7687d7;
                        m8456c(path, f2, f3, f8, f9, m7687d3, m7687d4, m7687d5, m7688c, m7688c2);
                        f5 = f5;
                        f2 = f8;
                        f3 = f9;
                        f4 = f4;
                        z = false;
                        break;
                    case 'C':
                    case p21.f22316R0 /* 99 */:
                        float m7687d8 = uv0Var.m7687d();
                        float m7687d9 = uv0Var.m7687d();
                        float m7687d10 = uv0Var.m7687d();
                        float m7687d11 = uv0Var.m7687d();
                        float m7687d12 = uv0Var.m7687d();
                        float m7687d13 = uv0Var.m7687d();
                        if (c2 == 'c') {
                            m7687d8 += f2;
                            m7687d10 += f2;
                            m7687d12 += f2;
                            m7687d9 += f3;
                            m7687d11 += f3;
                            m7687d13 += f3;
                        }
                        float f10 = m7687d10;
                        float f11 = m7687d11;
                        path.cubicTo(m7687d8, m7687d9, f10, f11, m7687d12, m7687d13);
                        f2 = m7687d12;
                        f3 = m7687d13;
                        f7 = f11;
                        f6 = f10;
                        break;
                    case 'H':
                    case p21.f22346W0 /* 104 */:
                        float m7687d14 = uv0Var.m7687d();
                        if (c2 == 'h') {
                            path.rLineTo(m7687d14, f);
                            f2 += m7687d14;
                        } else {
                            path.lineTo(m7687d14, f3);
                            f2 = m7687d14;
                        }
                        z = false;
                        break;
                    case 'L':
                    case 'T':
                    case p21.f22364Z0 /* 108 */:
                    case x21.f31769C0 /* 116 */:
                        m7687d = uv0Var.m7687d();
                        m7687d2 = uv0Var.m7687d();
                        if (c2 == 'l') {
                            path.rLineTo(m7687d, m7687d2);
                            f2 += m7687d;
                            f3 += m7687d2;
                            z = false;
                            break;
                        } else {
                            path.lineTo(m7687d, m7687d2);
                            f2 = m7687d;
                            f3 = m7687d2;
                            z = false;
                        }
                    case 'M':
                    case 'm':
                        m7687d = uv0Var.m7687d();
                        m7687d2 = uv0Var.m7687d();
                        if (c2 == 'm') {
                            f5 += m7687d;
                            f4 += m7687d2;
                            path.rMoveTo(m7687d, m7687d2);
                            f2 += m7687d;
                            f3 += m7687d2;
                            z = false;
                            break;
                        } else {
                            path.moveTo(m7687d, m7687d2);
                            f2 = m7687d;
                            f5 = f2;
                            f3 = m7687d2;
                            f4 = f3;
                            z = false;
                        }
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        float m7687d15 = uv0Var.m7687d();
                        float m7687d16 = uv0Var.m7687d();
                        float m7687d17 = uv0Var.m7687d();
                        float m7687d18 = uv0Var.m7687d();
                        if (Character.isLowerCase(c2)) {
                            m7687d15 += f2;
                            m7687d17 += f2;
                            m7687d16 += f3;
                            m7687d18 += f3;
                        }
                        float f12 = m7687d15;
                        float f13 = m7687d16;
                        float f14 = m7687d17;
                        float f15 = m7687d18;
                        path.cubicTo((f2 * 2.0f) - f6, (f3 * 2.0f) - f7, f12, f13, f14, f15);
                        f6 = f12;
                        f7 = f13;
                        f2 = f14;
                        f3 = f15;
                        break;
                    case 'V':
                    case x21.f31779E0 /* 118 */:
                        float m7687d19 = uv0Var.m7687d();
                        if (c2 == 'v') {
                            path.rLineTo(f, m7687d19);
                            f3 += m7687d19;
                        } else {
                            path.lineTo(f2, m7687d19);
                            f3 = m7687d19;
                        }
                        z = false;
                        break;
                    case 'Z':
                    case x21.f31799I0 /* 122 */:
                        path.close();
                        path.moveTo(f5, f4);
                        f3 = f4;
                        f7 = f3;
                        f2 = f5;
                        f6 = f2;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid path command: ");
                        sb.append(c2);
                        uv0Var.m7690a();
                        z = false;
                        break;
                }
                if (z) {
                    f6 = f2;
                    f7 = f3;
                }
                uv0Var.m7682i();
                c2 = c;
                f = 0.0f;
            }
            if (c2 == 'm' || c2 == 'M') {
                c = c2;
                c2 = (char) (c2 - 1);
                z = true;
                switch (c2) {
                    case 'A':
                    case p21.f22304P0 /* 97 */:
                        break;
                    case 'C':
                    case p21.f22316R0 /* 99 */:
                        break;
                    case 'H':
                    case p21.f22346W0 /* 104 */:
                        break;
                    case 'L':
                    case 'T':
                    case p21.f22364Z0 /* 108 */:
                    case x21.f31769C0 /* 116 */:
                        break;
                    case 'M':
                    case 'm':
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        break;
                    case 'V':
                    case x21.f31779E0 /* 118 */:
                        break;
                    case 'Z':
                    case x21.f31799I0 /* 122 */:
                        break;
                }
                if (z) {
                }
                uv0Var.m7682i();
                c2 = c;
                f = 0.0f;
            }
        }
    }

    /* renamed from: c */
    public static void m8456c(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2) {
        if (f5 == 0.0f || f6 == 0.0f) {
            path.lineTo(f3, f4);
        } else if (f3 == f && f4 == f2) {
        } else {
            float abs = Math.abs(f5);
            float abs2 = Math.abs(f6);
            double d = (3.1415927f * f7) / 180.0f;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f8 = (f - f3) / 2.0f;
            float f9 = (f2 - f4) / 2.0f;
            float f10 = (cos * f8) + (sin * f9);
            float f11 = ((-sin) * f8) + (f9 * cos);
            float f12 = f10 * f10;
            float f13 = f11 * f11;
            float f14 = abs * abs;
            float f15 = abs2 * abs2;
            float f16 = ((f12 / f14) + (f13 / f15)) * 1.001f;
            if (f16 > 1.0f) {
                float sqrt = (float) Math.sqrt(f16);
                abs *= sqrt;
                abs2 *= sqrt;
                f14 = abs * abs;
                f15 = abs2 * abs2;
            }
            float f17 = f14 * f15;
            float f18 = f14 * f13;
            float f19 = f15 * f12;
            float sqrt2 = ((float) Math.sqrt(((f17 - f18) - f19) / (f18 + f19))) * (i == i2 ? -1 : 1);
            float f20 = ((sqrt2 * abs) * f11) / abs2;
            float f21 = (((-sqrt2) * abs2) * f10) / abs;
            float f22 = ((cos * f20) - (sin * f21)) + ((f + f3) / 2.0f);
            float f23 = (sin * f20) + (cos * f21) + ((f2 + f4) / 2.0f);
            float f24 = (f10 - f20) / abs;
            float f25 = (f11 - f21) / abs2;
            float m8458a = m8458a(1.0f, 0.0f, f24, f25);
            float m8458a2 = m8458a(f24, f25, ((-f10) - f20) / abs, ((-f11) - f21) / abs2);
            if (i2 == 0 && m8458a2 > 0.0f) {
                m8458a2 -= 360.0f;
            } else if (i2 != 0 && m8458a2 < 0.0f) {
                m8458a2 += 360.0f;
            }
            if (f7 % 360.0f == 0.0f) {
                RectF rectF = f28760b;
                rectF.set(f22 - abs, f23 - abs2, f22 + abs, f23 + abs2);
                path.arcTo(rectF, m8458a, m8458a2);
                return;
            }
            RectF rectF2 = f28760b;
            rectF2.set(-abs, -abs2, abs, abs2);
            Matrix matrix = f28761c;
            matrix.reset();
            matrix.postRotate(f7);
            matrix.postTranslate(f22, f23);
            Matrix matrix2 = f28762d;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.arcTo(rectF2, m8458a, m8458a2);
            path.transform(matrix);
        }
    }

    /* renamed from: d */
    public static Path m8455d(String str) {
        return m8457b(str);
    }
}
