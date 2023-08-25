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

    /* renamed from: p */
    public final String f36716p;

    /* renamed from: q */
    public final String f36717q;

    public zzacl(Parcel parcel) {
        String readString = parcel.readString();
        int i = it5.f13991a;
        this.f36716p = readString;
        this.f36717q = parcel.readString();
    }

    public zzacl(String str, String str2) {
        this.f36716p = str;
        this.f36717q = str2;
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
            if (this.f36716p.equals(zzaclVar.f36716p) && this.f36717q.equals(zzaclVar.f36717q)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbp
    /* renamed from: f */
    public final void mo1104f(x93 x93Var) {
        char c;
        String str = this.f36716p;
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
            x93Var.m5407H(this.f36717q);
        } else if (c == 1) {
            x93Var.m5378u(this.f36717q);
        } else if (c == 2) {
            x93Var.m5379t(this.f36717q);
        } else if (c == 3) {
            x93Var.m5380s(this.f36717q);
        } else if (c != 4) {
        } else {
            x93Var.m5374y(this.f36717q);
        }
    }

    public final int hashCode() {
        return ((this.f36716p.hashCode() + 527) * 31) + this.f36717q.hashCode();
    }

    public final String toString() {
        String str = this.f36716p;
        String str2 = this.f36717q;
        return "VC: " + str + "=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36716p);
        parcel.writeString(this.f36717q);
    }
}
