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
/* renamed from: com.daaw.un */
/* loaded from: classes.dex */
public class C3239un {

    /* renamed from: a */
    public String f29226a;

    /* renamed from: b */
    public C3239un f29227b;

    /* renamed from: c */
    public JSONObject f29228c;

    /* renamed from: d */
    public int f29229d;

    /* renamed from: com.daaw.un$a */
    /* loaded from: classes.dex */
    public class C3240a implements Comparator<lo1<String, Integer>> {
        public C3240a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(lo1<String, Integer> lo1Var, lo1<String, Integer> lo1Var2) {
            return lo1Var.f17577b.intValue() - lo1Var2.f17577b.intValue();
        }
    }

    /* renamed from: com.daaw.un$b */
    /* loaded from: classes.dex */
    public class C3241b implements Comparator<String> {
        public C3241b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    /* renamed from: com.daaw.un$c */
    /* loaded from: classes.dex */
    public class C3242c implements Comparator<lo1<String, Integer>> {
        public C3242c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(lo1<String, Integer> lo1Var, lo1<String, Integer> lo1Var2) {
            return lo1Var.f17577b.intValue() - lo1Var2.f17577b.intValue();
        }
    }

    public C3239un(int i, JSONObject jSONObject, C3239un c3239un) {
        this.f29226a = "" + i;
        this.f29227b = c3239un;
        this.f29228c = jSONObject;
        m7952o0();
    }

    public C3239un(String str, JSONObject jSONObject, C3239un c3239un) {
        this.f29226a = str;
        this.f29227b = c3239un;
        this.f29228c = jSONObject;
        m7952o0();
    }

    /* renamed from: f */
    public static String m7971f(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            sb.append(str2);
            sb.append(";");
        }
        sb.append(";");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: y */
    public static String[] m7938y(String str) {
        String[] split = str.split("\\s+");
        return split.length < 1 ? new String[]{str} : split;
    }

    /* renamed from: A */
    public String m8004A() {
        return m7940w("tag", "");
    }

    /* renamed from: B */
    public String m8003B() {
        return m8002C("");
    }

    /* renamed from: C */
    public String m8002C(String str) {
        try {
            return this.f29228c.getString("v");
        } catch (JSONException unused) {
            return str;
        }
    }

    /* renamed from: D */
    public String m8001D() {
        JSONObject jSONObject = this.f29228c;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.getString("ver");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: E */
    public void m8000E(String str) {
        try {
            this.f29228c.put("v", str);
            this.f29228c.put("objType", str);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: F */
    public C3239un m7999F(String str, String str2, String str3, String[] strArr) {
        return m7998G(str, str2, str3, strArr, false);
    }

    /* renamed from: G */
    public C3239un m7998G(String str, String str2, String str3, String[] strArr, boolean z) {
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
            int i = this.f29229d;
            this.f29229d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str3);
            this.f29228c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
        return new C3239un(str, jSONObject, this);
    }

    /* renamed from: H */
    public final void m7997H(String str, float[] fArr, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", C0604a6.m27600b(fArr));
            jSONObject.put("t", str3);
            int i = this.f29229d;
            this.f29229d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.f29228c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: I */
    public void m7996I(String str, float[] fArr, String str2) {
        m7995J(str, fArr, str2, null);
    }

    /* renamed from: J */
    public void m7995J(String str, float[] fArr, String str2, String str3) {
        m7997H(str, fArr, str2, "chsla4f", str3);
    }

    /* renamed from: K */
    public void m7994K(String str, float[] fArr) {
        try {
            JSONObject optJSONObject = this.f29228c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", C0604a6.m27600b(fArr));
            this.f29228c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: L */
    public void m7993L(String str, boolean z, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", z ? 1 : 0);
            jSONObject.put("t", "b");
            int i = this.f29229d;
            this.f29229d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", (Object) null);
            this.f29228c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: M */
    public void m7992M(String str, boolean z) {
        try {
            JSONObject optJSONObject = this.f29228c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", z ? 1 : 0);
            this.f29228c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: N */
    public final void m7991N(String str, float f, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", f);
            jSONObject.put("t", str3);
            int i = this.f29229d;
            this.f29229d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.f29228c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: O */
    public void m7990O(String str, float f, String str2, float f2, float f3) {
        m7991N(str, f, str2, "f " + f2 + " " + f3, null);
    }

    /* renamed from: P */
    public void m7989P(String str, float f, String str2, float f2, float f3, String str3) {
        m7991N(str, f, str2, "f " + f2 + " " + f3, str3);
    }

    /* renamed from: Q */
    public void m7988Q(String str, float f) {
        try {
            JSONObject optJSONObject = this.f29228c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", f);
            this.f29228c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: R */
    public final void m7987R(String str, int i, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", i);
            jSONObject.put("t", str3);
            int i2 = this.f29229d;
            this.f29229d = i2 + 1;
            jSONObject.put("o", i2);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.f29228c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: S */
    public void m7986S(String str, int i, String str2) {
        m7987R(str, i, str2, "crgb", null);
    }

    /* renamed from: T */
    public void m7985T(String str, int i, String str2) {
        m7987R(str, i, str2, "crgba", null);
    }

    /* renamed from: U */
    public void m7984U(String str, int i, String str2) {
        m7987R(str, i, str2, "crgb_hl", null);
    }

    /* renamed from: V */
    public void m7983V(String str, int i, String str2) {
        m7987R(str, i, str2, "ih", null);
    }

    /* renamed from: W */
    public void m7982W(String str, int i, String str2, int i2, int i3) {
        m7987R(str, i, str2, "i " + i2 + " " + i3, null);
    }

    /* renamed from: X */
    public void m7981X(String str, int i, String str2, int i2, int i3) {
        m7987R(str, i, str2, "ih " + i2 + " " + i3, null);
    }

    /* renamed from: Y */
    public void m7980Y(String str, int i) {
        try {
            JSONObject optJSONObject = this.f29228c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", i);
            this.f29228c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: Z */
    public void m7979Z(String str, dm0 dm0Var, String str2, float f, float f2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", dm0Var.toString());
            jSONObject.put("t", "mvarf " + f + " " + f2);
            int i = this.f29229d;
            this.f29229d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            this.f29228c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a0 */
    public void m7978a0(String str, dm0 dm0Var) {
        try {
            JSONObject optJSONObject = this.f29228c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", dm0Var.toString());
            this.f29228c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b0 */
    public void m7977b0(String str, dm0 dm0Var, String str2, float f, float f2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", dm0Var.toString());
            jSONObject.put("t", "mvarf2 " + f + " " + f2);
            int i = this.f29229d;
            this.f29229d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            this.f29228c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: c0 */
    public void m7976c0(String str, String str2) {
        try {
            JSONObject optJSONObject = this.f29228c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            if (str2 == null) {
                str2 = "";
            }
            optJSONObject.put("v", str2);
            this.f29228c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: d */
    public Map<String, er0<String, Integer>> m7975d() {
        Iterator<String> keys = this.f29228c.keys();
        TreeMap treeMap = new TreeMap(new C3241b());
        while (keys.hasNext()) {
            String next = keys.next();
            String m7951p = m7951p(next, "0_general");
            if (m7951p.length() > 0) {
                er0 er0Var = (er0) treeMap.get(m7951p);
                if (er0Var == null) {
                    er0Var = new er0();
                    treeMap.put(m7951p, er0Var);
                }
                er0Var.add(new lo1(next, Integer.valueOf(m7943t(next))));
            }
        }
        for (er0 er0Var2 : treeMap.values()) {
            Collections.sort(er0Var2, new C3242c());
        }
        return treeMap;
    }

    /* renamed from: d0 */
    public final void m7974d0(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("v", str2);
            jSONObject.put("t", str4);
            int i = this.f29229d;
            this.f29229d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str3);
            this.f29228c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: e */
    public Iterator<String> m7973e() {
        Iterator<String> keys = this.f29228c.keys();
        er0 er0Var = new er0();
        while (keys.hasNext()) {
            String next = keys.next();
            er0Var.add(new lo1(next, Integer.valueOf(m7943t(next))));
        }
        Collections.sort(er0Var, new C3240a());
        return er0Var.m23266q();
    }

    /* renamed from: e0 */
    public void m7972e0(String str, String str2, String str3, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("passet");
        for (String str4 : strArr) {
            sb.append(" ");
            sb.append(str4);
        }
        m7974d0(str, str2, str3, sb.toString());
    }

    /* renamed from: f0 */
    public void m7970f0(String str, String str2, String str3, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("img");
        for (String str4 : strArr) {
            sb.append(" ");
            sb.append(str4);
        }
        m7974d0(str, str2, str3, sb.toString());
    }

    /* renamed from: g */
    public void m7969g(String str, String str2) {
        if (this.f29228c == null) {
            return;
        }
        while (this.f29228c.length() > 0) {
            JSONObject jSONObject = this.f29228c;
            jSONObject.remove(jSONObject.keys().next());
        }
        m8000E(str);
        m7946r0(str2);
    }

    /* renamed from: g0 */
    public void m7968g0(String str, String str2, String str3, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("pimg");
        for (String str4 : strArr) {
            sb.append(" ");
            sb.append(str4);
        }
        m7974d0(str, str2, str3, sb.toString());
    }

    /* renamed from: h */
    public C3239un m7967h(String str) {
        try {
            return new C3239un(str, this.f29228c.getJSONObject(str), this);
        } catch (JSONException unused) {
            return new C3239un(str, new JSONObject(), this);
        }
    }

    /* renamed from: h0 */
    public void m7966h0(String str, String str2, String str3) {
        m7974d0(str, str2, str3, "ptxt");
    }

    /* renamed from: i */
    public String m7965i() {
        try {
            return this.f29228c.getString("_name");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: i0 */
    public void m7964i0(String str, String str2) {
        try {
            JSONObject optJSONObject = this.f29228c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            if (str2 == null) {
                str2 = "";
            }
            optJSONObject.put("v", str2);
            this.f29228c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: j */
    public ArrayList<String> m7963j() {
        ArrayList<String> arrayList = new ArrayList<>();
        m7961k(arrayList);
        return arrayList;
    }

    /* renamed from: j0 */
    public final void m7962j0(String str, bs1 bs1Var, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", bs1Var.toString());
            jSONObject.put("t", str3);
            int i = this.f29229d;
            this.f29229d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str2);
            jSONObject.put("hint", str4);
            this.f29228c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: k */
    public final void m7961k(List<String> list) {
        C3239un c3239un = this.f29227b;
        if (c3239un != null) {
            c3239un.m7961k(list);
        }
        list.add(this.f29226a);
    }

    /* renamed from: k0 */
    public void m7960k0(String str, bs1 bs1Var, String str2, float f, float f2) {
        m7962j0(str, bs1Var, str2, "f2 " + f + " " + f2, null);
    }

    /* renamed from: l */
    public C3239un m7959l() {
        return this.f29227b;
    }

    /* renamed from: l0 */
    public void m7958l0(String str, bs1 bs1Var) {
        try {
            JSONObject optJSONObject = this.f29228c.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", bs1Var.toString());
            this.f29228c.put(str, optJSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: m */
    public float[] m7957m(String str, float[] fArr) {
        try {
            float[] fArr2 = new float[4];
            C0604a6.m27601a(this.f29228c.getJSONObject(str).getString("v"), fArr2, fArr);
            return fArr2;
        } catch (JSONException unused) {
            return fArr;
        }
    }

    /* renamed from: m0 */
    public void m7956m0(String str, String str2, String str3, String[] strArr) {
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
            int i = this.f29229d;
            this.f29229d = i + 1;
            jSONObject.put("o", i);
            jSONObject.put("tag", str3);
            this.f29228c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: n */
    public boolean m7955n(String str, boolean z) {
        try {
            return this.f29228c.getJSONObject(str).getInt("v") != 0;
        } catch (JSONException unused) {
            return z;
        }
    }

    /* renamed from: n0 */
    public void m7954n0(String str) {
        this.f29228c.remove(str);
    }

    /* renamed from: o */
    public float m7953o(String str, float f) {
        try {
            return (float) this.f29228c.getJSONObject(str).getDouble("v");
        } catch (JSONException unused) {
            return f;
        }
    }

    /* renamed from: o0 */
    public final void m7952o0() {
        this.f29229d = 0;
    }

    /* renamed from: p */
    public String m7951p(String str, String str2) {
        try {
            return this.f29228c.getJSONObject(str).getString("tag");
        } catch (JSONException unused) {
            return str2;
        }
    }

    /* renamed from: p0 */
    public void m7950p0(String str) {
        try {
            this.f29228c.put("_name", str);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: q */
    public String m7949q(String str) {
        try {
            return this.f29228c.getJSONObject(str).getString("hint");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: q0 */
    public void m7948q0(String str) {
        m7966h0("tag", str, "0_general");
    }

    /* renamed from: r */
    public int m7947r(String str, int i) {
        try {
            return this.f29228c.getJSONObject(str).getInt("v");
        } catch (JSONException unused) {
            return i;
        }
    }

    /* renamed from: r0 */
    public void m7946r0(String str) {
        JSONObject jSONObject = this.f29228c;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("ver", str);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: s */
    public dm0 m7945s(String str, dm0 dm0Var) {
        try {
            return dm0.m24230c(this.f29228c.getJSONObject(str).getString("v"), dm0Var);
        } catch (JSONException unused) {
            return dm0Var;
        }
    }

    /* renamed from: s0 */
    public void m7944s0(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = this.f29228c.getJSONObject(str);
            jSONObject.put("t", str2);
            jSONObject.put("hint", str3);
            this.f29228c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: t */
    public int m7943t(String str) {
        try {
            return this.f29228c.getJSONObject(str).getInt("o");
        } catch (JSONException unused) {
            return -1;
        }
    }

    /* renamed from: u */
    public String m7942u(String str, String str2) {
        try {
            return this.f29228c.getJSONObject(str).getString("v");
        } catch (JSONException unused) {
            return str2;
        }
    }

    /* renamed from: v */
    public int m7941v(String str, String[] strArr, int i) {
        return br1.m25903f(strArr, m7942u(str, br1.m25908a(strArr, i, strArr[0])), i);
    }

    /* renamed from: w */
    public String m7940w(String str, String str2) {
        try {
            return this.f29228c.getJSONObject(str).getString("v");
        } catch (JSONException unused) {
            return str2;
        }
    }

    /* renamed from: x */
    public String m7939x(String str) {
        try {
            return this.f29228c.getJSONObject(str).getString("t");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: z */
    public bs1 m7937z(String str, bs1 bs1Var) {
        try {
            return bs1.m25862a(this.f29228c.getJSONObject(str).getString("v"), bs1Var);
        } catch (JSONException unused) {
            return bs1Var;
        }
    }
}
