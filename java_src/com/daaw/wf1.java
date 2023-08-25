package com.daaw;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class wf1 {
    public int a;
    public int b;
    public String c;
    public HashMap<String, Integer> d;

    public wf1() {
        this.a = 0;
        this.b = 0;
        this.c = "";
    }

    public wf1(wf1 wf1Var) {
        this.a = wf1Var.a;
        this.b = wf1Var.b;
        this.c = wf1Var.c;
        if (wf1Var.d != null) {
            this.d = new HashMap<>(wf1Var.d);
        } else {
            this.d = null;
        }
    }

    public void a(String str) {
        if (str == null) {
            str = "unk";
        }
        this.b++;
        this.c += str;
        this.c += "\n";
    }

    public void b(String str, Exception exc) {
        a(str + ": " + exc.getMessage());
    }

    public void c(String str) {
        if (str == null) {
            str = "unk";
        }
        this.a++;
        this.c += str;
        this.c += "\n";
    }

    public void d(String str) {
        if (str == null) {
            str = "unk";
        }
        this.a++;
        if (this.d == null) {
            this.d = new HashMap<>();
        }
        Integer num = this.d.get(str);
        if (num == null) {
            this.d.put(str, 1);
        } else {
            this.d.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public String e() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.c);
        HashMap<String, Integer> hashMap = this.d;
        if (hashMap != null) {
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                sb.append(entry.getKey());
                sb.append(" (");
                sb.append(entry.getValue());
                sb.append(")");
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public boolean f() {
        return this.b > 0;
    }

    public void g() {
        this.a = 0;
        this.b = 0;
        this.c = "";
        HashMap<String, Integer> hashMap = this.d;
        if (hashMap != null) {
            hashMap.clear();
            this.d = null;
        }
    }
}
