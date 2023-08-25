package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.c;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class j {
    public final d a;
    public final ClassLoader b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList<String> p;
    public ArrayList<String> q;
    public ArrayList<Runnable> s;
    public ArrayList<a> c = new ArrayList<>();
    public boolean j = true;
    public boolean r = false;

    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public Fragment b;
        public int c;
        public int d;
        public int e;
        public int f;
        public c.EnumC0020c g;
        public c.EnumC0020c h;

        public a() {
        }

        public a(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
            c.EnumC0020c enumC0020c = c.EnumC0020c.RESUMED;
            this.g = enumC0020c;
            this.h = enumC0020c;
        }
    }

    public j(d dVar, ClassLoader classLoader) {
        this.a = dVar;
        this.b = classLoader;
    }

    public j b(int i, Fragment fragment, String str) {
        k(i, fragment, str, 1);
        return this;
    }

    public j c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.V = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public j d(Fragment fragment, String str) {
        k(0, fragment, str, 1);
        return this;
    }

    public void e(a aVar) {
        this.c.add(aVar);
        aVar.c = this.d;
        aVar.d = this.e;
        aVar.e = this.f;
        aVar.f = this.g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public j j() {
        if (this.i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.j = false;
        return this;
    }

    public void k(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.N;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.N + " now " + str);
            }
            fragment.N = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.L;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.L + " now " + i);
            }
            fragment.L = i;
            fragment.M = i;
        }
        e(new a(i2, fragment));
    }

    public j l(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public j m(int i, Fragment fragment) {
        return n(i, fragment, null);
    }

    public j n(int i, Fragment fragment, String str) {
        if (i != 0) {
            k(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public j o(boolean z) {
        this.r = z;
        return this;
    }
}
