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

    /* renamed from: t */
    public static final t41 f26991t = new t41();

    /* renamed from: p */
    public volatile r41 f26992p;

    /* renamed from: q */
    public final Map<FragmentManager, s41> f26993q = new HashMap();

    /* renamed from: r */
    public final Map<androidx.fragment.app.FragmentManager, ii1> f26994r = new HashMap();

    /* renamed from: s */
    public final Handler f26995s = new Handler(Looper.getMainLooper(), this);

    @TargetApi(17)
    /* renamed from: a */
    public static void m9540a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: f */
    public static t41 m9535f() {
        return f26991t;
    }

    @TargetApi(11)
    /* renamed from: b */
    public r41 m9539b(Context context, FragmentManager fragmentManager) {
        s41 m9533h = m9533h(fragmentManager);
        r41 m10723c = m9533h.m10723c();
        if (m10723c == null) {
            r41 r41Var = new r41(context, m9533h.m10724b(), m9533h.m10722d());
            m9533h.m10720f(r41Var);
            return r41Var;
        }
        return m10723c;
    }

    @TargetApi(11)
    /* renamed from: c */
    public r41 m9538c(Activity activity) {
        if (tq1.m8862i()) {
            return m9537d(activity.getApplicationContext());
        }
        m9540a(activity);
        return m9539b(activity, activity.getFragmentManager());
    }

    /* renamed from: d */
    public r41 m9537d(Context context) {
        if (context != null) {
            if (tq1.m8861j() && !(context instanceof Application)) {
                if (context instanceof p30) {
                    return m9536e((p30) context);
                }
                if (context instanceof Activity) {
                    return m9538c((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    return m9537d(((ContextWrapper) context).getBaseContext());
                }
            }
            return m9534g(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: e */
    public r41 m9536e(p30 p30Var) {
        if (tq1.m8862i()) {
            return m9537d(p30Var.getApplicationContext());
        }
        m9540a(p30Var);
        return m9531j(p30Var, p30Var.m13655x());
    }

    /* renamed from: g */
    public final r41 m9534g(Context context) {
        if (this.f26992p == null) {
            synchronized (this) {
                if (this.f26992p == null) {
                    this.f26992p = new r41(context.getApplicationContext(), new C2515p5(), new C2893rw());
                }
            }
        }
        return this.f26992p;
    }

    @TargetApi(17)
    /* renamed from: h */
    public s41 m9533h(FragmentManager fragmentManager) {
        s41 s41Var = (s41) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (s41Var == null) {
            s41 s41Var2 = this.f26993q.get(fragmentManager);
            if (s41Var2 == null) {
                s41 s41Var3 = new s41();
                this.f26993q.put(fragmentManager, s41Var3);
                fragmentManager.beginTransaction().add(s41Var3, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f26995s.obtainMessage(1, fragmentManager).sendToTarget();
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
            map = this.f26993q;
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
            map = this.f26994r;
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

    /* renamed from: i */
    public ii1 m9532i(androidx.fragment.app.FragmentManager fragmentManager) {
        ii1 ii1Var = (ii1) fragmentManager.m29316h0("com.bumptech.glide.manager");
        if (ii1Var == null) {
            ii1 ii1Var2 = this.f26994r.get(fragmentManager);
            if (ii1Var2 == null) {
                ii1 ii1Var3 = new ii1();
                this.f26994r.put(fragmentManager, ii1Var3);
                fragmentManager.m29305l().m29149d(ii1Var3, "com.bumptech.glide.manager").mo29146g();
                this.f26995s.obtainMessage(2, fragmentManager).sendToTarget();
                return ii1Var3;
            }
            return ii1Var2;
        }
        return ii1Var;
    }

    /* renamed from: j */
    public r41 m9531j(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        ii1 m9532i = m9532i(fragmentManager);
        r41 m19778I1 = m9532i.m19778I1();
        if (m19778I1 == null) {
            r41 r41Var = new r41(context, m9532i.m19779H1(), m9532i.m19777J1());
            m9532i.m19775L1(r41Var);
            return r41Var;
        }
        return m19778I1;
    }
}
