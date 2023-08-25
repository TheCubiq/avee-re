package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class sx3 implements q03 {

    /* renamed from: p */
    public final Context f26741p;

    /* renamed from: q */
    public final Object f26742q;

    /* renamed from: r */
    public final String f26743r;

    /* renamed from: s */
    public boolean f26744s;

    public sx3(Context context, String str) {
        this.f26741p = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f26743r = str;
        this.f26744s = false;
        this.f26742q = new Object();
    }

    /* renamed from: b */
    public final String m9784b() {
        return this.f26743r;
    }

    /* renamed from: c */
    public final void m9783c(boolean z) {
        if (zzt.zzn().m17317z(this.f26741p)) {
            synchronized (this.f26742q) {
                if (this.f26744s == z) {
                    return;
                }
                this.f26744s = z;
                if (TextUtils.isEmpty(this.f26743r)) {
                    return;
                }
                if (this.f26744s) {
                    zzt.zzn().m17330m(this.f26741p, this.f26743r);
                } else {
                    zzt.zzn().m17329n(this.f26741p, this.f26743r);
                }
            }
        }
    }

    @Override // com.daaw.q03
    /* renamed from: e0 */
    public final void mo6420e0(p03 p03Var) {
        m9783c(p03Var.f22185j);
    }
}
