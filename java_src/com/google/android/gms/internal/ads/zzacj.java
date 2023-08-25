package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.cy6;
import com.daaw.ik5;
import com.daaw.it5;
import com.daaw.r62;
import com.daaw.x93;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzacj implements zzbp {
    public static final Parcelable.Creator<zzacj> CREATOR = new r62();
    public final int p;
    public final String q;
    public final String r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final byte[] w;

    public zzacj(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.p = i;
        this.q = str;
        this.r = str2;
        this.s = i2;
        this.t = i3;
        this.u = i4;
        this.v = i5;
        this.w = bArr;
    }

    public zzacj(Parcel parcel) {
        this.p = parcel.readInt();
        String readString = parcel.readString();
        int i = it5.a;
        this.q = readString;
        this.r = parcel.readString();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = (byte[]) it5.h(parcel.createByteArray());
    }

    public static zzacj a(ik5 ik5Var) {
        int m = ik5Var.m();
        String F = ik5Var.F(ik5Var.m(), cy6.a);
        String F2 = ik5Var.F(ik5Var.m(), cy6.c);
        int m2 = ik5Var.m();
        int m3 = ik5Var.m();
        int m4 = ik5Var.m();
        int m5 = ik5Var.m();
        int m6 = ik5Var.m();
        byte[] bArr = new byte[m6];
        ik5Var.b(bArr, 0, m6);
        return new zzacj(m, F, F2, m2, m3, m4, m5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacj.class == obj.getClass()) {
            zzacj zzacjVar = (zzacj) obj;
            if (this.p == zzacjVar.p && this.q.equals(zzacjVar.q) && this.r.equals(zzacjVar.r) && this.s == zzacjVar.s && this.t == zzacjVar.t && this.u == zzacjVar.u && this.v == zzacjVar.v && Arrays.equals(this.w, zzacjVar.w)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void f(x93 x93Var) {
        x93Var.q(this.w, this.p);
    }

    public final int hashCode() {
        return ((((((((((((((this.p + 527) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s) * 31) + this.t) * 31) + this.u) * 31) + this.v) * 31) + Arrays.hashCode(this.w);
    }

    public final String toString() {
        String str = this.q;
        String str2 = this.r;
        return "Picture: mimeType=" + str + ", description=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeByteArray(this.w);
    }
}
