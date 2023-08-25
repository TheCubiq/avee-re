package com.daaw;

import android.content.Context;
import android.content.res.Resources;
/* loaded from: classes.dex */
public class ah1 {

    /* renamed from: a */
    public final Resources f3194a;

    /* renamed from: b */
    public final String f3195b;

    public ah1(Context context) {
        ry0.m10830j(context);
        Resources resources = context.getResources();
        this.f3194a = resources;
        this.f3195b = resources.getResourcePackageName(g21.common_google_play_services_unknown_issue);
    }

    /* renamed from: a */
    public String m27481a(String str) {
        int identifier = this.f3194a.getIdentifier(str, "string", this.f3195b);
        if (identifier == 0) {
            return null;
        }
        return this.f3194a.getString(identifier);
    }
}
