package com.daaw;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class on1 {

    /* renamed from: b */
    public View f21676b;

    /* renamed from: a */
    public final Map<String, Object> f21675a = new HashMap();

    /* renamed from: c */
    public final ArrayList<in1> f21677c = new ArrayList<>();

    @Deprecated
    public on1() {
    }

    public on1(View view) {
        this.f21676b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof on1) {
            on1 on1Var = (on1) obj;
            return this.f21676b == on1Var.f21676b && this.f21675a.equals(on1Var.f21675a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f21676b.hashCode() * 31) + this.f21675a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f21676b + "\n") + "    values:";
        for (String str2 : this.f21675a.keySet()) {
            str = str + "    " + str2 + ": " + this.f21675a.get(str2) + "\n";
        }
        return str;
    }
}
