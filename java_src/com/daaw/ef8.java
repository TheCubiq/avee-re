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
    /* renamed from: a */
    public static void m23494a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, getServiceRequest.f36625p);
        z71.m2723k(parcel, 2, getServiceRequest.f36626q);
        z71.m2723k(parcel, 3, getServiceRequest.f36627r);
        z71.m2717q(parcel, 4, getServiceRequest.f36628s, false);
        z71.m2724j(parcel, 5, getServiceRequest.f36629t, false);
        z71.m2714t(parcel, 6, getServiceRequest.f36630u, i, false);
        z71.m2729e(parcel, 7, getServiceRequest.f36631v, false);
        z71.m2718p(parcel, 8, getServiceRequest.f36632w, i, false);
        z71.m2714t(parcel, 10, getServiceRequest.f36633x, i, false);
        z71.m2714t(parcel, 11, getServiceRequest.f36634y, i, false);
        z71.m2731c(parcel, 12, getServiceRequest.f36635z);
        z71.m2723k(parcel, 13, getServiceRequest.f36622A);
        z71.m2731c(parcel, 14, getServiceRequest.f36623B);
        z71.m2717q(parcel, 15, getServiceRequest.m1166h(), false);
        z71.m2732b(parcel, m2733a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        Scope[] scopeArr = GetServiceRequest.f36620D;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f36621E;
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
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            switch (y71.m4047l(m4041r)) {
                case 1:
                    i = y71.m4039t(parcel, m4041r);
                    break;
                case 2:
                    i2 = y71.m4039t(parcel, m4041r);
                    break;
                case 3:
                    i3 = y71.m4039t(parcel, m4041r);
                    break;
                case 4:
                    str = y71.m4053f(parcel, m4041r);
                    break;
                case 5:
                    iBinder = y71.m4040s(parcel, m4041r);
                    break;
                case 6:
                    scopeArr = (Scope[]) y71.m4050i(parcel, m4041r, Scope.CREATOR);
                    break;
                case 7:
                    bundle = y71.m4058a(parcel, m4041r);
                    break;
                case 8:
                    account = (Account) y71.m4054e(parcel, m4041r, Account.CREATOR);
                    break;
                case 9:
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
                case 10:
                    featureArr = (Feature[]) y71.m4050i(parcel, m4041r, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) y71.m4050i(parcel, m4041r, Feature.CREATOR);
                    break;
                case 12:
                    z = y71.m4046m(parcel, m4041r);
                    break;
                case 13:
                    i4 = y71.m4039t(parcel, m4041r);
                    break;
                case 14:
                    z2 = y71.m4046m(parcel, m4041r);
                    break;
                case 15:
                    str2 = y71.m4053f(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
