package androidx.lifecycle;

import com.daaw.rj0;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: androidx.lifecycle.c */
/* loaded from: classes.dex */
public abstract class AbstractC0344c {

    /* renamed from: a */
    public AtomicReference<Object> f1750a = new AtomicReference<>();

    /* renamed from: androidx.lifecycle.c$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0345a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1751a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f1752b;

        static {
            int[] iArr = new int[EnumC0346b.values().length];
            f1752b = iArr;
            try {
                iArr[EnumC0346b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1752b[EnumC0346b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1752b[EnumC0346b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1752b[EnumC0346b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1752b[EnumC0346b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1752b[EnumC0346b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1752b[EnumC0346b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[EnumC0347c.values().length];
            f1751a = iArr2;
            try {
                iArr2[EnumC0347c.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1751a[EnumC0347c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1751a[EnumC0347c.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1751a[EnumC0347c.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1751a[EnumC0347c.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* renamed from: androidx.lifecycle.c$b */
    /* loaded from: classes.dex */
    public enum EnumC0346b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        /* renamed from: a */
        public static EnumC0346b m29052a(EnumC0347c enumC0347c) {
            int i = C0345a.f1751a[enumC0347c.ordinal()];
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

        /* renamed from: c */
        public static EnumC0346b m29050c(EnumC0347c enumC0347c) {
            int i = C0345a.f1751a[enumC0347c.ordinal()];
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

        /* renamed from: b */
        public EnumC0347c m29051b() {
            switch (C0345a.f1752b[ordinal()]) {
                case 1:
                case 2:
                    return EnumC0347c.CREATED;
                case 3:
                case 4:
                    return EnumC0347c.STARTED;
                case 5:
                    return EnumC0347c.RESUMED;
                case 6:
                    return EnumC0347c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.c$c */
    /* loaded from: classes.dex */
    public enum EnumC0347c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean m29049a(EnumC0347c enumC0347c) {
            return compareTo(enumC0347c) >= 0;
        }
    }

    /* renamed from: a */
    public abstract void mo29048a(rj0 rj0Var);

    /* renamed from: b */
    public abstract EnumC0347c mo29047b();

    /* renamed from: c */
    public abstract void mo29046c(rj0 rj0Var);
}
