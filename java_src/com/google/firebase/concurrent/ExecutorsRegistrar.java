package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.daaw.b01;
import com.daaw.bi;
import com.daaw.dp1;
import com.daaw.ea;
import com.daaw.ep1;
import com.daaw.gc;
import com.daaw.gi;
import com.daaw.go;
import com.daaw.i01;
import com.daaw.us;
import com.daaw.vh;
import com.daaw.wj0;
import com.daaw.xi0;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final xi0<ScheduledExecutorService> a = new xi0<>(new b01() { // from class: com.daaw.kz
        @Override // com.daaw.b01
        public final Object get() {
            ScheduledExecutorService p;
            p = ExecutorsRegistrar.p();
            return p;
        }
    });
    public static final xi0<ScheduledExecutorService> b = new xi0<>(new b01() { // from class: com.daaw.jz
        @Override // com.daaw.b01
        public final Object get() {
            ScheduledExecutorService q;
            q = ExecutorsRegistrar.q();
            return q;
        }
    });
    public static final xi0<ScheduledExecutorService> c = new xi0<>(new b01() { // from class: com.daaw.iz
        @Override // com.daaw.b01
        public final Object get() {
            ScheduledExecutorService r;
            r = ExecutorsRegistrar.r();
            return r;
        }
    });
    public static final xi0<ScheduledExecutorService> d = new xi0<>(new b01() { // from class: com.daaw.hz
        @Override // com.daaw.b01
        public final Object get() {
            ScheduledExecutorService s;
            s = ExecutorsRegistrar.s();
            return s;
        }
    });

    public static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    public static ThreadFactory j(String str, int i) {
        return new go(str, i, null);
    }

    public static ThreadFactory k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new go(str, i, threadPolicy);
    }

    public static /* synthetic */ ScheduledExecutorService l(bi biVar) {
        return a.get();
    }

    public static /* synthetic */ ScheduledExecutorService m(bi biVar) {
        return c.get();
    }

    public static /* synthetic */ ScheduledExecutorService n(bi biVar) {
        return b.get();
    }

    public static /* synthetic */ Executor o(bi biVar) {
        return dp1.INSTANCE;
    }

    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    public static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService u(ExecutorService executorService) {
        return new us(executorService, d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<vh<?>> getComponents() {
        return Arrays.asList(vh.d(i01.a(ea.class, ScheduledExecutorService.class), i01.a(ea.class, ExecutorService.class), i01.a(ea.class, Executor.class)).e(new gi() { // from class: com.daaw.gz
            @Override // com.daaw.gi
            public final Object a(bi biVar) {
                ScheduledExecutorService l;
                l = ExecutorsRegistrar.l(biVar);
                return l;
            }
        }).c(), vh.d(i01.a(gc.class, ScheduledExecutorService.class), i01.a(gc.class, ExecutorService.class), i01.a(gc.class, Executor.class)).e(new gi() { // from class: com.daaw.dz
            @Override // com.daaw.gi
            public final Object a(bi biVar) {
                ScheduledExecutorService m;
                m = ExecutorsRegistrar.m(biVar);
                return m;
            }
        }).c(), vh.d(i01.a(wj0.class, ScheduledExecutorService.class), i01.a(wj0.class, ExecutorService.class), i01.a(wj0.class, Executor.class)).e(new gi() { // from class: com.daaw.fz
            @Override // com.daaw.gi
            public final Object a(bi biVar) {
                ScheduledExecutorService n;
                n = ExecutorsRegistrar.n(biVar);
                return n;
            }
        }).c(), vh.c(i01.a(ep1.class, Executor.class)).e(new gi() { // from class: com.daaw.ez
            @Override // com.daaw.gi
            public final Object a(bi biVar) {
                Executor o;
                o = ExecutorsRegistrar.o(biVar);
                return o;
            }
        }).c());
    }
}
