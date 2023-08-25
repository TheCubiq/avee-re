package com.daaw;

import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzatd;
import java.util.Objects;
/* loaded from: classes.dex */
public final class k03 {

    /* renamed from: a */
    public final Handler f15575a;

    /* renamed from: b */
    public final l03 f15576b;

    public k03(Handler handler, l03 l03Var) {
        Objects.requireNonNull(handler);
        this.f15575a = handler;
        this.f15576b = l03Var;
    }

    /* renamed from: b */
    public final void m18097b(String str, long j, long j2) {
        this.f15575a.post(new e03(this, str, j, j2));
    }

    /* renamed from: c */
    public final void m18096c(as2 as2Var) {
        this.f15575a.post(new j03(this, as2Var));
    }

    /* renamed from: d */
    public final void m18095d(int i, long j) {
        this.f15575a.post(new g03(this, i, j));
    }

    /* renamed from: e */
    public final void m18094e(as2 as2Var) {
        this.f15575a.post(new d03(this, as2Var));
    }

    /* renamed from: f */
    public final void m18093f(zzatd zzatdVar) {
        this.f15575a.post(new f03(this, zzatdVar));
    }

    /* renamed from: g */
    public final void m18092g(Surface surface) {
        this.f15575a.post(new i03(this, surface));
    }

    /* renamed from: h */
    public final void m18091h(int i, int i2, int i3, float f) {
        this.f15575a.post(new h03(this, i, i2, i3, f));
    }
}
