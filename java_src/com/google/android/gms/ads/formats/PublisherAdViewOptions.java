package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.re3;
import com.daaw.se3;
import com.daaw.z71;
import com.google.android.gms.ads.internal.client.zzca;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
@Deprecated
/* loaded from: classes.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzf();
    public final boolean p;
    public final zzcb q;
    public final IBinder r;

    @Deprecated
    /* loaded from: classes.dex */
    public static final class Builder {
        public ShouldDelayBannerRenderingListener a;

        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.a = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    public PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.p = z;
        this.q = iBinder != null ? zzca.zzd(iBinder) : null;
        this.r = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.c(parcel, 1, this.p);
        zzcb zzcbVar = this.q;
        z71.j(parcel, 2, zzcbVar == null ? null : zzcbVar.asBinder(), false);
        z71.j(parcel, 3, this.r, false);
        z71.b(parcel, a);
    }

    public final zzcb zza() {
        return this.q;
    }

    public final se3 zzb() {
        IBinder iBinder = this.r;
        if (iBinder == null) {
            return null;
        }
        return re3.zzc(iBinder);
    }

    public final boolean zzc() {
        return this.p;
    }
}
