package com.daaw;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzatd;
import java.util.Objects;
/* loaded from: classes.dex */
public final class xq2 {

    /* renamed from: a */
    public final Handler f32886a;

    /* renamed from: b */
    public final dr2 f32887b;

    public xq2(Handler handler, dr2 dr2Var) {
        Objects.requireNonNull(handler);
        this.f32886a = handler;
        this.f32887b = dr2Var;
    }

    /* renamed from: b */
    public final void m4822b(int i) {
        this.f32886a.post(new wq2(this, i));
    }

    /* renamed from: c */
    public final void m4821c(int i, long j, long j2) {
        this.f32886a.post(new uq2(this, i, j, j2));
    }

    /* renamed from: d */
    public final void m4820d(String str, long j, long j2) {
        this.f32886a.post(new sq2(this, str, j, j2));
    }

    /* renamed from: e */
    public final void m4819e(as2 as2Var) {
        this.f32886a.post(new vq2(this, as2Var));
    }

    /* renamed from: f */
    public final void m4818f(as2 as2Var) {
        this.f32886a.post(new rq2(this, as2Var));
    }

    /* renamed from: g */
    public final void m4817g(zzatd zzatdVar) {
        this.f32886a.post(new tq2(this, zzatdVar));
    }
}
