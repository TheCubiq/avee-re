package com.daaw;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class il2 implements ServiceConnection {
    public final Object a = new Object();
    public boolean b = false;
    public sb c;
    public final /* synthetic */ rb d;

    public /* synthetic */ il2(rb rbVar, sb sbVar, ek2 ek2Var) {
        this.d = rbVar;
        this.c = sbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object a() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.il2.a():java.lang.Object");
    }

    public final /* synthetic */ void b() {
        rb.F(this.d, 0);
        rb.k(this.d, null);
        d(uz2.n);
    }

    public final void c() {
        synchronized (this.a) {
            this.c = null;
            this.b = true;
        }
    }

    public final void d(xb xbVar) {
        synchronized (this.a) {
            sb sbVar = this.c;
            if (sbVar != null) {
                sbVar.a(xbVar);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        yx2.k("BillingClient", "Billing service connected.");
        rb.k(this.d, tk4.D(iBinder));
        rb rbVar = this.d;
        if (rb.E(rbVar, new Callable() { // from class: com.daaw.vh2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                il2.this.a();
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.daaw.zi2
            @Override // java.lang.Runnable
            public final void run() {
                il2.this.b();
            }
        }, rb.y(rbVar)) == null) {
            d(rb.z(this.d));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        yx2.l("BillingClient", "Billing service disconnected.");
        rb.k(this.d, null);
        rb.F(this.d, 0);
        synchronized (this.a) {
            sb sbVar = this.c;
            if (sbVar != null) {
                sbVar.b();
            }
        }
    }
}
