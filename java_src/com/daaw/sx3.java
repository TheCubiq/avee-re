package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class sx3 implements q03 {
    public final Context p;
    public final Object q;
    public final String r;
    public boolean s;

    public sx3(Context context, String str) {
        this.p = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.r = str;
        this.s = false;
        this.q = new Object();
    }

    public final String b() {
        return this.r;
    }

    public final void c(boolean z) {
        if (zzt.zzn().z(this.p)) {
            synchronized (this.q) {
                if (this.s == z) {
                    return;
                }
                this.s = z;
                if (TextUtils.isEmpty(this.r)) {
                    return;
                }
                if (this.s) {
                    zzt.zzn().m(this.p, this.r);
                } else {
                    zzt.zzn().n(this.p, this.r);
                }
            }
        }
    }

    @Override // com.daaw.q03
    public final void e0(p03 p03Var) {
        c(p03Var.j);
    }
}
