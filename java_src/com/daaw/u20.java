package com.daaw;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
public class u20 {

    /* renamed from: com.daaw.u20$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3156a<T> {
        /* renamed from: a */
        void mo3034a(T t, Rect rect);
    }

    /* renamed from: com.daaw.u20$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3157b<T, V> {
        /* renamed from: a */
        V mo3032a(T t, int i);

        /* renamed from: b */
        int mo3031b(T t);
    }

    /* renamed from: com.daaw.u20$c */
    /* loaded from: classes.dex */
    public static class C3158c<T> implements Comparator<T> {

        /* renamed from: p */
        public final Rect f28333p = new Rect();

        /* renamed from: q */
        public final Rect f28334q = new Rect();

        /* renamed from: r */
        public final boolean f28335r;

        /* renamed from: s */
        public final InterfaceC3156a<T> f28336s;

        public C3158c(boolean z, InterfaceC3156a<T> interfaceC3156a) {
            this.f28335r = z;
            this.f28336s = interfaceC3156a;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.f28333p;
            Rect rect2 = this.f28334q;
            this.f28336s.mo3034a(t, rect);
            this.f28336s.mo3034a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.f28335r ? 1 : -1;
            } else if (i3 > i4) {
                return this.f28335r ? -1 : 1;
            } else {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    return this.f28335r ? 1 : -1;
                } else if (i7 > i8) {
                    return this.f28335r ? -1 : 1;
                } else {
                    return 0;
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m8623a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean m8622b = m8622b(i, rect, rect2);
        if (m8622b(i, rect, rect3) || !m8622b) {
            return false;
        }
        return !m8614j(i, rect, rect3) || i == 17 || i == 66 || m8613k(i, rect, rect2) < m8611m(i, rect, rect3);
    }

    /* renamed from: b */
    public static boolean m8622b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <L, T> T m8621c(L l, InterfaceC3157b<L, T> interfaceC3157b, InterfaceC3156a<T> interfaceC3156a, T t, Rect rect, int i) {
        int width;
        int mo3031b;
        int height;
        Rect rect2 = new Rect(rect);
        if (i != 17) {
            if (i == 33) {
                height = rect.height() + 1;
            } else if (i == 66) {
                width = -(rect.width() + 1);
            } else if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            } else {
                height = -(rect.height() + 1);
            }
            rect2.offset(0, height);
            T t2 = null;
            mo3031b = interfaceC3157b.mo3031b(l);
            Rect rect3 = new Rect();
            for (int i2 = 0; i2 < mo3031b; i2++) {
                T mo3032a = interfaceC3157b.mo3032a(l, i2);
                if (mo3032a != t) {
                    interfaceC3156a.mo3034a(mo3032a, rect3);
                    if (m8616h(i, rect, rect3, rect2)) {
                        rect2.set(rect3);
                        t2 = mo3032a;
                    }
                }
            }
            return t2;
        }
        width = rect.width() + 1;
        rect2.offset(width, 0);
        T t22 = null;
        mo3031b = interfaceC3157b.mo3031b(l);
        Rect rect32 = new Rect();
        while (i2 < mo3031b) {
        }
        return t22;
    }

    /* renamed from: d */
    public static <L, T> T m8620d(L l, InterfaceC3157b<L, T> interfaceC3157b, InterfaceC3156a<T> interfaceC3156a, T t, int i, boolean z, boolean z2) {
        int mo3031b = interfaceC3157b.mo3031b(l);
        ArrayList arrayList = new ArrayList(mo3031b);
        for (int i2 = 0; i2 < mo3031b; i2++) {
            arrayList.add(interfaceC3157b.mo3032a(l, i2));
        }
        Collections.sort(arrayList, new C3158c(z, interfaceC3156a));
        if (i != 1) {
            if (i == 2) {
                return (T) m8619e(t, arrayList, z2);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) m8618f(t, arrayList, z2);
    }

    /* renamed from: e */
    public static <T> T m8619e(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int lastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    public static <T> T m8618f(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int indexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    public static int m8617g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    public static boolean m8616h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (m8615i(rect, rect2, i)) {
            if (m8615i(rect, rect3, i) && !m8623a(i, rect, rect2, rect3)) {
                return !m8623a(i, rect, rect3, rect2) && m8617g(m8613k(i, rect, rect2), m8609o(i, rect, rect2)) < m8617g(m8613k(i, rect, rect3), m8609o(i, rect, rect3));
            }
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m8615i(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: j */
    public static boolean m8614j(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        } else if (i == 33) {
            return rect.top >= rect2.bottom;
        } else if (i == 66) {
            return rect.right <= rect2.left;
        } else if (i == 130) {
            return rect.bottom <= rect2.top;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: k */
    public static int m8613k(int i, Rect rect, Rect rect2) {
        return Math.max(0, m8612l(i, rect, rect2));
    }

    /* renamed from: l */
    public static int m8612l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    /* renamed from: m */
    public static int m8611m(int i, Rect rect, Rect rect2) {
        return Math.max(1, m8610n(i, rect, rect2));
    }

    /* renamed from: n */
    public static int m8610n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    /* renamed from: o */
    public static int m8609o(int i, Rect rect, Rect rect2) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = rect.left + (rect.width() / 2);
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - (i2 + (height2 / 2)));
        }
        height = rect.top + (rect.height() / 2);
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - (i2 + (height2 / 2)));
    }
}
