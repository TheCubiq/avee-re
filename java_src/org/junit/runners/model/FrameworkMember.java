package org.junit.runners.model;

import java.lang.reflect.Modifier;
import java.util.List;
import org.junit.runners.model.FrameworkMember;
/* loaded from: classes2.dex */
public abstract class FrameworkMember<T extends FrameworkMember<T>> implements Annotatable {
    public abstract Class<?> getDeclaringClass();

    protected abstract int getModifiers();

    public abstract String getName();

    public abstract Class<?> getType();

    abstract boolean isBridgeMethod();

    abstract boolean isShadowedBy(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public T handlePossibleBridgeMethod(List<T> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            T t = list.get(size);
            if (isShadowedBy(t)) {
                if (t.isBridgeMethod()) {
                    list.remove(size);
                    return t;
                }
                return null;
            }
        }
        return this;
    }

    public boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    public boolean isPublic() {
        return Modifier.isPublic(getModifiers());
    }
}
