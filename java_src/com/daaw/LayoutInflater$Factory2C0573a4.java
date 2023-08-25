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
import androidx.appcompat.view.menu.C0079c;
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.view.menu.InterfaceC0091i;
import androidx.appcompat.view.menu.InterfaceC0093j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0162a;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.AbstractC0344c;
import com.daaw.AbstractC2228n0;
import com.daaw.di1;
import com.daaw.ii0;
import com.daaw.j51;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: com.daaw.a4 */
/* loaded from: classes.dex */
public class LayoutInflater$Factory2C0573a4 extends AbstractC3800z3 implements C0082e.InterfaceC0083a, LayoutInflater.Factory2 {

    /* renamed from: A0 */
    public static final int[] f2761A0;

    /* renamed from: B0 */
    public static final boolean f2762B0;

    /* renamed from: C0 */
    public static final boolean f2763C0;

    /* renamed from: D0 */
    public static boolean f2764D0;

    /* renamed from: y0 */
    public static final cd1<String, Integer> f2765y0 = new cd1<>();

    /* renamed from: z0 */
    public static final boolean f2766z0;

    /* renamed from: A */
    public final Object f2767A;

    /* renamed from: B */
    public final Context f2768B;

    /* renamed from: C */
    public Window f2769C;

    /* renamed from: D */
    public C0590o f2770D;

    /* renamed from: E */
    public final InterfaceC3010t3 f2771E;

    /* renamed from: F */
    public AbstractC1643i0 f2772F;

    /* renamed from: G */
    public MenuInflater f2773G;

    /* renamed from: H */
    public CharSequence f2774H;

    /* renamed from: I */
    public InterfaceC1605hq f2775I;

    /* renamed from: J */
    public C0583i f2776J;

    /* renamed from: K */
    public C0598v f2777K;

    /* renamed from: L */
    public AbstractC2228n0 f2778L;

    /* renamed from: M */
    public ActionBarContextView f2779M;

    /* renamed from: N */
    public PopupWindow f2780N;

    /* renamed from: O */
    public Runnable f2781O;

    /* renamed from: P */
    public ut1 f2782P;

    /* renamed from: Q */
    public boolean f2783Q;

    /* renamed from: R */
    public boolean f2784R;

    /* renamed from: S */
    public ViewGroup f2785S;

    /* renamed from: T */
    public TextView f2786T;

    /* renamed from: U */
    public View f2787U;

    /* renamed from: V */
    public boolean f2788V;

    /* renamed from: W */
    public boolean f2789W;

    /* renamed from: X */
    public boolean f2790X;

    /* renamed from: Y */
    public boolean f2791Y;

    /* renamed from: Z */
    public boolean f2792Z;

    /* renamed from: a0 */
    public boolean f2793a0;

    /* renamed from: b0 */
    public boolean f2794b0;

    /* renamed from: c0 */
    public boolean f2795c0;

    /* renamed from: d0 */
    public C0597u[] f2796d0;

    /* renamed from: e0 */
    public C0597u f2797e0;

    /* renamed from: f0 */
    public boolean f2798f0;

    /* renamed from: g0 */
    public boolean f2799g0;

    /* renamed from: h0 */
    public boolean f2800h0;

    /* renamed from: i0 */
    public boolean f2801i0;

    /* renamed from: j0 */
    public Configuration f2802j0;

    /* renamed from: k0 */
    public int f2803k0;

    /* renamed from: l0 */
    public int f2804l0;

    /* renamed from: m0 */
    public int f2805m0;

    /* renamed from: n0 */
    public boolean f2806n0;

    /* renamed from: o0 */
    public AbstractC0592q f2807o0;

    /* renamed from: p0 */
    public AbstractC0592q f2808p0;

    /* renamed from: q0 */
    public boolean f2809q0;

    /* renamed from: r0 */
    public int f2810r0;

    /* renamed from: s0 */
    public final Runnable f2811s0;

    /* renamed from: t0 */
    public boolean f2812t0;

    /* renamed from: u0 */
    public Rect f2813u0;

    /* renamed from: v0 */
    public Rect f2814v0;

    /* renamed from: w0 */
    public C3809z4 f2815w0;

    /* renamed from: x0 */
    public ui0 f2816x0;

    /* renamed from: com.daaw.a4$a */
    /* loaded from: classes.dex */
    public class C0574a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f2817a;

        public C0574a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f2817a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        public final boolean m27652a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!m27652a(th)) {
                this.f2817a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f2817a.uncaughtException(thread, notFoundException);
        }
    }

    /* renamed from: com.daaw.a4$b */
    /* loaded from: classes.dex */
    public class RunnableC0575b implements Runnable {
        public RunnableC0575b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0573a4 layoutInflater$Factory2C0573a4 = LayoutInflater$Factory2C0573a4.this;
            if ((layoutInflater$Factory2C0573a4.f2810r0 & 1) != 0) {
                layoutInflater$Factory2C0573a4.m27665n0(0);
            }
            LayoutInflater$Factory2C0573a4 layoutInflater$Factory2C0573a42 = LayoutInflater$Factory2C0573a4.this;
            if ((layoutInflater$Factory2C0573a42.f2810r0 & 4096) != 0) {
                layoutInflater$Factory2C0573a42.m27665n0(p21.f22364Z0);
            }
            LayoutInflater$Factory2C0573a4 layoutInflater$Factory2C0573a43 = LayoutInflater$Factory2C0573a4.this;
            layoutInflater$Factory2C0573a43.f2809q0 = false;
            layoutInflater$Factory2C0573a43.f2810r0 = 0;
        }
    }

    /* renamed from: com.daaw.a4$c */
    /* loaded from: classes.dex */
    public class C0576c implements vt0 {
        public C0576c() {
        }

        @Override // com.daaw.vt0
        /* renamed from: a */
        public px1 mo6806a(View view, px1 px1Var) {
            int m12949l = px1Var.m12949l();
            int m27672h1 = LayoutInflater$Factory2C0573a4.this.m27672h1(px1Var, null);
            if (m12949l != m27672h1) {
                px1Var = px1Var.m12944q(px1Var.m12951j(), m27672h1, px1Var.m12950k(), px1Var.m12952i());
            }
            return xs1.m4730d0(view, px1Var);
        }
    }

    /* renamed from: com.daaw.a4$d */
    /* loaded from: classes.dex */
    public class C0577d implements InterfaceC0162a.InterfaceC0163a {
        public C0577d() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0162a.InterfaceC0163a
        /* renamed from: a */
        public void mo27651a(Rect rect) {
            rect.top = LayoutInflater$Factory2C0573a4.this.m27672h1(null, rect);
        }
    }

    /* renamed from: com.daaw.a4$e */
    /* loaded from: classes.dex */
    public class C0578e implements ContentFrameLayout.InterfaceC0132a {
        public C0578e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0132a
        /* renamed from: a */
        public void mo27650a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0132a
        public void onDetachedFromWindow() {
            LayoutInflater$Factory2C0573a4.this.m27667l0();
        }
    }

    /* renamed from: com.daaw.a4$f */
    /* loaded from: classes.dex */
    public class RunnableC0579f implements Runnable {

        /* renamed from: com.daaw.a4$f$a */
        /* loaded from: classes.dex */
        public class C0580a extends xt1 {
            public C0580a() {
            }

            @Override // com.daaw.wt1
            /* renamed from: b */
            public void mo5810b(View view) {
                LayoutInflater$Factory2C0573a4.this.f2779M.setAlpha(1.0f);
                LayoutInflater$Factory2C0573a4.this.f2782P.m7728h(null);
                LayoutInflater$Factory2C0573a4.this.f2782P = null;
            }

            @Override // com.daaw.xt1, com.daaw.wt1
            /* renamed from: c */
            public void mo4526c(View view) {
                LayoutInflater$Factory2C0573a4.this.f2779M.setVisibility(0);
            }
        }

        public RunnableC0579f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0573a4 layoutInflater$Factory2C0573a4 = LayoutInflater$Factory2C0573a4.this;
            layoutInflater$Factory2C0573a4.f2780N.showAtLocation(layoutInflater$Factory2C0573a4.f2779M, 55, 0, 0);
            LayoutInflater$Factory2C0573a4.this.m27664o0();
            if (!LayoutInflater$Factory2C0573a4.this.m27688Z0()) {
                LayoutInflater$Factory2C0573a4.this.f2779M.setAlpha(1.0f);
                LayoutInflater$Factory2C0573a4.this.f2779M.setVisibility(0);
                return;
            }
            LayoutInflater$Factory2C0573a4.this.f2779M.setAlpha(0.0f);
            LayoutInflater$Factory2C0573a4 layoutInflater$Factory2C0573a42 = LayoutInflater$Factory2C0573a4.this;
            layoutInflater$Factory2C0573a42.f2782P = xs1.m4729e(layoutInflater$Factory2C0573a42.f2779M).m7734b(1.0f);
            LayoutInflater$Factory2C0573a4.this.f2782P.m7728h(new C0580a());
        }
    }

    /* renamed from: com.daaw.a4$g */
    /* loaded from: classes.dex */
    public class C0581g extends xt1 {
        public C0581g() {
        }

        @Override // com.daaw.wt1
        /* renamed from: b */
        public void mo5810b(View view) {
            LayoutInflater$Factory2C0573a4.this.f2779M.setAlpha(1.0f);
            LayoutInflater$Factory2C0573a4.this.f2782P.m7728h(null);
            LayoutInflater$Factory2C0573a4.this.f2782P = null;
        }

        @Override // com.daaw.xt1, com.daaw.wt1
        /* renamed from: c */
        public void mo4526c(View view) {
            LayoutInflater$Factory2C0573a4.this.f2779M.setVisibility(0);
            if (LayoutInflater$Factory2C0573a4.this.f2779M.getParent() instanceof View) {
                xs1.m4708o0((View) LayoutInflater$Factory2C0573a4.this.f2779M.getParent());
            }
        }
    }

    /* renamed from: com.daaw.a4$h */
    /* loaded from: classes.dex */
    public interface InterfaceC0582h {
        /* renamed from: a */
        boolean mo24216a(int i);

        View onCreatePanelView(int i);
    }

    /* renamed from: com.daaw.a4$i */
    /* loaded from: classes.dex */
    public final class C0583i implements InterfaceC0091i.InterfaceC0092a {
        public C0583i() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i.InterfaceC0092a
        /* renamed from: b */
        public void mo24218b(C0082e c0082e, boolean z) {
            LayoutInflater$Factory2C0573a4.this.m27679e0(c0082e);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i.InterfaceC0092a
        /* renamed from: c */
        public boolean mo24217c(C0082e c0082e) {
            Window.Callback m27716A0 = LayoutInflater$Factory2C0573a4.this.m27716A0();
            if (m27716A0 != null) {
                m27716A0.onMenuOpened(p21.f22364Z0, c0082e);
                return true;
            }
            return true;
        }
    }

    /* renamed from: com.daaw.a4$j */
    /* loaded from: classes.dex */
    public class C0584j implements AbstractC2228n0.InterfaceC2229a {

        /* renamed from: a */
        public AbstractC2228n0.InterfaceC2229a f2826a;

        /* renamed from: com.daaw.a4$j$a */
        /* loaded from: classes.dex */
        public class C0585a extends xt1 {
            public C0585a() {
            }

            @Override // com.daaw.wt1
            /* renamed from: b */
            public void mo5810b(View view) {
                LayoutInflater$Factory2C0573a4.this.f2779M.setVisibility(8);
                LayoutInflater$Factory2C0573a4 layoutInflater$Factory2C0573a4 = LayoutInflater$Factory2C0573a4.this;
                PopupWindow popupWindow = layoutInflater$Factory2C0573a4.f2780N;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflater$Factory2C0573a4.f2779M.getParent() instanceof View) {
                    xs1.m4708o0((View) LayoutInflater$Factory2C0573a4.this.f2779M.getParent());
                }
                LayoutInflater$Factory2C0573a4.this.f2779M.m30156k();
                LayoutInflater$Factory2C0573a4.this.f2782P.m7728h(null);
                LayoutInflater$Factory2C0573a4 layoutInflater$Factory2C0573a42 = LayoutInflater$Factory2C0573a4.this;
                layoutInflater$Factory2C0573a42.f2782P = null;
                xs1.m4708o0(layoutInflater$Factory2C0573a42.f2785S);
            }
        }

        public C0584j(AbstractC2228n0.InterfaceC2229a interfaceC2229a) {
            this.f2826a = interfaceC2229a;
        }

        @Override // com.daaw.AbstractC2228n0.InterfaceC2229a
        /* renamed from: a */
        public boolean mo15631a(AbstractC2228n0 abstractC2228n0, Menu menu) {
            xs1.m4708o0(LayoutInflater$Factory2C0573a4.this.f2785S);
            return this.f2826a.mo15631a(abstractC2228n0, menu);
        }

        @Override // com.daaw.AbstractC2228n0.InterfaceC2229a
        /* renamed from: b */
        public boolean mo15630b(AbstractC2228n0 abstractC2228n0, Menu menu) {
            return this.f2826a.mo15630b(abstractC2228n0, menu);
        }

        @Override // com.daaw.AbstractC2228n0.InterfaceC2229a
        /* renamed from: c */
        public void mo15629c(AbstractC2228n0 abstractC2228n0) {
            this.f2826a.mo15629c(abstractC2228n0);
            LayoutInflater$Factory2C0573a4 layoutInflater$Factory2C0573a4 = LayoutInflater$Factory2C0573a4.this;
            if (layoutInflater$Factory2C0573a4.f2780N != null) {
                layoutInflater$Factory2C0573a4.f2769C.getDecorView().removeCallbacks(LayoutInflater$Factory2C0573a4.this.f2781O);
            }
            LayoutInflater$Factory2C0573a4 layoutInflater$Factory2C0573a42 = LayoutInflater$Factory2C0573a4.this;
            if (layoutInflater$Factory2C0573a42.f2779M != null) {
                layoutInflater$Factory2C0573a42.m27664o0();
                LayoutInflater$Factory2C0573a4 layoutInflater$Factory2C0573a43 = LayoutInflater$Factory2C0573a4.this;
                layoutInflater$Factory2C0573a43.f2782P = xs1.m4729e(layoutInflater$Factory2C0573a43.f2779M).m7734b(0.0f);
                LayoutInflater$Factory2C0573a4.this.f2782P.m7728h(new C0585a());
            }
            LayoutInflater$Factory2C0573a4 layoutInflater$Factory2C0573a44 = LayoutInflater$Factory2C0573a4.this;
            InterfaceC3010t3 interfaceC3010t3 = layoutInflater$Factory2C0573a44.f2771E;
            if (interfaceC3010t3 != null) {
                interfaceC3010t3.mo9641h(layoutInflater$Factory2C0573a44.f2778L);
            }
            LayoutInflater$Factory2C0573a4 layoutInflater$Factory2C0573a45 = LayoutInflater$Factory2C0573a4.this;
            layoutInflater$Factory2C0573a45.f2778L = null;
            xs1.m4708o0(layoutInflater$Factory2C0573a45.f2785S);
        }

        @Override // com.daaw.AbstractC2228n0.InterfaceC2229a
        /* renamed from: d */
        public boolean mo15628d(AbstractC2228n0 abstractC2228n0, MenuItem menuItem) {
            return this.f2826a.mo15628d(abstractC2228n0, menuItem);
        }
    }

    /* renamed from: com.daaw.a4$k */
    /* loaded from: classes.dex */
    public static class C0586k {
        /* renamed from: a */
        public static Context m27649a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        public static void m27648b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }

        /* renamed from: c */
        public static void m27647c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        /* renamed from: d */
        public static void m27646d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* renamed from: com.daaw.a4$l */
    /* loaded from: classes.dex */
    public static class C0587l {
        /* renamed from: a */
        public static boolean m27645a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        /* renamed from: b */
        public static String m27644b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* renamed from: com.daaw.a4$m */
    /* loaded from: classes.dex */
    public static class C0588m {
        /* renamed from: a */
        public static void m27643a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        /* renamed from: b */
        public static rk0 m27642b(Configuration configuration) {
            return rk0.m11225c(configuration.getLocales().toLanguageTags());
        }

        /* renamed from: c */
        public static void m27641c(rk0 rk0Var) {
            LocaleList.setDefault(LocaleList.forLanguageTags(rk0Var.m11220h()));
        }

        /* renamed from: d */
        public static void m27640d(Configuration configuration, rk0 rk0Var) {
            configuration.setLocales(LocaleList.forLanguageTags(rk0Var.m11220h()));
        }
    }

    /* renamed from: com.daaw.a4$n */
    /* loaded from: classes.dex */
    public static class C0589n {
        /* renamed from: a */
        public static void m27639a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
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

    /* renamed from: com.daaw.a4$o */
    /* loaded from: classes.dex */
    public class C0590o extends lx1 {

        /* renamed from: q */
        public InterfaceC0582h f2829q;

        /* renamed from: r */
        public boolean f2830r;

        /* renamed from: s */
        public boolean f2831s;

        /* renamed from: t */
        public boolean f2832t;

        public C0590o(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: b */
        public boolean m27638b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f2831s = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f2831s = false;
            }
        }

        /* renamed from: c */
        public void m27637c(Window.Callback callback) {
            try {
                this.f2830r = true;
                callback.onContentChanged();
            } finally {
                this.f2830r = false;
            }
        }

        /* renamed from: d */
        public void m27636d(Window.Callback callback, int i, Menu menu) {
            try {
                this.f2832t = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.f2832t = false;
            }
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f2831s ? m16391a().dispatchKeyEvent(keyEvent) : LayoutInflater$Factory2C0573a4.this.m27666m0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflater$Factory2C0573a4.this.m27705L0(keyEvent.getKeyCode(), keyEvent);
        }

        /* renamed from: e */
        public void m27635e(InterfaceC0582h interfaceC0582h) {
            this.f2829q = interfaceC0582h;
        }

        /* renamed from: f */
        public final ActionMode m27634f(ActionMode.Callback callback) {
            di1.C1089a c1089a = new di1.C1089a(LayoutInflater$Factory2C0573a4.this.f2768B, callback);
            AbstractC2228n0 mo2937V = LayoutInflater$Factory2C0573a4.this.mo2937V(c1089a);
            if (mo2937V != null) {
                return c1089a.m24363e(mo2937V);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f2830r) {
                m16391a().onContentChanged();
            }
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0082e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            InterfaceC0582h interfaceC0582h = this.f2829q;
            return (interfaceC0582h == null || (onCreatePanelView = interfaceC0582h.onCreatePanelView(i)) == null) ? super.onCreatePanelView(i) : onCreatePanelView;
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflater$Factory2C0573a4.this.m27702O0(i);
            return true;
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.f2832t) {
                m16391a().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            LayoutInflater$Factory2C0573a4.this.m27701P0(i);
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0082e c0082e = menu instanceof C0082e ? (C0082e) menu : null;
            if (i == 0 && c0082e == null) {
                return false;
            }
            boolean z = true;
            if (c0082e != null) {
                c0082e.m30238e0(true);
            }
            InterfaceC0582h interfaceC0582h = this.f2829q;
            z = (interfaceC0582h == null || !interfaceC0582h.mo24216a(i)) ? false : false;
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (c0082e != null) {
                c0082e.m30238e0(false);
            }
            return z;
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0082e c0082e;
            C0597u m27654y0 = LayoutInflater$Factory2C0573a4.this.m27654y0(0, true);
            if (m27654y0 == null || (c0082e = m27654y0.f2851j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, c0082e, i);
            }
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return LayoutInflater$Factory2C0573a4.this.m27710G0() ? m27634f(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // com.daaw.lx1, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (LayoutInflater$Factory2C0573a4.this.m27710G0() && i == 0) ? m27634f(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    /* renamed from: com.daaw.a4$p */
    /* loaded from: classes.dex */
    public class C0591p extends AbstractC0592q {

        /* renamed from: c */
        public final PowerManager f2834c;

        public C0591p(Context context) {
            super();
            this.f2834c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // com.daaw.LayoutInflater$Factory2C0573a4.AbstractC0592q
        /* renamed from: b */
        public IntentFilter mo27631b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // com.daaw.LayoutInflater$Factory2C0573a4.AbstractC0592q
        /* renamed from: c */
        public int mo27630c() {
            return (Build.VERSION.SDK_INT < 21 || !C0587l.m27645a(this.f2834c)) ? 1 : 2;
        }

        @Override // com.daaw.LayoutInflater$Factory2C0573a4.AbstractC0592q
        /* renamed from: d */
        public void mo27629d() {
            LayoutInflater$Factory2C0573a4.this.m27691Y();
        }
    }

    /* renamed from: com.daaw.a4$q */
    /* loaded from: classes.dex */
    public abstract class AbstractC0592q {

        /* renamed from: a */
        public BroadcastReceiver f2836a;

        /* renamed from: com.daaw.a4$q$a */
        /* loaded from: classes.dex */
        public class C0593a extends BroadcastReceiver {
            public C0593a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC0592q.this.mo27629d();
            }
        }

        public AbstractC0592q() {
        }

        /* renamed from: a */
        public void m27633a() {
            BroadcastReceiver broadcastReceiver = this.f2836a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflater$Factory2C0573a4.this.f2768B.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f2836a = null;
            }
        }

        /* renamed from: b */
        public abstract IntentFilter mo27631b();

        /* renamed from: c */
        public abstract int mo27630c();

        /* renamed from: d */
        public abstract void mo27629d();

        /* renamed from: e */
        public void m27632e() {
            m27633a();
            IntentFilter mo27631b = mo27631b();
            if (mo27631b == null || mo27631b.countActions() == 0) {
                return;
            }
            if (this.f2836a == null) {
                this.f2836a = new C0593a();
            }
            LayoutInflater$Factory2C0573a4.this.f2768B.registerReceiver(this.f2836a, mo27631b);
        }
    }

    /* renamed from: com.daaw.a4$r */
    /* loaded from: classes.dex */
    public class C0594r extends AbstractC0592q {

        /* renamed from: c */
        public final po1 f2839c;

        public C0594r(po1 po1Var) {
            super();
            this.f2839c = po1Var;
        }

        @Override // com.daaw.LayoutInflater$Factory2C0573a4.AbstractC0592q
        /* renamed from: b */
        public IntentFilter mo27631b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // com.daaw.LayoutInflater$Factory2C0573a4.AbstractC0592q
        /* renamed from: c */
        public int mo27630c() {
            return this.f2839c.m13255d() ? 2 : 1;
        }

        @Override // com.daaw.LayoutInflater$Factory2C0573a4.AbstractC0592q
        /* renamed from: d */
        public void mo27629d() {
            LayoutInflater$Factory2C0573a4.this.m27691Y();
        }
    }

    /* renamed from: com.daaw.a4$s */
    /* loaded from: classes.dex */
    public static class C0595s {
        /* renamed from: a */
        public static void m27628a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: com.daaw.a4$t */
    /* loaded from: classes.dex */
    public class C0596t extends ContentFrameLayout {
        public C0596t(Context context) {
            super(context);
        }

        /* renamed from: c */
        public final boolean m27627c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflater$Factory2C0573a4.this.m27666m0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && m27627c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                LayoutInflater$Factory2C0573a4.this.m27675g0(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C2818r4.m11783b(getContext(), i));
        }
    }

    /* renamed from: com.daaw.a4$u */
    /* loaded from: classes.dex */
    public static final class C0597u {

        /* renamed from: a */
        public int f2842a;

        /* renamed from: b */
        public int f2843b;

        /* renamed from: c */
        public int f2844c;

        /* renamed from: d */
        public int f2845d;

        /* renamed from: e */
        public int f2846e;

        /* renamed from: f */
        public int f2847f;

        /* renamed from: g */
        public ViewGroup f2848g;

        /* renamed from: h */
        public View f2849h;

        /* renamed from: i */
        public View f2850i;

        /* renamed from: j */
        public C0082e f2851j;

        /* renamed from: k */
        public C0079c f2852k;

        /* renamed from: l */
        public Context f2853l;

        /* renamed from: m */
        public boolean f2854m;

        /* renamed from: n */
        public boolean f2855n;

        /* renamed from: o */
        public boolean f2856o;

        /* renamed from: p */
        public boolean f2857p;

        /* renamed from: q */
        public boolean f2858q = false;

        /* renamed from: r */
        public boolean f2859r;

        /* renamed from: s */
        public Bundle f2860s;

        public C0597u(int i) {
            this.f2842a = i;
        }

        /* renamed from: a */
        public InterfaceC0093j m27626a(InterfaceC0091i.InterfaceC0092a interfaceC0092a) {
            if (this.f2851j == null) {
                return null;
            }
            if (this.f2852k == null) {
                C0079c c0079c = new C0079c(this.f2853l, c21.abc_list_menu_item_layout);
                this.f2852k = c0079c;
                c0079c.mo30174g(interfaceC0092a);
                this.f2851j.m30245b(this.f2852k);
            }
            return this.f2852k.m30276h(this.f2848g);
        }

        /* renamed from: b */
        public boolean m27625b() {
            if (this.f2849h == null) {
                return false;
            }
            return this.f2850i != null || this.f2852k.m30277a().getCount() > 0;
        }

        /* renamed from: c */
        public void m27624c(C0082e c0082e) {
            C0079c c0079c;
            C0082e c0082e2 = this.f2851j;
            if (c0082e == c0082e2) {
                return;
            }
            if (c0082e2 != null) {
                c0082e2.m30256Q(this.f2852k);
            }
            this.f2851j = c0082e;
            if (c0082e == null || (c0079c = this.f2852k) == null) {
                return;
            }
            c0082e.m30245b(c0079c);
        }

        /* renamed from: d */
        public void m27623d(Context context) {
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
            C0855bl c0855bl = new C0855bl(context, 0);
            c0855bl.getTheme().setTo(newTheme);
            this.f2853l = c0855bl;
            TypedArray obtainStyledAttributes = c0855bl.obtainStyledAttributes(x21.f32003y0);
            this.f2843b = obtainStyledAttributes.getResourceId(x21.f31764B0, 0);
            this.f2847f = obtainStyledAttributes.getResourceId(x21.f31759A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.daaw.a4$v */
    /* loaded from: classes.dex */
    public final class C0598v implements InterfaceC0091i.InterfaceC0092a {
        public C0598v() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i.InterfaceC0092a
        /* renamed from: b */
        public void mo24218b(C0082e c0082e, boolean z) {
            C0082e mo30173F = c0082e.mo30173F();
            boolean z2 = mo30173F != c0082e;
            LayoutInflater$Factory2C0573a4 layoutInflater$Factory2C0573a4 = LayoutInflater$Factory2C0573a4.this;
            if (z2) {
                c0082e = mo30173F;
            }
            C0597u m27661r0 = layoutInflater$Factory2C0573a4.m27661r0(c0082e);
            if (m27661r0 != null) {
                if (!z2) {
                    LayoutInflater$Factory2C0573a4.this.m27673h0(m27661r0, z);
                    return;
                }
                LayoutInflater$Factory2C0573a4.this.m27681d0(m27661r0.f2842a, m27661r0, mo30173F);
                LayoutInflater$Factory2C0573a4.this.m27673h0(m27661r0, true);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i.InterfaceC0092a
        /* renamed from: c */
        public boolean mo24217c(C0082e c0082e) {
            Window.Callback m27716A0;
            if (c0082e == c0082e.mo30173F()) {
                LayoutInflater$Factory2C0573a4 layoutInflater$Factory2C0573a4 = LayoutInflater$Factory2C0573a4.this;
                if (!layoutInflater$Factory2C0573a4.f2790X || (m27716A0 = layoutInflater$Factory2C0573a4.m27716A0()) == null || LayoutInflater$Factory2C0573a4.this.f2801i0) {
                    return true;
                }
                m27716A0.onMenuOpened(p21.f22364Z0, c0082e);
                return true;
            }
            return true;
        }
    }

    static {
        boolean z = Build.VERSION.SDK_INT < 21;
        f2766z0 = z;
        f2761A0 = new int[]{16842836};
        f2762B0 = !"robolectric".equals(Build.FINGERPRINT);
        f2763C0 = true;
        if (!z || f2764D0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new C0574a(Thread.getDefaultUncaughtExceptionHandler()));
        f2764D0 = true;
    }

    public LayoutInflater$Factory2C0573a4(Activity activity, InterfaceC3010t3 interfaceC3010t3) {
        this(activity, null, interfaceC3010t3, activity);
    }

    public LayoutInflater$Factory2C0573a4(Dialog dialog, InterfaceC3010t3 interfaceC3010t3) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC3010t3, dialog);
    }

    public LayoutInflater$Factory2C0573a4(Context context, Window window, InterfaceC3010t3 interfaceC3010t3, Object obj) {
        cd1<String, Integer> cd1Var;
        Integer num;
        ActivityC2508p3 m27680d1;
        this.f2782P = null;
        this.f2783Q = true;
        this.f2803k0 = -100;
        this.f2811s0 = new RunnableC0575b();
        this.f2768B = context;
        this.f2771E = interfaceC3010t3;
        this.f2767A = obj;
        if (this.f2803k0 == -100 && (obj instanceof Dialog) && (m27680d1 = m27680d1()) != null) {
            this.f2803k0 = m27680d1.m13677F().mo2920r();
        }
        if (this.f2803k0 == -100 && (num = (cd1Var = f2765y0).get(obj.getClass().getName())) != null) {
            this.f2803k0 = num.intValue();
            cd1Var.remove(obj.getClass().getName());
        }
        if (window != null) {
            m27687a0(window);
        }
        C1046d4.m24707h();
    }

    /* renamed from: s0 */
    public static Configuration m27660s0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                C0588m.m27643a(configuration, configuration2, configuration3);
            } else if (!pt0.m13160a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (i5 >= 26) {
                C0589n.m27639a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            C0586k.m27648b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* renamed from: A0 */
    public final Window.Callback m27716A0() {
        return this.f2769C.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27715B0() {
        mx1 mx1Var;
        AbstractC1643i0 abstractC1643i0;
        m27663p0();
        if (!this.f2790X || this.f2772F != null) {
            return;
        }
        Object obj = this.f2767A;
        if (!(obj instanceof Activity)) {
            if (obj instanceof Dialog) {
                mx1Var = new mx1((Dialog) this.f2767A);
            }
            abstractC1643i0 = this.f2772F;
            if (abstractC1643i0 == null) {
                abstractC1643i0.mo15691r(this.f2812t0);
                return;
            }
            return;
        }
        mx1Var = new mx1((Activity) this.f2767A, this.f2791Y);
        this.f2772F = mx1Var;
        abstractC1643i0 = this.f2772F;
        if (abstractC1643i0 == null) {
        }
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: C */
    public void mo2956C(Configuration configuration) {
        AbstractC1643i0 mo2915w;
        if (this.f2790X && this.f2784R && (mo2915w = mo2915w()) != null) {
            mo2915w.mo15693m(configuration);
        }
        C1046d4.m24713b().m24708g(this.f2768B);
        this.f2802j0 = new Configuration(this.f2768B.getResources().getConfiguration());
        m27693X(false);
    }

    /* renamed from: C0 */
    public final boolean m27714C0(C0597u c0597u) {
        View view = c0597u.f2850i;
        if (view != null) {
            c0597u.f2849h = view;
            return true;
        } else if (c0597u.f2851j == null) {
            return false;
        } else {
            if (this.f2777K == null) {
                this.f2777K = new C0598v();
            }
            View view2 = (View) c0597u.m27626a(this.f2777K);
            c0597u.f2849h = view2;
            return view2 != null;
        }
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: D */
    public void mo2955D(Bundle bundle) {
        this.f2799g0 = true;
        m27693X(false);
        m27662q0();
        Object obj = this.f2767A;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = as0.m27109c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AbstractC1643i0 m27698S0 = m27698S0();
                if (m27698S0 == null) {
                    this.f2812t0 = true;
                } else {
                    m27698S0.mo15691r(true);
                }
            }
            AbstractC3800z3.m2933e(this);
        }
        this.f2802j0 = new Configuration(this.f2768B.getResources().getConfiguration());
        this.f2800h0 = true;
    }

    /* renamed from: D0 */
    public final boolean m27713D0(C0597u c0597u) {
        c0597u.m27623d(m27659t0());
        c0597u.f2848g = new C0596t(c0597u.f2853l);
        c0597u.f2844c = 81;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // com.daaw.AbstractC3800z3
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2954E() {
        AbstractC1643i0 abstractC1643i0;
        if (this.f2767A instanceof Activity) {
            AbstractC3800z3.m2948K(this);
        }
        if (this.f2809q0) {
            this.f2769C.getDecorView().removeCallbacks(this.f2811s0);
        }
        this.f2801i0 = true;
        if (this.f2803k0 != -100) {
            Object obj = this.f2767A;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2765y0.put(this.f2767A.getClass().getName(), Integer.valueOf(this.f2803k0));
                abstractC1643i0 = this.f2772F;
                if (abstractC1643i0 != null) {
                    abstractC1643i0.mo20282n();
                }
                m27677f0();
            }
        }
        f2765y0.remove(this.f2767A.getClass().getName());
        abstractC1643i0 = this.f2772F;
        if (abstractC1643i0 != null) {
        }
        m27677f0();
    }

    /* renamed from: E0 */
    public final boolean m27712E0(C0597u c0597u) {
        Context context = this.f2768B;
        int i = c0597u.f2842a;
        if ((i == 0 || i == 108) && this.f2775I != null) {
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
                C0855bl c0855bl = new C0855bl(context, 0);
                c0855bl.getTheme().setTo(theme2);
                context = c0855bl;
            }
        }
        C0082e c0082e = new C0082e(context);
        c0082e.mo30169V(this);
        c0597u.m27624c(c0082e);
        return true;
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: F */
    public void mo2953F(Bundle bundle) {
        m27663p0();
    }

    /* renamed from: F0 */
    public final void m27711F0(int i) {
        this.f2810r0 = (1 << i) | this.f2810r0;
        if (this.f2809q0) {
            return;
        }
        xs1.m4718j0(this.f2769C.getDecorView(), this.f2811s0);
        this.f2809q0 = true;
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: G */
    public void mo2952G() {
        AbstractC1643i0 mo2915w = mo2915w();
        if (mo2915w != null) {
            mo2915w.mo15687v(true);
        }
    }

    /* renamed from: G0 */
    public boolean m27710G0() {
        return this.f2783Q;
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: H */
    public void mo2951H(Bundle bundle) {
    }

    /* renamed from: H0 */
    public int m27709H0(Context context, int i) {
        AbstractC0592q m27656w0;
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        m27656w0 = m27657v0(context);
                    }
                } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                } else {
                    m27656w0 = m27656w0(context);
                }
                return m27656w0.mo27630c();
            }
            return i;
        }
        return -1;
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: I */
    public void mo2950I() {
        m27693X(true);
    }

    /* renamed from: I0 */
    public boolean m27708I0() {
        AbstractC2228n0 abstractC2228n0 = this.f2778L;
        if (abstractC2228n0 != null) {
            abstractC2228n0.mo15648c();
            return true;
        }
        AbstractC1643i0 mo2915w = mo2915w();
        return mo2915w != null && mo2915w.mo15698g();
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: J */
    public void mo2949J() {
        AbstractC1643i0 mo2915w = mo2915w();
        if (mo2915w != null) {
            mo2915w.mo15687v(false);
        }
    }

    /* renamed from: J0 */
    public boolean m27707J0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.f2798f0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            m27706K0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: K0 */
    public final boolean m27706K0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C0597u m27654y0 = m27654y0(i, true);
            if (m27654y0.f2856o) {
                return false;
            }
            return m27696U0(m27654y0, keyEvent);
        }
        return false;
    }

    /* renamed from: L0 */
    public boolean m27705L0(int i, KeyEvent keyEvent) {
        AbstractC1643i0 mo2915w = mo2915w();
        if (mo2915w == null || !mo2915w.mo15692o(i, keyEvent)) {
            C0597u c0597u = this.f2797e0;
            if (c0597u != null && m27697T0(c0597u, keyEvent.getKeyCode(), keyEvent, 1)) {
                C0597u c0597u2 = this.f2797e0;
                if (c0597u2 != null) {
                    c0597u2.f2855n = true;
                }
                return true;
            }
            if (this.f2797e0 == null) {
                C0597u m27654y0 = m27654y0(0, true);
                m27696U0(m27654y0, keyEvent);
                boolean m27697T0 = m27697T0(m27654y0, keyEvent.getKeyCode(), keyEvent, 1);
                m27654y0.f2854m = false;
                if (m27697T0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: M */
    public boolean mo2946M(int i) {
        int m27694W0 = m27694W0(i);
        if (this.f2794b0 && m27694W0 == 108) {
            return false;
        }
        if (this.f2790X && m27694W0 == 1) {
            this.f2790X = false;
        }
        if (m27694W0 == 1) {
            m27682c1();
            this.f2794b0 = true;
            return true;
        } else if (m27694W0 == 2) {
            m27682c1();
            this.f2788V = true;
            return true;
        } else if (m27694W0 == 5) {
            m27682c1();
            this.f2789W = true;
            return true;
        } else if (m27694W0 == 10) {
            m27682c1();
            this.f2792Z = true;
            return true;
        } else if (m27694W0 == 108) {
            m27682c1();
            this.f2790X = true;
            return true;
        } else if (m27694W0 != 109) {
            return this.f2769C.requestFeature(m27694W0);
        } else {
            m27682c1();
            this.f2791Y = true;
            return true;
        }
    }

    /* renamed from: M0 */
    public boolean m27704M0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f2798f0;
            this.f2798f0 = false;
            C0597u m27654y0 = m27654y0(0, false);
            if (m27654y0 != null && m27654y0.f2856o) {
                if (!z) {
                    m27673h0(m27654y0, true);
                }
                return true;
            } else if (m27708I0()) {
                return true;
            }
        } else if (i == 82) {
            m27703N0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: N0 */
    public final boolean m27703N0(int i, KeyEvent keyEvent) {
        boolean z;
        AudioManager audioManager;
        InterfaceC1605hq interfaceC1605hq;
        if (this.f2778L != null) {
            return false;
        }
        boolean z2 = true;
        C0597u m27654y0 = m27654y0(i, true);
        if (i != 0 || (interfaceC1605hq = this.f2775I) == null || !interfaceC1605hq.mo20510d() || ViewConfiguration.get(this.f2768B).hasPermanentMenuKey()) {
            boolean z3 = m27654y0.f2856o;
            if (z3 || m27654y0.f2855n) {
                m27673h0(m27654y0, true);
                z2 = z3;
            } else {
                if (m27654y0.f2854m) {
                    if (m27654y0.f2859r) {
                        m27654y0.f2854m = false;
                        z = m27696U0(m27654y0, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        m27699R0(m27654y0, keyEvent);
                    }
                }
                z2 = false;
            }
        } else if (this.f2775I.mo20512b()) {
            z2 = this.f2775I.mo20508f();
        } else {
            if (!this.f2801i0 && m27696U0(m27654y0, keyEvent)) {
                z2 = this.f2775I.mo20507g();
            }
            z2 = false;
        }
        if (z2 && (audioManager = (AudioManager) this.f2768B.getApplicationContext().getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return z2;
    }

    /* renamed from: O0 */
    public void m27702O0(int i) {
        AbstractC1643i0 mo2915w;
        if (i != 108 || (mo2915w = mo2915w()) == null) {
            return;
        }
        mo2915w.mo15697h(true);
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: P */
    public void mo2943P(int i) {
        m27663p0();
        ViewGroup viewGroup = (ViewGroup) this.f2785S.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2768B).inflate(i, viewGroup);
        this.f2770D.m27637c(this.f2769C.getCallback());
    }

    /* renamed from: P0 */
    public void m27701P0(int i) {
        if (i == 108) {
            AbstractC1643i0 mo2915w = mo2915w();
            if (mo2915w != null) {
                mo2915w.mo15697h(false);
            }
        } else if (i == 0) {
            C0597u m27654y0 = m27654y0(i, true);
            if (m27654y0.f2856o) {
                m27673h0(m27654y0, false);
            }
        }
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: Q */
    public void mo2942Q(View view) {
        m27663p0();
        ViewGroup viewGroup = (ViewGroup) this.f2785S.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2770D.m27637c(this.f2769C.getCallback());
    }

    /* renamed from: Q0 */
    public void m27700Q0(ViewGroup viewGroup) {
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: R */
    public void mo2941R(View view, ViewGroup.LayoutParams layoutParams) {
        m27663p0();
        ViewGroup viewGroup = (ViewGroup) this.f2785S.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2770D.m27637c(this.f2769C.getCallback());
    }

    /* renamed from: R0 */
    public final void m27699R0(C0597u c0597u, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c0597u.f2856o || this.f2801i0) {
            return;
        }
        if (c0597u.f2842a == 0) {
            if ((this.f2768B.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback m27716A0 = m27716A0();
        if (m27716A0 != null && !m27716A0.onMenuOpened(c0597u.f2842a, c0597u.f2851j)) {
            m27673h0(c0597u, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f2768B.getSystemService("window");
        if (windowManager != null && m27696U0(c0597u, keyEvent)) {
            ViewGroup viewGroup = c0597u.f2848g;
            if (viewGroup == null || c0597u.f2858q) {
                if (viewGroup == null) {
                    if (!m27713D0(c0597u) || c0597u.f2848g == null) {
                        return;
                    }
                } else if (c0597u.f2858q && viewGroup.getChildCount() > 0) {
                    c0597u.f2848g.removeAllViews();
                }
                if (!m27714C0(c0597u) || !c0597u.m27625b()) {
                    c0597u.f2858q = true;
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = c0597u.f2849h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                c0597u.f2848g.setBackgroundResource(c0597u.f2843b);
                ViewParent parent = c0597u.f2849h.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c0597u.f2849h);
                }
                c0597u.f2848g.addView(c0597u.f2849h, layoutParams2);
                if (!c0597u.f2849h.hasFocus()) {
                    c0597u.f2849h.requestFocus();
                }
            } else {
                View view = c0597u.f2850i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                    c0597u.f2855n = false;
                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, c0597u.f2845d, c0597u.f2846e, 1002, 8519680, -3);
                    layoutParams3.gravity = c0597u.f2844c;
                    layoutParams3.windowAnimations = c0597u.f2847f;
                    windowManager.addView(c0597u.f2848g, layoutParams3);
                    c0597u.f2856o = true;
                }
            }
            i = -2;
            c0597u.f2855n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, c0597u.f2845d, c0597u.f2846e, 1002, 8519680, -3);
            layoutParams32.gravity = c0597u.f2844c;
            layoutParams32.windowAnimations = c0597u.f2847f;
            windowManager.addView(c0597u.f2848g, layoutParams32);
            c0597u.f2856o = true;
        }
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: S */
    public void mo2940S(Toolbar toolbar) {
        if (this.f2767A instanceof Activity) {
            AbstractC1643i0 mo2915w = mo2915w();
            if (mo2915w instanceof mx1) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f2773G = null;
            if (mo2915w != null) {
                mo2915w.mo20282n();
            }
            this.f2772F = null;
            if (toolbar != null) {
                dm1 dm1Var = new dm1(toolbar, m27653z0(), this.f2770D);
                this.f2772F = dm1Var;
                this.f2770D.m27635e(dm1Var.f7465c);
            } else {
                this.f2770D.m27635e(null);
            }
            mo2913y();
        }
    }

    /* renamed from: S0 */
    public final AbstractC1643i0 m27698S0() {
        return this.f2772F;
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: T */
    public void mo2939T(int i) {
        this.f2804l0 = i;
    }

    /* renamed from: T0 */
    public final boolean m27697T0(C0597u c0597u, int i, KeyEvent keyEvent, int i2) {
        C0082e c0082e;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0597u.f2854m || m27696U0(c0597u, keyEvent)) && (c0082e = c0597u.f2851j) != null) {
            z = c0082e.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f2775I == null) {
            m27673h0(c0597u, true);
        }
        return z;
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: U */
    public final void mo2938U(CharSequence charSequence) {
        this.f2774H = charSequence;
        InterfaceC1605hq interfaceC1605hq = this.f2775I;
        if (interfaceC1605hq != null) {
            interfaceC1605hq.setWindowTitle(charSequence);
        } else if (m27698S0() != null) {
            m27698S0().mo15684y(charSequence);
        } else {
            TextView textView = this.f2786T;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: U0 */
    public final boolean m27696U0(C0597u c0597u, KeyEvent keyEvent) {
        InterfaceC1605hq interfaceC1605hq;
        InterfaceC1605hq interfaceC1605hq2;
        InterfaceC1605hq interfaceC1605hq3;
        if (this.f2801i0) {
            return false;
        }
        if (c0597u.f2854m) {
            return true;
        }
        C0597u c0597u2 = this.f2797e0;
        if (c0597u2 != null && c0597u2 != c0597u) {
            m27673h0(c0597u2, false);
        }
        Window.Callback m27716A0 = m27716A0();
        if (m27716A0 != null) {
            c0597u.f2850i = m27716A0.onCreatePanelView(c0597u.f2842a);
        }
        int i = c0597u.f2842a;
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC1605hq3 = this.f2775I) != null) {
            interfaceC1605hq3.mo20511c();
        }
        if (c0597u.f2850i == null && (!z || !(m27698S0() instanceof dm1))) {
            C0082e c0082e = c0597u.f2851j;
            if (c0082e == null || c0597u.f2859r) {
                if (c0082e == null && (!m27712E0(c0597u) || c0597u.f2851j == null)) {
                    return false;
                }
                if (z && this.f2775I != null) {
                    if (this.f2776J == null) {
                        this.f2776J = new C0583i();
                    }
                    this.f2775I.mo20513a(c0597u.f2851j, this.f2776J);
                }
                c0597u.f2851j.m30234h0();
                if (!m27716A0.onCreatePanelMenu(c0597u.f2842a, c0597u.f2851j)) {
                    c0597u.m27624c(null);
                    if (z && (interfaceC1605hq = this.f2775I) != null) {
                        interfaceC1605hq.mo20513a(null, this.f2776J);
                    }
                    return false;
                }
                c0597u.f2859r = false;
            }
            c0597u.f2851j.m30234h0();
            Bundle bundle = c0597u.f2860s;
            if (bundle != null) {
                c0597u.f2851j.m30255R(bundle);
                c0597u.f2860s = null;
            }
            if (!m27716A0.onPreparePanel(0, c0597u.f2850i, c0597u.f2851j)) {
                if (z && (interfaceC1605hq2 = this.f2775I) != null) {
                    interfaceC1605hq2.mo20513a(null, this.f2776J);
                }
                c0597u.f2851j.m30235g0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            c0597u.f2857p = z2;
            c0597u.f2851j.setQwertyMode(z2);
            c0597u.f2851j.m30235g0();
        }
        c0597u.f2854m = true;
        c0597u.f2855n = false;
        this.f2797e0 = c0597u;
        return true;
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: V */
    public AbstractC2228n0 mo2937V(AbstractC2228n0.InterfaceC2229a interfaceC2229a) {
        InterfaceC3010t3 interfaceC3010t3;
        if (interfaceC2229a != null) {
            AbstractC2228n0 abstractC2228n0 = this.f2778L;
            if (abstractC2228n0 != null) {
                abstractC2228n0.mo15648c();
            }
            C0584j c0584j = new C0584j(interfaceC2229a);
            AbstractC1643i0 mo2915w = mo2915w();
            if (mo2915w != null) {
                AbstractC2228n0 mo15683z = mo2915w.mo15683z(c0584j);
                this.f2778L = mo15683z;
                if (mo15683z != null && (interfaceC3010t3 = this.f2771E) != null) {
                    interfaceC3010t3.mo9640j(mo15683z);
                }
            }
            if (this.f2778L == null) {
                this.f2778L = m27684b1(c0584j);
            }
            return this.f2778L;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: V0 */
    public final void m27695V0(boolean z) {
        InterfaceC1605hq interfaceC1605hq = this.f2775I;
        if (interfaceC1605hq == null || !interfaceC1605hq.mo20510d() || (ViewConfiguration.get(this.f2768B).hasPermanentMenuKey() && !this.f2775I.mo20509e())) {
            C0597u m27654y0 = m27654y0(0, true);
            m27654y0.f2858q = true;
            m27673h0(m27654y0, false);
            m27699R0(m27654y0, null);
            return;
        }
        Window.Callback m27716A0 = m27716A0();
        if (this.f2775I.mo20512b() && z) {
            this.f2775I.mo20508f();
            if (this.f2801i0) {
                return;
            }
            m27716A0.onPanelClosed(p21.f22364Z0, m27654y0(0, true).f2851j);
        } else if (m27716A0 == null || this.f2801i0) {
        } else {
            if (this.f2809q0 && (this.f2810r0 & 1) != 0) {
                this.f2769C.getDecorView().removeCallbacks(this.f2811s0);
                this.f2811s0.run();
            }
            C0597u m27654y02 = m27654y0(0, true);
            C0082e c0082e = m27654y02.f2851j;
            if (c0082e == null || m27654y02.f2859r || !m27716A0.onPreparePanel(0, m27654y02.f2850i, c0082e)) {
                return;
            }
            m27716A0.onMenuOpened(p21.f22364Z0, m27654y02.f2851j);
            this.f2775I.mo20507g();
        }
    }

    /* renamed from: W0 */
    public final int m27694W0(int i) {
        if (i == 8) {
            return p21.f22364Z0;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    /* renamed from: X */
    public final boolean m27693X(boolean z) {
        if (this.f2801i0) {
            return false;
        }
        int m27683c0 = m27683c0();
        boolean m27676f1 = m27676f1(m27709H0(this.f2768B, m27683c0), Build.VERSION.SDK_INT < 33 ? m27685b0(this.f2768B) : null, z);
        if (m27683c0 == 0) {
            m27656w0(this.f2768B).m27632e();
        } else {
            AbstractC0592q abstractC0592q = this.f2807o0;
            if (abstractC0592q != null) {
                abstractC0592q.m27633a();
            }
        }
        if (m27683c0 == 3) {
            m27657v0(this.f2768B).m27632e();
        } else {
            AbstractC0592q abstractC0592q2 = this.f2808p0;
            if (abstractC0592q2 != null) {
                abstractC0592q2.m27633a();
            }
        }
        return m27676f1;
    }

    /* renamed from: X0 */
    public void m27692X0(Configuration configuration, rk0 rk0Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            C0588m.m27640d(configuration, rk0Var);
            return;
        }
        C0586k.m27646d(configuration, rk0Var.m11224d(0));
        C0586k.m27647c(configuration, rk0Var.m11224d(0));
    }

    /* renamed from: Y */
    public boolean m27691Y() {
        return m27693X(true);
    }

    /* renamed from: Y0 */
    public void m27690Y0(rk0 rk0Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            C0588m.m27641c(rk0Var);
        } else {
            Locale.setDefault(rk0Var.m11224d(0));
        }
    }

    /* renamed from: Z */
    public final void m27689Z() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f2785S.findViewById(16908290);
        View decorView = this.f2769C.getDecorView();
        contentFrameLayout.m30061b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f2768B.obtainStyledAttributes(x21.f32003y0);
        obtainStyledAttributes.getValue(x21.f31809K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(x21.f31814L0, contentFrameLayout.getMinWidthMinor());
        int i = x21.f31799I0;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = x21.f31804J0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = x21.f31789G0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = x21.f31794H0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: Z0 */
    public final boolean m27688Z0() {
        ViewGroup viewGroup;
        return this.f2784R && (viewGroup = this.f2785S) != null && xs1.m4742V(viewGroup);
    }

    @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0083a
    /* renamed from: a */
    public boolean mo330a(C0082e c0082e, MenuItem menuItem) {
        C0597u m27661r0;
        Window.Callback m27716A0 = m27716A0();
        if (m27716A0 == null || this.f2801i0 || (m27661r0 = m27661r0(c0082e.mo30173F())) == null) {
            return false;
        }
        return m27716A0.onMenuItemSelected(m27661r0.f2842a, menuItem);
    }

    /* renamed from: a0 */
    public final void m27687a0(Window window) {
        if (this.f2769C != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C0590o) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C0590o c0590o = new C0590o(callback);
        this.f2770D = c0590o;
        window.setCallback(c0590o);
        ul1 m8038u = ul1.m8038u(this.f2768B, null, f2761A0);
        Drawable m8051h = m8038u.m8051h(0);
        if (m8051h != null) {
            window.setBackgroundDrawable(m8051h);
        }
        m8038u.m8036w();
        this.f2769C = window;
    }

    /* renamed from: a1 */
    public final boolean m27686a1(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f2769C.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || xs1.m4743U((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0083a
    /* renamed from: b */
    public void mo329b(C0082e c0082e) {
        m27695V0(true);
    }

    /* renamed from: b0 */
    public rk0 m27685b0(Context context) {
        rk0 m2917u;
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && (m2917u = AbstractC3800z3.m2917u()) != null) {
            rk0 m27655x0 = m27655x0(context.getApplicationContext().getResources().getConfiguration());
            rk0 m7097b = i >= 24 ? vk0.m7097b(m2917u, m27655x0) : m2917u.m11222f() ? rk0.m11223e() : rk0.m11225c(m2917u.m11224d(0).toString());
            return m7097b.m11222f() ? m27655x0 : m7097b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* renamed from: b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC2228n0 m27684b1(AbstractC2228n0.InterfaceC2229a interfaceC2229a) {
        AbstractC2228n0 abstractC2228n0;
        Context context;
        AbstractC2228n0 abstractC2228n02;
        InterfaceC3010t3 interfaceC3010t3;
        m27664o0();
        AbstractC2228n0 abstractC2228n03 = this.f2778L;
        if (abstractC2228n03 != null) {
            abstractC2228n03.mo15648c();
        }
        if (!(interfaceC2229a instanceof C0584j)) {
            interfaceC2229a = new C0584j(interfaceC2229a);
        }
        InterfaceC3010t3 interfaceC3010t32 = this.f2771E;
        if (interfaceC3010t32 != null && !this.f2801i0) {
            try {
                abstractC2228n0 = interfaceC3010t32.mo9639l(interfaceC2229a);
            } catch (AbstractMethodError unused) {
            }
            if (abstractC2228n0 == null) {
                this.f2778L = abstractC2228n0;
            } else {
                if (this.f2779M == null) {
                    if (this.f2793a0) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = this.f2768B.getTheme();
                        theme.resolveAttribute(x01.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = this.f2768B.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context = new C0855bl(this.f2768B, 0);
                            context.getTheme().setTo(newTheme);
                        } else {
                            context = this.f2768B;
                        }
                        this.f2779M = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, x01.actionModePopupWindowStyle);
                        this.f2780N = popupWindow;
                        hy0.m20330b(popupWindow, 2);
                        this.f2780N.setContentView(this.f2779M);
                        this.f2780N.setWidth(-1);
                        context.getTheme().resolveAttribute(x01.actionBarSize, typedValue, true);
                        this.f2779M.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f2780N.setHeight(-2);
                        this.f2781O = new RunnableC0579f();
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.f2785S.findViewById(o11.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(m27659t0()));
                            this.f2779M = (ActionBarContextView) viewStubCompat.m29941a();
                        }
                    }
                }
                if (this.f2779M != null) {
                    m27664o0();
                    this.f2779M.m30156k();
                    ff1 ff1Var = new ff1(this.f2779M.getContext(), this.f2779M, interfaceC2229a, this.f2780N == null);
                    if (interfaceC2229a.mo15630b(ff1Var, ff1Var.mo15646e())) {
                        ff1Var.mo15640k();
                        this.f2779M.m30159h(ff1Var);
                        this.f2778L = ff1Var;
                        if (m27688Z0()) {
                            this.f2779M.setAlpha(0.0f);
                            ut1 m7734b = xs1.m4729e(this.f2779M).m7734b(1.0f);
                            this.f2782P = m7734b;
                            m7734b.m7728h(new C0581g());
                        } else {
                            this.f2779M.setAlpha(1.0f);
                            this.f2779M.setVisibility(0);
                            if (this.f2779M.getParent() instanceof View) {
                                xs1.m4708o0((View) this.f2779M.getParent());
                            }
                        }
                        if (this.f2780N != null) {
                            this.f2769C.getDecorView().post(this.f2781O);
                        }
                    } else {
                        this.f2778L = null;
                    }
                }
            }
            abstractC2228n02 = this.f2778L;
            if (abstractC2228n02 != null && (interfaceC3010t3 = this.f2771E) != null) {
                interfaceC3010t3.mo9640j(abstractC2228n02);
            }
            return this.f2778L;
        }
        abstractC2228n0 = null;
        if (abstractC2228n0 == null) {
        }
        abstractC2228n02 = this.f2778L;
        if (abstractC2228n02 != null) {
            interfaceC3010t3.mo9640j(abstractC2228n02);
        }
        return this.f2778L;
    }

    /* renamed from: c0 */
    public final int m27683c0() {
        int i = this.f2803k0;
        return i != -100 ? i : AbstractC3800z3.m2921q();
    }

    /* renamed from: c1 */
    public final void m27682c1() {
        if (this.f2784R) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: d0 */
    public void m27681d0(int i, C0597u c0597u, Menu menu) {
        if (menu == null) {
            if (c0597u == null && i >= 0) {
                C0597u[] c0597uArr = this.f2796d0;
                if (i < c0597uArr.length) {
                    c0597u = c0597uArr[i];
                }
            }
            if (c0597u != null) {
                menu = c0597u.f2851j;
            }
        }
        if ((c0597u == null || c0597u.f2856o) && !this.f2801i0) {
            this.f2770D.m27636d(this.f2769C.getCallback(), i, menu);
        }
    }

    /* renamed from: d1 */
    public final ActivityC2508p3 m27680d1() {
        for (Context context = this.f2768B; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof ActivityC2508p3) {
                return (ActivityC2508p3) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: e0 */
    public void m27679e0(C0082e c0082e) {
        if (this.f2795c0) {
            return;
        }
        this.f2795c0 = true;
        this.f2775I.mo20505i();
        Window.Callback m27716A0 = m27716A0();
        if (m27716A0 != null && !this.f2801i0) {
            m27716A0.onPanelClosed(p21.f22364Z0, c0082e);
        }
        this.f2795c0 = false;
    }

    /* renamed from: e1 */
    public final void m27678e1(Configuration configuration) {
        Activity activity = (Activity) this.f2767A;
        if (activity instanceof sj0) {
            if (!((sj0) activity).mo2327a().mo29047b().m29049a(AbstractC0344c.EnumC0347c.CREATED)) {
                return;
            }
        } else if (!this.f2800h0 || this.f2801i0) {
            return;
        }
        activity.onConfigurationChanged(configuration);
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: f */
    public void mo2932f(View view, ViewGroup.LayoutParams layoutParams) {
        m27663p0();
        ((ViewGroup) this.f2785S.findViewById(16908290)).addView(view, layoutParams);
        this.f2770D.m27637c(this.f2769C.getCallback());
    }

    /* renamed from: f0 */
    public final void m27677f0() {
        AbstractC0592q abstractC0592q = this.f2807o0;
        if (abstractC0592q != null) {
            abstractC0592q.m27633a();
        }
        AbstractC0592q abstractC0592q2 = this.f2808p0;
        if (abstractC0592q2 != null) {
            abstractC0592q2.m27633a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* renamed from: f1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m27676f1(int i, rk0 rk0Var, boolean z) {
        boolean z2;
        Configuration m27671i0 = m27671i0(this.f2768B, i, rk0Var, null);
        int m27658u0 = m27658u0();
        Configuration configuration = this.f2802j0;
        if (configuration == null) {
            configuration = this.f2768B.getResources().getConfiguration();
        }
        int i2 = configuration.uiMode & 48;
        int i3 = m27671i0.uiMode & 48;
        rk0 m27655x0 = m27655x0(configuration);
        rk0 m27655x02 = rk0Var == null ? null : m27655x0(m27671i0);
        int i4 = i2 != i3 ? 512 : 0;
        if (m27655x02 != null && !m27655x0.equals(m27655x02)) {
            i4 = i4 | 4 | 8192;
        }
        boolean z3 = true;
        if (((m27658u0 ^ (-1)) & i4) != 0 && z && this.f2799g0 && (f2762B0 || this.f2800h0)) {
            Object obj = this.f2767A;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                C2670q0.m12828n((Activity) this.f2767A);
                z2 = true;
                if (!z2 || i4 == 0) {
                    z3 = z2;
                } else {
                    m27674g1(i3, m27655x02, (i4 & m27658u0) == i4, null);
                }
                if (z3) {
                    Object obj2 = this.f2767A;
                    if (obj2 instanceof ActivityC2508p3) {
                        if ((i4 & 512) != 0) {
                            ((ActivityC2508p3) obj2).m13672K(i);
                        }
                        if ((i4 & 4) != 0) {
                            ((ActivityC2508p3) this.f2767A).m13673J(rk0Var);
                        }
                    }
                }
                if (z3 && m27655x02 != null) {
                    m27690Y0(m27655x02);
                }
                return z3;
            }
        }
        z2 = false;
        if (z2) {
        }
        z3 = z2;
        if (z3) {
        }
        if (z3) {
            m27690Y0(m27655x02);
        }
        return z3;
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: g */
    public boolean mo2931g() {
        if (AbstractC3800z3.m2912z(this.f2768B) && AbstractC3800z3.m2917u() != null && !AbstractC3800z3.m2917u().equals(AbstractC3800z3.m2916v())) {
            m2929i(this.f2768B);
        }
        return m27693X(true);
    }

    /* renamed from: g0 */
    public void m27675g0(int i) {
        m27673h0(m27654y0(i, true), true);
    }

    /* renamed from: g1 */
    public final void m27674g1(int i, rk0 rk0Var, boolean z, Configuration configuration) {
        Resources resources = this.f2768B.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        if (rk0Var != null) {
            m27692X0(configuration2, rk0Var);
        }
        resources.updateConfiguration(configuration2, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            m51.m16209a(resources);
        }
        int i3 = this.f2804l0;
        if (i3 != 0) {
            this.f2768B.setTheme(i3);
            if (i2 >= 23) {
                this.f2768B.getTheme().applyStyle(this.f2804l0, true);
            }
        }
        if (z && (this.f2767A instanceof Activity)) {
            m27678e1(configuration2);
        }
    }

    /* renamed from: h0 */
    public void m27673h0(C0597u c0597u, boolean z) {
        ViewGroup viewGroup;
        InterfaceC1605hq interfaceC1605hq;
        if (z && c0597u.f2842a == 0 && (interfaceC1605hq = this.f2775I) != null && interfaceC1605hq.mo20512b()) {
            m27679e0(c0597u.f2851j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f2768B.getSystemService("window");
        if (windowManager != null && c0597u.f2856o && (viewGroup = c0597u.f2848g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m27681d0(c0597u.f2842a, c0597u, null);
            }
        }
        c0597u.f2854m = false;
        c0597u.f2855n = false;
        c0597u.f2856o = false;
        c0597u.f2849h = null;
        c0597u.f2858q = true;
        if (this.f2797e0 == c0597u) {
            this.f2797e0 = null;
        }
    }

    /* renamed from: h1 */
    public final int m27672h1(px1 px1Var, Rect rect) {
        boolean z;
        boolean z2;
        int m12949l = px1Var != null ? px1Var.m12949l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f2779M;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2779M.getLayoutParams();
            if (this.f2779M.isShown()) {
                if (this.f2813u0 == null) {
                    this.f2813u0 = new Rect();
                    this.f2814v0 = new Rect();
                }
                Rect rect2 = this.f2813u0;
                Rect rect3 = this.f2814v0;
                if (px1Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(px1Var.m12951j(), px1Var.m12949l(), px1Var.m12950k(), px1Var.m12952i());
                }
                hu1.m20418a(this.f2785S, rect2, rect3);
                int i = rect2.top;
                int i2 = rect2.left;
                int i3 = rect2.right;
                px1 m4754L = xs1.m4754L(this.f2785S);
                int m12951j = m4754L == null ? 0 : m4754L.m12951j();
                int m12950k = m4754L == null ? 0 : m4754L.m12950k();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || this.f2787U != null) {
                    View view = this.f2787U;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != m12951j || marginLayoutParams2.rightMargin != m12950k) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = m12951j;
                            marginLayoutParams2.rightMargin = m12950k;
                            this.f2787U.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f2768B);
                    this.f2787U = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m12951j;
                    layoutParams.rightMargin = m12950k;
                    this.f2785S.addView(this.f2787U, -1, layoutParams);
                }
                View view3 = this.f2787U;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    m27670i1(this.f2787U);
                }
                if (!this.f2792Z && r5) {
                    m12949l = 0;
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
                this.f2779M.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f2787U;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return m12949l;
    }

    /* renamed from: i0 */
    public final Configuration m27671i0(Context context, int i, rk0 rk0Var, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (rk0Var != null) {
            m27692X0(configuration2, rk0Var);
        }
        return configuration2;
    }

    /* renamed from: i1 */
    public final void m27670i1(View view) {
        Context context;
        int i;
        if ((xs1.m4749O(view) & 8192) != 0) {
            context = this.f2768B;
            i = b11.abc_decor_view_status_guard_light;
        } else {
            context = this.f2768B;
            i = b11.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(C3866zk.m2180c(context, i));
    }

    /* renamed from: j0 */
    public final ViewGroup m27669j0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f2768B.obtainStyledAttributes(x21.f32003y0);
        int i = x21.f31774D0;
        if (!obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(x21.f31819M0, false)) {
            mo2946M(1);
        } else if (obtainStyledAttributes.getBoolean(i, false)) {
            mo2946M(p21.f22364Z0);
        }
        if (obtainStyledAttributes.getBoolean(x21.f31779E0, false)) {
            mo2946M(109);
        }
        if (obtainStyledAttributes.getBoolean(x21.f31784F0, false)) {
            mo2946M(10);
        }
        this.f2793a0 = obtainStyledAttributes.getBoolean(x21.f32008z0, false);
        obtainStyledAttributes.recycle();
        m27662q0();
        this.f2769C.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f2768B);
        if (this.f2794b0) {
            viewGroup = (ViewGroup) from.inflate(this.f2792Z ? c21.abc_screen_simple_overlay_action_mode : c21.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2793a0) {
            viewGroup = (ViewGroup) from.inflate(c21.abc_dialog_title_material, (ViewGroup) null);
            this.f2791Y = false;
            this.f2790X = false;
        } else if (this.f2790X) {
            TypedValue typedValue = new TypedValue();
            this.f2768B.getTheme().resolveAttribute(x01.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0855bl(this.f2768B, typedValue.resourceId) : this.f2768B).inflate(c21.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC1605hq interfaceC1605hq = (InterfaceC1605hq) viewGroup.findViewById(o11.decor_content_parent);
            this.f2775I = interfaceC1605hq;
            interfaceC1605hq.setWindowCallback(m27716A0());
            if (this.f2791Y) {
                this.f2775I.mo20506h(109);
            }
            if (this.f2788V) {
                this.f2775I.mo20506h(2);
            }
            if (this.f2789W) {
                this.f2775I.mo20506h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2790X + ", windowActionBarOverlay: " + this.f2791Y + ", android:windowIsFloating: " + this.f2793a0 + ", windowActionModeOverlay: " + this.f2792Z + ", windowNoTitle: " + this.f2794b0 + " }");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            xs1.m4769D0(viewGroup, new C0576c());
        } else if (viewGroup instanceof InterfaceC0162a) {
            ((InterfaceC0162a) viewGroup).setOnFitSystemWindowsListener(new C0577d());
        }
        if (this.f2775I == null) {
            this.f2786T = (TextView) viewGroup.findViewById(o11.title);
        }
        hu1.m20416c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(o11.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2769C.findViewById(16908290);
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
        this.f2769C.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0578e());
        return viewGroup;
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: k */
    public Context mo2927k(Context context) {
        this.f2799g0 = true;
        int m27709H0 = m27709H0(context, m27683c0());
        if (AbstractC3800z3.m2912z(context)) {
            AbstractC3800z3.m2936W(context);
        }
        rk0 m27685b0 = m27685b0(context);
        if (f2763C0 && (context instanceof ContextThemeWrapper)) {
            try {
                C0595s.m27628a((ContextThemeWrapper) context, m27671i0(context, m27709H0, m27685b0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C0855bl) {
            try {
                ((C0855bl) context).m26079a(m27671i0(context, m27709H0, m27685b0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (f2762B0) {
            Configuration configuration = new Configuration();
            configuration.uiMode = -1;
            configuration.fontScale = 0.0f;
            Configuration configuration2 = C0586k.m27649a(context, configuration).getResources().getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            configuration2.uiMode = configuration3.uiMode;
            Configuration m27671i0 = m27671i0(context, m27709H0, m27685b0, configuration2.equals(configuration3) ? null : m27660s0(configuration2, configuration3));
            C0855bl c0855bl = new C0855bl(context, l21.Theme_AppCompat_Empty);
            c0855bl.m26079a(m27671i0);
            boolean z = false;
            try {
                z = context.getTheme() != null;
            } catch (NullPointerException unused3) {
            }
            if (z) {
                j51.C1795g.m18874a(c0855bl.getTheme());
            }
            return super.mo2927k(c0855bl);
        }
        return super.mo2927k(context);
    }

    /* renamed from: k0 */
    public View m27668k0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        C3809z4 c3809z4;
        boolean z2 = false;
        if (this.f2815w0 == null) {
            String string = this.f2768B.obtainStyledAttributes(x21.f32003y0).getString(x21.f31769C0);
            if (string == null) {
                c3809z4 = new C3809z4();
            } else {
                try {
                    this.f2815w0 = (C3809z4) this.f2768B.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    c3809z4 = new C3809z4();
                }
            }
            this.f2815w0 = c3809z4;
        }
        boolean z3 = f2766z0;
        if (z3) {
            if (this.f2816x0 == null) {
                this.f2816x0 = new ui0();
            }
            if (this.f2816x0.m8121a(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z2 = m27686a1((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z2 = true;
                }
                z = z2;
            }
        } else {
            z = false;
        }
        return this.f2815w0.m2835r(view, str, context, attributeSet, z, z3, true, hs1.m20440c());
    }

    /* renamed from: l0 */
    public void m27667l0() {
        C0082e c0082e;
        InterfaceC1605hq interfaceC1605hq = this.f2775I;
        if (interfaceC1605hq != null) {
            interfaceC1605hq.mo20505i();
        }
        if (this.f2780N != null) {
            this.f2769C.getDecorView().removeCallbacks(this.f2781O);
            if (this.f2780N.isShowing()) {
                try {
                    this.f2780N.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f2780N = null;
        }
        m27664o0();
        C0597u m27654y0 = m27654y0(0, false);
        if (m27654y0 == null || (c0082e = m27654y0.f2851j) == null) {
            return;
        }
        c0082e.close();
    }

    /* renamed from: m0 */
    public boolean m27666m0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f2767A;
        if (((obj instanceof ii0.InterfaceC1709a) || (obj instanceof DialogC0913c4)) && (decorView = this.f2769C.getDecorView()) != null && ii0.m19783d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f2770D.m27638b(this.f2769C.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m27707J0(keyCode, keyEvent) : m27704M0(keyCode, keyEvent);
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: n */
    public <T extends View> T mo2924n(int i) {
        m27663p0();
        return (T) this.f2769C.findViewById(i);
    }

    /* renamed from: n0 */
    public void m27665n0(int i) {
        C0597u m27654y0;
        C0597u m27654y02 = m27654y0(i, true);
        if (m27654y02.f2851j != null) {
            Bundle bundle = new Bundle();
            m27654y02.f2851j.m30253T(bundle);
            if (bundle.size() > 0) {
                m27654y02.f2860s = bundle;
            }
            m27654y02.f2851j.m30234h0();
            m27654y02.f2851j.clear();
        }
        m27654y02.f2859r = true;
        m27654y02.f2858q = true;
        if ((i != 108 && i != 0) || this.f2775I == null || (m27654y0 = m27654y0(0, false)) == null) {
            return;
        }
        m27654y0.f2854m = false;
        m27696U0(m27654y0, null);
    }

    /* renamed from: o0 */
    public void m27664o0() {
        ut1 ut1Var = this.f2782P;
        if (ut1Var != null) {
            ut1Var.m7733c();
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m27668k0(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: p */
    public Context mo2922p() {
        return this.f2768B;
    }

    /* renamed from: p0 */
    public final void m27663p0() {
        if (this.f2784R) {
            return;
        }
        this.f2785S = m27669j0();
        CharSequence m27653z0 = m27653z0();
        if (!TextUtils.isEmpty(m27653z0)) {
            InterfaceC1605hq interfaceC1605hq = this.f2775I;
            if (interfaceC1605hq != null) {
                interfaceC1605hq.setWindowTitle(m27653z0);
            } else if (m27698S0() != null) {
                m27698S0().mo15684y(m27653z0);
            } else {
                TextView textView = this.f2786T;
                if (textView != null) {
                    textView.setText(m27653z0);
                }
            }
        }
        m27689Z();
        m27700Q0(this.f2785S);
        this.f2784R = true;
        C0597u m27654y0 = m27654y0(0, false);
        if (this.f2801i0) {
            return;
        }
        if (m27654y0 == null || m27654y0.f2851j == null) {
            m27711F0(p21.f22364Z0);
        }
    }

    /* renamed from: q0 */
    public final void m27662q0() {
        if (this.f2769C == null) {
            Object obj = this.f2767A;
            if (obj instanceof Activity) {
                m27687a0(((Activity) obj).getWindow());
            }
        }
        if (this.f2769C == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: r */
    public int mo2920r() {
        return this.f2803k0;
    }

    /* renamed from: r0 */
    public C0597u m27661r0(Menu menu) {
        C0597u[] c0597uArr = this.f2796d0;
        int length = c0597uArr != null ? c0597uArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0597u c0597u = c0597uArr[i];
            if (c0597u != null && c0597u.f2851j == menu) {
                return c0597u;
            }
        }
        return null;
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: t */
    public MenuInflater mo2918t() {
        if (this.f2773G == null) {
            m27715B0();
            AbstractC1643i0 abstractC1643i0 = this.f2772F;
            this.f2773G = new gi1(abstractC1643i0 != null ? abstractC1643i0.mo15695j() : this.f2768B);
        }
        return this.f2773G;
    }

    /* renamed from: t0 */
    public final Context m27659t0() {
        AbstractC1643i0 mo2915w = mo2915w();
        Context mo15695j = mo2915w != null ? mo2915w.mo15695j() : null;
        return mo15695j == null ? this.f2768B : mo15695j;
    }

    /* renamed from: u0 */
    public final int m27658u0() {
        if (!this.f2806n0 && (this.f2767A instanceof Activity)) {
            PackageManager packageManager = this.f2768B.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f2768B, this.f2767A.getClass()), i >= 29 ? 269221888 : i >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.f2805m0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.f2805m0 = 0;
            }
        }
        this.f2806n0 = true;
        return this.f2805m0;
    }

    /* renamed from: v0 */
    public final AbstractC0592q m27657v0(Context context) {
        if (this.f2808p0 == null) {
            this.f2808p0 = new C0591p(context);
        }
        return this.f2808p0;
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: w */
    public AbstractC1643i0 mo2915w() {
        m27715B0();
        return this.f2772F;
    }

    /* renamed from: w0 */
    public final AbstractC0592q m27656w0(Context context) {
        if (this.f2807o0 == null) {
            this.f2807o0 = new C0594r(po1.m13258a(context));
        }
        return this.f2807o0;
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: x */
    public void mo2914x() {
        LayoutInflater from = LayoutInflater.from(this.f2768B);
        if (from.getFactory() == null) {
            vi0.m7139b(from, this);
        } else {
            boolean z = from.getFactory2() instanceof LayoutInflater$Factory2C0573a4;
        }
    }

    /* renamed from: x0 */
    public rk0 m27655x0(Configuration configuration) {
        int i = Build.VERSION.SDK_INT;
        return i >= 24 ? C0588m.m27642b(configuration) : i >= 21 ? rk0.m11225c(C0587l.m27644b(configuration.locale)) : rk0.m11227a(configuration.locale);
    }

    @Override // com.daaw.AbstractC3800z3
    /* renamed from: y */
    public void mo2913y() {
        if (m27698S0() == null || mo2915w().mo20283k()) {
            return;
        }
        m27711F0(0);
    }

    /* renamed from: y0 */
    public C0597u m27654y0(int i, boolean z) {
        C0597u[] c0597uArr = this.f2796d0;
        if (c0597uArr == null || c0597uArr.length <= i) {
            C0597u[] c0597uArr2 = new C0597u[i + 1];
            if (c0597uArr != null) {
                System.arraycopy(c0597uArr, 0, c0597uArr2, 0, c0597uArr.length);
            }
            this.f2796d0 = c0597uArr2;
            c0597uArr = c0597uArr2;
        }
        C0597u c0597u = c0597uArr[i];
        if (c0597u == null) {
            C0597u c0597u2 = new C0597u(i);
            c0597uArr[i] = c0597u2;
            return c0597u2;
        }
        return c0597u;
    }

    /* renamed from: z0 */
    public final CharSequence m27653z0() {
        Object obj = this.f2767A;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2774H;
    }
}
