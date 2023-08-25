package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.cv2;
import com.daaw.pz2;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzaxq extends zzaxu {
    public static final Parcelable.Creator<zzaxq> CREATOR = new cv2();

    /* renamed from: q */
    public final String f36809q;

    /* renamed from: r */
    public final String f36810r;

    /* renamed from: s */
    public final int f36811s;

    /* renamed from: t */
    public final byte[] f36812t;

    public zzaxq(Parcel parcel) {
        super("APIC");
        this.f36809q = parcel.readString();
        this.f36810r = parcel.readString();
        this.f36811s = parcel.readInt();
        this.f36812t = parcel.createByteArray();
    }

    public zzaxq(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f36809q = str;
        this.f36810r = null;
        this.f36811s = 3;
        this.f36812t = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxq.class == obj.getClass()) {
            zzaxq zzaxqVar = (zzaxq) obj;
            if (this.f36811s == zzaxqVar.f36811s && pz2.m12835o(this.f36809q, zzaxqVar.f36809q) && pz2.m12835o(this.f36810r, zzaxqVar.f36810r) && Arrays.equals(this.f36812t, zzaxqVar.f36812t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f36811s + 527) * 31;
        String str = this.f36809q;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36810r;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f36812t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36809q);
        parcel.writeString(this.f36810r);
        parcel.writeInt(this.f36811s);
        parcel.writeByteArray(this.f36812t);
    }
}
