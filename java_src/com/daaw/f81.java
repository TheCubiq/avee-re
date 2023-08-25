package com.daaw;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.daaw.k81;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class f81 {

    /* renamed from: f */
    public static final C1260a f9224f = new C1260a(null);

    /* renamed from: g */
    public static final Class<? extends Object>[] f9225g;

    /* renamed from: a */
    public final Map<String, Object> f9226a = new LinkedHashMap();

    /* renamed from: b */
    public final Map<String, k81.InterfaceC1922c> f9227b = new LinkedHashMap();

    /* renamed from: c */
    public final Map<String, Object> f9228c = new LinkedHashMap();

    /* renamed from: d */
    public final Map<String, lr0<Object>> f9229d = new LinkedHashMap();

    /* renamed from: e */
    public final k81.InterfaceC1922c f9230e = new k81.InterfaceC1922c() { // from class: com.daaw.e81
        @Override // com.daaw.k81.InterfaceC1922c
        /* renamed from: a */
        public final Bundle mo5117a() {
            Bundle m22850d;
            m22850d = f81.m22850d(f81.this);
            return m22850d;
        }
    };

    /* renamed from: com.daaw.f81$a */
    /* loaded from: classes.dex */
    public static final class C1260a {
        public C1260a() {
        }

        public /* synthetic */ C1260a(C2575pq c2575pq) {
            this();
        }

        /* renamed from: a */
        public final boolean m22848a(Object obj) {
            Class[] clsArr;
            if (obj == null) {
                return true;
            }
            for (Class cls : f81.f9225g) {
                ug0.m8271c(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        Class<? extends Object>[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i = Build.VERSION.SDK_INT;
        clsArr[27] = i >= 21 ? Size.class : cls;
        if (i >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        f9225g = clsArr;
    }

    /* renamed from: d */
    public static final Bundle m22850d(f81 f81Var) {
        ug0.m8268f(f81Var, "this$0");
        for (Map.Entry entry : bn0.m25977i(f81Var.f9227b).entrySet()) {
            f81Var.m22849e((String) entry.getKey(), ((k81.InterfaceC1922c) entry.getValue()).mo5117a());
        }
        Set<String> keySet = f81Var.f9226a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(f81Var.f9226a.get(str));
        }
        return C3827zc.m2494a(no1.m14903a("keys", arrayList), no1.m14903a("values", arrayList2));
    }

    /* renamed from: c */
    public final k81.InterfaceC1922c m22851c() {
        return this.f9230e;
    }

    /* renamed from: e */
    public final <T> void m22849e(String str, T t) {
        ug0.m8268f(str, "key");
        if (!f9224f.m22848a(t)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            ug0.m8271c(t);
            sb.append(t.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj = this.f9228c.get(str);
        kr0 kr0Var = obj instanceof kr0 ? (kr0) obj : null;
        if (kr0Var != null) {
            kr0Var.mo15133j(t);
        } else {
            this.f9226a.put(str, t);
        }
        lr0<Object> lr0Var = this.f9229d.get(str);
        if (lr0Var == null) {
            return;
        }
        lr0Var.setValue(t);
    }
}
