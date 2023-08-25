package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class h88 implements v78 {
    public final kr8 a;
    public int d;
    public boolean e;
    public final List c = new ArrayList();
    public final Object b = new Object();

    public h88(rr8 rr8Var, boolean z) {
        this.a = new kr8(rr8Var, z);
    }

    public final void a(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }

    @Override // com.daaw.v78
    public final l64 zza() {
        return this.a.I();
    }

    @Override // com.daaw.v78
    public final Object zzb() {
        return this.b;
    }
}
