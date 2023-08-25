package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.s62;
import com.daaw.x93;
@Deprecated
/* loaded from: classes.dex */
public class zzacl implements zzbp {
    public static final Parcelable.Creator<zzacl> CREATOR = new s62();
    public final String p;
    public final String q;

    public zzacl(Parcel parcel) {
        String readString = parcel.readString();
        int i = it5.a;
        this.p = readString;
        this.q = parcel.readString();
    }

    public zzacl(String str, String str2) {
        this.p = str;
        this.q = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzacl zzaclVar = (zzacl) obj;
            if (this.p.equals(zzaclVar.p) && this.q.equals(zzaclVar.q)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbp
    public final void f(x93 x93Var) {
        char c;
        String str = this.p;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            x93Var.H(this.q);
        } else if (c == 1) {
            x93Var.u(this.q);
        } else if (c == 2) {
            x93Var.t(this.q);
        } else if (c == 3) {
            x93Var.s(this.q);
        } else if (c != 4) {
        } else {
            x93Var.y(this.q);
        }
    }

    public final int hashCode() {
        return ((this.p.hashCode() + 527) * 31) + this.q.hashCode();
    }

    public final String toString() {
        String str = this.p;
        String str2 = this.q;
        return "VC: " + str + "=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeString(this.q);
    }
}
