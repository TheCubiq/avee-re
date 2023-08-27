package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzkr implements zzfc {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzkp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkr(zzkp zzkpVar, String str) {
        this.zzb = zzkpVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.zzb.zza(i, th, bArr, this.zza);
    }
}
