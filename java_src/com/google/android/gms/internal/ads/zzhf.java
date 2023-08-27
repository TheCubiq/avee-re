package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhf implements zzgj {
    private final /* synthetic */ zzhd zzajt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhf(zzhd zzhdVar) {
        this.zzajt = zzhdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzh(boolean z) {
        if (z) {
            this.zzajt.connect();
        } else {
            this.zzajt.disconnect();
        }
    }
}
