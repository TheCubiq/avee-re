package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class zzbfk {
    final int tag;
    final byte[] zzdpw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfk(int i, byte[] bArr) {
        this.tag = i;
        this.zzdpw = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbfk) {
            zzbfk zzbfkVar = (zzbfk) obj;
            return this.tag == zzbfkVar.tag && Arrays.equals(this.zzdpw, zzbfkVar.zzdpw);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.tag + 527) * 31) + Arrays.hashCode(this.zzdpw);
    }
}
