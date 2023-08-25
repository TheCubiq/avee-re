package com.daaw;

import android.os.Bundle;
import com.daaw.InterfaceC1216es;
import com.daaw.InterfaceC2505p2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* renamed from: com.daaw.u2 */
/* loaded from: classes2.dex */
public class C3155u2 {

    /* renamed from: a */
    public final InterfaceC1216es<InterfaceC2505p2> f28329a;

    /* renamed from: b */
    public volatile InterfaceC3277v2 f28330b;

    /* renamed from: c */
    public volatile InterfaceC2540pc f28331c;

    /* renamed from: d */
    public final List<InterfaceC2430oc> f28332d;

    public C3155u2(InterfaceC1216es<InterfaceC2505p2> interfaceC1216es) {
        this(interfaceC1216es, new C3116tt(), new gp1());
    }

    public C3155u2(InterfaceC1216es<InterfaceC2505p2> interfaceC1216es, InterfaceC2540pc interfaceC2540pc, InterfaceC3277v2 interfaceC3277v2) {
        this.f28329a = interfaceC1216es;
        this.f28331c = interfaceC2540pc;
        this.f28332d = new ArrayList();
        this.f28330b = interfaceC3277v2;
        m8628f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m8627g(String str, Bundle bundle) {
        this.f28330b.mo7545a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m8626h(InterfaceC2430oc interfaceC2430oc) {
        synchronized (this) {
            if (this.f28331c instanceof C3116tt) {
                this.f28332d.add(interfaceC2430oc);
            }
            this.f28331c.mo8831a(interfaceC2430oc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m8625i(b01 b01Var) {
        ml0.m15976f().m15980b("AnalyticsConnector now available.");
        InterfaceC2505p2 interfaceC2505p2 = (InterfaceC2505p2) b01Var.get();
        C1844jm c1844jm = new C1844jm(interfaceC2505p2);
        C3716yl c3716yl = new C3716yl();
        if (m8624j(interfaceC2505p2, c3716yl) == null) {
            ml0.m15976f().m15971k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        ml0.m15976f().m15980b("Registered Firebase Analytics listener.");
        C2273nc c2273nc = new C2273nc();
        C1526hc c1526hc = new C1526hc(c1844jm, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            for (InterfaceC2430oc interfaceC2430oc : this.f28332d) {
                c2273nc.mo8831a(interfaceC2430oc);
            }
            c3716yl.m3593d(c2273nc);
            c3716yl.m3592e(c1526hc);
            this.f28331c = c2273nc;
            this.f28330b = c1526hc;
        }
    }

    /* renamed from: j */
    public static InterfaceC2505p2.InterfaceC2506a m8624j(InterfaceC2505p2 interfaceC2505p2, C3716yl c3716yl) {
        InterfaceC2505p2.InterfaceC2506a mo12801a = interfaceC2505p2.mo12801a("clx", c3716yl);
        if (mo12801a == null) {
            ml0.m15976f().m15980b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            mo12801a = interfaceC2505p2.mo12801a("crash", c3716yl);
            if (mo12801a != null) {
                ml0.m15976f().m15971k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return mo12801a;
    }

    /* renamed from: d */
    public InterfaceC3277v2 m8630d() {
        return new InterfaceC3277v2() { // from class: com.daaw.r2
            @Override // com.daaw.InterfaceC3277v2
            /* renamed from: a */
            public final void mo7545a(String str, Bundle bundle) {
                C3155u2.this.m8627g(str, bundle);
            }
        };
    }

    /* renamed from: e */
    public InterfaceC2540pc m8629e() {
        return new InterfaceC2540pc() { // from class: com.daaw.s2
            @Override // com.daaw.InterfaceC2540pc
            /* renamed from: a */
            public final void mo8831a(InterfaceC2430oc interfaceC2430oc) {
                C3155u2.this.m8626h(interfaceC2430oc);
            }
        };
    }

    /* renamed from: f */
    public final void m8628f() {
        this.f28329a.mo5793a(new InterfaceC1216es.InterfaceC1217a() { // from class: com.daaw.t2
            @Override // com.daaw.InterfaceC1216es.InterfaceC1217a
            /* renamed from: a */
            public final void mo7704a(b01 b01Var) {
                C3155u2.this.m8625i(b01Var);
            }
        });
    }
}
