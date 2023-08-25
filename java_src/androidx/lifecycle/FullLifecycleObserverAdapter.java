package androidx.lifecycle;

import androidx.lifecycle.c;
import com.daaw.o40;
import com.daaw.sj0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements d {
    public final o40 a;
    public final d b;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.b.values().length];
            a = iArr;
            try {
                iArr[c.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(o40 o40Var, d dVar) {
        this.a = o40Var;
        this.b = dVar;
    }

    @Override // androidx.lifecycle.d
    public void a(sj0 sj0Var, c.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                this.a.d(sj0Var);
                break;
            case 2:
                this.a.b(sj0Var);
                break;
            case 3:
                this.a.e(sj0Var);
                break;
            case 4:
                this.a.f(sj0Var);
                break;
            case 5:
                this.a.c(sj0Var);
                break;
            case 6:
                this.a.g(sj0Var);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        d dVar = this.b;
        if (dVar != null) {
            dVar.a(sj0Var, bVar);
        }
    }
}
