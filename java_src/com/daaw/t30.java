package com.daaw;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.AbstractC0305e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
/* loaded from: classes.dex */
public class t30 {

    /* renamed from: a */
    public final AbstractC0305e<?> f26951a;

    public t30(AbstractC0305e<?> abstractC0305e) {
        this.f26951a = abstractC0305e;
    }

    /* renamed from: b */
    public static t30 m9637b(AbstractC0305e<?> abstractC0305e) {
        return new t30((AbstractC0305e) ty0.m8698g(abstractC0305e, "callbacks == null"));
    }

    /* renamed from: a */
    public void m9638a(Fragment fragment) {
        AbstractC0305e<?> abstractC0305e = this.f26951a;
        abstractC0305e.f1593t.m29311j(abstractC0305e, abstractC0305e, fragment);
    }

    /* renamed from: c */
    public void m9636c() {
        this.f26951a.f1593t.m29277y();
    }

    /* renamed from: d */
    public void m9635d(Configuration configuration) {
        this.f26951a.f1593t.m29390A(configuration);
    }

    /* renamed from: e */
    public boolean m9634e(MenuItem menuItem) {
        return this.f26951a.f1593t.m29388B(menuItem);
    }

    /* renamed from: f */
    public void m9633f() {
        this.f26951a.f1593t.m29386C();
    }

    /* renamed from: g */
    public boolean m9632g(Menu menu, MenuInflater menuInflater) {
        return this.f26951a.f1593t.m29384D(menu, menuInflater);
    }

    /* renamed from: h */
    public void m9631h() {
        this.f26951a.f1593t.m29382E();
    }

    /* renamed from: i */
    public void m9630i() {
        this.f26951a.f1593t.m29378G();
    }

    /* renamed from: j */
    public void m9629j(boolean z) {
        this.f26951a.f1593t.m29376H(z);
    }

    /* renamed from: k */
    public boolean m9628k(MenuItem menuItem) {
        return this.f26951a.f1593t.m29372J(menuItem);
    }

    /* renamed from: l */
    public void m9627l(Menu menu) {
        this.f26951a.f1593t.m29370K(menu);
    }

    /* renamed from: m */
    public void m9626m() {
        this.f26951a.f1593t.m29366M();
    }

    /* renamed from: n */
    public void m9625n(boolean z) {
        this.f26951a.f1593t.m29364N(z);
    }

    /* renamed from: o */
    public boolean m9624o(Menu menu) {
        return this.f26951a.f1593t.m29362O(menu);
    }

    /* renamed from: p */
    public void m9623p() {
        this.f26951a.f1593t.m29358Q();
    }

    /* renamed from: q */
    public void m9622q() {
        this.f26951a.f1593t.m29356R();
    }

    /* renamed from: r */
    public void m9621r() {
        this.f26951a.f1593t.m29352T();
    }

    /* renamed from: s */
    public boolean m9620s() {
        return this.f26951a.f1593t.m29337a0(true);
    }

    /* renamed from: t */
    public FragmentManager m9619t() {
        return this.f26951a.f1593t;
    }

    /* renamed from: u */
    public void m9618u() {
        this.f26951a.f1593t.m29357Q0();
    }

    /* renamed from: v */
    public View m9617v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f26951a.f1593t.m29286t0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: w */
    public void m9616w(Parcelable parcelable) {
        AbstractC0305e<?> abstractC0305e = this.f26951a;
        if (!(abstractC0305e instanceof nt1)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        abstractC0305e.f1593t.m29330c1(parcelable);
    }

    /* renamed from: x */
    public Parcelable m9615x() {
        return this.f26951a.f1593t.m29324e1();
    }
}
