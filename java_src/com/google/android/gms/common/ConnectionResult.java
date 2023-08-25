package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.iy2;
import com.daaw.ot0;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* renamed from: p */
    public final int f36573p;

    /* renamed from: q */
    public final int f36574q;

    /* renamed from: r */
    public final PendingIntent f36575r;

    /* renamed from: s */
    public final String f36576s;

    /* renamed from: t */
    public static final ConnectionResult f36572t = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new iy2();

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f36573p = i;
        this.f36574q = i2;
        this.f36575r = pendingIntent;
        this.f36576s = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* renamed from: v */
    public static String m1204v(int i) {
        if (i != 99) {
            if (i != 1500) {
                switch (i) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return "UNKNOWN_ERROR_CODE(" + i + ")";
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConnectionResult) {
            ConnectionResult connectionResult = (ConnectionResult) obj;
            return this.f36574q == connectionResult.f36574q && ot0.m13981a(this.f36575r, connectionResult.f36575r) && ot0.m13981a(this.f36576s, connectionResult.f36576s);
        }
        return false;
    }

    /* renamed from: h */
    public int m1209h() {
        return this.f36574q;
    }

    public int hashCode() {
        return ot0.m13980b(Integer.valueOf(this.f36574q), this.f36575r, this.f36576s);
    }

    /* renamed from: q */
    public String m1208q() {
        return this.f36576s;
    }

    /* renamed from: s */
    public PendingIntent m1207s() {
        return this.f36575r;
    }

    /* renamed from: t */
    public boolean m1206t() {
        return (this.f36574q == 0 || this.f36575r == null) ? false : true;
    }

    public String toString() {
        ot0.C2476a m13979c = ot0.m13979c(this);
        m13979c.m13978a("statusCode", m1204v(this.f36574q));
        m13979c.m13978a("resolution", this.f36575r);
        m13979c.m13978a("message", this.f36576s);
        return m13979c.toString();
    }

    /* renamed from: u */
    public boolean m1205u() {
        return this.f36574q == 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f36573p);
        z71.m2723k(parcel, 2, m1209h());
        z71.m2718p(parcel, 3, m1207s(), i, false);
        z71.m2717q(parcel, 4, m1208q(), false);
        z71.m2732b(parcel, m2733a);
    }
}
