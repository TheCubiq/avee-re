package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.daaw.tx0;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class wx0 {
    public static final ExecutorService a = Executors.newFixedThreadPool(2);

    public static void c(Context context, final tx0 tx0Var, Uri uri, String str, final Handler handler, final e0<tx0.b> e0Var) {
        final Object[] objArr = {context, uri, str};
        a.submit(new Callable() { // from class: com.daaw.vx0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                tx0.b f;
                f = wx0.f(tx0.this, objArr, handler, e0Var);
                return f;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.daaw.tx0.c d(android.content.Context r8, android.net.Uri r9, com.daaw.tx0.b r10) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.wx0.d(android.content.Context, android.net.Uri, com.daaw.tx0$b):com.daaw.tx0$c");
    }

    public static /* synthetic */ tx0.b f(tx0 tx0Var, Object[] objArr, Handler handler, final e0 e0Var) {
        final tx0.b e = tx0Var.e(objArr);
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.ux0
                @Override // java.lang.Runnable
                public final void run() {
                    e0.this.a(e);
                }
            });
        } else {
            e0Var.a(e);
        }
        return e;
    }
}
