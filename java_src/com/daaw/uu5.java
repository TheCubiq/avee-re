package com.daaw;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class uu5 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ long f29544a;

    /* renamed from: b */
    public final /* synthetic */ String f29545b;

    /* renamed from: c */
    public final /* synthetic */ th6 f29546c;

    /* renamed from: d */
    public final /* synthetic */ wh6 f29547d;

    /* renamed from: e */
    public final /* synthetic */ kp6 f29548e;

    /* renamed from: f */
    public final /* synthetic */ fi6 f29549f;

    /* renamed from: g */
    public final /* synthetic */ vu5 f29550g;

    public uu5(vu5 vu5Var, long j, String str, th6 th6Var, wh6 wh6Var, kp6 kp6Var, fi6 fi6Var) {
        this.f29550g = vu5Var;
        this.f29544a = j;
        this.f29545b = str;
        this.f29546c = th6Var;
        this.f29547d = wh6Var;
        this.f29548e = kp6Var;
        this.f29549f = fi6Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final void mo2151a(Object obj) {
        InterfaceC0623ag interfaceC0623ag;
        boolean z;
        vq5 vq5Var;
        wu5 wu5Var;
        interfaceC0623ag = this.f29550g.f30599a;
        long mo15859b = interfaceC0623ag.mo15859b() - this.f29544a;
        vu5.m6776g(this.f29550g, this.f29545b, 0, mo15859b, this.f29546c.f27695h0, null);
        vu5 vu5Var = this.f29550g;
        z = vu5Var.f30603e;
        if (z) {
            wu5Var = vu5Var.f30600b;
            wu5Var.m5781a(this.f29547d, this.f29546c, 0, null, mo15859b);
        }
        vq5Var = this.f29550g.f30604f;
        vq5Var.m6910f(this.f29546c, mo15859b, null);
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        InterfaceC0623ag interfaceC0623ag;
        Integer num;
        zze m7803b;
        boolean z;
        zze zzeVar;
        vq5 vq5Var;
        op6 op6Var;
        wu5 wu5Var;
        interfaceC0623ag = this.f29550g.f30599a;
        long mo15859b = interfaceC0623ag.mo15859b() - this.f29544a;
        if (th instanceof TimeoutException) {
            num = null;
            r3 = 2;
        } else if (th instanceof hu5) {
            num = null;
            r3 = 3;
        } else if (th instanceof CancellationException) {
            num = null;
            r3 = 4;
        } else if (th instanceof wi6) {
            num = null;
            r3 = 5;
        } else {
            if (th instanceof gi5) {
                r3 = tj6.m9074a(th).zza == 3 ? 1 : 6;
                if (((Boolean) zzba.zzc().m23658b(g93.f10854v1)).booleanValue() && (th instanceof uq5) && (m7803b = ((uq5) th).m7803b()) != null) {
                    num = Integer.valueOf(m7803b.zza);
                }
            }
            num = null;
        }
        vu5.m6776g(this.f29550g, this.f29545b, r3, mo15859b, this.f29546c.f27695h0, num);
        vu5 vu5Var = this.f29550g;
        z = vu5Var.f30603e;
        if (z) {
            wu5Var = vu5Var.f30600b;
            wu5Var.m5781a(this.f29547d, this.f29546c, r3, th instanceof uq5 ? (uq5) th : null, mo15859b);
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10367A7)).booleanValue()) {
            op6Var = this.f29550g.f30601c;
            kp6 kp6Var = this.f29548e;
            fi6 fi6Var = this.f29549f;
            th6 th6Var = this.f29546c;
            op6Var.m14097d(kp6Var.m17533c(fi6Var, th6Var, th6Var.f27708o));
        }
        zze m9074a = tj6.m9074a(th);
        int i = m9074a.zza;
        if ((i == 3 || i == 0) && (zzeVar = m9074a.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            m9074a = tj6.m9074a(new uq5(13, m9074a.zzd));
        }
        vq5Var = this.f29550g.f30604f;
        vq5Var.m6911e(this.f29546c, mo15859b, m9074a);
    }
}
