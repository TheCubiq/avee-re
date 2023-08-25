package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ll3 implements wj3, kl3 {
    public final kl3 p;
    public final HashSet q = new HashSet();

    public ll3(kl3 kl3Var) {
        this.p = kl3Var;
    }

    @Override // com.daaw.kl3
    public final void B0(String str, zg3 zg3Var) {
        this.p.B0(str, zg3Var);
        this.q.add(new AbstractMap.SimpleEntry(str, zg3Var));
    }

    @Override // com.daaw.kk3
    public final /* synthetic */ void C0(String str, JSONObject jSONObject) {
        vj3.d(this, str, jSONObject);
    }

    @Override // com.daaw.uj3
    public final /* synthetic */ void T(String str, Map map) {
        vj3.a(this, str, map);
    }

    @Override // com.daaw.wj3
    public final /* synthetic */ void c(String str, String str2) {
        vj3.c(this, str, str2);
    }

    @Override // com.daaw.kl3
    public final void d0(String str, zg3 zg3Var) {
        this.p.d0(str, zg3Var);
        this.q.remove(new AbstractMap.SimpleEntry(str, zg3Var));
    }

    @Override // com.daaw.wj3
    public final /* synthetic */ void l(String str, JSONObject jSONObject) {
        vj3.b(this, str, jSONObject);
    }

    @Override // com.daaw.wj3
    public final void zza(String str) {
        this.p.zza(str);
    }

    public final void zzc() {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zg3) simpleEntry.getValue()).toString())));
            this.p.d0((String) simpleEntry.getKey(), (zg3) simpleEntry.getValue());
        }
        this.q.clear();
    }
}
