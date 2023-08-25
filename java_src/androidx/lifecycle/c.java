package androidx.lifecycle;

import com.daaw.rj0;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class c {
    public AtomicReference<Object> a = new AtomicReference<>();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[EnumC0020c.values().length];
            a = iArr2;
            try {
                iArr2[EnumC0020c.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[EnumC0020c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[EnumC0020c.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[EnumC0020c.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[EnumC0020c.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static b a(EnumC0020c enumC0020c) {
            int i = a.a[enumC0020c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ON_PAUSE;
                }
                return ON_STOP;
            }
            return ON_DESTROY;
        }

        public static b c(EnumC0020c enumC0020c) {
            int i = a.a[enumC0020c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        return null;
                    }
                    return ON_CREATE;
                }
                return ON_RESUME;
            }
            return ON_START;
        }

        public EnumC0020c b() {
            switch (a.b[ordinal()]) {
                case 1:
                case 2:
                    return EnumC0020c.CREATED;
                case 3:
                case 4:
                    return EnumC0020c.STARTED;
                case 5:
                    return EnumC0020c.RESUMED;
                case 6:
                    return EnumC0020c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0020c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean a(EnumC0020c enumC0020c) {
            return compareTo(enumC0020c) >= 0;
        }
    }

    public abstract void a(rj0 rj0Var);

    public abstract EnumC0020c b();

    public abstract void c(rj0 rj0Var);
}
