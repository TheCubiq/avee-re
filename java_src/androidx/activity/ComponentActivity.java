package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.result.AbstractC0051a;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.C0349e;
import androidx.lifecycle.FragmentC0358i;
import androidx.lifecycle.InterfaceC0348d;
import com.daaw.AbstractC1589hn;
import com.daaw.AbstractC3274v0;
import com.daaw.ActivityC3839zh;
import com.daaw.C2670q0;
import com.daaw.C2901s0;
import com.daaw.C3713yk;
import com.daaw.C3866zk;
import com.daaw.InterfaceC3222uj;
import com.daaw.InterfaceC3790z0;
import com.daaw.bu1;
import com.daaw.cu1;
import com.daaw.du1;
import com.daaw.eu0;
import com.daaw.eu1;
import com.daaw.g81;
import com.daaw.gp0;
import com.daaw.gr0;
import com.daaw.ir0;
import com.daaw.jm1;
import com.daaw.jt1;
import com.daaw.k81;
import com.daaw.l81;
import com.daaw.m81;
import com.daaw.mt1;
import com.daaw.nt1;
import com.daaw.rw0;
import com.daaw.sj0;
import com.daaw.w80;
import com.daaw.yt0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class ComponentActivity extends ActivityC3839zh implements nt1, w80, m81, yt0, InterfaceC3790z0 {

    /* renamed from: A */
    public final CopyOnWriteArrayList<InterfaceC3222uj<Configuration>> f75A;

    /* renamed from: B */
    public final CopyOnWriteArrayList<InterfaceC3222uj<Integer>> f76B;

    /* renamed from: C */
    public final CopyOnWriteArrayList<InterfaceC3222uj<Intent>> f77C;

    /* renamed from: D */
    public final CopyOnWriteArrayList<InterfaceC3222uj<gr0>> f78D;

    /* renamed from: E */
    public final CopyOnWriteArrayList<InterfaceC3222uj<rw0>> f79E;

    /* renamed from: r */
    public final C3713yk f80r = new C3713yk();

    /* renamed from: s */
    public final gp0 f81s = new gp0(new Runnable() { // from class: com.daaw.yh
        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.m30380s();
        }
    });

    /* renamed from: t */
    public final C0349e f82t = new C0349e(this);

    /* renamed from: u */
    public final l81 f83u;

    /* renamed from: v */
    public mt1 f84v;

    /* renamed from: w */
    public final OnBackPressedDispatcher f85w;

    /* renamed from: x */
    public int f86x;

    /* renamed from: y */
    public final AtomicInteger f87y;

    /* renamed from: z */
    public final AbstractC0051a f88z;

    /* renamed from: androidx.activity.ComponentActivity$a */
    /* loaded from: classes.dex */
    public class RunnableC0039a implements Runnable {
        public RunnableC0039a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    /* loaded from: classes.dex */
    public class C0040b extends AbstractC0051a {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        /* loaded from: classes.dex */
        public class RunnableC0041a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ int f94p;

            /* renamed from: q */
            public final /* synthetic */ AbstractC3274v0.C3275a f95q;

            public RunnableC0041a(int i, AbstractC3274v0.C3275a c3275a) {
                this.f94p = i;
                this.f95q = c3275a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0040b.this.m30348c(this.f94p, this.f95q.m7565a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        /* loaded from: classes.dex */
        public class RunnableC0042b implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ int f97p;

            /* renamed from: q */
            public final /* synthetic */ IntentSender.SendIntentException f98q;

            public RunnableC0042b(int i, IntentSender.SendIntentException sendIntentException) {
                this.f97p = i;
                this.f98q = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0040b.this.m30349b(this.f97p, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f98q));
            }
        }

        public C0040b() {
        }

        @Override // androidx.activity.result.AbstractC0051a
        /* renamed from: f */
        public <I, O> void mo30345f(int i, AbstractC3274v0<I, O> abstractC3274v0, I i2, C2901s0 c2901s0) {
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC3274v0.C3275a<O> mo6623b = abstractC3274v0.mo6623b(componentActivity, i2);
            if (mo6623b != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0041a(i, mo6623b));
                return;
            }
            Intent mo5672a = abstractC3274v0.mo5672a(componentActivity, i2);
            Bundle bundle = null;
            if (mo5672a.getExtras() != null && mo5672a.getExtras().getClassLoader() == null) {
                mo5672a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (mo5672a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = mo5672a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                mo5672a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(mo5672a.getAction())) {
                String[] stringArrayExtra = mo5672a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C2670q0.m12827o(componentActivity, stringArrayExtra, i);
            } else if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(mo5672a.getAction())) {
                C2670q0.m12826p(componentActivity, mo5672a, i, bundle2);
            } else {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) mo5672a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    C2670q0.m12825q(componentActivity, intentSenderRequest.m30356g(), i, intentSenderRequest.m30359a(), intentSenderRequest.m30358b(), intentSenderRequest.m30357c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0042b(i, e));
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    /* loaded from: classes.dex */
    public static class C0043c {
        /* renamed from: a */
        public static void m30376a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    /* loaded from: classes.dex */
    public static final class C0044d {

        /* renamed from: a */
        public Object f100a;

        /* renamed from: b */
        public mt1 f101b;
    }

    public ComponentActivity() {
        l81 m17107a = l81.m17107a(this);
        this.f83u = m17107a;
        this.f85w = new OnBackPressedDispatcher(new RunnableC0039a());
        this.f87y = new AtomicInteger();
        this.f88z = new C0040b();
        this.f75A = new CopyOnWriteArrayList<>();
        this.f76B = new CopyOnWriteArrayList<>();
        this.f77C = new CopyOnWriteArrayList<>();
        this.f78D = new CopyOnWriteArrayList<>();
        this.f79E = new CopyOnWriteArrayList<>();
        if (mo2327a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i = Build.VERSION.SDK_INT;
        mo2327a().mo29048a(new InterfaceC0348d() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.InterfaceC0348d
            /* renamed from: a */
            public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
                if (enumC0346b == AbstractC0344c.EnumC0346b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        C0043c.m30376a(peekDecorView);
                    }
                }
            }
        });
        mo2327a().mo29048a(new InterfaceC0348d() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.InterfaceC0348d
            /* renamed from: a */
            public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
                if (enumC0346b == AbstractC0344c.EnumC0346b.ON_DESTROY) {
                    ComponentActivity.this.f80r.m3634b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.mo13652g().m15778a();
                }
            }
        });
        mo2327a().mo29048a(new InterfaceC0348d() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.InterfaceC0348d
            /* renamed from: a */
            public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
                ComponentActivity.this.m30382q();
                ComponentActivity.this.mo2327a().mo29046c(this);
            }
        });
        m17107a.m17105c();
        g81.m21890a(this);
        if (i <= 23) {
            mo2327a().mo29048a(new ImmLeaksCleaner(this));
        }
        mo16178i().m17966h("android:support:activity-result", new k81.InterfaceC1922c() { // from class: com.daaw.xh
            @Override // com.daaw.k81.InterfaceC1922c
            /* renamed from: a */
            public final Bundle mo5117a() {
                Bundle m30379t;
                m30379t = ComponentActivity.this.m30379t();
                return m30379t;
            }
        });
        m30383p(new eu0() { // from class: com.daaw.wh
            @Override // com.daaw.eu0
            /* renamed from: a */
            public final void mo6068a(Context context) {
                ComponentActivity.this.m30378u(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ Bundle m30379t() {
        Bundle bundle = new Bundle();
        this.f88z.m30343h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m30378u(Context context) {
        Bundle m17972b = mo16178i().m17972b("android:support:activity-result");
        if (m17972b != null) {
            this.f88z.m30344g(m17972b);
        }
    }

    @Override // com.daaw.ActivityC3839zh, com.daaw.sj0
    /* renamed from: a */
    public AbstractC0344c mo2327a() {
        return this.f82t;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m30381r();
        super.addContentView(view, layoutParams);
    }

    @Override // com.daaw.yt0
    /* renamed from: c */
    public final OnBackPressedDispatcher mo3233c() {
        return this.f85w;
    }

    @Override // com.daaw.w80
    /* renamed from: d */
    public AbstractC1589hn mo6345d() {
        ir0 ir0Var = new ir0();
        if (getApplication() != null) {
            ir0Var.m19488b(jt1.C1861a.f15384e, getApplication());
        }
        ir0Var.m19488b(g81.f10339a, this);
        ir0Var.m19488b(g81.f10340b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            ir0Var.m19488b(g81.f10341c, getIntent().getExtras());
        }
        return ir0Var;
    }

    @Override // com.daaw.InterfaceC3790z0
    /* renamed from: e */
    public final AbstractC0051a mo3011e() {
        return this.f88z;
    }

    @Override // com.daaw.nt1
    /* renamed from: g */
    public mt1 mo13652g() {
        if (getApplication() != null) {
            m30382q();
            return this.f84v;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // com.daaw.m81
    /* renamed from: i */
    public final k81 mo16178i() {
        return this.f83u.m17106b();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f88z.m30349b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f85w.m30369f();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC3222uj<Configuration>> it = this.f75A.iterator();
        while (it.hasNext()) {
            it.next().mo2971a(configuration);
        }
    }

    @Override // com.daaw.ActivityC3839zh, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f83u.m17104d(bundle);
        this.f80r.m3633c(this);
        super.onCreate(bundle);
        FragmentC0358i.m29009g(this);
        if (Build.VERSION.SDK_INT >= 33) {
            this.f85w.m30368g(getOnBackInvokedDispatcher());
        }
        int i = this.f86x;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f81s.m21367a(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        Iterator<InterfaceC3222uj<gr0>> it = this.f78D.iterator();
        while (it.hasNext()) {
            it.next().mo2971a(new gr0(z));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        Iterator<InterfaceC3222uj<gr0>> it = this.f78D.iterator();
        while (it.hasNext()) {
            it.next().mo2971a(new gr0(z, configuration));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC3222uj<Intent>> it = this.f77C.iterator();
        while (it.hasNext()) {
            it.next().mo2971a(intent);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.f81s.m21365c(menuItem);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f81s.m21366b(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        Iterator<InterfaceC3222uj<rw0>> it = this.f79E.iterator();
        while (it.hasNext()) {
            it.next().mo2971a(new rw0(z));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        Iterator<InterfaceC3222uj<rw0>> it = this.f79E.iterator();
        while (it.hasNext()) {
            it.next().mo2971a(new rw0(z, configuration));
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        this.f81s.m21364d(menu);
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f88z.m30349b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0044d c0044d;
        Object m30377v = m30377v();
        mt1 mt1Var = this.f84v;
        if (mt1Var == null && (c0044d = (C0044d) getLastNonConfigurationInstance()) != null) {
            mt1Var = c0044d.f101b;
        }
        if (mt1Var == null && m30377v == null) {
            return null;
        }
        C0044d c0044d2 = new C0044d();
        c0044d2.f100a = m30377v;
        c0044d2.f101b = mt1Var;
        return c0044d2;
    }

    @Override // com.daaw.ActivityC3839zh, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0344c mo2327a = mo2327a();
        if (mo2327a instanceof C0349e) {
            ((C0349e) mo2327a).m29034o(AbstractC0344c.EnumC0347c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f83u.m17103e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC3222uj<Integer>> it = this.f76B.iterator();
        while (it.hasNext()) {
            it.next().mo2971a(Integer.valueOf(i));
        }
    }

    /* renamed from: p */
    public final void m30383p(eu0 eu0Var) {
        this.f80r.m3635a(eu0Var);
    }

    /* renamed from: q */
    public void m30382q() {
        if (this.f84v == null) {
            C0044d c0044d = (C0044d) getLastNonConfigurationInstance();
            if (c0044d != null) {
                this.f84v = c0044d.f101b;
            }
            if (this.f84v == null) {
                this.f84v = new mt1();
            }
        }
    }

    /* renamed from: r */
    public final void m30381r() {
        bu1.m25826a(getWindow().getDecorView(), this);
        eu1.m23179a(getWindow().getDecorView(), this);
        du1.m23947a(getWindow().getDecorView(), this);
        cu1.m24975a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (jm1.m18414d()) {
                jm1.m18417a("reportFullyDrawn() for ComponentActivity");
            }
            int i = Build.VERSION.SDK_INT;
            if (i > 19 || (i == 19 && C3866zk.m2182a(this, "android.permission.UPDATE_DEVICE_STATS") == 0)) {
                super.reportFullyDrawn();
            }
        } finally {
            jm1.m18416b();
        }
    }

    /* renamed from: s */
    public void m30380s() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m30381r();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m30381r();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m30381r();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Deprecated
    /* renamed from: v */
    public Object m30377v() {
        return null;
    }
}
