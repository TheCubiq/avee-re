package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.m72;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzadi extends zzade {
    public static final Parcelable.Creator<zzadi> CREATOR = new m72();
    public final int q;
    public final int r;
    public final int s;
    public final int[] t;
    public final int[] u;

    public zzadi(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.q = i;
        this.r = i2;
        this.s = i3;
        this.t = iArr;
        this.u = iArr2;
    }

    public zzadi(Parcel parcel) {
        super("MLLT");
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = (int[]) it5.h(parcel.createIntArray());
        this.u = (int[]) it5.h(parcel.createIntArray());
    }

    @Override // com.google.android.gms.internal.ads.zzade, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadi.class == obj.getClass()) {
            zzadi zzadiVar = (zzadi) obj;
            if (this.q == zzadiVar.q && this.r == zzadiVar.r && this.s == zzadiVar.s && Arrays.equals(this.t, zzadiVar.t) && Arrays.equals(this.u, zzadiVar.u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.q + 527) * 31) + this.r) * 31) + this.s) * 31) + Arrays.hashCode(this.t)) * 31) + Arrays.hashCode(this.u);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeIntArray(this.t);
        parcel.writeIntArray(this.u);
    }
}
