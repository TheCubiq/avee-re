package com.daaw;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.daaw.p51;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class t80 {

    /* renamed from: a */
    public static final s80 f27113a;
    private static volatile Choreographer choreographer;

    static {
        Object m13631a;
        try {
            p51.C2516a c2516a = p51.f22616p;
            m13631a = p51.m13631a(new r80(m9457a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            p51.C2516a c2516a2 = p51.f22616p;
            m13631a = p51.m13631a(s51.m10708a(th));
        }
        f27113a = p51.m13629c(m13631a) ? null : m13631a;
    }

    /* renamed from: a */
    public static final Handler m9457a(Looper looper, boolean z) {
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
