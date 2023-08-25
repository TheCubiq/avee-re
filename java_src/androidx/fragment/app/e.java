package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import com.daaw.p30;
import com.daaw.r30;
import com.daaw.ty0;
import com.daaw.u30;
import com.daaw.zk;
/* loaded from: classes.dex */
public abstract class e<E> extends r30 {
    public final Activity p;
    public final Context q;
    public final Handler r;
    public final int s;
    public final FragmentManager t;

    public e(Activity activity, Context context, Handler handler, int i) {
        this.t = new u30();
        this.p = activity;
        this.q = (Context) ty0.g(context, "context == null");
        this.r = (Handler) ty0.g(handler, "handler == null");
        this.s = i;
    }

    public e(p30 p30Var) {
        this(p30Var, p30Var, new Handler(), 0);
    }

    @Override // com.daaw.r30
    public View f(int i) {
        return null;
    }

    @Override // com.daaw.r30
    public boolean h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity j() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context k() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler l() {
        return this.r;
    }

    public abstract E m();

    public LayoutInflater n() {
        return LayoutInflater.from(this.q);
    }

    public boolean o(Fragment fragment) {
        return true;
    }

    public void p(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        zk.i(this.q, intent, bundle);
    }

    public void q() {
    }
}
