package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.fv2;
import com.daaw.pz2;
/* loaded from: classes.dex */
public final class zzaxw extends zzaxu {
    public static final Parcelable.Creator<zzaxw> CREATOR = new fv2();

    /* renamed from: q */
    public final String f36817q;

    /* renamed from: r */
    public final String f36818r;

    public zzaxw(Parcel parcel) {
        super(parcel.readString());
        this.f36817q = parcel.readString();
        this.f36818r = parcel.readString();
    }

    public zzaxw(String str, String str2, String str3) {
        super(str);
        this.f36817q = null;
        this.f36818r = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxw.class == obj.getClass()) {
            zzaxw zzaxwVar = (zzaxw) obj;
            if (this.f36816p.equals(zzaxwVar.f36816p) && pz2.m12835o(this.f36817q, zzaxwVar.f36817q) && pz2.m12835o(this.f36818r, zzaxwVar.f36818r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f36816p.hashCode() + 527) * 31;
        String str = this.f36817q;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36818r;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36816p);
        parcel.writeString(this.f36817q);
        parcel.writeString(this.f36818r);
    }
}
