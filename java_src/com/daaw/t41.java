package com.daaw;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class t41 implements Handler.Callback {
    public static final t41 t = new t41();
    public volatile r41 p;
    public final Map<FragmentManager, s41> q = new HashMap();
    public final Map<androidx.fragment.app.FragmentManager, ii1> r = new HashMap();
    public final Handler s = new Handler(Looper.getMainLooper(), this);

    @TargetApi(17)
    public static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    public static t41 f() {
        return t;
    }

    @TargetApi(11)
    public r41 b(Context context, FragmentManager fragmentManager) {
        s41 h = h(fragmentManager);
        r41 c = h.c();
        if (c == null) {
            r41 r41Var = new r41(context, h.b(), h.d());
            h.f(r41Var);
            return r41Var;
        }
        return c;
    }

    @TargetApi(11)
    public r41 c(Activity activity) {
        if (tq1.i()) {
            return d(activity.getApplicationContext());
        }
        a(activity);
        return b(activity, activity.getFragmentManager());
    }

    public r41 d(Context context) {
        if (context != null) {
            if (tq1.j() && !(context instanceof Application)) {
                if (context instanceof p30) {
                    return e((p30) context);
                }
                if (context instanceof Activity) {
                    return c((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    return d(((ContextWrapper) context).getBaseContext());
                }
            }
            return g(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public r41 e(p30 p30Var) {
        if (tq1.i()) {
            return d(p30Var.getApplicationContext());
        }
        a(p30Var);
        return j(p30Var, p30Var.x());
    }

    public final r41 g(Context context) {
        if (this.p == null) {
            synchronized (this) {
                if (this.p == null) {
                    this.p = new r41(context.getApplicationContext(), new p5(), new rw());
                }
            }
        }
        return this.p;
    }

    @TargetApi(17)
    public s41 h(FragmentManager fragmentManager) {
        s41 s41Var = (s41) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (s41Var == null) {
            s41 s41Var2 = this.q.get(fragmentManager);
            if (s41Var2 == null) {
                s41 s41Var3 = new s41();
                this.q.put(fragmentManager, s41Var3);
                fragmentManager.beginTransaction().add(s41Var3, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.s.obtainMessage(1, fragmentManager).sendToTarget();
                return s41Var3;
            }
            return s41Var2;
        }
        return s41Var;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i == 1) {
            obj = (FragmentManager) message.obj;
            map = this.q;
        } else if (i != 2) {
            z = false;
            obj2 = null;
            if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to remove expected request manager fragment, manager: ");
                sb.append(obj2);
            }
            return z;
        } else {
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            map = this.r;
        }
        Object obj4 = obj;
        obj3 = map.remove(obj);
        obj2 = obj4;
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to remove expected request manager fragment, manager: ");
            sb2.append(obj2);
        }
        return z;
    }

    public ii1 i(androidx.fragment.app.FragmentManager fragmentManager) {
        ii1 ii1Var = (ii1) fragmentManager.h0("com.bumptech.glide.manager");
        if (ii1Var == null) {
            ii1 ii1Var2 = this.r.get(fragmentManager);
            if (ii1Var2 == null) {
                ii1 ii1Var3 = new ii1();
                this.r.put(fragmentManager, ii1Var3);
                fragmentManager.l().d(ii1Var3, "com.bumptech.glide.manager").g();
                this.s.obtainMessage(2, fragmentManager).sendToTarget();
                return ii1Var3;
            }
            return ii1Var2;
        }
        return ii1Var;
    }

    public r41 j(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        ii1 i = i(fragmentManager);
        r41 I1 = i.I1();
        if (I1 == null) {
            r41 r41Var = new r41(context, i.H1(), i.J1());
            i.L1(r41Var);
            return r41Var;
        }
        return I1;
    }
}
