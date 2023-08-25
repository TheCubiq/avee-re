package com.daaw;

import android.util.Base64;
import com.google.android.gms.internal.ads.zzacj;
import com.google.android.gms.internal.ads.zzadz;
import com.google.android.gms.internal.ads.zzbq;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class s42 {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static zzbq b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] I = it5.I(str, "=");
            if (I.length != 2) {
                s95.e("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (I[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzacj.a(new ik5(Base64.decode(I[1], 0))));
                } catch (RuntimeException e) {
                    s95.f("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzadz(I[0], I[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq(arrayList);
    }

    public static p42 c(ik5 ik5Var, boolean z, boolean z2) {
        if (z) {
            d(3, ik5Var, false);
        }
        String F = ik5Var.F((int) ik5Var.y(), cy6.c);
        long y = ik5Var.y();
        String[] strArr = new String[(int) y];
        int length = F.length() + 15;
        for (int i = 0; i < y; i++) {
            String F2 = ik5Var.F((int) ik5Var.y(), cy6.c);
            strArr[i] = F2;
            length = length + 4 + F2.length();
        }
        if (z2 && (ik5Var.s() & 1) == 0) {
            throw dl3.a("framing bit expected to be set", null);
        }
        return new p42(F, strArr, length + 1);
    }

    public static boolean d(int i, ik5 ik5Var, boolean z) {
        if (ik5Var.i() < 7) {
            if (z) {
                return false;
            }
            int i2 = ik5Var.i();
            throw dl3.a("too short header: " + i2, null);
        } else if (ik5Var.s() != i) {
            if (z) {
                return false;
            }
            throw dl3.a("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        } else if (ik5Var.s() == 118 && ik5Var.s() == 111 && ik5Var.s() == 114 && ik5Var.s() == 98 && ik5Var.s() == 105 && ik5Var.s() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw dl3.a("expected characters 'vorbis'", null);
        }
    }
}
