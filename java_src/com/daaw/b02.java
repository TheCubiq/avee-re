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
        int y = y71.y(parcel);
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
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            switch (y71.l(r)) {
                case 1:
                    i = y71.t(parcel, r);
                    break;
                case 2:
                    str = y71.f(parcel, r);
                    break;
                case 3:
                    str2 = y71.f(parcel, r);
                    break;
                case 4:
                    str3 = y71.f(parcel, r);
                    break;
                case 5:
                    str4 = y71.f(parcel, r);
                    break;
                case 6:
                    uri = (Uri) y71.e(parcel, r, Uri.CREATOR);
                    break;
                case 7:
                    str5 = y71.f(parcel, r);
                    break;
                case 8:
                    j = y71.u(parcel, r);
                    break;
                case 9:
                    str6 = y71.f(parcel, r);
                    break;
                case 10:
                    arrayList = y71.j(parcel, r, Scope.CREATOR);
                    break;
                case 11:
                    str7 = y71.f(parcel, r);
                    break;
                case 12:
                    str8 = y71.f(parcel, r);
                    break;
                default:
                    y71.x(parcel, r);
                    break;
            }
        }
        y71.k(parcel, y);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
