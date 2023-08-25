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
    public final View p;
    public final Map q;

    public zzcao(IBinder iBinder, IBinder iBinder2) {
        this.p = (View) nt0.M(yd0.a.I(iBinder));
        this.q = (Map) nt0.M(yd0.a.I(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.j(parcel, 1, nt0.g3(this.p).asBinder(), false);
        z71.j(parcel, 2, nt0.g3(this.q).asBinder(), false);
        z71.b(parcel, a);
    }
}
