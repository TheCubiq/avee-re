package com.daaw;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
/* loaded from: classes.dex */
public class t30 {
    public final androidx.fragment.app.e<?> a;

    public t30(androidx.fragment.app.e<?> eVar) {
        this.a = eVar;
    }

    public static t30 b(androidx.fragment.app.e<?> eVar) {
        return new t30((androidx.fragment.app.e) ty0.g(eVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        androidx.fragment.app.e<?> eVar = this.a;
        eVar.t.j(eVar, eVar, fragment);
    }

    public void c() {
        this.a.t.y();
    }

    public void d(Configuration configuration) {
        this.a.t.A(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.a.t.B(menuItem);
    }

    public void f() {
        this.a.t.C();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.a.t.D(menu, menuInflater);
    }

    public void h() {
        this.a.t.E();
    }

    public void i() {
        this.a.t.G();
    }

    public void j(boolean z) {
        this.a.t.H(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.a.t.J(menuItem);
    }

    public void l(Menu menu) {
        this.a.t.K(menu);
    }

    public void m() {
        this.a.t.M();
    }

    public void n(boolean z) {
        this.a.t.N(z);
    }

    public boolean o(Menu menu) {
        return this.a.t.O(menu);
    }

    public void p() {
        this.a.t.Q();
    }

    public void q() {
        this.a.t.R();
    }

    public void r() {
        this.a.t.T();
    }

    public boolean s() {
        return this.a.t.a0(true);
    }

    public FragmentManager t() {
        return this.a.t;
    }

    public void u() {
        this.a.t.Q0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.t.t0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        androidx.fragment.app.e<?> eVar = this.a;
        if (!(eVar instanceof nt1)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        eVar.t.c1(parcelable);
    }

    public Parcelable x() {
        return this.a.t.e1();
    }
}
