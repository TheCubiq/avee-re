package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.cv2;
import com.daaw.pz2;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzaxq extends zzaxu {
    public static final Parcelable.Creator<zzaxq> CREATOR = new cv2();
    public final String q;
    public final String r;
    public final int s;
    public final byte[] t;

    public zzaxq(Parcel parcel) {
        super("APIC");
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readInt();
        this.t = parcel.createByteArray();
    }

    public zzaxq(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.q = str;
        this.r = null;
        this.s = 3;
        this.t = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxq.class == obj.getClass()) {
            zzaxq zzaxqVar = (zzaxq) obj;
            if (this.s == zzaxqVar.s && pz2.o(this.q, zzaxqVar.q) && pz2.o(this.r, zzaxqVar.r) && Arrays.equals(this.t, zzaxqVar.t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.s + 527) * 31;
        String str = this.q;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.r;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeInt(this.s);
        parcel.writeByteArray(this.t);
    }
}
