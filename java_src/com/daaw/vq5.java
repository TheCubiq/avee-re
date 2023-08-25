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

    /* renamed from: c */
    public final String f30472c;

    /* renamed from: d */
    public wh6 f30473d = null;

    /* renamed from: e */
    public th6 f30474e = null;

    /* renamed from: f */
    public zzu f30475f = null;

    /* renamed from: b */
    public final Map f30471b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public final List f30470a = Collections.synchronizedList(new ArrayList());

    public vq5(String str) {
        this.f30472c = str;
    }

    /* renamed from: a */
    public final zzu m6915a() {
        return this.f30475f;
    }

    /* renamed from: b */
    public final eq4 m6914b() {
        return new eq4(this.f30474e, "", this, this.f30473d, this.f30472c);
    }

    /* renamed from: c */
    public final List m6913c() {
        return this.f30470a;
    }

    /* renamed from: d */
    public final void m6912d(th6 th6Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = th6Var.f27719x;
        if (this.f30471b.containsKey(str5)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = th6Var.f27718w.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, th6Var.f27718w.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10727j6)).booleanValue()) {
            String str6 = th6Var.f27660G;
            String str7 = th6Var.f27661H;
            str = str6;
            str2 = str7;
            str3 = th6Var.f27662I;
            str4 = th6Var.f27663J;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
        }
        zzu zzuVar = new zzu(th6Var.f27659F, 0L, null, bundle, str, str2, str3, str4);
        this.f30470a.add(zzuVar);
        this.f30471b.put(str5, zzuVar);
    }

    /* renamed from: e */
    public final void m6911e(th6 th6Var, long j, zze zzeVar) {
        m6908h(th6Var, j, zzeVar, false);
    }

    /* renamed from: f */
    public final void m6910f(th6 th6Var, long j, zze zzeVar) {
        m6908h(th6Var, j, null, true);
    }

    /* renamed from: g */
    public final void m6909g(wh6 wh6Var) {
        this.f30473d = wh6Var;
    }

    /* renamed from: h */
    public final void m6908h(th6 th6Var, long j, zze zzeVar, boolean z) {
        String str = th6Var.f27719x;
        if (this.f30471b.containsKey(str)) {
            if (this.f30474e == null) {
                this.f30474e = th6Var;
            }
            zzu zzuVar = (zzu) this.f30471b.get(str);
            zzuVar.zzb = j;
            zzuVar.zzc = zzeVar;
            if (((Boolean) zzba.zzc().m23658b(g93.f10738k6)).booleanValue() && z) {
                this.f30475f = zzuVar;
            }
        }
    }
}
