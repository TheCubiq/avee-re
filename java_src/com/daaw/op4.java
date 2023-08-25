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

    /* renamed from: a */
    public final en6 f21796a;

    /* renamed from: b */
    public final zzchu f21797b;

    /* renamed from: c */
    public final ApplicationInfo f21798c;

    /* renamed from: d */
    public final String f21799d;

    /* renamed from: e */
    public final List f21800e;

    /* renamed from: f */
    public final PackageInfo f21801f;

    /* renamed from: g */
    public final qz7 f21802g;

    /* renamed from: h */
    public final String f21803h;

    /* renamed from: i */
    public final l76 f21804i;

    /* renamed from: j */
    public final zzg f21805j;

    /* renamed from: k */
    public final ri6 f21806k;

    public op4(en6 en6Var, zzchu zzchuVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, qz7 qz7Var, zzg zzgVar, String str2, l76 l76Var, ri6 ri6Var) {
        this.f21796a = en6Var;
        this.f21797b = zzchuVar;
        this.f21798c = applicationInfo;
        this.f21799d = str;
        this.f21800e = list;
        this.f21801f = packageInfo;
        this.f21802g = qz7Var;
        this.f21803h = str2;
        this.f21804i = l76Var;
        this.f21805j = zzgVar;
        this.f21806k = ri6Var;
    }

    /* renamed from: a */
    public final /* synthetic */ zzccb m14103a(f77 f77Var) {
        return new zzccb((Bundle) f77Var.get(), this.f21797b, this.f21798c, this.f21799d, this.f21800e, this.f21801f, (String) ((f77) this.f21802g.zzb()).get(), this.f21803h, null, null, ((Boolean) zzba.zzc().m23658b(g93.f10398D6)).booleanValue() && this.f21805j.zzP(), this.f21806k.m11285b());
    }

    /* renamed from: b */
    public final f77 m14102b() {
        en6 en6Var = this.f21796a;
        return lm6.m16719c(this.f21804i.m17110a(new Bundle()), ym6.SIGNALS, en6Var).m7037a();
    }

    /* renamed from: c */
    public final f77 m14101c() {
        final f77 m14102b = m14102b();
        return this.f21796a.m5976a(ym6.REQUEST_PARCEL, m14102b, (f77) this.f21802g.zzb()).m18406a(new Callable() { // from class: com.daaw.np4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return op4.this.m14103a(m14102b);
            }
        }).m7037a();
    }
}
