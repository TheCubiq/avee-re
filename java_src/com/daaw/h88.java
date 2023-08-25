package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class h88 implements v78 {

    /* renamed from: a */
    public final kr8 f12184a;

    /* renamed from: d */
    public int f12187d;

    /* renamed from: e */
    public boolean f12188e;

    /* renamed from: c */
    public final List f12186c = new ArrayList();

    /* renamed from: b */
    public final Object f12185b = new Object();

    public h88(rr8 rr8Var, boolean z) {
        this.f12184a = new kr8(rr8Var, z);
    }

    /* renamed from: a */
    public final void m20943a(int i) {
        this.f12187d = i;
        this.f12188e = false;
        this.f12186c.clear();
    }

    @Override // com.daaw.v78
    public final l64 zza() {
        return this.f12184a.m17448I();
    }

    @Override // com.daaw.v78
    public final Object zzb() {
        return this.f12185b;
    }
}
