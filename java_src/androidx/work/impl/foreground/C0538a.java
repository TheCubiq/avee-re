package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import com.daaw.InterfaceC3778yy;
import com.daaw.ey1;
import com.daaw.g30;
import com.daaw.ll0;
import com.daaw.qy1;
import com.daaw.rx1;
import com.daaw.sx1;
import com.daaw.wj1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* renamed from: androidx.work.impl.foreground.a */
/* loaded from: classes.dex */
public class C0538a implements rx1, InterfaceC3778yy {

    /* renamed from: z */
    public static final String f2552z = ll0.m16883f("SystemFgDispatcher");

    /* renamed from: p */
    public Context f2553p;

    /* renamed from: q */
    public ey1 f2554q;

    /* renamed from: r */
    public final wj1 f2555r;

    /* renamed from: s */
    public final Object f2556s = new Object();

    /* renamed from: t */
    public String f2557t;

    /* renamed from: u */
    public final Map<String, g30> f2558u;

    /* renamed from: v */
    public final Map<String, qy1> f2559v;

    /* renamed from: w */
    public final Set<qy1> f2560w;

    /* renamed from: x */
    public final sx1 f2561x;

    /* renamed from: y */
    public InterfaceC0540b f2562y;

    /* renamed from: androidx.work.impl.foreground.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0539a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ WorkDatabase f2563p;

        /* renamed from: q */
        public final /* synthetic */ String f2564q;

        public RunnableC0539a(WorkDatabase workDatabase, String str) {
            this.f2563p = workDatabase;
            this.f2564q = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            qy1 mo9719m = this.f2563p.mo27951B().mo9719m(this.f2564q);
            if (mo9719m == null || !mo9719m.m11937b()) {
                return;
            }
            synchronized (C0538a.this.f2556s) {
                C0538a.this.f2559v.put(this.f2564q, mo9719m);
                C0538a.this.f2560w.add(mo9719m);
                C0538a c0538a = C0538a.this;
                c0538a.f2561x.m9789d(c0538a.f2560w);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0540b {
        /* renamed from: d */
        void mo27887d(int i, int i2, Notification notification);

        /* renamed from: e */
        void mo27886e(int i, Notification notification);

        /* renamed from: f */
        void mo27885f(int i);

        void stop();
    }

    public C0538a(Context context) {
        this.f2553p = context;
        ey1 m23004k = ey1.m23004k(context);
        this.f2554q = m23004k;
        wj1 m22999p = m23004k.m22999p();
        this.f2555r = m22999p;
        this.f2557t = null;
        this.f2558u = new LinkedHashMap();
        this.f2560w = new HashSet();
        this.f2559v = new HashMap();
        this.f2561x = new sx1(this.f2553p, m22999p, this);
        this.f2554q.m23002m().m18158d(this);
    }

    /* renamed from: a */
    public static Intent m27897a(Context context, String str, g30 g30Var) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", g30Var.m22053c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", g30Var.m22055a());
        intent.putExtra("KEY_NOTIFICATION", g30Var.m22054b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: d */
    public static Intent m27896d(Context context, String str, g30 g30Var) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", g30Var.m22053c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", g30Var.m22055a());
        intent.putExtra("KEY_NOTIFICATION", g30Var.m22054b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: e */
    public static Intent m27895e(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // com.daaw.rx1
    /* renamed from: b */
    public void mo10849b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            ll0.m16885c().mo16882a(f2552z, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f2554q.m22992w(str);
        }
    }

    @Override // com.daaw.InterfaceC3778yy
    /* renamed from: c */
    public void mo3085c(String str, boolean z) {
        Map.Entry<String, g30> next;
        synchronized (this.f2556s) {
            qy1 remove = this.f2559v.remove(str);
            if (remove != null ? this.f2560w.remove(remove) : false) {
                this.f2561x.m9789d(this.f2560w);
            }
        }
        g30 remove2 = this.f2558u.remove(str);
        if (str.equals(this.f2557t) && this.f2558u.size() > 0) {
            Iterator<Map.Entry<String, g30>> it = this.f2558u.entrySet().iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            this.f2557t = next.getKey();
            if (this.f2562y != null) {
                g30 value = next.getValue();
                this.f2562y.mo27887d(value.m22053c(), value.m22055a(), value.m22054b());
                this.f2562y.mo27885f(value.m22053c());
            }
        }
        InterfaceC0540b interfaceC0540b = this.f2562y;
        if (remove2 == null || interfaceC0540b == null) {
            return;
        }
        ll0.m16885c().mo16882a(f2552z, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.m22053c()), str, Integer.valueOf(remove2.m22055a())), new Throwable[0]);
        interfaceC0540b.mo27885f(remove2.m22053c());
    }

    @Override // com.daaw.rx1
    /* renamed from: f */
    public void mo10848f(List<String> list) {
    }

    /* renamed from: g */
    public final void m27894g(Intent intent) {
        ll0.m16885c().mo16880d(f2552z, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f2554q.m23009f(UUID.fromString(stringExtra));
    }

    /* renamed from: h */
    public final void m27893h(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        ll0.m16885c().mo16882a(f2552z, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f2562y == null) {
            return;
        }
        this.f2558u.put(stringExtra, new g30(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f2557t)) {
            this.f2557t = stringExtra;
            this.f2562y.mo27887d(intExtra, intExtra2, notification);
            return;
        }
        this.f2562y.mo27886e(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        for (Map.Entry<String, g30> entry : this.f2558u.entrySet()) {
            i |= entry.getValue().m22055a();
        }
        g30 g30Var = this.f2558u.get(this.f2557t);
        if (g30Var != null) {
            this.f2562y.mo27887d(g30Var.m22053c(), i, g30Var.m22054b());
        }
    }

    /* renamed from: i */
    public final void m27892i(Intent intent) {
        ll0.m16885c().mo16880d(f2552z, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f2555r.mo6051b(new RunnableC0539a(this.f2554q.m23000o(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    /* renamed from: j */
    public void m27891j(Intent intent) {
        ll0.m16885c().mo16880d(f2552z, "Stopping foreground service", new Throwable[0]);
        InterfaceC0540b interfaceC0540b = this.f2562y;
        if (interfaceC0540b != null) {
            interfaceC0540b.stop();
        }
    }

    /* renamed from: k */
    public void m27890k() {
        this.f2562y = null;
        synchronized (this.f2556s) {
            this.f2561x.m9788e();
        }
        this.f2554q.m23002m().m18153i(this);
    }

    /* renamed from: l */
    public void m27889l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m27892i(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                m27894g(intent);
                return;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                m27891j(intent);
                return;
            } else {
                return;
            }
        }
        m27893h(intent);
    }

    /* renamed from: m */
    public void m27888m(InterfaceC0540b interfaceC0540b) {
        if (this.f2562y != null) {
            ll0.m16885c().mo16881b(f2552z, "A callback already exists.", new Throwable[0]);
        } else {
            this.f2562y = interfaceC0540b;
        }
    }
}
