package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayDeque;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class dl6 {
    public final fk6 a;
    public final bl6 b;
    public final bk6 c;
    @GuardedBy("this")
    public jl6 e;
    @GuardedBy("this")
    public int f = 1;
    @GuardedBy("this")
    public final ArrayDeque d = new ArrayDeque();

    public dl6(fk6 fk6Var, bk6 bk6Var, bl6 bl6Var) {
        this.a = fk6Var;
        this.c = bk6Var;
        this.b = bl6Var;
        bk6Var.b(new yk6(this));
    }

    public final synchronized f77 a(cl6 cl6Var) {
        this.f = 2;
        if (i()) {
            return null;
        }
        return this.e.a(cl6Var);
    }

    public final synchronized void e(cl6 cl6Var) {
        this.d.add(cl6Var);
    }

    public final /* synthetic */ void f() {
        synchronized (this) {
            this.f = 1;
            h();
        }
    }

    public final synchronized void h() {
        if (((Boolean) zzba.zzc().b(g93.K5)).booleanValue() && !zzt.zzo().h().zzh().h()) {
            this.d.clear();
            return;
        }
        if (i()) {
            while (!this.d.isEmpty()) {
                cl6 cl6Var = (cl6) this.d.pollFirst();
                if (cl6Var == null || (cl6Var.zza() != null && this.a.a(cl6Var.zza()))) {
                    jl6 jl6Var = new jl6(this.a, this.b, cl6Var);
                    this.e = jl6Var;
                    jl6Var.d(new zk6(this, cl6Var));
                    return;
                }
            }
        }
    }

    public final synchronized boolean i() {
        return this.e == null;
    }
}
