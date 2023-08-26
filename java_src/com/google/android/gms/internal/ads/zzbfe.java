package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzbfe implements Cloneable {
    private static final zzbff zzebm = new zzbff();
    private int mSize;
    private boolean zzebn;
    private int[] zzebo;
    private zzbff[] zzebp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfe() {
        this(10);
    }

    private zzbfe(int i) {
        this.zzebn = false;
        int idealIntArraySize = idealIntArraySize(i);
        this.zzebo = new int[idealIntArraySize];
        this.zzebp = new zzbff[idealIntArraySize];
        this.mSize = 0;
    }

    private static int idealIntArraySize(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    private final int zzdh(int i) {
        int i2 = this.mSize - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.zzebo[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ (-1);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.mSize;
        zzbfe zzbfeVar = new zzbfe(i);
        System.arraycopy(this.zzebo, 0, zzbfeVar.zzebo, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            zzbff[] zzbffVarArr = this.zzebp;
            if (zzbffVarArr[i2] != null) {
                zzbfeVar.zzebp[i2] = (zzbff) zzbffVarArr[i2].clone();
            }
        }
        zzbfeVar.mSize = i;
        return zzbfeVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbfe) {
            zzbfe zzbfeVar = (zzbfe) obj;
            int i = this.mSize;
            if (i != zzbfeVar.mSize) {
                return false;
            }
            int[] iArr = this.zzebo;
            int[] iArr2 = zzbfeVar.zzebo;
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
                zzbff[] zzbffVarArr = this.zzebp;
                zzbff[] zzbffVarArr2 = zzbfeVar.zzebp;
                int i3 = this.mSize;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!zzbffVarArr[i4].equals(zzbffVarArr2[i4])) {
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
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.mSize; i2++) {
            i = (((i * 31) + this.zzebo[i2]) * 31) + this.zzebp[i2].hashCode();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int size() {
        return this.mSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, zzbff zzbffVar) {
        int zzdh = zzdh(i);
        if (zzdh >= 0) {
            this.zzebp[zzdh] = zzbffVar;
            return;
        }
        int i2 = zzdh ^ (-1);
        if (i2 < this.mSize) {
            zzbff[] zzbffVarArr = this.zzebp;
            if (zzbffVarArr[i2] == zzebm) {
                this.zzebo[i2] = i;
                zzbffVarArr[i2] = zzbffVar;
                return;
            }
        }
        int i3 = this.mSize;
        if (i3 >= this.zzebo.length) {
            int idealIntArraySize = idealIntArraySize(i3 + 1);
            int[] iArr = new int[idealIntArraySize];
            zzbff[] zzbffVarArr2 = new zzbff[idealIntArraySize];
            int[] iArr2 = this.zzebo;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            zzbff[] zzbffVarArr3 = this.zzebp;
            System.arraycopy(zzbffVarArr3, 0, zzbffVarArr2, 0, zzbffVarArr3.length);
            this.zzebo = iArr;
            this.zzebp = zzbffVarArr2;
        }
        int i4 = this.mSize;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.zzebo;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            zzbff[] zzbffVarArr4 = this.zzebp;
            System.arraycopy(zzbffVarArr4, i2, zzbffVarArr4, i5, this.mSize - i2);
        }
        this.zzebo[i2] = i;
        this.zzebp[i2] = zzbffVar;
        this.mSize++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbff zzdf(int i) {
        int zzdh = zzdh(i);
        if (zzdh >= 0) {
            zzbff[] zzbffVarArr = this.zzebp;
            if (zzbffVarArr[zzdh] == zzebm) {
                return null;
            }
            return zzbffVarArr[zzdh];
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbff zzdg(int i) {
        return this.zzebp[i];
    }
}
