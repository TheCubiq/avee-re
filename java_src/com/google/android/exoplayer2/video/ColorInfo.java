package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new C3979a();

    /* renamed from: p */
    public final int f35982p;

    /* renamed from: q */
    public final int f35983q;

    /* renamed from: r */
    public final int f35984r;

    /* renamed from: s */
    public final byte[] f35985s;

    /* renamed from: t */
    public int f35986t;

    /* renamed from: com.google.android.exoplayer2.video.ColorInfo$a */
    /* loaded from: classes.dex */
    public static class C3979a implements Parcelable.Creator<ColorInfo> {
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
        this.f35982p = i;
        this.f35983q = i2;
        this.f35984r = i3;
        this.f35985s = bArr;
    }

    public ColorInfo(Parcel parcel) {
        this.f35982p = parcel.readInt();
        this.f35983q = parcel.readInt();
        this.f35984r = parcel.readInt();
        this.f35985s = sq1.m10028Q(parcel) ? parcel.createByteArray() : null;
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
        return this.f35982p == colorInfo.f35982p && this.f35983q == colorInfo.f35983q && this.f35984r == colorInfo.f35984r && Arrays.equals(this.f35985s, colorInfo.f35985s);
    }

    public int hashCode() {
        if (this.f35986t == 0) {
            this.f35986t = ((((((527 + this.f35982p) * 31) + this.f35983q) * 31) + this.f35984r) * 31) + Arrays.hashCode(this.f35985s);
        }
        return this.f35986t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f35982p);
        sb.append(", ");
        sb.append(this.f35983q);
        sb.append(", ");
        sb.append(this.f35984r);
        sb.append(", ");
        sb.append(this.f35985s != null);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f35982p);
        parcel.writeInt(this.f35983q);
        parcel.writeInt(this.f35984r);
        sq1.m10013c0(parcel, this.f35985s != null);
        byte[] bArr = this.f35985s;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
