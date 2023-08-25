package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import com.daaw.C3866zk;
import com.daaw.p30;
import com.daaw.r30;
import com.daaw.ty0;
import com.daaw.u30;
/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
public abstract class AbstractC0305e<E> extends r30 {

    /* renamed from: p */
    public final Activity f1589p;

    /* renamed from: q */
    public final Context f1590q;

    /* renamed from: r */
    public final Handler f1591r;

    /* renamed from: s */
    public final int f1592s;

    /* renamed from: t */
    public final FragmentManager f1593t;

    public AbstractC0305e(Activity activity, Context context, Handler handler, int i) {
        this.f1593t = new u30();
        this.f1589p = activity;
        this.f1590q = (Context) ty0.m8698g(context, "context == null");
        this.f1591r = (Handler) ty0.m8698g(handler, "handler == null");
        this.f1592s = i;
    }

    public AbstractC0305e(p30 p30Var) {
        this(p30Var, p30Var, new Handler(), 0);
    }

    @Override // com.daaw.r30
    /* renamed from: f */
    public View mo11810f(int i) {
        return null;
    }

    @Override // com.daaw.r30
    /* renamed from: h */
    public boolean mo11809h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public Activity m29215j() {
        return this.f1589p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Context m29214k() {
        return this.f1590q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Handler m29213l() {
        return this.f1591r;
    }

    /* renamed from: m */
    public abstract E mo13651m();

    /* renamed from: n */
    public LayoutInflater mo13650n() {
        return LayoutInflater.from(this.f1590q);
    }

    /* renamed from: o */
    public boolean mo13649o(Fragment fragment) {
        return true;
    }

    /* renamed from: p */
    public void m29212p(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        C3866zk.m2174i(this.f1590q, intent, bundle);
    }

    /* renamed from: q */
    public void mo13648q() {
    }
}
