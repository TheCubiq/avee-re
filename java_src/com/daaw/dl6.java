package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayDeque;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class dl6 {

    /* renamed from: a */
    public final fk6 f7431a;

    /* renamed from: b */
    public final bl6 f7432b;

    /* renamed from: c */
    public final bk6 f7433c;
    @GuardedBy("this")

    /* renamed from: e */
    public jl6 f7435e;
    @GuardedBy("this")

    /* renamed from: f */
    public int f7436f = 1;
    @GuardedBy("this")

    /* renamed from: d */
    public final ArrayDeque f7434d = new ArrayDeque();

    public dl6(fk6 fk6Var, bk6 bk6Var, bl6 bl6Var) {
        this.f7431a = fk6Var;
        this.f7433c = bk6Var;
        this.f7432b = bl6Var;
        bk6Var.m26086b(new yk6(this));
    }

    /* renamed from: a */
    public final synchronized f77 m24264a(cl6 cl6Var) {
        this.f7436f = 2;
        if (m24256i()) {
            return null;
        }
        return this.f7435e.m18423a(cl6Var);
    }

    /* renamed from: e */
    public final synchronized void m24260e(cl6 cl6Var) {
        this.f7434d.add(cl6Var);
    }

    /* renamed from: f */
    public final /* synthetic */ void m24259f() {
        synchronized (this) {
            this.f7436f = 1;
            m24257h();
        }
    }

    /* renamed from: h */
    public final synchronized void m24257h() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10467K5)).booleanValue() && !zzt.zzo().m11915h().zzh().m17289h()) {
            this.f7434d.clear();
            return;
        }
        if (m24256i()) {
            while (!this.f7434d.isEmpty()) {
                cl6 cl6Var = (cl6) this.f7434d.pollFirst();
                if (cl6Var == null || (cl6Var.zza() != null && this.f7431a.mo21509a(cl6Var.zza()))) {
                    jl6 jl6Var = new jl6(this.f7431a, this.f7432b, cl6Var);
                    this.f7435e = jl6Var;
                    jl6Var.m18420d(new zk6(this, cl6Var));
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    public final synchronized boolean m24256i() {
        return this.f7435e == null;
    }
}
