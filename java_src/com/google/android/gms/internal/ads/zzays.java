package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzays {
    private final zzazh zzdnk;
    private final zzazh zzdnl;

    public zzays(byte[] bArr, byte[] bArr2) {
        this.zzdnk = zzazh.zzm(bArr);
        this.zzdnl = zzazh.zzm(bArr2);
    }

    public final byte[] zzaap() {
        zzazh zzazhVar = this.zzdnk;
        if (zzazhVar == null) {
            return null;
        }
        return zzazhVar.getBytes();
    }

    public final byte[] zzaaq() {
        zzazh zzazhVar = this.zzdnl;
        if (zzazhVar == null) {
            return null;
        }
        return zzazhVar.getBytes();
    }
}
