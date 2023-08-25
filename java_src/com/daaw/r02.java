package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class r02 {
    @GuardedBy("sCache")
    public static final cd1<String, String> a = new cd1<>();
    @GuardedBy("sCache")
    public static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return ez1.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(f21.common_google_play_services_notification_channel_name);
    }

    public static String c(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? 17039370 : f21.common_google_play_services_enable_button : f21.common_google_play_services_update_button : f21.common_google_play_services_install_button);
    }

    public static String d(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i != 1) {
            if (i == 2) {
                return nt.g(context) ? resources.getString(f21.common_google_play_services_wear_update_text) : resources.getString(f21.common_google_play_services_update_text, a2);
            } else if (i != 3) {
                if (i != 5) {
                    if (i != 7) {
                        if (i != 9) {
                            if (i != 20) {
                                switch (i) {
                                    case 16:
                                        return h(context, "common_google_play_services_api_unavailable_text", a2);
                                    case 17:
                                        return h(context, "common_google_play_services_sign_in_failed_text", a2);
                                    case 18:
                                        return resources.getString(f21.common_google_play_services_updating_text, a2);
                                    default:
                                        return resources.getString(g21.common_google_play_services_unknown_issue, a2);
                                }
                            }
                            return h(context, "common_google_play_services_restricted_profile_text", a2);
                        }
                        return resources.getString(f21.common_google_play_services_unsupported_text, a2);
                    }
                    return h(context, "common_google_play_services_network_error_text", a2);
                }
                return h(context, "common_google_play_services_invalid_account_text", a2);
            } else {
                return resources.getString(f21.common_google_play_services_enable_text, a2);
            }
        }
        return resources.getString(f21.common_google_play_services_install_text, a2);
    }

    public static String e(Context context, int i) {
        return (i == 6 || i == 19) ? h(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, i);
    }

    public static String f(Context context, int i) {
        String i2 = i == 6 ? i(context, "common_google_play_services_resolution_required_title") : g(context, i);
        return i2 == null ? context.getResources().getString(f21.common_google_play_services_notification_ticker) : i2;
    }

    public static String g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(f21.common_google_play_services_install_title);
            case 2:
                return resources.getString(f21.common_google_play_services_update_title);
            case 3:
                return resources.getString(f21.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                return i(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                return null;
            case 17:
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = i(context, str);
        if (i == null) {
            i = resources.getString(g21.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, i, str2);
    }

    public static String i(Context context, String str) {
        cd1<String, String> cd1Var = a;
        synchronized (cd1Var) {
            Locale d = cj.a(context.getResources().getConfiguration()).d(0);
            if (!d.equals(b)) {
                cd1Var.clear();
                b = d;
            }
            String str2 = cd1Var.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources d2 = b80.d(context);
            if (d2 == null) {
                return null;
            }
            int identifier = d2.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    "Missing resource: ".concat(str);
                }
                return null;
            }
            String string = d2.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                cd1Var.put(str, string);
                return string;
            }
            if (str.length() != 0) {
                "Got empty resource: ".concat(str);
            }
            return null;
        }
    }
}
