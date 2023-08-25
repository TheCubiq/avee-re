package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import com.daaw.avee.MainActivity;
import com.daaw.avee.MediaControlsView;
import com.daaw.avee.R;
import com.daaw.avee.SettingsActivity;
import com.daaw.avee.comp.playback.C0743c;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.sw1;
import com.daaw.vw1;
import com.daaw.ww1;
import com.daaw.xw1;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class c60 {

    /* renamed from: j */
    public static boolean f5518j;

    /* renamed from: k */
    public static boolean f5519k;

    /* renamed from: l */
    public static boolean f5520l;

    /* renamed from: m */
    public static volatile boolean f5521m;

    /* renamed from: a */
    public List<Object> f5522a = new LinkedList();

    /* renamed from: b */
    public Handler f5523b = new Handler();

    /* renamed from: c */
    public boolean f5524c = false;

    /* renamed from: d */
    public final int f5525d = 201709;

    /* renamed from: e */
    public final Date f5526e = new Date(x21.f31774D0, 11, 24);

    /* renamed from: f */
    public final Date f5527f = new Date(x21.f31774D0, 11, 26);

    /* renamed from: g */
    public final Date f5528g = new Date(x21.f31779E0, 0, 1);

    /* renamed from: h */
    public final Date f5529h = new Date(x21.f31779E0, 0, 2);

    /* renamed from: i */
    public final Date f5530i = new Date(x21.f31779E0, 0, 4);

    /* renamed from: com.daaw.c60$a */
    /* loaded from: classes.dex */
    public class C0916a implements vw1.InterfaceC3381a<Boolean> {
        public C0916a() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Boolean mo3126a() {
            if (!c60.this.f5524c) {
                c60.this.m25584m(dx0.m23837e());
            }
            boolean z = c60.f5519k;
            c60.f5519k = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.daaw.c60$b */
    /* loaded from: classes.dex */
    public class C0917b implements rw1.InterfaceC2894a<er0<tx0, vd0>, be0> {
        public C0917b() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(er0<tx0, vd0> er0Var, be0 be0Var) {
            tx0 tx0Var;
            if (c60.f5520l) {
                lo1<tx0, vd0> lo1Var = er0Var.size() > 0 ? er0Var.get(0) : null;
                if (lo1Var != null && (tx0Var = lo1Var.f17576a) != null) {
                    C0743c.f4011e.m16455a(tx0Var.m8745g(), Boolean.FALSE, 0L, null);
                }
                c60.f5520l = false;
            }
        }
    }

    /* renamed from: com.daaw.c60$c */
    /* loaded from: classes.dex */
    public class C0918c implements rw1.InterfaceC2894a<Activity, Integer> {
        public C0918c() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Activity activity, Integer num) {
            C0743c.f4027u.m20363a();
            boolean z = c60.f5518j;
            c60.f5519k = z;
            c60.f5520l = z;
            if ((num.intValue() == C1658i5.f13254a || num.intValue() == C1658i5.f13257d) && Build.VERSION.SDK_INT >= 23) {
                activity.recreate();
            }
        }
    }

    /* renamed from: com.daaw.c60$d */
    /* loaded from: classes.dex */
    public class C0919d implements sw1.InterfaceC2987a<View, View, View> {
        public C0919d() {
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
        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo3118a(View view, View view2, View view3) {
            int i;
            Date date = new Date();
            if (date.after(c60.this.f5526e) && date.before(c60.this.f5527f)) {
                i = R.drawable.snowflakes_pattern;
                if (view != null) {
                    view.setBackgroundResource(R.drawable.snowflakes_pattern);
                }
            } else if (date.after(c60.this.f5528g) && date.before(c60.this.f5529h)) {
                i = R.drawable.newyear201x_pattern;
                if (view != null) {
                    view.setBackgroundResource(R.drawable.newyear201x_pattern);
                }
            }
            c60.this.m25588i();
        }
    }

    /* renamed from: com.daaw.c60$e */
    /* loaded from: classes.dex */
    public class C0920e implements pw1.InterfaceC2649a {
        public C0920e() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            Context m23839c = dx0.m23839c();
            if (m23839c != null) {
                C3385vy.f30703a.m12018a(m23839c.getResources().getString(R.string.clearing_cache));
                cr1.m25075e(m23839c);
            }
        }
    }

    /* renamed from: com.daaw.c60$f */
    /* loaded from: classes.dex */
    public class C0921f implements qw1.InterfaceC2788a<C0645al> {
        public C0921f() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(C0645al c0645al) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14288X, 0);
            c60.this.m25583n(c0645al.m27378a());
        }
    }

    /* renamed from: com.daaw.c60$g */
    /* loaded from: classes.dex */
    public class C0922g implements qw1.InterfaceC2788a<DialogFragmentC3382vx> {
        public C0922g() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(DialogFragmentC3382vx dialogFragmentC3382vx) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 m18928e = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e();
            m18928e.m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14288X, 201709);
            m18928e.m18943T(dx0.m23837e());
            C1658i5.m20123a(dx0.m23837e(), dialogFragmentC3382vx.getActivity());
        }
    }

    /* renamed from: com.daaw.c60$h */
    /* loaded from: classes.dex */
    public class C0923h implements qw1.InterfaceC2788a<DialogFragmentC3382vx> {
        public C0923h() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(DialogFragmentC3382vx dialogFragmentC3382vx) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14288X, 0);
            MainActivity m26903r0 = MainActivity.m26903r0();
            if (m26903r0 != null) {
                m26903r0.m26909l0();
            }
            Activity activity = dialogFragmentC3382vx.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.daaw.c60$i */
    /* loaded from: classes.dex */
    public class C0924i implements qw1.InterfaceC2788a<Activity> {
        public C0924i() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Activity activity) {
        }
    }

    /* renamed from: com.daaw.c60$j */
    /* loaded from: classes.dex */
    public class C0925j implements qw1.InterfaceC2788a<Activity> {
        public C0925j() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Activity activity) {
            c60.this.m25583n(activity);
        }
    }

    /* renamed from: com.daaw.c60$k */
    /* loaded from: classes.dex */
    public class C0926k implements qw1.InterfaceC2788a<Activity> {
        public C0926k() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Activity activity) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18943T(activity);
        }
    }

    /* renamed from: com.daaw.c60$l */
    /* loaded from: classes.dex */
    public class C0927l implements qw1.InterfaceC2788a<Context> {
        public C0927l() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Context context) {
            c60.this.m25584m(context);
        }
    }

    /* renamed from: com.daaw.c60$m */
    /* loaded from: classes.dex */
    public class C0928m implements qw1.InterfaceC2788a<Context> {

        /* renamed from: com.daaw.c60$m$a */
        /* loaded from: classes.dex */
        public class RunnableC0929a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ Context f5544p;

            public RunnableC0929a(Context context) {
                this.f5544p = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                c60.this.m25584m(this.f5544p);
            }
        }

        public C0928m() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Context context) {
            c60.this.f5523b.post(new RunnableC0929a(context));
        }
    }

    public c60() {
        SettingsActivity.f3770u.m12989b(new C0920e(), this.f5522a);
        SettingsActivity.f3771v.m12017b(new C0921f(), this.f5522a);
        m25588i();
        DialogFragmentC3382vx.f30686v.m12017b(new C0922g(), this.f5522a);
        DialogFragmentC3382vx.f30687w.m12017b(new C0923h(), this.f5522a);
        MainActivity.f3715h0.m12017b(new C0924i(), this.f5522a);
        MainActivity.f3716i0.m12017b(new C0925j(), this.f5522a);
        MainActivity.f3719l0.m12017b(new C0926k(), this.f5522a);
        MainActivity.f3724q0.m12017b(new C0927l(), this.f5522a);
        MediaPlaybackService.f3858b0.m12017b(new C0928m(), this.f5522a);
        l01.f16923t.m6691b(new C0916a(), this.f5522a);
        l01.f16925v.m10861b(new C0917b(), this.f5522a);
        MainActivity.f3705D0.m10861b(new C0918c(), this.f5522a);
        MediaControlsView.f3764p.m26885a().m9794b(new C0919d(), this.f5522a);
        dj0.f7182t.m10861b(new rw1.InterfaceC2894a() { // from class: com.daaw.z50
            @Override // com.daaw.rw1.InterfaceC2894a
            /* renamed from: c */
            public final void mo2813c(Object obj, Object obj2) {
                c60.this.m25587j((Integer) obj, (View) obj2);
            }
        }, this.f5522a);
        C1354g2.f10158b.m5752b(new ww1.InterfaceC3477a() { // from class: com.daaw.a60
            @Override // com.daaw.ww1.InterfaceC3477a
            /* renamed from: b */
            public final Object mo5751b(Object obj) {
                File m25586k;
                m25586k = c60.m25586k(obj);
                return m25586k;
            }
        }, this.f5522a);
        MainActivity.f3712K0.m4424b(new xw1.InterfaceC3648a() { // from class: com.daaw.b60
            @Override // com.daaw.xw1.InterfaceC3648a
            /* renamed from: c */
            public final Object mo4423c(Object obj, Object obj2) {
                Boolean m25585l;
                m25585l = c60.m25585l((C0645al) obj, (Intent) obj2);
                return m25585l;
            }
        }, this.f5522a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m25587j(Integer num, View view) {
        int i;
        Date date = new Date();
        if (date.after(this.f5526e) && date.before(this.f5527f)) {
            if (view == null) {
                return;
            }
            i = R.drawable.snowflakes_pattern;
        } else if (!date.after(this.f5528g) || !date.before(this.f5529h) || view == null) {
            return;
        } else {
            i = R.drawable.newyear201x_pattern;
        }
        view.setBackgroundResource(i);
    }

    /* renamed from: k */
    public static /* synthetic */ File m25586k(Object obj) {
        return SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18936a(((Integer) obj).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Boolean m25585l(C0645al c0645al, Intent intent) {
        tx0 tx0Var;
        String action;
        Uri data;
        String str;
        if (intent != null) {
            String action2 = intent.getAction();
            StringBuilder sb = new StringBuilder();
            sb.append("LaunchIntent: action: ");
            sb.append(action2);
            if (action2 != null) {
                str = ";" + intent.getData();
            } else {
                str = ";null";
            }
            sb.append(str);
            lz1.m16363c(sb.toString());
        }
        if (intent != null && (action = intent.getAction()) != null && action.equals("android.intent.action.VIEW") && (data = intent.getData()) != null) {
            if (!rv1.m10892b(c0645al.m27377b().getContentResolver(), data)) {
                tx0Var = new tx0(-1L, data);
                if (tx0Var == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(tx0Var);
                    MainActivity.f3733z0.m10862a(arrayList, 0);
                    intent.setAction(null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
            int m10893a = rv1.m10893a(c0645al.m27377b(), data);
            if (m10893a > 0) {
                pv1.m13091Z(m10893a);
            }
        }
        tx0Var = null;
        if (tx0Var == null) {
        }
    }

    /* renamed from: i */
    public final void m25588i() {
        Date date = new Date();
        f5521m = date.after(this.f5526e) && date.before(this.f5530i);
    }

    /* renamed from: m */
    public final void m25584m(Context context) {
        this.f5524c = true;
        if (context != null) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 m18928e = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e();
            m18928e.m18903w(context);
            if (f5518j) {
                return;
            }
            f5518j = m18928e.m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14325u);
            lz1.m16365a("isFirstLaunch: " + f5518j);
            m18928e.m18935a0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14325u, false);
            boolean z = f5518j;
            f5519k = z;
            f5520l = z;
        }
    }

    /* renamed from: n */
    public final void m25583n(Activity activity) {
        if (SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14288X) != 201709) {
            DialogFragmentC3382vx.m6681i(new C0645al(activity), true);
        }
    }
}
