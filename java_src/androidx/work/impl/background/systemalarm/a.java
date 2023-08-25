package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import com.daaw.ll0;
import com.daaw.qy1;
import com.daaw.x1;
import com.daaw.yy;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a implements yy {
    public static final String s = ll0.f("CommandHandler");
    public final Context p;
    public final Map<String, yy> q = new HashMap();
    public final Object r = new Object();

    public a(Context context) {
        this.p = context;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    public static Intent f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static boolean n(Bundle bundle, String... strArr) {
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

    @Override // com.daaw.yy
    public void c(String str, boolean z) {
        synchronized (this.r) {
            yy remove = this.q.remove(str);
            if (remove != null) {
                remove.c(str, z);
            }
        }
    }

    public final void h(Intent intent, int i, d dVar) {
        ll0.c().a(s, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new b(this.p, i, dVar).a();
    }

    public final void i(Intent intent, int i, d dVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.r) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            ll0 c = ll0.c();
            String str = s;
            c.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (this.q.containsKey(string)) {
                ll0.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            } else {
                c cVar = new c(this.p, i, string, dVar);
                this.q.put(string, cVar);
                cVar.e();
            }
        }
    }

    public final void j(Intent intent, int i) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        ll0.c().a(s, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
        c(string, z);
    }

    public final void k(Intent intent, int i, d dVar) {
        ll0.c().a(s, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
        dVar.g().s();
    }

    public final void l(Intent intent, int i, d dVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        ll0 c = ll0.c();
        String str = s;
        c.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase o = dVar.g().o();
        o.c();
        try {
            qy1 m = o.B().m(string);
            if (m == null) {
                ll0 c2 = ll0.c();
                c2.h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (m.b.a()) {
                ll0 c3 = ll0.c();
                c3.h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
            } else {
                long a = m.a();
                if (m.b()) {
                    ll0.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a)), new Throwable[0]);
                    x1.c(this.p, dVar.g(), string, a);
                    dVar.k(new d.b(dVar, a(this.p), i));
                } else {
                    ll0.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a)), new Throwable[0]);
                    x1.c(this.p, dVar.g(), string, a);
                }
                o.r();
            }
        } finally {
            o.g();
        }
    }

    public final void m(Intent intent, d dVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        ll0.c().a(s, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        dVar.g().x(string);
        x1.a(this.p, dVar.g(), string);
        dVar.c(string, false);
    }

    public boolean o() {
        boolean z;
        synchronized (this.r) {
            z = !this.q.isEmpty();
        }
        return z;
    }

    public void p(Intent intent, int i, d dVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, i, dVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, i, dVar);
        } else if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            ll0.c().b(s, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, i, dVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, i, dVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, dVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, i);
        } else {
            ll0.c().h(s, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
