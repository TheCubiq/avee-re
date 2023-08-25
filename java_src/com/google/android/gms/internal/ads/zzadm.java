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

    /* renamed from: q */
    public final String f36758q;

    /* renamed from: r */
    public final String f36759r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzadm(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = it5.f13991a;
        this.f36758q = parcel.readString();
        this.f36759r = parcel.readString();
    }

    public zzadm(String str, String str2, String str3) {
        super(str);
        this.f36758q = str2;
        this.f36759r = str3;
    }

    /* renamed from: a */
    public static List m1133a(String str) {
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
            if (it5.m19376t(this.f36747p, zzadmVar.f36747p) && it5.m19376t(this.f36758q, zzadmVar.f36758q) && it5.m19376t(this.f36759r, zzadmVar.f36759r)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzade, com.google.android.gms.internal.ads.zzbp
    /* renamed from: f */
    public final void mo1104f(x93 x93Var) {
        char c;
        String str = this.f36747p;
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
                x93Var.m5407H(this.f36759r);
                return;
            case 2:
            case 3:
                x93Var.m5378u(this.f36759r);
                return;
            case 4:
            case 5:
                x93Var.m5380s(this.f36759r);
                return;
            case 6:
            case 7:
                x93Var.m5379t(this.f36759r);
                return;
            case '\b':
            case '\t':
                String[] m19424H = it5.m19424H(this.f36759r, "/");
                try {
                    int parseInt = Integer.parseInt(m19424H[0]);
                    Integer valueOf = m19424H.length > 1 ? Integer.valueOf(Integer.parseInt(m19424H[1])) : null;
                    x93Var.m5405J(Integer.valueOf(parseInt));
                    x93Var.m5406I(valueOf);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    x93Var.m5412C(Integer.valueOf(Integer.parseInt(this.f36759r)));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    int parseInt2 = Integer.parseInt(this.f36759r.substring(2, 4));
                    int parseInt3 = Integer.parseInt(this.f36759r.substring(0, 2));
                    x93Var.m5413B(Integer.valueOf(parseInt2));
                    x93Var.m5414A(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List m1133a = m1133a(this.f36759r);
                int size = m1133a.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            return;
                        }
                        x93Var.m5414A((Integer) m1133a.get(2));
                    }
                    x93Var.m5413B((Integer) m1133a.get(1));
                }
                x93Var.m5412C((Integer) m1133a.get(0));
                return;
            case 15:
                List m1133a2 = m1133a(this.f36759r);
                int size2 = m1133a2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 != 3) {
                            return;
                        }
                        x93Var.m5411D((Integer) m1133a2.get(2));
                    }
                    x93Var.m5410E((Integer) m1133a2.get(1));
                }
                x93Var.m5409F((Integer) m1133a2.get(0));
                return;
            case 16:
            case 17:
                x93Var.m5376w(this.f36759r);
                return;
            case 18:
            case 19:
                x93Var.m5375x(this.f36759r);
                return;
            case 20:
            case 21:
                x93Var.m5404K(this.f36759r);
                return;
            default:
                return;
        }
    }

    public final int hashCode() {
        int hashCode = (this.f36747p.hashCode() + 527) * 31;
        String str = this.f36758q;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36759r;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final String toString() {
        String str = this.f36747p;
        String str2 = this.f36758q;
        String str3 = this.f36759r;
        return str + ": description=" + str2 + ": value=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36747p);
        parcel.writeString(this.f36758q);
        parcel.writeString(this.f36759r);
    }
}
