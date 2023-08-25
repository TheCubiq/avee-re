package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0051a;
import androidx.fragment.app.AbstractC0305e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.C0349e;
import com.daaw.C2670q0;
import com.daaw.k81;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class p30 extends ComponentActivity implements C2670q0.InterfaceC2674d, C2670q0.InterfaceC2676f {

    /* renamed from: H */
    public boolean f22564H;

    /* renamed from: I */
    public boolean f22565I;

    /* renamed from: F */
    public final t30 f22562F = t30.m9637b(new C2513c());

    /* renamed from: G */
    public final C0349e f22563G = new C0349e(this);

    /* renamed from: J */
    public boolean f22566J = true;

    /* renamed from: com.daaw.p30$a */
    /* loaded from: classes.dex */
    public class C2511a implements k81.InterfaceC1922c {
        public C2511a() {
        }

        @Override // com.daaw.k81.InterfaceC1922c
        /* renamed from: a */
        public Bundle mo5117a() {
            Bundle bundle = new Bundle();
            p30.this.m13653z();
            p30.this.f22563G.m29041h(AbstractC0344c.EnumC0346b.ON_STOP);
            Parcelable m9615x = p30.this.f22562F.m9615x();
            if (m9615x != null) {
                bundle.putParcelable("android:support:fragments", m9615x);
            }
            return bundle;
        }
    }

    /* renamed from: com.daaw.p30$b */
    /* loaded from: classes.dex */
    public class C2512b implements eu0 {
        public C2512b() {
        }

        @Override // com.daaw.eu0
        /* renamed from: a */
        public void mo6068a(Context context) {
            p30.this.f22562F.m9638a(null);
            Bundle m17972b = p30.this.mo16178i().m17972b("android:support:fragments");
            if (m17972b != null) {
                p30.this.f22562F.m9616w(m17972b.getParcelable("android:support:fragments"));
            }
        }
    }

    /* renamed from: com.daaw.p30$c */
    /* loaded from: classes.dex */
    public class C2513c extends AbstractC0305e<p30> implements nt1, yt0, InterfaceC3790z0, w30 {
        public C2513c() {
            super(p30.this);
        }

        @Override // com.daaw.sj0
        /* renamed from: a */
        public AbstractC0344c mo2327a() {
            return p30.this.f22563G;
        }

        @Override // com.daaw.w30
        /* renamed from: b */
        public void mo6558b(FragmentManager fragmentManager, Fragment fragment) {
            p30.this.m13660B(fragment);
        }

        @Override // com.daaw.yt0
        /* renamed from: c */
        public OnBackPressedDispatcher mo3233c() {
            return p30.this.mo3233c();
        }

        @Override // com.daaw.InterfaceC3790z0
        /* renamed from: e */
        public AbstractC0051a mo3011e() {
            return p30.this.mo3011e();
        }

        @Override // androidx.fragment.app.AbstractC0305e, com.daaw.r30
        /* renamed from: f */
        public View mo11810f(int i) {
            return p30.this.findViewById(i);
        }

        @Override // com.daaw.nt1
        /* renamed from: g */
        public mt1 mo13652g() {
            return p30.this.mo13652g();
        }

        @Override // androidx.fragment.app.AbstractC0305e, com.daaw.r30
        /* renamed from: h */
        public boolean mo11809h() {
            Window window = p30.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.AbstractC0305e
        /* renamed from: n */
        public LayoutInflater mo13650n() {
            return p30.this.getLayoutInflater().cloneInContext(p30.this);
        }

        @Override // androidx.fragment.app.AbstractC0305e
        /* renamed from: o */
        public boolean mo13649o(Fragment fragment) {
            return !p30.this.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC0305e
        /* renamed from: q */
        public void mo13648q() {
            p30.this.mo13657E();
        }

        @Override // androidx.fragment.app.AbstractC0305e
        /* renamed from: r */
        public p30 mo13651m() {
            return p30.this;
        }
    }

    public p30() {
        m13654y();
    }

    /* renamed from: A */
    public static boolean m13661A(FragmentManager fragmentManager, AbstractC0344c.EnumC0347c enumC0347c) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.m29290r0()) {
            if (fragment != null) {
                if (fragment.m29495C() != null) {
                    z |= m13661A(fragment.m29408t(), enumC0347c);
                }
                c40 c40Var = fragment.f1388i0;
                if (c40Var != null && c40Var.mo2327a().mo29047b().m29049a(AbstractC0344c.EnumC0347c.STARTED)) {
                    fragment.f1388i0.m25633k(enumC0347c);
                    z = true;
                }
                if (fragment.f1387h0.mo29047b().m29049a(AbstractC0344c.EnumC0347c.STARTED)) {
                    fragment.f1387h0.m29034o(enumC0347c);
                    z = true;
                }
            }
        }
        return z;
    }

    @Deprecated
    /* renamed from: B */
    public void m13660B(Fragment fragment) {
    }

    @Deprecated
    /* renamed from: C */
    public boolean m13659C(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* renamed from: D */
    public void m13658D() {
        this.f22563G.m29041h(AbstractC0344c.EnumC0346b.ON_RESUME);
        this.f22562F.m9623p();
    }

    @Deprecated
    /* renamed from: E */
    public void mo13657E() {
        invalidateOptionsMenu();
    }

    @Override // com.daaw.C2670q0.InterfaceC2676f
    @Deprecated
    /* renamed from: b */
    public final void mo12817b(int i) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f22564H);
        printWriter.print(" mResumed=");
        printWriter.print(this.f22565I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f22566J);
        if (getApplication() != null) {
            mk0.m15994b(this).mo15138a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f22562F.m9619t().m29346W(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f22562F.m9618u();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f22562F.m9618u();
        super.onConfigurationChanged(configuration);
        this.f22562F.m9635d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, com.daaw.ActivityC3839zh, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22563G.m29041h(AbstractC0344c.EnumC0346b.ON_CREATE);
        this.f22562F.m9633f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f22562F.m9632g(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View m13656w = m13656w(view, str, context, attributeSet);
        return m13656w == null ? super.onCreateView(view, str, context, attributeSet) : m13656w;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View m13656w = m13656w(null, str, context, attributeSet);
        return m13656w == null ? super.onCreateView(str, context, attributeSet) : m13656w;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f22562F.m9631h();
        this.f22563G.m29041h(AbstractC0344c.EnumC0346b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f22562F.m9630i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            if (i != 6) {
                return false;
            }
            return this.f22562F.m9634e(menuItem);
        }
        return this.f22562F.m9628k(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f22562F.m9629j(z);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f22562F.m9618u();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f22562F.m9627l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f22565I = false;
        this.f22562F.m9626m();
        this.f22563G.m29041h(AbstractC0344c.EnumC0346b.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f22562F.m9625n(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m13658D();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? m13659C(view, menu) | this.f22562F.m9624o(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f22562F.m9618u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f22562F.m9618u();
        super.onResume();
        this.f22565I = true;
        this.f22562F.m9620s();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.f22562F.m9618u();
        super.onStart();
        this.f22566J = false;
        if (!this.f22564H) {
            this.f22564H = true;
            this.f22562F.m9636c();
        }
        this.f22562F.m9620s();
        this.f22563G.m29041h(AbstractC0344c.EnumC0346b.ON_START);
        this.f22562F.m9622q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f22562F.m9618u();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f22566J = true;
        m13653z();
        this.f22562F.m9621r();
        this.f22563G.m29041h(AbstractC0344c.EnumC0346b.ON_STOP);
    }

    /* renamed from: w */
    public final View m13656w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f22562F.m9617v(view, str, context, attributeSet);
    }

    /* renamed from: x */
    public FragmentManager m13655x() {
        return this.f22562F.m9619t();
    }

    /* renamed from: y */
    public final void m13654y() {
        mo16178i().m17966h("android:support:fragments", new C2511a());
        m30383p(new C2512b());
    }

    /* renamed from: z */
    public void m13653z() {
        do {
        } while (m13661A(m13655x(), AbstractC0344c.EnumC0347c.CREATED));
    }
}
