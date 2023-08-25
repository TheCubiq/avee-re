package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.daaw.C3330vh;
import com.daaw.InterfaceC0842bi;
import com.daaw.InterfaceC1171ea;
import com.daaw.InterfaceC1391gc;
import com.daaw.InterfaceC1421gi;
import com.daaw.ScheduledExecutorServiceC3253us;
import com.daaw.ThreadFactoryC1449go;
import com.daaw.b01;
import com.daaw.dp1;
import com.daaw.ep1;
import com.daaw.i01;
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

    /* renamed from: a */
    public static final xi0<ScheduledExecutorService> f37907a = new xi0<>(new b01() { // from class: com.daaw.kz
        @Override // com.daaw.b01
        public final Object get() {
            ScheduledExecutorService m71p;
            m71p = ExecutorsRegistrar.m71p();
            return m71p;
        }
    });

    /* renamed from: b */
    public static final xi0<ScheduledExecutorService> f37908b = new xi0<>(new b01() { // from class: com.daaw.jz
        @Override // com.daaw.b01
        public final Object get() {
            ScheduledExecutorService m70q;
            m70q = ExecutorsRegistrar.m70q();
            return m70q;
        }
    });

    /* renamed from: c */
    public static final xi0<ScheduledExecutorService> f37909c = new xi0<>(new b01() { // from class: com.daaw.iz
        @Override // com.daaw.b01
        public final Object get() {
            ScheduledExecutorService m69r;
            m69r = ExecutorsRegistrar.m69r();
            return m69r;
        }
    });

    /* renamed from: d */
    public static final xi0<ScheduledExecutorService> f37910d = new xi0<>(new b01() { // from class: com.daaw.hz
        @Override // com.daaw.b01
        public final Object get() {
            ScheduledExecutorService m68s;
            m68s = ExecutorsRegistrar.m68s();
            return m68s;
        }
    });

    /* renamed from: i */
    public static StrictMode.ThreadPolicy m78i() {
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

    /* renamed from: j */
    public static ThreadFactory m77j(String str, int i) {
        return new ThreadFactoryC1449go(str, i, null);
    }

    /* renamed from: k */
    public static ThreadFactory m76k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC1449go(str, i, threadPolicy);
    }

    /* renamed from: l */
    public static /* synthetic */ ScheduledExecutorService m75l(InterfaceC0842bi interfaceC0842bi) {
        return f37907a.get();
    }

    /* renamed from: m */
    public static /* synthetic */ ScheduledExecutorService m74m(InterfaceC0842bi interfaceC0842bi) {
        return f37909c.get();
    }

    /* renamed from: n */
    public static /* synthetic */ ScheduledExecutorService m73n(InterfaceC0842bi interfaceC0842bi) {
        return f37908b.get();
    }

    /* renamed from: o */
    public static /* synthetic */ Executor m72o(InterfaceC0842bi interfaceC0842bi) {
        return dp1.INSTANCE;
    }

    /* renamed from: p */
    public static /* synthetic */ ScheduledExecutorService m71p() {
        return m66u(Executors.newFixedThreadPool(4, m76k("Firebase Background", 10, m78i())));
    }

    /* renamed from: q */
    public static /* synthetic */ ScheduledExecutorService m70q() {
        return m66u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), m76k("Firebase Lite", 0, m67t())));
    }

    /* renamed from: r */
    public static /* synthetic */ ScheduledExecutorService m69r() {
        return m66u(Executors.newCachedThreadPool(m77j("Firebase Blocking", 11)));
    }

    /* renamed from: s */
    public static /* synthetic */ ScheduledExecutorService m68s() {
        return Executors.newSingleThreadScheduledExecutor(m77j("Firebase Scheduler", 0));
    }

    /* renamed from: t */
    public static StrictMode.ThreadPolicy m67t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* renamed from: u */
    public static ScheduledExecutorService m66u(ExecutorService executorService) {
        return new ScheduledExecutorServiceC3253us(executorService, f37910d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3330vh<?>> getComponents() {
        return Arrays.asList(C3330vh.m7174d(i01.m20272a(InterfaceC1171ea.class, ScheduledExecutorService.class), i01.m20272a(InterfaceC1171ea.class, ExecutorService.class), i01.m20272a(InterfaceC1171ea.class, Executor.class)).m7153e(new InterfaceC1421gi() { // from class: com.daaw.gz
            @Override // com.daaw.InterfaceC1421gi
            /* renamed from: a */
            public final Object mo3451a(InterfaceC0842bi interfaceC0842bi) {
                ScheduledExecutorService m75l;
                m75l = ExecutorsRegistrar.m75l(interfaceC0842bi);
                return m75l;
            }
        }).m7155c(), C3330vh.m7174d(i01.m20272a(InterfaceC1391gc.class, ScheduledExecutorService.class), i01.m20272a(InterfaceC1391gc.class, ExecutorService.class), i01.m20272a(InterfaceC1391gc.class, Executor.class)).m7153e(new InterfaceC1421gi() { // from class: com.daaw.dz
            @Override // com.daaw.InterfaceC1421gi
            /* renamed from: a */
            public final Object mo3451a(InterfaceC0842bi interfaceC0842bi) {
                ScheduledExecutorService m74m;
                m74m = ExecutorsRegistrar.m74m(interfaceC0842bi);
                return m74m;
            }
        }).m7155c(), C3330vh.m7174d(i01.m20272a(wj0.class, ScheduledExecutorService.class), i01.m20272a(wj0.class, ExecutorService.class), i01.m20272a(wj0.class, Executor.class)).m7153e(new InterfaceC1421gi() { // from class: com.daaw.fz
            @Override // com.daaw.InterfaceC1421gi
            /* renamed from: a */
            public final Object mo3451a(InterfaceC0842bi interfaceC0842bi) {
                ScheduledExecutorService m73n;
                m73n = ExecutorsRegistrar.m73n(interfaceC0842bi);
                return m73n;
            }
        }).m7155c(), C3330vh.m7175c(i01.m20272a(ep1.class, Executor.class)).m7153e(new InterfaceC1421gi() { // from class: com.daaw.ez
            @Override // com.daaw.InterfaceC1421gi
            /* renamed from: a */
            public final Object mo3451a(InterfaceC0842bi interfaceC0842bi) {
                Executor m72o;
                m72o = ExecutorsRegistrar.m72o(interfaceC0842bi);
                return m72o;
            }
        }).m7155c());
    }
}
