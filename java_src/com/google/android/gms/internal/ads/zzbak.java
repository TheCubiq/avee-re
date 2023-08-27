package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzbak extends zzbao {
    private final int zzdpt;
    private final int zzdpu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbak(byte[] bArr, int i, int i2) {
        super(bArr);
        zzd(i, i + i2, bArr.length);
        this.zzdpt = i;
        this.zzdpu = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbao, com.google.android.gms.internal.ads.zzbah
    public final int size() {
        return this.zzdpu;
    }

    @Override // com.google.android.gms.internal.ads.zzbao, com.google.android.gms.internal.ads.zzbah
    protected final void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzdpw, zzabh(), bArr, 0, i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbao
    public final int zzabh() {
        return this.zzdpt;
    }

    @Override // com.google.android.gms.internal.ads.zzbao, com.google.android.gms.internal.ads.zzbah
    public final byte zzbn(int i) {
        int size = size();
        if (((size - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(size);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.zzdpw[this.zzdpt + i];
    }
}
