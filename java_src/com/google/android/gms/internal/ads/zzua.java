package com.google.android.gms.internal.ads;

import android.os.Bundle;
@zzadh
/* loaded from: classes2.dex */
public final class zzua {
    private static zzua zzbox = new zzua();
    private int zzboy;
    private int zzboz;
    private int zzbpa;
    private int zzbpb;
    private int zzbpc;

    public static zzua zzlk() {
        return zzbox;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzll() {
        this.zzboz++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzlm() {
        this.zzbpa++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzln() {
        this.zzbpb++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzlo() {
        this.zzbpc++;
    }

    public final int zzlp() {
        return this.zzboz;
    }

    public final int zzlq() {
        return this.zzbpa;
    }

    public final int zzlr() {
        return this.zzbpb;
    }

    public final int zzls() {
        return this.zzbpc;
    }

    public final Bundle zzlt() {
        Bundle bundle = new Bundle();
        bundle.putInt("ipl", this.zzboy);
        bundle.putInt("ipds", this.zzboz);
        bundle.putInt("ipde", this.zzbpa);
        bundle.putInt("iph", this.zzbpb);
        bundle.putInt("ipm", this.zzbpc);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzw(int i) {
        this.zzboy += i;
    }
}
