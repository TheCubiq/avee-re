package com.daaw;

import android.app.Fragment;
import android.os.Build;
@Deprecated
/* loaded from: classes.dex */
public class q30 {

    /* renamed from: a */
    public static final InterfaceC2687e f23645a;

    /* renamed from: com.daaw.q30$a */
    /* loaded from: classes.dex */
    public static class C2683a extends C2686d {
        @Override // com.daaw.q30.InterfaceC2687e
        /* renamed from: a */
        public void mo12792a(Fragment fragment, boolean z) {
            fragment.setUserVisibleHint(z);
        }
    }

    /* renamed from: com.daaw.q30$b */
    /* loaded from: classes.dex */
    public static class C2684b extends C2683a {
    }

    /* renamed from: com.daaw.q30$c */
    /* loaded from: classes.dex */
    public static class C2685c extends C2684b {
        @Override // com.daaw.q30.C2683a, com.daaw.q30.InterfaceC2687e
        /* renamed from: a */
        public void mo12792a(Fragment fragment, boolean z) {
            fragment.setUserVisibleHint(z);
        }
    }

    /* renamed from: com.daaw.q30$d */
    /* loaded from: classes.dex */
    public static class C2686d implements InterfaceC2687e {
    }

    /* renamed from: com.daaw.q30$e */
    /* loaded from: classes.dex */
    public interface InterfaceC2687e {
        /* renamed from: a */
        void mo12792a(Fragment fragment, boolean z);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f23645a = i >= 24 ? new C2685c() : i >= 23 ? new C2684b() : new C2683a();
    }

    @Deprecated
    /* renamed from: a */
    public static void m12793a(Fragment fragment, boolean z) {
        f23645a.mo12792a(fragment, z);
    }
}
