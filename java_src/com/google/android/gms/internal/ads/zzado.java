package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.p72;
/* loaded from: classes.dex */
public final class zzado extends zzade {
    public static final Parcelable.Creator<zzado> CREATOR = new p72();
    public final String q;
    public final String r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzado(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.daaw.it5.a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.q = r0
            java.lang.String r3 = r3.readString()
            r2.r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzado.<init>(android.os.Parcel):void");
    }

    public zzado(String str, String str2, String str3) {
        super(str);
        this.q = str2;
        this.r = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzado.class == obj.getClass()) {
            zzado zzadoVar = (zzado) obj;
            if (this.p.equals(zzadoVar.p) && it5.t(this.q, zzadoVar.q) && it5.t(this.r, zzadoVar.r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.p.hashCode() + 527) * 31;
        String str = this.q;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.r;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final String toString() {
        String str = this.p;
        String str2 = this.r;
        return str + ": url=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
    }
}
