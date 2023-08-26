package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbam {
    private final byte[] buffer;
    private final zzbav zzdpv;

    private zzbam(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzdpv = zzbav.zzq(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbam(int i, zzbai zzbaiVar) {
        this(i);
    }

    public final zzbah zzabi() {
        this.zzdpv.zzacl();
        return new zzbao(this.buffer);
    }

    public final zzbav zzabj() {
        return this.zzdpv;
    }
}
