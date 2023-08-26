package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzgu {
    private final zzhf zza;
    private final byte[] zzb;

    private zzgu(int i) {
        byte[] bArr = new byte[i];
        this.zzb = bArr;
        this.zza = zzhf.zza(bArr);
    }

    public final zzgm zza() {
        this.zza.zzb();
        return new zzgw(this.zzb);
    }

    public final zzhf zzb() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgu(int i, zzgp zzgpVar) {
        this(i);
    }
}
