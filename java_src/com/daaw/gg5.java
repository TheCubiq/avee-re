package com.daaw;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class gg5 implements wz7 {

    /* renamed from: a */
    public final m08 f11221a;

    /* renamed from: b */
    public final m08 f11222b;

    /* renamed from: c */
    public final m08 f11223c;

    /* renamed from: d */
    public final m08 f11224d;

    /* renamed from: e */
    public final m08 f11225e;

    /* renamed from: f */
    public final m08 f11226f;

    /* renamed from: g */
    public final m08 f11227g;

    /* renamed from: h */
    public final m08 f11228h;

    /* renamed from: i */
    public final m08 f11229i;

    /* renamed from: j */
    public final m08 f11230j;

    public gg5(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6, m08 m08Var7, m08 m08Var8, m08 m08Var9, m08 m08Var10) {
        this.f11221a = m08Var;
        this.f11222b = m08Var2;
        this.f11223c = m08Var3;
        this.f11224d = m08Var4;
        this.f11225e = m08Var5;
        this.f11226f = m08Var6;
        this.f11227g = m08Var7;
        this.f11228h = m08Var8;
        this.f11229i = m08Var9;
        this.f11230j = m08Var10;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = (Executor) this.f11221a.zzb();
        Context m20923a = ((h94) this.f11222b).m20923a();
        WeakReference m20010a = ((i94) this.f11223c).m20010a();
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        return new fg5(executor, m20923a, m20010a, g77Var, (ya5) this.f11225e.zzb(), (ScheduledExecutorService) this.f11226f.zzb(), (td5) this.f11227g.zzb(), ((u94) this.f11228h).m8405a(), ((xx4) this.f11229i).zzb(), (vo6) this.f11230j.zzb());
    }
}
