package com.daaw;

import android.net.Uri;
import com.daaw.cp0;
import com.daaw.ib0;
import java.io.IOException;
/* loaded from: classes.dex */
public interface pb0 {

    /* loaded from: classes.dex */
    public interface a {
        boolean d(ib0.a aVar, boolean z);

        void h();
    }

    /* loaded from: classes.dex */
    public static final class b extends IOException {
        public final String p;

        public b(String str) {
            this.p = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends IOException {
        public final String p;

        public c(String str) {
            this.p = str;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void d(lb0 lb0Var);
    }

    void a();

    void b(Uri uri, cp0.a aVar, d dVar);

    void c(a aVar);

    lb0 d(ib0.a aVar);

    void e(ib0.a aVar);

    long f();

    boolean g();

    void h(ib0.a aVar);

    ib0 i();

    void j();

    void l(a aVar);

    boolean m(ib0.a aVar);
}
