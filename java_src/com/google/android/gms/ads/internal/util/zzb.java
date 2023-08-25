package com.google.android.gms.ads.internal.util;

import com.daaw.f77;
import com.daaw.h32;
import com.daaw.z04;
/* loaded from: classes.dex */
public abstract class zzb {
    public final Runnable a = new h32(this);
    public volatile Thread b;

    public abstract void zza();

    public f77 zzb() {
        return z04.a.P(this.a);
    }
}
