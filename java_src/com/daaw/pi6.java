package com.daaw;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbsl;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class pi6 {
    public zzl a;
    public zzq b;
    public String c;
    public zzfl d;
    public boolean e;
    public ArrayList f;
    public ArrayList g;
    public zzblz h;
    public zzw i;
    public AdManagerAdViewOptions j;
    public PublisherAdViewOptions k;
    public zzcb l;
    public zzbsl n;
    public az5 q;
    public zzcf s;
    public int m = 1;
    public final zh6 o = new zh6();
    public boolean p = false;
    public boolean r = false;

    public static /* bridge */ /* synthetic */ zzfl A(pi6 pi6Var) {
        return pi6Var.d;
    }

    public static /* bridge */ /* synthetic */ zzblz B(pi6 pi6Var) {
        return pi6Var.h;
    }

    public static /* bridge */ /* synthetic */ zzbsl C(pi6 pi6Var) {
        return pi6Var.n;
    }

    public static /* bridge */ /* synthetic */ az5 D(pi6 pi6Var) {
        return pi6Var.q;
    }

    public static /* bridge */ /* synthetic */ zh6 E(pi6 pi6Var) {
        return pi6Var.o;
    }

    public static /* bridge */ /* synthetic */ String h(pi6 pi6Var) {
        return pi6Var.c;
    }

    public static /* bridge */ /* synthetic */ ArrayList j(pi6 pi6Var) {
        return pi6Var.f;
    }

    public static /* bridge */ /* synthetic */ ArrayList k(pi6 pi6Var) {
        return pi6Var.g;
    }

    public static /* bridge */ /* synthetic */ boolean l(pi6 pi6Var) {
        return pi6Var.p;
    }

    public static /* bridge */ /* synthetic */ boolean m(pi6 pi6Var) {
        return pi6Var.r;
    }

    public static /* bridge */ /* synthetic */ boolean n(pi6 pi6Var) {
        return pi6Var.e;
    }

    public static /* bridge */ /* synthetic */ zzcf p(pi6 pi6Var) {
        return pi6Var.s;
    }

    public static /* bridge */ /* synthetic */ int r(pi6 pi6Var) {
        return pi6Var.m;
    }

    public static /* bridge */ /* synthetic */ AdManagerAdViewOptions s(pi6 pi6Var) {
        return pi6Var.j;
    }

    public static /* bridge */ /* synthetic */ PublisherAdViewOptions t(pi6 pi6Var) {
        return pi6Var.k;
    }

    public static /* bridge */ /* synthetic */ zzl u(pi6 pi6Var) {
        return pi6Var.a;
    }

    public static /* bridge */ /* synthetic */ zzq w(pi6 pi6Var) {
        return pi6Var.b;
    }

    public static /* bridge */ /* synthetic */ zzw y(pi6 pi6Var) {
        return pi6Var.i;
    }

    public static /* bridge */ /* synthetic */ zzcb z(pi6 pi6Var) {
        return pi6Var.l;
    }

    public final zh6 F() {
        return this.o;
    }

    public final pi6 G(ri6 ri6Var) {
        this.o.a(ri6Var.o.a);
        this.a = ri6Var.d;
        this.b = ri6Var.e;
        this.s = ri6Var.r;
        this.c = ri6Var.f;
        this.d = ri6Var.a;
        this.f = ri6Var.g;
        this.g = ri6Var.h;
        this.h = ri6Var.i;
        this.i = ri6Var.j;
        H(ri6Var.l);
        d(ri6Var.m);
        this.p = ri6Var.p;
        this.q = ri6Var.c;
        this.r = ri6Var.q;
        return this;
    }

    public final pi6 H(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.e = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final pi6 I(zzq zzqVar) {
        this.b = zzqVar;
        return this;
    }

    public final pi6 J(String str) {
        this.c = str;
        return this;
    }

    public final pi6 K(zzw zzwVar) {
        this.i = zzwVar;
        return this;
    }

    public final pi6 L(az5 az5Var) {
        this.q = az5Var;
        return this;
    }

    public final pi6 M(zzbsl zzbslVar) {
        this.n = zzbslVar;
        this.d = new zzfl(false, true, false);
        return this;
    }

    public final pi6 N(boolean z) {
        this.p = z;
        return this;
    }

    public final pi6 O(boolean z) {
        this.r = true;
        return this;
    }

    public final pi6 P(boolean z) {
        this.e = z;
        return this;
    }

    public final pi6 Q(int i) {
        this.m = i;
        return this;
    }

    public final pi6 a(zzblz zzblzVar) {
        this.h = zzblzVar;
        return this;
    }

    public final pi6 b(ArrayList arrayList) {
        this.f = arrayList;
        return this;
    }

    public final pi6 c(ArrayList arrayList) {
        this.g = arrayList;
        return this;
    }

    public final pi6 d(PublisherAdViewOptions publisherAdViewOptions) {
        this.k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.e = publisherAdViewOptions.zzc();
            this.l = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final pi6 e(zzl zzlVar) {
        this.a = zzlVar;
        return this;
    }

    public final pi6 f(zzfl zzflVar) {
        this.d = zzflVar;
        return this;
    }

    public final ri6 g() {
        ry0.k(this.c, "ad unit must not be null");
        ry0.k(this.b, "ad size must not be null");
        ry0.k(this.a, "ad request must not be null");
        return new ri6(this, null);
    }

    public final String i() {
        return this.c;
    }

    public final boolean o() {
        return this.p;
    }

    public final pi6 q(zzcf zzcfVar) {
        this.s = zzcfVar;
        return this;
    }

    public final zzl v() {
        return this.a;
    }

    public final zzq x() {
        return this.b;
    }
}
