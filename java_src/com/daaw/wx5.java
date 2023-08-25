package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class wx5 extends fp3 {

    /* renamed from: p */
    public final String f31641p;

    /* renamed from: q */
    public final dp3 f31642q;

    /* renamed from: r */
    public final e14 f31643r;

    /* renamed from: s */
    public final JSONObject f31644s;

    /* renamed from: t */
    public final long f31645t;
    @GuardedBy("this")

    /* renamed from: u */
    public boolean f31646u;

    public wx5(String str, dp3 dp3Var, e14 e14Var, long j) {
        JSONObject jSONObject = new JSONObject();
        this.f31644s = jSONObject;
        this.f31646u = false;
        this.f31643r = e14Var;
        this.f31641p = str;
        this.f31642q = dp3Var;
        this.f31645t = j;
        try {
            jSONObject.put("adapter_version", dp3Var.zzf().toString());
            jSONObject.put("sdk_version", dp3Var.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    /* renamed from: g3 */
    public static synchronized void m5728g3(String str, e14 e14Var) {
        synchronized (wx5.class) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) zzba.zzc().m23658b(g93.f10832t1)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                e14Var.m23797b(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.daaw.gp3
    /* renamed from: Z */
    public final synchronized void mo5731Z(zze zzeVar) {
        m5727h3(zzeVar.zzb, 2);
    }

    @Override // com.daaw.gp3
    /* renamed from: a */
    public final synchronized void mo5730a(String str) {
        if (this.f31646u) {
            return;
        }
        if (str == null) {
            mo5729f("Adapter returned null signals");
            return;
        }
        try {
            this.f31644s.put("signals", str);
            if (((Boolean) zzba.zzc().m23658b(g93.f10843u1)).booleanValue()) {
                this.f31644s.put("latency", zzt.zzB().mo15859b() - this.f31645t);
            }
            if (((Boolean) zzba.zzc().m23658b(g93.f10832t1)).booleanValue()) {
                this.f31644s.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f31643r.m23797b(this.f31644s);
        this.f31646u = true;
    }

    @Override // com.daaw.gp3
    /* renamed from: f */
    public final synchronized void mo5729f(String str) {
        m5727h3(str, 2);
    }

    /* renamed from: h3 */
    public final synchronized void m5727h3(String str, int i) {
        if (this.f31646u) {
            return;
        }
        try {
            this.f31644s.put("signal_error", str);
            if (((Boolean) zzba.zzc().m23658b(g93.f10843u1)).booleanValue()) {
                this.f31644s.put("latency", zzt.zzB().mo15859b() - this.f31645t);
            }
            if (((Boolean) zzba.zzc().m23658b(g93.f10832t1)).booleanValue()) {
                this.f31644s.put("signal_error_code", i);
            }
        } catch (JSONException unused) {
        }
        this.f31643r.m23797b(this.f31644s);
        this.f31646u = true;
    }

    public final synchronized void zzc() {
        m5727h3("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.f31646u) {
            return;
        }
        try {
            if (((Boolean) zzba.zzc().m23658b(g93.f10832t1)).booleanValue()) {
                this.f31644s.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f31643r.m23797b(this.f31644s);
        this.f31646u = true;
    }
}
