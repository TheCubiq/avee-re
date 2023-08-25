package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.b;
import androidx.emoji2.text.e;
import com.daaw.fw;
import com.daaw.gw;
import com.daaw.mv0;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class c {
    public final b.i a;
    public final e b;
    public b.d c;
    public final boolean d;
    public final int[] e;

    /* loaded from: classes.dex */
    public static final class a {
        public static int a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i;
            }
        }

        public static int b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                        i++;
                    } else if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    } else {
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements b.d {
        public static final ThreadLocal<StringBuilder> b = new ThreadLocal<>();
        public final TextPaint a;

        public b() {
            TextPaint textPaint = new TextPaint();
            this.a = textPaint;
            textPaint.setTextSize(10.0f);
        }

        public static StringBuilder b() {
            ThreadLocal<StringBuilder> threadLocal = b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            return threadLocal.get();
        }

        @Override // androidx.emoji2.text.b.d
        public boolean a(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 23 || i3 <= i4) {
                StringBuilder b2 = b();
                b2.setLength(0);
                while (i < i2) {
                    b2.append(charSequence.charAt(i));
                    i++;
                }
                return mv0.a(this.a, b2.toString());
            }
            return false;
        }
    }

    /* renamed from: androidx.emoji2.text.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0016c {
        public int a = 1;
        public final e.a b;
        public e.a c;
        public e.a d;
        public int e;
        public int f;
        public final boolean g;
        public final int[] h;

        public C0016c(e.a aVar, boolean z, int[] iArr) {
            this.b = aVar;
            this.c = aVar;
            this.g = z;
            this.h = iArr;
        }

        public static boolean d(int i) {
            return i == 65039;
        }

        public static boolean f(int i) {
            return i == 65038;
        }

        public int a(int i) {
            e.a a = this.c.a(i);
            int i2 = 3;
            if (this.a != 2) {
                if (a != null) {
                    this.a = 2;
                    this.c = a;
                    this.f = 1;
                    i2 = 2;
                }
                i2 = g();
            } else {
                if (a != null) {
                    this.c = a;
                    this.f++;
                } else {
                    if (!f(i)) {
                        if (!d(i)) {
                            if (this.c.b() != null && (this.f != 1 || h())) {
                                this.d = this.c;
                                g();
                            }
                        }
                    }
                    i2 = g();
                }
                i2 = 2;
            }
            this.e = i;
            return i2;
        }

        public fw b() {
            return this.c.b();
        }

        public fw c() {
            return this.d.b();
        }

        public boolean e() {
            return this.a == 2 && this.c.b() != null && (this.f > 1 || h());
        }

        public final int g() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.c.b().j() || d(this.e)) {
                return true;
            }
            if (this.g) {
                if (this.h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.h, this.c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public c(e eVar, b.i iVar, b.d dVar, boolean z, int[] iArr) {
        this.a = iVar;
        this.b = eVar;
        this.c = dVar;
        this.d = z;
        this.e = iArr;
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z) {
        gw[] gwVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (gwVarArr = (gw[]) editable.getSpans(selectionStart, selectionEnd, gw.class)) != null && gwVarArr.length > 0) {
            for (gw gwVar : gwVarArr) {
                int spanStart = editable.getSpanStart(gwVar);
                int spanEnd = editable.getSpanEnd(gwVar);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                max = a.a(editable, selectionStart, Math.max(i, 0));
                min = a.b(editable, selectionEnd, Math.max(i2, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i, 0);
                min = Math.min(selectionEnd + i2, editable.length());
            }
            gw[] gwVarArr = (gw[]) editable.getSpans(max, min, gw.class);
            if (gwVarArr != null && gwVarArr.length > 0) {
                for (gw gwVar : gwVarArr) {
                    int spanStart = editable.getSpanStart(gwVar);
                    int spanEnd = editable.getSpanEnd(gwVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean d(Editable editable, int i, KeyEvent keyEvent) {
        if (i != 67 ? i != 112 ? false : b(editable, keyEvent, true) : b(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    public static boolean f(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public final void a(Spannable spannable, fw fwVar, int i, int i2) {
        spannable.setSpan(this.a.a(fwVar), i, i2, 33);
    }

    public final boolean e(CharSequence charSequence, int i, int i2, fw fwVar) {
        if (fwVar.d() == 0) {
            fwVar.k(this.c.a(charSequence, i, i2, fwVar.h()));
        }
        return fwVar.d() == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0125, code lost:
        ((com.daaw.le1) r10).d();
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[Catch: all -> 0x012c, TryCatch #0 {all -> 0x012c, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0036, B:20:0x0040, B:22:0x0043, B:24:0x0047, B:26:0x0053, B:27:0x0056, B:29:0x0063, B:35:0x0072, B:36:0x0080, B:40:0x009b, B:48:0x00ab, B:51:0x00b7, B:52:0x00c1, B:53:0x00cb, B:55:0x00d2, B:56:0x00d7, B:58:0x00e2, B:60:0x00e9, B:64:0x00f3, B:67:0x00ff, B:68:0x0105, B:70:0x010e, B:15:0x002b), top: B:86:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff A[Catch: all -> 0x012c, TryCatch #0 {all -> 0x012c, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0036, B:20:0x0040, B:22:0x0043, B:24:0x0047, B:26:0x0053, B:27:0x0056, B:29:0x0063, B:35:0x0072, B:36:0x0080, B:40:0x009b, B:48:0x00ab, B:51:0x00b7, B:52:0x00c1, B:53:0x00cb, B:55:0x00d2, B:56:0x00d7, B:58:0x00e2, B:60:0x00e9, B:64:0x00f3, B:67:0x00ff, B:68:0x0105, B:70:0x010e, B:15:0x002b), top: B:86:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010e A[Catch: all -> 0x012c, TRY_LEAVE, TryCatch #0 {all -> 0x012c, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0036, B:20:0x0040, B:22:0x0043, B:24:0x0047, B:26:0x0053, B:27:0x0056, B:29:0x0063, B:35:0x0072, B:36:0x0080, B:40:0x009b, B:48:0x00ab, B:51:0x00b7, B:52:0x00c1, B:53:0x00cb, B:55:0x00d2, B:56:0x00d7, B:58:0x00e2, B:60:0x00e9, B:64:0x00f3, B:67:0x00ff, B:68:0x0105, B:70:0x010e, B:15:0x002b), top: B:86:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence h(java.lang.CharSequence r10, int r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.c.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
