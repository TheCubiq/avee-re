package com.daaw;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzchu;
import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class op4 {
    public final en6 a;
    public final zzchu b;
    public final ApplicationInfo c;
    public final String d;
    public final List e;
    public final PackageInfo f;
    public final qz7 g;
    public final String h;
    public final l76 i;
    public final zzg j;
    public final ri6 k;

    public op4(en6 en6Var, zzchu zzchuVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, qz7 qz7Var, zzg zzgVar, String str2, l76 l76Var, ri6 ri6Var) {
        this.a = en6Var;
        this.b = zzchuVar;
        this.c = applicationInfo;
        this.d = str;
        this.e = list;
        this.f = packageInfo;
        this.g = qz7Var;
        this.h = str2;
        this.i = l76Var;
        this.j = zzgVar;
        this.k = ri6Var;
    }

    public final /* synthetic */ zzccb a(f77 f77Var) {
        return new zzccb((Bundle) f77Var.get(), this.b, this.c, this.d, this.e, this.f, (String) ((f77) this.g.zzb()).get(), this.h, null, null, ((Boolean) zzba.zzc().b(g93.D6)).booleanValue() && this.j.zzP(), this.k.b());
    }

    public final f77 b() {
        en6 en6Var = this.a;
        return lm6.c(this.i.a(new Bundle()), ym6.SIGNALS, en6Var).a();
    }

    public final f77 c() {
        final f77 b = b();
        return this.a.a(ym6.REQUEST_PARCEL, b, (f77) this.g.zzb()).a(new Callable() { // from class: com.daaw.np4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return op4.this.a(b);
            }
        }).a();
    }
}
