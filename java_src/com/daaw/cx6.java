package com.daaw;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
/* loaded from: classes.dex */
public final class cx6 {

    /* renamed from: a */
    public final String f6259a;

    public cx6(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.f6259a = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
    }

    /* renamed from: f */
    public static String m24907f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* renamed from: a */
    public final int m24912a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m24907f(this.f6259a, "Already connected to the service.", objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int m24911b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m24907f(this.f6259a, str, objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public final int m24910c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m24907f(this.f6259a, str, objArr), th);
        }
        return 0;
    }

    /* renamed from: d */
    public final int m24909d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m24907f(this.f6259a, str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public final int m24908e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m24907f(this.f6259a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
