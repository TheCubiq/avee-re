package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class rh8 {

    /* renamed from: f */
    public static final Uri f25304f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    public final String f25305a;

    /* renamed from: b */
    public final String f25306b;

    /* renamed from: c */
    public final ComponentName f25307c;

    /* renamed from: d */
    public final int f25308d;

    /* renamed from: e */
    public final boolean f25309e;

    public rh8(String str, String str2, int i, boolean z) {
        ry0.m10834f(str);
        this.f25305a = str;
        ry0.m10834f(str2);
        this.f25306b = str2;
        this.f25307c = null;
        this.f25308d = i;
        this.f25309e = z;
    }

    /* renamed from: a */
    public final int m11300a() {
        return this.f25308d;
    }

    /* renamed from: b */
    public final ComponentName m11299b() {
        return this.f25307c;
    }

    /* renamed from: c */
    public final Intent m11298c(Context context) {
        Bundle bundle;
        if (this.f25305a != null) {
            if (this.f25309e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f25305a);
                try {
                    bundle = context.getContentResolver().call(f25304f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e) {
                    "Dynamic intent resolution failed: ".concat(e.toString());
                    bundle = null;
                }
                r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
                if (r1 == null) {
                    "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f25305a));
                }
            }
            return r1 != null ? r1 : new Intent(this.f25305a).setPackage(this.f25306b);
        }
        return new Intent().setComponent(this.f25307c);
    }

    /* renamed from: d */
    public final String m11297d() {
        return this.f25306b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rh8) {
            rh8 rh8Var = (rh8) obj;
            return ot0.m13981a(this.f25305a, rh8Var.f25305a) && ot0.m13981a(this.f25306b, rh8Var.f25306b) && ot0.m13981a(this.f25307c, rh8Var.f25307c) && this.f25308d == rh8Var.f25308d && this.f25309e == rh8Var.f25309e;
        }
        return false;
    }

    public final int hashCode() {
        return ot0.m13980b(this.f25305a, this.f25306b, this.f25307c, Integer.valueOf(this.f25308d), Boolean.valueOf(this.f25309e));
    }

    public final String toString() {
        String str = this.f25305a;
        if (str == null) {
            ry0.m10830j(this.f25307c);
            return this.f25307c.flattenToString();
        }
        return str;
    }
}
