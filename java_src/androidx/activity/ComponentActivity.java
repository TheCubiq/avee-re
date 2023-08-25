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
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.c;
import androidx.lifecycle.e;
import androidx.lifecycle.i;
import com.daaw.bu1;
import com.daaw.cu1;
import com.daaw.du1;
import com.daaw.eu0;
import com.daaw.eu1;
import com.daaw.g81;
import com.daaw.gp0;
import com.daaw.gr0;
import com.daaw.hn;
import com.daaw.ir0;
import com.daaw.jm1;
import com.daaw.jt1;
import com.daaw.k81;
import com.daaw.l81;
import com.daaw.m81;
import com.daaw.mt1;
import com.daaw.nt1;
import com.daaw.q0;
import com.daaw.rw0;
import com.daaw.s0;
import com.daaw.sj0;
import com.daaw.uj;
import com.daaw.v0;
import com.daaw.w80;
import com.daaw.yk;
import com.daaw.yt0;
import com.daaw.z0;
import com.daaw.zh;
import com.daaw.zk;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class ComponentActivity extends zh implements nt1, w80, m81, yt0, z0 {
    public final CopyOnWriteArrayList<uj<Configuration>> A;
    public final CopyOnWriteArrayList<uj<Integer>> B;
    public final CopyOnWriteArrayList<uj<Intent>> C;
    public final CopyOnWriteArrayList<uj<gr0>> D;
    public final CopyOnWriteArrayList<uj<rw0>> E;
    public final yk r = new yk();
    public final gp0 s = new gp0(new Runnable() { // from class: com.daaw.yh
        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.s();
        }
    });
    public final e t = new e(this);
    public final l81 u;
    public mt1 v;
    public final OnBackPressedDispatcher w;
    public int x;
    public final AtomicInteger y;
    public final androidx.activity.result.a z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
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

    /* loaded from: classes.dex */
    public class b extends androidx.activity.result.a {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ int p;
            public final /* synthetic */ v0.a q;

            public a(int i, v0.a aVar) {
                this.p = i;
                this.q = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.p, this.q.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0005b implements Runnable {
            public final /* synthetic */ int p;
            public final /* synthetic */ IntentSender.SendIntentException q;

            public RunnableC0005b(int i, IntentSender.SendIntentException sendIntentException) {
                this.p = i;
                this.q = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.p, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.q));
            }
        }

        public b() {
        }

        @Override // androidx.activity.result.a
        public <I, O> void f(int i, v0<I, O> v0Var, I i2, s0 s0Var) {
            ComponentActivity componentActivity = ComponentActivity.this;
            v0.a<O> b = v0Var.b(componentActivity, i2);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i, b));
                return;
            }
            Intent a2 = v0Var.a(componentActivity, i2);
            Bundle bundle = null;
            if (a2.getExtras() != null && a2.getExtras().getClassLoader() == null) {
                a2.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a2.getAction())) {
                String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                q0.o(componentActivity, stringArrayExtra, i);
            } else if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a2.getAction())) {
                q0.p(componentActivity, a2, i, bundle2);
            } else {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    q0.q(componentActivity, intentSenderRequest.g(), i, intentSenderRequest.a(), intentSenderRequest.b(), intentSenderRequest.c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0005b(i, e));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public Object a;
        public mt1 b;
    }

    public ComponentActivity() {
        l81 a2 = l81.a(this);
        this.u = a2;
        this.w = new OnBackPressedDispatcher(new a());
        this.y = new AtomicInteger();
        this.z = new b();
        this.A = new CopyOnWriteArrayList<>();
        this.B = new CopyOnWriteArrayList<>();
        this.C = new CopyOnWriteArrayList<>();
        this.D = new CopyOnWriteArrayList<>();
        this.E = new CopyOnWriteArrayList<>();
        if (a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i = Build.VERSION.SDK_INT;
        a().a(new androidx.lifecycle.d() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.d
            public void a(sj0 sj0Var, c.b bVar) {
                if (bVar == c.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        c.a(peekDecorView);
                    }
                }
            }
        });
        a().a(new androidx.lifecycle.d() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.d
            public void a(sj0 sj0Var, c.b bVar) {
                if (bVar == c.b.ON_DESTROY) {
                    ComponentActivity.this.r.b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.g().a();
                }
            }
        });
        a().a(new androidx.lifecycle.d() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.d
            public void a(sj0 sj0Var, c.b bVar) {
                ComponentActivity.this.q();
                ComponentActivity.this.a().c(this);
            }
        });
        a2.c();
        g81.a(this);
        if (i <= 23) {
            a().a(new ImmLeaksCleaner(this));
        }
        i().h("android:support:activity-result", new k81.c() { // from class: com.daaw.xh
            @Override // com.daaw.k81.c
            public final Bundle a() {
                Bundle t;
                t = ComponentActivity.this.t();
                return t;
            }
        });
        p(new eu0() { // from class: com.daaw.wh
            @Override // com.daaw.eu0
            public final void a(Context context) {
                ComponentActivity.this.u(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle t() {
        Bundle bundle = new Bundle();
        this.z.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(Context context) {
        Bundle b2 = i().b("android:support:activity-result");
        if (b2 != null) {
            this.z.g(b2);
        }
    }

    @Override // com.daaw.zh, com.daaw.sj0
    public androidx.lifecycle.c a() {
        return this.t;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        r();
        super.addContentView(view, layoutParams);
    }

    @Override // com.daaw.yt0
    public final OnBackPressedDispatcher c() {
        return this.w;
    }

    @Override // com.daaw.w80
    public hn d() {
        ir0 ir0Var = new ir0();
        if (getApplication() != null) {
            ir0Var.b(jt1.a.e, getApplication());
        }
        ir0Var.b(g81.a, this);
        ir0Var.b(g81.b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            ir0Var.b(g81.c, getIntent().getExtras());
        }
        return ir0Var;
    }

    @Override // com.daaw.z0
    public final androidx.activity.result.a e() {
        return this.z;
    }

    @Override // com.daaw.nt1
    public mt1 g() {
        if (getApplication() != null) {
            q();
            return this.v;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // com.daaw.m81
    public final k81 i() {
        return this.u.b();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.z.b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.w.f();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<uj<Configuration>> it = this.A.iterator();
        while (it.hasNext()) {
            it.next().a(configuration);
        }
    }

    @Override // com.daaw.zh, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.u.d(bundle);
        this.r.c(this);
        super.onCreate(bundle);
        i.g(this);
        if (Build.VERSION.SDK_INT >= 33) {
            this.w.g(getOnBackInvokedDispatcher());
        }
        int i = this.x;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.s.a(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        Iterator<uj<gr0>> it = this.D.iterator();
        while (it.hasNext()) {
            it.next().a(new gr0(z));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        Iterator<uj<gr0>> it = this.D.iterator();
        while (it.hasNext()) {
            it.next().a(new gr0(z, configuration));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<uj<Intent>> it = this.C.iterator();
        while (it.hasNext()) {
            it.next().a(intent);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.s.c(menuItem);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.s.b(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        Iterator<uj<rw0>> it = this.E.iterator();
        while (it.hasNext()) {
            it.next().a(new rw0(z));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        Iterator<uj<rw0>> it = this.E.iterator();
        while (it.hasNext()) {
            it.next().a(new rw0(z, configuration));
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        this.s.d(menu);
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.z.b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object v = v();
        mt1 mt1Var = this.v;
        if (mt1Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            mt1Var = dVar.b;
        }
        if (mt1Var == null && v == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.a = v;
        dVar2.b = mt1Var;
        return dVar2;
    }

    @Override // com.daaw.zh, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.c a2 = a();
        if (a2 instanceof e) {
            ((e) a2).o(c.EnumC0020c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.u.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<uj<Integer>> it = this.B.iterator();
        while (it.hasNext()) {
            it.next().a(Integer.valueOf(i));
        }
    }

    public final void p(eu0 eu0Var) {
        this.r.a(eu0Var);
    }

    public void q() {
        if (this.v == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.v = dVar.b;
            }
            if (this.v == null) {
                this.v = new mt1();
            }
        }
    }

    public final void r() {
        bu1.a(getWindow().getDecorView(), this);
        eu1.a(getWindow().getDecorView(), this);
        du1.a(getWindow().getDecorView(), this);
        cu1.a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (jm1.d()) {
                jm1.a("reportFullyDrawn() for ComponentActivity");
            }
            int i = Build.VERSION.SDK_INT;
            if (i > 19 || (i == 19 && zk.a(this, "android.permission.UPDATE_DEVICE_STATS") == 0)) {
                super.reportFullyDrawn();
            }
        } finally {
            jm1.b();
        }
    }

    public void s() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        r();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        r();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        r();
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
    public Object v() {
        return null;
    }
}
