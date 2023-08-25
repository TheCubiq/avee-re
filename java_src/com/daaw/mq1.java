package com.daaw;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
/* loaded from: classes.dex */
public class mq1 {

    /* renamed from: com.daaw.mq1$a */
    /* loaded from: classes.dex */
    public static class C2203a {
        /* renamed from: a */
        public static boolean m15855a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* renamed from: a */
    public static boolean m15856a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C2203a.m15855a(context);
        }
        return true;
    }
}
