package com.daaw;

import android.app.Activity;
import android.content.Context;
/* loaded from: classes.dex */
public abstract class qb {

    /* loaded from: classes.dex */
    public static final class a {
        public volatile boolean a;
        public final Context b;
        public volatile g01 c;

        public /* synthetic */ a(Context context, sm8 sm8Var) {
            this.b = context;
        }

        public qb a() {
            if (this.b != null) {
                if (this.c != null) {
                    if (this.a) {
                        return this.c != null ? new rb(null, this.a, this.b, this.c, null) : new rb(null, this.a, this.b, null);
                    }
                    throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        public a b() {
            this.a = true;
            return this;
        }

        public a c(g01 g01Var) {
            this.c = g01Var;
            return this;
        }
    }

    public static a e(Context context) {
        return new a(context, null);
    }

    public abstract void a(c0 c0Var, d0 d0Var);

    public abstract void b();

    public abstract boolean c();

    public abstract xb d(Activity activity, tb tbVar);

    public abstract void f(j01 j01Var, lz0 lz0Var);

    public abstract void g(k01 k01Var, f01 f01Var);

    public abstract void h(sb sbVar);
}
