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

    /* renamed from: a */
    public final zzfl f25341a;

    /* renamed from: b */
    public final zzbsl f25342b;

    /* renamed from: c */
    public final az5 f25343c;

    /* renamed from: d */
    public final zzl f25344d;

    /* renamed from: e */
    public final zzq f25345e;

    /* renamed from: f */
    public final String f25346f;

    /* renamed from: g */
    public final ArrayList f25347g;

    /* renamed from: h */
    public final ArrayList f25348h;

    /* renamed from: i */
    public final zzblz f25349i;

    /* renamed from: j */
    public final zzw f25350j;

    /* renamed from: k */
    public final int f25351k;

    /* renamed from: l */
    public final AdManagerAdViewOptions f25352l;

    /* renamed from: m */
    public final PublisherAdViewOptions f25353m;

    /* renamed from: n */
    public final zzcb f25354n;

    /* renamed from: o */
    public final bi6 f25355o;

    /* renamed from: p */
    public final boolean f25356p;

    /* renamed from: q */
    public final boolean f25357q;

    /* renamed from: r */
    public final zzcf f25358r;

    public /* synthetic */ ri6(pi6 pi6Var, qi6 qi6Var) {
        this.f25345e = pi6.m13340w(pi6Var);
        this.f25346f = pi6.m13355h(pi6Var);
        this.f25358r = pi6.m13347p(pi6Var);
        int i = pi6.m13342u(pi6Var).zza;
        long j = pi6.m13342u(pi6Var).zzb;
        Bundle bundle = pi6.m13342u(pi6Var).zzc;
        int i2 = pi6.m13342u(pi6Var).zzd;
        List list = pi6.m13342u(pi6Var).zze;
        boolean z = pi6.m13342u(pi6Var).zzf;
        int i3 = pi6.m13342u(pi6Var).zzg;
        boolean z2 = true;
        if (!pi6.m13342u(pi6Var).zzh && !pi6.m13349n(pi6Var)) {
            z2 = false;
        }
        this.f25344d = new zzl(i, j, bundle, i2, list, z, i3, z2, pi6.m13342u(pi6Var).zzi, pi6.m13342u(pi6Var).zzj, pi6.m13342u(pi6Var).zzk, pi6.m13342u(pi6Var).zzl, pi6.m13342u(pi6Var).zzm, pi6.m13342u(pi6Var).zzn, pi6.m13342u(pi6Var).zzo, pi6.m13342u(pi6Var).zzp, pi6.m13342u(pi6Var).zzq, pi6.m13342u(pi6Var).zzr, pi6.m13342u(pi6Var).zzs, pi6.m13342u(pi6Var).zzt, pi6.m13342u(pi6Var).zzu, pi6.m13342u(pi6Var).zzv, zzs.zza(pi6.m13342u(pi6Var).zzw), pi6.m13342u(pi6Var).zzx);
        this.f25341a = pi6.m13379A(pi6Var) != null ? pi6.m13379A(pi6Var) : pi6.m13378B(pi6Var) != null ? pi6.m13378B(pi6Var).f36848u : null;
        this.f25347g = pi6.m13353j(pi6Var);
        this.f25348h = pi6.m13352k(pi6Var);
        this.f25349i = pi6.m13353j(pi6Var) == null ? null : pi6.m13378B(pi6Var) == null ? new zzblz(new NativeAdOptions.Builder().build()) : pi6.m13378B(pi6Var);
        this.f25350j = pi6.m13338y(pi6Var);
        this.f25351k = pi6.m13345r(pi6Var);
        this.f25352l = pi6.m13344s(pi6Var);
        this.f25353m = pi6.m13343t(pi6Var);
        this.f25354n = pi6.m13337z(pi6Var);
        this.f25342b = pi6.m13377C(pi6Var);
        this.f25355o = new bi6(pi6.m13375E(pi6Var), null);
        this.f25356p = pi6.m13351l(pi6Var);
        this.f25343c = pi6.m13376D(pi6Var);
        this.f25357q = pi6.m13350m(pi6Var);
    }

    /* renamed from: a */
    public final se3 m11286a() {
        PublisherAdViewOptions publisherAdViewOptions = this.f25353m;
        if (publisherAdViewOptions == null && this.f25352l == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.f25352l.zza();
    }

    /* renamed from: b */
    public final boolean m11285b() {
        return this.f25346f.matches((String) zzba.zzc().m23658b(g93.f10434H2));
    }
}
