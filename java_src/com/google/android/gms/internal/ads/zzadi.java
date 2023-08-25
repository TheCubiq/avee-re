package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.m72;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzadi extends zzade {
    public static final Parcelable.Creator<zzadi> CREATOR = new m72();

    /* renamed from: q */
    public final int f36751q;

    /* renamed from: r */
    public final int f36752r;

    /* renamed from: s */
    public final int f36753s;

    /* renamed from: t */
    public final int[] f36754t;

    /* renamed from: u */
    public final int[] f36755u;

    public zzadi(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f36751q = i;
        this.f36752r = i2;
        this.f36753s = i3;
        this.f36754t = iArr;
        this.f36755u = iArr2;
    }

    public zzadi(Parcel parcel) {
        super("MLLT");
        this.f36751q = parcel.readInt();
        this.f36752r = parcel.readInt();
        this.f36753s = parcel.readInt();
        this.f36754t = (int[]) it5.m19391h(parcel.createIntArray());
        this.f36755u = (int[]) it5.m19391h(parcel.createIntArray());
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
            if (this.f36751q == zzadiVar.f36751q && this.f36752r == zzadiVar.f36752r && this.f36753s == zzadiVar.f36753s && Arrays.equals(this.f36754t, zzadiVar.f36754t) && Arrays.equals(this.f36755u, zzadiVar.f36755u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f36751q + 527) * 31) + this.f36752r) * 31) + this.f36753s) * 31) + Arrays.hashCode(this.f36754t)) * 31) + Arrays.hashCode(this.f36755u);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f36751q);
        parcel.writeInt(this.f36752r);
        parcel.writeInt(this.f36753s);
        parcel.writeIntArray(this.f36754t);
        parcel.writeIntArray(this.f36755u);
    }
}
