package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.v62;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzacr extends zzade {
    public static final Parcelable.Creator<zzacr> CREATOR = new v62();
    public final byte[] q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzacr(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.daaw.it5.a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            java.lang.Object r3 = com.daaw.it5.h(r3)
            byte[] r3 = (byte[]) r3
            r2.q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacr.<init>(android.os.Parcel):void");
    }

    public zzacr(String str, byte[] bArr) {
        super(str);
        this.q = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacr.class == obj.getClass()) {
            zzacr zzacrVar = (zzacr) obj;
            if (this.p.equals(zzacrVar.p) && Arrays.equals(this.q, zzacrVar.q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.p.hashCode() + 527) * 31) + Arrays.hashCode(this.q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeByteArray(this.q);
    }
}
