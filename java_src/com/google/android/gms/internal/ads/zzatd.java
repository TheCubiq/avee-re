package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.bq2;
import com.daaw.pz2;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzatd implements Parcelable {
    public static final Parcelable.Creator<zzatd> CREATOR = new bq2();

    /* renamed from: A */
    public final float f36773A;

    /* renamed from: B */
    public final int f36774B;

    /* renamed from: C */
    public final float f36775C;

    /* renamed from: D */
    public final int f36776D;

    /* renamed from: E */
    public final byte[] f36777E;

    /* renamed from: F */
    public final zzbbb f36778F;

    /* renamed from: G */
    public final int f36779G;

    /* renamed from: H */
    public final int f36780H;

    /* renamed from: I */
    public final int f36781I;

    /* renamed from: J */
    public final int f36782J;

    /* renamed from: K */
    public final int f36783K;

    /* renamed from: L */
    public final long f36784L;

    /* renamed from: M */
    public final int f36785M;

    /* renamed from: N */
    public final String f36786N;

    /* renamed from: O */
    public final int f36787O;

    /* renamed from: P */
    public int f36788P;

    /* renamed from: p */
    public final String f36789p;

    /* renamed from: q */
    public final int f36790q;

    /* renamed from: r */
    public final String f36791r;

    /* renamed from: s */
    public final zzaxo f36792s;

    /* renamed from: t */
    public final String f36793t;

    /* renamed from: u */
    public final String f36794u;

    /* renamed from: v */
    public final int f36795v;

    /* renamed from: w */
    public final List f36796w;

    /* renamed from: x */
    public final zzavc f36797x;

    /* renamed from: y */
    public final int f36798y;

    /* renamed from: z */
    public final int f36799z;

    public zzatd(Parcel parcel) {
        this.f36789p = parcel.readString();
        this.f36793t = parcel.readString();
        this.f36794u = parcel.readString();
        this.f36791r = parcel.readString();
        this.f36790q = parcel.readInt();
        this.f36795v = parcel.readInt();
        this.f36798y = parcel.readInt();
        this.f36799z = parcel.readInt();
        this.f36773A = parcel.readFloat();
        this.f36774B = parcel.readInt();
        this.f36775C = parcel.readFloat();
        this.f36777E = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f36776D = parcel.readInt();
        this.f36778F = (zzbbb) parcel.readParcelable(zzbbb.class.getClassLoader());
        this.f36779G = parcel.readInt();
        this.f36780H = parcel.readInt();
        this.f36781I = parcel.readInt();
        this.f36782J = parcel.readInt();
        this.f36783K = parcel.readInt();
        this.f36785M = parcel.readInt();
        this.f36786N = parcel.readString();
        this.f36787O = parcel.readInt();
        this.f36784L = parcel.readLong();
        int readInt = parcel.readInt();
        this.f36796w = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f36796w.add(parcel.createByteArray());
        }
        this.f36797x = (zzavc) parcel.readParcelable(zzavc.class.getClassLoader());
        this.f36792s = (zzaxo) parcel.readParcelable(zzaxo.class.getClassLoader());
    }

    public zzatd(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzbbb zzbbbVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List list, zzavc zzavcVar, zzaxo zzaxoVar) {
        this.f36789p = str;
        this.f36793t = str2;
        this.f36794u = str3;
        this.f36791r = str4;
        this.f36790q = i;
        this.f36795v = i2;
        this.f36798y = i3;
        this.f36799z = i4;
        this.f36773A = f;
        this.f36774B = i5;
        this.f36775C = f2;
        this.f36777E = bArr;
        this.f36776D = i6;
        this.f36778F = zzbbbVar;
        this.f36779G = i7;
        this.f36780H = i8;
        this.f36781I = i9;
        this.f36782J = i10;
        this.f36783K = i11;
        this.f36785M = i12;
        this.f36786N = str5;
        this.f36787O = i13;
        this.f36784L = j;
        this.f36796w = list == null ? Collections.emptyList() : list;
        this.f36797x = zzavcVar;
        this.f36792s = zzaxoVar;
    }

    /* renamed from: l */
    public static zzatd m1126l(String str, String str2, String str3, int i, int i2, int i3, int i4, List list, zzavc zzavcVar, int i5, String str4) {
        return m1125q(str, str2, null, -1, -1, i3, i4, -1, -1, -1, null, zzavcVar, 0, str4, null);
    }

    /* renamed from: q */
    public static zzatd m1125q(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, zzavc zzavcVar, int i8, String str4, zzaxo zzaxoVar) {
        return new zzatd(str, null, str2, null, -1, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, -1, -1, i8, str4, -1, Long.MAX_VALUE, list, zzavcVar, null);
    }

    /* renamed from: s */
    public static zzatd m1124s(String str, String str2, String str3, int i, List list, String str4, zzavc zzavcVar) {
        return new zzatd(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzavcVar, null);
    }

    /* renamed from: t */
    public static zzatd m1123t(String str, String str2, String str3, int i, zzavc zzavcVar) {
        return new zzatd(str, null, "application/x-camera-motion", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, zzavcVar, null);
    }

    /* renamed from: u */
    public static zzatd m1122u(String str, String str2, String str3, int i, int i2, String str4, int i3, zzavc zzavcVar, long j, List list) {
        return new zzatd(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzavcVar, null);
    }

    /* renamed from: v */
    public static zzatd m1121v(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List list, int i5, float f2, byte[] bArr, int i6, zzbbb zzbbbVar, zzavc zzavcVar) {
        return new zzatd(str, null, str2, null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzbbbVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zzavcVar, null);
    }

    @TargetApi(16)
    /* renamed from: w */
    public static void m1120w(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: a */
    public final int m1132a() {
        int i;
        int i2 = this.f36798y;
        if (i2 == -1 || (i = this.f36799z) == -1) {
            return -1;
        }
        return i2 * i;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    /* renamed from: b */
    public final MediaFormat m1131b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f36794u);
        String str = this.f36786N;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m1120w(mediaFormat, "max-input-size", this.f36795v);
        m1120w(mediaFormat, "width", this.f36798y);
        m1120w(mediaFormat, "height", this.f36799z);
        float f = this.f36773A;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m1120w(mediaFormat, "rotation-degrees", this.f36774B);
        m1120w(mediaFormat, "channel-count", this.f36779G);
        m1120w(mediaFormat, "sample-rate", this.f36780H);
        m1120w(mediaFormat, "encoder-delay", this.f36782J);
        m1120w(mediaFormat, "encoder-padding", this.f36783K);
        for (int i = 0; i < this.f36796w.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap((byte[]) this.f36796w.get(i)));
        }
        zzbbb zzbbbVar = this.f36778F;
        if (zzbbbVar != null) {
            m1120w(mediaFormat, "color-transfer", zzbbbVar.f36821r);
            m1120w(mediaFormat, "color-standard", zzbbbVar.f36819p);
            m1120w(mediaFormat, "color-range", zzbbbVar.f36820q);
            byte[] bArr = zzbbbVar.f36822s;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    /* renamed from: c */
    public final zzatd m1130c(zzavc zzavcVar) {
        return new zzatd(this.f36789p, this.f36793t, this.f36794u, this.f36791r, this.f36790q, this.f36795v, this.f36798y, this.f36799z, this.f36773A, this.f36774B, this.f36775C, this.f36777E, this.f36776D, this.f36778F, this.f36779G, this.f36780H, this.f36781I, this.f36782J, this.f36783K, this.f36785M, this.f36786N, this.f36787O, this.f36784L, this.f36796w, zzavcVar, this.f36792s);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzatd.class == obj.getClass()) {
            zzatd zzatdVar = (zzatd) obj;
            if (this.f36790q == zzatdVar.f36790q && this.f36795v == zzatdVar.f36795v && this.f36798y == zzatdVar.f36798y && this.f36799z == zzatdVar.f36799z && this.f36773A == zzatdVar.f36773A && this.f36774B == zzatdVar.f36774B && this.f36775C == zzatdVar.f36775C && this.f36776D == zzatdVar.f36776D && this.f36779G == zzatdVar.f36779G && this.f36780H == zzatdVar.f36780H && this.f36781I == zzatdVar.f36781I && this.f36782J == zzatdVar.f36782J && this.f36783K == zzatdVar.f36783K && this.f36784L == zzatdVar.f36784L && this.f36785M == zzatdVar.f36785M && pz2.m12835o(this.f36789p, zzatdVar.f36789p) && pz2.m12835o(this.f36786N, zzatdVar.f36786N) && this.f36787O == zzatdVar.f36787O && pz2.m12835o(this.f36793t, zzatdVar.f36793t) && pz2.m12835o(this.f36794u, zzatdVar.f36794u) && pz2.m12835o(this.f36791r, zzatdVar.f36791r) && pz2.m12835o(this.f36797x, zzatdVar.f36797x) && pz2.m12835o(this.f36792s, zzatdVar.f36792s) && pz2.m12835o(this.f36778F, zzatdVar.f36778F) && Arrays.equals(this.f36777E, zzatdVar.f36777E) && this.f36796w.size() == zzatdVar.f36796w.size()) {
                for (int i = 0; i < this.f36796w.size(); i++) {
                    if (!Arrays.equals((byte[]) this.f36796w.get(i), (byte[]) zzatdVar.f36796w.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final zzatd m1129g(int i, int i2) {
        return new zzatd(this.f36789p, this.f36793t, this.f36794u, this.f36791r, this.f36790q, this.f36795v, this.f36798y, this.f36799z, this.f36773A, this.f36774B, this.f36775C, this.f36777E, this.f36776D, this.f36778F, this.f36779G, this.f36780H, this.f36781I, i, i2, this.f36785M, this.f36786N, this.f36787O, this.f36784L, this.f36796w, this.f36797x, this.f36792s);
    }

    /* renamed from: h */
    public final zzatd m1128h(int i) {
        return new zzatd(this.f36789p, this.f36793t, this.f36794u, this.f36791r, this.f36790q, i, this.f36798y, this.f36799z, this.f36773A, this.f36774B, this.f36775C, this.f36777E, this.f36776D, this.f36778F, this.f36779G, this.f36780H, this.f36781I, this.f36782J, this.f36783K, this.f36785M, this.f36786N, this.f36787O, this.f36784L, this.f36796w, this.f36797x, this.f36792s);
    }

    public final int hashCode() {
        int i = this.f36788P;
        if (i == 0) {
            String str = this.f36789p;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f36793t;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f36794u;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f36791r;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f36790q) * 31) + this.f36798y) * 31) + this.f36799z) * 31) + this.f36779G) * 31) + this.f36780H) * 31;
            String str5 = this.f36786N;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f36787O) * 31;
            zzavc zzavcVar = this.f36797x;
            int hashCode6 = (hashCode5 + (zzavcVar == null ? 0 : zzavcVar.hashCode())) * 31;
            zzaxo zzaxoVar = this.f36792s;
            int hashCode7 = hashCode6 + (zzaxoVar != null ? zzaxoVar.hashCode() : 0);
            this.f36788P = hashCode7;
            return hashCode7;
        }
        return i;
    }

    /* renamed from: i */
    public final zzatd m1127i(zzaxo zzaxoVar) {
        return new zzatd(this.f36789p, this.f36793t, this.f36794u, this.f36791r, this.f36790q, this.f36795v, this.f36798y, this.f36799z, this.f36773A, this.f36774B, this.f36775C, this.f36777E, this.f36776D, this.f36778F, this.f36779G, this.f36780H, this.f36781I, this.f36782J, this.f36783K, this.f36785M, this.f36786N, this.f36787O, this.f36784L, this.f36796w, this.f36797x, zzaxoVar);
    }

    public final String toString() {
        String str = this.f36789p;
        String str2 = this.f36793t;
        String str3 = this.f36794u;
        int i = this.f36790q;
        String str4 = this.f36786N;
        int i2 = this.f36798y;
        int i3 = this.f36799z;
        float f = this.f36773A;
        int i4 = this.f36779G;
        int i5 = this.f36780H;
        return "Format(" + str + ", " + str2 + ", " + str3 + ", " + i + ", " + str4 + ", [" + i2 + ", " + i3 + ", " + f + "], [" + i4 + ", " + i5 + "])";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36789p);
        parcel.writeString(this.f36793t);
        parcel.writeString(this.f36794u);
        parcel.writeString(this.f36791r);
        parcel.writeInt(this.f36790q);
        parcel.writeInt(this.f36795v);
        parcel.writeInt(this.f36798y);
        parcel.writeInt(this.f36799z);
        parcel.writeFloat(this.f36773A);
        parcel.writeInt(this.f36774B);
        parcel.writeFloat(this.f36775C);
        parcel.writeInt(this.f36777E != null ? 1 : 0);
        byte[] bArr = this.f36777E;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f36776D);
        parcel.writeParcelable(this.f36778F, i);
        parcel.writeInt(this.f36779G);
        parcel.writeInt(this.f36780H);
        parcel.writeInt(this.f36781I);
        parcel.writeInt(this.f36782J);
        parcel.writeInt(this.f36783K);
        parcel.writeInt(this.f36785M);
        parcel.writeString(this.f36786N);
        parcel.writeInt(this.f36787O);
        parcel.writeLong(this.f36784L);
        int size = this.f36796w.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.f36796w.get(i2));
        }
        parcel.writeParcelable(this.f36797x, 0);
        parcel.writeParcelable(this.f36792s, 0);
    }
}
