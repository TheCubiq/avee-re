package com.google.android.gms.internal.ads;

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
/* loaded from: classes2.dex */
public final class zzdi implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final Handler zzsy = new Handler(Looper.getMainLooper());
    private final zzcz zzps;
    private Application zzrk;
    private final Context zzsz;
    private final PowerManager zzta;
    private final KeyguardManager zztb;
    private BroadcastReceiver zztc;
    private WeakReference<ViewTreeObserver> zztd;
    private WeakReference<View> zzte;
    private zzcn zztf;
    private boolean zztg = false;
    private int zzth = -1;
    private long zzti = -3;

    public zzdi(zzcz zzczVar, View view) {
        this.zzps = zzczVar;
        Context context = zzczVar.zzrt;
        this.zzsz = context;
        this.zzta = (PowerManager) context.getSystemService("power");
        this.zztb = (KeyguardManager) this.zzsz.getSystemService("keyguard");
        Context context2 = this.zzsz;
        if (context2 instanceof Application) {
            this.zzrk = (Application) context2;
            this.zztf = new zzcn((Application) context2, this);
        }
        zzd(view);
    }

    private final void zza(Activity activity, int i) {
        Window window;
        if (this.zzte == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = this.zzte.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.zzth = i;
    }

    private final void zzao() {
        zzsy.post(new zzdj(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r4 == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzaq() {
        boolean z;
        int i;
        WeakReference<View> weakReference = this.zzte;
        if (weakReference == null) {
            return;
        }
        View view = weakReference.get();
        boolean z2 = false;
        if (view == null) {
            this.zzti = -3L;
            this.zztg = false;
            return;
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        boolean localVisibleRect = view.getLocalVisibleRect(new Rect());
        if (!this.zzps.zzai()) {
            if (this.zztb.inKeyguardRestrictedInputMode()) {
                Activity zzc = zzdg.zzc(view);
                if (zzc != null) {
                    Window window = zzc.getWindow();
                    WindowManager.LayoutParams attributes = window == null ? null : window.getAttributes();
                    boolean z3 = (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
                }
            }
            z = false;
            int windowVisibility = view.getWindowVisibility();
            i = this.zzth;
            if (i != -1) {
                windowVisibility = i;
            }
            if (view.getVisibility() == 0 && view.isShown() && this.zzta.isScreenOn() && z && localVisibleRect && globalVisibleRect && windowVisibility == 0) {
                z2 = true;
            }
            if (this.zztg == z2) {
                this.zzti = z2 ? SystemClock.elapsedRealtime() : -2L;
                this.zztg = z2;
                return;
            }
            return;
        }
        z = true;
        int windowVisibility2 = view.getWindowVisibility();
        i = this.zzth;
        if (i != -1) {
        }
        if (view.getVisibility() == 0) {
            z2 = true;
        }
        if (this.zztg == z2) {
        }
    }

    private final void zze(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zztd = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zztc == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            zzdk zzdkVar = new zzdk(this);
            this.zztc = zzdkVar;
            this.zzsz.registerReceiver(zzdkVar, intentFilter);
        }
        Application application = this.zzrk;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zztf);
            } catch (Exception unused) {
            }
        }
    }

    private final void zzf(View view) {
        try {
            if (this.zztd != null) {
                ViewTreeObserver viewTreeObserver = this.zztd.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zztd = null;
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
        BroadcastReceiver broadcastReceiver = this.zztc;
        if (broadcastReceiver != null) {
            try {
                this.zzsz.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.zztc = null;
        }
        Application application = this.zzrk;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zztf);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(activity, 0);
        zzaq();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzaq();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(activity, 4);
        zzaq();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(activity, 0);
        zzaq();
        zzao();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzaq();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(activity, 0);
        zzaq();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzaq();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzaq();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzaq();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzth = -1;
        zze(view);
        zzaq();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzth = -1;
        zzaq();
        zzao();
        zzf(view);
    }

    public final long zzap() {
        if (this.zzti == -2 && this.zzte.get() == null) {
            this.zzti = -3L;
        }
        return this.zzti;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(View view) {
        long j;
        WeakReference<View> weakReference = this.zzte;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzf(view2);
        }
        this.zzte = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                zze(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.zzti = j;
    }
}
