package com.daaw;

import android.content.Context;
import android.os.IBinder;
/* loaded from: classes.dex */
public abstract class r31<T> {

    /* renamed from: a */
    public final String f24804a;

    /* renamed from: b */
    public Object f24805b;

    /* renamed from: com.daaw.r31$a */
    /* loaded from: classes.dex */
    public static class C2817a extends Exception {
        public C2817a(String str) {
            super(str);
        }

        public C2817a(String str, Throwable th) {
            super(str, th);
        }
    }

    public r31(String str) {
        this.f24804a = str;
    }

    /* renamed from: a */
    public abstract T mo1391a(IBinder iBinder);

    /* renamed from: b */
    public final T m11808b(Context context) {
        if (this.f24805b == null) {
            ry0.m10830j(context);
            Context m25525c = c80.m25525c(context);
            if (m25525c == null) {
                throw new C2817a("Could not get remote context.");
            }
            try {
                this.f24805b = mo1391a((IBinder) m25525c.getClassLoader().loadClass(this.f24804a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new C2817a("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new C2817a("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new C2817a("Could not instantiate creator.", e3);
            }
        }
        return (T) this.f24805b;
    }
}
