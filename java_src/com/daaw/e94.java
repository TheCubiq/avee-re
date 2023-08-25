package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class e94 {

    /* renamed from: a */
    public final zzchu f8271a;

    /* renamed from: b */
    public final Context f8272b;

    /* renamed from: c */
    public final WeakReference f8273c;

    public /* synthetic */ e94(c94 c94Var, d94 d94Var) {
        zzchu zzchuVar;
        Context context;
        WeakReference weakReference;
        zzchuVar = c94Var.f5643a;
        this.f8271a = zzchuVar;
        context = c94Var.f5644b;
        this.f8272b = context;
        weakReference = c94Var.f5645c;
        this.f8273c = weakReference;
    }

    /* renamed from: a */
    public final Context m23653a() {
        return this.f8272b;
    }

    /* renamed from: b */
    public final sl2 m23652b() {
        return new sl2(new zzi(this.f8272b, this.f8271a));
    }

    /* renamed from: c */
    public final yb3 m23651c() {
        return new yb3(this.f8272b);
    }

    /* renamed from: d */
    public final zzchu m23650d() {
        return this.f8271a;
    }

    /* renamed from: e */
    public final String m23649e() {
        return zzt.zzp().zzc(this.f8272b, this.f8271a.f36993p);
    }

    /* renamed from: f */
    public final WeakReference m23648f() {
        return this.f8273c;
    }
}
