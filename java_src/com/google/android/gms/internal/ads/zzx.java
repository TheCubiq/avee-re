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

    /* renamed from: p */
    public final zzw[] f37032p;

    /* renamed from: q */
    public int f37033q;

    /* renamed from: r */
    public final String f37034r;

    /* renamed from: s */
    public final int f37035s;

    public zzx(Parcel parcel) {
        this.f37034r = parcel.readString();
        zzw[] zzwVarArr = (zzw[]) it5.m19391h((zzw[]) parcel.createTypedArray(zzw.CREATOR));
        this.f37032p = zzwVarArr;
        this.f37035s = zzwVarArr.length;
    }

    public zzx(String str, boolean z, zzw... zzwVarArr) {
        this.f37034r = str;
        zzwVarArr = z ? (zzw[]) zzwVarArr.clone() : zzwVarArr;
        this.f37032p = zzwVarArr;
        this.f37035s = zzwVarArr.length;
        Arrays.sort(zzwVarArr, this);
    }

    public zzx(String str, zzw... zzwVarArr) {
        this(null, true, zzwVarArr);
    }

    public zzx(List list) {
        this(null, false, (zzw[]) list.toArray(new zzw[0]));
    }

    /* renamed from: a */
    public final zzw m1090a(int i) {
        return this.f37032p[i];
    }

    /* renamed from: b */
    public final zzx m1089b(String str) {
        return it5.m19376t(this.f37034r, str) ? this : new zzx(str, false, this.f37032p);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzw zzwVar, zzw zzwVar2) {
        zzw zzwVar3 = zzwVar;
        zzw zzwVar4 = zzwVar2;
        UUID uuid = ak8.f3281a;
        return uuid.equals(zzwVar3.f37028q) ? !uuid.equals(zzwVar4.f37028q) ? 1 : 0 : zzwVar3.f37028q.compareTo(zzwVar4.f37028q);
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
            if (it5.m19376t(this.f37034r, zzxVar.f37034r) && Arrays.equals(this.f37032p, zzxVar.f37032p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f37033q;
        if (i == 0) {
            String str = this.f37034r;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f37032p);
            this.f37033q = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37034r);
        parcel.writeTypedArray(this.f37032p, 0);
    }
}
