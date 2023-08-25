package com.daaw;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class bi5 {
    public static bi5 e;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final Object c = new Object();
    public int d = 0;

    public bi5(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        it5.a(context, new yg5(this, null), intentFilter);
    }

    public static synchronized bi5 b(Context context) {
        bi5 bi5Var;
        synchronized (bi5.class) {
            if (e == null) {
                e = new bi5(context);
            }
            bi5Var = e;
        }
        return bi5Var;
    }

    public static /* synthetic */ void c(bi5 bi5Var, int i) {
        synchronized (bi5Var.c) {
            if (bi5Var.d == i) {
                return;
            }
            bi5Var.d = i;
            Iterator it = bi5Var.b.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ow8 ow8Var = (ow8) weakReference.get();
                if (ow8Var != null) {
                    ow8Var.a.i(i);
                } else {
                    bi5Var.b.remove(weakReference);
                }
            }
        }
    }

    public final int a() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void d(final ow8 ow8Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.b.remove(weakReference);
            }
        }
        this.b.add(new WeakReference(ow8Var));
        this.a.post(new Runnable(ow8Var, null) { // from class: com.daaw.zc5
            public final /* synthetic */ ow8 q;

            @Override // java.lang.Runnable
            public final void run() {
                bi5 bi5Var = bi5.this;
                ow8 ow8Var2 = this.q;
                ow8Var2.a.i(bi5Var.a());
            }
        });
    }
}
