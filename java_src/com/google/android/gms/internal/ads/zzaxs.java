package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.dv2;
import com.daaw.pz2;
/* loaded from: classes.dex */
public final class zzaxs extends zzaxu {
    public static final Parcelable.Creator<zzaxs> CREATOR = new dv2();

    /* renamed from: q */
    public final String f36813q;

    /* renamed from: r */
    public final String f36814r;

    /* renamed from: s */
    public final String f36815s;

    public zzaxs(Parcel parcel) {
        super("COMM");
        this.f36813q = parcel.readString();
        this.f36814r = parcel.readString();
        this.f36815s = parcel.readString();
    }

    public zzaxs(String str, String str2, String str3) {
        super("COMM");
        this.f36813q = "und";
        this.f36814r = str2;
        this.f36815s = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxs.class == obj.getClass()) {
            zzaxs zzaxsVar = (zzaxs) obj;
            if (pz2.m12835o(this.f36814r, zzaxsVar.f36814r) && pz2.m12835o(this.f36813q, zzaxsVar.f36813q) && pz2.m12835o(this.f36815s, zzaxsVar.f36815s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f36813q;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f36814r;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36815s;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36816p);
        parcel.writeString(this.f36813q);
        parcel.writeString(this.f36815s);
    }
}
