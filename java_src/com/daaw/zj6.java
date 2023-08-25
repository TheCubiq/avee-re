package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zj6 implements oq4 {
    @GuardedBy("this")
    public final HashSet p = new HashSet();
    public final Context q;
    public final xz3 r;

    public zj6(Context context, xz3 xz3Var) {
        this.q = context;
        this.r = xz3Var;
    }

    public final Bundle a() {
        return this.r.j(this.q, this);
    }

    @Override // com.daaw.oq4
    public final synchronized void b(zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.r.h(this.p);
        }
    }

    public final synchronized void c(HashSet hashSet) {
        this.p.clear();
        this.p.addAll(hashSet);
    }
}
