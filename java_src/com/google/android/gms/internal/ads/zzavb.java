package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.js2;
import com.daaw.pz2;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
/* loaded from: classes.dex */
public final class zzavb implements Parcelable {
    public static final Parcelable.Creator<zzavb> CREATOR = new js2();
    public int p;
    public final UUID q;
    public final String r;
    public final byte[] s;
    public final boolean t;

    public zzavb(Parcel parcel) {
        this.q = new UUID(parcel.readLong(), parcel.readLong());
        this.r = parcel.readString();
        this.s = parcel.createByteArray();
        this.t = parcel.readByte() != 0;
    }

    public zzavb(UUID uuid, String str, byte[] bArr, boolean z) {
        Objects.requireNonNull(uuid);
        this.q = uuid;
        this.r = str;
        Objects.requireNonNull(bArr);
        this.s = bArr;
        this.t = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzavb) {
            if (obj == this) {
                return true;
            }
            zzavb zzavbVar = (zzavb) obj;
            return this.r.equals(zzavbVar.r) && pz2.o(this.q, zzavbVar.q) && Arrays.equals(this.s, zzavbVar.s);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.p;
        if (i == 0) {
            int hashCode = (((this.q.hashCode() * 31) + this.r.hashCode()) * 31) + Arrays.hashCode(this.s);
            this.p = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.q.getMostSignificantBits());
        parcel.writeLong(this.q.getLeastSignificantBits());
        parcel.writeString(this.r);
        parcel.writeByteArray(this.s);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
    }
}
