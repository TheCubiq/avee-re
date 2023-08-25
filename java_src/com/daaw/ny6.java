package com.daaw;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ny6 implements p46 {

    /* renamed from: a */
    public final p46 f20857a;

    /* renamed from: b */
    public long f20858b;

    /* renamed from: c */
    public Uri f20859c;

    /* renamed from: d */
    public Map f20860d;

    public ny6(p46 p46Var) {
        Objects.requireNonNull(p46Var);
        this.f20857a = p46Var;
        this.f20859c = Uri.EMPTY;
        this.f20860d = Collections.emptyMap();
    }

    @Override // com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        int mo1980a = this.f20857a.mo1980a(bArr, i, i2);
        if (mo1980a != -1) {
            this.f20858b += mo1980a;
        }
        return mo1980a;
    }

    @Override // com.daaw.p46
    /* renamed from: d */
    public final void mo1979d(qz6 qz6Var) {
        Objects.requireNonNull(qz6Var);
        this.f20857a.mo1979d(qz6Var);
    }

    @Override // com.daaw.p46
    /* renamed from: g */
    public final long mo1978g(pa6 pa6Var) {
        this.f20859c = pa6Var.f22769a;
        this.f20860d = Collections.emptyMap();
        long mo1978g = this.f20857a.mo1978g(pa6Var);
        Uri zzc = zzc();
        Objects.requireNonNull(zzc);
        this.f20859c = zzc;
        this.f20860d = zze();
        return mo1978g;
    }

    /* renamed from: k */
    public final long m14718k() {
        return this.f20858b;
    }

    /* renamed from: l */
    public final Uri m14717l() {
        return this.f20859c;
    }

    /* renamed from: m */
    public final Map m14716m() {
        return this.f20860d;
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.f20857a.zzc();
    }

    @Override // com.daaw.p46
    public final void zzd() {
        this.f20857a.zzd();
    }

    @Override // com.daaw.p46
    public final Map zze() {
        return this.f20857a.zze();
    }
}
