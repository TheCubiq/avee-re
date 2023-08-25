package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C0243c;
import com.daaw.AbstractC1477gw;
import com.daaw.C1334fw;
import com.daaw.C1798j6;
import com.daaw.bp1;
import com.daaw.ty0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* renamed from: androidx.emoji2.text.b */
/* loaded from: classes.dex */
public class C0232b {

    /* renamed from: n */
    public static final Object f1275n = new Object();

    /* renamed from: o */
    public static final Object f1276o = new Object();

    /* renamed from: p */
    public static volatile C0232b f1277p;

    /* renamed from: b */
    public final Set<AbstractC0238e> f1279b;

    /* renamed from: e */
    public final C0235b f1282e;

    /* renamed from: f */
    public final InterfaceC0240g f1283f;

    /* renamed from: g */
    public final boolean f1284g;

    /* renamed from: h */
    public final boolean f1285h;

    /* renamed from: i */
    public final int[] f1286i;

    /* renamed from: j */
    public final boolean f1287j;

    /* renamed from: k */
    public final int f1288k;

    /* renamed from: l */
    public final int f1289l;

    /* renamed from: m */
    public final InterfaceC0237d f1290m;

    /* renamed from: a */
    public final ReadWriteLock f1278a = new ReentrantReadWriteLock();

    /* renamed from: c */
    public volatile int f1280c = 3;

    /* renamed from: d */
    public final Handler f1281d = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.emoji2.text.b$a */
    /* loaded from: classes.dex */
    public static final class C0233a extends C0235b {

        /* renamed from: b */
        public volatile C0243c f1291b;

        /* renamed from: c */
        public volatile C0250e f1292c;

        /* renamed from: androidx.emoji2.text.b$a$a */
        /* loaded from: classes.dex */
        public class C0234a extends AbstractC0241h {
            public C0234a() {
            }

            @Override // androidx.emoji2.text.C0232b.AbstractC0241h
            /* renamed from: a */
            public void mo29548a(Throwable th) {
                C0233a.this.f1294a.m29564m(th);
            }

            @Override // androidx.emoji2.text.C0232b.AbstractC0241h
            /* renamed from: b */
            public void mo29547b(C0250e c0250e) {
                C0233a.this.m29555d(c0250e);
            }
        }

        public C0233a(C0232b c0232b) {
            super(c0232b);
        }

        @Override // androidx.emoji2.text.C0232b.C0235b
        /* renamed from: a */
        public void mo29554a() {
            try {
                this.f1294a.f1283f.mo29521a(new C0234a());
            } catch (Throwable th) {
                this.f1294a.m29564m(th);
            }
        }

        @Override // androidx.emoji2.text.C0232b.C0235b
        /* renamed from: b */
        public CharSequence mo29553b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f1291b.m29538h(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.C0232b.C0235b
        /* renamed from: c */
        public void mo29552c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f1292c.m29511e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f1294a.f1284g);
        }

        /* renamed from: d */
        public void m29555d(C0250e c0250e) {
            if (c0250e == null) {
                this.f1294a.m29564m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f1292c = c0250e;
            C0250e c0250e2 = this.f1292c;
            C0242i c0242i = new C0242i();
            InterfaceC0237d interfaceC0237d = this.f1294a.f1290m;
            C0232b c0232b = this.f1294a;
            this.f1291b = new C0243c(c0250e2, c0242i, interfaceC0237d, c0232b.f1285h, c0232b.f1286i);
            this.f1294a.m29563n();
        }
    }

    /* renamed from: androidx.emoji2.text.b$b */
    /* loaded from: classes.dex */
    public static class C0235b {

        /* renamed from: a */
        public final C0232b f1294a;

        public C0235b(C0232b c0232b) {
            this.f1294a = c0232b;
        }

        /* renamed from: a */
        public void mo29554a() {
            throw null;
        }

        /* renamed from: b */
        public CharSequence mo29553b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            throw null;
        }

        /* renamed from: c */
        public void mo29552c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.b$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0236c {

        /* renamed from: a */
        public final InterfaceC0240g f1295a;

        /* renamed from: b */
        public boolean f1296b;

        /* renamed from: c */
        public boolean f1297c;

        /* renamed from: d */
        public int[] f1298d;

        /* renamed from: e */
        public Set<AbstractC0238e> f1299e;

        /* renamed from: f */
        public boolean f1300f;

        /* renamed from: g */
        public int f1301g = -16711936;

        /* renamed from: h */
        public int f1302h = 0;

        /* renamed from: i */
        public InterfaceC0237d f1303i = new C0243c.C0245b();

        public AbstractC0236c(InterfaceC0240g interfaceC0240g) {
            ty0.m8698g(interfaceC0240g, "metadataLoader cannot be null.");
            this.f1295a = interfaceC0240g;
        }

        /* renamed from: a */
        public final InterfaceC0240g m29551a() {
            return this.f1295a;
        }

        /* renamed from: b */
        public AbstractC0236c m29550b(int i) {
            this.f1302h = i;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.b$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0237d {
        /* renamed from: a */
        boolean mo29535a(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: androidx.emoji2.text.b$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0238e {
        /* renamed from: a */
        public void mo29549a(Throwable th) {
        }

        /* renamed from: b */
        public void mo19311b() {
        }
    }

    /* renamed from: androidx.emoji2.text.b$f */
    /* loaded from: classes.dex */
    public static class RunnableC0239f implements Runnable {

        /* renamed from: p */
        public final List<AbstractC0238e> f1304p;

        /* renamed from: q */
        public final Throwable f1305q;

        /* renamed from: r */
        public final int f1306r;

        public RunnableC0239f(AbstractC0238e abstractC0238e, int i) {
            this(Arrays.asList((AbstractC0238e) ty0.m8698g(abstractC0238e, "initCallback cannot be null")), i, null);
        }

        public RunnableC0239f(Collection<AbstractC0238e> collection, int i) {
            this(collection, i, null);
        }

        public RunnableC0239f(Collection<AbstractC0238e> collection, int i, Throwable th) {
            ty0.m8698g(collection, "initCallbacks cannot be null");
            this.f1304p = new ArrayList(collection);
            this.f1306r = i;
            this.f1305q = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f1304p.size();
            int i = 0;
            if (this.f1306r != 1) {
                while (i < size) {
                    this.f1304p.get(i).mo29549a(this.f1305q);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.f1304p.get(i).mo19311b();
                i++;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.b$g */
    /* loaded from: classes.dex */
    public interface InterfaceC0240g {
        /* renamed from: a */
        void mo29521a(AbstractC0241h abstractC0241h);
    }

    /* renamed from: androidx.emoji2.text.b$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0241h {
        /* renamed from: a */
        public abstract void mo29548a(Throwable th);

        /* renamed from: b */
        public abstract void mo29547b(C0250e c0250e);
    }

    /* renamed from: androidx.emoji2.text.b$i */
    /* loaded from: classes.dex */
    public static class C0242i {
        /* renamed from: a */
        public AbstractC1477gw m29546a(C1334fw c1334fw) {
            return new bp1(c1334fw);
        }
    }

    public C0232b(AbstractC0236c abstractC0236c) {
        this.f1284g = abstractC0236c.f1296b;
        this.f1285h = abstractC0236c.f1297c;
        this.f1286i = abstractC0236c.f1298d;
        this.f1287j = abstractC0236c.f1300f;
        this.f1288k = abstractC0236c.f1301g;
        this.f1283f = abstractC0236c.f1295a;
        this.f1289l = abstractC0236c.f1302h;
        this.f1290m = abstractC0236c.f1303i;
        C1798j6 c1798j6 = new C1798j6();
        this.f1279b = c1798j6;
        Set<AbstractC0238e> set = abstractC0236c.f1299e;
        if (set != null && !set.isEmpty()) {
            c1798j6.addAll(abstractC0236c.f1299e);
        }
        this.f1282e = new C0233a(this);
        m29565l();
    }

    /* renamed from: b */
    public static C0232b m29575b() {
        C0232b c0232b;
        synchronized (f1275n) {
            c0232b = f1277p;
            ty0.m8697h(c0232b != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return c0232b;
    }

    /* renamed from: e */
    public static boolean m29572e(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        return C0243c.m29543c(inputConnection, editable, i, i2, z);
    }

    /* renamed from: f */
    public static boolean m29571f(Editable editable, int i, KeyEvent keyEvent) {
        return C0243c.m29542d(editable, i, keyEvent);
    }

    /* renamed from: g */
    public static C0232b m29570g(AbstractC0236c abstractC0236c) {
        C0232b c0232b = f1277p;
        if (c0232b == null) {
            synchronized (f1275n) {
                c0232b = f1277p;
                if (c0232b == null) {
                    c0232b = new C0232b(abstractC0236c);
                    f1277p = c0232b;
                }
            }
        }
        return c0232b;
    }

    /* renamed from: h */
    public static boolean m29569h() {
        return f1277p != null;
    }

    /* renamed from: c */
    public int m29574c() {
        return this.f1288k;
    }

    /* renamed from: d */
    public int m29573d() {
        this.f1278a.readLock().lock();
        try {
            return this.f1280c;
        } finally {
            this.f1278a.readLock().unlock();
        }
    }

    /* renamed from: i */
    public boolean m29568i() {
        return this.f1287j;
    }

    /* renamed from: j */
    public final boolean m29567j() {
        return m29573d() == 1;
    }

    /* renamed from: k */
    public void m29566k() {
        ty0.m8697h(this.f1289l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m29567j()) {
            return;
        }
        this.f1278a.writeLock().lock();
        try {
            if (this.f1280c == 0) {
                return;
            }
            this.f1280c = 0;
            this.f1278a.writeLock().unlock();
            this.f1282e.mo29554a();
        } finally {
            this.f1278a.writeLock().unlock();
        }
    }

    /* renamed from: l */
    public final void m29565l() {
        this.f1278a.writeLock().lock();
        try {
            if (this.f1289l == 0) {
                this.f1280c = 0;
            }
            this.f1278a.writeLock().unlock();
            if (m29573d() == 0) {
                this.f1282e.mo29554a();
            }
        } catch (Throwable th) {
            this.f1278a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: m */
    public void m29564m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1278a.writeLock().lock();
        try {
            this.f1280c = 2;
            arrayList.addAll(this.f1279b);
            this.f1279b.clear();
            this.f1278a.writeLock().unlock();
            this.f1281d.post(new RunnableC0239f(arrayList, this.f1280c, th));
        } catch (Throwable th2) {
            this.f1278a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: n */
    public void m29563n() {
        ArrayList arrayList = new ArrayList();
        this.f1278a.writeLock().lock();
        try {
            this.f1280c = 1;
            arrayList.addAll(this.f1279b);
            this.f1279b.clear();
            this.f1278a.writeLock().unlock();
            this.f1281d.post(new RunnableC0239f(arrayList, this.f1280c));
        } catch (Throwable th) {
            this.f1278a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: o */
    public CharSequence m29562o(CharSequence charSequence) {
        return m29561p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* renamed from: p */
    public CharSequence m29561p(CharSequence charSequence, int i, int i2) {
        return m29560q(charSequence, i, i2, Integer.MAX_VALUE);
    }

    /* renamed from: q */
    public CharSequence m29560q(CharSequence charSequence, int i, int i2, int i3) {
        return m29559r(charSequence, i, i2, i3, 0);
    }

    /* renamed from: r */
    public CharSequence m29559r(CharSequence charSequence, int i, int i2, int i3, int i4) {
        ty0.m8697h(m29567j(), "Not initialized yet");
        ty0.m8701d(i, "start cannot be negative");
        ty0.m8701d(i2, "end cannot be negative");
        ty0.m8701d(i3, "maxEmojiCount cannot be negative");
        ty0.m8704a(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        ty0.m8704a(i <= charSequence.length(), "start should be < than charSequence length");
        ty0.m8704a(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        return this.f1282e.mo29553b(charSequence, i, i2, i3, i4 != 1 ? i4 != 2 ? this.f1284g : false : true);
    }

    /* renamed from: s */
    public void m29558s(AbstractC0238e abstractC0238e) {
        ty0.m8698g(abstractC0238e, "initCallback cannot be null");
        this.f1278a.writeLock().lock();
        try {
            if (this.f1280c != 1 && this.f1280c != 2) {
                this.f1279b.add(abstractC0238e);
            }
            this.f1281d.post(new RunnableC0239f(abstractC0238e, this.f1280c));
        } finally {
            this.f1278a.writeLock().unlock();
        }
    }

    /* renamed from: t */
    public void m29557t(AbstractC0238e abstractC0238e) {
        ty0.m8698g(abstractC0238e, "initCallback cannot be null");
        this.f1278a.writeLock().lock();
        try {
            this.f1279b.remove(abstractC0238e);
        } finally {
            this.f1278a.writeLock().unlock();
        }
    }

    /* renamed from: u */
    public void m29556u(EditorInfo editorInfo) {
        if (!m29567j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f1282e.mo29552c(editorInfo);
    }
}
