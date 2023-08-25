package com.daaw;

import android.util.Base64;
import com.google.android.gms.internal.ads.zzacj;
import com.google.android.gms.internal.ads.zzadz;
import com.google.android.gms.internal.ads.zzbq;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class s42 {
    /* renamed from: a */
    public static int m10719a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    public static zzbq m10718b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] m19423I = it5.m19423I(str, "=");
            if (m19423I.length != 2) {
                s95.m10493e("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (m19423I[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzacj.m1134a(new ik5(Base64.decode(m19423I[1], 0))));
                } catch (RuntimeException e) {
                    s95.m10492f("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzadz(m19423I[0], m19423I[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq(arrayList);
    }

    /* renamed from: c */
    public static p42 m10717c(ik5 ik5Var, boolean z, boolean z2) {
        if (z) {
            m10716d(3, ik5Var, false);
        }
        String m19724F = ik5Var.m19724F((int) ik5Var.m19697y(), cy6.f6275c);
        long m19697y = ik5Var.m19697y();
        String[] strArr = new String[(int) m19697y];
        int length = m19724F.length() + 15;
        for (int i = 0; i < m19697y; i++) {
            String m19724F2 = ik5Var.m19724F((int) ik5Var.m19697y(), cy6.f6275c);
            strArr[i] = m19724F2;
            length = length + 4 + m19724F2.length();
        }
        if (z2 && (ik5Var.m19703s() & 1) == 0) {
            throw dl3.m24267a("framing bit expected to be set", null);
        }
        return new p42(m19724F, strArr, length + 1);
    }

    /* renamed from: d */
    public static boolean m10716d(int i, ik5 ik5Var, boolean z) {
        if (ik5Var.m19713i() < 7) {
            if (z) {
                return false;
            }
            int m19713i = ik5Var.m19713i();
            throw dl3.m24267a("too short header: " + m19713i, null);
        } else if (ik5Var.m19703s() != i) {
            if (z) {
                return false;
            }
            throw dl3.m24267a("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        } else if (ik5Var.m19703s() == 118 && ik5Var.m19703s() == 111 && ik5Var.m19703s() == 114 && ik5Var.m19703s() == 98 && ik5Var.m19703s() == 105 && ik5Var.m19703s() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw dl3.m24267a("expected characters 'vorbis'", null);
        }
    }
}
