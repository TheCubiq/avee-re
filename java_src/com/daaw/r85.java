package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class r85 implements Callable {

    /* renamed from: a */
    public final zza f24965a;

    /* renamed from: b */
    public final p74 f24966b;

    /* renamed from: c */
    public final Context f24967c;

    /* renamed from: d */
    public final kd5 f24968d;

    /* renamed from: e */
    public final on6 f24969e;

    /* renamed from: f */
    public final cq5 f24970f;

    /* renamed from: g */
    public final Executor f24971g;

    /* renamed from: h */
    public final sl2 f24972h;

    /* renamed from: i */
    public final zzchu f24973i;

    /* renamed from: j */
    public final op6 f24974j;

    public r85(Context context, Executor executor, sl2 sl2Var, zzchu zzchuVar, zza zzaVar, p74 p74Var, cq5 cq5Var, op6 op6Var, kd5 kd5Var, on6 on6Var) {
        this.f24967c = context;
        this.f24971g = executor;
        this.f24972h = sl2Var;
        this.f24973i = zzchuVar;
        this.f24965a = zzaVar;
        this.f24966b = p74Var;
        this.f24970f = cq5Var;
        this.f24974j = op6Var;
        this.f24968d = kd5Var;
        this.f24969e = on6Var;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Context m11587a(r85 r85Var) {
        return r85Var.f24967c;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ sl2 m11586b(r85 r85Var) {
        return r85Var.f24972h;
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ zza m11585c(r85 r85Var) {
        return r85Var.f24965a;
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ zzchu m11584d(r85 r85Var) {
        return r85Var.f24973i;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ p74 m11583e(r85 r85Var) {
        return r85Var.f24966b;
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ kd5 m11582f(r85 r85Var) {
        return r85Var.f24968d;
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ cq5 m11581g(r85 r85Var) {
        return r85Var.f24970f;
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ on6 m11580h(r85 r85Var) {
        return r85Var.f24969e;
    }

    /* renamed from: i */
    public static /* bridge */ /* synthetic */ op6 m11579i(r85 r85Var) {
        return r85Var.f24974j;
    }

    /* renamed from: j */
    public static /* bridge */ /* synthetic */ Executor m11578j(r85 r85Var) {
        return r85Var.f24971g;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        u85 u85Var = new u85(this);
        u85Var.m8426h();
        return u85Var;
    }
}
