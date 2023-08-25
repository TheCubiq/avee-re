package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.y62;
/* loaded from: classes.dex */
public final class zzacx extends zzade {
    public static final Parcelable.Creator<zzacx> CREATOR = new y62();
    public final String q;
    public final String r;
    public final String s;

    public zzacx(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = it5.a;
        this.q = readString;
        this.r = parcel.readString();
        this.s = parcel.readString();
    }

    public zzacx(String str, String str2, String str3) {
        super("COMM");
        this.q = str;
        this.r = str2;
        this.s = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacx.class == obj.getClass()) {
            zzacx zzacxVar = (zzacx) obj;
            if (it5.t(this.r, zzacxVar.r) && it5.t(this.q, zzacxVar.q) && it5.t(this.s, zzacxVar.s)) {
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

    @Override // com.google.android.gms.internal.ads.zzade
    public final String toString() {
        String str = this.p;
        String str2 = this.q;
        String str3 = this.r;
        return str + ": language=" + str2 + ", description=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.s);
    }
}
