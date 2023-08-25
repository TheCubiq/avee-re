package com.daaw;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
/* loaded from: classes.dex */
public abstract class yy1 {

    /* renamed from: a */
    public static final String f34254a = ll0.m16883f("WorkerFactory");

    /* renamed from: com.daaw.yy1$a */
    /* loaded from: classes.dex */
    public class C3780a extends yy1 {
        @Override // com.daaw.yy1
        /* renamed from: a */
        public ListenableWorker mo3077a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    /* renamed from: c */
    public static yy1 m3078c() {
        return new C3780a();
    }

    /* renamed from: a */
    public abstract ListenableWorker mo3077a(Context context, String str, WorkerParameters workerParameters);

    /* renamed from: b */
    public final ListenableWorker m3079b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker mo3077a = mo3077a(context, str, workerParameters);
        if (mo3077a == null) {
            Class cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                ll0 m16885c = ll0.m16885c();
                String str2 = f34254a;
                m16885c.mo16881b(str2, "Invalid class: " + str, th);
            }
            if (cls != null) {
                try {
                    mo3077a = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    ll0 m16885c2 = ll0.m16885c();
                    String str3 = f34254a;
                    m16885c2.mo16881b(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (mo3077a == null || !mo3077a.isUsed()) {
            return mo3077a;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
