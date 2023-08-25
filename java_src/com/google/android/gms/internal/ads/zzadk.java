package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.n72;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzadk extends zzade {
    public static final Parcelable.Creator<zzadk> CREATOR = new n72();

    /* renamed from: q */
    public final String f36756q;

    /* renamed from: r */
    public final byte[] f36757r;

    public zzadk(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = it5.f13991a;
        this.f36756q = readString;
        this.f36757r = (byte[]) it5.m19391h(parcel.createByteArray());
    }

    public zzadk(String str, byte[] bArr) {
        super("PRIV");
        this.f36756q = str;
        this.f36757r = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadk.class == obj.getClass()) {
            zzadk zzadkVar = (zzadk) obj;
            if (it5.m19376t(this.f36756q, zzadkVar.f36756q) && Arrays.equals(this.f36757r, zzadkVar.f36757r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f36756q;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f36757r);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final String toString() {
        String str = this.f36747p;
        String str2 = this.f36756q;
        return str + ": owner=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36756q);
        parcel.writeByteArray(this.f36757r);
    }
}
