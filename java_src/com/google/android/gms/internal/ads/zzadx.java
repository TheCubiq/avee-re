package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.u72;
import com.daaw.v72;
import com.daaw.x93;
/* loaded from: classes.dex */
public final class zzadx implements zzbp {
    public static final Parcelable.Creator<zzadx> CREATOR = new u72();
    public final float p;
    public final int q;

    public zzadx(float f, int i) {
        this.p = f;
        this.q = i;
    }

    public /* synthetic */ zzadx(Parcel parcel, v72 v72Var) {
        this.p = parcel.readFloat();
        this.q = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadx.class == obj.getClass()) {
            zzadx zzadxVar = (zzadx) obj;
            if (this.p == zzadxVar.p && this.q == zzadxVar.q) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final /* synthetic */ void f(x93 x93Var) {
    }

    public final int hashCode() {
        return ((Float.valueOf(this.p).hashCode() + 527) * 31) + this.q;
    }

    public final String toString() {
        float f = this.p;
        int i = this.q;
        return "smta: captureFrameRate=" + f + ", svcTemporalLayerCount=" + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.p);
        parcel.writeInt(this.q);
    }
}
