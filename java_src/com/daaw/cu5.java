package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class cu5 implements wz7 {

    /* renamed from: a */
    public final m08 f6190a;

    /* renamed from: b */
    public final m08 f6191b;

    /* renamed from: c */
    public final m08 f6192c;

    public cu5(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.f6190a = m08Var;
        this.f6191b = m08Var2;
        this.f6192c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new bu5((Context) this.f6190a.zzb(), (q15) this.f6191b.zzb(), (Executor) this.f6192c.zzb());
    }
}
