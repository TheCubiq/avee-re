package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0416a;
import java.util.List;
/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes.dex */
public class C0444h {

    /* renamed from: a */
    public final InterfaceC0445a f2248a;

    /* renamed from: androidx.recyclerview.widget.h$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0445a {
        /* renamed from: a */
        void mo28201a(C0416a.C0418b c0418b);

        /* renamed from: b */
        C0416a.C0418b mo28200b(int i, int i2, int i3, Object obj);
    }

    public C0444h(InterfaceC0445a interfaceC0445a) {
        this.f2248a = interfaceC0445a;
    }

    /* renamed from: a */
    public final int m28207a(List<C0416a.C0418b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f2120a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void m28206b(List<C0416a.C0418b> list) {
        while (true) {
            int m28207a = m28207a(list);
            if (m28207a == -1) {
                return;
            }
            m28204d(list, m28207a, m28207a + 1);
        }
    }

    /* renamed from: c */
    public final void m28205c(List<C0416a.C0418b> list, int i, C0416a.C0418b c0418b, int i2, C0416a.C0418b c0418b2) {
        int i3 = c0418b.f2123d;
        int i4 = c0418b2.f2121b;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = c0418b.f2121b;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            c0418b.f2121b = i6 + c0418b2.f2123d;
        }
        int i7 = c0418b2.f2121b;
        if (i7 <= i3) {
            c0418b.f2123d = i3 + c0418b2.f2123d;
        }
        c0418b2.f2121b = i7 + i5;
        list.set(i, c0418b2);
        list.set(i2, c0418b);
    }

    /* renamed from: d */
    public final void m28204d(List<C0416a.C0418b> list, int i, int i2) {
        C0416a.C0418b c0418b = list.get(i);
        C0416a.C0418b c0418b2 = list.get(i2);
        int i3 = c0418b2.f2120a;
        if (i3 == 1) {
            m28205c(list, i, c0418b, i2, c0418b2);
        } else if (i3 == 2) {
            m28203e(list, i, c0418b, i2, c0418b2);
        } else if (i3 != 4) {
        } else {
            m28202f(list, i, c0418b, i2, c0418b2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
        if (r0 > r14.f2121b) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
        if (r0 >= r14.f2121b) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c9, code lost:
        r12.f2123d = r0 - r14.f2123d;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m28203e(List<C0416a.C0418b> list, int i, C0416a.C0418b c0418b, int i2, C0416a.C0418b c0418b2) {
        boolean z;
        int i3;
        int i4 = c0418b.f2121b;
        int i5 = c0418b.f2123d;
        boolean z2 = false;
        int i6 = c0418b2.f2121b;
        if (i4 < i5) {
            if (i6 == i4 && c0418b2.f2123d == i5 - i4) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (i6 == i5 + 1 && c0418b2.f2123d == i4 - i5) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i7 = c0418b2.f2121b;
        if (i5 < i7) {
            c0418b2.f2121b = i7 - 1;
        } else {
            int i8 = c0418b2.f2123d;
            if (i5 < i7 + i8) {
                c0418b2.f2123d = i8 - 1;
                c0418b.f2120a = 2;
                c0418b.f2123d = 1;
                if (c0418b2.f2123d == 0) {
                    list.remove(i2);
                    this.f2248a.mo28201a(c0418b2);
                    return;
                }
                return;
            }
        }
        int i9 = c0418b.f2121b;
        int i10 = c0418b2.f2121b;
        C0416a.C0418b c0418b3 = null;
        if (i9 <= i10) {
            c0418b2.f2121b = i10 + 1;
        } else {
            int i11 = c0418b2.f2123d;
            if (i9 < i10 + i11) {
                c0418b3 = this.f2248a.mo28200b(2, i9 + 1, (i10 + i11) - i9, null);
                c0418b2.f2123d = c0418b.f2121b - c0418b2.f2121b;
            }
        }
        if (z2) {
            list.set(i, c0418b2);
            list.remove(i2);
            this.f2248a.mo28201a(c0418b);
            return;
        }
        if (z) {
            if (c0418b3 != null) {
                int i12 = c0418b.f2121b;
                if (i12 > c0418b3.f2121b) {
                    c0418b.f2121b = i12 - c0418b3.f2123d;
                }
                int i13 = c0418b.f2123d;
                if (i13 > c0418b3.f2121b) {
                    c0418b.f2123d = i13 - c0418b3.f2123d;
                }
            }
            int i14 = c0418b.f2121b;
            if (i14 > c0418b2.f2121b) {
                c0418b.f2121b = i14 - c0418b2.f2123d;
            }
            i3 = c0418b.f2123d;
        } else {
            if (c0418b3 != null) {
                int i15 = c0418b.f2121b;
                if (i15 >= c0418b3.f2121b) {
                    c0418b.f2121b = i15 - c0418b3.f2123d;
                }
                int i16 = c0418b.f2123d;
                if (i16 >= c0418b3.f2121b) {
                    c0418b.f2123d = i16 - c0418b3.f2123d;
                }
            }
            int i17 = c0418b.f2121b;
            if (i17 >= c0418b2.f2121b) {
                c0418b.f2121b = i17 - c0418b2.f2123d;
            }
            i3 = c0418b.f2123d;
        }
        list.set(i, c0418b2);
        if (c0418b.f2121b != c0418b.f2123d) {
            list.set(i2, c0418b);
        } else {
            list.remove(i2);
        }
        if (c0418b3 != null) {
            list.add(i, c0418b3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m28202f(List<C0416a.C0418b> list, int i, C0416a.C0418b c0418b, int i2, C0416a.C0418b c0418b2) {
        C0416a.C0418b mo28200b;
        int i3;
        int i4;
        int i5 = c0418b.f2123d;
        int i6 = c0418b2.f2121b;
        C0416a.C0418b c0418b3 = null;
        if (i5 < i6) {
            c0418b2.f2121b = i6 - 1;
        } else {
            int i7 = c0418b2.f2123d;
            if (i5 < i6 + i7) {
                c0418b2.f2123d = i7 - 1;
                mo28200b = this.f2248a.mo28200b(4, c0418b.f2121b, 1, c0418b2.f2122c);
                i3 = c0418b.f2121b;
                i4 = c0418b2.f2121b;
                if (i3 > i4) {
                    c0418b2.f2121b = i4 + 1;
                } else {
                    int i8 = c0418b2.f2123d;
                    if (i3 < i4 + i8) {
                        int i9 = (i4 + i8) - i3;
                        c0418b3 = this.f2248a.mo28200b(4, i3 + 1, i9, c0418b2.f2122c);
                        c0418b2.f2123d -= i9;
                    }
                }
                list.set(i2, c0418b);
                if (c0418b2.f2123d <= 0) {
                    list.set(i, c0418b2);
                } else {
                    list.remove(i);
                    this.f2248a.mo28201a(c0418b2);
                }
                if (mo28200b != null) {
                    list.add(i, mo28200b);
                }
                if (c0418b3 == null) {
                    list.add(i, c0418b3);
                    return;
                }
                return;
            }
        }
        mo28200b = null;
        i3 = c0418b.f2121b;
        i4 = c0418b2.f2121b;
        if (i3 > i4) {
        }
        list.set(i2, c0418b);
        if (c0418b2.f2123d <= 0) {
        }
        if (mo28200b != null) {
        }
        if (c0418b3 == null) {
        }
    }
}
