package com.daaw;

import android.content.Context;
import android.os.IBinder;
/* loaded from: classes.dex */
public abstract class r31<T> {
    public final String a;
    public Object b;

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    public r31(String str) {
        this.a = str;
    }

    public abstract T a(IBinder iBinder);

    public final T b(Context context) {
        if (this.b == null) {
            ry0.j(context);
            Context c = c80.c(context);
            if (c == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.b = a((IBinder) c.getClassLoader().loadClass(this.a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new a("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new a("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new a("Could not instantiate creator.", e3);
            }
        }
        return (T) this.b;
    }
}
