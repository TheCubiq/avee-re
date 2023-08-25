package com.daaw;
/* loaded from: classes.dex */
public final class hu7 implements ut7 {
    public final xt7 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public hu7(xt7 xt7Var, String str, Object[] objArr) {
        this.a = xt7Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    public final String a() {
        return this.b;
    }

    public final Object[] b() {
        return this.c;
    }

    @Override // com.daaw.ut7
    public final xt7 zza() {
        return this.a;
    }

    @Override // com.daaw.ut7
    public final boolean zzb() {
        return (this.d & 2) == 2;
    }

    @Override // com.daaw.ut7
    public final int zzc() {
        return (this.d & 1) == 1 ? 1 : 2;
    }
}
