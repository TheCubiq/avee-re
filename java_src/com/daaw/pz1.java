package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class pz1 implements Parcelable.Creator<TelemetryData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TelemetryData createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                i = y71.t(parcel, r);
            } else if (l != 2) {
                y71.x(parcel, r);
            } else {
                arrayList = y71.j(parcel, r, MethodInvocation.CREATOR);
            }
        }
        y71.k(parcel, y);
        return new TelemetryData(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TelemetryData[] newArray(int i) {
        return new TelemetryData[i];
    }
}
