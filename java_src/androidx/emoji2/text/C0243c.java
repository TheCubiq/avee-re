package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C0232b;
import androidx.emoji2.text.C0250e;
import com.daaw.AbstractC1477gw;
import com.daaw.C1334fw;
import com.daaw.le1;
import com.daaw.mv0;
import com.daaw.pp1;
import java.util.Arrays;
/* renamed from: androidx.emoji2.text.c */
/* loaded from: classes.dex */
public final class C0243c {

    /* renamed from: a */
    public final C0232b.C0242i f1307a;

    /* renamed from: b */
    public final C0250e f1308b;

    /* renamed from: c */
    public C0232b.InterfaceC0237d f1309c;

    /* renamed from: d */
    public final boolean f1310d;

    /* renamed from: e */
    public final int[] f1311e;

    /* renamed from: androidx.emoji2.text.c$a */
    /* loaded from: classes.dex */
    public static final class C0244a {
        /* renamed from: a */
        public static int m29537a(CharSequence charSequence, int i, int i2) {
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

        /* renamed from: b */
        public static int m29536b(CharSequence charSequence, int i, int i2) {
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

    /* renamed from: androidx.emoji2.text.c$b */
    /* loaded from: classes.dex */
    public static class C0245b implements C0232b.InterfaceC0237d {

        /* renamed from: b */
        public static final ThreadLocal<StringBuilder> f1312b = new ThreadLocal<>();

        /* renamed from: a */
        public final TextPaint f1313a;

        public C0245b() {
            TextPaint textPaint = new TextPaint();
            this.f1313a = textPaint;
            textPaint.setTextSize(10.0f);
        }

        /* renamed from: b */
        public static StringBuilder m29534b() {
            ThreadLocal<StringBuilder> threadLocal = f1312b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            return threadLocal.get();
        }

        @Override // androidx.emoji2.text.C0232b.InterfaceC0237d
        /* renamed from: a */
        public boolean mo29535a(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 23 || i3 <= i4) {
                StringBuilder m29534b = m29534b();
                m29534b.setLength(0);
                while (i < i2) {
                    m29534b.append(charSequence.charAt(i));
                    i++;
                }
                return mv0.m15758a(this.f1313a, m29534b.toString());
            }
            return false;
        }
    }

    /* renamed from: androidx.emoji2.text.c$c */
    /* loaded from: classes.dex */
    public static final class C0246c {

        /* renamed from: a */
        public int f1314a = 1;

        /* renamed from: b */
        public final C0250e.C0251a f1315b;

        /* renamed from: c */
        public C0250e.C0251a f1316c;

        /* renamed from: d */
        public C0250e.C0251a f1317d;

        /* renamed from: e */
        public int f1318e;

        /* renamed from: f */
        public int f1319f;

        /* renamed from: g */
        public final boolean f1320g;

        /* renamed from: h */
        public final int[] f1321h;

        public C0246c(C0250e.C0251a c0251a, boolean z, int[] iArr) {
            this.f1315b = c0251a;
            this.f1316c = c0251a;
            this.f1320g = z;
            this.f1321h = iArr;
        }

        /* renamed from: d */
        public static boolean m29530d(int i) {
            return i == 65039;
        }

        /* renamed from: f */
        public static boolean m29528f(int i) {
            return i == 65038;
        }

        /* renamed from: a */
        public int m29533a(int i) {
            C0250e.C0251a m29507a = this.f1316c.m29507a(i);
            int i2 = 3;
            if (this.f1314a != 2) {
                if (m29507a != null) {
                    this.f1314a = 2;
                    this.f1316c = m29507a;
                    this.f1319f = 1;
                    i2 = 2;
                }
                i2 = m29527g();
            } else {
                if (m29507a != null) {
                    this.f1316c = m29507a;
                    this.f1319f++;
                } else {
                    if (!m29528f(i)) {
                        if (!m29530d(i)) {
                            if (this.f1316c.m29506b() != null && (this.f1319f != 1 || m29526h())) {
                                this.f1317d = this.f1316c;
                                m29527g();
                            }
                        }
                    }
                    i2 = m29527g();
                }
                i2 = 2;
            }
            this.f1318e = i;
            return i2;
        }

        /* renamed from: b */
        public C1334fw m29532b() {
            return this.f1316c.m29506b();
        }

        /* renamed from: c */
        public C1334fw m29531c() {
            return this.f1317d.m29506b();
        }

        /* renamed from: e */
        public boolean m29529e() {
            return this.f1314a == 2 && this.f1316c.m29506b() != null && (this.f1319f > 1 || m29526h());
        }

        /* renamed from: g */
        public final int m29527g() {
            this.f1314a = 1;
            this.f1316c = this.f1315b;
            this.f1319f = 0;
            return 1;
        }

        /* renamed from: h */
        public final boolean m29526h() {
            if (this.f1316c.m29506b().m22224j() || m29530d(this.f1318e)) {
                return true;
            }
            if (this.f1320g) {
                if (this.f1321h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f1321h, this.f1316c.m29506b().m22232b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public C0243c(C0250e c0250e, C0232b.C0242i c0242i, C0232b.InterfaceC0237d interfaceC0237d, boolean z, int[] iArr) {
        this.f1307a = c0242i;
        this.f1308b = c0250e;
        this.f1309c = interfaceC0237d;
        this.f1310d = z;
        this.f1311e = iArr;
    }

    /* renamed from: b */
    public static boolean m29544b(Editable editable, KeyEvent keyEvent, boolean z) {
        AbstractC1477gw[] abstractC1477gwArr;
        if (m29539g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m29540f(selectionStart, selectionEnd) && (abstractC1477gwArr = (AbstractC1477gw[]) editable.getSpans(selectionStart, selectionEnd, AbstractC1477gw.class)) != null && abstractC1477gwArr.length > 0) {
            for (AbstractC1477gw abstractC1477gw : abstractC1477gwArr) {
                int spanStart = editable.getSpanStart(abstractC1477gw);
                int spanEnd = editable.getSpanEnd(abstractC1477gw);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m29543c(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m29540f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                max = C0244a.m29537a(editable, selectionStart, Math.max(i, 0));
                min = C0244a.m29536b(editable, selectionEnd, Math.max(i2, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i, 0);
                min = Math.min(selectionEnd + i2, editable.length());
            }
            AbstractC1477gw[] abstractC1477gwArr = (AbstractC1477gw[]) editable.getSpans(max, min, AbstractC1477gw.class);
            if (abstractC1477gwArr != null && abstractC1477gwArr.length > 0) {
                for (AbstractC1477gw abstractC1477gw : abstractC1477gwArr) {
                    int spanStart = editable.getSpanStart(abstractC1477gw);
                    int spanEnd = editable.getSpanEnd(abstractC1477gw);
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

    /* renamed from: d */
    public static boolean m29542d(Editable editable, int i, KeyEvent keyEvent) {
        if (i != 67 ? i != 112 ? false : m29544b(editable, keyEvent, true) : m29544b(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m29540f(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* renamed from: g */
    public static boolean m29539g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* renamed from: a */
    public final void m29545a(Spannable spannable, C1334fw c1334fw, int i, int i2) {
        spannable.setSpan(this.f1307a.m29546a(c1334fw), i, i2, 33);
    }

    /* renamed from: e */
    public final boolean m29541e(CharSequence charSequence, int i, int i2, C1334fw c1334fw) {
        if (c1334fw.m22230d() == 0) {
            c1334fw.m22223k(this.f1309c.mo29535a(charSequence, i, i2, c1334fw.m22226h()));
        }
        return c1334fw.m22230d() == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0125, code lost:
        ((com.daaw.le1) r10).m16995d();
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[Catch: all -> 0x012c, TryCatch #0 {all -> 0x012c, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0036, B:20:0x0040, B:22:0x0043, B:24:0x0047, B:26:0x0053, B:27:0x0056, B:29:0x0063, B:35:0x0072, B:36:0x0080, B:40:0x009b, B:48:0x00ab, B:51:0x00b7, B:52:0x00c1, B:53:0x00cb, B:55:0x00d2, B:56:0x00d7, B:58:0x00e2, B:60:0x00e9, B:64:0x00f3, B:67:0x00ff, B:68:0x0105, B:70:0x010e, B:15:0x002b), top: B:86:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff A[Catch: all -> 0x012c, TryCatch #0 {all -> 0x012c, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0036, B:20:0x0040, B:22:0x0043, B:24:0x0047, B:26:0x0053, B:27:0x0056, B:29:0x0063, B:35:0x0072, B:36:0x0080, B:40:0x009b, B:48:0x00ab, B:51:0x00b7, B:52:0x00c1, B:53:0x00cb, B:55:0x00d2, B:56:0x00d7, B:58:0x00e2, B:60:0x00e9, B:64:0x00f3, B:67:0x00ff, B:68:0x0105, B:70:0x010e, B:15:0x002b), top: B:86:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010e A[Catch: all -> 0x012c, TRY_LEAVE, TryCatch #0 {all -> 0x012c, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0036, B:20:0x0040, B:22:0x0043, B:24:0x0047, B:26:0x0053, B:27:0x0056, B:29:0x0063, B:35:0x0072, B:36:0x0080, B:40:0x009b, B:48:0x00ab, B:51:0x00b7, B:52:0x00c1, B:53:0x00cb, B:55:0x00d2, B:56:0x00d7, B:58:0x00e2, B:60:0x00e9, B:64:0x00f3, B:67:0x00ff, B:68:0x0105, B:70:0x010e, B:15:0x002b), top: B:86:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d7 A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharSequence m29538h(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        C0246c c0246c;
        pp1 pp1Var;
        int codePointAt;
        int i4;
        int m29533a;
        AbstractC1477gw[] abstractC1477gwArr;
        boolean z2 = charSequence instanceof le1;
        if (z2) {
            ((le1) charSequence).m16998a();
        }
        pp1 pp1Var2 = null;
        if (!z2) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, AbstractC1477gw.class) <= i2) {
                        pp1Var2 = new pp1(charSequence);
                    }
                    if (pp1Var2 != null && (abstractC1477gwArr = (AbstractC1477gw[]) pp1Var2.getSpans(i, i2, AbstractC1477gw.class)) != null && abstractC1477gwArr.length > 0) {
                        for (AbstractC1477gw abstractC1477gw : abstractC1477gwArr) {
                            int spanStart = pp1Var2.getSpanStart(abstractC1477gw);
                            int spanEnd = pp1Var2.getSpanEnd(abstractC1477gw);
                            if (spanStart != i2) {
                                pp1Var2.removeSpan(abstractC1477gw);
                            }
                            i = Math.min(spanStart, i);
                            i2 = Math.max(spanEnd, i2);
                        }
                    }
                    if (i != i2 && i < charSequence.length()) {
                        if (i3 != Integer.MAX_VALUE && pp1Var2 != null) {
                            i3 -= ((AbstractC1477gw[]) pp1Var2.getSpans(0, pp1Var2.length(), AbstractC1477gw.class)).length;
                        }
                        c0246c = new C0246c(this.f1308b.m29510f(), this.f1310d, this.f1311e);
                        pp1Var = pp1Var2;
                        codePointAt = Character.codePointAt(charSequence, i);
                        int i5 = 0;
                        loop1: while (true) {
                            i4 = i;
                            while (i < i2 && i5 < i3) {
                                m29533a = c0246c.m29533a(codePointAt);
                                if (m29533a != 1) {
                                    i4 += Character.charCount(Character.codePointAt(charSequence, i4));
                                    if (i4 < i2) {
                                        codePointAt = Character.codePointAt(charSequence, i4);
                                    }
                                    i = i4;
                                } else if (m29533a == 2) {
                                    i += Character.charCount(codePointAt);
                                    if (i < i2) {
                                        codePointAt = Character.codePointAt(charSequence, i);
                                    }
                                } else if (m29533a == 3) {
                                    if (z || !m29541e(charSequence, i4, i, c0246c.m29531c())) {
                                        if (pp1Var == null) {
                                            pp1Var = new pp1((Spannable) new SpannableString(charSequence));
                                        }
                                        m29545a(pp1Var, c0246c.m29531c(), i4, i);
                                        i5++;
                                    }
                                }
                            }
                        }
                        if (c0246c.m29529e() && i5 < i3 && (z || !m29541e(charSequence, i4, i, c0246c.m29532b()))) {
                            if (pp1Var == null) {
                                pp1Var = new pp1(charSequence);
                            }
                            m29545a(pp1Var, c0246c.m29532b(), i4, i);
                        }
                        if (pp1Var == null) {
                            return pp1Var.m13240b();
                        }
                        if (z2) {
                            ((le1) charSequence).m16995d();
                        }
                        return charSequence;
                    }
                    return charSequence;
                }
            } finally {
                if (z2) {
                    ((le1) charSequence).m16995d();
                }
            }
        }
        pp1Var2 = new pp1((Spannable) charSequence);
        if (pp1Var2 != null) {
            while (r5 < r4) {
            }
        }
        if (i != i2) {
            if (i3 != Integer.MAX_VALUE) {
                i3 -= ((AbstractC1477gw[]) pp1Var2.getSpans(0, pp1Var2.length(), AbstractC1477gw.class)).length;
            }
            c0246c = new C0246c(this.f1308b.m29510f(), this.f1310d, this.f1311e);
            pp1Var = pp1Var2;
            codePointAt = Character.codePointAt(charSequence, i);
            int i52 = 0;
            loop1: while (true) {
                i4 = i;
                while (i < i2) {
                    m29533a = c0246c.m29533a(codePointAt);
                    if (m29533a != 1) {
                    }
                }
            }
            if (c0246c.m29529e()) {
                if (pp1Var == null) {
                }
                m29545a(pp1Var, c0246c.m29532b(), i4, i);
            }
            if (pp1Var == null) {
            }
        }
        return charSequence;
    }
}
