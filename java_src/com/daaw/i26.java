package com.daaw;

import android.content.SharedPreferences;
/* loaded from: classes2.dex */
public final class i26 {

    /* renamed from: a */
    public final String f13204a;

    /* renamed from: b */
    public boolean f13205b;

    /* renamed from: c */
    public String f13206c;

    /* renamed from: d */
    public final /* synthetic */ l36 f13207d;

    public i26(l36 l36Var, String str, String str2) {
        this.f13207d = l36Var;
        ry0.m10834f(str);
        this.f13204a = str;
    }

    /* renamed from: a */
    public final String m20167a() {
        if (!this.f13205b) {
            this.f13205b = true;
            this.f13206c = this.f13207d.m17176n().getString(this.f13204a, null);
        }
        return this.f13206c;
    }

    /* renamed from: b */
    public final void m20166b(String str) {
        SharedPreferences.Editor edit = this.f13207d.m17176n().edit();
        edit.putString(this.f13204a, str);
        edit.apply();
        this.f13206c = str;
    }
}
