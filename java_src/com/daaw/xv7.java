package com.daaw;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class xv7 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f32992p;

    /* renamed from: q */
    public final /* synthetic */ String f32993q;

    /* renamed from: r */
    public final /* synthetic */ long f32994r;

    /* renamed from: s */
    public final /* synthetic */ Bundle f32995s;

    /* renamed from: t */
    public final /* synthetic */ boolean f32996t;

    /* renamed from: u */
    public final /* synthetic */ boolean f32997u;

    /* renamed from: v */
    public final /* synthetic */ boolean f32998v;

    /* renamed from: w */
    public final /* synthetic */ String f32999w;

    /* renamed from: x */
    public final /* synthetic */ p28 f33000x;

    public xv7(p28 p28Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f33000x = p28Var;
        this.f32992p = str;
        this.f32993q = str2;
        this.f32994r = j;
        this.f32995s = bundle;
        this.f32996t = z;
        this.f32997u = z2;
        this.f32998v = z3;
        this.f32999w = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33000x.m13681w(this.f32992p, this.f32993q, this.f32994r, this.f32995s, this.f32996t, this.f32997u, this.f32998v, this.f32999w);
    }
}
