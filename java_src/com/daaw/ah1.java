package com.daaw;

import android.content.Context;
import android.content.res.Resources;
/* loaded from: classes.dex */
public class ah1 {
    public final Resources a;
    public final String b;

    public ah1(Context context) {
        ry0.j(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(g21.common_google_play_services_unknown_issue);
    }

    public String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
