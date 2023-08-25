package com.daaw;

import android.os.Bundle;
import com.daaw.k3;
/* loaded from: classes.dex */
public class hk1 implements k3.d {
    public static final hk1 c = c().a();
    public final String b;

    /* loaded from: classes.dex */
    public static class a {
        public String a;

        public /* synthetic */ a(qz1 qz1Var) {
        }

        public hk1 a() {
            return new hk1(this.a, null);
        }
    }

    public /* synthetic */ hk1(String str, sz1 sz1Var) {
        this.b = str;
    }

    public static a c() {
        return new a(null);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hk1) {
            return ot0.a(this.b, ((hk1) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return ot0.b(this.b);
    }
}
