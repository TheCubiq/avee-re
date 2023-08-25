package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class en2 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: B */
    public static final Handler f8588B = new Handler(Looper.getMainLooper());

    /* renamed from: p */
    public final Context f8590p;

    /* renamed from: q */
    public Application f8591q;

    /* renamed from: r */
    public final PowerManager f8592r;

    /* renamed from: s */
    public final KeyguardManager f8593s;

    /* renamed from: t */
    public BroadcastReceiver f8594t;

    /* renamed from: u */
    public final pm2 f8595u;

    /* renamed from: v */
    public WeakReference f8596v;

    /* renamed from: w */
    public WeakReference f8597w;

    /* renamed from: x */
    public im2 f8598x;

    /* renamed from: y */
    public byte f8599y = -1;

    /* renamed from: z */
    public int f8600z = -1;

    /* renamed from: A */
    public long f8589A = -3;

    public en2(Context context, pm2 pm2Var) {
        Context applicationContext = context.getApplicationContext();
        this.f8590p = applicationContext;
        this.f8595u = pm2Var;
        this.f8592r = (PowerManager) applicationContext.getSystemService("power");
        this.f8593s = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f8591q = application;
            this.f8598x = new im2(application, this);
        }
        m23351d(null);
    }

    /* renamed from: a */
    public final long m23354a() {
        if (this.f8589A <= -2 && m23353b() == null) {
            this.f8589A = -3L;
        }
        return this.f8589A;
    }

    /* renamed from: b */
    public final View m23353b() {
        WeakReference weakReference = this.f8597w;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public final void m23351d(View view) {
        long j;
        View m23353b = m23353b();
        if (m23353b != null) {
            m23353b.removeOnAttachStateChangeListener(this);
            m23346i(m23353b);
        }
        this.f8597w = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                m23347h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.f8589A = j;
    }

    /* renamed from: e */
    public final void m23350e(Activity activity, int i) {
        Window window;
        if (this.f8597w == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View m23353b = m23353b();
        if (m23353b == null || peekDecorView == null || m23353b.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.f8600z = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
        if ((r5.flags & 524288) != 0) goto L36;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m23349f() {
        Activity m27329b;
        if (this.f8597w == null) {
            return;
        }
        View m23353b = m23353b();
        if (m23353b == null) {
            this.f8589A = -3L;
            this.f8599y = (byte) -1;
            return;
        }
        int i = m23353b.getVisibility() != 0 ? 1 : 0;
        if (!m23353b.isShown()) {
            i |= 2;
        }
        PowerManager powerManager = this.f8592r;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i |= 4;
        }
        if (!this.f8595u.m13288a()) {
            KeyguardManager keyguardManager = this.f8593s;
            if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode() && (m27329b = an2.m27329b(m23353b)) != null) {
                Window window = m27329b.getWindow();
                WindowManager.LayoutParams attributes = window == null ? null : window.getAttributes();
                if (attributes != null) {
                }
            }
            i |= 8;
        }
        if (!m23353b.getGlobalVisibleRect(new Rect())) {
            i |= 16;
        }
        if (!m23353b.getLocalVisibleRect(new Rect())) {
            i |= 32;
        }
        int windowVisibility = m23353b.getWindowVisibility();
        int i2 = this.f8600z;
        if (i2 != -1) {
            windowVisibility = i2;
        }
        if (windowVisibility != 0) {
            i |= 64;
        }
        if (this.f8599y != i) {
            this.f8599y = (byte) i;
            this.f8589A = i == 0 ? SystemClock.elapsedRealtime() : (-3) - i;
        }
    }

    /* renamed from: g */
    public final void m23348g() {
        f8588B.post(new cn2(this));
    }

    /* renamed from: h */
    public final void m23347h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f8596v = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f8594t == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            dn2 dn2Var = new dn2(this);
            this.f8594t = dn2Var;
            this.f8590p.registerReceiver(dn2Var, intentFilter);
        }
        Application application = this.f8591q;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f8598x);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i */
    public final void m23346i(View view) {
        try {
            WeakReference weakReference = this.f8596v;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f8596v = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f8594t;
        if (broadcastReceiver != null) {
            try {
                this.f8590p.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f8594t = null;
        }
        Application application = this.f8591q;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f8598x);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m23350e(activity, 0);
        m23349f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m23349f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m23350e(activity, 4);
        m23349f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m23350e(activity, 0);
        m23349f();
        m23348g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m23349f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m23350e(activity, 0);
        m23349f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m23349f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m23349f();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m23349f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f8600z = -1;
        m23347h(view);
        m23349f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f8600z = -1;
        m23349f();
        m23348g();
        m23346i(view);
    }
}
