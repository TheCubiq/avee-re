package com.daaw;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
/* loaded from: classes.dex */
public class v1 implements py1 {
    public final Context a;
    public final ly b;
    public AlarmManager c;
    public final s81 d;
    public final cg e;

    public v1(Context context, ly lyVar, AlarmManager alarmManager, cg cgVar, s81 s81Var) {
        this.a = context;
        this.b = lyVar;
        this.c = alarmManager;
        this.e = cgVar;
        this.d = s81Var;
    }

    public v1(Context context, ly lyVar, cg cgVar, s81 s81Var) {
        this(context, lyVar, (AlarmManager) context.getSystemService("alarm"), cgVar, s81Var);
    }

    @Override // com.daaw.py1
    public void a(sn1 sn1Var, int i) {
        b(sn1Var, i, false);
    }

    @Override // com.daaw.py1
    public void b(sn1 sn1Var, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", sn1Var.b());
        builder.appendQueryParameter("priority", String.valueOf(fz0.a(sn1Var.d())));
        if (sn1Var.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(sn1Var.c(), 0));
        }
        Intent intent = new Intent(this.a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (!z && c(intent)) {
            nl0.b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", sn1Var);
            return;
        }
        long J = this.b.J(sn1Var);
        long g = this.d.g(sn1Var.d(), J, i);
        nl0.c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", sn1Var, Long.valueOf(g), Long.valueOf(J), Integer.valueOf(i));
        this.c.set(3, this.e.a() + g, PendingIntent.getBroadcast(this.a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
    }

    public boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912) != null;
    }
}
