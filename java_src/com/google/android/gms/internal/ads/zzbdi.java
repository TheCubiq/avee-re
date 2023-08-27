package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbdi implements zzbcs {
    private final String info;
    private final zzbcu zzdwl;
    private final zzbdj zzdxe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdi(zzbcu zzbcuVar, String str, Object[] objArr) {
        this.zzdwl = zzbcuVar;
        this.info = str;
        this.zzdxe = new zzbdj(zzbcuVar.getClass(), str, objArr);
    }

    public final int getFieldCount() {
        int i;
        i = this.zzdxe.zzdxh;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbcs
    public final int zzaeh() {
        int i;
        i = this.zzdxe.flags;
        return (i & 1) == 1 ? zzbbo.zze.zzdui : zzbbo.zze.zzduj;
    }

    @Override // com.google.android.gms.internal.ads.zzbcs
    public final boolean zzaei() {
        int i;
        i = this.zzdxe.flags;
        return (i & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.zzbcs
    public final zzbcu zzaej() {
        return this.zzdwl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbdj zzaeq() {
        return this.zzdxe;
    }

    public final int zzaer() {
        int i;
        i = this.zzdxe.zzdwi;
        return i;
    }

    public final int zzaes() {
        int i;
        i = this.zzdxe.zzdwj;
        return i;
    }

    public final int zzaet() {
        int i;
        i = this.zzdxe.zzdxk;
        return i;
    }

    public final int zzaeu() {
        int i;
        i = this.zzdxe.zzdxm;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int[] zzaev() {
        int[] iArr;
        iArr = this.zzdxe.zzdwq;
        return iArr;
    }

    public final int zzaew() {
        int i;
        i = this.zzdxe.zzdxl;
        return i;
    }

    public final int zzaex() {
        int i;
        i = this.zzdxe.zzdwk;
        return i;
    }
}
