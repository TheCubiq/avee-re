package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.it5;
import com.daaw.o72;
import com.daaw.x93;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzadm extends zzade {
    public static final Parcelable.Creator<zzadm> CREATOR = new o72();
    public final String q;
    public final String r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzadm(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.daaw.it5.a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.q = r0
            java.lang.String r3 = r3.readString()
            r2.r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadm.<init>(android.os.Parcel):void");
    }

    public zzadm(String str, String str2, String str3) {
        super(str);
        this.q = str2;
        this.r = str3;
    }

    public static List a(String str) {
        int parseInt;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                parseInt = Integer.parseInt(str.substring(8, 10));
            } else if (str.length() < 7) {
                if (str.length() >= 4) {
                    parseInt = Integer.parseInt(str.substring(0, 4));
                }
                return arrayList;
            } else {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                parseInt = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(parseInt));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadm.class == obj.getClass()) {
            zzadm zzadmVar = (zzadm) obj;
            if (it5.t(this.p, zzadmVar.p) && it5.t(this.q, zzadmVar.q) && it5.t(this.r, zzadmVar.r)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzade, com.google.android.gms.internal.ads.zzbp
    public final void f(x93 x93Var) {
        char c;
        String str = this.p;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                x93Var.H(this.r);
                return;
            case 2:
            case 3:
                x93Var.u(this.r);
                return;
            case 4:
            case 5:
                x93Var.s(this.r);
                return;
            case 6:
            case 7:
                x93Var.t(this.r);
                return;
            case '\b':
            case '\t':
                String[] H = it5.H(this.r, "/");
                try {
                    int parseInt = Integer.parseInt(H[0]);
                    Integer valueOf = H.length > 1 ? Integer.valueOf(Integer.parseInt(H[1])) : null;
                    x93Var.J(Integer.valueOf(parseInt));
                    x93Var.I(valueOf);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    x93Var.C(Integer.valueOf(Integer.parseInt(this.r)));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    int parseInt2 = Integer.parseInt(this.r.substring(2, 4));
                    int parseInt3 = Integer.parseInt(this.r.substring(0, 2));
                    x93Var.B(Integer.valueOf(parseInt2));
                    x93Var.A(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List a = a(this.r);
                int size = a.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            return;
                        }
                        x93Var.A((Integer) a.get(2));
                    }
                    x93Var.B((Integer) a.get(1));
                }
                x93Var.C((Integer) a.get(0));
                return;
            case 15:
                List a2 = a(this.r);
                int size2 = a2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 != 3) {
                            return;
                        }
                        x93Var.D((Integer) a2.get(2));
                    }
                    x93Var.E((Integer) a2.get(1));
                }
                x93Var.F((Integer) a2.get(0));
                return;
            case 16:
            case 17:
                x93Var.w(this.r);
                return;
            case 18:
            case 19:
                x93Var.x(this.r);
                return;
            case 20:
            case 21:
                x93Var.K(this.r);
                return;
            default:
                return;
        }
    }

    public final int hashCode() {
        int hashCode = (this.p.hashCode() + 527) * 31;
        String str = this.q;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.r;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final String toString() {
        String str = this.p;
        String str2 = this.q;
        String str3 = this.r;
        return str + ": description=" + str2 + ": value=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
    }
}
