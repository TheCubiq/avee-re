package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.u72;
import com.daaw.v72;
import com.daaw.x93;
/* loaded from: classes.dex */
public final class zzadx implements zzbp {
    public static final Parcelable.Creator<zzadx> CREATOR = new u72();

    /* renamed from: p */
    public final float f36771p;

    /* renamed from: q */
    public final int f36772q;

    public zzadx(float f, int i) {
        this.f36771p = f;
        this.f36772q = i;
    }

    public /* synthetic */ zzadx(Parcel parcel, v72 v72Var) {
        this.f36771p = parcel.readFloat();
        this.f36772q = parcel.readInt();
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
            if (this.f36771p == zzadxVar.f36771p && this.f36772q == zzadxVar.f36772q) {
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
        return ((Float.valueOf(this.f36771p).hashCode() + 527) * 31) + this.f36772q;
    }

    public final String toString() {
        float f = this.f36771p;
        int i = this.f36772q;
        return "smta: captureFrameRate=" + f + ", svcTemporalLayerCount=" + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f36771p);
        parcel.writeInt(this.f36772q);
    }
}
