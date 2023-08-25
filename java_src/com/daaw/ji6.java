package com.daaw;

import android.content.Context;
import android.content.res.Resources;
/* loaded from: classes2.dex */
public final class ji6 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(g21.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final String b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier != 0) {
            try {
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        return resources.getString(identifier);
    }
}
