package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public class zzgw extends zzgx {
    protected final byte[] zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgw(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.zzb = bArr;
    }

    protected int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzgm
    public byte zza(int i) {
        return this.zzb[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzgm
    public byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzgm
    public int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzgm
    public final zzgm zza(int i, int i2) {
        int zzb = zzb(0, i2, zza());
        if (zzb == 0) {
            return zzgm.zza;
        }
        return new zzgt(this.zzb, zze(), zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzgm
    public final void zza(zzgn zzgnVar) throws IOException {
        zzgnVar.zza(this.zzb, zze(), zza());
    }

    @Override // com.google.android.gms.internal.measurement.zzgm
    protected final String zza(Charset charset) {
        return new String(this.zzb, zze(), zza(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzgm
    public final boolean zzc() {
        int zze = zze();
        return zzkw.zza(this.zzb, zze, zza() + zze);
    }

    @Override // com.google.android.gms.internal.measurement.zzgm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgm) && zza() == ((zzgm) obj).zza()) {
            if (zza() == 0) {
                return true;
            }
            if (obj instanceof zzgw) {
                zzgw zzgwVar = (zzgw) obj;
                int zzd = zzd();
                int zzd2 = zzgwVar.zzd();
                if (zzd == 0 || zzd2 == 0 || zzd == zzd2) {
                    return zza(zzgwVar, 0, zza());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    final boolean zza(zzgm zzgmVar, int i, int i2) {
        if (i2 > zzgmVar.zza()) {
            int zza = zza();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(zza);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzgmVar.zza()) {
            int zza2 = zzgmVar.zza();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(zza2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (zzgmVar instanceof zzgw) {
            zzgw zzgwVar = (zzgw) zzgmVar;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzgwVar.zzb;
            int zze = zze() + i2;
            int zze2 = zze();
            int zze3 = zzgwVar.zze();
            while (zze2 < zze) {
                if (bArr[zze2] != bArr2[zze3]) {
                    return false;
                }
                zze2++;
                zze3++;
            }
            return true;
        } else {
            return zzgmVar.zza(0, i2).equals(zza(0, i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgm
    protected final int zza(int i, int i2, int i3) {
        return zzhx.zza(i, this.zzb, zze(), i3);
    }
}
