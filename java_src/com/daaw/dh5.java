package com.daaw;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class dh5 implements ei5, lg5 {
    public final lh5 a;
    public final fi5 b;
    public final mg5 c;
    public final vg5 d;
    public final kg5 e;
    public final xh5 f;
    public final String g;
    public boolean p;
    public int q;
    public boolean r;
    public final Map i = new HashMap();
    public final Map j = new HashMap();
    public final Map k = new HashMap();
    public String l = "{}";
    public String m = "";
    public long n = Long.MAX_VALUE;
    public zg5 o = zg5.NONE;
    public ch5 s = ch5.UNKNOWN;
    public final String h = "afma-sdk-a-v21.5.0";

    public dh5(lh5 lh5Var, fi5 fi5Var, mg5 mg5Var, Context context, zzchu zzchuVar, vg5 vg5Var, xh5 xh5Var) {
        this.a = lh5Var;
        this.b = fi5Var;
        this.c = mg5Var;
        this.e = new kg5(context);
        this.g = zzchuVar.p;
        this.d = vg5Var;
        this.f = xh5Var;
        zzt.zzs().zzg(this);
    }

    public final zg5 a() {
        return this.o;
    }

    public final synchronized f77 b(String str) {
        e14 e14Var;
        e14Var = new e14();
        if (this.j.containsKey(str)) {
            e14Var.b((og5) this.j.get(str));
        } else {
            if (!this.k.containsKey(str)) {
                this.k.put(str, new ArrayList());
            }
            ((List) this.k.get(str)).add(e14Var);
        }
        return e14Var;
    }

    public final synchronized String c() {
        if (((Boolean) zzba.zzc().b(g93.X7)).booleanValue() && n()) {
            if (this.n < zzt.zzB().a() / 1000) {
                this.l = "{}";
                this.n = Long.MAX_VALUE;
                return "";
            } else if (this.l.equals("{}")) {
                return "";
            } else {
                return this.l;
            }
        }
        return "";
    }

    public final synchronized String d() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.p);
            jSONObject.put("gesture", this.o);
            if (this.n > zzt.zzB().a() / 1000) {
                jSONObject.put("networkExtras", this.l);
                jSONObject.put("networkExtrasExpirationSecs", this.n);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject e() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("sdkVersion", this.h);
            jSONObject.put("internalSdkVersion", this.g);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.d.a());
            if (((Boolean) zzba.zzc().b(g93.v8)).booleanValue()) {
                String m = zzt.zzo().m();
                if (!TextUtils.isEmpty(m)) {
                    jSONObject.put("plugin", m);
                }
            }
            if (this.n < zzt.zzB().a() / 1000) {
                this.l = "{}";
            }
            jSONObject.put("networkExtras", this.l);
            jSONObject.put("adSlots", p());
            jSONObject.put("appInfo", this.e.a());
            String c = zzt.zzo().h().zzh().c();
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("cld", new JSONObject(c));
            }
            if (((Boolean) zzba.zzc().b(g93.n8)).booleanValue() && !TextUtils.isEmpty(this.m)) {
                String str = this.m;
                k04.zze("Policy violation data: " + str);
                jSONObject.put("policyViolations", new JSONObject(this.m));
            }
            if (((Boolean) zzba.zzc().b(g93.m8)).booleanValue()) {
                jSONObject.put("openAction", this.s);
                jSONObject.put("gesture", this.o);
            }
        } catch (JSONException e) {
            zzt.zzo().t(e, "Inspector.toJson");
            k04.zzk("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    public final synchronized void f(String str, og5 og5Var) {
        if (((Boolean) zzba.zzc().b(g93.X7)).booleanValue() && n()) {
            if (this.q >= ((Integer) zzba.zzc().b(g93.Z7)).intValue()) {
                k04.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.i.containsKey(str)) {
                this.i.put(str, new ArrayList());
            }
            this.q++;
            ((List) this.i.get(str)).add(og5Var);
            if (((Boolean) zzba.zzc().b(g93.t8)).booleanValue()) {
                String a = og5Var.a();
                this.j.put(a, og5Var);
                if (this.k.containsKey(a)) {
                    List<e14> list = (List) this.k.get(a);
                    for (e14 e14Var : list) {
                        e14Var.b(og5Var);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void g() {
        if (((Boolean) zzba.zzc().b(g93.X7)).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.m8)).booleanValue() && zzt.zzo().h().zzO()) {
                q();
                return;
            }
            String zzo = zzt.zzo().h().zzo();
            if (TextUtils.isEmpty(zzo)) {
                return;
            }
            try {
                if (new JSONObject(zzo).optBoolean("isTestMode", false)) {
                    q();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void h(zzda zzdaVar, ch5 ch5Var) {
        if (!n()) {
            try {
                zzdaVar.zze(tj6.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                k04.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) zzba.zzc().b(g93.X7)).booleanValue()) {
            this.s = ch5Var;
            this.a.d(zzdaVar, new rh3(this), new kh3(this.f));
            return;
        }
        try {
            zzdaVar.zze(tj6.d(1, null, null));
            return;
        } catch (RemoteException unused2) {
            k04.zzj("Ad inspector had an internal error.");
            return;
        }
    }

    public final synchronized void i(String str, long j) {
        this.l = str;
        this.n = j;
        r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r2 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.r
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.q()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.p
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.v()
            return
        L15:
            boolean r2 = r1.n()
            if (r2 != 0) goto L1e
            r1.u()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.dh5.j(boolean):void");
    }

    public final void k(zg5 zg5Var) {
        s(zg5Var, true);
    }

    public final synchronized void l(String str) {
        this.m = str;
    }

    public final void m(boolean z) {
        if (!this.r && z) {
            q();
        }
        t(z, true);
    }

    public final synchronized boolean n() {
        if (((Boolean) zzba.zzc().b(g93.m8)).booleanValue()) {
            return this.p || zzt.zzs().zzl();
        }
        return this.p;
    }

    public final synchronized boolean o() {
        return this.p;
    }

    public final synchronized JSONObject p() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.i.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (og5 og5Var : (List) entry.getValue()) {
                if (og5Var.h()) {
                    jSONArray.put(og5Var.c());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    public final void q() {
        this.r = true;
        this.d.c();
        this.a.b(this);
        this.b.c(this);
        this.c.c(this);
        this.f.j3(this);
        w(zzt.zzo().h().zzo());
    }

    public final void r() {
        zzt.zzo().h().zzG(d());
    }

    public final synchronized void s(zg5 zg5Var, boolean z) {
        if (this.o == zg5Var) {
            return;
        }
        if (n()) {
            u();
        }
        this.o = zg5Var;
        if (n()) {
            v();
        }
        if (z) {
            r();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:18:0x0036, B:14:0x002b, B:16:0x0031), top: B:26:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void t(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.p     // Catch: java.lang.Throwable -> L3d
            if (r0 != r2) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.p = r2     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L2b
            com.daaw.y83 r2 = com.daaw.g93.m8     // Catch: java.lang.Throwable -> L3d
            com.daaw.e93 r0 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r0.b(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L27
            com.google.android.gms.ads.internal.util.zzaw r2 = com.google.android.gms.ads.internal.zzt.zzs()     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L2b
        L27:
            r1.v()     // Catch: java.lang.Throwable -> L3d
            goto L34
        L2b:
            boolean r2 = r1.n()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L34
            r1.u()     // Catch: java.lang.Throwable -> L3d
        L34:
            if (r3 == 0) goto L3b
            r1.r()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r1)
            return
        L3b:
            monitor-exit(r1)
            return
        L3d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.dh5.t(boolean, boolean):void");
    }

    public final synchronized void u() {
        zg5 zg5Var = zg5.NONE;
        int ordinal = this.o.ordinal();
        if (ordinal == 1) {
            this.b.a();
        } else if (ordinal != 2) {
        } else {
            this.c.a();
        }
    }

    public final synchronized void v() {
        zg5 zg5Var = zg5.NONE;
        int ordinal = this.o.ordinal();
        if (ordinal == 1) {
            this.b.b();
        } else if (ordinal != 2) {
        } else {
            this.c.b();
        }
    }

    public final synchronized void w(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            t(jSONObject.optBoolean("isTestMode", false), false);
            s(zg5.a(jSONObject.optString("gesture", "NONE")), false);
            this.l = jSONObject.optString("networkExtras", "{}");
            this.n = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }
}
