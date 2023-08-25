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
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class r03 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: E */
    public static final long f24695E = ((Long) zzba.zzc().m23658b(g93.f10678f1)).longValue();

    /* renamed from: C */
    public final DisplayMetrics f24698C;

    /* renamed from: D */
    public final Rect f24699D;

    /* renamed from: p */
    public final Context f24700p;

    /* renamed from: q */
    public Application f24701q;

    /* renamed from: r */
    public final WindowManager f24702r;

    /* renamed from: s */
    public final PowerManager f24703s;

    /* renamed from: t */
    public final KeyguardManager f24704t;

    /* renamed from: u */
    public BroadcastReceiver f24705u;

    /* renamed from: v */
    public WeakReference f24706v;

    /* renamed from: w */
    public final WeakReference f24707w;

    /* renamed from: x */
    public g13 f24708x;

    /* renamed from: y */
    public final zzbz f24709y = new zzbz(f24695E);

    /* renamed from: z */
    public boolean f24710z = false;

    /* renamed from: A */
    public int f24696A = -1;

    /* renamed from: B */
    public final HashSet f24697B = new HashSet();

    public r03(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f24700p = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f24702r = windowManager;
        this.f24703s = (PowerManager) applicationContext.getSystemService("power");
        this.f24704t = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f24701q = application;
            this.f24708x = new g13(application, this);
        }
        this.f24698C = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f24699D = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f24707w;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m11864m(view2);
        }
        this.f24707w = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                m11865l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a */
    public final Rect m11876a(Rect rect) {
        return new Rect(m11869h(rect.left), m11869h(rect.top), m11869h(rect.right), m11869h(rect.bottom));
    }

    /* renamed from: c */
    public final void m11874c(q03 q03Var) {
        this.f24697B.add(q03Var);
        m11867j(3);
    }

    /* renamed from: d */
    public final /* synthetic */ void m11873d() {
        m11867j(3);
    }

    /* renamed from: e */
    public final void m11872e(q03 q03Var) {
        this.f24697B.remove(q03Var);
    }

    /* renamed from: f */
    public final void m11871f() {
        this.f24709y.zza(f24695E);
    }

    /* renamed from: g */
    public final void m11870g(long j) {
        this.f24709y.zza(j);
    }

    /* renamed from: h */
    public final int m11869h(int i) {
        return (int) (i / this.f24698C.density);
    }

    /* renamed from: i */
    public final void m11868i(Activity activity, int i) {
        Window window;
        if (this.f24707w == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = (View) this.f24707w.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.f24696A = i;
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
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11867j(int i) {
        WeakReference weakReference;
        View view;
        boolean z;
        boolean z2;
        List emptyList;
        int i2;
        long zzt;
        boolean z3;
        Iterator it;
        if (this.f24697B.isEmpty() || (weakReference = this.f24707w) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        boolean z4 = true;
        if (view2 != null) {
            z = view2.getGlobalVisibleRect(rect2);
            z2 = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e) {
                k04.zzh("Failure getting view location.", e);
            }
            int i3 = iArr[0];
            rect.left = i3;
            rect.top = iArr[1];
            rect.right = i3 + view2.getWidth();
            rect.bottom = rect.top + view2.getHeight();
            view = view2;
        } else {
            view = null;
            z = false;
            z2 = false;
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10711i1)).booleanValue() && view != null) {
            try {
                emptyList = new ArrayList();
                ViewParent parent = view.getParent();
                while (parent instanceof View) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        emptyList.add(m11876a(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (Exception e2) {
                zzt.zzo().m11902u(e2, "PositionWatcher.getParentScrollViewRects");
            }
            List list = emptyList;
            int windowVisibility = view == null ? view.getWindowVisibility() : 8;
            i2 = this.f24696A;
            if (i2 != -1) {
                windowVisibility = i2;
            }
            zzt.zzp();
            zzt = zzs.zzt(view);
            if (((Boolean) zzba.zzc().m23658b(g93.f10490M8)).booleanValue()) {
                if (view2 != null) {
                    zzt.zzp();
                    if (zzs.zzP(view, this.f24703s, this.f24704t)) {
                        if (z) {
                            if (z2) {
                            }
                        }
                    }
                }
                z3 = false;
            } else {
                if (view2 != null) {
                    zzt.zzp();
                    if (zzs.zzP(view, this.f24703s, this.f24704t) && z && z2) {
                        if (zzt >= ((Integer) zzba.zzc().m23658b(g93.f10520P8)).intValue()) {
                        }
                    }
                }
                z3 = false;
            }
            if (((Boolean) zzba.zzc().m23658b(g93.f10540R8)).booleanValue()) {
                zzt.zzp();
                int i4 = (windowVisibility == 0 ? 128 : 0) | (true != zzs.zzP(view, this.f24703s, this.f24704t) ? 0 : 64) | (true != z ? 0 : 8) | (true != z2 ? 0 : 16);
                int i5 = zzt >= ((long) ((Integer) zzba.zzc().m23658b(g93.f10520P8)).intValue()) ? 32 : 0;
                zzt.zzp();
                zzs.zzF(view, i4 | i5 | z3, null);
            }
            if (i == 1 || this.f24709y.zzb() || z3 != this.f24710z) {
                if (z3 && !this.f24710z && i == 1) {
                    return;
                }
                p03 p03Var = new p03(zzt.zzB().mo15859b(), this.f24703s.isScreenOn(), (view == null && view.isAttachedToWindow()) ? false : false, view == null ? view.getWindowVisibility() : 8, m11876a(this.f24699D), m11876a(rect), m11876a(rect2), z, m11876a(rect3), z2, zzt, m11876a(rect4), this.f24698C.density, z3, list);
                it = this.f24697B.iterator();
                while (it.hasNext()) {
                    ((q03) it.next()).mo6420e0(p03Var);
                }
                this.f24710z = z3;
            }
            return;
        }
        emptyList = Collections.emptyList();
        List list2 = emptyList;
        if (view == null) {
        }
        i2 = this.f24696A;
        if (i2 != -1) {
        }
        zzt.zzp();
        zzt = zzs.zzt(view);
        if (((Boolean) zzba.zzc().m23658b(g93.f10490M8)).booleanValue()) {
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10540R8)).booleanValue()) {
        }
        if (i == 1) {
        }
        if (z3) {
        }
        p03 p03Var2 = new p03(zzt.zzB().mo15859b(), this.f24703s.isScreenOn(), (view == null && view.isAttachedToWindow()) ? false : false, view == null ? view.getWindowVisibility() : 8, m11876a(this.f24699D), m11876a(rect), m11876a(rect2), z, m11876a(rect3), z2, zzt, m11876a(rect4), this.f24698C.density, z3, list2);
        it = this.f24697B.iterator();
        while (it.hasNext()) {
        }
        this.f24710z = z3;
    }

    /* renamed from: k */
    public final void m11866k() {
        zzs.zza.post(new Runnable() { // from class: com.daaw.n03
            @Override // java.lang.Runnable
            public final void run() {
                r03.this.m11873d();
            }
        });
    }

    /* renamed from: l */
    public final void m11865l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f24706v = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f24705u == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f24705u = new o03(this);
            zzt.zzv().zzc(this.f24700p, this.f24705u, intentFilter);
        }
        Application application = this.f24701q;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f24708x);
            } catch (Exception e) {
                k04.zzh("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* renamed from: m */
    public final void m11864m(View view) {
        try {
            WeakReference weakReference = this.f24706v;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f24706v = null;
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
        if (this.f24705u != null) {
            try {
                zzt.zzv().zzd(this.f24700p, this.f24705u);
            } catch (IllegalStateException e3) {
                k04.zzh("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                zzt.zzo().m11902u(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f24705u = null;
        }
        Application application = this.f24701q;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f24708x);
            } catch (Exception e5) {
                k04.zzh("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m11868i(activity, 0);
        m11867j(3);
        m11866k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m11867j(3);
        m11866k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m11868i(activity, 4);
        m11867j(3);
        m11866k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m11868i(activity, 0);
        m11867j(3);
        m11866k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m11867j(3);
        m11866k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m11868i(activity, 0);
        m11867j(3);
        m11866k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m11867j(3);
        m11866k();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m11867j(2);
        m11866k();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m11867j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f24696A = -1;
        m11865l(view);
        m11867j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f24696A = -1;
        m11867j(3);
        m11866k();
        m11864m(view);
    }
}
