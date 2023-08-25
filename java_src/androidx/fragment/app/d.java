package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import com.daaw.cd1;
/* loaded from: classes.dex */
public class d {
    public static final cd1<ClassLoader, cd1<String, Class<?>>> a = new cd1<>();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class<?> c(ClassLoader classLoader, String str) {
        cd1<ClassLoader, cd1<String, Class<?>>> cd1Var = a;
        cd1<String, Class<?>> cd1Var2 = cd1Var.get(classLoader);
        if (cd1Var2 == null) {
            cd1Var2 = new cd1<>();
            cd1Var.put(classLoader, cd1Var2);
        }
        Class<?> cls = cd1Var2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            cd1Var2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.f("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.f("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}
