package com.daaw;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
/* loaded from: classes2.dex */
public class k91 {

    /* renamed from: B */
    public static float f15797B;

    /* renamed from: C */
    public static float f15798C;

    /* renamed from: a */
    public int f15803a;

    /* renamed from: b */
    public int f15804b;

    /* renamed from: c */
    public int f15805c;

    /* renamed from: d */
    public int f15806d;

    /* renamed from: e */
    public int f15807e;

    /* renamed from: f */
    public int f15808f;

    /* renamed from: g */
    public int f15809g;

    /* renamed from: h */
    public int f15810h;

    /* renamed from: i */
    public int f15811i;

    /* renamed from: j */
    public int f15812j;

    /* renamed from: k */
    public int f15813k;

    /* renamed from: l */
    public long f15814l;

    /* renamed from: m */
    public int f15815m;

    /* renamed from: n */
    public float f15816n;

    /* renamed from: o */
    public float f15817o;

    /* renamed from: p */
    public float f15818p;

    /* renamed from: q */
    public boolean f15819q;

    /* renamed from: r */
    public Interpolator f15820r;

    /* renamed from: s */
    public boolean f15821s;

    /* renamed from: t */
    public float f15822t;

    /* renamed from: u */
    public float f15823u;

    /* renamed from: v */
    public final float f15824v;

    /* renamed from: w */
    public static float f15799w = (float) (Math.log(0.75d) / Math.log(0.9d));

    /* renamed from: x */
    public static float f15800x = 800.0f;

    /* renamed from: y */
    public static float f15801y = 0.4f;

    /* renamed from: z */
    public static float f15802z = 1.0f - 0.4f;

    /* renamed from: A */
    public static final float[] f15796A = new float[p21.f22328T0];

    static {
        float f;
        float f2;
        float f3 = 0.0f;
        for (int i = 0; i <= 100; i++) {
            float f4 = i / 100.0f;
            float f5 = 1.0f;
            while (true) {
                float f6 = ((f5 - f3) / 2.0f) + f3;
                float f7 = 1.0f - f6;
                f = 3.0f * f6 * f7;
                f2 = f6 * f6 * f6;
                float f8 = (((f7 * f15801y) + (f15802z * f6)) * f) + f2;
                if (Math.abs(f8 - f4) < 1.0E-5d) {
                    break;
                } else if (f8 > f4) {
                    f5 = f6;
                } else {
                    f3 = f6;
                }
            }
            f15796A[i] = f + f2;
        }
        f15796A[100] = 1.0f;
        f15797B = 8.0f;
        f15798C = 1.0f;
        f15798C = 1.0f / m17938o(1.0f);
    }

    public k91(Context context, Interpolator interpolator) {
        this(context, interpolator, true);
    }

    public k91(Context context, Interpolator interpolator, boolean z) {
        this.f15819q = true;
        this.f15820r = interpolator;
        this.f15824v = context.getResources().getDisplayMetrics().density * 160.0f;
        this.f15823u = m17952a(ViewConfiguration.getScrollFriction());
        this.f15821s = z;
    }

    /* renamed from: o */
    public static float m17938o(float f) {
        float f2 = f * f15797B;
        return (f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : ((1.0f - ((float) Math.exp(1.0f - f2))) * 0.63212055f) + 0.36787945f) * f15798C;
    }

    /* renamed from: a */
    public final float m17952a(float f) {
        return this.f15824v * 386.0878f * f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
        if (r0 == r7.f15807e) goto L14;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m17951b() {
        if (this.f15819q) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f15814l);
        int i = this.f15815m;
        if (currentAnimationTimeMillis < i) {
            int i2 = this.f15803a;
            if (i2 == 0) {
                float f = currentAnimationTimeMillis * this.f15816n;
                Interpolator interpolator = this.f15820r;
                float m17938o = interpolator == null ? m17938o(f) : interpolator.getInterpolation(f);
                this.f15812j = this.f15804b + Math.round(this.f15817o * m17938o);
                this.f15813k = this.f15805c + Math.round(m17938o * this.f15818p);
            } else if (i2 == 1) {
                float f2 = currentAnimationTimeMillis / i;
                int i3 = (int) (f2 * 100.0f);
                float f3 = i3 / 100.0f;
                int i4 = i3 + 1;
                float[] fArr = f15796A;
                float f4 = fArr[i3];
                float f5 = f4 + (((f2 - f3) / ((i4 / 100.0f) - f3)) * (fArr[i4] - f4));
                int i5 = this.f15804b;
                int round = i5 + Math.round((this.f15806d - i5) * f5);
                this.f15812j = round;
                int min = Math.min(round, this.f15809g);
                this.f15812j = min;
                this.f15812j = Math.max(min, this.f15808f);
                int i6 = this.f15805c;
                int round2 = i6 + Math.round(f5 * (this.f15807e - i6));
                this.f15813k = round2;
                int min2 = Math.min(round2, this.f15811i);
                this.f15813k = min2;
                int max = Math.max(min2, this.f15810h);
                this.f15813k = max;
                if (this.f15812j == this.f15806d) {
                }
            }
            return true;
        }
        this.f15812j = this.f15806d;
        this.f15813k = this.f15807e;
        this.f15819q = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m17950c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        if (!this.f15821s || this.f15819q) {
            i9 = i3;
        } else {
            float m17948e = m17948e();
            float f = this.f15806d - this.f15804b;
            float f2 = this.f15807e - this.f15805c;
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            float f3 = (f / sqrt) * m17948e;
            float f4 = (f2 / sqrt) * m17948e;
            i9 = i3;
            float f5 = i9;
            if (Math.signum(f5) == Math.signum(f3)) {
                i10 = i4;
                float f6 = i10;
                if (Math.signum(f6) == Math.signum(f4)) {
                    i9 = (int) (f5 + f3);
                    i10 = (int) (f6 + f4);
                }
                this.f15803a = 1;
                this.f15819q = false;
                float sqrt2 = (float) Math.sqrt((i9 * i9) + (i10 * i10));
                this.f15822t = sqrt2;
                double log = Math.log((f15801y * sqrt2) / f15800x);
                double d = f15799w;
                Double.isNaN(d);
                this.f15815m = (int) (Math.exp(log / (d - 1.0d)) * 1000.0d);
                this.f15814l = AnimationUtils.currentAnimationTimeMillis();
                this.f15804b = i;
                this.f15805c = i2;
                float f7 = sqrt2 != 0.0f ? 1.0f : i9 / sqrt2;
                float f8 = sqrt2 != 0.0f ? i10 / sqrt2 : 1.0f;
                double d2 = f15800x;
                float f9 = f15799w;
                double d3 = f9;
                double d4 = f9;
                Double.isNaN(d4);
                Double.isNaN(d3);
                double exp = Math.exp((d3 / (d4 - 1.0d)) * log);
                Double.isNaN(d2);
                this.f15808f = i5;
                this.f15809g = i6;
                this.f15810h = i7;
                this.f15811i = i8;
                float f10 = (int) (d2 * exp);
                int round = i + Math.round(f7 * f10);
                this.f15806d = round;
                int min = Math.min(round, this.f15809g);
                this.f15806d = min;
                this.f15806d = Math.max(min, this.f15808f);
                int round2 = Math.round(f10 * f8) + i2;
                this.f15807e = round2;
                int min2 = Math.min(round2, this.f15811i);
                this.f15807e = min2;
                this.f15807e = Math.max(min2, this.f15810h);
            }
        }
        i10 = i4;
        this.f15803a = 1;
        this.f15819q = false;
        float sqrt22 = (float) Math.sqrt((i9 * i9) + (i10 * i10));
        this.f15822t = sqrt22;
        double log2 = Math.log((f15801y * sqrt22) / f15800x);
        double d5 = f15799w;
        Double.isNaN(d5);
        this.f15815m = (int) (Math.exp(log2 / (d5 - 1.0d)) * 1000.0d);
        this.f15814l = AnimationUtils.currentAnimationTimeMillis();
        this.f15804b = i;
        this.f15805c = i2;
        if (sqrt22 != 0.0f) {
        }
        if (sqrt22 != 0.0f) {
        }
        double d22 = f15800x;
        float f92 = f15799w;
        double d32 = f92;
        double d42 = f92;
        Double.isNaN(d42);
        Double.isNaN(d32);
        double exp2 = Math.exp((d32 / (d42 - 1.0d)) * log2);
        Double.isNaN(d22);
        this.f15808f = i5;
        this.f15809g = i6;
        this.f15810h = i7;
        this.f15811i = i8;
        float f102 = (int) (d22 * exp2);
        int round3 = i + Math.round(f7 * f102);
        this.f15806d = round3;
        int min3 = Math.min(round3, this.f15809g);
        this.f15806d = min3;
        this.f15806d = Math.max(min3, this.f15808f);
        int round22 = Math.round(f102 * f8) + i2;
        this.f15807e = round22;
        int min22 = Math.min(round22, this.f15811i);
        this.f15807e = min22;
        this.f15807e = Math.max(min22, this.f15810h);
    }

    /* renamed from: d */
    public final void m17949d(boolean z) {
        this.f15819q = z;
    }

    /* renamed from: e */
    public float m17948e() {
        return this.f15822t - ((this.f15823u * m17939n()) / 2000.0f);
    }

    /* renamed from: f */
    public final int m17947f() {
        return this.f15812j;
    }

    /* renamed from: g */
    public final int m17946g() {
        return this.f15813k;
    }

    /* renamed from: h */
    public final int m17945h() {
        return this.f15806d;
    }

    /* renamed from: i */
    public final int m17944i() {
        return this.f15807e;
    }

    /* renamed from: j */
    public final int m17943j() {
        return this.f15804b;
    }

    /* renamed from: k */
    public final int m17942k() {
        return this.f15805c;
    }

    /* renamed from: l */
    public final boolean m17941l() {
        return this.f15819q;
    }

    /* renamed from: m */
    public void m17940m(int i, int i2, int i3, int i4, int i5) {
        this.f15803a = 0;
        this.f15819q = false;
        this.f15815m = i5;
        this.f15814l = AnimationUtils.currentAnimationTimeMillis();
        this.f15804b = i;
        this.f15805c = i2;
        this.f15806d = i + i3;
        this.f15807e = i2 + i4;
        this.f15817o = i3;
        this.f15818p = i4;
        this.f15816n = 1.0f / this.f15815m;
    }

    /* renamed from: n */
    public int m17939n() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - this.f15814l);
    }
}
