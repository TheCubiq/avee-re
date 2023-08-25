package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.C0530d;
import com.daaw.InterfaceC3778yy;
import com.daaw.bw1;
import com.daaw.ll0;
import com.daaw.qy1;
import com.daaw.rx1;
import com.daaw.sx1;
import com.daaw.wy1;
import java.util.Collections;
import java.util.List;
/* renamed from: androidx.work.impl.background.systemalarm.c */
/* loaded from: classes.dex */
public class C0529c implements rx1, InterfaceC3778yy, wy1.InterfaceC3483b {

    /* renamed from: y */
    public static final String f2507y = ll0.m16883f("DelayMetCommandHandler");

    /* renamed from: p */
    public final Context f2508p;

    /* renamed from: q */
    public final int f2509q;

    /* renamed from: r */
    public final String f2510r;

    /* renamed from: s */
    public final C0530d f2511s;

    /* renamed from: t */
    public final sx1 f2512t;

    /* renamed from: w */
    public PowerManager.WakeLock f2515w;

    /* renamed from: x */
    public boolean f2516x = false;

    /* renamed from: v */
    public int f2514v = 0;

    /* renamed from: u */
    public final Object f2513u = new Object();

    public C0529c(Context context, int i, String str, C0530d c0530d) {
        this.f2508p = context;
        this.f2509q = i;
        this.f2511s = c0530d;
        this.f2510r = str;
        this.f2512t = new sx1(context, c0530d.m27908f(), this);
    }

    @Override // com.daaw.wy1.InterfaceC3483b
    /* renamed from: a */
    public void mo5713a(String str) {
        ll0.m16885c().mo16882a(f2507y, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        m27913g();
    }

    @Override // com.daaw.rx1
    /* renamed from: b */
    public void mo10849b(List<String> list) {
        m27913g();
    }

    @Override // com.daaw.InterfaceC3778yy
    /* renamed from: c */
    public void mo3085c(String str, boolean z) {
        ll0.m16885c().mo16882a(f2507y, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        m27915d();
        if (z) {
            Intent m27927f = C0527a.m27927f(this.f2508p, this.f2510r);
            C0530d c0530d = this.f2511s;
            c0530d.m27903k(new C0530d.RunnableC0532b(c0530d, m27927f, this.f2509q));
        }
        if (this.f2516x) {
            Intent m27931a = C0527a.m27931a(this.f2508p);
            C0530d c0530d2 = this.f2511s;
            c0530d2.m27903k(new C0530d.RunnableC0532b(c0530d2, m27931a, this.f2509q));
        }
    }

    /* renamed from: d */
    public final void m27915d() {
        synchronized (this.f2513u) {
            this.f2512t.m9788e();
            this.f2511s.m27906h().m5714c(this.f2510r);
            PowerManager.WakeLock wakeLock = this.f2515w;
            if (wakeLock != null && wakeLock.isHeld()) {
                ll0.m16885c().mo16882a(f2507y, String.format("Releasing wakelock %s for WorkSpec %s", this.f2515w, this.f2510r), new Throwable[0]);
                this.f2515w.release();
            }
        }
    }

    /* renamed from: e */
    public void m27914e() {
        this.f2515w = bw1.m25784b(this.f2508p, String.format("%s (%s)", this.f2510r, Integer.valueOf(this.f2509q)));
        ll0 m16885c = ll0.m16885c();
        String str = f2507y;
        m16885c.mo16882a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f2515w, this.f2510r), new Throwable[0]);
        this.f2515w.acquire();
        qy1 mo9719m = this.f2511s.m27907g().m23000o().mo27951B().mo9719m(this.f2510r);
        if (mo9719m == null) {
            m27913g();
            return;
        }
        boolean m11937b = mo9719m.m11937b();
        this.f2516x = m11937b;
        if (m11937b) {
            this.f2512t.m9789d(Collections.singletonList(mo9719m));
            return;
        }
        ll0.m16885c().mo16882a(str, String.format("No constraints for %s", this.f2510r), new Throwable[0]);
        mo10848f(Collections.singletonList(this.f2510r));
    }

    @Override // com.daaw.rx1
    /* renamed from: f */
    public void mo10848f(List<String> list) {
        if (list.contains(this.f2510r)) {
            synchronized (this.f2513u) {
                if (this.f2514v == 0) {
                    this.f2514v = 1;
                    ll0.m16885c().mo16882a(f2507y, String.format("onAllConstraintsMet for %s", this.f2510r), new Throwable[0]);
                    if (this.f2511s.m27909e().m18152j(this.f2510r)) {
                        this.f2511s.m27906h().m5715b(this.f2510r, 600000L, this);
                    } else {
                        m27915d();
                    }
                } else {
                    ll0.m16885c().mo16882a(f2507y, String.format("Already started work for %s", this.f2510r), new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: g */
    public final void m27913g() {
        synchronized (this.f2513u) {
            if (this.f2514v < 2) {
                this.f2514v = 2;
                ll0 m16885c = ll0.m16885c();
                String str = f2507y;
                m16885c.mo16882a(str, String.format("Stopping work for WorkSpec %s", this.f2510r), new Throwable[0]);
                Intent m27926g = C0527a.m27926g(this.f2508p, this.f2510r);
                C0530d c0530d = this.f2511s;
                c0530d.m27903k(new C0530d.RunnableC0532b(c0530d, m27926g, this.f2509q));
                if (this.f2511s.m27909e().m18155g(this.f2510r)) {
                    ll0.m16885c().mo16882a(str, String.format("WorkSpec %s needs to be rescheduled", this.f2510r), new Throwable[0]);
                    Intent m27927f = C0527a.m27927f(this.f2508p, this.f2510r);
                    C0530d c0530d2 = this.f2511s;
                    c0530d2.m27903k(new C0530d.RunnableC0532b(c0530d2, m27927f, this.f2509q));
                } else {
                    ll0.m16885c().mo16882a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f2510r), new Throwable[0]);
                }
            } else {
                ll0.m16885c().mo16882a(f2507y, String.format("Already stopped work for %s", this.f2510r), new Throwable[0]);
            }
        }
    }
}
