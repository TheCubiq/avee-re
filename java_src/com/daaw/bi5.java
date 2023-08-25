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

    /* renamed from: e */
    public static bi5 f4835e;

    /* renamed from: a */
    public final Handler f4836a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final CopyOnWriteArrayList f4837b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final Object f4838c = new Object();

    /* renamed from: d */
    public int f4839d = 0;

    public bi5(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        it5.m19405a(context, new yg5(this, null), intentFilter);
    }

    /* renamed from: b */
    public static synchronized bi5 m26143b(Context context) {
        bi5 bi5Var;
        synchronized (bi5.class) {
            if (f4835e == null) {
                f4835e = new bi5(context);
            }
            bi5Var = f4835e;
        }
        return bi5Var;
    }

    /* renamed from: c */
    public static /* synthetic */ void m26142c(bi5 bi5Var, int i) {
        synchronized (bi5Var.f4838c) {
            if (bi5Var.f4839d == i) {
                return;
            }
            bi5Var.f4839d = i;
            Iterator it = bi5Var.f4837b.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ow8 ow8Var = (ow8) weakReference.get();
                if (ow8Var != null) {
                    ow8Var.f22046a.m12004i(i);
                } else {
                    bi5Var.f4837b.remove(weakReference);
                }
            }
        }
    }

    /* renamed from: a */
    public final int m26144a() {
        int i;
        synchronized (this.f4838c) {
            i = this.f4839d;
        }
        return i;
    }

    /* renamed from: d */
    public final void m26141d(final ow8 ow8Var) {
        Iterator it = this.f4837b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f4837b.remove(weakReference);
            }
        }
        this.f4837b.add(new WeakReference(ow8Var));
        this.f4836a.post(new Runnable(ow8Var, null) { // from class: com.daaw.zc5

            /* renamed from: q */
            public final /* synthetic */ ow8 f34944q;

            @Override // java.lang.Runnable
            public final void run() {
                bi5 bi5Var = bi5.this;
                ow8 ow8Var2 = this.f34944q;
                ow8Var2.f22046a.m12004i(bi5Var.m26144a());
            }
        });
    }
}
