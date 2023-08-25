package com.daaw;
/* loaded from: classes.dex */
public final class jz8 {

    /* renamed from: a */
    public final long f15560a;

    /* renamed from: b */
    public final long f15561b;

    /* renamed from: c */
    public final long f15562c;

    /* renamed from: d */
    public long f15563d = 0;

    /* renamed from: e */
    public long f15564e;

    /* renamed from: f */
    public long f15565f;

    /* renamed from: g */
    public long f15566g;

    /* renamed from: h */
    public long f15567h;

    public jz8(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f15560a = j;
        this.f15561b = j2;
        this.f15564e = j4;
        this.f15565f = j5;
        this.f15566g = j6;
        this.f15562c = j7;
        this.f15567h = m18118f(j2, 0L, j4, j5, j6, j7);
    }

    /* renamed from: f */
    public static long m18118f(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
        return it5.m19402b0(((j4 + j7) - j6) - (j7 / 20), j4, (-1) + j5);
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ void m18117g(jz8 jz8Var, long j, long j2) {
        jz8Var.f15564e = j;
        jz8Var.f15566g = j2;
        jz8Var.m18115i();
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ void m18116h(jz8 jz8Var, long j, long j2) {
        jz8Var.f15563d = j;
        jz8Var.f15565f = j2;
        jz8Var.m18115i();
    }

    /* renamed from: i */
    public final void m18115i() {
        this.f15567h = m18118f(this.f15561b, this.f15563d, this.f15564e, this.f15565f, this.f15566g, this.f15562c);
    }
}
