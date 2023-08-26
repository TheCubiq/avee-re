package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaly extends zzav {
    private final /* synthetic */ byte[] zzctk;
    private final /* synthetic */ Map zzctl;
    private final /* synthetic */ zzamy zzctm;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaly(zzalt zzaltVar, int i, String str, zzz zzzVar, zzy zzyVar, byte[] bArr, Map map, zzamy zzamyVar) {
        super(i, str, zzzVar, zzyVar);
        this.zzctk = bArr;
        this.zzctl = map;
        this.zzctm = zzamyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final Map<String, String> getHeaders() throws zza {
        Map<String, String> map = this.zzctl;
        return map == null ? super.getHeaders() : map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzav, com.google.android.gms.internal.ads.zzr
    public final /* synthetic */ void zza(String str) {
        zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final byte[] zzg() throws zza {
        byte[] bArr = this.zzctk;
        return bArr == null ? super.zzg() : bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzav
    public final void zzh(String str) {
        this.zzctm.zzdg(str);
        super.zza(str);
    }
}
