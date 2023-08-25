package com.daaw;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public final class yr3 {
    public static final Set a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
    public static final List b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    public static final List c = Arrays.asList("auto", "app", "am");
    public static final List d = Arrays.asList("_r", "_dbg");
    public static final List e = Arrays.asList((String[]) k6.a(jj7.a, jj7.b));
    public static final List f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static String a(String str) {
        String a2 = dh7.a(str);
        return a2 != null ? a2 : str;
    }

    public static void b(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean c(String str, String str2, Bundle bundle) {
        char c2;
        String str3;
        if ("_cmp".equals(str2)) {
            if (f(str) && bundle != null) {
                for (String str4 : d) {
                    if (bundle.containsKey(str4)) {
                        return false;
                    }
                }
                int hashCode = str.hashCode();
                if (hashCode == 101200) {
                    if (str.equals("fcm")) {
                        c2 = 0;
                    }
                    c2 = 65535;
                } else if (hashCode != 101230) {
                    if (hashCode == 3142703 && str.equals("fiam")) {
                        c2 = 2;
                    }
                    c2 = 65535;
                } else {
                    if (str.equals("fdl")) {
                        c2 = 1;
                    }
                    c2 = 65535;
                }
                if (c2 == 0) {
                    str3 = "fcm_integration";
                } else if (c2 == 1) {
                    str3 = "fdl_integration";
                } else if (c2 != 2) {
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

    public static boolean d(String str, Bundle bundle) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String str2 : d) {
                if (bundle.containsKey(str2)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean e(String str) {
        return !a.contains(str);
    }

    public static boolean f(String str) {
        return !c.contains(str);
    }
}
