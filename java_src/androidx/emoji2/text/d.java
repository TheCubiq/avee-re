package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.b;
import androidx.emoji2.text.d;
import com.daaw.aj;
import com.daaw.ap1;
import com.daaw.b30;
import com.daaw.lm1;
import com.daaw.ty0;
import com.daaw.x20;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes.dex */
public class d extends b.c {
    public static final a j = new a();

    /* loaded from: classes.dex */
    public static class a {
        public Typeface a(Context context, b30.b bVar) {
            return b30.a(context, null, new b30.b[]{bVar});
        }

        public b30.a b(Context context, x20 x20Var) {
            return b30.b(context, null, x20Var);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements b.g {
        public final Context a;
        public final x20 b;
        public final a c;
        public final Object d = new Object();
        public Handler e;
        public Executor f;
        public ThreadPoolExecutor g;
        public b.h h;
        public ContentObserver i;
        public Runnable j;

        public b(Context context, x20 x20Var, a aVar) {
            ty0.g(context, "Context cannot be null");
            ty0.g(x20Var, "FontRequest cannot be null");
            this.a = context.getApplicationContext();
            this.b = x20Var;
            this.c = aVar;
        }

        @Override // androidx.emoji2.text.b.g
        public void a(b.h hVar) {
            ty0.g(hVar, "LoaderCallback cannot be null");
            synchronized (this.d) {
                this.h = hVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.d) {
                this.h = null;
                ContentObserver contentObserver = this.i;
                if (contentObserver != null) {
                    this.c.c(this.a, contentObserver);
                    this.i = null;
                }
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(this.j);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            }
        }

        public void c() {
            synchronized (this.d) {
                if (this.h == null) {
                    return;
                }
                try {
                    b30.b e = e();
                    int b = e.b();
                    if (b == 2) {
                        synchronized (this.d) {
                        }
                    }
                    if (b != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + b + ")");
                    }
                    lm1.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                    Typeface a = this.c.a(this.a, e);
                    ByteBuffer f = ap1.f(this.a, null, e.d());
                    if (f == null || a == null) {
                        throw new RuntimeException("Unable to open file.");
                    }
                    e b2 = e.b(a, f);
                    lm1.b();
                    synchronized (this.d) {
                        b.h hVar = this.h;
                        if (hVar != null) {
                            hVar.b(b2);
                        }
                    }
                    b();
                } catch (Throwable th) {
                    synchronized (this.d) {
                        b.h hVar2 = this.h;
                        if (hVar2 != null) {
                            hVar2.a(th);
                        }
                        b();
                    }
                }
            }
        }

        public void d() {
            synchronized (this.d) {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor b = aj.b("emojiCompat");
                    this.g = b;
                    this.f = b;
                }
                this.f.execute(new Runnable() { // from class: com.daaw.y20
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.b.this.c();
                    }
                });
            }
        }

        public final b30.b e() {
            try {
                b30.a b = this.c.b(this.a, this.b);
                if (b.c() == 0) {
                    b30.b[] b2 = b.b();
                    if (b2 == null || b2.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return b2[0];
                }
                throw new RuntimeException("fetchFonts failed (" + b.c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        public void f(Executor executor) {
            synchronized (this.d) {
                this.f = executor;
            }
        }
    }

    public d(Context context, x20 x20Var) {
        super(new b(context, x20Var, j));
    }

    public d c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
