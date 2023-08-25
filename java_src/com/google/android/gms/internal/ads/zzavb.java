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

    /* renamed from: p */
    public int f36800p;

    /* renamed from: q */
    public final UUID f36801q;

    /* renamed from: r */
    public final String f36802r;

    /* renamed from: s */
    public final byte[] f36803s;

    /* renamed from: t */
    public final boolean f36804t;

    public zzavb(Parcel parcel) {
        this.f36801q = new UUID(parcel.readLong(), parcel.readLong());
        this.f36802r = parcel.readString();
        this.f36803s = parcel.createByteArray();
        this.f36804t = parcel.readByte() != 0;
    }

    public zzavb(UUID uuid, String str, byte[] bArr, boolean z) {
        Objects.requireNonNull(uuid);
        this.f36801q = uuid;
        this.f36802r = str;
        Objects.requireNonNull(bArr);
        this.f36803s = bArr;
        this.f36804t = false;
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
            return this.f36802r.equals(zzavbVar.f36802r) && pz2.m12835o(this.f36801q, zzavbVar.f36801q) && Arrays.equals(this.f36803s, zzavbVar.f36803s);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f36800p;
        if (i == 0) {
            int hashCode = (((this.f36801q.hashCode() * 31) + this.f36802r.hashCode()) * 31) + Arrays.hashCode(this.f36803s);
            this.f36800p = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f36801q.getMostSignificantBits());
        parcel.writeLong(this.f36801q.getLeastSignificantBits());
        parcel.writeString(this.f36802r);
        parcel.writeByteArray(this.f36803s);
        parcel.writeByte(this.f36804t ? (byte) 1 : (byte) 0);
    }
}
