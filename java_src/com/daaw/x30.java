package com.daaw;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
@Deprecated
/* loaded from: classes.dex */
public abstract class x30 extends kv0 {

    /* renamed from: c */
    public final FragmentManager f32044c;

    /* renamed from: d */
    public FragmentTransaction f32045d = null;

    /* renamed from: e */
    public Fragment f32046e = null;

    @Deprecated
    public x30(FragmentManager fragmentManager) {
        this.f32044c = fragmentManager;
    }

    /* renamed from: r */
    public static String m5592r(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // com.daaw.kv0
    @Deprecated
    /* renamed from: a */
    public void mo5602a(ViewGroup viewGroup, int i, Object obj) {
        if (this.f32045d == null) {
            this.f32045d = this.f32044c.beginTransaction();
        }
        this.f32045d.detach((Fragment) obj);
    }

    @Override // com.daaw.kv0
    @Deprecated
    /* renamed from: b */
    public void mo5601b(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f32045d;
        if (fragmentTransaction != null) {
            fragmentTransaction.commitAllowingStateLoss();
            this.f32045d = null;
            this.f32044c.executePendingTransactions();
        }
    }

    @Override // com.daaw.kv0
    @Deprecated
    /* renamed from: g */
    public Object mo5600g(ViewGroup viewGroup, int i) {
        if (this.f32045d == null) {
            this.f32045d = this.f32044c.beginTransaction();
        }
        long m5593q = m5593q(i);
        Fragment findFragmentByTag = this.f32044c.findFragmentByTag(m5592r(viewGroup.getId(), m5593q));
        if (findFragmentByTag != null) {
            this.f32045d.attach(findFragmentByTag);
        } else {
            findFragmentByTag = mo5594p(i);
            this.f32045d.add(viewGroup.getId(), findFragmentByTag, m5592r(viewGroup.getId(), m5593q));
        }
        if (findFragmentByTag != this.f32046e) {
            findFragmentByTag.setMenuVisibility(false);
            q30.m12793a(findFragmentByTag, false);
        }
        return findFragmentByTag;
    }

    @Override // com.daaw.kv0
    @Deprecated
    /* renamed from: h */
    public boolean mo5599h(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // com.daaw.kv0
    @Deprecated
    /* renamed from: j */
    public void mo5598j(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // com.daaw.kv0
    @Deprecated
    /* renamed from: k */
    public Parcelable mo5597k() {
        return null;
    }

    @Override // com.daaw.kv0
    @Deprecated
    /* renamed from: l */
    public void mo5596l(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f32046e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                q30.m12793a(this.f32046e, false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                q30.m12793a(fragment, true);
            }
            this.f32046e = fragment;
        }
    }

    @Override // com.daaw.kv0
    @Deprecated
    /* renamed from: n */
    public void mo5595n(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Deprecated
    /* renamed from: p */
    public abstract Fragment mo5594p(int i);

    @Deprecated
    /* renamed from: q */
    public long m5593q(int i) {
        return i;
    }
}
