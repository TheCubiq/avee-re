package com.daaw;

import android.net.Uri;
/* loaded from: classes.dex */
public final class i54 {

    /* renamed from: o */
    public static final Object f13263o = new Object();

    /* renamed from: p */
    public static final Object f13264p = new Object();

    /* renamed from: q */
    public static final f53 f13265q;

    /* renamed from: r */
    public static final th8 f13266r;

    /* renamed from: a */
    public Object f13267a = f13263o;

    /* renamed from: b */
    public f53 f13268b = f13265q;

    /* renamed from: c */
    public long f13269c;

    /* renamed from: d */
    public long f13270d;

    /* renamed from: e */
    public long f13271e;

    /* renamed from: f */
    public boolean f13272f;

    /* renamed from: g */
    public boolean f13273g;
    @Deprecated

    /* renamed from: h */
    public boolean f13274h;

    /* renamed from: i */
    public ht2 f13275i;

    /* renamed from: j */
    public boolean f13276j;

    /* renamed from: k */
    public long f13277k;

    /* renamed from: l */
    public long f13278l;

    /* renamed from: m */
    public int f13279m;

    /* renamed from: n */
    public int f13280n;

    static {
        ee2 ee2Var = new ee2();
        ee2Var.m23540a("androidx.media3.common.Timeline");
        ee2Var.m23539b(Uri.EMPTY);
        f13265q = ee2Var.m23538c();
        f13266r = new th8() { // from class: com.daaw.f44
        };
    }

    /* renamed from: a */
    public final i54 m20120a(Object obj, f53 f53Var, Object obj2, long j, long j2, long j3, boolean z, boolean z2, ht2 ht2Var, long j4, long j5, int i, int i2, long j6) {
        this.f13267a = obj;
        this.f13268b = f53Var != null ? f53Var : f13265q;
        this.f13269c = -9223372036854775807L;
        this.f13270d = -9223372036854775807L;
        this.f13271e = -9223372036854775807L;
        this.f13272f = z;
        this.f13273g = z2;
        this.f13274h = ht2Var != null;
        this.f13275i = ht2Var;
        this.f13277k = 0L;
        this.f13278l = j5;
        this.f13279m = 0;
        this.f13280n = 0;
        this.f13276j = false;
        return this;
    }

    /* renamed from: b */
    public final boolean m20119b() {
        uo4.m7872f(this.f13274h == (this.f13275i != null));
        return this.f13275i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i54.class.equals(obj.getClass())) {
            i54 i54Var = (i54) obj;
            if (it5.m19376t(this.f13267a, i54Var.f13267a) && it5.m19376t(this.f13268b, i54Var.f13268b) && it5.m19376t(null, null) && it5.m19376t(this.f13275i, i54Var.f13275i) && this.f13269c == i54Var.f13269c && this.f13270d == i54Var.f13270d && this.f13271e == i54Var.f13271e && this.f13272f == i54Var.f13272f && this.f13273g == i54Var.f13273g && this.f13276j == i54Var.f13276j && this.f13278l == i54Var.f13278l && this.f13279m == i54Var.f13279m && this.f13280n == i54Var.f13280n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f13267a.hashCode() + 217) * 31) + this.f13268b.hashCode()) * 961;
        ht2 ht2Var = this.f13275i;
        int hashCode2 = ht2Var == null ? 0 : ht2Var.hashCode();
        long j = this.f13269c;
        long j2 = this.f13270d;
        long j3 = this.f13271e;
        boolean z = this.f13272f;
        boolean z2 = this.f13273g;
        boolean z3 = this.f13276j;
        long j4 = this.f13278l;
        return (((((((((((((((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 961) + ((int) ((j4 >>> 32) ^ j4))) * 31) + this.f13279m) * 31) + this.f13280n) * 31;
    }
}
