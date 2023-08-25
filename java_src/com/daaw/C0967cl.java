package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
/* renamed from: com.daaw.cl */
/* loaded from: classes2.dex */
public class C0967cl {
    /* renamed from: a */
    public static Activity m25255a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
