package com.daaw;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
/* loaded from: classes.dex */
public final class ef8 implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, getServiceRequest.p);
        z71.k(parcel, 2, getServiceRequest.q);
        z71.k(parcel, 3, getServiceRequest.r);
        z71.q(parcel, 4, getServiceRequest.s, false);
        z71.j(parcel, 5, getServiceRequest.t, false);
        z71.t(parcel, 6, getServiceRequest.u, i, false);
        z71.e(parcel, 7, getServiceRequest.v, false);
        z71.p(parcel, 8, getServiceRequest.w, i, false);
        z71.t(parcel, 10, getServiceRequest.x, i, false);
        z71.t(parcel, 11, getServiceRequest.y, i, false);
        z71.c(parcel, 12, getServiceRequest.z);
        z71.k(parcel, 13, getServiceRequest.A);
        z71.c(parcel, 14, getServiceRequest.B);
        z71.q(parcel, 15, getServiceRequest.h(), false);
        z71.b(parcel, a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        Scope[] scopeArr = GetServiceRequest.D;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.E;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            switch (y71.l(r)) {
                case 1:
                    i = y71.t(parcel, r);
                    break;
                case 2:
                    i2 = y71.t(parcel, r);
                    break;
                case 3:
                    i3 = y71.t(parcel, r);
                    break;
                case 4:
                    str = y71.f(parcel, r);
                    break;
                case 5:
                    iBinder = y71.s(parcel, r);
                    break;
                case 6:
                    scopeArr = (Scope[]) y71.i(parcel, r, Scope.CREATOR);
                    break;
                case 7:
                    bundle = y71.a(parcel, r);
                    break;
                case 8:
                    account = (Account) y71.e(parcel, r, Account.CREATOR);
                    break;
                case 9:
                default:
                    y71.x(parcel, r);
                    break;
                case 10:
                    featureArr = (Feature[]) y71.i(parcel, r, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) y71.i(parcel, r, Feature.CREATOR);
                    break;
                case 12:
                    z = y71.m(parcel, r);
                    break;
                case 13:
                    i4 = y71.t(parcel, r);
                    break;
                case 14:
                    z2 = y71.m(parcel, r);
                    break;
                case 15:
                    str2 = y71.f(parcel, r);
                    break;
            }
        }
        y71.k(parcel, y);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
