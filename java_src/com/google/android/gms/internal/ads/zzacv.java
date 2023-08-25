package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.x62;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzacv extends zzade {
    public static final Parcelable.Creator<zzacv> CREATOR = new x62();
    public final String q;
    public final boolean r;
    public final boolean s;
    public final String[] t;
    public final zzade[] u;

    public zzacv(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = it5.a;
        this.q = readString;
        this.r = parcel.readByte() != 0;
        this.s = parcel.readByte() != 0;
        this.t = (String[]) it5.h(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.u = new zzade[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.u[i2] = (zzade) parcel.readParcelable(zzade.class.getClassLoader());
        }
    }

    public zzacv(String str, boolean z, boolean z2, String[] strArr, zzade[] zzadeVarArr) {
        super("CTOC");
        this.q = str;
        this.r = z;
        this.s = z2;
        this.t = strArr;
        this.u = zzadeVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacv.class == obj.getClass()) {
            zzacv zzacvVar = (zzacv) obj;
            if (this.r == zzacvVar.r && this.s == zzacvVar.s && it5.t(this.q, zzacvVar.q) && Arrays.equals(this.t, zzacvVar.t) && Arrays.equals(this.u, zzacvVar.u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.r ? 1 : 0) + 527) * 31) + (this.s ? 1 : 0)) * 31;
        String str = this.q;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.q);
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.t);
        parcel.writeInt(this.u.length);
        for (zzade zzadeVar : this.u) {
            parcel.writeParcelable(zzadeVar, 0);
        }
    }
}
