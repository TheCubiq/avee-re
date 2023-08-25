package com.daaw;

import android.content.Context;
import android.view.View;
import com.daaw.qw1;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public interface wc0 {

    /* loaded from: classes.dex */
    public interface a {
        void a(String str);

        void b(int i, int i2, boolean z, boolean z2);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(String str, String str2);

        void b(qw1.a<Integer> aVar, List<Object> list);

        int c();

        int d();

        void e(qw1.a<Boolean> aVar, List<Object> list);

        String f(String str, String str2);

        void g(qw1.a<Boolean> aVar, List<Object> list);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(View view);
    }

    int a();

    boolean b();

    void c(boolean z);

    ts1 d(Context context, String str);

    String e();

    void g(al alVar, int i);

    boolean h(boolean z);

    int i();

    me0<String> l();

    boolean m(int i, Context context);

    void n(WeakReference<a> weakReference);

    void o(Context context, String str);

    String p(String str);

    void q(WeakReference<b> weakReference);

    lo1<Integer, Boolean> s();

    c u();

    b w();

    void x(Context context, String[] strArr, sd0[] sd0VarArr);

    boolean y(sd0 sd0Var);

    boolean z();
}
