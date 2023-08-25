package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import com.daaw.ey1;
import com.daaw.g30;
import com.daaw.ll0;
import com.daaw.qy1;
import com.daaw.rx1;
import com.daaw.sx1;
import com.daaw.wj1;
import com.daaw.yy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes.dex */
public class a implements rx1, yy {
    public static final String z = ll0.f("SystemFgDispatcher");
    public Context p;
    public ey1 q;
    public final wj1 r;
    public final Object s = new Object();
    public String t;
    public final Map<String, g30> u;
    public final Map<String, qy1> v;
    public final Set<qy1> w;
    public final sx1 x;
    public b y;

    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0035a implements Runnable {
        public final /* synthetic */ WorkDatabase p;
        public final /* synthetic */ String q;

        public RunnableC0035a(WorkDatabase workDatabase, String str) {
            this.p = workDatabase;
            this.q = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            qy1 m = this.p.B().m(this.q);
            if (m == null || !m.b()) {
                return;
            }
            synchronized (a.this.s) {
                a.this.v.put(this.q, m);
                a.this.w.add(m);
                a aVar = a.this;
                aVar.x.d(aVar.w);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void d(int i, int i2, Notification notification);

        void e(int i, Notification notification);

        void f(int i);

        void stop();
    }

    public a(Context context) {
        this.p = context;
        ey1 k = ey1.k(context);
        this.q = k;
        wj1 p = k.p();
        this.r = p;
        this.t = null;
        this.u = new LinkedHashMap();
        this.w = new HashSet();
        this.v = new HashMap();
        this.x = new sx1(this.p, p, this);
        this.q.m().d(this);
    }

    public static Intent a(Context context, String str, g30 g30Var) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", g30Var.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", g30Var.a());
        intent.putExtra("KEY_NOTIFICATION", g30Var.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, g30 g30Var) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", g30Var.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", g30Var.a());
        intent.putExtra("KEY_NOTIFICATION", g30Var.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // com.daaw.rx1
    public void b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            ll0.c().a(z, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.q.w(str);
        }
    }

    @Override // com.daaw.yy
    public void c(String str, boolean z2) {
        Map.Entry<String, g30> next;
        synchronized (this.s) {
            qy1 remove = this.v.remove(str);
            if (remove != null ? this.w.remove(remove) : false) {
                this.x.d(this.w);
            }
        }
        g30 remove2 = this.u.remove(str);
        if (str.equals(this.t) && this.u.size() > 0) {
            Iterator<Map.Entry<String, g30>> it = this.u.entrySet().iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            this.t = next.getKey();
            if (this.y != null) {
                g30 value = next.getValue();
                this.y.d(value.c(), value.a(), value.b());
                this.y.f(value.c());
            }
        }
        b bVar = this.y;
        if (remove2 == null || bVar == null) {
            return;
        }
        ll0.c().a(z, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.c()), str, Integer.valueOf(remove2.a())), new Throwable[0]);
        bVar.f(remove2.c());
    }

    @Override // com.daaw.rx1
    public void f(List<String> list) {
    }

    public final void g(Intent intent) {
        ll0.c().d(z, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.q.f(UUID.fromString(stringExtra));
    }

    public final void h(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        ll0.c().a(z, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.y == null) {
            return;
        }
        this.u.put(stringExtra, new g30(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.t)) {
            this.t = stringExtra;
            this.y.d(intExtra, intExtra2, notification);
            return;
        }
        this.y.e(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        for (Map.Entry<String, g30> entry : this.u.entrySet()) {
            i |= entry.getValue().a();
        }
        g30 g30Var = this.u.get(this.t);
        if (g30Var != null) {
            this.y.d(g30Var.c(), i, g30Var.b());
        }
    }

    public final void i(Intent intent) {
        ll0.c().d(z, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.r.b(new RunnableC0035a(this.q.o(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void j(Intent intent) {
        ll0.c().d(z, "Stopping foreground service", new Throwable[0]);
        b bVar = this.y;
        if (bVar != null) {
            bVar.stop();
        }
    }

    public void k() {
        this.y = null;
        synchronized (this.s) {
            this.x.e();
        }
        this.q.m().i(this);
    }

    public void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                g(intent);
                return;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                j(intent);
                return;
            } else {
                return;
            }
        }
        h(intent);
    }

    public void m(b bVar) {
        if (this.y != null) {
            ll0.c().b(z, "A callback already exists.", new Throwable[0]);
        } else {
            this.y = bVar;
        }
    }
}
