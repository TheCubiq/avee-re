package com.daaw;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.daaw.p51;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class t80 {
    public static final s80 a;
    private static volatile Choreographer choreographer;

    static {
        Object a2;
        try {
            p51.a aVar = p51.p;
            a2 = p51.a(new r80(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            p51.a aVar2 = p51.p;
            a2 = p51.a(s51.a(th));
        }
        a = p51.c(a2) ? null : a2;
    }

    public static final Handler a(Looper looper, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT < 28) {
                try {
                    return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
                } catch (NoSuchMethodException unused) {
                    return new Handler(looper);
                }
            }
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        return new Handler(looper);
    }
}
