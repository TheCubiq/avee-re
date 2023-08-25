package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.vu8;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
/* loaded from: classes.dex */
public final class zzw implements Parcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new vu8();
    public int p;
    public final UUID q;
    public final String r;
    public final String s;
    public final byte[] t;

    public zzw(Parcel parcel) {
        this.q = new UUID(parcel.readLong(), parcel.readLong());
        this.r = parcel.readString();
        String readString = parcel.readString();
        int i = it5.a;
        this.s = readString;
        this.t = parcel.createByteArray();
    }

    public zzw(UUID uuid, String str, String str2, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.q = uuid;
        this.r = null;
        this.s = str2;
        this.t = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzw) {
            if (obj == this) {
                return true;
            }
            zzw zzwVar = (zzw) obj;
            return it5.t(this.r, zzwVar.r) && it5.t(this.s, zzwVar.s) && it5.t(this.q, zzwVar.q) && Arrays.equals(this.t, zzwVar.t);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.p;
        if (i == 0) {
            int hashCode = this.q.hashCode() * 31;
            String str = this.r;
            int hashCode2 = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.s.hashCode()) * 31) + Arrays.hashCode(this.t);
            this.p = hashCode2;
            return hashCode2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.q.getMostSignificantBits());
        parcel.writeLong(this.q.getLeastSignificantBits());
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeByteArray(this.t);
    }
}
