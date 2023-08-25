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

    /* renamed from: p */
    public int f37027p;

    /* renamed from: q */
    public final UUID f37028q;

    /* renamed from: r */
    public final String f37029r;

    /* renamed from: s */
    public final String f37030s;

    /* renamed from: t */
    public final byte[] f37031t;

    public zzw(Parcel parcel) {
        this.f37028q = new UUID(parcel.readLong(), parcel.readLong());
        this.f37029r = parcel.readString();
        String readString = parcel.readString();
        int i = it5.f13991a;
        this.f37030s = readString;
        this.f37031t = parcel.createByteArray();
    }

    public zzw(UUID uuid, String str, String str2, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.f37028q = uuid;
        this.f37029r = null;
        this.f37030s = str2;
        this.f37031t = bArr;
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
            return it5.m19376t(this.f37029r, zzwVar.f37029r) && it5.m19376t(this.f37030s, zzwVar.f37030s) && it5.m19376t(this.f37028q, zzwVar.f37028q) && Arrays.equals(this.f37031t, zzwVar.f37031t);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f37027p;
        if (i == 0) {
            int hashCode = this.f37028q.hashCode() * 31;
            String str = this.f37029r;
            int hashCode2 = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f37030s.hashCode()) * 31) + Arrays.hashCode(this.f37031t);
            this.f37027p = hashCode2;
            return hashCode2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f37028q.getMostSignificantBits());
        parcel.writeLong(this.f37028q.getLeastSignificantBits());
        parcel.writeString(this.f37029r);
        parcel.writeString(this.f37030s);
        parcel.writeByteArray(this.f37031t);
    }
}
