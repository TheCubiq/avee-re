package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.b;
import androidx.lifecycle.ProcessLifecycleInitializer;
import com.daaw.aj;
import com.daaw.c5;
import com.daaw.jr;
import com.daaw.kr;
import com.daaw.lm1;
import com.daaw.sj0;
import com.daaw.wf0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements wf0<Boolean> {

    /* loaded from: classes.dex */
    public static class a extends b.c {
        public a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements b.g {
        public final Context a;

        /* loaded from: classes.dex */
        public class a extends b.h {
            public final /* synthetic */ b.h a;
            public final /* synthetic */ ThreadPoolExecutor b;

            public a(b.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.a = hVar;
                this.b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.b.h
            public void a(Throwable th) {
                try {
                    this.a.a(th);
                } finally {
                    this.b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.b.h
            public void b(e eVar) {
                try {
                    this.a.b(eVar);
                } finally {
                    this.b.shutdown();
                }
            }
        }

        public b(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.b.g
        public void a(final b.h hVar) {
            final ThreadPoolExecutor b = aj.b("EmojiCompatInitializer");
            b.execute(new Runnable() { // from class: com.daaw.zv
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.d(hVar, b);
                }
            });
        }

        /* renamed from: c */
        public void d(b.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                d a2 = androidx.emoji2.text.a.a(this.a);
                if (a2 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a2.c(threadPoolExecutor);
                a2.a().a(new a(hVar, threadPoolExecutor));
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                lm1.a("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.b.h()) {
                    androidx.emoji2.text.b.b().k();
                }
            } finally {
                lm1.b();
            }
        }
    }

    @Override // com.daaw.wf0
    public List<Class<? extends wf0<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // com.daaw.wf0
    /* renamed from: c */
    public Boolean b(Context context) {
        androidx.emoji2.text.b.g(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    public void d(Context context) {
        final androidx.lifecycle.c a2 = ((sj0) c5.e(context).f(ProcessLifecycleInitializer.class)).a();
        a2.a(new kr() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // com.daaw.o40
            public /* synthetic */ void b(sj0 sj0Var) {
                jr.d(this, sj0Var);
            }

            @Override // com.daaw.o40
            public /* synthetic */ void c(sj0 sj0Var) {
                jr.e(this, sj0Var);
            }

            @Override // com.daaw.o40
            public /* synthetic */ void d(sj0 sj0Var) {
                jr.a(this, sj0Var);
            }

            @Override // com.daaw.o40
            public void e(sj0 sj0Var) {
                EmojiCompatInitializer.this.e();
                a2.c(this);
            }

            @Override // com.daaw.o40
            public /* synthetic */ void f(sj0 sj0Var) {
                jr.c(this, sj0Var);
            }

            @Override // com.daaw.o40
            public /* synthetic */ void g(sj0 sj0Var) {
                jr.b(this, sj0Var);
            }
        });
    }

    public void e() {
        aj.d().postDelayed(new c(), 500L);
    }
}
