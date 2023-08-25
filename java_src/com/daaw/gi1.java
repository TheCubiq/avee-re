package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0086g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class gi1 extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f11286e;

    /* renamed from: f */
    public static final Class<?>[] f11287f;

    /* renamed from: a */
    public final Object[] f11288a;

    /* renamed from: b */
    public final Object[] f11289b;

    /* renamed from: c */
    public Context f11290c;

    /* renamed from: d */
    public Object f11291d;

    /* renamed from: com.daaw.gi1$a */
    /* loaded from: classes.dex */
    public static class MenuItem$OnMenuItemClickListenerC1422a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class<?>[] f11292c = {MenuItem.class};

        /* renamed from: a */
        public Object f11293a;

        /* renamed from: b */
        public Method f11294b;

        public MenuItem$OnMenuItemClickListenerC1422a(Object obj, String str) {
            this.f11293a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f11294b = cls.getMethod(str, f11292c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f11294b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f11294b.invoke(this.f11293a, menuItem)).booleanValue();
                }
                this.f11294b.invoke(this.f11293a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.daaw.gi1$b */
    /* loaded from: classes.dex */
    public class C1423b {

        /* renamed from: A */
        public AbstractC2388o0 f11295A;

        /* renamed from: B */
        public CharSequence f11296B;

        /* renamed from: C */
        public CharSequence f11297C;

        /* renamed from: D */
        public ColorStateList f11298D = null;

        /* renamed from: E */
        public PorterDuff.Mode f11299E = null;

        /* renamed from: a */
        public Menu f11301a;

        /* renamed from: b */
        public int f11302b;

        /* renamed from: c */
        public int f11303c;

        /* renamed from: d */
        public int f11304d;

        /* renamed from: e */
        public int f11305e;

        /* renamed from: f */
        public boolean f11306f;

        /* renamed from: g */
        public boolean f11307g;

        /* renamed from: h */
        public boolean f11308h;

        /* renamed from: i */
        public int f11309i;

        /* renamed from: j */
        public int f11310j;

        /* renamed from: k */
        public CharSequence f11311k;

        /* renamed from: l */
        public CharSequence f11312l;

        /* renamed from: m */
        public int f11313m;

        /* renamed from: n */
        public char f11314n;

        /* renamed from: o */
        public int f11315o;

        /* renamed from: p */
        public char f11316p;

        /* renamed from: q */
        public int f11317q;

        /* renamed from: r */
        public int f11318r;

        /* renamed from: s */
        public boolean f11319s;

        /* renamed from: t */
        public boolean f11320t;

        /* renamed from: u */
        public boolean f11321u;

        /* renamed from: v */
        public int f11322v;

        /* renamed from: w */
        public int f11323w;

        /* renamed from: x */
        public String f11324x;

        /* renamed from: y */
        public String f11325y;

        /* renamed from: z */
        public String f11326z;

        public C1423b(Menu menu) {
            this.f11301a = menu;
            m21579h();
        }

        /* renamed from: a */
        public void m21586a() {
            this.f11308h = true;
            m21578i(this.f11301a.add(this.f11302b, this.f11309i, this.f11310j, this.f11311k));
        }

        /* renamed from: b */
        public SubMenu m21585b() {
            this.f11308h = true;
            SubMenu addSubMenu = this.f11301a.addSubMenu(this.f11302b, this.f11309i, this.f11310j, this.f11311k);
            m21578i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: c */
        public final char m21584c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: d */
        public boolean m21583d() {
            return this.f11308h;
        }

        /* renamed from: e */
        public final <T> T m21582e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, gi1.this.f11290c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                return null;
            }
        }

        /* renamed from: f */
        public void m21581f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = gi1.this.f11290c.obtainStyledAttributes(attributeSet, x21.f31954o1);
            this.f11302b = obtainStyledAttributes.getResourceId(x21.f31964q1, 0);
            this.f11303c = obtainStyledAttributes.getInt(x21.f31974s1, 0);
            this.f11304d = obtainStyledAttributes.getInt(x21.f31979t1, 0);
            this.f11305e = obtainStyledAttributes.getInt(x21.f31984u1, 0);
            this.f11306f = obtainStyledAttributes.getBoolean(x21.f31969r1, true);
            this.f11307g = obtainStyledAttributes.getBoolean(x21.f31959p1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public void m21580g(AttributeSet attributeSet) {
            ul1 m8038u = ul1.m8038u(gi1.this.f11290c, attributeSet, x21.f31989v1);
            this.f11309i = m8038u.m8045n(x21.f32004y1, 0);
            this.f11310j = (m8038u.m8048k(x21.f31765B1, this.f11303c) & (-65536)) | (m8038u.m8048k(x21.f31770C1, this.f11304d) & 65535);
            this.f11311k = m8038u.m8043p(x21.f31775D1);
            this.f11312l = m8038u.m8043p(x21.f31780E1);
            this.f11313m = m8038u.m8045n(x21.f31994w1, 0);
            this.f11314n = m21584c(m8038u.m8044o(x21.f31785F1));
            this.f11315o = m8038u.m8048k(x21.f31820M1, 4096);
            this.f11316p = m21584c(m8038u.m8044o(x21.f31790G1));
            this.f11317q = m8038u.m8048k(x21.f31840Q1, 4096);
            int i = x21.f31795H1;
            this.f11318r = m8038u.m8040s(i) ? m8038u.m8058a(i, false) : this.f11305e;
            this.f11319s = m8038u.m8058a(x21.f32009z1, false);
            this.f11320t = m8038u.m8058a(x21.f31760A1, this.f11306f);
            this.f11321u = m8038u.m8058a(x21.f31999x1, this.f11307g);
            this.f11322v = m8038u.m8048k(x21.f31845R1, -1);
            this.f11326z = m8038u.m8044o(x21.f31800I1);
            this.f11323w = m8038u.m8045n(x21.f31805J1, 0);
            this.f11324x = m8038u.m8044o(x21.f31815L1);
            String m8044o = m8038u.m8044o(x21.f31810K1);
            this.f11325y = m8044o;
            if ((m8044o != null) && this.f11323w == 0 && this.f11324x == null) {
                this.f11295A = (AbstractC2388o0) m21582e(m8044o, gi1.f11287f, gi1.this.f11289b);
            } else {
                this.f11295A = null;
            }
            this.f11296B = m8038u.m8043p(x21.f31825N1);
            this.f11297C = m8038u.m8043p(x21.f31850S1);
            int i2 = x21.f31835P1;
            if (m8038u.m8040s(i2)) {
                this.f11299E = C3373vu.m6785e(m8038u.m8048k(i2, -1), this.f11299E);
            } else {
                this.f11299E = null;
            }
            int i3 = x21.f31830O1;
            if (m8038u.m8040s(i3)) {
                this.f11298D = m8038u.m8056c(i3);
            } else {
                this.f11298D = null;
            }
            m8038u.m8036w();
            this.f11308h = false;
        }

        /* renamed from: h */
        public void m21579h() {
            this.f11302b = 0;
            this.f11303c = 0;
            this.f11304d = 0;
            this.f11305e = 0;
            this.f11306f = true;
            this.f11307g = true;
        }

        /* renamed from: i */
        public final void m21578i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f11319s).setVisible(this.f11320t).setEnabled(this.f11321u).setCheckable(this.f11318r >= 1).setTitleCondensed(this.f11312l).setIcon(this.f11313m);
            int i = this.f11322v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f11326z != null) {
                if (gi1.this.f11290c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC1422a(gi1.this.m21588b(), this.f11326z));
            }
            if (this.f11318r >= 2) {
                if (menuItem instanceof C0086g) {
                    ((C0086g) menuItem).m30196t(true);
                } else if (menuItem instanceof jp0) {
                    ((jp0) menuItem).m18349h(true);
                }
            }
            String str = this.f11324x;
            if (str != null) {
                menuItem.setActionView((View) m21582e(str, gi1.f11286e, gi1.this.f11288a));
                z = true;
            }
            int i2 = this.f11323w;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            AbstractC2388o0 abstractC2388o0 = this.f11295A;
            if (abstractC2388o0 != null) {
                hp0.m20565a(menuItem, abstractC2388o0);
            }
            hp0.m20563c(menuItem, this.f11296B);
            hp0.m20559g(menuItem, this.f11297C);
            hp0.m20564b(menuItem, this.f11314n, this.f11315o);
            hp0.m20560f(menuItem, this.f11316p, this.f11317q);
            PorterDuff.Mode mode = this.f11299E;
            if (mode != null) {
                hp0.m20561e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f11298D;
            if (colorStateList != null) {
                hp0.m20562d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f11286e = clsArr;
        f11287f = clsArr;
    }

    public gi1(Context context) {
        super(context);
        this.f11290c = context;
        Object[] objArr = {context};
        this.f11288a = objArr;
        this.f11289b = objArr;
    }

    /* renamed from: a */
    public final Object m21589a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m21589a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: b */
    public Object m21588b() {
        if (this.f11291d == null) {
            this.f11291d = m21589a(this.f11290c);
        }
        return this.f11291d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r15 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r15 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r15.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0.m21579h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.m21583d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r15 = r0.f11295A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r15.mo14671a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0.m21585b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r0.m21586a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r15.equals("menu") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r15.equals("group") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r0.m21581f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r0.m21580g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r15.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        m21587c(r13, r14, r0.m21585b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
        return;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m21587c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C1423b c1423b = new C1423b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            }
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof fi1)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f11290c.getResources().getLayout(i);
                    m21587c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
