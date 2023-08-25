package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbsl;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class ri6 {
    public final zzfl a;
    public final zzbsl b;
    public final az5 c;
    public final zzl d;
    public final zzq e;
    public final String f;
    public final ArrayList g;
    public final ArrayList h;
    public final zzblz i;
    public final zzw j;
    public final int k;
    public final AdManagerAdViewOptions l;
    public final PublisherAdViewOptions m;
    public final zzcb n;
    public final bi6 o;
    public final boolean p;
    public final boolean q;
    public final zzcf r;

    public /* synthetic */ ri6(pi6 pi6Var, qi6 qi6Var) {
        this.e = pi6.w(pi6Var);
        this.f = pi6.h(pi6Var);
        this.r = pi6.p(pi6Var);
        int i = pi6.u(pi6Var).zza;
        long j = pi6.u(pi6Var).zzb;
        Bundle bundle = pi6.u(pi6Var).zzc;
        int i2 = pi6.u(pi6Var).zzd;
        List list = pi6.u(pi6Var).zze;
        boolean z = pi6.u(pi6Var).zzf;
        int i3 = pi6.u(pi6Var).zzg;
        boolean z2 = true;
        if (!pi6.u(pi6Var).zzh && !pi6.n(pi6Var)) {
            z2 = false;
        }
        this.d = new zzl(i, j, bundle, i2, list, z, i3, z2, pi6.u(pi6Var).zzi, pi6.u(pi6Var).zzj, pi6.u(pi6Var).zzk, pi6.u(pi6Var).zzl, pi6.u(pi6Var).zzm, pi6.u(pi6Var).zzn, pi6.u(pi6Var).zzo, pi6.u(pi6Var).zzp, pi6.u(pi6Var).zzq, pi6.u(pi6Var).zzr, pi6.u(pi6Var).zzs, pi6.u(pi6Var).zzt, pi6.u(pi6Var).zzu, pi6.u(pi6Var).zzv, zzs.zza(pi6.u(pi6Var).zzw), pi6.u(pi6Var).zzx);
        this.a = pi6.A(pi6Var) != null ? pi6.A(pi6Var) : pi6.B(pi6Var) != null ? pi6.B(pi6Var).u : null;
        this.g = pi6.j(pi6Var);
        this.h = pi6.k(pi6Var);
        this.i = pi6.j(pi6Var) == null ? null : pi6.B(pi6Var) == null ? new zzblz(new NativeAdOptions.Builder().build()) : pi6.B(pi6Var);
        this.j = pi6.y(pi6Var);
        this.k = pi6.r(pi6Var);
        this.l = pi6.s(pi6Var);
        this.m = pi6.t(pi6Var);
        this.n = pi6.z(pi6Var);
        this.b = pi6.C(pi6Var);
        this.o = new bi6(pi6.E(pi6Var), null);
        this.p = pi6.l(pi6Var);
        this.c = pi6.D(pi6Var);
        this.q = pi6.m(pi6Var);
    }

    public final se3 a() {
        PublisherAdViewOptions publisherAdViewOptions = this.m;
        if (publisherAdViewOptions == null && this.l == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.l.zza();
    }

    public final boolean b() {
        return this.f.matches((String) zzba.zzc().b(g93.H2));
    }
}
