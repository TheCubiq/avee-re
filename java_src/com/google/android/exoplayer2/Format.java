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
    public static final Parcelable.Creator<Format> CREATOR = new C3920a();

    /* renamed from: A */
    public final float f35700A;

    /* renamed from: B */
    public final int f35701B;

    /* renamed from: C */
    public final float f35702C;

    /* renamed from: D */
    public final int f35703D;

    /* renamed from: E */
    public final byte[] f35704E;

    /* renamed from: F */
    public final ColorInfo f35705F;

    /* renamed from: G */
    public final int f35706G;

    /* renamed from: H */
    public final int f35707H;

    /* renamed from: I */
    public final int f35708I;

    /* renamed from: J */
    public final int f35709J;

    /* renamed from: K */
    public final int f35710K;

    /* renamed from: L */
    public final long f35711L;

    /* renamed from: M */
    public final int f35712M;

    /* renamed from: N */
    public final String f35713N;

    /* renamed from: O */
    public final int f35714O;

    /* renamed from: P */
    public int f35715P;

    /* renamed from: p */
    public final String f35716p;

    /* renamed from: q */
    public final int f35717q;

    /* renamed from: r */
    public final String f35718r;

    /* renamed from: s */
    public final Metadata f35719s;

    /* renamed from: t */
    public final String f35720t;

    /* renamed from: u */
    public final String f35721u;

    /* renamed from: v */
    public final int f35722v;

    /* renamed from: w */
    public final List<byte[]> f35723w;

    /* renamed from: x */
    public final DrmInitData f35724x;

    /* renamed from: y */
    public final int f35725y;

    /* renamed from: z */
    public final int f35726z;

    /* renamed from: com.google.android.exoplayer2.Format$a */
    /* loaded from: classes.dex */
    public static class C3920a implements Parcelable.Creator<Format> {
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
        this.f35716p = parcel.readString();
        this.f35720t = parcel.readString();
        this.f35721u = parcel.readString();
        this.f35718r = parcel.readString();
        this.f35717q = parcel.readInt();
        this.f35722v = parcel.readInt();
        this.f35725y = parcel.readInt();
        this.f35726z = parcel.readInt();
        this.f35700A = parcel.readFloat();
        this.f35701B = parcel.readInt();
        this.f35702C = parcel.readFloat();
        this.f35704E = sq1.m10028Q(parcel) ? parcel.createByteArray() : null;
        this.f35703D = parcel.readInt();
        this.f35705F = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.f35706G = parcel.readInt();
        this.f35707H = parcel.readInt();
        this.f35708I = parcel.readInt();
        this.f35709J = parcel.readInt();
        this.f35710K = parcel.readInt();
        this.f35712M = parcel.readInt();
        this.f35713N = parcel.readString();
        this.f35714O = parcel.readInt();
        this.f35711L = parcel.readLong();
        int readInt = parcel.readInt();
        this.f35723w = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f35723w.add(parcel.createByteArray());
        }
        this.f35724x = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f35719s = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }

    public Format(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, DrmInitData drmInitData, Metadata metadata) {
        this.f35716p = str;
        this.f35720t = str2;
        this.f35721u = str3;
        this.f35718r = str4;
        this.f35717q = i;
        this.f35722v = i2;
        this.f35725y = i3;
        this.f35726z = i4;
        this.f35700A = f;
        int i14 = i5;
        this.f35701B = i14 == -1 ? 0 : i14;
        this.f35702C = f2 == -1.0f ? 1.0f : f2;
        this.f35704E = bArr;
        this.f35703D = i6;
        this.f35705F = colorInfo;
        this.f35706G = i7;
        this.f35707H = i8;
        this.f35708I = i9;
        int i15 = i10;
        this.f35709J = i15 == -1 ? 0 : i15;
        this.f35710K = i11 != -1 ? i11 : 0;
        this.f35712M = i12;
        this.f35713N = str5;
        this.f35714O = i13;
        this.f35711L = j;
        this.f35723w = list == null ? Collections.emptyList() : list;
        this.f35724x = drmInitData;
        this.f35719s = metadata;
    }

    /* renamed from: A */
    public static Format m1745A(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, i3, Long.MAX_VALUE, null, null, null);
    }

    /* renamed from: B */
    public static Format m1744B(String str, String str2, int i, String str3) {
        return m1743C(str, str2, i, str3, null);
    }

    /* renamed from: C */
    public static Format m1743C(String str, String str2, int i, String str3, DrmInitData drmInitData) {
        return m1741E(str, str2, null, -1, i, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: D */
    public static Format m1742D(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData) {
        return m1741E(str, str2, str3, i, i2, str4, i3, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: E */
    public static Format m1741E(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData, long j, List<byte[]> list) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, drmInitData, null);
    }

    /* renamed from: F */
    public static Format m1740F(String str, String str2, String str3, int i, int i2, String str4, DrmInitData drmInitData, long j) {
        return m1741E(str, str2, str3, i, i2, str4, -1, drmInitData, j, Collections.emptyList());
    }

    /* renamed from: G */
    public static Format m1739G(String str, String str2, String str3, String str4, int i, int i2, int i3, float f, List<byte[]> list, int i4) {
        return new Format(str, str2, str3, str4, i, -1, i2, i3, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, null, -1, Long.MAX_VALUE, list, null, null);
    }

    /* renamed from: H */
    public static Format m1738H(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, DrmInitData drmInitData) {
        return m1737I(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, null, -1, null, drmInitData);
    }

    /* renamed from: I */
    public static Format m1737I(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    /* renamed from: J */
    public static Format m1736J(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, DrmInitData drmInitData) {
        return m1738H(str, str2, str3, i, i2, i3, i4, f, list, -1, -1.0f, drmInitData);
    }

    /* renamed from: M */
    public static String m1733M(Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(format.f35716p);
        sb.append(", mimeType=");
        sb.append(format.f35721u);
        if (format.f35717q != -1) {
            sb.append(", bitrate=");
            sb.append(format.f35717q);
        }
        if (format.f35725y != -1 && format.f35726z != -1) {
            sb.append(", res=");
            sb.append(format.f35725y);
            sb.append("x");
            sb.append(format.f35726z);
        }
        if (format.f35700A != -1.0f) {
            sb.append(", fps=");
            sb.append(format.f35700A);
        }
        if (format.f35706G != -1) {
            sb.append(", channels=");
            sb.append(format.f35706G);
        }
        if (format.f35707H != -1) {
            sb.append(", sample_rate=");
            sb.append(format.f35707H);
        }
        if (format.f35713N != null) {
            sb.append(", language=");
            sb.append(format.f35713N);
        }
        return sb.toString();
    }

    /* renamed from: q */
    public static Format m1725q(String str, String str2, String str3, String str4, int i, int i2, int i3, List<byte[]> list, int i4, String str5) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, i4, str5, -1, Long.MAX_VALUE, list, null, null);
    }

    /* renamed from: s */
    public static Format m1724s(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, DrmInitData drmInitData, int i8, String str4, Metadata metadata) {
        return new Format(str, null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, drmInitData, metadata);
    }

    /* renamed from: t */
    public static Format m1723t(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, DrmInitData drmInitData, int i6, String str4) {
        return m1724s(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, drmInitData, i6, str4, null);
    }

    /* renamed from: u */
    public static Format m1722u(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, DrmInitData drmInitData, int i5, String str4) {
        return m1723t(str, str2, str3, i, i2, i3, i4, -1, list, drmInitData, i5, str4);
    }

    /* renamed from: v */
    public static Format m1721v(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    /* renamed from: w */
    public static Format m1720w(String str, String str2, String str3, int i, int i2, List<byte[]> list, String str4, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    /* renamed from: x */
    public static Format m1719x(String str, String str2, long j) {
        return new Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    /* renamed from: y */
    public static Format m1718y(String str, String str2, String str3, int i, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, drmInitData, null);
    }

    /* renamed from: z */
    public static Format m1717z(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return m1745A(str, str2, str3, str4, i, i2, str5, -1);
    }

    /* renamed from: K */
    public int m1735K() {
        int i;
        int i2 = this.f35725y;
        if (i2 == -1 || (i = this.f35726z) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* renamed from: L */
    public boolean m1734L(Format format) {
        if (this.f35723w.size() != format.f35723w.size()) {
            return false;
        }
        for (int i = 0; i < this.f35723w.size(); i++) {
            if (!Arrays.equals(this.f35723w.get(i), format.f35723w.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public Format m1732a(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4) {
        return new Format(str, this.f35720t, str2, str3, i, this.f35722v, i2, i3, this.f35700A, this.f35701B, this.f35702C, this.f35704E, this.f35703D, this.f35705F, this.f35706G, this.f35707H, this.f35708I, this.f35709J, this.f35710K, i4, str4, this.f35714O, this.f35711L, this.f35723w, this.f35724x, this.f35719s);
    }

    /* renamed from: b */
    public Format m1731b(DrmInitData drmInitData) {
        return new Format(this.f35716p, this.f35720t, this.f35721u, this.f35718r, this.f35717q, this.f35722v, this.f35725y, this.f35726z, this.f35700A, this.f35701B, this.f35702C, this.f35704E, this.f35703D, this.f35705F, this.f35706G, this.f35707H, this.f35708I, this.f35709J, this.f35710K, this.f35712M, this.f35713N, this.f35714O, this.f35711L, this.f35723w, drmInitData, this.f35719s);
    }

    /* renamed from: c */
    public Format m1730c(int i, int i2) {
        return new Format(this.f35716p, this.f35720t, this.f35721u, this.f35718r, this.f35717q, this.f35722v, this.f35725y, this.f35726z, this.f35700A, this.f35701B, this.f35702C, this.f35704E, this.f35703D, this.f35705F, this.f35706G, this.f35707H, this.f35708I, i, i2, this.f35712M, this.f35713N, this.f35714O, this.f35711L, this.f35723w, this.f35724x, this.f35719s);
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
        return this.f35717q == format.f35717q && this.f35722v == format.f35722v && this.f35725y == format.f35725y && this.f35726z == format.f35726z && this.f35700A == format.f35700A && this.f35701B == format.f35701B && this.f35702C == format.f35702C && this.f35703D == format.f35703D && this.f35706G == format.f35706G && this.f35707H == format.f35707H && this.f35708I == format.f35708I && this.f35709J == format.f35709J && this.f35710K == format.f35710K && this.f35711L == format.f35711L && this.f35712M == format.f35712M && sq1.m10016b(this.f35716p, format.f35716p) && sq1.m10016b(this.f35713N, format.f35713N) && this.f35714O == format.f35714O && sq1.m10016b(this.f35720t, format.f35720t) && sq1.m10016b(this.f35721u, format.f35721u) && sq1.m10016b(this.f35718r, format.f35718r) && sq1.m10016b(this.f35724x, format.f35724x) && sq1.m10016b(this.f35719s, format.f35719s) && sq1.m10016b(this.f35705F, format.f35705F) && Arrays.equals(this.f35704E, format.f35704E) && m1734L(format);
    }

    /* renamed from: g */
    public Format m1729g(Format format) {
        if (this == format) {
            return this;
        }
        String str = format.f35716p;
        String str2 = this.f35718r;
        if (str2 == null) {
            str2 = format.f35718r;
        }
        String str3 = str2;
        int i = this.f35717q;
        if (i == -1) {
            i = format.f35717q;
        }
        int i2 = i;
        float f = this.f35700A;
        if (f == -1.0f) {
            f = format.f35700A;
        }
        float f2 = f;
        int i3 = this.f35712M | format.f35712M;
        String str4 = this.f35713N;
        if (str4 == null) {
            str4 = format.f35713N;
        }
        return new Format(str, this.f35720t, this.f35721u, str3, i2, this.f35722v, this.f35725y, this.f35726z, f2, this.f35701B, this.f35702C, this.f35704E, this.f35703D, this.f35705F, this.f35706G, this.f35707H, this.f35708I, this.f35709J, this.f35710K, i3, str4, this.f35714O, this.f35711L, this.f35723w, DrmInitData.m1711g(format.f35724x, this.f35724x), this.f35719s);
    }

    /* renamed from: h */
    public Format m1728h(int i) {
        return new Format(this.f35716p, this.f35720t, this.f35721u, this.f35718r, this.f35717q, i, this.f35725y, this.f35726z, this.f35700A, this.f35701B, this.f35702C, this.f35704E, this.f35703D, this.f35705F, this.f35706G, this.f35707H, this.f35708I, this.f35709J, this.f35710K, this.f35712M, this.f35713N, this.f35714O, this.f35711L, this.f35723w, this.f35724x, this.f35719s);
    }

    public int hashCode() {
        if (this.f35715P == 0) {
            String str = this.f35716p;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f35720t;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f35721u;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f35718r;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f35717q) * 31) + this.f35725y) * 31) + this.f35726z) * 31) + this.f35706G) * 31) + this.f35707H) * 31;
            String str5 = this.f35713N;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f35714O) * 31;
            DrmInitData drmInitData = this.f35724x;
            int hashCode6 = (hashCode5 + (drmInitData == null ? 0 : drmInitData.hashCode())) * 31;
            Metadata metadata = this.f35719s;
            this.f35715P = hashCode6 + (metadata != null ? metadata.hashCode() : 0);
        }
        return this.f35715P;
    }

    /* renamed from: i */
    public Format m1727i(Metadata metadata) {
        return new Format(this.f35716p, this.f35720t, this.f35721u, this.f35718r, this.f35717q, this.f35722v, this.f35725y, this.f35726z, this.f35700A, this.f35701B, this.f35702C, this.f35704E, this.f35703D, this.f35705F, this.f35706G, this.f35707H, this.f35708I, this.f35709J, this.f35710K, this.f35712M, this.f35713N, this.f35714O, this.f35711L, this.f35723w, this.f35724x, metadata);
    }

    /* renamed from: l */
    public Format m1726l(long j) {
        return new Format(this.f35716p, this.f35720t, this.f35721u, this.f35718r, this.f35717q, this.f35722v, this.f35725y, this.f35726z, this.f35700A, this.f35701B, this.f35702C, this.f35704E, this.f35703D, this.f35705F, this.f35706G, this.f35707H, this.f35708I, this.f35709J, this.f35710K, this.f35712M, this.f35713N, this.f35714O, j, this.f35723w, this.f35724x, this.f35719s);
    }

    public String toString() {
        return "Format(" + this.f35716p + ", " + this.f35720t + ", " + this.f35721u + ", " + this.f35717q + ", " + this.f35713N + ", [" + this.f35725y + ", " + this.f35726z + ", " + this.f35700A + "], [" + this.f35706G + ", " + this.f35707H + "])";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35716p);
        parcel.writeString(this.f35720t);
        parcel.writeString(this.f35721u);
        parcel.writeString(this.f35718r);
        parcel.writeInt(this.f35717q);
        parcel.writeInt(this.f35722v);
        parcel.writeInt(this.f35725y);
        parcel.writeInt(this.f35726z);
        parcel.writeFloat(this.f35700A);
        parcel.writeInt(this.f35701B);
        parcel.writeFloat(this.f35702C);
        sq1.m10013c0(parcel, this.f35704E != null);
        byte[] bArr = this.f35704E;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f35703D);
        parcel.writeParcelable(this.f35705F, i);
        parcel.writeInt(this.f35706G);
        parcel.writeInt(this.f35707H);
        parcel.writeInt(this.f35708I);
        parcel.writeInt(this.f35709J);
        parcel.writeInt(this.f35710K);
        parcel.writeInt(this.f35712M);
        parcel.writeString(this.f35713N);
        parcel.writeInt(this.f35714O);
        parcel.writeLong(this.f35711L);
        int size = this.f35723w.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f35723w.get(i2));
        }
        parcel.writeParcelable(this.f35724x, 0);
        parcel.writeParcelable(this.f35719s, 0);
    }
}
