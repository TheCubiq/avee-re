package com.daaw;

import android.os.Bundle;
import com.daaw.es;
import com.daaw.p2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class u2 {
    public final es<p2> a;
    public volatile v2 b;
    public volatile pc c;
    public final List<oc> d;

    public u2(es<p2> esVar) {
        this(esVar, new tt(), new gp1());
    }

    public u2(es<p2> esVar, pc pcVar, v2 v2Var) {
        this.a = esVar;
        this.c = pcVar;
        this.d = new ArrayList();
        this.b = v2Var;
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(oc ocVar) {
        synchronized (this) {
            if (this.c instanceof tt) {
                this.d.add(ocVar);
            }
            this.c.a(ocVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(b01 b01Var) {
        ml0.f().b("AnalyticsConnector now available.");
        p2 p2Var = (p2) b01Var.get();
        jm jmVar = new jm(p2Var);
        yl ylVar = new yl();
        if (j(p2Var, ylVar) == null) {
            ml0.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        ml0.f().b("Registered Firebase Analytics listener.");
        nc ncVar = new nc();
        hc hcVar = new hc(jmVar, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            for (oc ocVar : this.d) {
                ncVar.a(ocVar);
            }
            ylVar.d(ncVar);
            ylVar.e(hcVar);
            this.c = ncVar;
            this.b = hcVar;
        }
    }

    public static p2.a j(p2 p2Var, yl ylVar) {
        p2.a a = p2Var.a("clx", ylVar);
        if (a == null) {
            ml0.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            a = p2Var.a("crash", ylVar);
            if (a != null) {
                ml0.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return a;
    }

    public v2 d() {
        return new v2() { // from class: com.daaw.r2
            @Override // com.daaw.v2
            public final void a(String str, Bundle bundle) {
                u2.this.g(str, bundle);
            }
        };
    }

    public pc e() {
        return new pc() { // from class: com.daaw.s2
            @Override // com.daaw.pc
            public final void a(oc ocVar) {
                u2.this.h(ocVar);
            }
        };
    }

    public final void f() {
        this.a.a(new es.a() { // from class: com.daaw.t2
            @Override // com.daaw.es.a
            public final void a(b01 b01Var) {
                u2.this.i(b01Var);
            }
        });
    }
}
