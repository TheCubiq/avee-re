package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.bv2;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class zzaxo implements Parcelable {
    public static final Parcelable.Creator<zzaxo> CREATOR = new bv2();

    /* renamed from: p */
    public final zzaxn[] f36808p;

    public zzaxo(Parcel parcel) {
        this.f36808p = new zzaxn[parcel.readInt()];
        int i = 0;
        while (true) {
            zzaxn[] zzaxnVarArr = this.f36808p;
            if (i >= zzaxnVarArr.length) {
                return;
            }
            zzaxnVarArr[i] = (zzaxn) parcel.readParcelable(zzaxn.class.getClassLoader());
            i++;
        }
    }

    public zzaxo(List list) {
        zzaxn[] zzaxnVarArr = new zzaxn[list.size()];
        this.f36808p = zzaxnVarArr;
        list.toArray(zzaxnVarArr);
    }

    /* renamed from: a */
    public final int m1117a() {
        return this.f36808p.length;
    }

    /* renamed from: b */
    public final zzaxn m1116b(int i) {
        return this.f36808p[i];
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
        return Arrays.equals(this.f36808p, ((zzaxo) obj).f36808p);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f36808p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f36808p.length);
        for (zzaxn zzaxnVar : this.f36808p) {
            parcel.writeParcelable(zzaxnVar, 0);
        }
    }
}
