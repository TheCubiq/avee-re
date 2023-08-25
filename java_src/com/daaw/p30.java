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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.c;
import com.daaw.k81;
import com.daaw.q0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class p30 extends ComponentActivity implements q0.d, q0.f {
    public boolean H;
    public boolean I;
    public final t30 F = t30.b(new c());
    public final androidx.lifecycle.e G = new androidx.lifecycle.e(this);
    public boolean J = true;

    /* loaded from: classes.dex */
    public class a implements k81.c {
        public a() {
        }

        @Override // com.daaw.k81.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            p30.this.z();
            p30.this.G.h(c.b.ON_STOP);
            Parcelable x = p30.this.F.x();
            if (x != null) {
                bundle.putParcelable("android:support:fragments", x);
            }
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public class b implements eu0 {
        public b() {
        }

        @Override // com.daaw.eu0
        public void a(Context context) {
            p30.this.F.a(null);
            Bundle b = p30.this.i().b("android:support:fragments");
            if (b != null) {
                p30.this.F.w(b.getParcelable("android:support:fragments"));
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends androidx.fragment.app.e<p30> implements nt1, yt0, z0, w30 {
        public c() {
            super(p30.this);
        }

        @Override // com.daaw.sj0
        public androidx.lifecycle.c a() {
            return p30.this.G;
        }

        @Override // com.daaw.w30
        public void b(FragmentManager fragmentManager, Fragment fragment) {
            p30.this.B(fragment);
        }

        @Override // com.daaw.yt0
        public OnBackPressedDispatcher c() {
            return p30.this.c();
        }

        @Override // com.daaw.z0
        public androidx.activity.result.a e() {
            return p30.this.e();
        }

        @Override // androidx.fragment.app.e, com.daaw.r30
        public View f(int i) {
            return p30.this.findViewById(i);
        }

        @Override // com.daaw.nt1
        public mt1 g() {
            return p30.this.g();
        }

        @Override // androidx.fragment.app.e, com.daaw.r30
        public boolean h() {
            Window window = p30.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.e
        public LayoutInflater n() {
            return p30.this.getLayoutInflater().cloneInContext(p30.this);
        }

        @Override // androidx.fragment.app.e
        public boolean o(Fragment fragment) {
            return !p30.this.isFinishing();
        }

        @Override // androidx.fragment.app.e
        public void q() {
            p30.this.E();
        }

        @Override // androidx.fragment.app.e
        /* renamed from: r */
        public p30 m() {
            return p30.this;
        }
    }

    public p30() {
        y();
    }

    public static boolean A(FragmentManager fragmentManager, c.EnumC0020c enumC0020c) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.r0()) {
            if (fragment != null) {
                if (fragment.C() != null) {
                    z |= A(fragment.t(), enumC0020c);
                }
                c40 c40Var = fragment.i0;
                if (c40Var != null && c40Var.a().b().a(c.EnumC0020c.STARTED)) {
                    fragment.i0.k(enumC0020c);
                    z = true;
                }
                if (fragment.h0.b().a(c.EnumC0020c.STARTED)) {
                    fragment.h0.o(enumC0020c);
                    z = true;
                }
            }
        }
        return z;
    }

    @Deprecated
    public void B(Fragment fragment) {
    }

    @Deprecated
    public boolean C(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void D() {
        this.G.h(c.b.ON_RESUME);
        this.F.p();
    }

    @Deprecated
    public void E() {
        invalidateOptionsMenu();
    }

    @Override // com.daaw.q0.f
    @Deprecated
    public final void b(int i) {
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
        printWriter.print(this.H);
        printWriter.print(" mResumed=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        if (getApplication() != null) {
            mk0.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.F.t().W(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.F.u();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.F.u();
        super.onConfigurationChanged(configuration);
        this.F.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, com.daaw.zh, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.G.h(c.b.ON_CREATE);
        this.F.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.F.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View w = w(view, str, context, attributeSet);
        return w == null ? super.onCreateView(view, str, context, attributeSet) : w;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View w = w(null, str, context, attributeSet);
        return w == null ? super.onCreateView(str, context, attributeSet) : w;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.F.h();
        this.G.h(c.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.F.i();
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
            return this.F.e(menuItem);
        }
        return this.F.k(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.F.j(z);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.F.u();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.F.l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.I = false;
        this.F.m();
        this.G.h(c.b.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.F.n(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        D();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? C(view, menu) | this.F.o(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.F.u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.F.u();
        super.onResume();
        this.I = true;
        this.F.s();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.F.u();
        super.onStart();
        this.J = false;
        if (!this.H) {
            this.H = true;
            this.F.c();
        }
        this.F.s();
        this.G.h(c.b.ON_START);
        this.F.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.F.u();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.J = true;
        z();
        this.F.r();
        this.G.h(c.b.ON_STOP);
    }

    public final View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.F.v(view, str, context, attributeSet);
    }

    public FragmentManager x() {
        return this.F.t();
    }

    public final void y() {
        i().h("android:support:fragments", new a());
        p(new b());
    }

    public void z() {
        do {
        } while (A(x(), c.EnumC0020c.CREATED));
    }
}
