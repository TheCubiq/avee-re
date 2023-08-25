package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.daaw.at3;
import com.daaw.nt0;
import com.daaw.yd0;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcao> CREATOR = new at3();

    /* renamed from: p */
    public final View f36882p;

    /* renamed from: q */
    public final Map f36883q;

    public zzcao(IBinder iBinder, IBinder iBinder2) {
        this.f36882p = (View) nt0.m14831M(yd0.AbstractBinderC3691a.m3857I(iBinder));
        this.f36883q = (Map) nt0.m14831M(yd0.AbstractBinderC3691a.m3857I(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2724j(parcel, 1, nt0.m14830g3(this.f36882p).asBinder(), false);
        z71.m2724j(parcel, 2, nt0.m14830g3(this.f36883q).asBinder(), false);
        z71.m2732b(parcel, m2733a);
    }
}
