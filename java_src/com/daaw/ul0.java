package com.daaw;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class ul0 implements bc {
    public static final Bitmap.Config k = Bitmap.Config.ARGB_8888;
    public final xl0 a;
    public final Set<Bitmap.Config> b;
    public final int c;
    public final b d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* loaded from: classes.dex */
    public interface b {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* loaded from: classes.dex */
    public static class c implements b {
        public c() {
        }

        @Override // com.daaw.ul0.b
        public void a(Bitmap bitmap) {
        }

        @Override // com.daaw.ul0.b
        public void b(Bitmap bitmap) {
        }
    }

    public ul0(int i) {
        this(i, j(), i());
    }

    public ul0(int i, xl0 xl0Var, Set<Bitmap.Config> set) {
        this.c = i;
        this.e = i;
        this.a = xl0Var;
        this.b = set;
        this.d = new c();
    }

    public static Set<Bitmap.Config> i() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        return Collections.unmodifiableSet(hashSet);
    }

    public static xl0 j() {
        return new rd1();
    }

    @Override // com.daaw.bc
    public synchronized boolean a(Bitmap bitmap) {
        if (bitmap != null) {
            if (bitmap.isMutable() && this.a.e(bitmap) <= this.e && this.b.contains(bitmap.getConfig())) {
                int e = this.a.e(bitmap);
                this.a.a(bitmap);
                this.d.b(bitmap);
                this.i++;
                this.f += e;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Put bitmap in pool=");
                    sb.append(this.a.f(bitmap));
                }
                f();
                h();
                return true;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Reject bitmap from pool, bitmap: ");
                sb2.append(this.a.f(bitmap));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.b.contains(bitmap.getConfig()));
            }
            return false;
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    @Override // com.daaw.bc
    public synchronized Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap e;
        e = e(i, i2, config);
        if (e != null) {
            e.eraseColor(0);
        }
        return e;
    }

    @Override // com.daaw.bc
    @SuppressLint({"InlinedApi"})
    public void c(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
        }
        if (i >= 60) {
            d();
        } else if (i >= 40) {
            k(this.e / 2);
        }
    }

    @Override // com.daaw.bc
    public void d() {
        k(0);
    }

    @Override // com.daaw.bc
    @TargetApi(12)
    public synchronized Bitmap e(int i, int i2, Bitmap.Config config) {
        Bitmap b2;
        b2 = this.a.b(i, i2, config != null ? config : k);
        if (b2 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                sb.append(this.a.d(i, i2, config));
            }
            this.h++;
        } else {
            this.g++;
            this.f -= this.a.e(b2);
            this.d.a(b2);
            b2.setHasAlpha(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            sb2.append(this.a.d(i, i2, config));
        }
        f();
        return b2;
    }

    public final void f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            g();
        }
    }

    public final void g() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.g);
        sb.append(", misses=");
        sb.append(this.h);
        sb.append(", puts=");
        sb.append(this.i);
        sb.append(", evictions=");
        sb.append(this.j);
        sb.append(", currentSize=");
        sb.append(this.f);
        sb.append(", maxSize=");
        sb.append(this.e);
        sb.append("\nStrategy=");
        sb.append(this.a);
    }

    public final void h() {
        k(this.e);
    }

    public final synchronized void k(int i) {
        while (this.f > i) {
            Bitmap c2 = this.a.c();
            if (c2 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    g();
                }
                this.f = 0;
                return;
            }
            this.d.a(c2);
            this.f -= this.a.e(c2);
            c2.recycle();
            this.j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(this.a.f(c2));
            }
            f();
        }
    }
}
