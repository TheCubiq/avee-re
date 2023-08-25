package com.daaw;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a;
import androidx.lifecycle.c;
import com.daaw.di1;
import com.daaw.ii0;
import com.daaw.j51;
import com.daaw.n0;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class a4 extends z3 implements e.a, LayoutInflater.Factory2 {
    public static final int[] A0;
    public static final boolean B0;
    public static final boolean C0;
    public static boolean D0;
    public static final cd1<String, Integer> y0 = new cd1<>();
    public static final boolean z0;
    public final Object A;
    public final Context B;
    public Window C;
    public o D;
    public final t3 E;
    public i0 F;
    public MenuInflater G;
    public CharSequence H;
    public hq I;
    public i J;
    public v K;
    public n0 L;
    public ActionBarContextView M;
    public PopupWindow N;
    public Runnable O;
    public ut1 P;
    public boolean Q;
    public boolean R;
    public ViewGroup S;
    public TextView T;
    public View U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public u[] d0;
    public u e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public Configuration j0;
    public int k0;
    public int l0;
    public int m0;
    public boolean n0;
    public q o0;
    public q p0;
    public boolean q0;
    public int r0;
    public final Runnable s0;
    public boolean t0;
    public Rect u0;
    public Rect v0;
    public z4 w0;
    public ui0 x0;

    /* loaded from: classes.dex */
    public class a implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ Thread.UncaughtExceptionHandler a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        public final boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!a(th)) {
                this.a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.a.uncaughtException(thread, notFoundException);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a4 a4Var = a4.this;
            if ((a4Var.r0 & 1) != 0) {
                a4Var.n0(0);
            }
            a4 a4Var2 = a4.this;
            if ((a4Var2.r0 & 4096) != 0) {
                a4Var2.n0(p21.Z0);
            }
            a4 a4Var3 = a4.this;
            a4Var3.q0 = false;
            a4Var3.r0 = 0;
        }
    }

    /* loaded from: classes.dex */
    public class c implements vt0 {
        public c() {
        }

        @Override // com.daaw.vt0
        public px1 a(View view, px1 px1Var) {
            int l = px1Var.l();
            int h1 = a4.this.h1(px1Var, null);
            if (l != h1) {
                px1Var = px1Var.q(px1Var.j(), h1, px1Var.k(), px1Var.i());
            }
            return xs1.d0(view, px1Var);
        }
    }

    /* loaded from: classes.dex */
    public class d implements a.InterfaceC0009a {
        public d() {
        }

        @Override // androidx.appcompat.widget.a.InterfaceC0009a
        public void a(Rect rect) {
            rect.top = a4.this.h1(null, rect);
        }
    }

    /* loaded from: classes.dex */
    public class e implements ContentFrameLayout.a {
        public e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            a4.this.l0();
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* loaded from: classes.dex */
        public class a extends xt1 {
            public a() {
            }

            @Override // com.daaw.wt1
            public void b(View view) {
                a4.this.M.setAlpha(1.0f);
                a4.this.P.h(null);
                a4.this.P = null;
            }

            @Override // com.daaw.xt1, com.daaw.wt1
            public void c(View view) {
                a4.this.M.setVisibility(0);
            }
        }

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a4 a4Var = a4.this;
            a4Var.N.showAtLocation(a4Var.M, 55, 0, 0);
            a4.this.o0();
            if (!a4.this.Z0()) {
                a4.this.M.setAlpha(1.0f);
                a4.this.M.setVisibility(0);
                return;
            }
            a4.this.M.setAlpha(0.0f);
            a4 a4Var2 = a4.this;
            a4Var2.P = xs1.e(a4Var2.M).b(1.0f);
            a4.this.P.h(new a());
        }
    }

    /* loaded from: classes.dex */
    public class g extends xt1 {
        public g() {
        }

        @Override // com.daaw.wt1
        public void b(View view) {
            a4.this.M.setAlpha(1.0f);
            a4.this.P.h(null);
            a4.this.P = null;
        }

        @Override // com.daaw.xt1, com.daaw.wt1
        public void c(View view) {
            a4.this.M.setVisibility(0);
            if (a4.this.M.getParent() instanceof View) {
                xs1.o0((View) a4.this.M.getParent());
            }
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        boolean a(int i);

        View onCreatePanelView(int i);
    }

    /* loaded from: classes.dex */
    public final class i implements i.a {
        public i() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            a4.this.e0(eVar);
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback A0 = a4.this.A0();
            if (A0 != null) {
                A0.onMenuOpened(p21.Z0, eVar);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class j implements n0.a {
        public n0.a a;

        /* loaded from: classes.dex */
        public class a extends xt1 {
            public a() {
            }

            @Override // com.daaw.wt1
            public void b(View view) {
                a4.this.M.setVisibility(8);
                a4 a4Var = a4.this;
                PopupWindow popupWindow = a4Var.N;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (a4Var.M.getParent() instanceof View) {
                    xs1.o0((View) a4.this.M.getParent());
                }
                a4.this.M.k();
                a4.this.P.h(null);
                a4 a4Var2 = a4.this;
                a4Var2.P = null;
                xs1.o0(a4Var2.S);
            }
        }

        public j(n0.a aVar) {
            this.a = aVar;
        }

        @Override // com.daaw.n0.a
        public boolean a(n0 n0Var, Menu menu) {
            xs1.o0(a4.this.S);
            return this.a.a(n0Var, menu);
        }

        @Override // com.daaw.n0.a
        public boolean b(n0 n0Var, Menu menu) {
            return this.a.b(n0Var, menu);
        }

        @Override // com.daaw.n0.a
        public void c(n0 n0Var) {
            this.a.c(n0Var);
            a4 a4Var = a4.this;
            if (a4Var.N != null) {
                a4Var.C.getDecorView().removeCallbacks(a4.this.O);
            }
            a4 a4Var2 = a4.this;
            if (a4Var2.M != null) {
                a4Var2.o0();
                a4 a4Var3 = a4.this;
                a4Var3.P = xs1.e(a4Var3.M).b(0.0f);
                a4.this.P.h(new a());
            }
            a4 a4Var4 = a4.this;
            t3 t3Var = a4Var4.E;
            if (t3Var != null) {
                t3Var.h(a4Var4.L);
            }
            a4 a4Var5 = a4.this;
            a4Var5.L = null;
            xs1.o0(a4Var5.S);
        }

        @Override // com.daaw.n0.a
        public boolean d(n0 n0Var, MenuItem menuItem) {
            return this.a.d(n0Var, menuItem);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        public static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }

        public static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        public static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* loaded from: classes.dex */
    public static class m {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static rk0 b(Configuration configuration) {
            return rk0.c(configuration.getLocales().toLanguageTags());
        }

        public static void c(rk0 rk0Var) {
            LocaleList.setDefault(LocaleList.forLanguageTags(rk0Var.h()));
        }

        public static void d(Configuration configuration, rk0 rk0Var) {
            configuration.setLocales(LocaleList.forLanguageTags(rk0Var.h()));
        }
    }

    /* loaded from: classes.dex */
    public static class n {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* loaded from: classes.dex */
    public class o extends lx1 {
        public h q;
        public boolean r;
        public boolean s;
        public boolean t;

        public o(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.s = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.s = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.r = true;
                callback.onContentChanged();
            } finally {
                this.r = false;
            }
        }

        public void d(Window.Callback callback, int i, Menu menu) {
            try {
                this.t = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.t = false;
            }
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.s ? a().dispatchKeyEvent(keyEvent) : a4.this.m0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || a4.this.L0(keyEvent.getKeyCode(), keyEvent);
        }

        public void e(h hVar) {
            this.q = hVar;
        }

        public final ActionMode f(ActionMode.Callback callback) {
            di1.a aVar = new di1.a(a4.this.B, callback);
            n0 V = a4.this.V(aVar);
            if (V != null) {
                return aVar.e(V);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.r) {
                a().onContentChanged();
            }
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            h hVar = this.q;
            return (hVar == null || (onCreatePanelView = hVar.onCreatePanelView(i)) == null) ? super.onCreatePanelView(i) : onCreatePanelView;
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            a4.this.O0(i);
            return true;
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.t) {
                a().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            a4.this.P0(i);
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i == 0 && eVar == null) {
                return false;
            }
            boolean z = true;
            if (eVar != null) {
                eVar.e0(true);
            }
            h hVar = this.q;
            z = (hVar == null || !hVar.a(i)) ? false : false;
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (eVar != null) {
                eVar.e0(false);
            }
            return z;
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.e eVar;
            u y0 = a4.this.y0(0, true);
            if (y0 == null || (eVar = y0.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            }
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return a4.this.G0() ? f(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (a4.this.G0() && i == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    /* loaded from: classes.dex */
    public class p extends q {
        public final PowerManager c;

        public p(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // com.daaw.a4.q
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // com.daaw.a4.q
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !l.a(this.c)) ? 1 : 2;
        }

        @Override // com.daaw.a4.q
        public void d() {
            a4.this.Y();
        }
    }

    /* loaded from: classes.dex */
    public abstract class q {
        public BroadcastReceiver a;

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                q.this.d();
            }
        }

        public q() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    a4.this.B.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b = b();
            if (b == null || b.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            a4.this.B.registerReceiver(this.a, b);
        }
    }

    /* loaded from: classes.dex */
    public class r extends q {
        public final po1 c;

        public r(po1 po1Var) {
            super();
            this.c = po1Var;
        }

        @Override // com.daaw.a4.q
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // com.daaw.a4.q
        public int c() {
            return this.c.d() ? 2 : 1;
        }

        @Override // com.daaw.a4.q
        public void d() {
            a4.this.Y();
        }
    }

    /* loaded from: classes.dex */
    public static class s {
        public static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* loaded from: classes.dex */
    public class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        public final boolean c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return a4.this.m0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                a4.this.g0(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(r4.b(getContext(), i));
        }
    }

    /* loaded from: classes.dex */
    public static final class u {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public ViewGroup g;
        public View h;
        public View i;
        public androidx.appcompat.view.menu.e j;
        public androidx.appcompat.view.menu.c k;
        public Context l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q = false;
        public boolean r;
        public Bundle s;

        public u(int i) {
            this.a = i;
        }

        public androidx.appcompat.view.menu.j a(i.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.l, c21.abc_list_menu_item_layout);
                this.k = cVar;
                cVar.g(aVar);
                this.j.b(this.k);
            }
            return this.k.h(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.a().getCount() > 0;
        }

        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.Q(this.k);
            }
            this.j = eVar;
            if (eVar == null || (cVar = this.k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(x01.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(x01.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = l21.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            bl blVar = new bl(context, 0);
            blVar.getTheme().setTo(newTheme);
            this.l = blVar;
            TypedArray obtainStyledAttributes = blVar.obtainStyledAttributes(x21.y0);
            this.b = obtainStyledAttributes.getResourceId(x21.B0, 0);
            this.f = obtainStyledAttributes.getResourceId(x21.A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public final class v implements i.a {
        public v() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            androidx.appcompat.view.menu.e F = eVar.F();
            boolean z2 = F != eVar;
            a4 a4Var = a4.this;
            if (z2) {
                eVar = F;
            }
            u r0 = a4Var.r0(eVar);
            if (r0 != null) {
                if (!z2) {
                    a4.this.h0(r0, z);
                    return;
                }
                a4.this.d0(r0.a, r0, F);
                a4.this.h0(r0, true);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback A0;
            if (eVar == eVar.F()) {
                a4 a4Var = a4.this;
                if (!a4Var.X || (A0 = a4Var.A0()) == null || a4.this.i0) {
                    return true;
                }
                A0.onMenuOpened(p21.Z0, eVar);
                return true;
            }
            return true;
        }
    }

    static {
        boolean z = Build.VERSION.SDK_INT < 21;
        z0 = z;
        A0 = new int[]{16842836};
        B0 = !"robolectric".equals(Build.FINGERPRINT);
        C0 = true;
        if (!z || D0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        D0 = true;
    }

    public a4(Activity activity, t3 t3Var) {
        this(activity, null, t3Var, activity);
    }

    public a4(Dialog dialog, t3 t3Var) {
        this(dialog.getContext(), dialog.getWindow(), t3Var, dialog);
    }

    public a4(Context context, Window window, t3 t3Var, Object obj) {
        cd1<String, Integer> cd1Var;
        Integer num;
        p3 d1;
        this.P = null;
        this.Q = true;
        this.k0 = -100;
        this.s0 = new b();
        this.B = context;
        this.E = t3Var;
        this.A = obj;
        if (this.k0 == -100 && (obj instanceof Dialog) && (d1 = d1()) != null) {
            this.k0 = d1.F().r();
        }
        if (this.k0 == -100 && (num = (cd1Var = y0).get(obj.getClass().getName())) != null) {
            this.k0 = num.intValue();
            cd1Var.remove(obj.getClass().getName());
        }
        if (window != null) {
            a0(window);
        }
        d4.h();
    }

    public static Configuration s0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                m.a(configuration, configuration2, configuration3);
            } else if (!pt0.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & 192;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 192)) {
                configuration3.screenLayout |= i22 & 192;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                n.a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            k.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    public final Window.Callback A0() {
        return this.C.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B0() {
        /*
            r3 = this;
            r3.p0()
            boolean r0 = r3.X
            if (r0 == 0) goto L37
            com.daaw.i0 r0 = r3.F
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.A
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            com.daaw.mx1 r0 = new com.daaw.mx1
            java.lang.Object r1 = r3.A
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.Y
            r0.<init>(r1, r2)
        L1d:
            r3.F = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            com.daaw.mx1 r0 = new com.daaw.mx1
            java.lang.Object r1 = r3.A
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            com.daaw.i0 r0 = r3.F
            if (r0 == 0) goto L37
            boolean r1 = r3.t0
            r0.r(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.a4.B0():void");
    }

    @Override // com.daaw.z3
    public void C(Configuration configuration) {
        i0 w;
        if (this.X && this.R && (w = w()) != null) {
            w.m(configuration);
        }
        d4.b().g(this.B);
        this.j0 = new Configuration(this.B.getResources().getConfiguration());
        X(false);
    }

    public final boolean C0(u uVar) {
        View view = uVar.i;
        if (view != null) {
            uVar.h = view;
            return true;
        } else if (uVar.j == null) {
            return false;
        } else {
            if (this.K == null) {
                this.K = new v();
            }
            View view2 = (View) uVar.a(this.K);
            uVar.h = view2;
            return view2 != null;
        }
    }

    @Override // com.daaw.z3
    public void D(Bundle bundle) {
        this.g0 = true;
        X(false);
        q0();
        Object obj = this.A;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = as0.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                i0 S0 = S0();
                if (S0 == null) {
                    this.t0 = true;
                } else {
                    S0.r(true);
                }
            }
            z3.e(this);
        }
        this.j0 = new Configuration(this.B.getResources().getConfiguration());
        this.h0 = true;
    }

    public final boolean D0(u uVar) {
        uVar.d(t0());
        uVar.g = new t(uVar.l);
        uVar.c = 81;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // com.daaw.z3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.A
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            com.daaw.z3.K(r3)
        L9:
            boolean r0 = r3.q0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.C
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.s0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.i0 = r0
            int r0 = r3.k0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.A
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            com.daaw.cd1<java.lang.String, java.lang.Integer> r0 = com.daaw.a4.y0
            java.lang.Object r1 = r3.A
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.k0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            com.daaw.cd1<java.lang.String, java.lang.Integer> r0 = com.daaw.a4.y0
            java.lang.Object r1 = r3.A
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            com.daaw.i0 r0 = r3.F
            if (r0 == 0) goto L5b
            r0.n()
        L5b:
            r3.f0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.a4.E():void");
    }

    public final boolean E0(u uVar) {
        Context context = this.B;
        int i2 = uVar.a;
        if ((i2 == 0 || i2 == 108) && this.I != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(x01.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(x01.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(x01.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                bl blVar = new bl(context, 0);
                blVar.getTheme().setTo(theme2);
                context = blVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.V(this);
        uVar.c(eVar);
        return true;
    }

    @Override // com.daaw.z3
    public void F(Bundle bundle) {
        p0();
    }

    public final void F0(int i2) {
        this.r0 = (1 << i2) | this.r0;
        if (this.q0) {
            return;
        }
        xs1.j0(this.C.getDecorView(), this.s0);
        this.q0 = true;
    }

    @Override // com.daaw.z3
    public void G() {
        i0 w = w();
        if (w != null) {
            w.v(true);
        }
    }

    public boolean G0() {
        return this.Q;
    }

    @Override // com.daaw.z3
    public void H(Bundle bundle) {
    }

    public int H0(Context context, int i2) {
        q w0;
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        w0 = v0(context);
                    }
                } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                } else {
                    w0 = w0(context);
                }
                return w0.c();
            }
            return i2;
        }
        return -1;
    }

    @Override // com.daaw.z3
    public void I() {
        X(true);
    }

    public boolean I0() {
        n0 n0Var = this.L;
        if (n0Var != null) {
            n0Var.c();
            return true;
        }
        i0 w = w();
        return w != null && w.g();
    }

    @Override // com.daaw.z3
    public void J() {
        i0 w = w();
        if (w != null) {
            w.v(false);
        }
    }

    public boolean J0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.f0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            K0(0, keyEvent);
            return true;
        }
        return false;
    }

    public final boolean K0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            u y02 = y0(i2, true);
            if (y02.o) {
                return false;
            }
            return U0(y02, keyEvent);
        }
        return false;
    }

    public boolean L0(int i2, KeyEvent keyEvent) {
        i0 w = w();
        if (w == null || !w.o(i2, keyEvent)) {
            u uVar = this.e0;
            if (uVar != null && T0(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                u uVar2 = this.e0;
                if (uVar2 != null) {
                    uVar2.n = true;
                }
                return true;
            }
            if (this.e0 == null) {
                u y02 = y0(0, true);
                U0(y02, keyEvent);
                boolean T0 = T0(y02, keyEvent.getKeyCode(), keyEvent, 1);
                y02.m = false;
                if (T0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.daaw.z3
    public boolean M(int i2) {
        int W0 = W0(i2);
        if (this.b0 && W0 == 108) {
            return false;
        }
        if (this.X && W0 == 1) {
            this.X = false;
        }
        if (W0 == 1) {
            c1();
            this.b0 = true;
            return true;
        } else if (W0 == 2) {
            c1();
            this.V = true;
            return true;
        } else if (W0 == 5) {
            c1();
            this.W = true;
            return true;
        } else if (W0 == 10) {
            c1();
            this.Z = true;
            return true;
        } else if (W0 == 108) {
            c1();
            this.X = true;
            return true;
        } else if (W0 != 109) {
            return this.C.requestFeature(W0);
        } else {
            c1();
            this.Y = true;
            return true;
        }
    }

    public boolean M0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.f0;
            this.f0 = false;
            u y02 = y0(0, false);
            if (y02 != null && y02.o) {
                if (!z) {
                    h0(y02, true);
                }
                return true;
            } else if (I0()) {
                return true;
            }
        } else if (i2 == 82) {
            N0(0, keyEvent);
            return true;
        }
        return false;
    }

    public final boolean N0(int i2, KeyEvent keyEvent) {
        boolean z;
        AudioManager audioManager;
        hq hqVar;
        if (this.L != null) {
            return false;
        }
        boolean z2 = true;
        u y02 = y0(i2, true);
        if (i2 != 0 || (hqVar = this.I) == null || !hqVar.d() || ViewConfiguration.get(this.B).hasPermanentMenuKey()) {
            boolean z3 = y02.o;
            if (z3 || y02.n) {
                h0(y02, true);
                z2 = z3;
            } else {
                if (y02.m) {
                    if (y02.r) {
                        y02.m = false;
                        z = U0(y02, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        R0(y02, keyEvent);
                    }
                }
                z2 = false;
            }
        } else if (this.I.b()) {
            z2 = this.I.f();
        } else {
            if (!this.i0 && U0(y02, keyEvent)) {
                z2 = this.I.g();
            }
            z2 = false;
        }
        if (z2 && (audioManager = (AudioManager) this.B.getApplicationContext().getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return z2;
    }

    public void O0(int i2) {
        i0 w;
        if (i2 != 108 || (w = w()) == null) {
            return;
        }
        w.h(true);
    }

    @Override // com.daaw.z3
    public void P(int i2) {
        p0();
        ViewGroup viewGroup = (ViewGroup) this.S.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.B).inflate(i2, viewGroup);
        this.D.c(this.C.getCallback());
    }

    public void P0(int i2) {
        if (i2 == 108) {
            i0 w = w();
            if (w != null) {
                w.h(false);
            }
        } else if (i2 == 0) {
            u y02 = y0(i2, true);
            if (y02.o) {
                h0(y02, false);
            }
        }
    }

    @Override // com.daaw.z3
    public void Q(View view) {
        p0();
        ViewGroup viewGroup = (ViewGroup) this.S.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.D.c(this.C.getCallback());
    }

    public void Q0(ViewGroup viewGroup) {
    }

    @Override // com.daaw.z3
    public void R(View view, ViewGroup.LayoutParams layoutParams) {
        p0();
        ViewGroup viewGroup = (ViewGroup) this.S.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.D.c(this.C.getCallback());
    }

    public final void R0(u uVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (uVar.o || this.i0) {
            return;
        }
        if (uVar.a == 0) {
            if ((this.B.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback A02 = A0();
        if (A02 != null && !A02.onMenuOpened(uVar.a, uVar.j)) {
            h0(uVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.B.getSystemService("window");
        if (windowManager != null && U0(uVar, keyEvent)) {
            ViewGroup viewGroup = uVar.g;
            if (viewGroup == null || uVar.q) {
                if (viewGroup == null) {
                    if (!D0(uVar) || uVar.g == null) {
                        return;
                    }
                } else if (uVar.q && viewGroup.getChildCount() > 0) {
                    uVar.g.removeAllViews();
                }
                if (!C0(uVar) || !uVar.b()) {
                    uVar.q = true;
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = uVar.h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                uVar.g.setBackgroundResource(uVar.b);
                ViewParent parent = uVar.h.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(uVar.h);
                }
                uVar.g.addView(uVar.h, layoutParams2);
                if (!uVar.h.hasFocus()) {
                    uVar.h.requestFocus();
                }
            } else {
                View view = uVar.i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                    uVar.n = false;
                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, uVar.d, uVar.e, 1002, 8519680, -3);
                    layoutParams3.gravity = uVar.c;
                    layoutParams3.windowAnimations = uVar.f;
                    windowManager.addView(uVar.g, layoutParams3);
                    uVar.o = true;
                }
            }
            i2 = -2;
            uVar.n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, uVar.d, uVar.e, 1002, 8519680, -3);
            layoutParams32.gravity = uVar.c;
            layoutParams32.windowAnimations = uVar.f;
            windowManager.addView(uVar.g, layoutParams32);
            uVar.o = true;
        }
    }

    @Override // com.daaw.z3
    public void S(Toolbar toolbar) {
        if (this.A instanceof Activity) {
            i0 w = w();
            if (w instanceof mx1) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.G = null;
            if (w != null) {
                w.n();
            }
            this.F = null;
            if (toolbar != null) {
                dm1 dm1Var = new dm1(toolbar, z0(), this.D);
                this.F = dm1Var;
                this.D.e(dm1Var.c);
            } else {
                this.D.e(null);
            }
            y();
        }
    }

    public final i0 S0() {
        return this.F;
    }

    @Override // com.daaw.z3
    public void T(int i2) {
        this.l0 = i2;
    }

    public final boolean T0(u uVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.e eVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.m || U0(uVar, keyEvent)) && (eVar = uVar.j) != null) {
            z = eVar.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.I == null) {
            h0(uVar, true);
        }
        return z;
    }

    @Override // com.daaw.z3
    public final void U(CharSequence charSequence) {
        this.H = charSequence;
        hq hqVar = this.I;
        if (hqVar != null) {
            hqVar.setWindowTitle(charSequence);
        } else if (S0() != null) {
            S0().y(charSequence);
        } else {
            TextView textView = this.T;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public final boolean U0(u uVar, KeyEvent keyEvent) {
        hq hqVar;
        hq hqVar2;
        hq hqVar3;
        if (this.i0) {
            return false;
        }
        if (uVar.m) {
            return true;
        }
        u uVar2 = this.e0;
        if (uVar2 != null && uVar2 != uVar) {
            h0(uVar2, false);
        }
        Window.Callback A02 = A0();
        if (A02 != null) {
            uVar.i = A02.onCreatePanelView(uVar.a);
        }
        int i2 = uVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (hqVar3 = this.I) != null) {
            hqVar3.c();
        }
        if (uVar.i == null && (!z || !(S0() instanceof dm1))) {
            androidx.appcompat.view.menu.e eVar = uVar.j;
            if (eVar == null || uVar.r) {
                if (eVar == null && (!E0(uVar) || uVar.j == null)) {
                    return false;
                }
                if (z && this.I != null) {
                    if (this.J == null) {
                        this.J = new i();
                    }
                    this.I.a(uVar.j, this.J);
                }
                uVar.j.h0();
                if (!A02.onCreatePanelMenu(uVar.a, uVar.j)) {
                    uVar.c(null);
                    if (z && (hqVar = this.I) != null) {
                        hqVar.a(null, this.J);
                    }
                    return false;
                }
                uVar.r = false;
            }
            uVar.j.h0();
            Bundle bundle = uVar.s;
            if (bundle != null) {
                uVar.j.R(bundle);
                uVar.s = null;
            }
            if (!A02.onPreparePanel(0, uVar.i, uVar.j)) {
                if (z && (hqVar2 = this.I) != null) {
                    hqVar2.a(null, this.J);
                }
                uVar.j.g0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            uVar.p = z2;
            uVar.j.setQwertyMode(z2);
            uVar.j.g0();
        }
        uVar.m = true;
        uVar.n = false;
        this.e0 = uVar;
        return true;
    }

    @Override // com.daaw.z3
    public n0 V(n0.a aVar) {
        t3 t3Var;
        if (aVar != null) {
            n0 n0Var = this.L;
            if (n0Var != null) {
                n0Var.c();
            }
            j jVar = new j(aVar);
            i0 w = w();
            if (w != null) {
                n0 z = w.z(jVar);
                this.L = z;
                if (z != null && (t3Var = this.E) != null) {
                    t3Var.j(z);
                }
            }
            if (this.L == null) {
                this.L = b1(jVar);
            }
            return this.L;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public final void V0(boolean z) {
        hq hqVar = this.I;
        if (hqVar == null || !hqVar.d() || (ViewConfiguration.get(this.B).hasPermanentMenuKey() && !this.I.e())) {
            u y02 = y0(0, true);
            y02.q = true;
            h0(y02, false);
            R0(y02, null);
            return;
        }
        Window.Callback A02 = A0();
        if (this.I.b() && z) {
            this.I.f();
            if (this.i0) {
                return;
            }
            A02.onPanelClosed(p21.Z0, y0(0, true).j);
        } else if (A02 == null || this.i0) {
        } else {
            if (this.q0 && (this.r0 & 1) != 0) {
                this.C.getDecorView().removeCallbacks(this.s0);
                this.s0.run();
            }
            u y03 = y0(0, true);
            androidx.appcompat.view.menu.e eVar = y03.j;
            if (eVar == null || y03.r || !A02.onPreparePanel(0, y03.i, eVar)) {
                return;
            }
            A02.onMenuOpened(p21.Z0, y03.j);
            this.I.g();
        }
    }

    public final int W0(int i2) {
        if (i2 == 8) {
            return p21.Z0;
        }
        if (i2 == 9) {
            return 109;
        }
        return i2;
    }

    public final boolean X(boolean z) {
        if (this.i0) {
            return false;
        }
        int c0 = c0();
        boolean f1 = f1(H0(this.B, c0), Build.VERSION.SDK_INT < 33 ? b0(this.B) : null, z);
        if (c0 == 0) {
            w0(this.B).e();
        } else {
            q qVar = this.o0;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (c0 == 3) {
            v0(this.B).e();
        } else {
            q qVar2 = this.p0;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return f1;
    }

    public void X0(Configuration configuration, rk0 rk0Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            m.d(configuration, rk0Var);
            return;
        }
        k.d(configuration, rk0Var.d(0));
        k.c(configuration, rk0Var.d(0));
    }

    public boolean Y() {
        return X(true);
    }

    public void Y0(rk0 rk0Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            m.c(rk0Var);
        } else {
            Locale.setDefault(rk0Var.d(0));
        }
    }

    public final void Z() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.S.findViewById(16908290);
        View decorView = this.C.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.B.obtainStyledAttributes(x21.y0);
        obtainStyledAttributes.getValue(x21.K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(x21.L0, contentFrameLayout.getMinWidthMinor());
        int i2 = x21.I0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = x21.J0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = x21.G0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = x21.H0;
        if (obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final boolean Z0() {
        ViewGroup viewGroup;
        return this.R && (viewGroup = this.S) != null && xs1.V(viewGroup);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        u r0;
        Window.Callback A02 = A0();
        if (A02 == null || this.i0 || (r0 = r0(eVar.F())) == null) {
            return false;
        }
        return A02.onMenuItemSelected(r0.a, menuItem);
    }

    public final void a0(Window window) {
        if (this.C != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof o) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        o oVar = new o(callback);
        this.D = oVar;
        window.setCallback(oVar);
        ul1 u2 = ul1.u(this.B, null, A0);
        Drawable h2 = u2.h(0);
        if (h2 != null) {
            window.setBackgroundDrawable(h2);
        }
        u2.w();
        this.C = window;
    }

    public final boolean a1(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.C.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || xs1.U((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        V0(true);
    }

    public rk0 b0(Context context) {
        rk0 u2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33 && (u2 = z3.u()) != null) {
            rk0 x0 = x0(context.getApplicationContext().getResources().getConfiguration());
            rk0 b2 = i2 >= 24 ? vk0.b(u2, x0) : u2.f() ? rk0.e() : rk0.c(u2.d(0).toString());
            return b2.f() ? x0 : b2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.daaw.n0 b1(com.daaw.n0.a r8) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.a4.b1(com.daaw.n0$a):com.daaw.n0");
    }

    public final int c0() {
        int i2 = this.k0;
        return i2 != -100 ? i2 : z3.q();
    }

    public final void c1() {
        if (this.R) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public void d0(int i2, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i2 >= 0) {
                u[] uVarArr = this.d0;
                if (i2 < uVarArr.length) {
                    uVar = uVarArr[i2];
                }
            }
            if (uVar != null) {
                menu = uVar.j;
            }
        }
        if ((uVar == null || uVar.o) && !this.i0) {
            this.D.d(this.C.getCallback(), i2, menu);
        }
    }

    public final p3 d1() {
        for (Context context = this.B; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof p3) {
                return (p3) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public void e0(androidx.appcompat.view.menu.e eVar) {
        if (this.c0) {
            return;
        }
        this.c0 = true;
        this.I.i();
        Window.Callback A02 = A0();
        if (A02 != null && !this.i0) {
            A02.onPanelClosed(p21.Z0, eVar);
        }
        this.c0 = false;
    }

    public final void e1(Configuration configuration) {
        Activity activity = (Activity) this.A;
        if (activity instanceof sj0) {
            if (!((sj0) activity).a().b().a(c.EnumC0020c.CREATED)) {
                return;
            }
        } else if (!this.h0 || this.i0) {
            return;
        }
        activity.onConfigurationChanged(configuration);
    }

    @Override // com.daaw.z3
    public void f(View view, ViewGroup.LayoutParams layoutParams) {
        p0();
        ((ViewGroup) this.S.findViewById(16908290)).addView(view, layoutParams);
        this.D.c(this.C.getCallback());
    }

    public final void f0() {
        q qVar = this.o0;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.p0;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f1(int r9, com.daaw.rk0 r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r0 = r8.B
            r1 = 0
            android.content.res.Configuration r0 = r8.i0(r0, r9, r10, r1)
            int r2 = r8.u0()
            android.content.res.Configuration r3 = r8.j0
            if (r3 != 0) goto L19
            android.content.Context r3 = r8.B
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
        L19:
            int r4 = r3.uiMode
            r4 = r4 & 48
            int r5 = r0.uiMode
            r5 = r5 & 48
            com.daaw.rk0 r3 = r8.x0(r3)
            if (r10 != 0) goto L29
            r0 = r1
            goto L2d
        L29:
            com.daaw.rk0 r0 = r8.x0(r0)
        L2d:
            r6 = 0
            if (r4 == r5) goto L33
            r4 = 512(0x200, float:7.175E-43)
            goto L34
        L33:
            r4 = 0
        L34:
            if (r0 == 0) goto L40
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L40
            r3 = r4 | 4
            r4 = r3 | 8192(0x2000, float:1.14794E-41)
        L40:
            r3 = r2 ^ (-1)
            r3 = r3 & r4
            r7 = 1
            if (r3 == 0) goto L6b
            if (r11 == 0) goto L6b
            boolean r11 = r8.g0
            if (r11 == 0) goto L6b
            boolean r11 = com.daaw.a4.B0
            if (r11 != 0) goto L54
            boolean r11 = r8.h0
            if (r11 == 0) goto L6b
        L54:
            java.lang.Object r11 = r8.A
            boolean r3 = r11 instanceof android.app.Activity
            if (r3 == 0) goto L6b
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L6b
            java.lang.Object r11 = r8.A
            android.app.Activity r11 = (android.app.Activity) r11
            com.daaw.q0.n(r11)
            r11 = 1
            goto L6c
        L6b:
            r11 = 0
        L6c:
            if (r11 != 0) goto L79
            if (r4 == 0) goto L79
            r11 = r4 & r2
            if (r11 != r4) goto L75
            r6 = 1
        L75:
            r8.g1(r5, r0, r6, r1)
            goto L7a
        L79:
            r7 = r11
        L7a:
            if (r7 == 0) goto L96
            java.lang.Object r11 = r8.A
            boolean r1 = r11 instanceof com.daaw.p3
            if (r1 == 0) goto L96
            r1 = r4 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L8b
            com.daaw.p3 r11 = (com.daaw.p3) r11
            r11.K(r9)
        L8b:
            r9 = r4 & 4
            if (r9 == 0) goto L96
            java.lang.Object r9 = r8.A
            com.daaw.p3 r9 = (com.daaw.p3) r9
            r9.J(r10)
        L96:
            if (r7 == 0) goto L9d
            if (r0 == 0) goto L9d
            r8.Y0(r0)
        L9d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.a4.f1(int, com.daaw.rk0, boolean):boolean");
    }

    @Override // com.daaw.z3
    public boolean g() {
        if (z3.z(this.B) && z3.u() != null && !z3.u().equals(z3.v())) {
            i(this.B);
        }
        return X(true);
    }

    public void g0(int i2) {
        h0(y0(i2, true), true);
    }

    public final void g1(int i2, rk0 rk0Var, boolean z, Configuration configuration) {
        Resources resources = this.B.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        if (rk0Var != null) {
            X0(configuration2, rk0Var);
        }
        resources.updateConfiguration(configuration2, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            m51.a(resources);
        }
        int i4 = this.l0;
        if (i4 != 0) {
            this.B.setTheme(i4);
            if (i3 >= 23) {
                this.B.getTheme().applyStyle(this.l0, true);
            }
        }
        if (z && (this.A instanceof Activity)) {
            e1(configuration2);
        }
    }

    public void h0(u uVar, boolean z) {
        ViewGroup viewGroup;
        hq hqVar;
        if (z && uVar.a == 0 && (hqVar = this.I) != null && hqVar.b()) {
            e0(uVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.B.getSystemService("window");
        if (windowManager != null && uVar.o && (viewGroup = uVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                d0(uVar.a, uVar, null);
            }
        }
        uVar.m = false;
        uVar.n = false;
        uVar.o = false;
        uVar.h = null;
        uVar.q = true;
        if (this.e0 == uVar) {
            this.e0 = null;
        }
    }

    public final int h1(px1 px1Var, Rect rect) {
        boolean z;
        boolean z2;
        int l2 = px1Var != null ? px1Var.l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.M;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.M.getLayoutParams();
            if (this.M.isShown()) {
                if (this.u0 == null) {
                    this.u0 = new Rect();
                    this.v0 = new Rect();
                }
                Rect rect2 = this.u0;
                Rect rect3 = this.v0;
                if (px1Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(px1Var.j(), px1Var.l(), px1Var.k(), px1Var.i());
                }
                hu1.a(this.S, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                px1 L = xs1.L(this.S);
                int j2 = L == null ? 0 : L.j();
                int k2 = L == null ? 0 : L.k();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.U != null) {
                    View view = this.U;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != j2 || marginLayoutParams2.rightMargin != k2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = j2;
                            marginLayoutParams2.rightMargin = k2;
                            this.U.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.B);
                    this.U = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = j2;
                    layoutParams.rightMargin = k2;
                    this.S.addView(this.U, -1, layoutParams);
                }
                View view3 = this.U;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    i1(this.U);
                }
                if (!this.Z && r5) {
                    l2 = 0;
                }
                z = r5;
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.M.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.U;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return l2;
    }

    public final Configuration i0(Context context, int i2, rk0 rk0Var, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (rk0Var != null) {
            X0(configuration2, rk0Var);
        }
        return configuration2;
    }

    public final void i1(View view) {
        Context context;
        int i2;
        if ((xs1.O(view) & 8192) != 0) {
            context = this.B;
            i2 = b11.abc_decor_view_status_guard_light;
        } else {
            context = this.B;
            i2 = b11.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(zk.c(context, i2));
    }

    public final ViewGroup j0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.B.obtainStyledAttributes(x21.y0);
        int i2 = x21.D0;
        if (!obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(x21.M0, false)) {
            M(1);
        } else if (obtainStyledAttributes.getBoolean(i2, false)) {
            M(p21.Z0);
        }
        if (obtainStyledAttributes.getBoolean(x21.E0, false)) {
            M(109);
        }
        if (obtainStyledAttributes.getBoolean(x21.F0, false)) {
            M(10);
        }
        this.a0 = obtainStyledAttributes.getBoolean(x21.z0, false);
        obtainStyledAttributes.recycle();
        q0();
        this.C.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.B);
        if (this.b0) {
            viewGroup = (ViewGroup) from.inflate(this.Z ? c21.abc_screen_simple_overlay_action_mode : c21.abc_screen_simple, (ViewGroup) null);
        } else if (this.a0) {
            viewGroup = (ViewGroup) from.inflate(c21.abc_dialog_title_material, (ViewGroup) null);
            this.Y = false;
            this.X = false;
        } else if (this.X) {
            TypedValue typedValue = new TypedValue();
            this.B.getTheme().resolveAttribute(x01.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new bl(this.B, typedValue.resourceId) : this.B).inflate(c21.abc_screen_toolbar, (ViewGroup) null);
            hq hqVar = (hq) viewGroup.findViewById(o11.decor_content_parent);
            this.I = hqVar;
            hqVar.setWindowCallback(A0());
            if (this.Y) {
                this.I.h(109);
            }
            if (this.V) {
                this.I.h(2);
            }
            if (this.W) {
                this.I.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.X + ", windowActionBarOverlay: " + this.Y + ", android:windowIsFloating: " + this.a0 + ", windowActionModeOverlay: " + this.Z + ", windowNoTitle: " + this.b0 + " }");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            xs1.D0(viewGroup, new c());
        } else if (viewGroup instanceof androidx.appcompat.widget.a) {
            ((androidx.appcompat.widget.a) viewGroup).setOnFitSystemWindowsListener(new d());
        }
        if (this.I == null) {
            this.T = (TextView) viewGroup.findViewById(o11.title);
        }
        hu1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(o11.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.C.findViewById(16908290);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.C.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    @Override // com.daaw.z3
    public Context k(Context context) {
        this.g0 = true;
        int H0 = H0(context, c0());
        if (z3.z(context)) {
            z3.W(context);
        }
        rk0 b0 = b0(context);
        if (C0 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, i0(context, H0, b0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof bl) {
            try {
                ((bl) context).a(i0(context, H0, b0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (B0) {
            Configuration configuration = new Configuration();
            configuration.uiMode = -1;
            configuration.fontScale = 0.0f;
            Configuration configuration2 = k.a(context, configuration).getResources().getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            configuration2.uiMode = configuration3.uiMode;
            Configuration i0 = i0(context, H0, b0, configuration2.equals(configuration3) ? null : s0(configuration2, configuration3));
            bl blVar = new bl(context, l21.Theme_AppCompat_Empty);
            blVar.a(i0);
            boolean z = false;
            try {
                z = context.getTheme() != null;
            } catch (NullPointerException unused3) {
            }
            if (z) {
                j51.g.a(blVar.getTheme());
            }
            return super.k(blVar);
        }
        return super.k(context);
    }

    public View k0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        z4 z4Var;
        boolean z2 = false;
        if (this.w0 == null) {
            String string = this.B.obtainStyledAttributes(x21.y0).getString(x21.C0);
            if (string == null) {
                z4Var = new z4();
            } else {
                try {
                    this.w0 = (z4) this.B.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    z4Var = new z4();
                }
            }
            this.w0 = z4Var;
        }
        boolean z3 = z0;
        if (z3) {
            if (this.x0 == null) {
                this.x0 = new ui0();
            }
            if (this.x0.a(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z2 = a1((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z2 = true;
                }
                z = z2;
            }
        } else {
            z = false;
        }
        return this.w0.r(view, str, context, attributeSet, z, z3, true, hs1.c());
    }

    public void l0() {
        androidx.appcompat.view.menu.e eVar;
        hq hqVar = this.I;
        if (hqVar != null) {
            hqVar.i();
        }
        if (this.N != null) {
            this.C.getDecorView().removeCallbacks(this.O);
            if (this.N.isShowing()) {
                try {
                    this.N.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.N = null;
        }
        o0();
        u y02 = y0(0, false);
        if (y02 == null || (eVar = y02.j) == null) {
            return;
        }
        eVar.close();
    }

    public boolean m0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.A;
        if (((obj instanceof ii0.a) || (obj instanceof c4)) && (decorView = this.C.getDecorView()) != null && ii0.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.D.b(this.C.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? J0(keyCode, keyEvent) : M0(keyCode, keyEvent);
    }

    @Override // com.daaw.z3
    public <T extends View> T n(int i2) {
        p0();
        return (T) this.C.findViewById(i2);
    }

    public void n0(int i2) {
        u y02;
        u y03 = y0(i2, true);
        if (y03.j != null) {
            Bundle bundle = new Bundle();
            y03.j.T(bundle);
            if (bundle.size() > 0) {
                y03.s = bundle;
            }
            y03.j.h0();
            y03.j.clear();
        }
        y03.r = true;
        y03.q = true;
        if ((i2 != 108 && i2 != 0) || this.I == null || (y02 = y0(0, false)) == null) {
            return;
        }
        y02.m = false;
        U0(y02, null);
    }

    public void o0() {
        ut1 ut1Var = this.P;
        if (ut1Var != null) {
            ut1Var.c();
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return k0(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // com.daaw.z3
    public Context p() {
        return this.B;
    }

    public final void p0() {
        if (this.R) {
            return;
        }
        this.S = j0();
        CharSequence z02 = z0();
        if (!TextUtils.isEmpty(z02)) {
            hq hqVar = this.I;
            if (hqVar != null) {
                hqVar.setWindowTitle(z02);
            } else if (S0() != null) {
                S0().y(z02);
            } else {
                TextView textView = this.T;
                if (textView != null) {
                    textView.setText(z02);
                }
            }
        }
        Z();
        Q0(this.S);
        this.R = true;
        u y02 = y0(0, false);
        if (this.i0) {
            return;
        }
        if (y02 == null || y02.j == null) {
            F0(p21.Z0);
        }
    }

    public final void q0() {
        if (this.C == null) {
            Object obj = this.A;
            if (obj instanceof Activity) {
                a0(((Activity) obj).getWindow());
            }
        }
        if (this.C == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // com.daaw.z3
    public int r() {
        return this.k0;
    }

    public u r0(Menu menu) {
        u[] uVarArr = this.d0;
        int length = uVarArr != null ? uVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            u uVar = uVarArr[i2];
            if (uVar != null && uVar.j == menu) {
                return uVar;
            }
        }
        return null;
    }

    @Override // com.daaw.z3
    public MenuInflater t() {
        if (this.G == null) {
            B0();
            i0 i0Var = this.F;
            this.G = new gi1(i0Var != null ? i0Var.j() : this.B);
        }
        return this.G;
    }

    public final Context t0() {
        i0 w = w();
        Context j2 = w != null ? w.j() : null;
        return j2 == null ? this.B : j2;
    }

    public final int u0() {
        if (!this.n0 && (this.A instanceof Activity)) {
            PackageManager packageManager = this.B.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.B, this.A.getClass()), i2 >= 29 ? 269221888 : i2 >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.m0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.m0 = 0;
            }
        }
        this.n0 = true;
        return this.m0;
    }

    public final q v0(Context context) {
        if (this.p0 == null) {
            this.p0 = new p(context);
        }
        return this.p0;
    }

    @Override // com.daaw.z3
    public i0 w() {
        B0();
        return this.F;
    }

    public final q w0(Context context) {
        if (this.o0 == null) {
            this.o0 = new r(po1.a(context));
        }
        return this.o0;
    }

    @Override // com.daaw.z3
    public void x() {
        LayoutInflater from = LayoutInflater.from(this.B);
        if (from.getFactory() == null) {
            vi0.b(from, this);
        } else {
            boolean z = from.getFactory2() instanceof a4;
        }
    }

    public rk0 x0(Configuration configuration) {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 24 ? m.b(configuration) : i2 >= 21 ? rk0.c(l.b(configuration.locale)) : rk0.a(configuration.locale);
    }

    @Override // com.daaw.z3
    public void y() {
        if (S0() == null || w().k()) {
            return;
        }
        F0(0);
    }

    public u y0(int i2, boolean z) {
        u[] uVarArr = this.d0;
        if (uVarArr == null || uVarArr.length <= i2) {
            u[] uVarArr2 = new u[i2 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.d0 = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i2];
        if (uVar == null) {
            u uVar2 = new u(i2);
            uVarArr[i2] = uVar2;
            return uVar2;
        }
        return uVar;
    }

    public final CharSequence z0() {
        Object obj = this.A;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.H;
    }
}
