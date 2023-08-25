package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class tc8 implements l5 {
    public static l5 e;
    public final Context a;
    public boolean b;
    public final ScheduledExecutorService c;
    public final ExecutorService d;

    public tc8(Context context) {
        this.b = false;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.c = newSingleThreadScheduledExecutor;
        this.d = Executors.newSingleThreadExecutor();
        this.a = context;
        if (this.b) {
            return;
        }
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new g68(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.b = true;
    }

    public static synchronized l5 d(Context context) {
        l5 l5Var;
        synchronized (tc8.class) {
            ry0.k(context, "Context must not be null");
            if (e == null) {
                e = new tc8(context.getApplicationContext());
            }
            l5Var = e;
        }
        return l5Var;
    }

    public static final void f(Context context) {
        if (!g(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                "Failed to clear app set ID generated for App ".concat(valueOf);
            }
        }
        if (g(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String valueOf2 = String.valueOf(context.getPackageName());
        if (valueOf2.length() != 0) {
            "Failed to clear app set ID last used time for App ".concat(valueOf2);
        }
    }

    public static final SharedPreferences g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void h(Context context) {
        SharedPreferences g = g(context);
        if (g.edit().putLong("app_set_id_last_used_time", mq.d().a()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        if (valueOf.length() != 0) {
            "Failed to store app set ID last used time for App ".concat(valueOf);
        }
        throw new p98("Failed to store the app set ID last used time.");
    }

    @Override // com.daaw.l5
    public final rj1<m5> a() {
        final tj1 tj1Var = new tj1();
        this.d.execute(new Runnable() { // from class: com.daaw.nu7
            @Override // java.lang.Runnable
            public final void run() {
                tc8.this.e(tj1Var);
            }
        });
        return tj1Var.a();
    }

    public final long b() {
        long j = g(this.a).getLong("app_set_id_last_used_time", -1L);
        if (j != -1) {
            return j + 33696000000L;
        }
        return -1L;
    }

    public final /* synthetic */ void e(tj1 tj1Var) {
        String string = g(this.a).getString("app_set_id", null);
        long b = b();
        if (string == null || mq.d().a() > b) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.a;
                if (!g(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    if (valueOf.length() != 0) {
                        "Failed to store app set ID generated for App ".concat(valueOf);
                    }
                    throw new p98("Failed to store the app set ID.");
                }
                h(context);
                Context context2 = this.a;
                SharedPreferences g = g(context2);
                if (!g.edit().putLong("app_set_id_creation_time", mq.d().a()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    if (valueOf2.length() != 0) {
                        "Failed to store app set ID creation time for App ".concat(valueOf2);
                    }
                    throw new p98("Failed to store the app set ID creation time.");
                }
            } catch (p98 e2) {
                tj1Var.b(e2);
                return;
            }
        } else {
            try {
                h(this.a);
            } catch (p98 e3) {
                tj1Var.b(e3);
                return;
            }
        }
        tj1Var.c(new m5(string, 1));
    }
}
