package com.daaw;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.daaw.aj */
/* loaded from: classes.dex */
public class C0629aj {

    /* renamed from: com.daaw.aj$a */
    /* loaded from: classes.dex */
    public static class C0630a {
        /* renamed from: a */
        public static Handler m27446a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: b */
    public static ThreadPoolExecutor m27449b(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.daaw.zi
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m27448c;
                m27448c = C0629aj.m27448c(str, runnable);
                return m27448c;
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public static /* synthetic */ Thread m27448c(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* renamed from: d */
    public static Handler m27447d() {
        return Build.VERSION.SDK_INT >= 28 ? C0630a.m27446a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }
}
