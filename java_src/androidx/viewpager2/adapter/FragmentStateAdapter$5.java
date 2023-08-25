package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.InterfaceC0348d;
import com.daaw.sj0;
/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements InterfaceC0348d {

    /* renamed from: a */
    public final /* synthetic */ Handler f2414a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f2415b;

    @Override // androidx.lifecycle.InterfaceC0348d
    /* renamed from: a */
    public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
        if (enumC0346b == AbstractC0344c.EnumC0346b.ON_DESTROY) {
            this.f2414a.removeCallbacks(this.f2415b);
            sj0Var.mo2327a().mo29046c(this);
        }
    }
}
