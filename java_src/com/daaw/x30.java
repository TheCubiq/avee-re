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
    public final FragmentManager c;
    public FragmentTransaction d = null;
    public Fragment e = null;

    @Deprecated
    public x30(FragmentManager fragmentManager) {
        this.c = fragmentManager;
    }

    public static String r(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // com.daaw.kv0
    @Deprecated
    public void a(ViewGroup viewGroup, int i, Object obj) {
        if (this.d == null) {
            this.d = this.c.beginTransaction();
        }
        this.d.detach((Fragment) obj);
    }

    @Override // com.daaw.kv0
    @Deprecated
    public void b(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.d;
        if (fragmentTransaction != null) {
            fragmentTransaction.commitAllowingStateLoss();
            this.d = null;
            this.c.executePendingTransactions();
        }
    }

    @Override // com.daaw.kv0
    @Deprecated
    public Object g(ViewGroup viewGroup, int i) {
        if (this.d == null) {
            this.d = this.c.beginTransaction();
        }
        long q = q(i);
        Fragment findFragmentByTag = this.c.findFragmentByTag(r(viewGroup.getId(), q));
        if (findFragmentByTag != null) {
            this.d.attach(findFragmentByTag);
        } else {
            findFragmentByTag = p(i);
            this.d.add(viewGroup.getId(), findFragmentByTag, r(viewGroup.getId(), q));
        }
        if (findFragmentByTag != this.e) {
            findFragmentByTag.setMenuVisibility(false);
            q30.a(findFragmentByTag, false);
        }
        return findFragmentByTag;
    }

    @Override // com.daaw.kv0
    @Deprecated
    public boolean h(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // com.daaw.kv0
    @Deprecated
    public void j(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // com.daaw.kv0
    @Deprecated
    public Parcelable k() {
        return null;
    }

    @Override // com.daaw.kv0
    @Deprecated
    public void l(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                q30.a(this.e, false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                q30.a(fragment, true);
            }
            this.e = fragment;
        }
    }

    @Override // com.daaw.kv0
    @Deprecated
    public void n(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Deprecated
    public abstract Fragment p(int i);

    @Deprecated
    public long q(int i) {
        return i;
    }
}
