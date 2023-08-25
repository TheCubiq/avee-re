package com.daaw;

import android.system.ErrnoException;
import android.system.OsConstants;
/* loaded from: classes.dex */
public final class ok6 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m14206b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
