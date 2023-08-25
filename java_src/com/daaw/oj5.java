package com.daaw;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class oj5 implements wz7 {

    /* renamed from: a */
    public final m08 f21587a;

    /* renamed from: b */
    public final m08 f21588b;

    /* renamed from: c */
    public final m08 f21589c;

    /* renamed from: d */
    public final m08 f21590d;

    /* renamed from: e */
    public final m08 f21591e;

    /* renamed from: f */
    public final m08 f21592f;

    /* renamed from: g */
    public final m08 f21593g;

    public oj5(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6, m08 m08Var7) {
        this.f21587a = m08Var;
        this.f21588b = m08Var2;
        this.f21589c = m08Var3;
        this.f21590d = m08Var4;
        this.f21591e = m08Var5;
        this.f21592f = m08Var6;
        this.f21593g = m08Var7;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context m20923a = ((h94) this.f21587a).m20923a();
        ri6 m25128a = ((cq4) this.f21588b).m25128a();
        ki5 zzb = ((li5) this.f21589c).zzb();
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        return new nj5(m20923a, m25128a, zzb, g77Var, (ScheduledExecutorService) this.f21591e.zzb(), (zo5) this.f21592f.zzb(), (to6) this.f21593g.zzb());
    }
}
