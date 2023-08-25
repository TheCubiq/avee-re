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
    public final float A;
    public final int B;
    public final float C;
    public final int D;
    public final byte[] E;
    public final zzbbb F;
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
    public final zzaxo s;
    public final String t;
    public final String u;
    public final int v;
    public final List w;
    public final zzavc x;
    public final int y;
    public final int z;

    public zzatd(Parcel parcel) {
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
        this.E = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.D = parcel.readInt();
        this.F = (zzbbb) parcel.readParcelable(zzbbb.class.getClassLoader());
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
        this.x = (zzavc) parcel.readParcelable(zzavc.class.getClassLoader());
        this.s = (zzaxo) parcel.readParcelable(zzaxo.class.getClassLoader());
    }

    public zzatd(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzbbb zzbbbVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List list, zzavc zzavcVar, zzaxo zzaxoVar) {
        this.p = str;
        this.t = str2;
        this.u = str3;
        this.r = str4;
        this.q = i;
        this.v = i2;
        this.y = i3;
        this.z = i4;
        this.A = f;
        this.B = i5;
        this.C = f2;
        this.E = bArr;
        this.D = i6;
        this.F = zzbbbVar;
        this.G = i7;
        this.H = i8;
        this.I = i9;
        this.J = i10;
        this.K = i11;
        this.M = i12;
        this.N = str5;
        this.O = i13;
        this.L = j;
        this.w = list == null ? Collections.emptyList() : list;
        this.x = zzavcVar;
        this.s = zzaxoVar;
    }

    public static zzatd l(String str, String str2, String str3, int i, int i2, int i3, int i4, List list, zzavc zzavcVar, int i5, String str4) {
        return q(str, str2, null, -1, -1, i3, i4, -1, -1, -1, null, zzavcVar, 0, str4, null);
    }

    public static zzatd q(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, zzavc zzavcVar, int i8, String str4, zzaxo zzaxoVar) {
        return new zzatd(str, null, str2, null, -1, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, -1, -1, i8, str4, -1, Long.MAX_VALUE, list, zzavcVar, null);
    }

    public static zzatd s(String str, String str2, String str3, int i, List list, String str4, zzavc zzavcVar) {
        return new zzatd(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzavcVar, null);
    }

    public static zzatd t(String str, String str2, String str3, int i, zzavc zzavcVar) {
        return new zzatd(str, null, "application/x-camera-motion", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, zzavcVar, null);
    }

    public static zzatd u(String str, String str2, String str3, int i, int i2, String str4, int i3, zzavc zzavcVar, long j, List list) {
        return new zzatd(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzavcVar, null);
    }

    public static zzatd v(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List list, int i5, float f2, byte[] bArr, int i6, zzbbb zzbbbVar, zzavc zzavcVar) {
        return new zzatd(str, null, str2, null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzbbbVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zzavcVar, null);
    }

    @TargetApi(16)
    public static void w(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public final int a() {
        int i;
        int i2 = this.y;
        if (i2 == -1 || (i = this.z) == -1) {
            return -1;
        }
        return i2 * i;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.u);
        String str = this.N;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        w(mediaFormat, "max-input-size", this.v);
        w(mediaFormat, "width", this.y);
        w(mediaFormat, "height", this.z);
        float f = this.A;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        w(mediaFormat, "rotation-degrees", this.B);
        w(mediaFormat, "channel-count", this.G);
        w(mediaFormat, "sample-rate", this.H);
        w(mediaFormat, "encoder-delay", this.J);
        w(mediaFormat, "encoder-padding", this.K);
        for (int i = 0; i < this.w.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap((byte[]) this.w.get(i)));
        }
        zzbbb zzbbbVar = this.F;
        if (zzbbbVar != null) {
            w(mediaFormat, "color-transfer", zzbbbVar.r);
            w(mediaFormat, "color-standard", zzbbbVar.p);
            w(mediaFormat, "color-range", zzbbbVar.q);
            byte[] bArr = zzbbbVar.s;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final zzatd c(zzavc zzavcVar) {
        return new zzatd(this.p, this.t, this.u, this.r, this.q, this.v, this.y, this.z, this.A, this.B, this.C, this.E, this.D, this.F, this.G, this.H, this.I, this.J, this.K, this.M, this.N, this.O, this.L, this.w, zzavcVar, this.s);
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
            if (this.q == zzatdVar.q && this.v == zzatdVar.v && this.y == zzatdVar.y && this.z == zzatdVar.z && this.A == zzatdVar.A && this.B == zzatdVar.B && this.C == zzatdVar.C && this.D == zzatdVar.D && this.G == zzatdVar.G && this.H == zzatdVar.H && this.I == zzatdVar.I && this.J == zzatdVar.J && this.K == zzatdVar.K && this.L == zzatdVar.L && this.M == zzatdVar.M && pz2.o(this.p, zzatdVar.p) && pz2.o(this.N, zzatdVar.N) && this.O == zzatdVar.O && pz2.o(this.t, zzatdVar.t) && pz2.o(this.u, zzatdVar.u) && pz2.o(this.r, zzatdVar.r) && pz2.o(this.x, zzatdVar.x) && pz2.o(this.s, zzatdVar.s) && pz2.o(this.F, zzatdVar.F) && Arrays.equals(this.E, zzatdVar.E) && this.w.size() == zzatdVar.w.size()) {
                for (int i = 0; i < this.w.size(); i++) {
                    if (!Arrays.equals((byte[]) this.w.get(i), (byte[]) zzatdVar.w.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final zzatd g(int i, int i2) {
        return new zzatd(this.p, this.t, this.u, this.r, this.q, this.v, this.y, this.z, this.A, this.B, this.C, this.E, this.D, this.F, this.G, this.H, this.I, i, i2, this.M, this.N, this.O, this.L, this.w, this.x, this.s);
    }

    public final zzatd h(int i) {
        return new zzatd(this.p, this.t, this.u, this.r, this.q, i, this.y, this.z, this.A, this.B, this.C, this.E, this.D, this.F, this.G, this.H, this.I, this.J, this.K, this.M, this.N, this.O, this.L, this.w, this.x, this.s);
    }

    public final int hashCode() {
        int i = this.P;
        if (i == 0) {
            String str = this.p;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.t;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.u;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.r;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.q) * 31) + this.y) * 31) + this.z) * 31) + this.G) * 31) + this.H) * 31;
            String str5 = this.N;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.O) * 31;
            zzavc zzavcVar = this.x;
            int hashCode6 = (hashCode5 + (zzavcVar == null ? 0 : zzavcVar.hashCode())) * 31;
            zzaxo zzaxoVar = this.s;
            int hashCode7 = hashCode6 + (zzaxoVar != null ? zzaxoVar.hashCode() : 0);
            this.P = hashCode7;
            return hashCode7;
        }
        return i;
    }

    public final zzatd i(zzaxo zzaxoVar) {
        return new zzatd(this.p, this.t, this.u, this.r, this.q, this.v, this.y, this.z, this.A, this.B, this.C, this.E, this.D, this.F, this.G, this.H, this.I, this.J, this.K, this.M, this.N, this.O, this.L, this.w, this.x, zzaxoVar);
    }

    public final String toString() {
        String str = this.p;
        String str2 = this.t;
        String str3 = this.u;
        int i = this.q;
        String str4 = this.N;
        int i2 = this.y;
        int i3 = this.z;
        float f = this.A;
        int i4 = this.G;
        int i5 = this.H;
        return "Format(" + str + ", " + str2 + ", " + str3 + ", " + i + ", " + str4 + ", [" + i2 + ", " + i3 + ", " + f + "], [" + i4 + ", " + i5 + "])";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
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
        parcel.writeInt(this.E != null ? 1 : 0);
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
            parcel.writeByteArray((byte[]) this.w.get(i2));
        }
        parcel.writeParcelable(this.x, 0);
        parcel.writeParcelable(this.s, 0);
    }
}
