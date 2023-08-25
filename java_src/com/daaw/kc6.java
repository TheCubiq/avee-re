package com.daaw;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public abstract class kc6 implements qz5 {
    public final Context a;
    public final Executor b;
    public final b94 c;
    public final dd6 d;
    public final cf6 e;
    public final zzchu f;
    public final ViewGroup g;
    public final vo6 h;
    @GuardedBy("this")
    public final pi6 i;
    @GuardedBy("this")
    @Nullable
    public f77 j;

    public kc6(Context context, Executor executor, b94 b94Var, cf6 cf6Var, dd6 dd6Var, pi6 pi6Var, zzchu zzchuVar) {
        this.a = context;
        this.b = executor;
        this.c = b94Var;
        this.e = cf6Var;
        this.d = dd6Var;
        this.i = pi6Var;
        this.f = zzchuVar;
        this.g = new FrameLayout(context);
        this.h = b94Var.D();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:9:0x0026, B:14:0x0045, B:17:0x0056, B:21:0x005c, B:23:0x006c, B:25:0x0074, B:27:0x0089, B:29:0x00a2, B:31:0x00a6, B:32:0x00af, B:12:0x003e), top: B:38:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:9:0x0026, B:14:0x0045, B:17:0x0056, B:21:0x005c, B:23:0x006c, B:25:0x0074, B:27:0x0089, B:29:0x00a2, B:31:0x00a6, B:32:0x00af, B:12:0x003e), top: B:38:0x0001 }] */
    @Override // com.daaw.qz5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a(com.google.android.gms.ads.internal.client.zzl r8, java.lang.String r9, com.daaw.oz5 r10, com.daaw.pz5 r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.kc6.a(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.daaw.oz5, com.daaw.pz5):boolean");
    }

    public abstract qp4 b(wi4 wi4Var, up4 up4Var, pw4 pw4Var);

    public final /* synthetic */ void j() {
        this.d.b(tj6.d(6, null, null));
    }

    public final void k(zzw zzwVar) {
        this.i.K(zzwVar);
    }

    public final synchronized qp4 l(xe6 xe6Var) {
        jc6 jc6Var = (jc6) xe6Var;
        if (((Boolean) zzba.zzc().b(g93.r7)).booleanValue()) {
            wi4 wi4Var = new wi4(this.g);
            sp4 sp4Var = new sp4();
            sp4Var.c(this.a);
            sp4Var.f(jc6Var.a);
            up4 g = sp4Var.g();
            lw4 lw4Var = new lw4();
            lw4Var.f(this.d, this.b);
            lw4Var.o(this.d, this.b);
            return b(wi4Var, g, lw4Var.q());
        }
        dd6 c = dd6.c(this.d);
        lw4 lw4Var2 = new lw4();
        lw4Var2.e(c, this.b);
        lw4Var2.j(c, this.b);
        lw4Var2.k(c, this.b);
        lw4Var2.l(c, this.b);
        lw4Var2.f(c, this.b);
        lw4Var2.o(c, this.b);
        lw4Var2.p(c);
        wi4 wi4Var2 = new wi4(this.g);
        sp4 sp4Var2 = new sp4();
        sp4Var2.c(this.a);
        sp4Var2.f(jc6Var.a);
        return b(wi4Var2, sp4Var2.g(), lw4Var2.q());
    }

    @Override // com.daaw.qz5
    public final boolean zza() {
        f77 f77Var = this.j;
        return (f77Var == null || f77Var.isDone()) ? false : true;
    }
}
