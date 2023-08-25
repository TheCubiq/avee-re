package com.daaw;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public final class yr3 {

    /* renamed from: a */
    public static final Set f33981a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b */
    public static final List f33982b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c */
    public static final List f33983c = Arrays.asList("auto", "app", "am");

    /* renamed from: d */
    public static final List f33984d = Arrays.asList("_r", "_dbg");

    /* renamed from: e */
    public static final List f33985e = Arrays.asList((String[]) C1913k6.m18038a(jj7.f15137a, jj7.f15138b));

    /* renamed from: f */
    public static final List f33986f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: a */
    public static String m3381a(String str) {
        String m24378a = dh7.m24378a(str);
        return m24378a != null ? m24378a : str;
    }

    /* renamed from: b */
    public static void m3380b(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    /* renamed from: c */
    public static boolean m3379c(String str, String str2, Bundle bundle) {
        char c;
        String str3;
        if ("_cmp".equals(str2)) {
            if (m3376f(str) && bundle != null) {
                for (String str4 : f33984d) {
                    if (bundle.containsKey(str4)) {
                        return false;
                    }
                }
                int hashCode = str.hashCode();
                if (hashCode == 101200) {
                    if (str.equals("fcm")) {
                        c = 0;
                    }
                    c = 65535;
                } else if (hashCode != 101230) {
                    if (hashCode == 3142703 && str.equals("fiam")) {
                        c = 2;
                    }
                    c = 65535;
                } else {
                    if (str.equals("fdl")) {
                        c = 1;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    str3 = "fcm_integration";
                } else if (c == 1) {
                    str3 = "fdl_integration";
                } else if (c != 2) {
                    return false;
                } else {
                    str3 = "fiam_integration";
                }
                bundle.putString("_cis", str3);
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m3378d(String str, Bundle bundle) {
        if (f33982b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String str2 : f33984d) {
                if (bundle.containsKey(str2)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m3377e(String str) {
        return !f33981a.contains(str);
    }

    /* renamed from: f */
    public static boolean m3376f(String str) {
        return !f33983c.contains(str);
    }
}
