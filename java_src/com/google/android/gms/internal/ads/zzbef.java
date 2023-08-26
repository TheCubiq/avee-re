package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class zzbef {
    private static final zzbef zzdyx = new zzbef(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzdpi;
    private int zzdtu;
    private Object[] zzdwh;
    private int[] zzdyy;

    private zzbef() {
        this(0, new int[8], new Object[8], true);
    }

    private zzbef(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzdtu = -1;
        this.count = i;
        this.zzdyy = iArr;
        this.zzdwh = objArr;
        this.zzdpi = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbef zza(zzbef zzbefVar, zzbef zzbefVar2) {
        int i = zzbefVar.count + zzbefVar2.count;
        int[] copyOf = Arrays.copyOf(zzbefVar.zzdyy, i);
        System.arraycopy(zzbefVar2.zzdyy, 0, copyOf, zzbefVar.count, zzbefVar2.count);
        Object[] copyOf2 = Arrays.copyOf(zzbefVar.zzdwh, i);
        System.arraycopy(zzbefVar2.zzdwh, 0, copyOf2, zzbefVar.count, zzbefVar2.count);
        return new zzbef(i, copyOf, copyOf2, true);
    }

    public static zzbef zzagc() {
        return zzdyx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbef zzagd() {
        return new zzbef();
    }

    private static void zzb(int i, Object obj, zzbey zzbeyVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzbeyVar.zzi(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzbeyVar.zzc(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzbeyVar.zza(i2, (zzbah) obj);
        } else if (i3 != 3) {
            if (i3 != 5) {
                throw new RuntimeException(zzbbu.zzadq());
            }
            zzbeyVar.zzp(i2, ((Integer) obj).intValue());
        } else if (zzbeyVar.zzacn() == zzbbo.zze.zzdul) {
            zzbeyVar.zzcm(i2);
            ((zzbef) obj).zzb(zzbeyVar);
            zzbeyVar.zzcn(i2);
        } else {
            zzbeyVar.zzcn(i2);
            ((zzbef) obj).zzb(zzbeyVar);
            zzbeyVar.zzcm(i2);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzbef)) {
            zzbef zzbefVar = (zzbef) obj;
            int i = this.count;
            if (i == zzbefVar.count) {
                int[] iArr = this.zzdyy;
                int[] iArr2 = zzbefVar.zzdyy;
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
                    Object[] objArr = this.zzdwh;
                    Object[] objArr2 = zzbefVar.zzdwh;
                    int i3 = this.count;
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
        int i = this.count;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzdyy;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzdwh;
        int i7 = this.count;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzbey zzbeyVar) throws IOException {
        if (zzbeyVar.zzacn() == zzbbo.zze.zzdum) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzbeyVar.zza(this.zzdyy[i] >>> 3, this.zzdwh[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzbeyVar.zza(this.zzdyy[i2] >>> 3, this.zzdwh[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzbcx.zza(sb, i, String.valueOf(this.zzdyy[i2] >>> 3), this.zzdwh[i2]);
        }
    }

    public final void zzaaz() {
        this.zzdpi = false;
    }

    public final int zzacw() {
        int zze;
        int i = this.zzdtu;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.zzdyy[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zze = zzbav.zze(i5, ((Long) this.zzdwh[i3]).longValue());
            } else if (i6 == 1) {
                zze = zzbav.zzg(i5, ((Long) this.zzdwh[i3]).longValue());
            } else if (i6 == 2) {
                zze = zzbav.zzc(i5, (zzbah) this.zzdwh[i3]);
            } else if (i6 == 3) {
                zze = (zzbav.zzcd(i5) << 1) + ((zzbef) this.zzdwh[i3]).zzacw();
            } else if (i6 != 5) {
                throw new IllegalStateException(zzbbu.zzadq());
            } else {
                zze = zzbav.zzt(i5, ((Integer) this.zzdwh[i3]).intValue());
            }
            i2 += zze;
        }
        this.zzdtu = i2;
        return i2;
    }

    public final int zzage() {
        int i = this.zzdtu;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += zzbav.zzd(this.zzdyy[i3] >>> 3, (zzbah) this.zzdwh[i3]);
        }
        this.zzdtu = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(int i, Object obj) {
        if (!this.zzdpi) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.count;
        if (i2 == this.zzdyy.length) {
            int i3 = this.count + (i2 < 4 ? 8 : i2 >> 1);
            this.zzdyy = Arrays.copyOf(this.zzdyy, i3);
            this.zzdwh = Arrays.copyOf(this.zzdwh, i3);
        }
        int[] iArr = this.zzdyy;
        int i4 = this.count;
        iArr[i4] = i;
        this.zzdwh[i4] = obj;
        this.count = i4 + 1;
    }

    public final void zzb(zzbey zzbeyVar) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (zzbeyVar.zzacn() == zzbbo.zze.zzdul) {
            for (int i = 0; i < this.count; i++) {
                zzb(this.zzdyy[i], this.zzdwh[i], zzbeyVar);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            zzb(this.zzdyy[i2], this.zzdwh[i2], zzbeyVar);
        }
    }
}
