package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import com.daaw.bw1;
import com.daaw.ll0;
import com.daaw.qy1;
import com.daaw.rx1;
import com.daaw.sx1;
import com.daaw.wy1;
import com.daaw.yy;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class c implements rx1, yy, wy1.b {
    public static final String y = ll0.f("DelayMetCommandHandler");
    public final Context p;
    public final int q;
    public final String r;
    public final d s;
    public final sx1 t;
    public PowerManager.WakeLock w;
    public boolean x = false;
    public int v = 0;
    public final Object u = new Object();

    public c(Context context, int i, String str, d dVar) {
        this.p = context;
        this.q = i;
        this.s = dVar;
        this.r = str;
        this.t = new sx1(context, dVar.f(), this);
    }

    @Override // com.daaw.wy1.b
    public void a(String str) {
        ll0.c().a(y, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // com.daaw.rx1
    public void b(List<String> list) {
        g();
    }

    @Override // com.daaw.yy
    public void c(String str, boolean z) {
        ll0.c().a(y, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        d();
        if (z) {
            Intent f = a.f(this.p, this.r);
            d dVar = this.s;
            dVar.k(new d.b(dVar, f, this.q));
        }
        if (this.x) {
            Intent a = a.a(this.p);
            d dVar2 = this.s;
            dVar2.k(new d.b(dVar2, a, this.q));
        }
    }

    public final void d() {
        synchronized (this.u) {
            this.t.e();
            this.s.h().c(this.r);
            PowerManager.WakeLock wakeLock = this.w;
            if (wakeLock != null && wakeLock.isHeld()) {
                ll0.c().a(y, String.format("Releasing wakelock %s for WorkSpec %s", this.w, this.r), new Throwable[0]);
                this.w.release();
            }
        }
    }

    public void e() {
        this.w = bw1.b(this.p, String.format("%s (%s)", this.r, Integer.valueOf(this.q)));
        ll0 c = ll0.c();
        String str = y;
        c.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.w, this.r), new Throwable[0]);
        this.w.acquire();
        qy1 m = this.s.g().o().B().m(this.r);
        if (m == null) {
            g();
            return;
        }
        boolean b = m.b();
        this.x = b;
        if (b) {
            this.t.d(Collections.singletonList(m));
            return;
        }
        ll0.c().a(str, String.format("No constraints for %s", this.r), new Throwable[0]);
        f(Collections.singletonList(this.r));
    }

    @Override // com.daaw.rx1
    public void f(List<String> list) {
        if (list.contains(this.r)) {
            synchronized (this.u) {
                if (this.v == 0) {
                    this.v = 1;
                    ll0.c().a(y, String.format("onAllConstraintsMet for %s", this.r), new Throwable[0]);
                    if (this.s.e().j(this.r)) {
                        this.s.h().b(this.r, 600000L, this);
                    } else {
                        d();
                    }
                } else {
                    ll0.c().a(y, String.format("Already started work for %s", this.r), new Throwable[0]);
                }
            }
        }
    }

    public final void g() {
        synchronized (this.u) {
            if (this.v < 2) {
                this.v = 2;
                ll0 c = ll0.c();
                String str = y;
                c.a(str, String.format("Stopping work for WorkSpec %s", this.r), new Throwable[0]);
                Intent g = a.g(this.p, this.r);
                d dVar = this.s;
                dVar.k(new d.b(dVar, g, this.q));
                if (this.s.e().g(this.r)) {
                    ll0.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.r), new Throwable[0]);
                    Intent f = a.f(this.p, this.r);
                    d dVar2 = this.s;
                    dVar2.k(new d.b(dVar2, f, this.q));
                } else {
                    ll0.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.r), new Throwable[0]);
                }
            } else {
                ll0.c().a(y, String.format("Already stopped work for %s", this.r), new Throwable[0]);
            }
        }
    }
}
