package com.daaw;

import android.graphics.drawable.Drawable;
import android.net.Uri;
/* loaded from: classes.dex */
public final class dc3 extends uc3 {
    public final Drawable p;
    public final Uri q;
    public final double r;
    public final int s;
    public final int t;

    public dc3(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.p = drawable;
        this.q = uri;
        this.r = d;
        this.s = i;
        this.t = i2;
    }

    @Override // com.daaw.vc3
    public final double zzb() {
        return this.r;
    }

    @Override // com.daaw.vc3
    public final int zzc() {
        return this.t;
    }

    @Override // com.daaw.vc3
    public final int zzd() {
        return this.s;
    }

    @Override // com.daaw.vc3
    public final Uri zze() {
        return this.q;
    }

    @Override // com.daaw.vc3
    public final yd0 zzf() {
        return nt0.g3(this.p);
    }
}
