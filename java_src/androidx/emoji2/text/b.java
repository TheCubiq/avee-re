package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.c;
import com.daaw.bp1;
import com.daaw.fw;
import com.daaw.gw;
import com.daaw.j6;
import com.daaw.ty0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes.dex */
public class b {
    public static final Object n = new Object();
    public static final Object o = new Object();
    public static volatile b p;
    public final Set<e> b;
    public final C0015b e;
    public final g f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final boolean j;
    public final int k;
    public final int l;
    public final d m;
    public final ReadWriteLock a = new ReentrantReadWriteLock();
    public volatile int c = 3;
    public final Handler d = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static final class a extends C0015b {
        public volatile androidx.emoji2.text.c b;
        public volatile androidx.emoji2.text.e c;

        /* renamed from: androidx.emoji2.text.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0014a extends h {
            public C0014a() {
            }

            @Override // androidx.emoji2.text.b.h
            public void a(Throwable th) {
                a.this.a.m(th);
            }

            @Override // androidx.emoji2.text.b.h
            public void b(androidx.emoji2.text.e eVar) {
                a.this.d(eVar);
            }
        }

        public a(b bVar) {
            super(bVar);
        }

        @Override // androidx.emoji2.text.b.C0015b
        public void a() {
            try {
                this.a.f.a(new C0014a());
            } catch (Throwable th) {
                this.a.m(th);
            }
        }

        @Override // androidx.emoji2.text.b.C0015b
        public CharSequence b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.b.h(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.b.C0015b
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.a.g);
        }

        public void d(androidx.emoji2.text.e eVar) {
            if (eVar == null) {
                this.a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.c = eVar;
            androidx.emoji2.text.e eVar2 = this.c;
            i iVar = new i();
            d dVar = this.a.m;
            b bVar = this.a;
            this.b = new androidx.emoji2.text.c(eVar2, iVar, dVar, bVar.h, bVar.i);
            this.a.n();
        }
    }

    /* renamed from: androidx.emoji2.text.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0015b {
        public final b a;

        public C0015b(b bVar) {
            this.a = bVar;
        }

        public void a() {
            throw null;
        }

        public CharSequence b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            throw null;
        }

        public void c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public final g a;
        public boolean b;
        public boolean c;
        public int[] d;
        public Set<e> e;
        public boolean f;
        public int g = -16711936;
        public int h = 0;
        public d i = new c.b();

        public c(g gVar) {
            ty0.g(gVar, "metadataLoader cannot be null.");
            this.a = gVar;
        }

        public final g a() {
            return this.a;
        }

        public c b(int i) {
            this.h = i;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(CharSequence charSequence, int i, int i2, int i3);
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Runnable {
        public final List<e> p;
        public final Throwable q;
        public final int r;

        public f(e eVar, int i) {
            this(Arrays.asList((e) ty0.g(eVar, "initCallback cannot be null")), i, null);
        }

        public f(Collection<e> collection, int i) {
            this(collection, i, null);
        }

        public f(Collection<e> collection, int i, Throwable th) {
            ty0.g(collection, "initCallbacks cannot be null");
            this.p = new ArrayList(collection);
            this.r = i;
            this.q = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.p.size();
            int i = 0;
            if (this.r != 1) {
                while (i < size) {
                    this.p.get(i).a(this.q);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.p.get(i).b();
                i++;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(h hVar);
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.e eVar);
    }

    /* loaded from: classes.dex */
    public static class i {
        public gw a(fw fwVar) {
            return new bp1(fwVar);
        }
    }

    public b(c cVar) {
        this.g = cVar.b;
        this.h = cVar.c;
        this.i = cVar.d;
        this.j = cVar.f;
        this.k = cVar.g;
        this.f = cVar.a;
        this.l = cVar.h;
        this.m = cVar.i;
        j6 j6Var = new j6();
        this.b = j6Var;
        Set<e> set = cVar.e;
        if (set != null && !set.isEmpty()) {
            j6Var.addAll(cVar.e);
        }
        this.e = new a(this);
        l();
    }

    public static b b() {
        b bVar;
        synchronized (n) {
            bVar = p;
            ty0.h(bVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return bVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z) {
        return androidx.emoji2.text.c.c(inputConnection, editable, i2, i3, z);
    }

    public static boolean f(Editable editable, int i2, KeyEvent keyEvent) {
        return androidx.emoji2.text.c.d(editable, i2, keyEvent);
    }

    public static b g(c cVar) {
        b bVar = p;
        if (bVar == null) {
            synchronized (n) {
                bVar = p;
                if (bVar == null) {
                    bVar = new b(cVar);
                    p = bVar;
                }
            }
        }
        return bVar;
    }

    public static boolean h() {
        return p != null;
    }

    public int c() {
        return this.k;
    }

    public int d() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.j;
    }

    public final boolean j() {
        return d() == 1;
    }

    public void k() {
        ty0.h(this.l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            this.e.a();
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void l() {
        this.a.writeLock().lock();
        try {
            if (this.l == 0) {
                this.c = 0;
            }
            this.a.writeLock().unlock();
            if (d() == 0) {
                this.e.a();
            }
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new f(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public void n() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new f(arrayList, this.c));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i2, int i3) {
        return q(charSequence, i2, i3, Integer.MAX_VALUE);
    }

    public CharSequence q(CharSequence charSequence, int i2, int i3, int i4) {
        return r(charSequence, i2, i3, i4, 0);
    }

    public CharSequence r(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        ty0.h(j(), "Not initialized yet");
        ty0.d(i2, "start cannot be negative");
        ty0.d(i3, "end cannot be negative");
        ty0.d(i4, "maxEmojiCount cannot be negative");
        ty0.a(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        ty0.a(i2 <= charSequence.length(), "start should be < than charSequence length");
        ty0.a(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        return this.e.b(charSequence, i2, i3, i4, i5 != 1 ? i5 != 2 ? this.g : false : true);
    }

    public void s(e eVar) {
        ty0.g(eVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(eVar);
            }
            this.d.post(new f(eVar, this.c));
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public void t(e eVar) {
        ty0.g(eVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            this.b.remove(eVar);
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.e.c(editorInfo);
    }
}
