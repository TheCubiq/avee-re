package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhv;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzkq {
    private static final zzkq zza = new zzkq(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    public static zzkq zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzkq zzb() {
        return new zzkq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzkq zza(zzkq zzkqVar, zzkq zzkqVar2) {
        int i = zzkqVar.zzb + zzkqVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzkqVar.zzc, i);
        System.arraycopy(zzkqVar2.zzc, 0, copyOf, zzkqVar.zzb, zzkqVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzkqVar.zzd, i);
        System.arraycopy(zzkqVar2.zzd, 0, copyOf2, zzkqVar.zzb, zzkqVar2.zzb);
        return new zzkq(i, copyOf, copyOf2, true);
    }

    private zzkq() {
        this(0, new int[8], new Object[8], true);
    }

    private zzkq(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public final void zzc() {
        this.zzf = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzlk zzlkVar) throws IOException {
        if (zzlkVar.zza() == zzhv.zze.zzk) {
            for (int i = this.zzb - 1; i >= 0; i--) {
                zzlkVar.zza(this.zzc[i] >>> 3, this.zzd[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzlkVar.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    public final void zzb(zzlk zzlkVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zzlkVar.zza() == zzhv.zze.zzj) {
            for (int i = 0; i < this.zzb; i++) {
                zza(this.zzc[i], this.zzd[i], zzlkVar);
            }
            return;
        }
        for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
            zza(this.zzc[i2], this.zzd[i2], zzlkVar);
        }
    }

    private static void zza(int i, Object obj, zzlk zzlkVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzlkVar.zza(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzlkVar.zzd(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzlkVar.zza(i2, (zzgm) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzlkVar.zzd(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzig.zzf());
        } else if (zzlkVar.zza() == zzhv.zze.zzj) {
            zzlkVar.zza(i2);
            ((zzkq) obj).zzb(zzlkVar);
            zzlkVar.zzb(i2);
        } else {
            zzlkVar.zzb(i2);
            ((zzkq) obj).zzb(zzlkVar);
            zzlkVar.zza(i2);
        }
    }

    public final int zzd() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            i2 += zzhf.zzd(this.zzc[i3] >>> 3, (zzgm) this.zzd[i3]);
        }
        this.zze = i2;
        return i2;
    }

    public final int zze() {
        int zze;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zze = zzhf.zze(i5, ((Long) this.zzd[i3]).longValue());
            } else if (i6 == 1) {
                zze = zzhf.zzg(i5, ((Long) this.zzd[i3]).longValue());
            } else if (i6 == 2) {
                zze = zzhf.zzc(i5, (zzgm) this.zzd[i3]);
            } else if (i6 == 3) {
                zze = (zzhf.zze(i5) << 1) + ((zzkq) this.zzd[i3]).zze();
            } else if (i6 == 5) {
                zze = zzhf.zzi(i5, ((Integer) this.zzd[i3]).intValue());
            } else {
                throw new IllegalStateException(zzig.zzf());
            }
            i2 += zze;
        }
        this.zze = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzkq)) {
            zzkq zzkqVar = (zzkq) obj;
            int i = this.zzb;
            if (i == zzkqVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzkqVar.zzc;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = true;
                        break;
                    } else if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzkqVar.zzd;
                    int i3 = this.zzb;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            z2 = true;
                            break;
                        } else if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzjh.zza(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, Object obj) {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.zzb;
        if (i2 == this.zzc.length) {
            int i3 = this.zzb + (i2 < 4 ? 8 : i2 >> 1);
            this.zzc = Arrays.copyOf(this.zzc, i3);
            this.zzd = Arrays.copyOf(this.zzd, i3);
        }
        int[] iArr = this.zzc;
        int i4 = this.zzb;
        iArr[i4] = i;
        this.zzd[i4] = obj;
        this.zzb = i4 + 1;
    }
}
