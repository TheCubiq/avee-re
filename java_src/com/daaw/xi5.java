package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
/* loaded from: classes.dex */
public final class xi5 implements wz7 {

    /* renamed from: a */
    public final m08 f32748a;

    /* renamed from: b */
    public final m08 f32749b;

    public xi5(m08 m08Var, m08 m08Var2) {
        this.f32748a = m08Var;
        this.f32749b = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return ez1.m22979a((Context) this.f32748a.zzb()).m19341f(((si5) this.f32749b).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
