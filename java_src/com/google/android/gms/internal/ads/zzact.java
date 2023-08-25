package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.w62;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzact extends zzade {
    public static final Parcelable.Creator<zzact> CREATOR = new w62();

    /* renamed from: q */
    public final String f36729q;

    /* renamed from: r */
    public final int f36730r;

    /* renamed from: s */
    public final int f36731s;

    /* renamed from: t */
    public final long f36732t;

    /* renamed from: u */
    public final long f36733u;

    /* renamed from: v */
    public final zzade[] f36734v;

    public zzact(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = it5.f13991a;
        this.f36729q = readString;
        this.f36730r = parcel.readInt();
        this.f36731s = parcel.readInt();
        this.f36732t = parcel.readLong();
        this.f36733u = parcel.readLong();
        int readInt = parcel.readInt();
        this.f36734v = new zzade[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f36734v[i2] = (zzade) parcel.readParcelable(zzade.class.getClassLoader());
        }
    }

    public zzact(String str, int i, int i2, long j, long j2, zzade[] zzadeVarArr) {
        super("CHAP");
        this.f36729q = str;
        this.f36730r = i;
        this.f36731s = i2;
        this.f36732t = j;
        this.f36733u = j2;
        this.f36734v = zzadeVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzade, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzact.class == obj.getClass()) {
            zzact zzactVar = (zzact) obj;
            if (this.f36730r == zzactVar.f36730r && this.f36731s == zzactVar.f36731s && this.f36732t == zzactVar.f36732t && this.f36733u == zzactVar.f36733u && it5.m19376t(this.f36729q, zzactVar.f36729q) && Arrays.equals(this.f36734v, zzactVar.f36734v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.f36730r + 527) * 31) + this.f36731s) * 31) + ((int) this.f36732t)) * 31) + ((int) this.f36733u)) * 31;
        String str = this.f36729q;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36729q);
        parcel.writeInt(this.f36730r);
        parcel.writeInt(this.f36731s);
        parcel.writeLong(this.f36732t);
        parcel.writeLong(this.f36733u);
        parcel.writeInt(this.f36734v.length);
        for (zzade zzadeVar : this.f36734v) {
            parcel.writeParcelable(zzadeVar, 0);
        }
    }
}
