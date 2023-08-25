package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ll3 implements wj3, kl3 {

    /* renamed from: p */
    public final kl3 f17518p;

    /* renamed from: q */
    public final HashSet f17519q = new HashSet();

    public ll3(kl3 kl3Var) {
        this.f17518p = kl3Var;
    }

    @Override // com.daaw.kl3
    /* renamed from: B0 */
    public final void mo16862B0(String str, zg3 zg3Var) {
        this.f17518p.mo16862B0(str, zg3Var);
        this.f17519q.add(new AbstractMap.SimpleEntry(str, zg3Var));
    }

    @Override // com.daaw.kk3
    /* renamed from: C0 */
    public final /* synthetic */ void mo6461C0(String str, JSONObject jSONObject) {
        vj3.m7114d(this, str, jSONObject);
    }

    @Override // com.daaw.uj3
    /* renamed from: T */
    public final /* synthetic */ void mo6434T(String str, Map map) {
        vj3.m7117a(this, str, map);
    }

    @Override // com.daaw.wj3
    /* renamed from: c */
    public final /* synthetic */ void mo6049c(String str, String str2) {
        vj3.m7115c(this, str, str2);
    }

    @Override // com.daaw.kl3
    /* renamed from: d0 */
    public final void mo16861d0(String str, zg3 zg3Var) {
        this.f17518p.mo16861d0(str, zg3Var);
        this.f17519q.remove(new AbstractMap.SimpleEntry(str, zg3Var));
    }

    @Override // com.daaw.wj3
    /* renamed from: l */
    public final /* synthetic */ void mo6048l(String str, JSONObject jSONObject) {
        vj3.m7116b(this, str, jSONObject);
    }

    @Override // com.daaw.wj3
    public final void zza(String str) {
        this.f17518p.zza(str);
    }

    public final void zzc() {
        Iterator it = this.f17519q.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zg3) simpleEntry.getValue()).toString())));
            this.f17518p.mo16861d0((String) simpleEntry.getKey(), (zg3) simpleEntry.getValue());
        }
        this.f17519q.clear();
    }
}
