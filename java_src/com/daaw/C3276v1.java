package com.daaw;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
/* renamed from: com.daaw.v1 */
/* loaded from: classes.dex */
public class C3276v1 implements py1 {

    /* renamed from: a */
    public final Context f29710a;

    /* renamed from: b */
    public final InterfaceC2134ly f29711b;

    /* renamed from: c */
    public AlarmManager f29712c;

    /* renamed from: d */
    public final s81 f29713d;

    /* renamed from: e */
    public final InterfaceC0951cg f29714e;

    public C3276v1(Context context, InterfaceC2134ly interfaceC2134ly, AlarmManager alarmManager, InterfaceC0951cg interfaceC0951cg, s81 s81Var) {
        this.f29710a = context;
        this.f29711b = interfaceC2134ly;
        this.f29712c = alarmManager;
        this.f29714e = interfaceC0951cg;
        this.f29713d = s81Var;
    }

    public C3276v1(Context context, InterfaceC2134ly interfaceC2134ly, InterfaceC0951cg interfaceC0951cg, s81 s81Var) {
        this(context, interfaceC2134ly, (AlarmManager) context.getSystemService("alarm"), interfaceC0951cg, s81Var);
    }

    @Override // com.daaw.py1
    /* renamed from: a */
    public void mo7556a(sn1 sn1Var, int i) {
        mo7555b(sn1Var, i, false);
    }

    @Override // com.daaw.py1
    /* renamed from: b */
    public void mo7555b(sn1 sn1Var, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", sn1Var.mo6336b());
        builder.appendQueryParameter("priority", String.valueOf(fz0.m22132a(sn1Var.mo6334d())));
        if (sn1Var.mo6335c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(sn1Var.mo6335c(), 0));
        }
        Intent intent = new Intent(this.f29710a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (!z && m7554c(intent)) {
            nl0.m15088b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", sn1Var);
            return;
        }
        long mo11674J = this.f29711b.mo11674J(sn1Var);
        long m10543g = this.f29713d.m10543g(sn1Var.mo6334d(), mo11674J, i);
        nl0.m15087c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", sn1Var, Long.valueOf(m10543g), Long.valueOf(mo11674J), Integer.valueOf(i));
        this.f29712c.set(3, this.f29714e.mo21345a() + m10543g, PendingIntent.getBroadcast(this.f29710a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
    }

    /* renamed from: c */
    public boolean m7554c(Intent intent) {
        return PendingIntent.getBroadcast(this.f29710a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912) != null;
    }
}
