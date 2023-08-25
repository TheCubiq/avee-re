package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.p72;
/* loaded from: classes.dex */
public final class zzado extends zzade {
    public static final Parcelable.Creator<zzado> CREATOR = new p72();

    /* renamed from: q */
    public final String f36760q;

    /* renamed from: r */
    public final String f36761r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzado(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = it5.f13991a;
        this.f36760q = parcel.readString();
        this.f36761r = parcel.readString();
    }

    public zzado(String str, String str2, String str3) {
        super(str);
        this.f36760q = str2;
        this.f36761r = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzado.class == obj.getClass()) {
            zzado zzadoVar = (zzado) obj;
            if (this.f36747p.equals(zzadoVar.f36747p) && it5.m19376t(this.f36760q, zzadoVar.f36760q) && it5.m19376t(this.f36761r, zzadoVar.f36761r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f36747p.hashCode() + 527) * 31;
        String str = this.f36760q;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36761r;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final String toString() {
        String str = this.f36747p;
        String str2 = this.f36761r;
        return str + ": url=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36747p);
        parcel.writeString(this.f36760q);
        parcel.writeString(this.f36761r);
    }
}
