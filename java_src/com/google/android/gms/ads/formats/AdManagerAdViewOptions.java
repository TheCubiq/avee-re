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
    public final boolean p;
    public final IBinder q;

    /* loaded from: classes.dex */
    public static final class Builder {
        public boolean a = false;
        public ShouldDelayBannerRenderingListener b;

        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this, (zzb) null);
        }

        public Builder setManualImpressionsEnabled(boolean z) {
            this.a = z;
            return this;
        }

        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.b = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    public /* synthetic */ AdManagerAdViewOptions(Builder builder, zzb zzbVar) {
        this.p = builder.a;
        this.q = builder.b != null ? new zzfj(builder.b) : null;
    }

    public AdManagerAdViewOptions(boolean z, IBinder iBinder) {
        this.p = z;
        this.q = iBinder;
    }

    public boolean getManualImpressionsEnabled() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.c(parcel, 1, getManualImpressionsEnabled());
        z71.j(parcel, 2, this.q, false);
        z71.b(parcel, a);
    }

    public final se3 zza() {
        IBinder iBinder = this.q;
        if (iBinder == null) {
            return null;
        }
        return re3.zzc(iBinder);
    }
}
