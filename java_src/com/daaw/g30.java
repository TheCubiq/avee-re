package com.daaw;

import android.app.Notification;
/* loaded from: classes.dex */
public final class g30 {
    public final int a;
    public final int b;
    public final Notification c;

    public g30(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public Notification b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g30.class != obj.getClass()) {
            return false;
        }
        g30 g30Var = (g30) obj;
        if (this.a == g30Var.a && this.b == g30Var.b) {
            return this.c.equals(g30Var.c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
