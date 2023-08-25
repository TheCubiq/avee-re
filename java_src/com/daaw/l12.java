package com.daaw;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zak;
/* loaded from: classes2.dex */
public abstract class l12 extends yz1 implements p12 {
    public l12() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.daaw.yz1
    /* renamed from: g3 */
    public final boolean mo3020g3(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) s02.m10803a(parcel, ConnectionResult.CREATOR);
                zaa zaaVar = (zaa) s02.m10803a(parcel, zaa.CREATOR);
                break;
            case 4:
            case 6:
                Status status = (Status) s02.m10803a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 7:
                Status status2 = (Status) s02.m10803a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) s02.m10803a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo13769z0((zak) s02.m10803a(parcel, zak.CREATOR));
                break;
            case 9:
                zag zagVar = (zag) s02.m10803a(parcel, zag.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
