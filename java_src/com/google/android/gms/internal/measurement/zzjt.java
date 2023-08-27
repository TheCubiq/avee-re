package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhv;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzjt implements zzje {
    private final zzjg zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjt(zzjg zzjgVar, String str, Object[] objArr) {
        this.zza = zzjgVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.zzd = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final zzjg zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final int zza() {
        return (this.zzd & 1) == 1 ? zzhv.zze.zzh : zzhv.zze.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }
}
