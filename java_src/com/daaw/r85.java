package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class r85 implements Callable {
    public final zza a;
    public final p74 b;
    public final Context c;
    public final kd5 d;
    public final on6 e;
    public final cq5 f;
    public final Executor g;
    public final sl2 h;
    public final zzchu i;
    public final op6 j;

    public r85(Context context, Executor executor, sl2 sl2Var, zzchu zzchuVar, zza zzaVar, p74 p74Var, cq5 cq5Var, op6 op6Var, kd5 kd5Var, on6 on6Var) {
        this.c = context;
        this.g = executor;
        this.h = sl2Var;
        this.i = zzchuVar;
        this.a = zzaVar;
        this.b = p74Var;
        this.f = cq5Var;
        this.j = op6Var;
        this.d = kd5Var;
        this.e = on6Var;
    }

    public static /* bridge */ /* synthetic */ Context a(r85 r85Var) {
        return r85Var.c;
    }

    public static /* bridge */ /* synthetic */ sl2 b(r85 r85Var) {
        return r85Var.h;
    }

    public static /* bridge */ /* synthetic */ zza c(r85 r85Var) {
        return r85Var.a;
    }

    public static /* bridge */ /* synthetic */ zzchu d(r85 r85Var) {
        return r85Var.i;
    }

    public static /* bridge */ /* synthetic */ p74 e(r85 r85Var) {
        return r85Var.b;
    }

    public static /* bridge */ /* synthetic */ kd5 f(r85 r85Var) {
        return r85Var.d;
    }

    public static /* bridge */ /* synthetic */ cq5 g(r85 r85Var) {
        return r85Var.f;
    }

    public static /* bridge */ /* synthetic */ on6 h(r85 r85Var) {
        return r85Var.e;
    }

    public static /* bridge */ /* synthetic */ op6 i(r85 r85Var) {
        return r85Var.j;
    }

    public static /* bridge */ /* synthetic */ Executor j(r85 r85Var) {
        return r85Var.g;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        u85 u85Var = new u85(this);
        u85Var.h();
        return u85Var;
    }
}
