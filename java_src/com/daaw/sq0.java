package com.daaw;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
/* loaded from: classes2.dex */
public class sq0 {

    /* renamed from: a */
    public long f26520a;

    /* renamed from: b */
    public long f26521b;

    /* renamed from: c */
    public TimeInterpolator f26522c;

    /* renamed from: d */
    public int f26523d;

    /* renamed from: e */
    public int f26524e;

    public sq0(long j, long j2) {
        this.f26522c = null;
        this.f26523d = 0;
        this.f26524e = 1;
        this.f26520a = j;
        this.f26521b = j2;
    }

    public sq0(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f26523d = 0;
        this.f26524e = 1;
        this.f26520a = j;
        this.f26521b = j2;
        this.f26522c = timeInterpolator;
    }

    /* renamed from: b */
    public static sq0 m10051b(ValueAnimator valueAnimator) {
        sq0 sq0Var = new sq0(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m10047f(valueAnimator));
        sq0Var.f26523d = valueAnimator.getRepeatCount();
        sq0Var.f26524e = valueAnimator.getRepeatMode();
        return sq0Var;
    }

    /* renamed from: f */
    public static TimeInterpolator m10047f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C1247f3.f9052b : interpolator instanceof AccelerateInterpolator ? C1247f3.f9053c : interpolator instanceof DecelerateInterpolator ? C1247f3.f9054d : interpolator;
    }

    /* renamed from: a */
    public void m10052a(Animator animator) {
        animator.setStartDelay(m10050c());
        animator.setDuration(m10049d());
        animator.setInterpolator(m10048e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m10046g());
            valueAnimator.setRepeatMode(m10045h());
        }
    }

    /* renamed from: c */
    public long m10050c() {
        return this.f26520a;
    }

    /* renamed from: d */
    public long m10049d() {
        return this.f26521b;
    }

    /* renamed from: e */
    public TimeInterpolator m10048e() {
        TimeInterpolator timeInterpolator = this.f26522c;
        return timeInterpolator != null ? timeInterpolator : C1247f3.f9052b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sq0) {
            sq0 sq0Var = (sq0) obj;
            if (m10050c() == sq0Var.m10050c() && m10049d() == sq0Var.m10049d() && m10046g() == sq0Var.m10046g() && m10045h() == sq0Var.m10045h()) {
                return m10048e().getClass().equals(sq0Var.m10048e().getClass());
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    public int m10046g() {
        return this.f26523d;
    }

    /* renamed from: h */
    public int m10045h() {
        return this.f26524e;
    }

    public int hashCode() {
        return (((((((((int) (m10050c() ^ (m10050c() >>> 32))) * 31) + ((int) (m10049d() ^ (m10049d() >>> 32)))) * 31) + m10048e().getClass().hashCode()) * 31) + m10046g()) * 31) + m10045h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m10050c() + " duration: " + m10049d() + " interpolator: " + m10048e().getClass() + " repeatCount: " + m10046g() + " repeatMode: " + m10045h() + "}\n";
    }
}
