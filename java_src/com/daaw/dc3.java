package com.daaw;

import android.graphics.drawable.Drawable;
import android.net.Uri;
/* loaded from: classes.dex */
public final class dc3 extends uc3 {

    /* renamed from: p */
    public final Drawable f6922p;

    /* renamed from: q */
    public final Uri f6923q;

    /* renamed from: r */
    public final double f6924r;

    /* renamed from: s */
    public final int f6925s;

    /* renamed from: t */
    public final int f6926t;

    public dc3(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.f6922p = drawable;
        this.f6923q = uri;
        this.f6924r = d;
        this.f6925s = i;
        this.f6926t = i2;
    }

    @Override // com.daaw.vc3
    public final double zzb() {
        return this.f6924r;
    }

    @Override // com.daaw.vc3
    public final int zzc() {
        return this.f6926t;
    }

    @Override // com.daaw.vc3
    public final int zzd() {
        return this.f6925s;
    }

    @Override // com.daaw.vc3
    public final Uri zze() {
        return this.f6923q;
    }

    @Override // com.daaw.vc3
    public final yd0 zzf() {
        return nt0.m14830g3(this.f6922p);
    }
}
