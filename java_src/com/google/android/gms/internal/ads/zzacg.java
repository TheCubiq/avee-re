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
    public static final f92 v;
    public static final f92 w;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final byte[] t;
    public int u;

    static {
        b72 b72Var = new b72();
        b72Var.s("application/id3");
        v = b72Var.y();
        b72 b72Var2 = new b72();
        b72Var2.s("application/x-scte35");
        w = b72Var2.y();
        CREATOR = new p62();
    }

    public zzacg(Parcel parcel) {
        String readString = parcel.readString();
        int i = it5.a;
        this.p = readString;
        this.q = parcel.readString();
        this.r = parcel.readLong();
        this.s = parcel.readLong();
        this.t = (byte[]) it5.h(parcel.createByteArray());
    }

    public zzacg(String str, String str2, long j, long j2, byte[] bArr) {
        this.p = str;
        this.q = str2;
        this.r = j;
        this.s = j2;
        this.t = bArr;
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
            if (this.r == zzacgVar.r && this.s == zzacgVar.s && it5.t(this.p, zzacgVar.p) && it5.t(this.q, zzacgVar.q) && Arrays.equals(this.t, zzacgVar.t)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final /* synthetic */ void f(x93 x93Var) {
    }

    public final int hashCode() {
        int i = this.u;
        if (i == 0) {
            String str = this.p;
            int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.q;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.r;
            long j2 = this.s;
            int hashCode3 = ((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.t);
            this.u = hashCode3;
            return hashCode3;
        }
        return i;
    }

    public final String toString() {
        String str = this.p;
        long j = this.s;
        long j2 = this.r;
        String str2 = this.q;
        return "EMSG: scheme=" + str + ", id=" + j + ", durationMs=" + j2 + ", value=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeLong(this.r);
        parcel.writeLong(this.s);
        parcel.writeByteArray(this.t);
    }
}
