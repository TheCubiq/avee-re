package com.daaw;

import android.view.View;
/* renamed from: com.daaw.wp */
/* loaded from: classes.dex */
public class C3458wp {
    /* renamed from: a */
    public static String m5880a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
