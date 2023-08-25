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

    /* renamed from: a */
    public final lh5 f7063a;

    /* renamed from: b */
    public final fi5 f7064b;

    /* renamed from: c */
    public final mg5 f7065c;

    /* renamed from: d */
    public final vg5 f7066d;

    /* renamed from: e */
    public final kg5 f7067e;

    /* renamed from: f */
    public final xh5 f7068f;

    /* renamed from: g */
    public final String f7069g;

    /* renamed from: p */
    public boolean f7078p;

    /* renamed from: q */
    public int f7079q;

    /* renamed from: r */
    public boolean f7080r;

    /* renamed from: i */
    public final Map f7071i = new HashMap();

    /* renamed from: j */
    public final Map f7072j = new HashMap();

    /* renamed from: k */
    public final Map f7073k = new HashMap();

    /* renamed from: l */
    public String f7074l = "{}";

    /* renamed from: m */
    public String f7075m = "";

    /* renamed from: n */
    public long f7076n = Long.MAX_VALUE;

    /* renamed from: o */
    public zg5 f7077o = zg5.NONE;

    /* renamed from: s */
    public ch5 f7081s = ch5.UNKNOWN;

    /* renamed from: h */
    public final String f7070h = "afma-sdk-a-v21.5.0";

    public dh5(lh5 lh5Var, fi5 fi5Var, mg5 mg5Var, Context context, zzchu zzchuVar, vg5 vg5Var, xh5 xh5Var) {
        this.f7063a = lh5Var;
        this.f7064b = fi5Var;
        this.f7065c = mg5Var;
        this.f7067e = new kg5(context);
        this.f7069g = zzchuVar.f36993p;
        this.f7066d = vg5Var;
        this.f7068f = xh5Var;
        zzt.zzs().zzg(this);
    }

    /* renamed from: a */
    public final zg5 m24410a() {
        return this.f7077o;
    }

    /* renamed from: b */
    public final synchronized f77 m24409b(String str) {
        e14 e14Var;
        e14Var = new e14();
        if (this.f7072j.containsKey(str)) {
            e14Var.m23797b((og5) this.f7072j.get(str));
        } else {
            if (!this.f7073k.containsKey(str)) {
                this.f7073k.put(str, new ArrayList());
            }
            ((List) this.f7073k.get(str)).add(e14Var);
        }
        return e14Var;
    }

    /* renamed from: c */
    public final synchronized String m24408c() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10599X7)).booleanValue() && m24397n()) {
            if (this.f7076n < zzt.zzB().mo15860a() / 1000) {
                this.f7074l = "{}";
                this.f7076n = Long.MAX_VALUE;
                return "";
            } else if (this.f7074l.equals("{}")) {
                return "";
            } else {
                return this.f7074l;
            }
        }
        return "";
    }

    /* renamed from: d */
    public final synchronized String m24407d() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.f7078p);
            jSONObject.put("gesture", this.f7077o);
            if (this.f7076n > zzt.zzB().mo15860a() / 1000) {
                jSONObject.put("networkExtras", this.f7074l);
                jSONObject.put("networkExtrasExpirationSecs", this.f7076n);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: e */
    public final synchronized JSONObject m24406e() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("sdkVersion", this.f7070h);
            jSONObject.put("internalSdkVersion", this.f7069g);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.f7066d.m7181a());
            if (((Boolean) zzba.zzc().m23658b(g93.f10861v8)).booleanValue()) {
                String m11910m = zzt.zzo().m11910m();
                if (!TextUtils.isEmpty(m11910m)) {
                    jSONObject.put("plugin", m11910m);
                }
            }
            if (this.f7076n < zzt.zzB().mo15860a() / 1000) {
                this.f7074l = "{}";
            }
            jSONObject.put("networkExtras", this.f7074l);
            jSONObject.put("adSlots", m24395p());
            jSONObject.put("appInfo", this.f7067e.m17754a());
            String m17294c = zzt.zzo().m11915h().zzh().m17294c();
            if (!TextUtils.isEmpty(m17294c)) {
                jSONObject.put("cld", new JSONObject(m17294c));
            }
            if (((Boolean) zzba.zzc().m23658b(g93.f10773n8)).booleanValue() && !TextUtils.isEmpty(this.f7075m)) {
                String str = this.f7075m;
                k04.zze("Policy violation data: " + str);
                jSONObject.put("policyViolations", new JSONObject(this.f7075m));
            }
            if (((Boolean) zzba.zzc().m23658b(g93.f10762m8)).booleanValue()) {
                jSONObject.put("openAction", this.f7081s);
                jSONObject.put("gesture", this.f7077o);
            }
        } catch (JSONException e) {
            zzt.zzo().m11903t(e, "Inspector.toJson");
            k04.zzk("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    /* renamed from: f */
    public final synchronized void m24405f(String str, og5 og5Var) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10599X7)).booleanValue() && m24397n()) {
            if (this.f7079q >= ((Integer) zzba.zzc().m23658b(g93.f10619Z7)).intValue()) {
                k04.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f7071i.containsKey(str)) {
                this.f7071i.put(str, new ArrayList());
            }
            this.f7079q++;
            ((List) this.f7071i.get(str)).add(og5Var);
            if (((Boolean) zzba.zzc().m23658b(g93.f10839t8)).booleanValue()) {
                String m14309a = og5Var.m14309a();
                this.f7072j.put(m14309a, og5Var);
                if (this.f7073k.containsKey(m14309a)) {
                    List<e14> list = (List) this.f7073k.get(m14309a);
                    for (e14 e14Var : list) {
                        e14Var.m23797b(og5Var);
                    }
                    list.clear();
                }
            }
        }
    }

    /* renamed from: g */
    public final void m24404g() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10599X7)).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10762m8)).booleanValue() && zzt.zzo().m11915h().zzO()) {
                m24394q();
                return;
            }
            String zzo = zzt.zzo().m11915h().zzo();
            if (TextUtils.isEmpty(zzo)) {
                return;
            }
            try {
                if (new JSONObject(zzo).optBoolean("isTestMode", false)) {
                    m24394q();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: h */
    public final synchronized void m24403h(zzda zzdaVar, ch5 ch5Var) {
        if (!m24397n()) {
            try {
                zzdaVar.zze(tj6.m9071d(18, null, null));
                return;
            } catch (RemoteException unused) {
                k04.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10599X7)).booleanValue()) {
            this.f7081s = ch5Var;
            this.f7063a.m16950d(zzdaVar, new rh3(this), new kh3(this.f7068f));
            return;
        }
        try {
            zzdaVar.zze(tj6.m9071d(1, null, null));
            return;
        } catch (RemoteException unused2) {
            k04.zzj("Ad inspector had an internal error.");
            return;
        }
    }

    /* renamed from: i */
    public final synchronized void m24402i(String str, long j) {
        this.f7074l = str;
        this.f7076n = j;
        m24393r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r2 != false) goto L5;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m24401j(boolean z) {
        if (!this.f7080r) {
            if (z) {
                m24394q();
                if (!this.f7078p) {
                    m24389v();
                    return;
                }
            }
            if (m24397n()) {
                return;
            }
            m24390u();
        }
    }

    /* renamed from: k */
    public final void m24400k(zg5 zg5Var) {
        m24392s(zg5Var, true);
    }

    /* renamed from: l */
    public final synchronized void m24399l(String str) {
        this.f7075m = str;
    }

    /* renamed from: m */
    public final void m24398m(boolean z) {
        if (!this.f7080r && z) {
            m24394q();
        }
        m24391t(z, true);
    }

    /* renamed from: n */
    public final synchronized boolean m24397n() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10762m8)).booleanValue()) {
            return this.f7078p || zzt.zzs().zzl();
        }
        return this.f7078p;
    }

    /* renamed from: o */
    public final synchronized boolean m24396o() {
        return this.f7078p;
    }

    /* renamed from: p */
    public final synchronized JSONObject m24395p() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.f7071i.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (og5 og5Var : (List) entry.getValue()) {
                if (og5Var.m14304h()) {
                    jSONArray.put(og5Var.m14308c());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    /* renamed from: q */
    public final void m24394q() {
        this.f7080r = true;
        this.f7066d.m7179c();
        this.f7063a.m16952b(this);
        this.f7064b.m22620c(this);
        this.f7065c.m16035c(this);
        this.f7068f.m5102j3(this);
        m24388w(zzt.zzo().m11915h().zzo());
    }

    /* renamed from: r */
    public final void m24393r() {
        zzt.zzo().m11915h().zzG(m24407d());
    }

    /* renamed from: s */
    public final synchronized void m24392s(zg5 zg5Var, boolean z) {
        if (this.f7077o == zg5Var) {
            return;
        }
        if (m24397n()) {
            m24390u();
        }
        this.f7077o = zg5Var;
        if (m24397n()) {
            m24389v();
        }
        if (z) {
            m24393r();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:18:0x0036, B:14:0x002b, B:16:0x0031), top: B:26:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[DONT_GENERATE] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m24391t(boolean z, boolean z2) {
        if (this.f7078p == z) {
            return;
        }
        this.f7078p = z;
        if (z) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10762m8)).booleanValue() || !zzt.zzs().zzl()) {
                m24389v();
                if (z2) {
                    return;
                }
                m24393r();
                return;
            }
        }
        if (!m24397n()) {
            m24390u();
        }
        if (z2) {
        }
    }

    /* renamed from: u */
    public final synchronized void m24390u() {
        zg5 zg5Var = zg5.NONE;
        int ordinal = this.f7077o.ordinal();
        if (ordinal == 1) {
            this.f7064b.m22622a();
        } else if (ordinal != 2) {
        } else {
            this.f7065c.m16037a();
        }
    }

    /* renamed from: v */
    public final synchronized void m24389v() {
        zg5 zg5Var = zg5.NONE;
        int ordinal = this.f7077o.ordinal();
        if (ordinal == 1) {
            this.f7064b.m22621b();
        } else if (ordinal != 2) {
        } else {
            this.f7065c.m16036b();
        }
    }

    /* renamed from: w */
    public final synchronized void m24388w(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            m24391t(jSONObject.optBoolean("isTestMode", false), false);
            m24392s(zg5.m2340a(jSONObject.optString("gesture", "NONE")), false);
            this.f7074l = jSONObject.optString("networkExtras", "{}");
            this.f7076n = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }
}
