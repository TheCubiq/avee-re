package com.daaw;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class wf1 {

    /* renamed from: a */
    public int f31208a;

    /* renamed from: b */
    public int f31209b;

    /* renamed from: c */
    public String f31210c;

    /* renamed from: d */
    public HashMap<String, Integer> f31211d;

    public wf1() {
        this.f31208a = 0;
        this.f31209b = 0;
        this.f31210c = "";
    }

    public wf1(wf1 wf1Var) {
        this.f31208a = wf1Var.f31208a;
        this.f31209b = wf1Var.f31209b;
        this.f31210c = wf1Var.f31210c;
        if (wf1Var.f31211d != null) {
            this.f31211d = new HashMap<>(wf1Var.f31211d);
        } else {
            this.f31211d = null;
        }
    }

    /* renamed from: a */
    public void m6096a(String str) {
        if (str == null) {
            str = "unk";
        }
        this.f31209b++;
        this.f31210c += str;
        this.f31210c += "\n";
    }

    /* renamed from: b */
    public void m6095b(String str, Exception exc) {
        m6096a(str + ": " + exc.getMessage());
    }

    /* renamed from: c */
    public void m6094c(String str) {
        if (str == null) {
            str = "unk";
        }
        this.f31208a++;
        this.f31210c += str;
        this.f31210c += "\n";
    }

    /* renamed from: d */
    public void m6093d(String str) {
        if (str == null) {
            str = "unk";
        }
        this.f31208a++;
        if (this.f31211d == null) {
            this.f31211d = new HashMap<>();
        }
        Integer num = this.f31211d.get(str);
        if (num == null) {
            this.f31211d.put(str, 1);
        } else {
            this.f31211d.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* renamed from: e */
    public String m6092e() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f31210c);
        HashMap<String, Integer> hashMap = this.f31211d;
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

    /* renamed from: f */
    public boolean m6091f() {
        return this.f31209b > 0;
    }

    /* renamed from: g */
    public void m6090g() {
        this.f31208a = 0;
        this.f31209b = 0;
        this.f31210c = "";
        HashMap<String, Integer> hashMap = this.f31211d;
        if (hashMap != null) {
            hashMap.clear();
            this.f31211d = null;
        }
    }
}
