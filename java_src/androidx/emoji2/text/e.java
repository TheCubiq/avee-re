package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.daaw.fw;
import com.daaw.lm1;
import com.daaw.ty0;
import com.daaw.vp0;
import com.daaw.wp0;
import java.nio.ByteBuffer;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class e {
    public final vp0 a;
    public final char[] b;
    public final a c = new a(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
    public final Typeface d;

    /* loaded from: classes.dex */
    public static class a {
        public final SparseArray<a> a;
        public fw b;

        public a() {
            this(1);
        }

        public a(int i) {
            this.a = new SparseArray<>(i);
        }

        public a a(int i) {
            SparseArray<a> sparseArray = this.a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        public final fw b() {
            return this.b;
        }

        public void c(fw fwVar, int i, int i2) {
            a a = a(fwVar.b(i));
            if (a == null) {
                a = new a();
                this.a.put(fwVar.b(i), a);
            }
            if (i2 > i) {
                a.c(fwVar, i + 1, i2);
            } else {
                a.b = fwVar;
            }
        }
    }

    public e(Typeface typeface, vp0 vp0Var) {
        this.d = typeface;
        this.a = vp0Var;
        this.b = new char[vp0Var.k() * 2];
        a(vp0Var);
    }

    public static e b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            lm1.a("EmojiCompat.MetadataRepo.create");
            return new e(typeface, wp0.b(byteBuffer));
        } finally {
            lm1.b();
        }
    }

    public final void a(vp0 vp0Var) {
        int k = vp0Var.k();
        for (int i = 0; i < k; i++) {
            fw fwVar = new fw(this, i);
            Character.toChars(fwVar.f(), this.b, i * 2);
            h(fwVar);
        }
    }

    public char[] c() {
        return this.b;
    }

    public vp0 d() {
        return this.a;
    }

    public int e() {
        return this.a.l();
    }

    public a f() {
        return this.c;
    }

    public Typeface g() {
        return this.d;
    }

    public void h(fw fwVar) {
        ty0.g(fwVar, "emoji metadata cannot be null");
        ty0.a(fwVar.c() > 0, "invalid metadata codepoint length");
        this.c.c(fwVar, 0, fwVar.c() - 1);
    }
}
