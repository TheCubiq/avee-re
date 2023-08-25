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

    /* renamed from: p */
    public final int f36708p;

    /* renamed from: q */
    public final String f36709q;

    /* renamed from: r */
    public final String f36710r;

    /* renamed from: s */
    public final int f36711s;

    /* renamed from: t */
    public final int f36712t;

    /* renamed from: u */
    public final int f36713u;

    /* renamed from: v */
    public final int f36714v;

    /* renamed from: w */
    public final byte[] f36715w;

    public zzacj(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f36708p = i;
        this.f36709q = str;
        this.f36710r = str2;
        this.f36711s = i2;
        this.f36712t = i3;
        this.f36713u = i4;
        this.f36714v = i5;
        this.f36715w = bArr;
    }

    public zzacj(Parcel parcel) {
        this.f36708p = parcel.readInt();
        String readString = parcel.readString();
        int i = it5.f13991a;
        this.f36709q = readString;
        this.f36710r = parcel.readString();
        this.f36711s = parcel.readInt();
        this.f36712t = parcel.readInt();
        this.f36713u = parcel.readInt();
        this.f36714v = parcel.readInt();
        this.f36715w = (byte[]) it5.m19391h(parcel.createByteArray());
    }

    /* renamed from: a */
    public static zzacj m1134a(ik5 ik5Var) {
        int m19709m = ik5Var.m19709m();
        String m19724F = ik5Var.m19724F(ik5Var.m19709m(), cy6.f6273a);
        String m19724F2 = ik5Var.m19724F(ik5Var.m19709m(), cy6.f6275c);
        int m19709m2 = ik5Var.m19709m();
        int m19709m3 = ik5Var.m19709m();
        int m19709m4 = ik5Var.m19709m();
        int m19709m5 = ik5Var.m19709m();
        int m19709m6 = ik5Var.m19709m();
        byte[] bArr = new byte[m19709m6];
        ik5Var.m19720b(bArr, 0, m19709m6);
        return new zzacj(m19709m, m19724F, m19724F2, m19709m2, m19709m3, m19709m4, m19709m5, bArr);
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
            if (this.f36708p == zzacjVar.f36708p && this.f36709q.equals(zzacjVar.f36709q) && this.f36710r.equals(zzacjVar.f36710r) && this.f36711s == zzacjVar.f36711s && this.f36712t == zzacjVar.f36712t && this.f36713u == zzacjVar.f36713u && this.f36714v == zzacjVar.f36714v && Arrays.equals(this.f36715w, zzacjVar.f36715w)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    /* renamed from: f */
    public final void mo1104f(x93 x93Var) {
        x93Var.m5382q(this.f36715w, this.f36708p);
    }

    public final int hashCode() {
        return ((((((((((((((this.f36708p + 527) * 31) + this.f36709q.hashCode()) * 31) + this.f36710r.hashCode()) * 31) + this.f36711s) * 31) + this.f36712t) * 31) + this.f36713u) * 31) + this.f36714v) * 31) + Arrays.hashCode(this.f36715w);
    }

    public final String toString() {
        String str = this.f36709q;
        String str2 = this.f36710r;
        return "Picture: mimeType=" + str + ", description=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f36708p);
        parcel.writeString(this.f36709q);
        parcel.writeString(this.f36710r);
        parcel.writeInt(this.f36711s);
        parcel.writeInt(this.f36712t);
        parcel.writeInt(this.f36713u);
        parcel.writeInt(this.f36714v);
        parcel.writeByteArray(this.f36715w);
    }
}
