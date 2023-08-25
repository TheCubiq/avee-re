package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.n72;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzadk extends zzade {
    public static final Parcelable.Creator<zzadk> CREATOR = new n72();
    public final String q;
    public final byte[] r;

    public zzadk(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = it5.a;
        this.q = readString;
        this.r = (byte[]) it5.h(parcel.createByteArray());
    }

    public zzadk(String str, byte[] bArr) {
        super("PRIV");
        this.q = str;
        this.r = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadk.class == obj.getClass()) {
            zzadk zzadkVar = (zzadk) obj;
            if (it5.t(this.q, zzadkVar.q) && Arrays.equals(this.r, zzadkVar.r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.q;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.r);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final String toString() {
        String str = this.p;
        String str2 = this.q;
        return str + ": owner=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.q);
        parcel.writeByteArray(this.r);
    }
}
