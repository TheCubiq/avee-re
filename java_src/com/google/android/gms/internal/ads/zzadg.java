package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.l72;
/* loaded from: classes.dex */
public final class zzadg extends zzade {
    public static final Parcelable.Creator<zzadg> CREATOR = new l72();

    /* renamed from: q */
    public final String f36748q;

    /* renamed from: r */
    public final String f36749r;

    /* renamed from: s */
    public final String f36750s;

    public zzadg(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = it5.f13991a;
        this.f36748q = readString;
        this.f36749r = parcel.readString();
        this.f36750s = parcel.readString();
    }

    public zzadg(String str, String str2, String str3) {
        super("----");
        this.f36748q = str;
        this.f36749r = str2;
        this.f36750s = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadg.class == obj.getClass()) {
            zzadg zzadgVar = (zzadg) obj;
            if (it5.m19376t(this.f36749r, zzadgVar.f36749r) && it5.m19376t(this.f36748q, zzadgVar.f36748q) && it5.m19376t(this.f36750s, zzadgVar.f36750s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f36748q;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f36749r;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36750s;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final String toString() {
        String str = this.f36747p;
        String str2 = this.f36748q;
        String str3 = this.f36749r;
        return str + ": domain=" + str2 + ", description=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36747p);
        parcel.writeString(this.f36748q);
        parcel.writeString(this.f36750s);
    }
}
