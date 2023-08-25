package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class r03 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final long E = ((Long) zzba.zzc().b(g93.f1)).longValue();
    public final DisplayMetrics C;
    public final Rect D;
    public final Context p;
    public Application q;
    public final WindowManager r;
    public final PowerManager s;
    public final KeyguardManager t;
    public BroadcastReceiver u;
    public WeakReference v;
    public final WeakReference w;
    public g13 x;
    public final zzbz y = new zzbz(E);
    public boolean z = false;
    public int A = -1;
    public final HashSet B = new HashSet();

    public r03(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.p = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.r = windowManager;
        this.s = (PowerManager) applicationContext.getSystemService("power");
        this.t = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.q = application;
            this.x = new g13(application, this);
        }
        this.C = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.D = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.w;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m(view2);
        }
        this.w = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        return new Rect(h(rect.left), h(rect.top), h(rect.right), h(rect.bottom));
    }

    public final void c(q03 q03Var) {
        this.B.add(q03Var);
        j(3);
    }

    public final /* synthetic */ void d() {
        j(3);
    }

    public final void e(q03 q03Var) {
        this.B.remove(q03Var);
    }

    public final void f() {
        this.y.zza(E);
    }

    public final void g(long j) {
        this.y.zza(j);
    }

    public final int h(int i) {
        return (int) (i / this.C.density);
    }

    public final void i(Activity activity, int i) {
        Window window;
        if (this.w == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = (View) this.w.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.A = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0110, code lost:
        if (r11 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0126, code lost:
        if (r11 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0128, code lost:
        r3 = true;
        r11 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fc A[LOOP:1: B:104:0x01f6->B:106:0x01fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r33) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.r03.j(int):void");
    }

    public final void k() {
        zzs.zza.post(new Runnable() { // from class: com.daaw.n03
            @Override // java.lang.Runnable
            public final void run() {
                r03.this.d();
            }
        });
    }

    public final void l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.v = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.u == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.u = new o03(this);
            zzt.zzv().zzc(this.p, this.u, intentFilter);
        }
        Application application = this.q;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.x);
            } catch (Exception e) {
                k04.zzh("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    public final void m(View view) {
        try {
            WeakReference weakReference = this.v;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.v = null;
            }
        } catch (Exception e) {
            k04.zzh("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            k04.zzh("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.u != null) {
            try {
                zzt.zzv().zzd(this.p, this.u);
            } catch (IllegalStateException e3) {
                k04.zzh("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                zzt.zzo().u(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.u = null;
        }
        Application application = this.q;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.x);
            } catch (Exception e5) {
                k04.zzh("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i(activity, 4);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j(3);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        j(2);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A = -1;
        l(view);
        j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.A = -1;
        j(3);
        k();
        m(view);
    }
}
