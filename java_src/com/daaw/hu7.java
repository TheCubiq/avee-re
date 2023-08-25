package com.daaw;
/* loaded from: classes.dex */
public final class hu7 implements ut7 {

    /* renamed from: a */
    public final xt7 f12951a;

    /* renamed from: b */
    public final String f12952b;

    /* renamed from: c */
    public final Object[] f12953c;

    /* renamed from: d */
    public final int f12954d;

    public hu7(xt7 xt7Var, String str, Object[] objArr) {
        this.f12951a = xt7Var;
        this.f12952b = str;
        this.f12953c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f12954d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.f12954d = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    /* renamed from: a */
    public final String m20414a() {
        return this.f12952b;
    }

    /* renamed from: b */
    public final Object[] m20413b() {
        return this.f12953c;
    }

    @Override // com.daaw.ut7
    public final xt7 zza() {
        return this.f12951a;
    }

    @Override // com.daaw.ut7
    public final boolean zzb() {
        return (this.f12954d & 2) == 2;
    }

    @Override // com.daaw.ut7
    public final int zzc() {
        return (this.f12954d & 1) == 1 ? 1 : 2;
    }
}
