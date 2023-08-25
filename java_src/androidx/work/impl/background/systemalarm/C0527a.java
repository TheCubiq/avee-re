package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C0530d;
import com.daaw.C3491x1;
import com.daaw.InterfaceC3778yy;
import com.daaw.ll0;
import com.daaw.qy1;
import java.util.HashMap;
import java.util.Map;
/* renamed from: androidx.work.impl.background.systemalarm.a */
/* loaded from: classes.dex */
public class C0527a implements InterfaceC3778yy {

    /* renamed from: s */
    public static final String f2498s = ll0.m16883f("CommandHandler");

    /* renamed from: p */
    public final Context f2499p;

    /* renamed from: q */
    public final Map<String, InterfaceC3778yy> f2500q = new HashMap();

    /* renamed from: r */
    public final Object f2501r = new Object();

    public C0527a(Context context) {
        this.f2499p = context;
    }

    /* renamed from: a */
    public static Intent m27931a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: b */
    public static Intent m27930b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: d */
    public static Intent m27929d(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    /* renamed from: e */
    public static Intent m27928e(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* renamed from: f */
    public static Intent m27927f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: g */
    public static Intent m27926g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: n */
    public static boolean m27919n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.daaw.InterfaceC3778yy
    /* renamed from: c */
    public void mo3085c(String str, boolean z) {
        synchronized (this.f2501r) {
            InterfaceC3778yy remove = this.f2500q.remove(str);
            if (remove != null) {
                remove.mo3085c(str, z);
            }
        }
    }

    /* renamed from: h */
    public final void m27925h(Intent intent, int i, C0530d c0530d) {
        ll0.m16885c().mo16882a(f2498s, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new C0528b(this.f2499p, i, c0530d).m27916a();
    }

    /* renamed from: i */
    public final void m27924i(Intent intent, int i, C0530d c0530d) {
        Bundle extras = intent.getExtras();
        synchronized (this.f2501r) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            ll0 m16885c = ll0.m16885c();
            String str = f2498s;
            m16885c.mo16882a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (this.f2500q.containsKey(string)) {
                ll0.m16885c().mo16882a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            } else {
                C0529c c0529c = new C0529c(this.f2499p, i, string, c0530d);
                this.f2500q.put(string, c0529c);
                c0529c.m27914e();
            }
        }
    }

    /* renamed from: j */
    public final void m27923j(Intent intent, int i) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        ll0.m16885c().mo16882a(f2498s, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
        mo3085c(string, z);
    }

    /* renamed from: k */
    public final void m27922k(Intent intent, int i, C0530d c0530d) {
        ll0.m16885c().mo16882a(f2498s, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
        c0530d.m27907g().m22996s();
    }

    /* renamed from: l */
    public final void m27921l(Intent intent, int i, C0530d c0530d) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        ll0 m16885c = ll0.m16885c();
        String str = f2498s;
        m16885c.mo16882a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase m23000o = c0530d.m27907g().m23000o();
        m23000o.m26481c();
        try {
            qy1 mo9719m = m23000o.mo27951B().mo9719m(string);
            if (mo9719m == null) {
                ll0 m16885c2 = ll0.m16885c();
                m16885c2.mo16878h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (mo9719m.f24625b.m3106a()) {
                ll0 m16885c3 = ll0.m16885c();
                m16885c3.mo16878h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
            } else {
                long m11938a = mo9719m.m11938a();
                if (mo9719m.m11937b()) {
                    ll0.m16885c().mo16882a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(m11938a)), new Throwable[0]);
                    C3491x1.m5655c(this.f2499p, c0530d.m27907g(), string, m11938a);
                    c0530d.m27903k(new C0530d.RunnableC0532b(c0530d, m27931a(this.f2499p), i));
                } else {
                    ll0.m16885c().mo16882a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(m11938a)), new Throwable[0]);
                    C3491x1.m5655c(this.f2499p, c0530d.m27907g(), string, m11938a);
                }
                m23000o.m26466r();
            }
        } finally {
            m23000o.m26477g();
        }
    }

    /* renamed from: m */
    public final void m27920m(Intent intent, C0530d c0530d) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        ll0.m16885c().mo16882a(f2498s, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        c0530d.m27907g().m22991x(string);
        C3491x1.m5657a(this.f2499p, c0530d.m27907g(), string);
        c0530d.mo3085c(string, false);
    }

    /* renamed from: o */
    public boolean m27918o() {
        boolean z;
        synchronized (this.f2501r) {
            z = !this.f2500q.isEmpty();
        }
        return z;
    }

    /* renamed from: p */
    public void m27917p(Intent intent, int i, C0530d c0530d) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m27925h(intent, i, c0530d);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            m27922k(intent, i, c0530d);
        } else if (!m27919n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            ll0.m16885c().mo16881b(f2498s, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m27921l(intent, i, c0530d);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            m27924i(intent, i, c0530d);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m27920m(intent, c0530d);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m27923j(intent, i);
        } else {
            ll0.m16885c().mo16878h(f2498s, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
