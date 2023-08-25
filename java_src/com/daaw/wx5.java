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
    public final String p;
    public final dp3 q;
    public final e14 r;
    public final JSONObject s;
    public final long t;
    @GuardedBy("this")
    public boolean u;

    public wx5(String str, dp3 dp3Var, e14 e14Var, long j) {
        JSONObject jSONObject = new JSONObject();
        this.s = jSONObject;
        this.u = false;
        this.r = e14Var;
        this.p = str;
        this.q = dp3Var;
        this.t = j;
        try {
            jSONObject.put("adapter_version", dp3Var.zzf().toString());
            jSONObject.put("sdk_version", dp3Var.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void g3(String str, e14 e14Var) {
        synchronized (wx5.class) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) zzba.zzc().b(g93.t1)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                e14Var.b(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.daaw.gp3
    public final synchronized void Z(zze zzeVar) {
        h3(zzeVar.zzb, 2);
    }

    @Override // com.daaw.gp3
    public final synchronized void a(String str) {
        if (this.u) {
            return;
        }
        if (str == null) {
            f("Adapter returned null signals");
            return;
        }
        try {
            this.s.put("signals", str);
            if (((Boolean) zzba.zzc().b(g93.u1)).booleanValue()) {
                this.s.put("latency", zzt.zzB().b() - this.t);
            }
            if (((Boolean) zzba.zzc().b(g93.t1)).booleanValue()) {
                this.s.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.r.b(this.s);
        this.u = true;
    }

    @Override // com.daaw.gp3
    public final synchronized void f(String str) {
        h3(str, 2);
    }

    public final synchronized void h3(String str, int i) {
        if (this.u) {
            return;
        }
        try {
            this.s.put("signal_error", str);
            if (((Boolean) zzba.zzc().b(g93.u1)).booleanValue()) {
                this.s.put("latency", zzt.zzB().b() - this.t);
            }
            if (((Boolean) zzba.zzc().b(g93.t1)).booleanValue()) {
                this.s.put("signal_error_code", i);
            }
        } catch (JSONException unused) {
        }
        this.r.b(this.s);
        this.u = true;
    }

    public final synchronized void zzc() {
        h3("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.u) {
            return;
        }
        try {
            if (((Boolean) zzba.zzc().b(g93.t1)).booleanValue()) {
                this.s.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.r.b(this.s);
        this.u = true;
    }
}
