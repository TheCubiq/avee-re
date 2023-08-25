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
    public static final a f = new a(null);
    public static final Class<? extends Object>[] g;
    public final Map<String, Object> a = new LinkedHashMap();
    public final Map<String, k81.c> b = new LinkedHashMap();
    public final Map<String, Object> c = new LinkedHashMap();
    public final Map<String, lr0<Object>> d = new LinkedHashMap();
    public final k81.c e = new k81.c() { // from class: com.daaw.e81
        @Override // com.daaw.k81.c
        public final Bundle a() {
            Bundle d;
            d = f81.d(f81.this);
            return d;
        }
    };

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }

        public final boolean a(Object obj) {
            Class[] clsArr;
            if (obj == null) {
                return true;
            }
            for (Class cls : f81.g) {
                ug0.c(cls);
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
        g = clsArr;
    }

    public static final Bundle d(f81 f81Var) {
        ug0.f(f81Var, "this$0");
        for (Map.Entry entry : bn0.i(f81Var.b).entrySet()) {
            f81Var.e((String) entry.getKey(), ((k81.c) entry.getValue()).a());
        }
        Set<String> keySet = f81Var.a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(f81Var.a.get(str));
        }
        return zc.a(no1.a("keys", arrayList), no1.a("values", arrayList2));
    }

    public final k81.c c() {
        return this.e;
    }

    public final <T> void e(String str, T t) {
        ug0.f(str, "key");
        if (!f.a(t)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            ug0.c(t);
            sb.append(t.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj = this.c.get(str);
        kr0 kr0Var = obj instanceof kr0 ? (kr0) obj : null;
        if (kr0Var != null) {
            kr0Var.j(t);
        } else {
            this.a.put(str, t);
        }
        lr0<Object> lr0Var = this.d.get(str);
        if (lr0Var == null) {
            return;
        }
        lr0Var.setValue(t);
    }
}
