package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.C0232b;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.ProcessLifecycleInitializer;
import com.daaw.C0629aj;
import com.daaw.C0914c5;
import com.daaw.C1856jr;
import com.daaw.InterfaceC1980kr;
import com.daaw.lm1;
import com.daaw.sj0;
import com.daaw.wf0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements wf0<Boolean> {

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    /* loaded from: classes.dex */
    public static class C0223a extends C0232b.AbstractC0236c {
        public C0223a(Context context) {
            super(new C0224b(context));
            m29550b(1);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    /* loaded from: classes.dex */
    public static class C0224b implements C0232b.InterfaceC0240g {

        /* renamed from: a */
        public final Context f1270a;

        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b$a */
        /* loaded from: classes.dex */
        public class C0225a extends C0232b.AbstractC0241h {

            /* renamed from: a */
            public final /* synthetic */ C0232b.AbstractC0241h f1271a;

            /* renamed from: b */
            public final /* synthetic */ ThreadPoolExecutor f1272b;

            public C0225a(C0232b.AbstractC0241h abstractC0241h, ThreadPoolExecutor threadPoolExecutor) {
                this.f1271a = abstractC0241h;
                this.f1272b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.C0232b.AbstractC0241h
            /* renamed from: a */
            public void mo29548a(Throwable th) {
                try {
                    this.f1271a.mo29548a(th);
                } finally {
                    this.f1272b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.C0232b.AbstractC0241h
            /* renamed from: b */
            public void mo29547b(C0250e c0250e) {
                try {
                    this.f1271a.mo29547b(c0250e);
                } finally {
                    this.f1272b.shutdown();
                }
            }
        }

        public C0224b(Context context) {
            this.f1270a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C0232b.InterfaceC0240g
        /* renamed from: a */
        public void mo29521a(final C0232b.AbstractC0241h abstractC0241h) {
            final ThreadPoolExecutor m27449b = C0629aj.m27449b("EmojiCompatInitializer");
            m27449b.execute(new Runnable() { // from class: com.daaw.zv
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.C0224b.this.m29589d(abstractC0241h, m27449b);
                }
            });
        }

        /* renamed from: c */
        public void m29589d(C0232b.AbstractC0241h abstractC0241h, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C0247d m29588a = C0227a.m29588a(this.f1270a);
                if (m29588a == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                m29588a.m29525c(threadPoolExecutor);
                m29588a.m29551a().mo29521a(new C0225a(abstractC0241h, threadPoolExecutor));
            } catch (Throwable th) {
                abstractC0241h.mo29548a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    /* loaded from: classes.dex */
    public static class RunnableC0226c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                lm1.m16730a("EmojiCompat.EmojiCompatInitializer.run");
                if (C0232b.m29569h()) {
                    C0232b.m29575b().m29566k();
                }
            } finally {
                lm1.m16729b();
            }
        }
    }

    @Override // com.daaw.wf0
    /* renamed from: a */
    public List<Class<? extends wf0<?>>> mo6098a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // com.daaw.wf0
    /* renamed from: c */
    public Boolean mo6097b(Context context) {
        C0232b.m29570g(new C0223a(context));
        m29593d(context);
        return Boolean.TRUE;
    }

    /* renamed from: d */
    public void m29593d(Context context) {
        final AbstractC0344c mo2327a = ((sj0) C0914c5.m25621e(context).m25620f(ProcessLifecycleInitializer.class)).mo2327a();
        mo2327a.mo29048a(new InterfaceC1980kr() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // com.daaw.o40
            /* renamed from: b */
            public /* synthetic */ void mo14573b(sj0 sj0Var) {
                C1856jr.m18321d(this, sj0Var);
            }

            @Override // com.daaw.o40
            /* renamed from: c */
            public /* synthetic */ void mo14572c(sj0 sj0Var) {
                C1856jr.m18320e(this, sj0Var);
            }

            @Override // com.daaw.o40
            /* renamed from: d */
            public /* synthetic */ void mo14571d(sj0 sj0Var) {
                C1856jr.m18324a(this, sj0Var);
            }

            @Override // com.daaw.o40
            /* renamed from: e */
            public void mo14570e(sj0 sj0Var) {
                EmojiCompatInitializer.this.m29592e();
                mo2327a.mo29046c(this);
            }

            @Override // com.daaw.o40
            /* renamed from: f */
            public /* synthetic */ void mo14569f(sj0 sj0Var) {
                C1856jr.m18322c(this, sj0Var);
            }

            @Override // com.daaw.o40
            /* renamed from: g */
            public /* synthetic */ void mo14568g(sj0 sj0Var) {
                C1856jr.m18323b(this, sj0Var);
            }
        });
    }

    /* renamed from: e */
    public void m29592e() {
        C0629aj.m27447d().postDelayed(new RunnableC0226c(), 500L);
    }
}
