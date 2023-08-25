package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.x62;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzacv extends zzade {
    public static final Parcelable.Creator<zzacv> CREATOR = new x62();

    /* renamed from: q */
    public final String f36735q;

    /* renamed from: r */
    public final boolean f36736r;

    /* renamed from: s */
    public final boolean f36737s;

    /* renamed from: t */
    public final String[] f36738t;

    /* renamed from: u */
    public final zzade[] f36739u;

    public zzacv(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = it5.f13991a;
        this.f36735q = readString;
        this.f36736r = parcel.readByte() != 0;
        this.f36737s = parcel.readByte() != 0;
        this.f36738t = (String[]) it5.m19391h(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f36739u = new zzade[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f36739u[i2] = (zzade) parcel.readParcelable(zzade.class.getClassLoader());
        }
    }

    public zzacv(String str, boolean z, boolean z2, String[] strArr, zzade[] zzadeVarArr) {
        super("CTOC");
        this.f36735q = str;
        this.f36736r = z;
        this.f36737s = z2;
        this.f36738t = strArr;
        this.f36739u = zzadeVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacv.class == obj.getClass()) {
            zzacv zzacvVar = (zzacv) obj;
            if (this.f36736r == zzacvVar.f36736r && this.f36737s == zzacvVar.f36737s && it5.m19376t(this.f36735q, zzacvVar.f36735q) && Arrays.equals(this.f36738t, zzacvVar.f36738t) && Arrays.equals(this.f36739u, zzacvVar.f36739u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f36736r ? 1 : 0) + 527) * 31) + (this.f36737s ? 1 : 0)) * 31;
        String str = this.f36735q;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36735q);
        parcel.writeByte(this.f36736r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f36737s ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f36738t);
        parcel.writeInt(this.f36739u.length);
        for (zzade zzadeVar : this.f36739u) {
            parcel.writeParcelable(zzadeVar, 0);
        }
    }
}
