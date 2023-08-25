package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class dm0 {
    public final List<xn0> a;
    public float b = 0.0f;

    public dm0(dm0 dm0Var) {
        this.a = new ArrayList(dm0Var.a.size());
        for (int i = 0; i < dm0Var.a.size(); i++) {
            this.a.add(new xn0(dm0Var.a.get(i)));
        }
    }

    public dm0(dm0 dm0Var, int i, int i2) {
        this.a = new ArrayList(i2);
        int i3 = 0;
        while (i < dm0Var.a.size() && i2 > i3) {
            i3++;
            this.a.add(new xn0(dm0Var.a.get(i)));
            i++;
        }
    }

    public dm0(dm0 dm0Var, xn0 xn0Var) {
        this.a = new ArrayList(dm0Var.a.size() + 1);
        for (int i = 0; i < dm0Var.a.size(); i++) {
            this.a.add(new xn0(dm0Var.a.get(i)));
        }
        this.a.add(new xn0(xn0Var));
    }

    public dm0(xn0 xn0Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(xn0Var);
    }

    public dm0(List<xn0> list) {
        this.a = list;
    }

    public static dm0 a(float f) {
        return new dm0(new xn0("Constant", f));
    }

    public static dm0 b(float f, float f2) {
        return new dm0(new xn0("Constant", f, f2));
    }

    public static dm0 c(String str, dm0 dm0Var) {
        String[] split = TextUtils.split(str, ";");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            xn0 b = xn0.b(str2, null);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList.size() <= 0 ? dm0Var : new dm0(arrayList);
    }

    public String d(Context context) {
        StringBuilder sb = new StringBuilder();
        if (this.a.size() > 1) {
            int i = 0;
            while (true) {
                this.a.get(i).s(sb, false, context);
                i++;
                if (i >= this.a.size()) {
                    break;
                }
                sb.append("+");
            }
        } else if (this.a.size() == 1) {
            this.a.get(0).s(sb, true, context);
        }
        return sb.toString();
    }

    public String e(Context context) {
        StringBuilder sb = new StringBuilder();
        if (this.a.size() > 1) {
            int i = 0;
            while (true) {
                this.a.get(i).t(sb, false, context);
                i++;
                if (i >= this.a.size()) {
                    break;
                }
                sb.append("+");
            }
        } else if (this.a.size() == 1) {
            this.a.get(0).t(sb, true, context);
        }
        return sb.toString();
    }

    public float f() {
        float f = 0.0f;
        if (this.a.size() <= 1) {
            if (this.a.size() == 1) {
                return this.a.get(0).f();
            }
            return 0.0f;
        }
        for (int i = 0; i < this.a.size(); i++) {
            f += this.a.get(i).f();
        }
        return f / this.a.size();
    }

    public xn0 g(int i) {
        return this.a.get(i);
    }

    public int h() {
        return this.a.size();
    }

    public float i(aq0 aq0Var) {
        this.b = 0.0f;
        for (int i = 0; i < this.a.size(); i++) {
            this.b += this.a.get(i).i(aq0Var);
        }
        return this.b;
    }

    public bs1 j(aq0 aq0Var, bs1 bs1Var) {
        bs1Var.a = 0.0f;
        bs1Var.b = 0.0f;
        for (int i = 0; i < this.a.size(); i++) {
            bs1 l = this.a.get(i).l(aq0Var);
            bs1Var.a += l.a;
            bs1Var.b += l.b;
        }
        return bs1Var;
    }

    public void k(int i, xn0 xn0Var) {
        this.a.set(i, xn0Var);
    }

    public String toString() {
        if (this.a.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            this.a.get(i).u(sb);
            i++;
            if (i >= this.a.size()) {
                return sb.toString();
            }
            sb.append(";");
        }
    }
}
