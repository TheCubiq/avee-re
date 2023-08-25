package com.daaw;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class r86 implements i76 {

    /* renamed from: a */
    public final Executor f24975a;

    /* renamed from: b */
    public final String f24976b;

    /* renamed from: c */
    public final PackageInfo f24977c;

    /* renamed from: d */
    public final hz3 f24978d;

    public r86(hz3 hz3Var, Executor executor, String str, PackageInfo packageInfo, int i, byte[] bArr) {
        this.f24978d = hz3Var;
        this.f24975a = executor;
        this.f24976b = str;
        this.f24977c = packageInfo;
    }

    /* renamed from: a */
    public final /* synthetic */ f77 m11577a(Throwable th) {
        return s67.m10634i(new s86(this.f24976b));
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 41;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.m10636g(s67.m10630m(s67.m10634i(this.f24976b), new ey6() { // from class: com.daaw.p86
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return new s86((String) obj);
            }
        }, this.f24975a), Throwable.class, new w57() { // from class: com.daaw.q86
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return r86.this.m11577a((Throwable) obj);
            }
        }, this.f24975a);
    }
}
