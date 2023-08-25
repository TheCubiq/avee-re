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

    /* renamed from: o */
    public static final Map f24606o = new HashMap();

    /* renamed from: a */
    public final Context f24607a;

    /* renamed from: b */
    public final cx6 f24608b;

    /* renamed from: g */
    public boolean f24613g;

    /* renamed from: h */
    public final Intent f24614h;

    /* renamed from: l */
    public ServiceConnection f24618l;

    /* renamed from: m */
    public IInterface f24619m;

    /* renamed from: n */
    public final kw6 f24620n;

    /* renamed from: d */
    public final List f24610d = new ArrayList();

    /* renamed from: e */
    public final Set f24611e = new HashSet();

    /* renamed from: f */
    public final Object f24612f = new Object();

    /* renamed from: j */
    public final IBinder.DeathRecipient f24616j = new IBinder.DeathRecipient() { // from class: com.daaw.fx6
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            qx6.m11963h(qx6.this);
        }
    };

    /* renamed from: k */
    public final AtomicInteger f24617k = new AtomicInteger(0);

    /* renamed from: c */
    public final String f24609c = "OverlayDisplayService";

    /* renamed from: i */
    public final WeakReference f24615i = new WeakReference(null);

    public qx6(Context context, cx6 cx6Var, String str, Intent intent, kw6 kw6Var, lx6 lx6Var, byte[] bArr) {
        this.f24607a = context;
        this.f24608b = cx6Var;
        this.f24614h = intent;
        this.f24620n = kw6Var;
    }

    /* renamed from: h */
    public static /* synthetic */ void m11963h(qx6 qx6Var) {
        qx6Var.f24608b.m24909d("reportBinderDeath", new Object[0]);
        lx6 lx6Var = (lx6) qx6Var.f24615i.get();
        if (lx6Var != null) {
            qx6Var.f24608b.m24909d("calling onBinderDied", new Object[0]);
            lx6Var.zza();
        } else {
            qx6Var.f24608b.m24909d("%s : Binder has died.", qx6Var.f24609c);
            for (dx6 dx6Var : qx6Var.f24610d) {
                dx6Var.m23825c(qx6Var.m11952s());
            }
            qx6Var.f24610d.clear();
        }
        qx6Var.m11951t();
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m11958m(qx6 qx6Var, dx6 dx6Var) {
        if (qx6Var.f24619m != null || qx6Var.f24613g) {
            if (!qx6Var.f24613g) {
                dx6Var.run();
                return;
            }
            qx6Var.f24608b.m24909d("Waiting to bind to the service.", new Object[0]);
            qx6Var.f24610d.add(dx6Var);
            return;
        }
        qx6Var.f24608b.m24909d("Initiate binding to the service.", new Object[0]);
        qx6Var.f24610d.add(dx6Var);
        px6 px6Var = new px6(qx6Var, null);
        qx6Var.f24618l = px6Var;
        qx6Var.f24613g = true;
        if (qx6Var.f24607a.bindService(qx6Var.f24614h, px6Var, 1)) {
            return;
        }
        qx6Var.f24608b.m24909d("Failed to bind to the service.", new Object[0]);
        qx6Var.f24613g = false;
        for (dx6 dx6Var2 : qx6Var.f24610d) {
            dx6Var2.m23825c(new rx6());
        }
        qx6Var.f24610d.clear();
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ void m11957n(qx6 qx6Var) {
        qx6Var.f24608b.m24909d("linkToDeath", new Object[0]);
        try {
            qx6Var.f24619m.asBinder().linkToDeath(qx6Var.f24616j, 0);
        } catch (RemoteException e) {
            qx6Var.f24608b.m24910c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m11956o(qx6 qx6Var) {
        qx6Var.f24608b.m24909d("unlinkToDeath", new Object[0]);
        qx6Var.f24619m.asBinder().unlinkToDeath(qx6Var.f24616j, 0);
    }

    /* renamed from: c */
    public final Handler m11968c() {
        Handler handler;
        Map map = f24606o;
        synchronized (map) {
            if (!map.containsKey(this.f24609c)) {
                HandlerThread handlerThread = new HandlerThread(this.f24609c, 10);
                handlerThread.start();
                map.put(this.f24609c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f24609c);
        }
        return handler;
    }

    /* renamed from: e */
    public final IInterface m11966e() {
        return this.f24619m;
    }

    /* renamed from: p */
    public final void m11955p(dx6 dx6Var, final tj1 tj1Var) {
        synchronized (this.f24612f) {
            this.f24611e.add(tj1Var);
            tj1Var.m9082a().mo11248b(new cu0() { // from class: com.daaw.ex6
                @Override // com.daaw.cu0
                /* renamed from: a */
                public final void mo6614a(rj1 rj1Var) {
                    qx6.this.m11954q(tj1Var, rj1Var);
                }
            });
        }
        synchronized (this.f24612f) {
            if (this.f24617k.getAndIncrement() > 0) {
                this.f24608b.m24912a("Already connected to the service.", new Object[0]);
            }
        }
        m11968c().post(new gx6(this, dx6Var.m23826b(), dx6Var));
    }

    /* renamed from: q */
    public final /* synthetic */ void m11954q(tj1 tj1Var, rj1 rj1Var) {
        synchronized (this.f24612f) {
            this.f24611e.remove(tj1Var);
        }
    }

    /* renamed from: r */
    public final void m11953r() {
        synchronized (this.f24612f) {
            if (this.f24617k.get() > 0 && this.f24617k.decrementAndGet() > 0) {
                this.f24608b.m24909d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            m11968c().post(new hx6(this));
        }
    }

    /* renamed from: s */
    public final RemoteException m11952s() {
        return new RemoteException(String.valueOf(this.f24609c).concat(" : Binder has died."));
    }

    /* renamed from: t */
    public final void m11951t() {
        synchronized (this.f24612f) {
            for (tj1 tj1Var : this.f24611e) {
                tj1Var.m9079d(m11952s());
            }
            this.f24611e.clear();
        }
    }
}
