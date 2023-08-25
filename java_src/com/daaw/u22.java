package com.daaw;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.zat;
/* loaded from: classes.dex */
public final class u22 implements Parcelable.Creator<zat> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zat createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 1) {
                i = y71.m4039t(parcel, m4041r);
            } else if (m4047l == 2) {
                account = (Account) y71.m4054e(parcel, m4041r, Account.CREATOR);
            } else if (m4047l == 3) {
                i2 = y71.m4039t(parcel, m4041r);
            } else if (m4047l != 4) {
                y71.m4035x(parcel, m4041r);
            } else {
                googleSignInAccount = (GoogleSignInAccount) y71.m4054e(parcel, m4041r, GoogleSignInAccount.CREATOR);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zat(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zat[] newArray(int i) {
        return new zat[i];
    }
}
