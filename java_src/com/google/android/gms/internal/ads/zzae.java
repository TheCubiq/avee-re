package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public class zzae extends Exception {
    private long zzad;
    private final zzp zzbj;

    public zzae() {
        this.zzbj = null;
    }

    public zzae(zzp zzpVar) {
        this.zzbj = zzpVar;
    }

    public zzae(String str) {
        super(str);
        this.zzbj = null;
    }

    public zzae(Throwable th) {
        super(th);
        this.zzbj = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(long j) {
        this.zzad = j;
    }
}
