package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new a();
    public final float A;
    public final int B;
    public final float C;
    public final int D;
    public final byte[] E;
    public final ColorInfo F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final long L;
    public final int M;
    public final String N;
    public final int O;
    public int P;
    public final String p;
    public final int q;
    public final String r;
    public final Metadata s;
    public final String t;
    public final String u;
    public final int v;
    public final List<byte[]> w;
    public final DrmInitData x;
    public final int y;
    public final int z;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<Format> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Format[] newArray(int i) {
            return new Format[i];
        }
    }

    public Format(Parcel parcel) {
        this.p = parcel.readString();
        this.t = parcel.readString();
        this.u = parcel.readString();
        this.r = parcel.readString();
        this.q = parcel.readInt();
        this.v = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readInt();
        this.A = parcel.readFloat();
        this.B = parcel.readInt();
        this.C = parcel.readFloat();
        this.E = sq1.Q(parcel) ? parcel.createByteArray() : null;
        this.D = parcel.readInt();
        this.F = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.J = parcel.readInt();
        this.K = parcel.readInt();
        this.M = parcel.readInt();
        this.N = parcel.readString();
        this.O = parcel.readInt();
        this.L = parcel.readLong();
        int readInt = parcel.readInt();
        this.w = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.w.add(parcel.createByteArray());
        }
        this.x = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.s = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }

    public Format(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, DrmInitData drmInitData, Metadata metadata) {
        this.p = str;
        this.t = str2;
        this.u = str3;
        this.r = str4;
        this.q = i;
        this.v = i2;
        this.y = i3;
        this.z = i4;
        this.A = f;
        int i14 = i5;
        this.B = i14 == -1 ? 0 : i14;
        this.C = f2 == -1.0f ? 1.0f : f2;
        this.E = bArr;
        this.D = i6;
        this.F = colorInfo;
        this.G = i7;
        this.H = i8;
        this.I = i9;
        int i15 = i10;
        this.J = i15 == -1 ? 0 : i15;
        this.K = i11 != -1 ? i11 : 0;
        this.M = i12;
        this.N = str5;
        this.O = i13;
        this.L = j;
        this.w = list == null ? Collections.emptyList() : list;
        this.x = drmInitData;
        this.s = metadata;
    }

    public static Format A(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, i3, Long.MAX_VALUE, null, null, null);
    }

    public static Format B(String str, String str2, int i, String str3) {
        return C(str, str2, i, str3, null);
    }

    public static Format C(String str, String str2, int i, String str3, DrmInitData drmInitData) {
        return E(str, str2, null, -1, i, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format D(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData) {
        return E(str, str2, str3, i, i2, str4, i3, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format E(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData, long j, List<byte[]> list) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, drmInitData, null);
    }

    public static Format F(String str, String str2, String str3, int i, int i2, String str4, DrmInitData drmInitData, long j) {
        return E(str, str2, str3, i, i2, str4, -1, drmInitData, j, Collections.emptyList());
    }

    public static Format G(String str, String str2, String str3, String str4, int i, int i2, int i3, float f, List<byte[]> list, int i4) {
        return new Format(str, str2, str3, str4, i, -1, i2, i3, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, null, -1, Long.MAX_VALUE, list, null, null);
    }

    public static Format H(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, DrmInitData drmInitData) {
        return I(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, null, -1, null, drmInitData);
    }

    public static Format I(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format J(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, DrmInitData drmInitData) {
        return H(str, str2, str3, i, i2, i3, i4, f, list, -1, -1.0f, drmInitData);
    }

    public static String M(Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(format.p);
        sb.append(", mimeType=");
        sb.append(format.u);
        if (format.q != -1) {
            sb.append(", bitrate=");
            sb.append(format.q);
        }
        if (format.y != -1 && format.z != -1) {
            sb.append(", res=");
            sb.append(format.y);
            sb.append("x");
            sb.append(format.z);
        }
        if (format.A != -1.0f) {
            sb.append(", fps=");
            sb.append(format.A);
        }
        if (format.G != -1) {
            sb.append(", channels=");
            sb.append(format.G);
        }
        if (format.H != -1) {
            sb.append(", sample_rate=");
            sb.append(format.H);
        }
        if (format.N != null) {
            sb.append(", language=");
            sb.append(format.N);
        }
        return sb.toString();
    }

    public static Format q(String str, String str2, String str3, String str4, int i, int i2, int i3, List<byte[]> list, int i4, String str5) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, i4, str5, -1, Long.MAX_VALUE, list, null, null);
    }

    public static Format s(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, DrmInitData drmInitData, int i8, String str4, Metadata metadata) {
        return new Format(str, null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, drmInitData, metadata);
    }

    public static Format t(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, DrmInitData drmInitData, int i6, String str4) {
        return s(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, drmInitData, i6, str4, null);
    }

    public static Format u(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, DrmInitData drmInitData, int i5, String str4) {
        return t(str, str2, str3, i, i2, i3, i4, -1, list, drmInitData, i5, str4);
    }

    public static Format v(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    public static Format w(String str, String str2, String str3, int i, int i2, List<byte[]> list, String str4, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format x(String str, String str2, long j) {
        return new Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    public static Format y(String str, String str2, String str3, int i, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, drmInitData, null);
    }

    public static Format z(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return A(str, str2, str3, str4, i, i2, str5, -1);
    }

    public int K() {
        int i;
        int i2 = this.y;
        if (i2 == -1 || (i = this.z) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public boolean L(Format format) {
        if (this.w.size() != format.w.size()) {
            return false;
        }
        for (int i = 0; i < this.w.size(); i++) {
            if (!Arrays.equals(this.w.get(i), format.w.get(i))) {
                return false;
            }
        }
        return true;
    }

    public Format a(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4) {
        return new Format(str, this.t, str2, str3, i, this.v, i2, i3, this.A, this.B, this.C, this.E, this.D, this.F, this.G, this.H, this.I, this.J, this.K, i4, str4, this.O, this.L, this.w, this.x, this.s);
    }

    public Format b(DrmInitData drmInitData) {
        return new Format(this.p, this.t, this.u, this.r, this.q, this.v, this.y, this.z, this.A, this.B, this.C, this.E, this.D, this.F, this.G, this.H, this.I, this.J, this.K, this.M, this.N, this.O, this.L, this.w, drmInitData, this.s);
    }

    public Format c(int i, int i2) {
        return new Format(this.p, this.t, this.u, this.r, this.q, this.v, this.y, this.z, this.A, this.B, this.C, this.E, this.D, this.F, this.G, this.H, this.I, i, i2, this.M, this.N, this.O, this.L, this.w, this.x, this.s);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        return this.q == format.q && this.v == format.v && this.y == format.y && this.z == format.z && this.A == format.A && this.B == format.B && this.C == format.C && this.D == format.D && this.G == format.G && this.H == format.H && this.I == format.I && this.J == format.J && this.K == format.K && this.L == format.L && this.M == format.M && sq1.b(this.p, format.p) && sq1.b(this.N, format.N) && this.O == format.O && sq1.b(this.t, format.t) && sq1.b(this.u, format.u) && sq1.b(this.r, format.r) && sq1.b(this.x, format.x) && sq1.b(this.s, format.s) && sq1.b(this.F, format.F) && Arrays.equals(this.E, format.E) && L(format);
    }

    public Format g(Format format) {
        if (this == format) {
            return this;
        }
        String str = format.p;
        String str2 = this.r;
        if (str2 == null) {
            str2 = format.r;
        }
        String str3 = str2;
        int i = this.q;
        if (i == -1) {
            i = format.q;
        }
        int i2 = i;
        float f = this.A;
        if (f == -1.0f) {
            f = format.A;
        }
        float f2 = f;
        int i3 = this.M | format.M;
        String str4 = this.N;
        if (str4 == null) {
            str4 = format.N;
        }
        return new Format(str, this.t, this.u, str3, i2, this.v, this.y, this.z, f2, this.B, this.C, this.E, this.D, this.F, this.G, this.H, this.I, this.J, this.K, i3, str4, this.O, this.L, this.w, DrmInitData.g(format.x, this.x), this.s);
    }

    public Format h(int i) {
        return new Format(this.p, this.t, this.u, this.r, this.q, i, this.y, this.z, this.A, this.B, this.C, this.E, this.D, this.F, this.G, this.H, this.I, this.J, this.K, this.M, this.N, this.O, this.L, this.w, this.x, this.s);
    }

    public int hashCode() {
        if (this.P == 0) {
            String str = this.p;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.t;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.u;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.r;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.q) * 31) + this.y) * 31) + this.z) * 31) + this.G) * 31) + this.H) * 31;
            String str5 = this.N;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.O) * 31;
            DrmInitData drmInitData = this.x;
            int hashCode6 = (hashCode5 + (drmInitData == null ? 0 : drmInitData.hashCode())) * 31;
            Metadata metadata = this.s;
            this.P = hashCode6 + (metadata != null ? metadata.hashCode() : 0);
        }
        return this.P;
    }

    public Format i(Metadata metadata) {
        return new Format(this.p, this.t, this.u, this.r, this.q, this.v, this.y, this.z, this.A, this.B, this.C, this.E, this.D, this.F, this.G, this.H, this.I, this.J, this.K, this.M, this.N, this.O, this.L, this.w, this.x, metadata);
    }

    public Format l(long j) {
        return new Format(this.p, this.t, this.u, this.r, this.q, this.v, this.y, this.z, this.A, this.B, this.C, this.E, this.D, this.F, this.G, this.H, this.I, this.J, this.K, this.M, this.N, this.O, j, this.w, this.x, this.s);
    }

    public String toString() {
        return "Format(" + this.p + ", " + this.t + ", " + this.u + ", " + this.q + ", " + this.N + ", [" + this.y + ", " + this.z + ", " + this.A + "], [" + this.G + ", " + this.H + "])";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.r);
        parcel.writeInt(this.q);
        parcel.writeInt(this.v);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeFloat(this.A);
        parcel.writeInt(this.B);
        parcel.writeFloat(this.C);
        sq1.c0(parcel, this.E != null);
        byte[] bArr = this.E;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.D);
        parcel.writeParcelable(this.F, i);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
        parcel.writeInt(this.K);
        parcel.writeInt(this.M);
        parcel.writeString(this.N);
        parcel.writeInt(this.O);
        parcel.writeLong(this.L);
        int size = this.w.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.w.get(i2));
        }
        parcel.writeParcelable(this.x, 0);
        parcel.writeParcelable(this.s, 0);
    }
}
