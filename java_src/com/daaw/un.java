package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class un {
    public String a;
    public un b;
    public JSONObject c;
    public int d;

    /* loaded from: classes.dex */
    public class a implements Comparator<lo1<String, Integer>> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(lo1<String, Integer> lo1Var, lo1<String, Integer> lo1Var2) {
            return lo1Var.b.intValue() - lo1Var2.b.intValue();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Comparator<String> {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Comparator<lo1<String, Integer>> {
        public c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(lo1<String, Integer> lo1Var, lo1<String, Integer> lo1Var2) {
            return lo1Var.b.intValue() - lo1Var2.b.intValue();
        }
    }

    public un(int i, JSONObject jSONObject, un unVar) {
        this.a = "" + i;
        this.b = unVar;
        this.c = jSONObject;
        o0();
    }

    public un(String str, JSONObject jSONObject, un unVar) {
        this.a = str;
        this.b = unVar;
        this.c = jSONObject;
        o0();
    }

    public static String f(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            sb.append(str2);
            sb.append(";");
        }
        sb.append(";");
        sb.append(str);
        return sb.toString();
    }

    public static String[] y(String str) {
        String[] split = str.split("\\s+");
        return split.length < 1 ? new String[]{str} : split;
    }

    public String A() {
        return w("tag", "");
    }

    public String B() {
        return C("");
    }

    public String C(String str) {
        try {
            return this.c.getString("v");
        } catch (JSONException unused) {
            return str;
        }
    }

    public String D() {
        JSONObject jSONObject = this.c;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.getString("ver");
        } catch (JSONException unused) {
            return "";
        }
    }

    public void E(String str) {
        try {
            this.c.put("v", str);
            this.c.put("objType", str);
        } catch (JSONException unused) {
        }
    }

    public un F(String str, String str2, String str3, String[] strArr) {
        return G(str, str2, str3, strArr, false);
    }

    public un G(String str, String str2, String str3, String[] strArr, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("_child");
            for (String str4 : strArr) {
                sb.append(" ");
                sb.append(str4);
            }
            jSONObject.put("v", str2);
            jSONObject.put("t", sb.toString());
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str3);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
        return new un(str, jSONObject, this);
    }

    public final void H(String str, float[] fArr, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", a6.b(fArr));
            jSONObject.put("t", str3);
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void I(String str, float[] fArr, String str2) {
        J(str, fArr, str2, null);
    }

    public void J(String str, float[] fArr, String str2, String str3) {
        H(str, fArr, str2, "chsla4f", str3);
    }

    public void K(String str, float[] fArr) {
        try {
            JSONObject optJSONObject = this.c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", a6.b(fArr));
            this.c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    public void L(String str, boolean z, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", z ? 1 : 0);
            jSONObject.put("t", "b");
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", (Object) null);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void M(String str, boolean z) {
        try {
            JSONObject optJSONObject = this.c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", z ? 1 : 0);
            this.c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    public final void N(String str, float f, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", f);
            jSONObject.put("t", str3);
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void O(String str, float f, String str2, float f2, float f3) {
        N(str, f, str2, "f " + f2 + " " + f3, null);
    }

    public void P(String str, float f, String str2, float f2, float f3, String str3) {
        N(str, f, str2, "f " + f2 + " " + f3, str3);
    }

    public void Q(String str, float f) {
        try {
            JSONObject optJSONObject = this.c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", f);
            this.c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    public final void R(String str, int i, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", i);
            jSONObject.put("t", str3);
            int i2 = this.d;
            this.d = i2 + 1;
            jSONObject.put("o", i2);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void S(String str, int i, String str2) {
        R(str, i, str2, "crgb", null);
    }

    public void T(String str, int i, String str2) {
        R(str, i, str2, "crgba", null);
    }

    public void U(String str, int i, String str2) {
        R(str, i, str2, "crgb_hl", null);
    }

    public void V(String str, int i, String str2) {
        R(str, i, str2, "ih", null);
    }

    public void W(String str, int i, String str2, int i2, int i3) {
        R(str, i, str2, "i " + i2 + " " + i3, null);
    }

    public void X(String str, int i, String str2, int i2, int i3) {
        R(str, i, str2, "ih " + i2 + " " + i3, null);
    }

    public void Y(String str, int i) {
        try {
            JSONObject optJSONObject = this.c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", i);
            this.c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    public void Z(String str, dm0 dm0Var, String str2, float f, float f2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", dm0Var.toString());
            jSONObject.put("t", "mvarf " + f + " " + f2);
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void a0(String str, dm0 dm0Var) {
        try {
            JSONObject optJSONObject = this.c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", dm0Var.toString());
            this.c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    public void b0(String str, dm0 dm0Var, String str2, float f, float f2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", dm0Var.toString());
            jSONObject.put("t", "mvarf2 " + f + " " + f2);
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void c0(String str, String str2) {
        try {
            JSONObject optJSONObject = this.c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            if (str2 == null) {
                str2 = "";
            }
            optJSONObject.put("v", str2);
            this.c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    public Map<String, er0<String, Integer>> d() {
        Iterator<String> keys = this.c.keys();
        TreeMap treeMap = new TreeMap(new b());
        while (keys.hasNext()) {
            String next = keys.next();
            String p = p(next, "0_general");
            if (p.length() > 0) {
                er0 er0Var = (er0) treeMap.get(p);
                if (er0Var == null) {
                    er0Var = new er0();
                    treeMap.put(p, er0Var);
                }
                er0Var.add(new lo1(next, Integer.valueOf(t(next))));
            }
        }
        for (er0 er0Var2 : treeMap.values()) {
            Collections.sort(er0Var2, new c());
        }
        return treeMap;
    }

    public final void d0(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("v", str2);
            jSONObject.put("t", str4);
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str3);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public Iterator<String> e() {
        Iterator<String> keys = this.c.keys();
        er0 er0Var = new er0();
        while (keys.hasNext()) {
            String next = keys.next();
            er0Var.add(new lo1(next, Integer.valueOf(t(next))));
        }
        Collections.sort(er0Var, new a());
        return er0Var.q();
    }

    public void e0(String str, String str2, String str3, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("passet");
        for (String str4 : strArr) {
            sb.append(" ");
            sb.append(str4);
        }
        d0(str, str2, str3, sb.toString());
    }

    public void f0(String str, String str2, String str3, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("img");
        for (String str4 : strArr) {
            sb.append(" ");
            sb.append(str4);
        }
        d0(str, str2, str3, sb.toString());
    }

    public void g(String str, String str2) {
        if (this.c == null) {
            return;
        }
        while (this.c.length() > 0) {
            JSONObject jSONObject = this.c;
            jSONObject.remove(jSONObject.keys().next());
        }
        E(str);
        r0(str2);
    }

    public void g0(String str, String str2, String str3, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("pimg");
        for (String str4 : strArr) {
            sb.append(" ");
            sb.append(str4);
        }
        d0(str, str2, str3, sb.toString());
    }

    public un h(String str) {
        try {
            return new un(str, this.c.getJSONObject(str), this);
        } catch (JSONException unused) {
            return new un(str, new JSONObject(), this);
        }
    }

    public void h0(String str, String str2, String str3) {
        d0(str, str2, str3, "ptxt");
    }

    public String i() {
        try {
            return this.c.getString("_name");
        } catch (JSONException unused) {
            return "";
        }
    }

    public void i0(String str, String str2) {
        try {
            JSONObject optJSONObject = this.c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            if (str2 == null) {
                str2 = "";
            }
            optJSONObject.put("v", str2);
            this.c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    public ArrayList<String> j() {
        ArrayList<String> arrayList = new ArrayList<>();
        k(arrayList);
        return arrayList;
    }

    public final void j0(String str, bs1 bs1Var, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", bs1Var.toString());
            jSONObject.put("t", str3);
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public final void k(List<String> list) {
        un unVar = this.b;
        if (unVar != null) {
            unVar.k(list);
        }
        list.add(this.a);
    }

    public void k0(String str, bs1 bs1Var, String str2, float f, float f2) {
        j0(str, bs1Var, str2, "f2 " + f + " " + f2, null);
    }

    public un l() {
        return this.b;
    }

    public void l0(String str, bs1 bs1Var) {
        try {
            JSONObject optJSONObject = this.c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", bs1Var.toString());
            this.c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    public float[] m(String str, float[] fArr) {
        try {
            float[] fArr2 = new float[4];
            a6.a(this.c.getJSONObject(str).getString("v"), fArr2, fArr);
            return fArr2;
        } catch (JSONException unused) {
            return fArr;
        }
    }

    public void m0(String str, String str2, String str3, String[] strArr) {
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append("sel");
            for (String str4 : strArr) {
                sb.append(" ");
                sb.append(str4);
            }
            jSONObject.put("v", str2);
            jSONObject.put("t", sb.toString());
            int i = this.d;
            this.d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str3);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public boolean n(String str, boolean z) {
        try {
            return this.c.getJSONObject(str).getInt("v") != 0;
        } catch (JSONException unused) {
            return z;
        }
    }

    public void n0(String str) {
        this.c.remove(str);
    }

    public float o(String str, float f) {
        try {
            return (float) this.c.getJSONObject(str).getDouble("v");
        } catch (JSONException unused) {
            return f;
        }
    }

    public final void o0() {
        this.d = 0;
    }

    public String p(String str, String str2) {
        try {
            return this.c.getJSONObject(str).getString("tag");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public void p0(String str) {
        try {
            this.c.put("_name", str);
        } catch (JSONException unused) {
        }
    }

    public String q(String str) {
        try {
            return this.c.getJSONObject(str).getString("hint");
        } catch (JSONException unused) {
            return "";
        }
    }

    public void q0(String str) {
        h0("tag", str, "0_general");
    }

    public int r(String str, int i) {
        try {
            return this.c.getJSONObject(str).getInt("v");
        } catch (JSONException unused) {
            return i;
        }
    }

    public void r0(String str) {
        JSONObject jSONObject = this.c;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("ver", str);
        } catch (JSONException unused) {
        }
    }

    public dm0 s(String str, dm0 dm0Var) {
        try {
            return dm0.c(this.c.getJSONObject(str).getString("v"), dm0Var);
        } catch (JSONException unused) {
            return dm0Var;
        }
    }

    public void s0(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = this.c.getJSONObject(str);
            jSONObject.put("t", str2);
            jSONObject.put("hint", str3);
            this.c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public int t(String str) {
        try {
            return this.c.getJSONObject(str).getInt("o");
        } catch (JSONException unused) {
            return -1;
        }
    }

    public String u(String str, String str2) {
        try {
            return this.c.getJSONObject(str).getString("v");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public int v(String str, String[] strArr, int i) {
        return br1.f(strArr, u(str, br1.a(strArr, i, strArr[0])), i);
    }

    public String w(String str, String str2) {
        try {
            return this.c.getJSONObject(str).getString("v");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public String x(String str) {
        try {
            return this.c.getJSONObject(str).getString("t");
        } catch (JSONException unused) {
            return "";
        }
    }

    public bs1 z(String str, bs1 bs1Var) {
        try {
            return bs1.a(this.c.getJSONObject(str).getString("v"), bs1Var);
        } catch (JSONException unused) {
            return bs1Var;
        }
    }
}
