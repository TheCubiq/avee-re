package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.w62;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzact extends zzade {
    public static final Parcelable.Creator<zzact> CREATOR = new w62();
    public final String q;
    public final int r;
    public final int s;
    public final long t;
    public final long u;
    public final zzade[] v;

    public zzact(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = it5.a;
        this.q = readString;
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readLong();
        this.u = parcel.readLong();
        int readInt = parcel.readInt();
        this.v = new zzade[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.v[i2] = (zzade) parcel.readParcelable(zzade.class.getClassLoader());
        }
    }

    public zzact(String str, int i, int i2, long j, long j2, zzade[] zzadeVarArr) {
        super("CHAP");
        this.q = str;
        this.r = i;
        this.s = i2;
        this.t = j;
        this.u = j2;
        this.v = zzadeVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzade, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzact.class == obj.getClass()) {
            zzact zzactVar = (zzact) obj;
            if (this.r == zzactVar.r && this.s == zzactVar.s && this.t == zzactVar.t && this.u == zzactVar.u && it5.t(this.q, zzactVar.q) && Arrays.equals(this.v, zzactVar.v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.r + 527) * 31) + this.s) * 31) + ((int) this.t)) * 31) + ((int) this.u)) * 31;
        String str = this.q;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeLong(this.t);
        parcel.writeLong(this.u);
        parcel.writeInt(this.v.length);
        for (zzade zzadeVar : this.v) {
            parcel.writeParcelable(zzadeVar, 0);
        }
    }
}
