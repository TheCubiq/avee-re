package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import com.daaw.sj0;
/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements d {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ Runnable b;

    @Override // androidx.lifecycle.d
    public void a(sj0 sj0Var, c.b bVar) {
        if (bVar == c.b.ON_DESTROY) {
            this.a.removeCallbacks(this.b);
            sj0Var.a().c(this);
        }
    }
}
