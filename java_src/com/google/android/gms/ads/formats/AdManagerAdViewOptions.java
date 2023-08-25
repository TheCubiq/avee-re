package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.re3;
import com.daaw.se3;
import com.daaw.z71;
import com.google.android.gms.ads.internal.client.zzfj;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();

    /* renamed from: p */
    public final boolean f36049p;

    /* renamed from: q */
    public final IBinder f36050q;

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f36051a = false;

        /* renamed from: b */
        public ShouldDelayBannerRenderingListener f36052b;

        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this, (zzb) null);
        }

        public Builder setManualImpressionsEnabled(boolean z) {
            this.f36051a = z;
            return this;
        }

        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.f36052b = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    public /* synthetic */ AdManagerAdViewOptions(Builder builder, zzb zzbVar) {
        this.f36049p = builder.f36051a;
        this.f36050q = builder.f36052b != null ? new zzfj(builder.f36052b) : null;
    }

    public AdManagerAdViewOptions(boolean z, IBinder iBinder) {
        this.f36049p = z;
        this.f36050q = iBinder;
    }

    public boolean getManualImpressionsEnabled() {
        return this.f36049p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2731c(parcel, 1, getManualImpressionsEnabled());
        z71.m2724j(parcel, 2, this.f36050q, false);
        z71.m2732b(parcel, m2733a);
    }

    public final se3 zza() {
        IBinder iBinder = this.f36050q;
        if (iBinder == null) {
            return null;
        }
        return re3.zzc(iBinder);
    }
}
