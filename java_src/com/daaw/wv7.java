package com.daaw;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
/* loaded from: classes2.dex */
public final class wv7 {

    /* renamed from: a */
    public static UserManager f31590a;

    /* renamed from: b */
    public static volatile boolean f31591b = !m5758b();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
        r7 = true;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m5759a(Context context) {
        boolean z;
        if (m5758b() && !f31591b) {
            synchronized (wv7.class) {
                if (!f31591b) {
                    int i = 1;
                    while (true) {
                        if (i > 2) {
                            break;
                        }
                        if (f31590a == null) {
                            f31590a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = f31590a;
                        if (userManager == null) {
                            z = true;
                            break;
                        }
                        try {
                            if (userManager.isUserUnlocked()) {
                                break;
                            }
                        } catch (NullPointerException unused) {
                            f31590a = null;
                            i++;
                        }
                    }
                    z = false;
                    if (z) {
                        f31590a = null;
                    }
                    if (z) {
                        f31591b = true;
                    }
                    if (!z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m5758b() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
