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
    public final cd1<String, sq0> a = new cd1<>();
    public final cd1<String, PropertyValuesHolder[]> b = new cd1<>();

    public static void a(rq0 rq0Var, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            rq0Var.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            rq0Var.i(objectAnimator.getPropertyName(), sq0.b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public static rq0 b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static rq0 c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return d(arrayList);
            }
            return null;
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            return null;
        }
    }

    public static rq0 d(List<Animator> list) {
        rq0 rq0Var = new rq0();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(rq0Var, list.get(i));
        }
        return rq0Var;
    }

    public sq0 e(String str) {
        if (g(str)) {
            return this.a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rq0) {
            return this.a.equals(((rq0) obj).a);
        }
        return false;
    }

    public long f() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            sq0 m = this.a.m(i);
            j = Math.max(j, m.c() + m.d());
        }
        return j;
    }

    public boolean g(String str) {
        return this.a.get(str) != null;
    }

    public void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i(String str, sq0 sq0Var) {
        this.a.put(str, sq0Var);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
