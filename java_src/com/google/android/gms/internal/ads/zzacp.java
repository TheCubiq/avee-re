package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.u62;
import com.daaw.x93;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzacp extends zzade {
    public static final Parcelable.Creator<zzacp> CREATOR = new u62();
    public final String q;
    public final String r;
    public final int s;
    public final byte[] t;

    public zzacp(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = it5.a;
        this.q = readString;
        this.r = parcel.readString();
        this.s = parcel.readInt();
        this.t = (byte[]) it5.h(parcel.createByteArray());
    }

    public zzacp(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.q = str;
        this.r = str2;
        this.s = i;
        this.t = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacp.class == obj.getClass()) {
            zzacp zzacpVar = (zzacp) obj;
            if (this.s == zzacpVar.s && it5.t(this.q, zzacpVar.q) && it5.t(this.r, zzacpVar.r) && Arrays.equals(this.t, zzacpVar.t)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzade, com.google.android.gms.internal.ads.zzbp
    public final void f(x93 x93Var) {
        x93Var.q(this.t, this.s);
    }

    public final int hashCode() {
        int i = (this.s + 527) * 31;
        String str = this.q;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.r;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.t);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final String toString() {
        String str = this.p;
        String str2 = this.q;
        String str3 = this.r;
        return str + ": mimeType=" + str2 + ", description=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeInt(this.s);
        parcel.writeByteArray(this.t);
    }
}
