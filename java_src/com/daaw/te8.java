package com.daaw;
/* loaded from: classes2.dex */
public final class te8 implements td8 {

    /* renamed from: a */
    public final zd8 f27578a;

    /* renamed from: b */
    public final String f27579b;

    /* renamed from: c */
    public final Object[] f27580c;

    /* renamed from: d */
    public final int f27581d;

    public te8(zd8 zd8Var, String str, Object[] objArr) {
        this.f27578a = zd8Var;
        this.f27579b = str;
        this.f27580c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f27581d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.f27581d = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    /* renamed from: a */
    public final String m9217a() {
        return this.f27579b;
    }

    /* renamed from: b */
    public final Object[] m9216b() {
        return this.f27580c;
    }

    @Override // com.daaw.td8
    public final zd8 zza() {
        return this.f27578a;
    }

    @Override // com.daaw.td8
    public final boolean zzb() {
        return (this.f27581d & 2) == 2;
    }

    @Override // com.daaw.td8
    public final int zzc() {
        return (this.f27581d & 1) == 1 ? 1 : 2;
    }
}
