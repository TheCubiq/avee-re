package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import com.daaw.avee.MainActivity;
import com.daaw.avee.MediaControlsView;
import com.daaw.avee.R;
import com.daaw.avee.SettingsActivity;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.sw1;
import com.daaw.vw1;
import com.daaw.ww1;
import com.daaw.xw1;
import java.io.File;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class c60 {
    public static boolean j;
    public static boolean k;
    public static boolean l;
    public static volatile boolean m;
    public List<Object> a = new LinkedList();
    public Handler b = new Handler();
    public boolean c = false;
    public final int d = 201709;
    public final Date e = new Date(x21.D0, 11, 24);
    public final Date f = new Date(x21.D0, 11, 26);
    public final Date g = new Date(x21.E0, 0, 1);
    public final Date h = new Date(x21.E0, 0, 2);
    public final Date i = new Date(x21.E0, 0, 4);

    /* loaded from: classes.dex */
    public class a implements vw1.a<Boolean> {
        public a() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Boolean a() {
            if (!c60.this.c) {
                c60.this.m(dx0.e());
            }
            boolean z = c60.k;
            c60.k = false;
            return Boolean.valueOf(z);
        }
    }

    /* loaded from: classes.dex */
    public class b implements rw1.a<er0<tx0, vd0>, be0> {
        public b() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(er0<tx0, vd0> er0Var, be0 be0Var) {
            tx0 tx0Var;
            if (c60.l) {
                lo1<tx0, vd0> lo1Var = er0Var.size() > 0 ? er0Var.get(0) : null;
                if (lo1Var != null && (tx0Var = lo1Var.a) != null) {
                    com.daaw.avee.comp.playback.c.e.a(tx0Var.g(), Boolean.FALSE, 0L, null);
                }
                c60.l = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements rw1.a<Activity, Integer> {
        public c() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Activity activity, Integer num) {
            com.daaw.avee.comp.playback.c.u.a();
            boolean z = c60.j;
            c60.k = z;
            c60.l = z;
            if ((num.intValue() == i5.a || num.intValue() == i5.d) && Build.VERSION.SDK_INT >= 23) {
                activity.recreate();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements sw1.a<View, View, View> {
        public d() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
            r3.setBackgroundResource(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
            if (r3 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
            if (r3 != null) goto L9;
         */
        @Override // com.daaw.sw1.a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(android.view.View r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                java.util.Date r4 = new java.util.Date
                r4.<init>()
                com.daaw.c60 r0 = com.daaw.c60.this
                java.util.Date r0 = r0.e
                boolean r0 = r4.after(r0)
                if (r0 == 0) goto L27
                com.daaw.c60 r0 = com.daaw.c60.this
                java.util.Date r0 = r0.f
                boolean r0 = r4.before(r0)
                if (r0 == 0) goto L27
                r4 = 2131231100(0x7f08017c, float:1.8078271E38)
                if (r2 == 0) goto L21
                r2.setBackgroundResource(r4)
            L21:
                if (r3 == 0) goto L46
            L23:
                r3.setBackgroundResource(r4)
                goto L46
            L27:
                com.daaw.c60 r0 = com.daaw.c60.this
                java.util.Date r0 = r0.g
                boolean r0 = r4.after(r0)
                if (r0 == 0) goto L46
                com.daaw.c60 r0 = com.daaw.c60.this
                java.util.Date r0 = r0.h
                boolean r4 = r4.before(r0)
                if (r4 == 0) goto L46
                r4 = 2131231061(0x7f080155, float:1.8078192E38)
                if (r2 == 0) goto L43
                r2.setBackgroundResource(r4)
            L43:
                if (r3 == 0) goto L46
                goto L23
            L46:
                com.daaw.c60 r2 = com.daaw.c60.this
                com.daaw.c60.h(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.c60.d.a(android.view.View, android.view.View, android.view.View):void");
        }
    }

    /* loaded from: classes.dex */
    public class e implements pw1.a {
        public e() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            Context c = dx0.c();
            if (c != null) {
                vy.a.a(c.getResources().getString(R.string.clearing_cache));
                cr1.e(c);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements qw1.a<al> {
        public f() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(al alVar) {
            j5.e().c0(j5.X, 0);
            c60.this.n(alVar.a());
        }
    }

    /* loaded from: classes.dex */
    public class g implements qw1.a<vx> {
        public g() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(vx vxVar) {
            j5 e = j5.e();
            e.c0(j5.X, 201709);
            e.T(dx0.e());
            i5.a(dx0.e(), vxVar.getActivity());
        }
    }

    /* loaded from: classes.dex */
    public class h implements qw1.a<vx> {
        public h() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(vx vxVar) {
            j5.e().c0(j5.X, 0);
            MainActivity r0 = MainActivity.r0();
            if (r0 != null) {
                r0.l0();
            }
            Activity activity = vxVar.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements qw1.a<Activity> {
        public i() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Activity activity) {
        }
    }

    /* loaded from: classes.dex */
    public class j implements qw1.a<Activity> {
        public j() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Activity activity) {
            c60.this.n(activity);
        }
    }

    /* loaded from: classes.dex */
    public class k implements qw1.a<Activity> {
        public k() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Activity activity) {
            j5.e().T(activity);
        }
    }

    /* loaded from: classes.dex */
    public class l implements qw1.a<Context> {
        public l() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Context context) {
            c60.this.m(context);
        }
    }

    /* loaded from: classes.dex */
    public class m implements qw1.a<Context> {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ Context p;

            public a(Context context) {
                this.p = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                c60.this.m(this.p);
            }
        }

        public m() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Context context) {
            c60.this.b.post(new a(context));
        }
    }

    public c60() {
        SettingsActivity.u.b(new e(), this.a);
        SettingsActivity.v.b(new f(), this.a);
        i();
        vx.v.b(new g(), this.a);
        vx.w.b(new h(), this.a);
        MainActivity.h0.b(new i(), this.a);
        MainActivity.i0.b(new j(), this.a);
        MainActivity.l0.b(new k(), this.a);
        MainActivity.q0.b(new l(), this.a);
        MediaPlaybackService.b0.b(new m(), this.a);
        l01.t.b(new a(), this.a);
        l01.v.b(new b(), this.a);
        MainActivity.D0.b(new c(), this.a);
        MediaControlsView.p.a().b(new d(), this.a);
        dj0.t.b(new rw1.a() { // from class: com.daaw.z50
            @Override // com.daaw.rw1.a
            public final void c(Object obj, Object obj2) {
                c60.this.j((Integer) obj, (View) obj2);
            }
        }, this.a);
        g2.b.b(new ww1.a() { // from class: com.daaw.a60
            @Override // com.daaw.ww1.a
            public final Object b(Object obj) {
                File k2;
                k2 = c60.k(obj);
                return k2;
            }
        }, this.a);
        MainActivity.K0.b(new xw1.a() { // from class: com.daaw.b60
            @Override // com.daaw.xw1.a
            public final Object c(Object obj, Object obj2) {
                Boolean l2;
                l2 = c60.l((al) obj, (Intent) obj2);
                return l2;
            }
        }, this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(Integer num, View view) {
        int i2;
        Date date = new Date();
        if (date.after(this.e) && date.before(this.f)) {
            if (view == null) {
                return;
            }
            i2 = R.drawable.snowflakes_pattern;
        } else if (!date.after(this.g) || !date.before(this.h) || view == null) {
            return;
        } else {
            i2 = R.drawable.newyear201x_pattern;
        }
        view.setBackgroundResource(i2);
    }

    public static /* synthetic */ File k(Object obj) {
        return j5.a(((Integer) obj).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean l(com.daaw.al r4, android.content.Intent r5) {
        /*
            if (r5 == 0) goto L37
            java.lang.String r0 = r5.getAction()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LaunchIntent: action: "
            r1.append(r2)
            r1.append(r0)
            if (r0 == 0) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = ";"
            r0.append(r2)
            android.net.Uri r2 = r5.getData()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L2d
        L2b:
            java.lang.String r0 = ";null"
        L2d:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.daaw.lz1.c(r0)
        L37:
            r0 = 0
            if (r5 == 0) goto L72
            java.lang.String r1 = r5.getAction()
            if (r1 == 0) goto L72
            java.lang.String r2 = "android.intent.action.VIEW"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L72
            android.net.Uri r1 = r5.getData()
            if (r1 == 0) goto L72
            android.content.Context r2 = r4.b()
            android.content.ContentResolver r2 = r2.getContentResolver()
            boolean r2 = com.daaw.rv1.b(r2, r1)
            if (r2 == 0) goto L6a
            android.content.Context r4 = r4.b()
            int r4 = com.daaw.rv1.a(r4, r1)
            if (r4 <= 0) goto L72
            com.daaw.pv1.Z(r4)
            goto L72
        L6a:
            com.daaw.tx0 r4 = new com.daaw.tx0
            r2 = -1
            r4.<init>(r2, r1)
            goto L73
        L72:
            r4 = r0
        L73:
            if (r4 == 0) goto L8d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r4)
            com.daaw.rw1<java.util.List<com.daaw.tx0>, java.lang.Integer> r4 = com.daaw.avee.MainActivity.z0
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.a(r1, r2)
            r5.setAction(r0)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L8d:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.c60.l(com.daaw.al, android.content.Intent):java.lang.Boolean");
    }

    public final void i() {
        Date date = new Date();
        m = date.after(this.e) && date.before(this.i);
    }

    public final void m(Context context) {
        this.c = true;
        if (context != null) {
            j5 e2 = j5.e();
            e2.w(context);
            if (j) {
                return;
            }
            j = e2.h(j5.u);
            lz1.a("isFirstLaunch: " + j);
            e2.a0(j5.u, false);
            boolean z = j;
            k = z;
            l = z;
        }
    }

    public final void n(Activity activity) {
        if (j5.e().k(j5.X) != 201709) {
            vx.i(new al(activity), true);
        }
    }
}
