package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.fv2;
import com.daaw.pz2;
/* loaded from: classes.dex */
public final class zzaxw extends zzaxu {
    public static final Parcelable.Creator<zzaxw> CREATOR = new fv2();
    public final String q;
    public final String r;

    public zzaxw(Parcel parcel) {
        super(parcel.readString());
        this.q = parcel.readString();
        this.r = parcel.readString();
    }

    public zzaxw(String str, String str2, String str3) {
        super(str);
        this.q = null;
        this.r = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxw.class == obj.getClass()) {
            zzaxw zzaxwVar = (zzaxw) obj;
            if (this.p.equals(zzaxwVar.p) && pz2.o(this.q, zzaxwVar.q) && pz2.o(this.r, zzaxwVar.r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.p.hashCode() + 527) * 31;
        String str = this.q;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.r;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
    }
}
