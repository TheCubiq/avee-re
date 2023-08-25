package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.z62;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzacz extends zzade {
    public static final Parcelable.Creator<zzacz> CREATOR = new z62();

    /* renamed from: q */
    public final String f36743q;

    /* renamed from: r */
    public final String f36744r;

    /* renamed from: s */
    public final String f36745s;

    /* renamed from: t */
    public final byte[] f36746t;

    public zzacz(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = it5.f13991a;
        this.f36743q = readString;
        this.f36744r = parcel.readString();
        this.f36745s = parcel.readString();
        this.f36746t = (byte[]) it5.m19391h(parcel.createByteArray());
    }

    public zzacz(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f36743q = str;
        this.f36744r = str2;
        this.f36745s = str3;
        this.f36746t = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacz.class == obj.getClass()) {
            zzacz zzaczVar = (zzacz) obj;
            if (it5.m19376t(this.f36743q, zzaczVar.f36743q) && it5.m19376t(this.f36744r, zzaczVar.f36744r) && it5.m19376t(this.f36745s, zzaczVar.f36745s) && Arrays.equals(this.f36746t, zzaczVar.f36746t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f36743q;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f36744r;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36745s;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f36746t);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final String toString() {
        String str = this.f36747p;
        String str2 = this.f36743q;
        String str3 = this.f36744r;
        String str4 = this.f36745s;
        return str + ": mimeType=" + str2 + ", filename=" + str3 + ", description=" + str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36743q);
        parcel.writeString(this.f36744r);
        parcel.writeString(this.f36745s);
        parcel.writeByteArray(this.f36746t);
    }
}
