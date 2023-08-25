package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.y62;
/* loaded from: classes.dex */
public final class zzacx extends zzade {
    public static final Parcelable.Creator<zzacx> CREATOR = new y62();

    /* renamed from: q */
    public final String f36740q;

    /* renamed from: r */
    public final String f36741r;

    /* renamed from: s */
    public final String f36742s;

    public zzacx(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = it5.f13991a;
        this.f36740q = readString;
        this.f36741r = parcel.readString();
        this.f36742s = parcel.readString();
    }

    public zzacx(String str, String str2, String str3) {
        super("COMM");
        this.f36740q = str;
        this.f36741r = str2;
        this.f36742s = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacx.class == obj.getClass()) {
            zzacx zzacxVar = (zzacx) obj;
            if (it5.m19376t(this.f36741r, zzacxVar.f36741r) && it5.m19376t(this.f36740q, zzacxVar.f36740q) && it5.m19376t(this.f36742s, zzacxVar.f36742s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f36740q;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f36741r;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36742s;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final String toString() {
        String str = this.f36747p;
        String str2 = this.f36740q;
        String str3 = this.f36741r;
        return str + ": language=" + str2 + ", description=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36747p);
        parcel.writeString(this.f36740q);
        parcel.writeString(this.f36742s);
    }
}
