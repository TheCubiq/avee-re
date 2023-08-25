package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.bv2;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class zzaxo implements Parcelable {
    public static final Parcelable.Creator<zzaxo> CREATOR = new bv2();
    public final zzaxn[] p;

    public zzaxo(Parcel parcel) {
        this.p = new zzaxn[parcel.readInt()];
        int i = 0;
        while (true) {
            zzaxn[] zzaxnVarArr = this.p;
            if (i >= zzaxnVarArr.length) {
                return;
            }
            zzaxnVarArr[i] = (zzaxn) parcel.readParcelable(zzaxn.class.getClassLoader());
            i++;
        }
    }

    public zzaxo(List list) {
        zzaxn[] zzaxnVarArr = new zzaxn[list.size()];
        this.p = zzaxnVarArr;
        list.toArray(zzaxnVarArr);
    }

    public final int a() {
        return this.p.length;
    }

    public final zzaxn b(int i) {
        return this.p[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaxo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.p, ((zzaxo) obj).p);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.p.length);
        for (zzaxn zzaxnVar : this.p) {
            parcel.writeParcelable(zzaxnVar, 0);
        }
    }
}
