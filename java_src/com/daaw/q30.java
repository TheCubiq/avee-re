package com.daaw;

import android.app.Fragment;
import android.os.Build;
@Deprecated
/* loaded from: classes.dex */
public class q30 {
    public static final e a;

    /* loaded from: classes.dex */
    public static class a extends d {
        @Override // com.daaw.q30.e
        public void a(Fragment fragment, boolean z) {
            fragment.setUserVisibleHint(z);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // com.daaw.q30.a, com.daaw.q30.e
        public void a(Fragment fragment, boolean z) {
            fragment.setUserVisibleHint(z);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements e {
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(Fragment fragment, boolean z);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 24 ? new c() : i >= 23 ? new b() : new a();
    }

    @Deprecated
    public static void a(Fragment fragment, boolean z) {
        a.a(fragment, z);
    }
}
