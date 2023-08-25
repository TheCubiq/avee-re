package com.daaw;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class r86 implements i76 {
    public final Executor a;
    public final String b;
    public final PackageInfo c;
    public final hz3 d;

    public r86(hz3 hz3Var, Executor executor, String str, PackageInfo packageInfo, int i, byte[] bArr) {
        this.d = hz3Var;
        this.a = executor;
        this.b = str;
        this.c = packageInfo;
    }

    public final /* synthetic */ f77 a(Throwable th) {
        return s67.i(new s86(this.b));
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 41;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.g(s67.m(s67.i(this.b), new ey6() { // from class: com.daaw.p86
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return new s86((String) obj);
            }
        }, this.a), Throwable.class, new w57() { // from class: com.daaw.q86
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return r86.this.a((Throwable) obj);
            }
        }, this.a);
    }
}
