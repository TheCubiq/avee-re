package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.q72;
import com.daaw.r72;
import com.daaw.x93;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzadr implements zzbp {
    public static final Parcelable.Creator<zzadr> CREATOR = new q72();
    public final String p;
    public final byte[] q;
    public final int r;
    public final int s;

    public /* synthetic */ zzadr(Parcel parcel, r72 r72Var) {
        String readString = parcel.readString();
        int i = it5.a;
        this.p = readString;
        this.q = (byte[]) it5.h(parcel.createByteArray());
        this.r = parcel.readInt();
        this.s = parcel.readInt();
    }

    public zzadr(String str, byte[] bArr, int i, int i2) {
        this.p = str;
        this.q = bArr;
        this.r = i;
        this.s = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadr.class == obj.getClass()) {
            zzadr zzadrVar = (zzadr) obj;
            if (this.p.equals(zzadrVar.p) && Arrays.equals(this.q, zzadrVar.q) && this.r == zzadrVar.r && this.s == zzadrVar.s) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final /* synthetic */ void f(x93 x93Var) {
    }

    public final int hashCode() {
        return ((((((this.p.hashCode() + 527) * 31) + Arrays.hashCode(this.q)) * 31) + this.r) * 31) + this.s;
    }

    public final String toString() {
        return "mdta: key=".concat(String.valueOf(this.p));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeByteArray(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
    }
}
