package com.daaw;

import android.view.View;
/* loaded from: classes.dex */
public class wp {
    public static String a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
