package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class vv5 implements c15 {

    /* renamed from: a */
    public final Context f30650a;

    /* renamed from: b */
    public final ia5 f30651b;

    /* renamed from: c */
    public final ri6 f30652c;

    /* renamed from: d */
    public final zzchu f30653d;

    /* renamed from: e */
    public final th6 f30654e;

    /* renamed from: f */
    public final f77 f30655f;

    /* renamed from: g */
    public final a74 f30656g;

    /* renamed from: h */
    public final bh3 f30657h;

    /* renamed from: i */
    public final boolean f30658i;

    public vv5(Context context, ia5 ia5Var, ri6 ri6Var, zzchu zzchuVar, th6 th6Var, f77 f77Var, a74 a74Var, bh3 bh3Var, boolean z) {
        this.f30650a = context;
        this.f30651b = ia5Var;
        this.f30652c = ri6Var;
        this.f30653d = zzchuVar;
        this.f30654e = th6Var;
        this.f30655f = f77Var;
        this.f30656g = a74Var;
        this.f30657h = bh3Var;
        this.f30658i = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    @Override // com.daaw.c15
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3165a(boolean z, Context context, br4 br4Var) {
        a74 a74Var;
        k95 k95Var = (k95) s67.m10626q(this.f30655f);
        try {
            th6 th6Var = this.f30654e;
            if (this.f30656g.mo6430V()) {
                if (((Boolean) zzba.zzc().m23658b(g93.f10422G0)).booleanValue()) {
                    final a74 m20001a = this.f30651b.m20001a(this.f30652c.f25345e, null, null);
                    ph3.m13386b(m20001a, k95Var.mo17782i());
                    final ma5 ma5Var = new ma5();
                    ma5Var.m16134a(this.f30650a, (View) m20001a);
                    k95Var.mo17779l().m20878i(m20001a, true, this.f30658i ? this.f30657h : null);
                    m20001a.zzP().mo9454E(new o84() { // from class: com.daaw.tv5
                        @Override // com.daaw.o84
                        public final void zza(boolean z2) {
                            ma5 ma5Var2 = ma5.this;
                            a74 a74Var2 = m20001a;
                            ma5Var2.m16133b();
                            a74Var2.mo6397v0();
                            a74Var2.zzP().zzp();
                        }
                    });
                    m20001a.zzP().mo9447y0(new s84() { // from class: com.daaw.uv5
                        @Override // com.daaw.s84
                        public final void zza() {
                            a74.this.zzZ();
                        }
                    });
                    yh6 yh6Var = th6Var.f27715t;
                    m20001a.mo6423b0(yh6Var.f33682b, yh6Var.f33681a, null);
                    a74Var = m20001a;
                    a74Var.mo6417g0(true);
                    boolean m26168e = !this.f30658i ? this.f30657h.m26168e(false) : false;
                    zzt.zzp();
                    boolean zzE = zzs.zzE(this.f30650a);
                    boolean z2 = this.f30658i;
                    boolean m26169d = !z2 ? this.f30657h.m26169d() : false;
                    float m26172a = !z2 ? this.f30657h.m26172a() : 0.0f;
                    th6 th6Var2 = this.f30654e;
                    zzj zzjVar = new zzj(m26168e, zzE, m26169d, m26172a, -1, z, th6Var2.f27669P, th6Var2.f27670Q);
                    if (br4Var != null) {
                        br4Var.zzf();
                    }
                    zzt.zzi();
                    p05 mo17781j = k95Var.mo17781j();
                    th6 th6Var3 = this.f30654e;
                    int i = th6Var3.f27671R;
                    zzchu zzchuVar = this.f30653d;
                    String str = th6Var3.f27656C;
                    yh6 yh6Var2 = th6Var3.f27715t;
                    zzm.zza(context, new AdOverlayInfoParcel((zza) null, mo17781j, (zzz) null, a74Var, i, zzchuVar, str, zzjVar, yh6Var2.f33682b, yh6Var2.f33681a, this.f30652c.f25346f, br4Var), true);
                }
            }
            a74Var = this.f30656g;
            a74Var.mo6417g0(true);
            if (!this.f30658i) {
            }
            zzt.zzp();
            boolean zzE2 = zzs.zzE(this.f30650a);
            boolean z22 = this.f30658i;
            if (!z22) {
            }
            if (!z22) {
            }
            th6 th6Var22 = this.f30654e;
            zzj zzjVar2 = new zzj(m26168e, zzE2, m26169d, m26172a, -1, z, th6Var22.f27669P, th6Var22.f27670Q);
            if (br4Var != null) {
            }
            zzt.zzi();
            p05 mo17781j2 = k95Var.mo17781j();
            th6 th6Var32 = this.f30654e;
            int i2 = th6Var32.f27671R;
            zzchu zzchuVar2 = this.f30653d;
            String str2 = th6Var32.f27656C;
            yh6 yh6Var22 = th6Var32.f27715t;
            zzm.zza(context, new AdOverlayInfoParcel((zza) null, mo17781j2, (zzz) null, a74Var, i2, zzchuVar2, str2, zzjVar2, yh6Var22.f33682b, yh6Var22.f33681a, this.f30652c.f25346f, br4Var), true);
        } catch (l74 e) {
            k04.zzh("", e);
        }
    }
}
