package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class tc8 implements InterfaceC2013l5 {

    /* renamed from: e */
    public static InterfaceC2013l5 f27488e;

    /* renamed from: a */
    public final Context f27489a;

    /* renamed from: b */
    public boolean f27490b;

    /* renamed from: c */
    public final ScheduledExecutorService f27491c;

    /* renamed from: d */
    public final ExecutorService f27492d;

    public tc8(Context context) {
        this.f27490b = false;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f27491c = newSingleThreadScheduledExecutor;
        this.f27492d = Executors.newSingleThreadExecutor();
        this.f27489a = context;
        if (this.f27490b) {
            return;
        }
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new g68(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.f27490b = true;
    }

    /* renamed from: d */
    public static synchronized InterfaceC2013l5 m9299d(Context context) {
        InterfaceC2013l5 interfaceC2013l5;
        synchronized (tc8.class) {
            ry0.m10829k(context, "Context must not be null");
            if (f27488e == null) {
                f27488e = new tc8(context.getApplicationContext());
            }
            interfaceC2013l5 = f27488e;
        }
        return interfaceC2013l5;
    }

    /* renamed from: f */
    public static final void m9297f(Context context) {
        if (!m9296g(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                "Failed to clear app set ID generated for App ".concat(valueOf);
            }
        }
        if (m9296g(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String valueOf2 = String.valueOf(context.getPackageName());
        if (valueOf2.length() != 0) {
            "Failed to clear app set ID last used time for App ".concat(valueOf2);
        }
    }

    /* renamed from: g */
    public static final SharedPreferences m9296g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* renamed from: h */
    public static final void m9295h(Context context) {
        SharedPreferences m9296g = m9296g(context);
        if (m9296g.edit().putLong("app_set_id_last_used_time", C2202mq.m15857d().mo15860a()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        if (valueOf.length() != 0) {
            "Failed to store app set ID last used time for App ".concat(valueOf);
        }
        throw new p98("Failed to store the app set ID last used time.");
    }

    @Override // com.daaw.InterfaceC2013l5
    /* renamed from: a */
    public final rj1<C2151m5> mo3453a() {
        final tj1 tj1Var = new tj1();
        this.f27492d.execute(new Runnable() { // from class: com.daaw.nu7
            @Override // java.lang.Runnable
            public final void run() {
                tc8.this.m9298e(tj1Var);
            }
        });
        return tj1Var.m9082a();
    }

    /* renamed from: b */
    public final long m9301b() {
        long j = m9296g(this.f27489a).getLong("app_set_id_last_used_time", -1L);
        if (j != -1) {
            return j + 33696000000L;
        }
        return -1L;
    }

    /* renamed from: e */
    public final /* synthetic */ void m9298e(tj1 tj1Var) {
        String string = m9296g(this.f27489a).getString("app_set_id", null);
        long m9301b = m9301b();
        if (string == null || C2202mq.m15857d().mo15860a() > m9301b) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f27489a;
                if (!m9296g(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    if (valueOf.length() != 0) {
                        "Failed to store app set ID generated for App ".concat(valueOf);
                    }
                    throw new p98("Failed to store the app set ID.");
                }
                m9295h(context);
                Context context2 = this.f27489a;
                SharedPreferences m9296g = m9296g(context2);
                if (!m9296g.edit().putLong("app_set_id_creation_time", C2202mq.m15857d().mo15860a()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    if (valueOf2.length() != 0) {
                        "Failed to store app set ID creation time for App ".concat(valueOf2);
                    }
                    throw new p98("Failed to store the app set ID creation time.");
                }
            } catch (p98 e) {
                tj1Var.m9081b(e);
                return;
            }
        } else {
            try {
                m9295h(this.f27489a);
            } catch (p98 e2) {
                tj1Var.m9081b(e2);
                return;
            }
        }
        tj1Var.m9080c(new C2151m5(string, 1));
    }
}
