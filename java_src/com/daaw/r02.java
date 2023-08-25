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

    /* renamed from: a */
    public static final cd1<String, String> f24693a = new cd1<>();
    @GuardedBy("sCache")

    /* renamed from: b */
    public static Locale f24694b;

    /* renamed from: a */
    public static String m11885a(Context context) {
        String packageName = context.getPackageName();
        try {
            return ez1.m22979a(context).m19343d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m11884b(Context context) {
        return context.getResources().getString(f21.common_google_play_services_notification_channel_name);
    }

    /* renamed from: c */
    public static String m11883c(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? 17039370 : f21.common_google_play_services_enable_button : f21.common_google_play_services_update_button : f21.common_google_play_services_install_button);
    }

    /* renamed from: d */
    public static String m11882d(Context context, int i) {
        Resources resources = context.getResources();
        String m11885a = m11885a(context);
        if (i != 1) {
            if (i == 2) {
                return C2365nt.m14834g(context) ? resources.getString(f21.common_google_play_services_wear_update_text) : resources.getString(f21.common_google_play_services_update_text, m11885a);
            } else if (i != 3) {
                if (i != 5) {
                    if (i != 7) {
                        if (i != 9) {
                            if (i != 20) {
                                switch (i) {
                                    case 16:
                                        return m11878h(context, "common_google_play_services_api_unavailable_text", m11885a);
                                    case 17:
                                        return m11878h(context, "common_google_play_services_sign_in_failed_text", m11885a);
                                    case 18:
                                        return resources.getString(f21.common_google_play_services_updating_text, m11885a);
                                    default:
                                        return resources.getString(g21.common_google_play_services_unknown_issue, m11885a);
                                }
                            }
                            return m11878h(context, "common_google_play_services_restricted_profile_text", m11885a);
                        }
                        return resources.getString(f21.common_google_play_services_unsupported_text, m11885a);
                    }
                    return m11878h(context, "common_google_play_services_network_error_text", m11885a);
                }
                return m11878h(context, "common_google_play_services_invalid_account_text", m11885a);
            } else {
                return resources.getString(f21.common_google_play_services_enable_text, m11885a);
            }
        }
        return resources.getString(f21.common_google_play_services_install_text, m11885a);
    }

    /* renamed from: e */
    public static String m11881e(Context context, int i) {
        return (i == 6 || i == 19) ? m11878h(context, "common_google_play_services_resolution_required_text", m11885a(context)) : m11882d(context, i);
    }

    /* renamed from: f */
    public static String m11880f(Context context, int i) {
        String m11877i = i == 6 ? m11877i(context, "common_google_play_services_resolution_required_title") : m11879g(context, i);
        return m11877i == null ? context.getResources().getString(f21.common_google_play_services_notification_ticker) : m11877i;
    }

    /* renamed from: g */
    public static String m11879g(Context context, int i) {
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
                return m11877i(context, "common_google_play_services_invalid_account_title");
            case 7:
                return m11877i(context, "common_google_play_services_network_error_title");
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
                return m11877i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return m11877i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: h */
    public static String m11878h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m11877i = m11877i(context, str);
        if (m11877i == null) {
            m11877i = resources.getString(g21.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, m11877i, str2);
    }

    /* renamed from: i */
    public static String m11877i(Context context, String str) {
        cd1<String, String> cd1Var = f24693a;
        synchronized (cd1Var) {
            Locale m11224d = C0955cj.m25365a(context.getResources().getConfiguration()).m11224d(0);
            if (!m11224d.equals(f24694b)) {
                cd1Var.clear();
                f24694b = m11224d;
            }
            String str2 = cd1Var.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources m26364d = b80.m26364d(context);
            if (m26364d == null) {
                return null;
            }
            int identifier = m26364d.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    "Missing resource: ".concat(str);
                }
                return null;
            }
            String string = m26364d.getString(identifier);
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
