package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zj6 implements oq4 {
    @GuardedBy("this")

    /* renamed from: p */
    public final HashSet f35169p = new HashSet();

    /* renamed from: q */
    public final Context f35170q;

    /* renamed from: r */
    public final xz3 f35171r;

    public zj6(Context context, xz3 xz3Var) {
        this.f35170q = context;
        this.f35171r = xz3Var;
    }

    /* renamed from: a */
    public final Bundle m2195a() {
        return this.f35171r.m4386j(this.f35170q, this);
    }

    @Override // com.daaw.oq4
    /* renamed from: b */
    public final synchronized void mo2194b(zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.f35171r.m4388h(this.f35169p);
        }
    }

    /* renamed from: c */
    public final synchronized void m2193c(HashSet hashSet) {
        this.f35169p.clear();
        this.f35169p.addAll(hashSet);
    }
}
