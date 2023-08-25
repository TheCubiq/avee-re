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

    /* renamed from: f */
    public final Context f9566f;

    /* renamed from: g */
    public final WeakReference f9567g;

    /* renamed from: h */
    public final ya5 f9568h;

    /* renamed from: i */
    public final Executor f9569i;

    /* renamed from: j */
    public final Executor f9570j;

    /* renamed from: k */
    public final ScheduledExecutorService f9571k;

    /* renamed from: l */
    public final td5 f9572l;

    /* renamed from: m */
    public final zzchu f9573m;

    /* renamed from: o */
    public final wx4 f9575o;

    /* renamed from: p */
    public final vo6 f9576p;

    /* renamed from: a */
    public boolean f9561a = false;

    /* renamed from: b */
    public boolean f9562b = false;

    /* renamed from: c */
    public boolean f9563c = false;

    /* renamed from: e */
    public final e14 f9565e = new e14();

    /* renamed from: n */
    public final Map f9574n = new ConcurrentHashMap();

    /* renamed from: q */
    public boolean f9577q = true;

    /* renamed from: d */
    public final long f9564d = zzt.zzB().mo15859b();

    public fg5(Executor executor, Context context, WeakReference weakReference, Executor executor2, ya5 ya5Var, ScheduledExecutorService scheduledExecutorService, td5 td5Var, zzchu zzchuVar, wx4 wx4Var, vo6 vo6Var) {
        this.f9568h = ya5Var;
        this.f9566f = context;
        this.f9567g = weakReference;
        this.f9569i = executor2;
        this.f9571k = scheduledExecutorService;
        this.f9570j = executor;
        this.f9572l = td5Var;
        this.f9573m = zzchuVar;
        this.f9575o = wx4Var;
        this.f9576p = vo6Var;
        m22668v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /* renamed from: j */
    public static /* bridge */ /* synthetic */ void m22680j(final fg5 fg5Var, String str) {
        int i = 5;
        final io6 m20568a = ho6.m20568a(fg5Var.f9566f, 5);
        m20568a.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final io6 m20568a2 = ho6.m20568a(fg5Var.f9566f, i);
                m20568a2.zzh();
                m20568a2.mo17583l(next);
                final Object obj = new Object();
                final e14 e14Var = new e14();
                f77 m10628o = s67.m10628o(e14Var, ((Long) zzba.zzc().m23658b(g93.f10393D1)).longValue(), TimeUnit.SECONDS, fg5Var.f9571k);
                fg5Var.f9572l.m9277c(next);
                fg5Var.f9575o.mo3088m(next);
                final long mo15859b = zzt.zzB().mo15859b();
                m10628o.mo6515f(new Runnable() { // from class: com.daaw.wf5
                    @Override // java.lang.Runnable
                    public final void run() {
                        fg5.this.m22673q(obj, e14Var, next, mo15859b, m20568a2);
                    }
                }, fg5Var.f9569i);
                arrayList.add(m10628o);
                final eg5 eg5Var = new eg5(fg5Var, obj, next, mo15859b, m20568a2, e14Var);
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
                fg5Var.m22668v(next, false, "", 0);
                try {
                    try {
                        final oj6 m3950c = fg5Var.f9568h.m3950c(next, new JSONObject());
                        fg5Var.f9570j.execute(new Runnable() { // from class: com.daaw.ag5
                            @Override // java.lang.Runnable
                            public final void run() {
                                fg5.this.m22676n(m3950c, eg5Var, arrayList2, next);
                            }
                        });
                    } catch (RemoteException e) {
                        k04.zzh("", e);
                    }
                } catch (wi6 unused2) {
                    eg5Var.mo23476a("Failed to create Adapter.");
                }
                i = 5;
            }
            s67.m10642a(arrayList).m11710a(new Callable() { // from class: com.daaw.xf5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    fg5.this.m22684f(m20568a);
                    return null;
                }
            }, fg5Var.f9569i);
        } catch (JSONException e2) {
            zze.zzb("Malformed CLD response", e2);
            fg5Var.f9575o.zza("MalformedJson");
            fg5Var.f9572l.m9279a("MalformedJson");
            fg5Var.f9565e.m23796c(e2);
            zzt.zzo().m11902u(e2, "AdapterInitializer.updateAdapterStatus");
            vo6 vo6Var = fg5Var.f9576p;
            m20568a.mo17590e(e2);
            m20568a.zzf(false);
            vo6Var.m6969b(m20568a.zzl());
        }
    }

    /* renamed from: f */
    public final /* synthetic */ Object m22684f(io6 io6Var) {
        this.f9565e.m23797b(Boolean.TRUE);
        vo6 vo6Var = this.f9576p;
        io6Var.zzf(true);
        vo6Var.m6969b(io6Var.zzl());
        return null;
    }

    /* renamed from: g */
    public final List m22683g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f9574n.keySet()) {
            zzbrz zzbrzVar = (zzbrz) this.f9574n.get(str);
            arrayList.add(new zzbrz(str, zzbrzVar.f36867q, zzbrzVar.f36868r, zzbrzVar.f36869s));
        }
        return arrayList;
    }

    /* renamed from: l */
    public final void m22678l() {
        this.f9577q = false;
    }

    /* renamed from: m */
    public final /* synthetic */ void m22677m() {
        synchronized (this) {
            if (this.f9563c) {
                return;
            }
            m22668v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzt.zzB().mo15859b() - this.f9564d));
            this.f9572l.m9278b("com.google.android.gms.ads.MobileAds", "timeout");
            this.f9575o.mo3090c("com.google.android.gms.ads.MobileAds", "timeout");
            this.f9565e.m23796c(new Exception());
        }
    }

    /* renamed from: n */
    public final /* synthetic */ void m22676n(oj6 oj6Var, dj3 dj3Var, List list, String str) {
        try {
            try {
                Context context = (Context) this.f9567g.get();
                if (context == null) {
                    context = this.f9566f;
                }
                oj6Var.m14232n(context, dj3Var, list);
            } catch (wi6 unused) {
                dj3Var.mo23476a("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    /* renamed from: o */
    public final /* synthetic */ void m22675o(final e14 e14Var) {
        this.f9569i.execute(new Runnable() { // from class: com.daaw.rf5
            @Override // java.lang.Runnable
            public final void run() {
                e14 e14Var2 = e14Var;
                String m17294c = zzt.zzo().m11915h().zzh().m17294c();
                if (TextUtils.isEmpty(m17294c)) {
                    e14Var2.m23796c(new Exception());
                } else {
                    e14Var2.m23797b(m17294c);
                }
            }
        });
    }

    /* renamed from: p */
    public final /* synthetic */ void m22674p() {
        this.f9572l.m9275e();
        this.f9575o.zze();
        this.f9562b = true;
    }

    /* renamed from: q */
    public final /* synthetic */ void m22673q(Object obj, e14 e14Var, String str, long j, io6 io6Var) {
        synchronized (obj) {
            if (!e14Var.isDone()) {
                m22668v(str, false, "Timeout.", (int) (zzt.zzB().mo15859b() - j));
                this.f9572l.m9278b(str, "timeout");
                this.f9575o.mo3090c(str, "timeout");
                vo6 vo6Var = this.f9576p;
                io6Var.mo17582m("Timeout");
                io6Var.zzf(false);
                vo6Var.m6969b(io6Var.zzl());
                e14Var.m23797b(Boolean.FALSE);
            }
        }
    }

    /* renamed from: r */
    public final void m22672r() {
        if (!((Boolean) kb3.f16113a.m16137e()).booleanValue()) {
            if (this.f9573m.f36995r >= ((Integer) zzba.zzc().m23658b(g93.f10383C1)).intValue() && this.f9577q) {
                if (this.f9561a) {
                    return;
                }
                synchronized (this) {
                    if (this.f9561a) {
                        return;
                    }
                    this.f9572l.m9274f();
                    this.f9575o.zzf();
                    this.f9565e.mo6515f(new Runnable() { // from class: com.daaw.sf5
                        @Override // java.lang.Runnable
                        public final void run() {
                            fg5.this.m22674p();
                        }
                    }, this.f9569i);
                    this.f9561a = true;
                    f77 m22669u = m22669u();
                    this.f9571k.schedule(new Runnable() { // from class: com.daaw.yf5
                        @Override // java.lang.Runnable
                        public final void run() {
                            fg5.this.m22677m();
                        }
                    }, ((Long) zzba.zzc().m23658b(g93.f10403E1)).longValue(), TimeUnit.SECONDS);
                    s67.m10625r(m22669u, new dg5(this), this.f9569i);
                    return;
                }
            }
        }
        if (this.f9561a) {
            return;
        }
        m22668v("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.f9565e.m23797b(Boolean.FALSE);
        this.f9561a = true;
        this.f9562b = true;
    }

    /* renamed from: s */
    public final void m22671s(final gj3 gj3Var) {
        this.f9565e.mo6515f(new Runnable() { // from class: com.daaw.zf5
            @Override // java.lang.Runnable
            public final void run() {
                fg5 fg5Var = fg5.this;
                try {
                    gj3Var.mo8956k2(fg5Var.m22683g());
                } catch (RemoteException e) {
                    k04.zzh("", e);
                }
            }
        }, this.f9570j);
    }

    /* renamed from: t */
    public final boolean m22670t() {
        return this.f9562b;
    }

    /* renamed from: u */
    public final synchronized f77 m22669u() {
        String m17294c = zzt.zzo().m11915h().zzh().m17294c();
        if (!TextUtils.isEmpty(m17294c)) {
            return s67.m10634i(m17294c);
        }
        final e14 e14Var = new e14();
        zzt.zzo().m11915h().zzq(new Runnable() { // from class: com.daaw.bg5
            @Override // java.lang.Runnable
            public final void run() {
                fg5.this.m22675o(e14Var);
            }
        });
        return e14Var;
    }

    /* renamed from: v */
    public final void m22668v(String str, boolean z, String str2, int i) {
        this.f9574n.put(str, new zzbrz(str, z, i, str2));
    }
}
