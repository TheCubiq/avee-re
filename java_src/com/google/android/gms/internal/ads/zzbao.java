package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzbao extends zzban {
    protected final byte[] zzdpw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbao(byte[] bArr) {
        this.zzdpw = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzbah) && size() == ((zzbah) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (obj instanceof zzbao) {
                zzbao zzbaoVar = (zzbao) obj;
                int zzabg = zzabg();
                int zzabg2 = zzbaoVar.zzabg();
                if (zzabg == 0 || zzabg2 == 0 || zzabg == zzabg2) {
                    return zza(zzbaoVar, 0, size());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    public int size() {
        return this.zzdpw.length;
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    protected final String zza(Charset charset) {
        return new String(this.zzdpw, zzabh(), size(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbah
    public final void zza(zzbag zzbagVar) throws IOException {
        zzbagVar.zzb(this.zzdpw, zzabh(), size());
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    protected void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzdpw, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzban
    final boolean zza(zzbah zzbahVar, int i, int i2) {
        if (i2 > zzbahVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzbahVar.size()) {
            int size2 = zzbahVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (zzbahVar instanceof zzbao) {
            zzbao zzbaoVar = (zzbao) zzbahVar;
            byte[] bArr = this.zzdpw;
            byte[] bArr2 = zzbaoVar.zzdpw;
            int zzabh = zzabh() + i2;
            int zzabh2 = zzabh();
            int zzabh3 = zzbaoVar.zzabh();
            while (zzabh2 < zzabh) {
                if (bArr[zzabh2] != bArr2[zzabh3]) {
                    return false;
                }
                zzabh2++;
                zzabh3++;
            }
            return true;
        } else {
            return zzbahVar.zzk(0, i2).equals(zzk(0, i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    public final boolean zzabe() {
        int zzabh = zzabh();
        return zzbem.zzf(this.zzdpw, zzabh, size() + zzabh);
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    public final zzbaq zzabf() {
        return zzbaq.zza(this.zzdpw, zzabh(), size(), true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int zzabh() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    public byte zzbn(int i) {
        return this.zzdpw[i];
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    protected final int zzc(int i, int i2, int i3) {
        return zzbbq.zza(i, this.zzdpw, zzabh(), i3);
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    public final zzbah zzk(int i, int i2) {
        int zzd = zzd(0, i2, size());
        return zzd == 0 ? zzbah.zzdpq : new zzbak(this.zzdpw, zzabh(), zzd);
    }
}
