package com.daaw;

import com.daaw.nl1;
/* loaded from: classes.dex */
public final class od1 extends nl1 {

    /* renamed from: k */
    public static final Object f21279k = new Object();

    /* renamed from: b */
    public final long f21280b;

    /* renamed from: c */
    public final long f21281c;

    /* renamed from: d */
    public final long f21282d;

    /* renamed from: e */
    public final long f21283e;

    /* renamed from: f */
    public final long f21284f;

    /* renamed from: g */
    public final long f21285g;

    /* renamed from: h */
    public final boolean f21286h;

    /* renamed from: i */
    public final boolean f21287i;

    /* renamed from: j */
    public final Object f21288j;

    public od1(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, Object obj) {
        this.f21280b = j;
        this.f21281c = j2;
        this.f21282d = j3;
        this.f21283e = j4;
        this.f21284f = j5;
        this.f21285g = j6;
        this.f21286h = z;
        this.f21287i = z2;
        this.f21288j = obj;
    }

    public od1(long j, long j2, long j3, long j4, boolean z, boolean z2, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj);
    }

    public od1(long j, boolean z, boolean z2, Object obj) {
        this(j, j, 0L, 0L, z, z2, obj);
    }

    @Override // com.daaw.nl1
    /* renamed from: b */
    public int mo14379b(Object obj) {
        return f21279k.equals(obj) ? 0 : -1;
    }

    @Override // com.daaw.nl1
    /* renamed from: g */
    public nl1.C2314b mo14378g(int i, nl1.C2314b c2314b, boolean z) {
        C2914s6.m10688c(i, 0, 1);
        return c2314b.m15057o(null, z ? f21279k : null, 0, this.f21282d, -this.f21284f);
    }

    @Override // com.daaw.nl1
    /* renamed from: h */
    public int mo14377h() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r1 > r6) goto L10;
     */
    @Override // com.daaw.nl1
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nl1.C2315c mo14376m(int i, nl1.C2315c c2315c, boolean z, long j) {
        long j2;
        C2914s6.m10688c(i, 0, 1);
        Object obj = z ? this.f21288j : null;
        long j3 = this.f21285g;
        boolean z2 = this.f21287i;
        if (z2 && j != 0) {
            long j4 = this.f21283e;
            if (j4 != -9223372036854775807L) {
                j3 += j;
            }
            j2 = -9223372036854775807L;
            return c2315c.m15051e(obj, this.f21280b, this.f21281c, this.f21286h, z2, j2, this.f21283e, 0, 0, this.f21284f);
        }
        j2 = j3;
        return c2315c.m15051e(obj, this.f21280b, this.f21281c, this.f21286h, z2, j2, this.f21283e, 0, 0, this.f21284f);
    }

    @Override // com.daaw.nl1
    /* renamed from: n */
    public int mo14375n() {
        return 1;
    }
}
