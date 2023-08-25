package com.daaw;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.zzb;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ha5 {
    public final jq4 a;
    public final ty4 b;
    public final vr4 c;
    public final ls4 d;
    public final xs4 e;
    public final uv4 f;
    public final Executor g;
    public final ny4 h;
    public final ah4 i;
    public final zzb j;
    public final cx3 k;
    public final sl2 l;
    public final iv4 m;
    public final cq5 n;
    public final op6 o;
    public final kd5 p;
    public final on6 q;

    public ha5(jq4 jq4Var, vr4 vr4Var, ls4 ls4Var, xs4 xs4Var, uv4 uv4Var, Executor executor, ny4 ny4Var, ah4 ah4Var, zzb zzbVar, cx3 cx3Var, sl2 sl2Var, iv4 iv4Var, cq5 cq5Var, op6 op6Var, kd5 kd5Var, on6 on6Var, ty4 ty4Var) {
        this.a = jq4Var;
        this.c = vr4Var;
        this.d = ls4Var;
        this.e = xs4Var;
        this.f = uv4Var;
        this.g = executor;
        this.h = ny4Var;
        this.i = ah4Var;
        this.j = zzbVar;
        this.k = cx3Var;
        this.l = sl2Var;
        this.m = iv4Var;
        this.n = cq5Var;
        this.o = op6Var;
        this.p = kd5Var;
        this.q = on6Var;
        this.b = ty4Var;
    }

    public static final f77 j(a74 a74Var, String str, String str2) {
        final e14 e14Var = new e14();
        a74Var.zzP().E(new o84() { // from class: com.daaw.fa5
            @Override // com.daaw.o84
            public final void zza(boolean z) {
                e14 e14Var2 = e14.this;
                if (z) {
                    e14Var2.b(null);
                } else {
                    e14Var2.c(new Exception("Ad Web View failed to load."));
                }
            }
        });
        a74Var.b0(str, str2, null);
        return e14Var;
    }

    public final /* synthetic */ void c() {
        this.a.onAdClicked();
    }

    public final /* synthetic */ void d(String str, String str2) {
        this.f.W(str, str2);
    }

    public final /* synthetic */ void e() {
        this.c.zzb();
    }

    public final /* synthetic */ void f(View view) {
        this.j.zza();
    }

    public final /* synthetic */ void g(a74 a74Var, a74 a74Var2, Map map) {
        this.i.c(a74Var);
    }

    public final /* synthetic */ boolean h(View view, MotionEvent motionEvent) {
        this.j.zza();
        if (view != null) {
            view.performClick();
            return false;
        }
        return false;
    }

    public final void i(final a74 a74Var, boolean z, bh3 bh3Var) {
        ol2 c;
        a74Var.zzP().J(new zza() { // from class: com.daaw.y95
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                ha5.this.c();
            }
        }, this.d, this.e, new of3() { // from class: com.daaw.z95
            @Override // com.daaw.of3
            public final void W(String str, String str2) {
                ha5.this.d(str, str2);
            }
        }, new zzz() { // from class: com.daaw.aa5
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                ha5.this.e();
            }
        }, z, bh3Var, this.j, new ga5(this), this.k, this.n, this.o, this.p, this.q, null, this.b, null, null);
        a74Var.setOnTouchListener(new View.OnTouchListener() { // from class: com.daaw.ba5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ha5.this.h(view, motionEvent);
                return false;
            }
        });
        a74Var.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ca5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ha5.this.f(view);
            }
        });
        if (((Boolean) zzba.zzc().b(g93.j2)).booleanValue() && (c = this.l.c()) != null) {
            c.zzn((View) a74Var);
        }
        this.h.n0(a74Var, this.g);
        this.h.n0(new q03() { // from class: com.daaw.da5
            @Override // com.daaw.q03
            public final void e0(p03 p03Var) {
                t84 zzP = a74.this.zzP();
                Rect rect = p03Var.d;
                zzP.G(rect.left, rect.top, false);
            }
        }, this.g);
        this.h.C0((View) a74Var);
        a74Var.y("/trackActiveViewUnit", new zg3() { // from class: com.daaw.ea5
            @Override // com.daaw.zg3
            public final void a(Object obj, Map map) {
                ha5.this.g(a74Var, (a74) obj, map);
            }
        });
        this.i.e(a74Var);
    }
}
