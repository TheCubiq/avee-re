package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class rq0 {

    /* renamed from: a */
    public final cd1<String, sq0> f25509a = new cd1<>();

    /* renamed from: b */
    public final cd1<String, PropertyValuesHolder[]> f25510b = new cd1<>();

    /* renamed from: a */
    public static void m11071a(rq0 rq0Var, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            rq0Var.m11064h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            rq0Var.m11063i(objectAnimator.getPropertyName(), sq0.m10051b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: b */
    public static rq0 m11070b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m11069c(context, resourceId);
    }

    /* renamed from: c */
    public static rq0 m11069c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m11068d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return m11068d(arrayList);
            }
            return null;
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            return null;
        }
    }

    /* renamed from: d */
    public static rq0 m11068d(List<Animator> list) {
        rq0 rq0Var = new rq0();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m11071a(rq0Var, list.get(i));
        }
        return rq0Var;
    }

    /* renamed from: e */
    public sq0 m11067e(String str) {
        if (m11065g(str)) {
            return this.f25509a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rq0) {
            return this.f25509a.equals(((rq0) obj).f25509a);
        }
        return false;
    }

    /* renamed from: f */
    public long m11066f() {
        int size = this.f25509a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            sq0 m25432m = this.f25509a.m25432m(i);
            j = Math.max(j, m25432m.m10050c() + m25432m.m10049d());
        }
        return j;
    }

    /* renamed from: g */
    public boolean m11065g(String str) {
        return this.f25509a.get(str) != null;
    }

    /* renamed from: h */
    public void m11064h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f25510b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f25509a.hashCode();
    }

    /* renamed from: i */
    public void m11063i(String str, sq0 sq0Var) {
        this.f25509a.put(str, sq0Var);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f25509a + "}\n";
    }
}
