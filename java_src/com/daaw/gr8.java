package com.daaw;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
/* loaded from: classes2.dex */
public final class gr8 {
    public final dr6 a;

    public gr8(dr6 dr6Var) {
        this.a = dr6Var;
    }

    public final void a(String str, Bundle bundle) {
        String uri;
        this.a.r().f();
        if (this.a.n()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        this.a.F().v.b(uri);
        this.a.F().w.b(this.a.b().a());
    }

    public final void b() {
        this.a.r().f();
        if (d()) {
            if (e()) {
                this.a.F().v.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.a.I().u("auto", "_cmpx", bundle);
            } else {
                String a = this.a.F().v.a();
                if (TextUtils.isEmpty(a)) {
                    this.a.i().t().a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((this.a.F().w.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    Object obj = pair.first;
                    this.a.I().u(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.a.F().v.b(null);
            }
            this.a.F().w.b(0L);
        }
    }

    public final void c() {
        if (d() && e()) {
            this.a.F().v.b(null);
        }
    }

    public final boolean d() {
        return this.a.F().w.a() > 0;
    }

    public final boolean e() {
        return d() && this.a.b().a() - this.a.F().w.a() > this.a.z().q(null, m75.S);
    }
}
