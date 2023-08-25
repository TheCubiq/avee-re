package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class rc4 implements jf5 {

    /* renamed from: a */
    public final Context f25132a;

    /* renamed from: b */
    public final zh3 f25133b;

    /* renamed from: c */
    public final bb4 f25134c;

    /* renamed from: d */
    public final rc4 f25135d = this;

    /* renamed from: e */
    public final m08 f25136e;

    /* renamed from: f */
    public final m08 f25137f;

    /* renamed from: g */
    public final m08 f25138g;

    /* renamed from: h */
    public final m08 f25139h;

    public /* synthetic */ rc4(bb4 bb4Var, Context context, zh3 zh3Var, qc4 qc4Var) {
        this.f25134c = bb4Var;
        this.f25132a = context;
        this.f25133b = zh3Var;
        wz7 m4374a = xz7.m4374a(this);
        this.f25136e = m4374a;
        wz7 m4374a2 = xz7.m4374a(zh3Var);
        this.f25137f = m4374a2;
        ff5 ff5Var = new ff5(m4374a2);
        this.f25138g = ff5Var;
        this.f25139h = vz7.m6638b(new hf5(m4374a, ff5Var));
    }

    @Override // com.daaw.jf5
    public final af5 zzb() {
        return new lc4(this.f25134c, this.f25135d, null);
    }

    @Override // com.daaw.jf5
    public final gf5 zzd() {
        return (gf5) this.f25139h.zzb();
    }
}
