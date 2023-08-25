package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.pz1;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new pz1();
    public final int p;
    @Nullable
    public List<MethodInvocation> q;

    public TelemetryData(int i, @Nullable List<MethodInvocation> list) {
        this.p = i;
        this.q = list;
    }

    public final int h() {
        return this.p;
    }

    public final List<MethodInvocation> q() {
        return this.q;
    }

    public final void s(MethodInvocation methodInvocation) {
        if (this.q == null) {
            this.q = new ArrayList();
        }
        this.q.add(methodInvocation);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.u(parcel, 2, this.q, false);
        z71.b(parcel, a);
    }
}
