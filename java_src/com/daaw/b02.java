package com.daaw;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class b02 implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            switch (y71.m4047l(m4041r)) {
                case 1:
                    i = y71.m4039t(parcel, m4041r);
                    break;
                case 2:
                    str = y71.m4053f(parcel, m4041r);
                    break;
                case 3:
                    str2 = y71.m4053f(parcel, m4041r);
                    break;
                case 4:
                    str3 = y71.m4053f(parcel, m4041r);
                    break;
                case 5:
                    str4 = y71.m4053f(parcel, m4041r);
                    break;
                case 6:
                    uri = (Uri) y71.m4054e(parcel, m4041r, Uri.CREATOR);
                    break;
                case 7:
                    str5 = y71.m4053f(parcel, m4041r);
                    break;
                case 8:
                    j = y71.m4038u(parcel, m4041r);
                    break;
                case 9:
                    str6 = y71.m4053f(parcel, m4041r);
                    break;
                case 10:
                    arrayList = y71.m4049j(parcel, m4041r, Scope.CREATOR);
                    break;
                case 11:
                    str7 = y71.m4053f(parcel, m4041r);
                    break;
                case 12:
                    str8 = y71.m4053f(parcel, m4041r);
                    break;
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
