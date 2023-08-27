package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
@zzadh
/* loaded from: classes2.dex */
final class zzajk {
    private long zzcpc = -1;
    private long zzcpd = -1;

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzcpc);
        bundle.putLong("tclose", this.zzcpd);
        return bundle;
    }

    public final long zzpp() {
        return this.zzcpd;
    }

    public final void zzpq() {
        this.zzcpd = SystemClock.elapsedRealtime();
    }

    public final void zzpr() {
        this.zzcpc = SystemClock.elapsedRealtime();
    }
}
