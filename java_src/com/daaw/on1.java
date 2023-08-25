package com.daaw;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class on1 {
    public View b;
    public final Map<String, Object> a = new HashMap();
    public final ArrayList<in1> c = new ArrayList<>();

    @Deprecated
    public on1() {
    }

    public on1(View view) {
        this.b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof on1) {
            on1 on1Var = (on1) obj;
            return this.b == on1Var.b && this.a.equals(on1Var.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }
}
