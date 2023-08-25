package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class qx6 {
    public static final Map o = new HashMap();
    public final Context a;
    public final cx6 b;
    public boolean g;
    public final Intent h;
    public ServiceConnection l;
    public IInterface m;
    public final kw6 n;
    public final List d = new ArrayList();
    public final Set e = new HashSet();
    public final Object f = new Object();
    public final IBinder.DeathRecipient j = new IBinder.DeathRecipient() { // from class: com.daaw.fx6
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            qx6.h(qx6.this);
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "OverlayDisplayService";
    public final WeakReference i = new WeakReference(null);

    public qx6(Context context, cx6 cx6Var, String str, Intent intent, kw6 kw6Var, lx6 lx6Var, byte[] bArr) {
        this.a = context;
        this.b = cx6Var;
        this.h = intent;
        this.n = kw6Var;
    }

    public static /* synthetic */ void h(qx6 qx6Var) {
        qx6Var.b.d("reportBinderDeath", new Object[0]);
        lx6 lx6Var = (lx6) qx6Var.i.get();
        if (lx6Var != null) {
            qx6Var.b.d("calling onBinderDied", new Object[0]);
            lx6Var.zza();
        } else {
            qx6Var.b.d("%s : Binder has died.", qx6Var.c);
            for (dx6 dx6Var : qx6Var.d) {
                dx6Var.c(qx6Var.s());
            }
            qx6Var.d.clear();
        }
        qx6Var.t();
    }

    public static /* bridge */ /* synthetic */ void m(qx6 qx6Var, dx6 dx6Var) {
        if (qx6Var.m != null || qx6Var.g) {
            if (!qx6Var.g) {
                dx6Var.run();
                return;
            }
            qx6Var.b.d("Waiting to bind to the service.", new Object[0]);
            qx6Var.d.add(dx6Var);
            return;
        }
        qx6Var.b.d("Initiate binding to the service.", new Object[0]);
        qx6Var.d.add(dx6Var);
        px6 px6Var = new px6(qx6Var, null);
        qx6Var.l = px6Var;
        qx6Var.g = true;
        if (qx6Var.a.bindService(qx6Var.h, px6Var, 1)) {
            return;
        }
        qx6Var.b.d("Failed to bind to the service.", new Object[0]);
        qx6Var.g = false;
        for (dx6 dx6Var2 : qx6Var.d) {
            dx6Var2.c(new rx6());
        }
        qx6Var.d.clear();
    }

    public static /* bridge */ /* synthetic */ void n(qx6 qx6Var) {
        qx6Var.b.d("linkToDeath", new Object[0]);
        try {
            qx6Var.m.asBinder().linkToDeath(qx6Var.j, 0);
        } catch (RemoteException e) {
            qx6Var.b.c(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void o(qx6 qx6Var) {
        qx6Var.b.d("unlinkToDeath", new Object[0]);
        qx6Var.m.asBinder().unlinkToDeath(qx6Var.j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = o;
        synchronized (map) {
            if (!map.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                map.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.c);
        }
        return handler;
    }

    public final IInterface e() {
        return this.m;
    }

    public final void p(dx6 dx6Var, final tj1 tj1Var) {
        synchronized (this.f) {
            this.e.add(tj1Var);
            tj1Var.a().b(new cu0() { // from class: com.daaw.ex6
                @Override // com.daaw.cu0
                public final void a(rj1 rj1Var) {
                    qx6.this.q(tj1Var, rj1Var);
                }
            });
        }
        synchronized (this.f) {
            if (this.k.getAndIncrement() > 0) {
                this.b.a("Already connected to the service.", new Object[0]);
            }
        }
        c().post(new gx6(this, dx6Var.b(), dx6Var));
    }

    public final /* synthetic */ void q(tj1 tj1Var, rj1 rj1Var) {
        synchronized (this.f) {
            this.e.remove(tj1Var);
        }
    }

    public final void r() {
        synchronized (this.f) {
            if (this.k.get() > 0 && this.k.decrementAndGet() > 0) {
                this.b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            c().post(new hx6(this));
        }
    }

    public final RemoteException s() {
        return new RemoteException(String.valueOf(this.c).concat(" : Binder has died."));
    }

    public final void t() {
        synchronized (this.f) {
            for (tj1 tj1Var : this.e) {
                tj1Var.d(s());
            }
            this.e.clear();
        }
    }
}
