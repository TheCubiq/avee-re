package com.daaw;

import android.app.Activity;
import android.content.Context;
/* renamed from: com.daaw.qb */
/* loaded from: classes.dex */
public abstract class AbstractC2701qb {

    /* renamed from: com.daaw.qb$a */
    /* loaded from: classes.dex */
    public static final class C2702a {

        /* renamed from: a */
        public volatile boolean f23828a;

        /* renamed from: b */
        public final Context f23829b;

        /* renamed from: c */
        public volatile g01 f23830c;

        public /* synthetic */ C2702a(Context context, sm8 sm8Var) {
            this.f23829b = context;
        }

        /* renamed from: a */
        public AbstractC2701qb m12647a() {
            if (this.f23829b != null) {
                if (this.f23830c != null) {
                    if (this.f23828a) {
                        return this.f23830c != null ? new C2842rb(null, this.f23828a, this.f23829b, this.f23830c, null) : new C2842rb(null, this.f23828a, this.f23829b, null);
                    }
                    throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        /* renamed from: b */
        public C2702a m12646b() {
            this.f23828a = true;
            return this;
        }

        /* renamed from: c */
        public C2702a m12645c(g01 g01Var) {
            this.f23830c = g01Var;
            return this;
        }
    }

    /* renamed from: e */
    public static C2702a m12648e(Context context) {
        return new C2702a(context, null);
    }

    /* renamed from: a */
    public abstract void mo11529a(C0902c0 c0902c0, InterfaceC1032d0 interfaceC1032d0);

    /* renamed from: b */
    public abstract void mo11528b();

    /* renamed from: c */
    public abstract boolean mo11527c();

    /* renamed from: d */
    public abstract C3518xb mo11526d(Activity activity, C3030tb c3030tb);

    /* renamed from: f */
    public abstract void mo11525f(j01 j01Var, lz0 lz0Var);

    /* renamed from: g */
    public abstract void mo11524g(k01 k01Var, f01 f01Var);

    /* renamed from: h */
    public abstract void mo11523h(InterfaceC2929sb interfaceC2929sb);
}
