package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.daaw.C1334fw;
import com.daaw.lm1;
import com.daaw.ty0;
import com.daaw.vp0;
import com.daaw.wp0;
import java.nio.ByteBuffer;
import org.conscrypt.NativeConstants;
/* renamed from: androidx.emoji2.text.e */
/* loaded from: classes.dex */
public final class C0250e {

    /* renamed from: a */
    public final vp0 f1333a;

    /* renamed from: b */
    public final char[] f1334b;

    /* renamed from: c */
    public final C0251a f1335c = new C0251a(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);

    /* renamed from: d */
    public final Typeface f1336d;

    /* renamed from: androidx.emoji2.text.e$a */
    /* loaded from: classes.dex */
    public static class C0251a {

        /* renamed from: a */
        public final SparseArray<C0251a> f1337a;

        /* renamed from: b */
        public C1334fw f1338b;

        public C0251a() {
            this(1);
        }

        public C0251a(int i) {
            this.f1337a = new SparseArray<>(i);
        }

        /* renamed from: a */
        public C0251a m29507a(int i) {
            SparseArray<C0251a> sparseArray = this.f1337a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* renamed from: b */
        public final C1334fw m29506b() {
            return this.f1338b;
        }

        /* renamed from: c */
        public void m29505c(C1334fw c1334fw, int i, int i2) {
            C0251a m29507a = m29507a(c1334fw.m22232b(i));
            if (m29507a == null) {
                m29507a = new C0251a();
                this.f1337a.put(c1334fw.m22232b(i), m29507a);
            }
            if (i2 > i) {
                m29507a.m29505c(c1334fw, i + 1, i2);
            } else {
                m29507a.f1338b = c1334fw;
            }
        }
    }

    public C0250e(Typeface typeface, vp0 vp0Var) {
        this.f1336d = typeface;
        this.f1333a = vp0Var;
        this.f1334b = new char[vp0Var.m6953k() * 2];
        m29515a(vp0Var);
    }

    /* renamed from: b */
    public static C0250e m29514b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            lm1.m16730a("EmojiCompat.MetadataRepo.create");
            return new C0250e(typeface, wp0.m5878b(byteBuffer));
        } finally {
            lm1.m16729b();
        }
    }

    /* renamed from: a */
    public final void m29515a(vp0 vp0Var) {
        int m6953k = vp0Var.m6953k();
        for (int i = 0; i < m6953k; i++) {
            C1334fw c1334fw = new C1334fw(this, i);
            Character.toChars(c1334fw.m22228f(), this.f1334b, i * 2);
            m29508h(c1334fw);
        }
    }

    /* renamed from: c */
    public char[] m29513c() {
        return this.f1334b;
    }

    /* renamed from: d */
    public vp0 m29512d() {
        return this.f1333a;
    }

    /* renamed from: e */
    public int m29511e() {
        return this.f1333a.m6952l();
    }

    /* renamed from: f */
    public C0251a m29510f() {
        return this.f1335c;
    }

    /* renamed from: g */
    public Typeface m29509g() {
        return this.f1336d;
    }

    /* renamed from: h */
    public void m29508h(C1334fw c1334fw) {
        ty0.m8698g(c1334fw, "emoji metadata cannot be null");
        ty0.m8704a(c1334fw.m22231c() > 0, "invalid metadata codepoint length");
        this.f1335c.m29505c(c1334fw, 0, c1334fw.m22231c() - 1);
    }
}
