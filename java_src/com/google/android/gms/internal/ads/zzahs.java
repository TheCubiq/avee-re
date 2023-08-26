package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzahs {
    private int mErrorCode;
    private String zzbth;
    private String zzcly;
    private long zzclz;

    public final zzahs zzad(int i) {
        this.mErrorCode = i;
        return this;
    }

    public final zzahs zzcc(String str) {
        this.zzbth = str;
        return this;
    }

    public final zzahs zzcd(String str) {
        this.zzcly = str;
        return this;
    }

    public final zzahs zzg(long j) {
        this.zzclz = j;
        return this;
    }

    public final zzahq zzpd() {
        return new zzahq(this);
    }
}
