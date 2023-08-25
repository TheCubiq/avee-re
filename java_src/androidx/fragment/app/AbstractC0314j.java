package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0344c;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public abstract class AbstractC0314j {

    /* renamed from: a */
    public final C0304d f1611a;

    /* renamed from: b */
    public final ClassLoader f1612b;

    /* renamed from: d */
    public int f1614d;

    /* renamed from: e */
    public int f1615e;

    /* renamed from: f */
    public int f1616f;

    /* renamed from: g */
    public int f1617g;

    /* renamed from: h */
    public int f1618h;

    /* renamed from: i */
    public boolean f1619i;

    /* renamed from: k */
    public String f1621k;

    /* renamed from: l */
    public int f1622l;

    /* renamed from: m */
    public CharSequence f1623m;

    /* renamed from: n */
    public int f1624n;

    /* renamed from: o */
    public CharSequence f1625o;

    /* renamed from: p */
    public ArrayList<String> f1626p;

    /* renamed from: q */
    public ArrayList<String> f1627q;

    /* renamed from: s */
    public ArrayList<Runnable> f1629s;

    /* renamed from: c */
    public ArrayList<C0315a> f1613c = new ArrayList<>();

    /* renamed from: j */
    public boolean f1620j = true;

    /* renamed from: r */
    public boolean f1628r = false;

    /* renamed from: androidx.fragment.app.j$a */
    /* loaded from: classes.dex */
    public static final class C0315a {

        /* renamed from: a */
        public int f1630a;

        /* renamed from: b */
        public Fragment f1631b;

        /* renamed from: c */
        public int f1632c;

        /* renamed from: d */
        public int f1633d;

        /* renamed from: e */
        public int f1634e;

        /* renamed from: f */
        public int f1635f;

        /* renamed from: g */
        public AbstractC0344c.EnumC0347c f1636g;

        /* renamed from: h */
        public AbstractC0344c.EnumC0347c f1637h;

        public C0315a() {
        }

        public C0315a(int i, Fragment fragment) {
            this.f1630a = i;
            this.f1631b = fragment;
            AbstractC0344c.EnumC0347c enumC0347c = AbstractC0344c.EnumC0347c.RESUMED;
            this.f1636g = enumC0347c;
            this.f1637h = enumC0347c;
        }
    }

    public AbstractC0314j(C0304d c0304d, ClassLoader classLoader) {
        this.f1611a = c0304d;
        this.f1612b = classLoader;
    }

    /* renamed from: b */
    public AbstractC0314j m29151b(int i, Fragment fragment, String str) {
        mo29142k(i, fragment, str, 1);
        return this;
    }

    /* renamed from: c */
    public AbstractC0314j m29150c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f1375V = viewGroup;
        return m29151b(viewGroup.getId(), fragment, str);
    }

    /* renamed from: d */
    public AbstractC0314j m29149d(Fragment fragment, String str) {
        mo29142k(0, fragment, str, 1);
        return this;
    }

    /* renamed from: e */
    public void m29148e(C0315a c0315a) {
        this.f1613c.add(c0315a);
        c0315a.f1632c = this.f1614d;
        c0315a.f1633d = this.f1615e;
        c0315a.f1634e = this.f1616f;
        c0315a.f1635f = this.f1617g;
    }

    /* renamed from: f */
    public abstract int mo29147f();

    /* renamed from: g */
    public abstract int mo29146g();

    /* renamed from: h */
    public abstract void mo29145h();

    /* renamed from: i */
    public abstract void mo29144i();

    /* renamed from: j */
    public AbstractC0314j m29143j() {
        if (this.f1619i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f1620j = false;
        return this;
    }

    /* renamed from: k */
    public void mo29142k(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f1367N;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f1367N + " now " + str);
            }
            fragment.f1367N = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.f1365L;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f1365L + " now " + i);
            }
            fragment.f1365L = i;
            fragment.f1366M = i;
        }
        m29148e(new C0315a(i2, fragment));
    }

    /* renamed from: l */
    public AbstractC0314j mo29141l(Fragment fragment) {
        m29148e(new C0315a(3, fragment));
        return this;
    }

    /* renamed from: m */
    public AbstractC0314j m29140m(int i, Fragment fragment) {
        return m29139n(i, fragment, null);
    }

    /* renamed from: n */
    public AbstractC0314j m29139n(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo29142k(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: o */
    public AbstractC0314j m29138o(boolean z) {
        this.f1628r = z;
        return this;
    }
}
