package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.dv2;
import com.daaw.pz2;
/* loaded from: classes.dex */
public final class zzaxs extends zzaxu {
    public static final Parcelable.Creator<zzaxs> CREATOR = new dv2();
    public final String q;
    public final String r;
    public final String s;

    public zzaxs(Parcel parcel) {
        super("COMM");
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readString();
    }

    public zzaxs(String str, String str2, String str3) {
        super("COMM");
        this.q = "und";
        this.r = str2;
        this.s = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxs.class == obj.getClass()) {
            zzaxs zzaxsVar = (zzaxs) obj;
            if (pz2.o(this.r, zzaxsVar.r) && pz2.o(this.q, zzaxsVar.q) && pz2.o(this.s, zzaxsVar.s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.q;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.r;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.s;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.s);
    }
}
