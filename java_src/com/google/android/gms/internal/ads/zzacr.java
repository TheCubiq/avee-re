package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.v62;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzacr extends zzade {
    public static final Parcelable.Creator<zzacr> CREATOR = new v62();

    /* renamed from: q */
    public final byte[] f36728q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzacr(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = it5.f13991a;
        this.f36728q = (byte[]) it5.m19391h(parcel.createByteArray());
    }

    public zzacr(String str, byte[] bArr) {
        super(str);
        this.f36728q = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacr.class == obj.getClass()) {
            zzacr zzacrVar = (zzacr) obj;
            if (this.f36747p.equals(zzacrVar.f36747p) && Arrays.equals(this.f36728q, zzacrVar.f36728q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f36747p.hashCode() + 527) * 31) + Arrays.hashCode(this.f36728q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36747p);
        parcel.writeByteArray(this.f36728q);
    }
}
