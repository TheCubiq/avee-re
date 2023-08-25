package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.C0232b;
import androidx.emoji2.text.C0247d;
import com.daaw.C0629aj;
import com.daaw.ap1;
import com.daaw.b30;
import com.daaw.lm1;
import com.daaw.ty0;
import com.daaw.x20;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
/* renamed from: androidx.emoji2.text.d */
/* loaded from: classes.dex */
public class C0247d extends C0232b.AbstractC0236c {

    /* renamed from: j */
    public static final C0248a f1322j = new C0248a();

    /* renamed from: androidx.emoji2.text.d$a */
    /* loaded from: classes.dex */
    public static class C0248a {
        /* renamed from: a */
        public Typeface m29524a(Context context, b30.C0805b c0805b) {
            return b30.m26513a(context, null, new b30.C0805b[]{c0805b});
        }

        /* renamed from: b */
        public b30.C0804a m29523b(Context context, x20 x20Var) {
            return b30.m26512b(context, null, x20Var);
        }

        /* renamed from: c */
        public void m29522c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* renamed from: androidx.emoji2.text.d$b */
    /* loaded from: classes.dex */
    public static class C0249b implements C0232b.InterfaceC0240g {

        /* renamed from: a */
        public final Context f1323a;

        /* renamed from: b */
        public final x20 f1324b;

        /* renamed from: c */
        public final C0248a f1325c;

        /* renamed from: d */
        public final Object f1326d = new Object();

        /* renamed from: e */
        public Handler f1327e;

        /* renamed from: f */
        public Executor f1328f;

        /* renamed from: g */
        public ThreadPoolExecutor f1329g;

        /* renamed from: h */
        public C0232b.AbstractC0241h f1330h;

        /* renamed from: i */
        public ContentObserver f1331i;

        /* renamed from: j */
        public Runnable f1332j;

        public C0249b(Context context, x20 x20Var, C0248a c0248a) {
            ty0.m8698g(context, "Context cannot be null");
            ty0.m8698g(x20Var, "FontRequest cannot be null");
            this.f1323a = context.getApplicationContext();
            this.f1324b = x20Var;
            this.f1325c = c0248a;
        }

        @Override // androidx.emoji2.text.C0232b.InterfaceC0240g
        /* renamed from: a */
        public void mo29521a(C0232b.AbstractC0241h abstractC0241h) {
            ty0.m8698g(abstractC0241h, "LoaderCallback cannot be null");
            synchronized (this.f1326d) {
                this.f1330h = abstractC0241h;
            }
            m29518d();
        }

        /* renamed from: b */
        public final void m29520b() {
            synchronized (this.f1326d) {
                this.f1330h = null;
                ContentObserver contentObserver = this.f1331i;
                if (contentObserver != null) {
                    this.f1325c.m29522c(this.f1323a, contentObserver);
                    this.f1331i = null;
                }
                Handler handler = this.f1327e;
                if (handler != null) {
                    handler.removeCallbacks(this.f1332j);
                }
                this.f1327e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1329g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1328f = null;
                this.f1329g = null;
            }
        }

        /* renamed from: c */
        public void m29519c() {
            synchronized (this.f1326d) {
                if (this.f1330h == null) {
                    return;
                }
                try {
                    b30.C0805b m29517e = m29517e();
                    int m26506b = m29517e.m26506b();
                    if (m26506b == 2) {
                        synchronized (this.f1326d) {
                        }
                    }
                    if (m26506b != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + m26506b + ")");
                    }
                    lm1.m16730a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                    Typeface m29524a = this.f1325c.m29524a(this.f1323a, m29517e);
                    ByteBuffer m27269f = ap1.m27269f(this.f1323a, null, m29517e.m26504d());
                    if (m27269f == null || m29524a == null) {
                        throw new RuntimeException("Unable to open file.");
                    }
                    C0250e m29514b = C0250e.m29514b(m29524a, m27269f);
                    lm1.m16729b();
                    synchronized (this.f1326d) {
                        C0232b.AbstractC0241h abstractC0241h = this.f1330h;
                        if (abstractC0241h != null) {
                            abstractC0241h.mo29547b(m29514b);
                        }
                    }
                    m29520b();
                } catch (Throwable th) {
                    synchronized (this.f1326d) {
                        C0232b.AbstractC0241h abstractC0241h2 = this.f1330h;
                        if (abstractC0241h2 != null) {
                            abstractC0241h2.mo29548a(th);
                        }
                        m29520b();
                    }
                }
            }
        }

        /* renamed from: d */
        public void m29518d() {
            synchronized (this.f1326d) {
                if (this.f1330h == null) {
                    return;
                }
                if (this.f1328f == null) {
                    ThreadPoolExecutor m27449b = C0629aj.m27449b("emojiCompat");
                    this.f1329g = m27449b;
                    this.f1328f = m27449b;
                }
                this.f1328f.execute(new Runnable() { // from class: com.daaw.y20
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0247d.C0249b.this.m29519c();
                    }
                });
            }
        }

        /* renamed from: e */
        public final b30.C0805b m29517e() {
            try {
                b30.C0804a m29523b = this.f1325c.m29523b(this.f1323a, this.f1324b);
                if (m29523b.m26508c() == 0) {
                    b30.C0805b[] m26509b = m29523b.m26509b();
                    if (m26509b == null || m26509b.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return m26509b[0];
                }
                throw new RuntimeException("fetchFonts failed (" + m29523b.m26508c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        /* renamed from: f */
        public void m29516f(Executor executor) {
            synchronized (this.f1326d) {
                this.f1328f = executor;
            }
        }
    }

    public C0247d(Context context, x20 x20Var) {
        super(new C0249b(context, x20Var, f1322j));
    }

    /* renamed from: c */
    public C0247d m29525c(Executor executor) {
        ((C0249b) m29551a()).m29516f(executor);
        return this;
    }
}
