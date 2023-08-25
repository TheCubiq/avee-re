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

    /* renamed from: q */
    public final String f36724q;

    /* renamed from: r */
    public final String f36725r;

    /* renamed from: s */
    public final int f36726s;

    /* renamed from: t */
    public final byte[] f36727t;

    public zzacp(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = it5.f13991a;
        this.f36724q = readString;
        this.f36725r = parcel.readString();
        this.f36726s = parcel.readInt();
        this.f36727t = (byte[]) it5.m19391h(parcel.createByteArray());
    }

    public zzacp(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f36724q = str;
        this.f36725r = str2;
        this.f36726s = i;
        this.f36727t = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacp.class == obj.getClass()) {
            zzacp zzacpVar = (zzacp) obj;
            if (this.f36726s == zzacpVar.f36726s && it5.m19376t(this.f36724q, zzacpVar.f36724q) && it5.m19376t(this.f36725r, zzacpVar.f36725r) && Arrays.equals(this.f36727t, zzacpVar.f36727t)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzade, com.google.android.gms.internal.ads.zzbp
    /* renamed from: f */
    public final void mo1104f(x93 x93Var) {
        x93Var.m5382q(this.f36727t, this.f36726s);
    }

    public final int hashCode() {
        int i = (this.f36726s + 527) * 31;
        String str = this.f36724q;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36725r;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f36727t);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final String toString() {
        String str = this.f36747p;
        String str2 = this.f36724q;
        String str3 = this.f36725r;
        return str + ": mimeType=" + str2 + ", description=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36724q);
        parcel.writeString(this.f36725r);
        parcel.writeInt(this.f36726s);
        parcel.writeByteArray(this.f36727t);
    }
}
