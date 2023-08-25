package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new a();
    public final int p;
    public final int q;
    public final int r;
    public final byte[] s;
    public int t;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<ColorInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ColorInfo createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ColorInfo[] newArray(int i) {
            return new ColorInfo[0];
        }
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.p = i;
        this.q = i2;
        this.r = i3;
        this.s = bArr;
    }

    public ColorInfo(Parcel parcel) {
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = sq1.Q(parcel) ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        return this.p == colorInfo.p && this.q == colorInfo.q && this.r == colorInfo.r && Arrays.equals(this.s, colorInfo.s);
    }

    public int hashCode() {
        if (this.t == 0) {
            this.t = ((((((527 + this.p) * 31) + this.q) * 31) + this.r) * 31) + Arrays.hashCode(this.s);
        }
        return this.t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.p);
        sb.append(", ");
        sb.append(this.q);
        sb.append(", ");
        sb.append(this.r);
        sb.append(", ");
        sb.append(this.s != null);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        sq1.c0(parcel, this.s != null);
        byte[] bArr = this.s;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
