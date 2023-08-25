package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.z62;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzacz extends zzade {
    public static final Parcelable.Creator<zzacz> CREATOR = new z62();
    public final String q;
    public final String r;
    public final String s;
    public final byte[] t;

    public zzacz(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = it5.a;
        this.q = readString;
        this.r = parcel.readString();
        this.s = parcel.readString();
        this.t = (byte[]) it5.h(parcel.createByteArray());
    }

    public zzacz(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.q = str;
        this.r = str2;
        this.s = str3;
        this.t = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacz.class == obj.getClass()) {
            zzacz zzaczVar = (zzacz) obj;
            if (it5.t(this.q, zzaczVar.q) && it5.t(this.r, zzaczVar.r) && it5.t(this.s, zzaczVar.s) && Arrays.equals(this.t, zzaczVar.t)) {
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
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.t);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final String toString() {
        String str = this.p;
        String str2 = this.q;
        String str3 = this.r;
        String str4 = this.s;
        return str + ": mimeType=" + str2 + ", filename=" + str3 + ", description=" + str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeByteArray(this.t);
    }
}
