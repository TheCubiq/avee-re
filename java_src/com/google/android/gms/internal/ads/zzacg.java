package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.b72;
import com.daaw.f92;
import com.daaw.it5;
import com.daaw.p62;
import com.daaw.x93;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzacg implements zzbp {
    public static final Parcelable.Creator<zzacg> CREATOR;

    /* renamed from: v */
    public static final f92 f36700v;

    /* renamed from: w */
    public static final f92 f36701w;

    /* renamed from: p */
    public final String f36702p;

    /* renamed from: q */
    public final String f36703q;

    /* renamed from: r */
    public final long f36704r;

    /* renamed from: s */
    public final long f36705s;

    /* renamed from: t */
    public final byte[] f36706t;

    /* renamed from: u */
    public int f36707u;

    static {
        b72 b72Var = new b72();
        b72Var.m26372s("application/id3");
        f36700v = b72Var.m26366y();
        b72 b72Var2 = new b72();
        b72Var2.m26372s("application/x-scte35");
        f36701w = b72Var2.m26366y();
        CREATOR = new p62();
    }

    public zzacg(Parcel parcel) {
        String readString = parcel.readString();
        int i = it5.f13991a;
        this.f36702p = readString;
        this.f36703q = parcel.readString();
        this.f36704r = parcel.readLong();
        this.f36705s = parcel.readLong();
        this.f36706t = (byte[]) it5.m19391h(parcel.createByteArray());
    }

    public zzacg(String str, String str2, long j, long j2, byte[] bArr) {
        this.f36702p = str;
        this.f36703q = str2;
        this.f36704r = j;
        this.f36705s = j2;
        this.f36706t = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacg.class == obj.getClass()) {
            zzacg zzacgVar = (zzacg) obj;
            if (this.f36704r == zzacgVar.f36704r && this.f36705s == zzacgVar.f36705s && it5.m19376t(this.f36702p, zzacgVar.f36702p) && it5.m19376t(this.f36703q, zzacgVar.f36703q) && Arrays.equals(this.f36706t, zzacgVar.f36706t)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    /* renamed from: f */
    public final /* synthetic */ void mo1104f(x93 x93Var) {
    }

    public final int hashCode() {
        int i = this.f36707u;
        if (i == 0) {
            String str = this.f36702p;
            int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f36703q;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.f36704r;
            long j2 = this.f36705s;
            int hashCode3 = ((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.f36706t);
            this.f36707u = hashCode3;
            return hashCode3;
        }
        return i;
    }

    public final String toString() {
        String str = this.f36702p;
        long j = this.f36705s;
        long j2 = this.f36704r;
        String str2 = this.f36703q;
        return "EMSG: scheme=" + str + ", id=" + j + ", durationMs=" + j2 + ", value=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36702p);
        parcel.writeString(this.f36703q);
        parcel.writeLong(this.f36704r);
        parcel.writeLong(this.f36705s);
        parcel.writeByteArray(this.f36706t);
    }
}
