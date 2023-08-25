package com.daaw;

import android.util.Log;
import com.daaw.ut;
import com.daaw.yt;
import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public class au implements ut {
    public static au f;
    public final xt a = new xt();
    public final w71 b = new w71();
    public final File c;
    public final int d;
    public yt e;

    public au(File file, int i) {
        this.c = file;
        this.d = i;
    }

    public static synchronized ut d(File file, int i) {
        au auVar;
        synchronized (au.class) {
            if (f == null) {
                f = new au(file, i);
            }
            auVar = f;
        }
        return auVar;
    }

    @Override // com.daaw.ut
    public void a(hi0 hi0Var) {
        try {
            e().c0(this.b.a(hi0Var));
        } catch (IOException unused) {
        }
    }

    @Override // com.daaw.ut
    public void b(hi0 hi0Var, ut.b bVar) {
        String a = this.b.a(hi0Var);
        this.a.a(hi0Var);
        try {
            try {
                yt.b T = e().T(a);
                if (T != null) {
                    try {
                        if (bVar.a(T.f(0))) {
                            T.e();
                        }
                        T.b();
                    } catch (Throwable th) {
                        T.b();
                        throw th;
                    }
                }
            } finally {
                this.a.b(hi0Var);
            }
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
        }
    }

    @Override // com.daaw.ut
    public File c(hi0 hi0Var) {
        try {
            yt.d V = e().V(this.b.a(hi0Var));
            if (V != null) {
                return V.a(0);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public final synchronized yt e() {
        if (this.e == null) {
            this.e = yt.X(this.c, 1, 1, this.d);
        }
        return this.e;
    }
}
