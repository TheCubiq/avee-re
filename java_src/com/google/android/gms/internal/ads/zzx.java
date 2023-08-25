package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.ak8;
import com.daaw.it5;
import com.daaw.pt8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class zzx implements Comparator<zzw>, Parcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new pt8();
    public final zzw[] p;
    public int q;
    public final String r;
    public final int s;

    public zzx(Parcel parcel) {
        this.r = parcel.readString();
        zzw[] zzwVarArr = (zzw[]) it5.h((zzw[]) parcel.createTypedArray(zzw.CREATOR));
        this.p = zzwVarArr;
        this.s = zzwVarArr.length;
    }

    public zzx(String str, boolean z, zzw... zzwVarArr) {
        this.r = str;
        zzwVarArr = z ? (zzw[]) zzwVarArr.clone() : zzwVarArr;
        this.p = zzwVarArr;
        this.s = zzwVarArr.length;
        Arrays.sort(zzwVarArr, this);
    }

    public zzx(String str, zzw... zzwVarArr) {
        this(null, true, zzwVarArr);
    }

    public zzx(List list) {
        this(null, false, (zzw[]) list.toArray(new zzw[0]));
    }

    public final zzw a(int i) {
        return this.p[i];
    }

    public final zzx b(String str) {
        return it5.t(this.r, str) ? this : new zzx(str, false, this.p);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzw zzwVar, zzw zzwVar2) {
        zzw zzwVar3 = zzwVar;
        zzw zzwVar4 = zzwVar2;
        UUID uuid = ak8.a;
        return uuid.equals(zzwVar3.q) ? !uuid.equals(zzwVar4.q) ? 1 : 0 : zzwVar3.q.compareTo(zzwVar4.q);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzx.class == obj.getClass()) {
            zzx zzxVar = (zzx) obj;
            if (it5.t(this.r, zzxVar.r) && Arrays.equals(this.p, zzxVar.p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.q;
        if (i == 0) {
            String str = this.r;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.p);
            this.q = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.r);
        parcel.writeTypedArray(this.p, 0);
    }
}
