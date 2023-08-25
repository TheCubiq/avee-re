package com.daaw;
/* loaded from: classes2.dex */
public final class to2 {

    /* renamed from: a */
    public final String f27916a;

    /* renamed from: b */
    public final String f27917b;

    /* renamed from: c */
    public final long f27918c;

    /* renamed from: d */
    public final long f27919d;

    /* renamed from: e */
    public final long f27920e;

    /* renamed from: f */
    public final long f27921f;

    /* renamed from: g */
    public final long f27922g;

    /* renamed from: h */
    public final Long f27923h;

    /* renamed from: i */
    public final Long f27924i;

    /* renamed from: j */
    public final Long f27925j;

    /* renamed from: k */
    public final Boolean f27926k;

    public to2(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        ry0.m10834f(str);
        ry0.m10834f(str2);
        ry0.m10839a(j >= 0);
        ry0.m10839a(j2 >= 0);
        ry0.m10839a(j3 >= 0);
        ry0.m10839a(j5 >= 0);
        this.f27916a = str;
        this.f27917b = str2;
        this.f27918c = j;
        this.f27919d = j2;
        this.f27920e = j3;
        this.f27921f = j4;
        this.f27922g = j5;
        this.f27923h = l;
        this.f27924i = l2;
        this.f27925j = l3;
        this.f27926k = bool;
    }

    /* renamed from: a */
    public final to2 m8906a(Long l, Long l2, Boolean bool) {
        return new to2(this.f27916a, this.f27917b, this.f27918c, this.f27919d, this.f27920e, this.f27921f, this.f27922g, this.f27923h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* renamed from: b */
    public final to2 m8905b(long j, long j2) {
        return new to2(this.f27916a, this.f27917b, this.f27918c, this.f27919d, this.f27920e, this.f27921f, j, Long.valueOf(j2), this.f27924i, this.f27925j, this.f27926k);
    }

    /* renamed from: c */
    public final to2 m8904c(long j) {
        return new to2(this.f27916a, this.f27917b, this.f27918c, this.f27919d, this.f27920e, j, this.f27922g, this.f27923h, this.f27924i, this.f27925j, this.f27926k);
    }
}
