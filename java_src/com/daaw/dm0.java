package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class dm0 {

    /* renamed from: a */
    public final List<xn0> f7461a;

    /* renamed from: b */
    public float f7462b = 0.0f;

    public dm0(dm0 dm0Var) {
        this.f7461a = new ArrayList(dm0Var.f7461a.size());
        for (int i = 0; i < dm0Var.f7461a.size(); i++) {
            this.f7461a.add(new xn0(dm0Var.f7461a.get(i)));
        }
    }

    public dm0(dm0 dm0Var, int i, int i2) {
        this.f7461a = new ArrayList(i2);
        int i3 = 0;
        while (i < dm0Var.f7461a.size() && i2 > i3) {
            i3++;
            this.f7461a.add(new xn0(dm0Var.f7461a.get(i)));
            i++;
        }
    }

    public dm0(dm0 dm0Var, xn0 xn0Var) {
        this.f7461a = new ArrayList(dm0Var.f7461a.size() + 1);
        for (int i = 0; i < dm0Var.f7461a.size(); i++) {
            this.f7461a.add(new xn0(dm0Var.f7461a.get(i)));
        }
        this.f7461a.add(new xn0(xn0Var));
    }

    public dm0(xn0 xn0Var) {
        ArrayList arrayList = new ArrayList();
        this.f7461a = arrayList;
        arrayList.add(xn0Var);
    }

    public dm0(List<xn0> list) {
        this.f7461a = list;
    }

    /* renamed from: a */
    public static dm0 m24232a(float f) {
        return new dm0(new xn0("Constant", f));
    }

    /* renamed from: b */
    public static dm0 m24231b(float f, float f2) {
        return new dm0(new xn0("Constant", f, f2));
    }

    /* renamed from: c */
    public static dm0 m24230c(String str, dm0 dm0Var) {
        String[] split = TextUtils.split(str, ";");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            xn0 m4971b = xn0.m4971b(str2, null);
            if (m4971b != null) {
                arrayList.add(m4971b);
            }
        }
        return arrayList.size() <= 0 ? dm0Var : new dm0(arrayList);
    }

    /* renamed from: d */
    public String m24229d(Context context) {
        StringBuilder sb = new StringBuilder();
        if (this.f7461a.size() > 1) {
            int i = 0;
            while (true) {
                this.f7461a.get(i).m4954s(sb, false, context);
                i++;
                if (i >= this.f7461a.size()) {
                    break;
                }
                sb.append("+");
            }
        } else if (this.f7461a.size() == 1) {
            this.f7461a.get(0).m4954s(sb, true, context);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public String m24228e(Context context) {
        StringBuilder sb = new StringBuilder();
        if (this.f7461a.size() > 1) {
            int i = 0;
            while (true) {
                this.f7461a.get(i).m4953t(sb, false, context);
                i++;
                if (i >= this.f7461a.size()) {
                    break;
                }
                sb.append("+");
            }
        } else if (this.f7461a.size() == 1) {
            this.f7461a.get(0).m4953t(sb, true, context);
        }
        return sb.toString();
    }

    /* renamed from: f */
    public float m24227f() {
        float f = 0.0f;
        if (this.f7461a.size() <= 1) {
            if (this.f7461a.size() == 1) {
                return this.f7461a.get(0).m4967f();
            }
            return 0.0f;
        }
        for (int i = 0; i < this.f7461a.size(); i++) {
            f += this.f7461a.get(i).m4967f();
        }
        return f / this.f7461a.size();
    }

    /* renamed from: g */
    public xn0 m24226g(int i) {
        return this.f7461a.get(i);
    }

    /* renamed from: h */
    public int m24225h() {
        return this.f7461a.size();
    }

    /* renamed from: i */
    public float m24224i(aq0 aq0Var) {
        this.f7462b = 0.0f;
        for (int i = 0; i < this.f7461a.size(); i++) {
            this.f7462b += this.f7461a.get(i).m4964i(aq0Var);
        }
        return this.f7462b;
    }

    /* renamed from: j */
    public bs1 m24223j(aq0 aq0Var, bs1 bs1Var) {
        bs1Var.f5090a = 0.0f;
        bs1Var.f5091b = 0.0f;
        for (int i = 0; i < this.f7461a.size(); i++) {
            bs1 m4961l = this.f7461a.get(i).m4961l(aq0Var);
            bs1Var.f5090a += m4961l.f5090a;
            bs1Var.f5091b += m4961l.f5091b;
        }
        return bs1Var;
    }

    /* renamed from: k */
    public void m24222k(int i, xn0 xn0Var) {
        this.f7461a.set(i, xn0Var);
    }

    public String toString() {
        if (this.f7461a.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            this.f7461a.get(i).m4952u(sb);
            i++;
            if (i >= this.f7461a.size()) {
                return sb.toString();
            }
            sb.append(";");
        }
    }
}
