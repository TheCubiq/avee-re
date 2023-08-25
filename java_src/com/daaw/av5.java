package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class av5 implements w57 {
    public final en6 a;
    public final nq4 b;
    public final kp6 c;
    public final op6 d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final cm4 g;
    public final vu5 h;
    public final vq5 i;
    public final Context j;
    public final to6 k;

    public av5(Context context, en6 en6Var, vu5 vu5Var, nq4 nq4Var, kp6 kp6Var, op6 op6Var, cm4 cm4Var, Executor executor, ScheduledExecutorService scheduledExecutorService, vq5 vq5Var, to6 to6Var) {
        this.j = context;
        this.a = en6Var;
        this.h = vu5Var;
        this.b = nq4Var;
        this.c = kp6Var;
        this.d = op6Var;
        this.g = cm4Var;
        this.e = executor;
        this.f = scheduledExecutorService;
        this.i = vq5Var;
        this.k = to6Var;
    }

    public final /* synthetic */ f77 b(th6 th6Var, fi6 fi6Var, qq5 qq5Var, Throwable th) {
        io6 a = ho6.a(this.j, 12);
        a.l(th6Var.F);
        a.zzh();
        vu5 vu5Var = this.h;
        f77 o = s67.o(qq5Var.b(fi6Var, th6Var), th6Var.S, TimeUnit.MILLISECONDS, this.f);
        vu5Var.e(fi6Var, th6Var, o, this.c);
        so6.a(o, this.k, a);
        return o;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    @Override // com.daaw.w57
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.daaw.f77 zza(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.av5.zza(java.lang.Object):com.daaw.f77");
    }
}
