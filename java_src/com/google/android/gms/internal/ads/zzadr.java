package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.q72;
import com.daaw.r72;
import com.daaw.x93;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzadr implements zzbp {
    public static final Parcelable.Creator<zzadr> CREATOR = new q72();

    /* renamed from: p */
    public final String f36762p;

    /* renamed from: q */
    public final byte[] f36763q;

    /* renamed from: r */
    public final int f36764r;

    /* renamed from: s */
    public final int f36765s;

    public /* synthetic */ zzadr(Parcel parcel, r72 r72Var) {
        String readString = parcel.readString();
        int i = it5.f13991a;
        this.f36762p = readString;
        this.f36763q = (byte[]) it5.m19391h(parcel.createByteArray());
        this.f36764r = parcel.readInt();
        this.f36765s = parcel.readInt();
    }

    public zzadr(String str, byte[] bArr, int i, int i2) {
        this.f36762p = str;
        this.f36763q = bArr;
        this.f36764r = i;
        this.f36765s = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadr.class == obj.getClass()) {
            zzadr zzadrVar = (zzadr) obj;
            if (this.f36762p.equals(zzadrVar.f36762p) && Arrays.equals(this.f36763q, zzadrVar.f36763q) && this.f36764r == zzadrVar.f36764r && this.f36765s == zzadrVar.f36765s) {
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
        return ((((((this.f36762p.hashCode() + 527) * 31) + Arrays.hashCode(this.f36763q)) * 31) + this.f36764r) * 31) + this.f36765s;
    }

    public final String toString() {
        return "mdta: key=".concat(String.valueOf(this.f36762p));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36762p);
        parcel.writeByteArray(this.f36763q);
        parcel.writeInt(this.f36764r);
        parcel.writeInt(this.f36765s);
    }
}
