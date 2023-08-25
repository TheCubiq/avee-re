package com.daaw;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class dn5 implements wz7 {

    /* renamed from: a */
    public final m08 f7494a;

    /* renamed from: b */
    public final m08 f7495b;

    /* renamed from: c */
    public final m08 f7496c;

    /* renamed from: d */
    public final m08 f7497d;

    /* renamed from: e */
    public final m08 f7498e;

    /* renamed from: f */
    public final m08 f7499f;

    /* renamed from: g */
    public final m08 f7500g;

    /* renamed from: h */
    public final m08 f7501h;

    /* renamed from: i */
    public final m08 f7502i;

    public dn5(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6, m08 m08Var7, m08 m08Var8, m08 m08Var9) {
        this.f7494a = m08Var;
        this.f7495b = m08Var2;
        this.f7496c = m08Var3;
        this.f7497d = m08Var4;
        this.f7498e = m08Var5;
        this.f7499f = m08Var6;
        this.f7500g = m08Var7;
        this.f7501h = m08Var8;
        this.f7502i = m08Var9;
    }

    @Override // com.daaw.m08
    public final /* synthetic */ Object zzb() {
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        return new cn5(((h94) this.f7494a).m20923a(), (Executor) this.f7495b.zzb(), g77Var, new yu3(), ((p94) this.f7498e).zzb(), ((zn5) this.f7499f).zzb(), (ArrayDeque) this.f7500g.zzb(), new vn5(), (vo6) this.f7502i.zzb(), null);
    }
}
