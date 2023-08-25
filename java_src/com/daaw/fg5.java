package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbrz;
import com.google.android.gms.internal.ads.zzbsj;
import com.google.android.gms.internal.ads.zzchu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fg5 {
    public final Context f;
    public final WeakReference g;
    public final ya5 h;
    public final Executor i;
    public final Executor j;
    public final ScheduledExecutorService k;
    public final td5 l;
    public final zzchu m;
    public final wx4 o;
    public final vo6 p;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public final e14 e = new e14();
    public final Map n = new ConcurrentHashMap();
    public boolean q = true;
    public final long d = zzt.zzB().b();

    public fg5(Executor executor, Context context, WeakReference weakReference, Executor executor2, ya5 ya5Var, ScheduledExecutorService scheduledExecutorService, td5 td5Var, zzchu zzchuVar, wx4 wx4Var, vo6 vo6Var) {
        this.h = ya5Var;
        this.f = context;
        this.g = weakReference;
        this.i = executor2;
        this.k = scheduledExecutorService;
        this.j = executor;
        this.l = td5Var;
        this.m = zzchuVar;
        this.o = wx4Var;
        this.p = vo6Var;
        v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* bridge */ /* synthetic */ void j(final fg5 fg5Var, String str) {
        int i = 5;
        final io6 a = ho6.a(fg5Var.f, 5);
        a.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final io6 a2 = ho6.a(fg5Var.f, i);
                a2.zzh();
                a2.l(next);
                final Object obj = new Object();
                final e14 e14Var = new e14();
                f77 o = s67.o(e14Var, ((Long) zzba.zzc().b(g93.D1)).longValue(), TimeUnit.SECONDS, fg5Var.k);
                fg5Var.l.c(next);
                fg5Var.o.m(next);
                final long b = zzt.zzB().b();
                o.f(new Runnable() { // from class: com.daaw.wf5
                    @Override // java.lang.Runnable
                    public final void run() {
                        fg5.this.q(obj, e14Var, next, b, a2);
                    }
                }, fg5Var.i);
                arrayList.add(o);
                final eg5 eg5Var = new eg5(fg5Var, obj, next, b, a2, e14Var);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbsj(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                fg5Var.v(next, false, "", 0);
                try {
                    try {
                        final oj6 c = fg5Var.h.c(next, new JSONObject());
                        fg5Var.j.execute(new Runnable() { // from class: com.daaw.ag5
                            @Override // java.lang.Runnable
                            public final void run() {
                                fg5.this.n(c, eg5Var, arrayList2, next);
                            }
                        });
                    } catch (RemoteException e) {
                        k04.zzh("", e);
                    }
                } catch (wi6 unused2) {
                    eg5Var.a("Failed to create Adapter.");
                }
                i = 5;
            }
            s67.a(arrayList).a(new Callable() { // from class: com.daaw.xf5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    fg5.this.f(a);
                    return null;
                }
            }, fg5Var.i);
        } catch (JSONException e2) {
            zze.zzb("Malformed CLD response", e2);
            fg5Var.o.zza("MalformedJson");
            fg5Var.l.a("MalformedJson");
            fg5Var.e.c(e2);
            zzt.zzo().u(e2, "AdapterInitializer.updateAdapterStatus");
            vo6 vo6Var = fg5Var.p;
            a.e(e2);
            a.zzf(false);
            vo6Var.b(a.zzl());
        }
    }

    public final /* synthetic */ Object f(io6 io6Var) {
        this.e.b(Boolean.TRUE);
        vo6 vo6Var = this.p;
        io6Var.zzf(true);
        vo6Var.b(io6Var.zzl());
        return null;
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.n.keySet()) {
            zzbrz zzbrzVar = (zzbrz) this.n.get(str);
            arrayList.add(new zzbrz(str, zzbrzVar.q, zzbrzVar.r, zzbrzVar.s));
        }
        return arrayList;
    }

    public final void l() {
        this.q = false;
    }

    public final /* synthetic */ void m() {
        synchronized (this) {
            if (this.c) {
                return;
            }
            v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzt.zzB().b() - this.d));
            this.l.b("com.google.android.gms.ads.MobileAds", "timeout");
            this.o.c("com.google.android.gms.ads.MobileAds", "timeout");
            this.e.c(new Exception());
        }
    }

    public final /* synthetic */ void n(oj6 oj6Var, dj3 dj3Var, List list, String str) {
        try {
            try {
                Context context = (Context) this.g.get();
                if (context == null) {
                    context = this.f;
                }
                oj6Var.n(context, dj3Var, list);
            } catch (wi6 unused) {
                dj3Var.a("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    public final /* synthetic */ void o(final e14 e14Var) {
        this.i.execute(new Runnable() { // from class: com.daaw.rf5
            @Override // java.lang.Runnable
            public final void run() {
                e14 e14Var2 = e14Var;
                String c = zzt.zzo().h().zzh().c();
                if (TextUtils.isEmpty(c)) {
                    e14Var2.c(new Exception());
                } else {
                    e14Var2.b(c);
                }
            }
        });
    }

    public final /* synthetic */ void p() {
        this.l.e();
        this.o.zze();
        this.b = true;
    }

    public final /* synthetic */ void q(Object obj, e14 e14Var, String str, long j, io6 io6Var) {
        synchronized (obj) {
            if (!e14Var.isDone()) {
                v(str, false, "Timeout.", (int) (zzt.zzB().b() - j));
                this.l.b(str, "timeout");
                this.o.c(str, "timeout");
                vo6 vo6Var = this.p;
                io6Var.m("Timeout");
                io6Var.zzf(false);
                vo6Var.b(io6Var.zzl());
                e14Var.b(Boolean.FALSE);
            }
        }
    }

    public final void r() {
        if (!((Boolean) kb3.a.e()).booleanValue()) {
            if (this.m.r >= ((Integer) zzba.zzc().b(g93.C1)).intValue() && this.q) {
                if (this.a) {
                    return;
                }
                synchronized (this) {
                    if (this.a) {
                        return;
                    }
                    this.l.f();
                    this.o.zzf();
                    this.e.f(new Runnable() { // from class: com.daaw.sf5
                        @Override // java.lang.Runnable
                        public final void run() {
                            fg5.this.p();
                        }
                    }, this.i);
                    this.a = true;
                    f77 u = u();
                    this.k.schedule(new Runnable() { // from class: com.daaw.yf5
                        @Override // java.lang.Runnable
                        public final void run() {
                            fg5.this.m();
                        }
                    }, ((Long) zzba.zzc().b(g93.E1)).longValue(), TimeUnit.SECONDS);
                    s67.r(u, new dg5(this), this.i);
                    return;
                }
            }
        }
        if (this.a) {
            return;
        }
        v("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.e.b(Boolean.FALSE);
        this.a = true;
        this.b = true;
    }

    public final void s(final gj3 gj3Var) {
        this.e.f(new Runnable() { // from class: com.daaw.zf5
            @Override // java.lang.Runnable
            public final void run() {
                fg5 fg5Var = fg5.this;
                try {
                    gj3Var.k2(fg5Var.g());
                } catch (RemoteException e) {
                    k04.zzh("", e);
                }
            }
        }, this.j);
    }

    public final boolean t() {
        return this.b;
    }

    public final synchronized f77 u() {
        String c = zzt.zzo().h().zzh().c();
        if (!TextUtils.isEmpty(c)) {
            return s67.i(c);
        }
        final e14 e14Var = new e14();
        zzt.zzo().h().zzq(new Runnable() { // from class: com.daaw.bg5
            @Override // java.lang.Runnable
            public final void run() {
                fg5.this.o(e14Var);
            }
        });
        return e14Var;
    }

    public final void v(String str, boolean z, String str2, int i) {
        this.n.put(str, new zzbrz(str, z, i, str2));
    }
}
