package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class vq5 {
    public final String c;
    public wh6 d = null;
    public th6 e = null;
    public zzu f = null;
    public final Map b = Collections.synchronizedMap(new HashMap());
    public final List a = Collections.synchronizedList(new ArrayList());

    public vq5(String str) {
        this.c = str;
    }

    public final zzu a() {
        return this.f;
    }

    public final eq4 b() {
        return new eq4(this.e, "", this, this.d, this.c);
    }

    public final List c() {
        return this.a;
    }

    public final void d(th6 th6Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = th6Var.x;
        if (this.b.containsKey(str5)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = th6Var.w.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, th6Var.w.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) zzba.zzc().b(g93.j6)).booleanValue()) {
            String str6 = th6Var.G;
            String str7 = th6Var.H;
            str = str6;
            str2 = str7;
            str3 = th6Var.I;
            str4 = th6Var.J;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
        }
        zzu zzuVar = new zzu(th6Var.F, 0L, null, bundle, str, str2, str3, str4);
        this.a.add(zzuVar);
        this.b.put(str5, zzuVar);
    }

    public final void e(th6 th6Var, long j, zze zzeVar) {
        h(th6Var, j, zzeVar, false);
    }

    public final void f(th6 th6Var, long j, zze zzeVar) {
        h(th6Var, j, null, true);
    }

    public final void g(wh6 wh6Var) {
        this.d = wh6Var;
    }

    public final void h(th6 th6Var, long j, zze zzeVar, boolean z) {
        String str = th6Var.x;
        if (this.b.containsKey(str)) {
            if (this.e == null) {
                this.e = th6Var;
            }
            zzu zzuVar = (zzu) this.b.get(str);
            zzuVar.zzb = j;
            zzuVar.zzc = zzeVar;
            if (((Boolean) zzba.zzc().b(g93.k6)).booleanValue() && z) {
                this.f = zzuVar;
            }
        }
    }
}
