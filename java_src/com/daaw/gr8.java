package com.daaw;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
/* loaded from: classes2.dex */
public final class gr8 {

    /* renamed from: a */
    public final dr6 f11633a;

    public gr8(dr6 dr6Var) {
        this.f11633a = dr6Var;
    }

    /* renamed from: a */
    public final void m21304a(String str, Bundle bundle) {
        String uri;
        this.f11633a.mo3882r().mo6991f();
        if (this.f11633a.m24031n()) {
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
        this.f11633a.m24053F().f17020v.m20166b(uri);
        this.f11633a.m24053F().f17021w.m4399b(this.f11633a.mo3909b().mo15860a());
    }

    /* renamed from: b */
    public final void m21303b() {
        this.f11633a.mo3882r().mo6991f();
        if (m21301d()) {
            if (m21300e()) {
                this.f11633a.m24053F().f17020v.m20166b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f11633a.m24050I().m13683u("auto", "_cmpx", bundle);
            } else {
                String m20167a = this.f11633a.m24053F().f17020v.m20167a();
                if (TextUtils.isEmpty(m20167a)) {
                    this.f11633a.mo3895i().m14158t().m20653a("Cache still valid but referrer not found");
                } else {
                    long m4400a = ((this.f11633a.m24053F().f17021w.m4400a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(m20167a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", m4400a);
                    Object obj = pair.first;
                    this.f11633a.m24050I().m13683u(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f11633a.m24053F().f17020v.m20166b(null);
            }
            this.f11633a.m24053F().f17021w.m4399b(0L);
        }
    }

    /* renamed from: c */
    public final void m21302c() {
        if (m21301d() && m21300e()) {
            this.f11633a.m24053F().f17020v.m20166b(null);
        }
    }

    /* renamed from: d */
    public final boolean m21301d() {
        return this.f11633a.m24053F().f17021w.m4400a() > 0;
    }

    /* renamed from: e */
    public final boolean m21300e() {
        return m21301d() && this.f11633a.mo3909b().mo15860a() - this.f11633a.m24053F().f17021w.m4400a() > this.f11633a.m24020z().m12660q(null, m75.f18511S);
    }
}
