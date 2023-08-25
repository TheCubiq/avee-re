package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.daaw.a30;
import com.daaw.b30;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class zo1 {
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, a30.c> a = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public class a implements c<b30.b> {
        public a() {
        }

        @Override // com.daaw.zo1.c
        /* renamed from: c */
        public int a(b30.b bVar) {
            return bVar.e();
        }

        @Override // com.daaw.zo1.c
        /* renamed from: d */
        public boolean b(b30.b bVar) {
            return bVar.f();
        }
    }

    /* loaded from: classes.dex */
    public class b implements c<a30.d> {
        public b() {
        }

        @Override // com.daaw.zo1.c
        /* renamed from: c */
        public int a(a30.d dVar) {
            return dVar.e();
        }

        @Override // com.daaw.zo1.c
        /* renamed from: d */
        public boolean b(a30.d dVar) {
            return dVar.f();
        }
    }

    /* loaded from: classes.dex */
    public interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    public static <T> T g(T[] tArr, int i, c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.a(t2) - i2) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    public static long j(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0L;
        }
    }

    public final void a(Typeface typeface, a30.c cVar) {
        long j = j(typeface);
        if (j != 0) {
            this.a.put(Long.valueOf(j), cVar);
        }
    }

    public Typeface b(Context context, a30.c cVar, Resources resources, int i) {
        a30.d f = f(cVar, i);
        if (f == null) {
            return null;
        }
        Typeface d = to1.d(context, resources, f.b(), f.a(), 0, i);
        a(d, cVar);
        return d;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, b30.b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(h(bVarArr, i).d());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface d = d(context, inputStream);
            ap1.a(inputStream);
            return d;
        } catch (IOException unused2) {
            ap1.a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            ap1.a(inputStream2);
            throw th;
        }
    }

    public Typeface d(Context context, InputStream inputStream) {
        File e = ap1.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (ap1.d(e, inputStream)) {
                return Typeface.createFromFile(e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        File e = ap1.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (ap1.c(e, resources, i)) {
                return Typeface.createFromFile(e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public final a30.d f(a30.c cVar, int i) {
        return (a30.d) g(cVar.a(), i, new b());
    }

    public b30.b h(b30.b[] bVarArr, int i) {
        return (b30.b) g(bVarArr, i, new a());
    }

    public a30.c i(Typeface typeface) {
        long j = j(typeface);
        if (j == 0) {
            return null;
        }
        return this.a.get(Long.valueOf(j));
    }
}
