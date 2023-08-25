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

    /* renamed from: p */
    public final boolean f36069p;

    /* renamed from: q */
    public final zzcb f36070q;

    /* renamed from: r */
    public final IBinder f36071r;

    @Deprecated
    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a */
        public ShouldDelayBannerRenderingListener f36072a;

        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.f36072a = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    public PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.f36069p = z;
        this.f36070q = iBinder != null ? zzca.zzd(iBinder) : null;
        this.f36071r = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2731c(parcel, 1, this.f36069p);
        zzcb zzcbVar = this.f36070q;
        z71.m2724j(parcel, 2, zzcbVar == null ? null : zzcbVar.asBinder(), false);
        z71.m2724j(parcel, 3, this.f36071r, false);
        z71.m2732b(parcel, m2733a);
    }

    public final zzcb zza() {
        return this.f36070q;
    }

    public final se3 zzb() {
        IBinder iBinder = this.f36071r;
        if (iBinder == null) {
            return null;
        }
        return re3.zzc(iBinder);
    }

    public final boolean zzc() {
        return this.f36069p;
    }
}
