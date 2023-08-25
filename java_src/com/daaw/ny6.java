package com.daaw;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ny6 implements p46 {
    public final p46 a;
    public long b;
    public Uri c;
    public Map d;

    public ny6(p46 p46Var) {
        Objects.requireNonNull(p46Var);
        this.a = p46Var;
        this.c = Uri.EMPTY;
        this.d = Collections.emptyMap();
    }

    @Override // com.daaw.xp8
    public final int a(byte[] bArr, int i, int i2) {
        int a = this.a.a(bArr, i, i2);
        if (a != -1) {
            this.b += a;
        }
        return a;
    }

    @Override // com.daaw.p46
    public final void d(qz6 qz6Var) {
        Objects.requireNonNull(qz6Var);
        this.a.d(qz6Var);
    }

    @Override // com.daaw.p46
    public final long g(pa6 pa6Var) {
        this.c = pa6Var.a;
        this.d = Collections.emptyMap();
        long g = this.a.g(pa6Var);
        Uri zzc = zzc();
        Objects.requireNonNull(zzc);
        this.c = zzc;
        this.d = zze();
        return g;
    }

    public final long k() {
        return this.b;
    }

    public final Uri l() {
        return this.c;
    }

    public final Map m() {
        return this.d;
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.a.zzc();
    }

    @Override // com.daaw.p46
    public final void zzd() {
        this.a.zzd();
    }

    @Override // com.daaw.p46
    public final Map zze() {
        return this.a.zze();
    }
}
