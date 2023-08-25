package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
/* loaded from: classes.dex */
public final class xi5 implements wz7 {
    public final m08 a;
    public final m08 b;

    public xi5(m08 m08Var, m08 m08Var2) {
        this.a = m08Var;
        this.b = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return ez1.a((Context) this.a.zzb()).f(((si5) this.b).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
