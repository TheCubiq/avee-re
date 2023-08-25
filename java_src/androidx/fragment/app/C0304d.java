package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import com.daaw.cd1;
/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public class C0304d {

    /* renamed from: a */
    public static final cd1<ClassLoader, cd1<String, Class<?>>> f1588a = new cd1<>();

    /* renamed from: b */
    public static boolean m29218b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m29217c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static Class<?> m29217c(ClassLoader classLoader, String str) {
        cd1<ClassLoader, cd1<String, Class<?>>> cd1Var = f1588a;
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

    /* renamed from: d */
    public static Class<? extends Fragment> m29216d(ClassLoader classLoader, String str) {
        try {
            return m29217c(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.C0259f("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.C0259f("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo29219a(ClassLoader classLoader, String str) {
        throw null;
    }
}
