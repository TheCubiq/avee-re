package com.daaw;
/* loaded from: classes.dex */
public final class x56 implements i76 {
    public final String a;
    public final String b;

    public x56(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 31;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.i(new y56(this.a, this.b));
    }
}
