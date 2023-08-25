package com.daaw;

import android.app.Notification;
/* loaded from: classes.dex */
public final class g30 {

    /* renamed from: a */
    public final int f10223a;

    /* renamed from: b */
    public final int f10224b;

    /* renamed from: c */
    public final Notification f10225c;

    public g30(int i, Notification notification, int i2) {
        this.f10223a = i;
        this.f10225c = notification;
        this.f10224b = i2;
    }

    /* renamed from: a */
    public int m22055a() {
        return this.f10224b;
    }

    /* renamed from: b */
    public Notification m22054b() {
        return this.f10225c;
    }

    /* renamed from: c */
    public int m22053c() {
        return this.f10223a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g30.class != obj.getClass()) {
            return false;
        }
        g30 g30Var = (g30) obj;
        if (this.f10223a == g30Var.f10223a && this.f10224b == g30Var.f10224b) {
            return this.f10225c.equals(g30Var.f10225c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f10223a * 31) + this.f10224b) * 31) + this.f10225c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f10223a + ", mForegroundServiceType=" + this.f10224b + ", mNotification=" + this.f10225c + '}';
    }
}
