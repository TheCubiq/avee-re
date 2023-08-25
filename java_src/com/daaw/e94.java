package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class e94 {
    public final zzchu a;
    public final Context b;
    public final WeakReference c;

    public /* synthetic */ e94(c94 c94Var, d94 d94Var) {
        zzchu zzchuVar;
        Context context;
        WeakReference weakReference;
        zzchuVar = c94Var.a;
        this.a = zzchuVar;
        context = c94Var.b;
        this.b = context;
        weakReference = c94Var.c;
        this.c = weakReference;
    }

    public final Context a() {
        return this.b;
    }

    public final sl2 b() {
        return new sl2(new zzi(this.b, this.a));
    }

    public final yb3 c() {
        return new yb3(this.b);
    }

    public final zzchu d() {
        return this.a;
    }

    public final String e() {
        return zzt.zzp().zzc(this.b, this.a.p);
    }

    public final WeakReference f() {
        return this.c;
    }
}
