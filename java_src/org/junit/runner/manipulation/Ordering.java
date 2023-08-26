package org.junit.runner.manipulation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.junit.runner.Description;
/* loaded from: classes2.dex */
public abstract class Ordering {
    private static final String CONSTRUCTOR_ERROR_FORMAT = "Ordering class %s should have a public constructor with signature %s(Ordering.Context context)";

    /* loaded from: classes2.dex */
    public interface Factory {
        Ordering create(Context context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract List<Description> orderItems(Collection<Description> collection);

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean validateOrderingIsCorrect() {
        return true;
    }

    public static Ordering shuffledBy(final Random random) {
        return new Ordering() { // from class: org.junit.runner.manipulation.Ordering.1
            @Override // org.junit.runner.manipulation.Ordering
            boolean validateOrderingIsCorrect() {
                return false;
            }

            @Override // org.junit.runner.manipulation.Ordering
            protected List<Description> orderItems(Collection<Description> collection) {
                ArrayList arrayList = new ArrayList(collection);
                Collections.shuffle(arrayList, random);
                return arrayList;
            }
        };
    }

    public static Ordering definedBy(Class<? extends Factory> cls, Description description) throws InvalidOrderingException {
        if (cls != null) {
            if (description == null) {
                throw new NullPointerException("annotatedTestClass cannot be null");
            }
            try {
                return definedBy(cls.getConstructor(new Class[0]).newInstance(new Object[0]), description);
            } catch (NoSuchMethodException unused) {
                throw new InvalidOrderingException(String.format(CONSTRUCTOR_ERROR_FORMAT, getClassName(cls), cls.getSimpleName()));
            } catch (Exception e) {
                throw new InvalidOrderingException("Could not create ordering for " + description, e);
            }
        }
        throw new NullPointerException("factoryClass cannot be null");
    }

    public static Ordering definedBy(Factory factory, Description description) throws InvalidOrderingException {
        if (factory != null) {
            if (description == null) {
                throw new NullPointerException("annotatedTestClass cannot be null");
            }
            return factory.create(new Context(description));
        }
        throw new NullPointerException("factory cannot be null");
    }

    private static String getClassName(Class<?> cls) {
        String canonicalName = cls.getCanonicalName();
        return canonicalName == null ? cls.getName() : canonicalName;
    }

    public void apply(Object obj) throws InvalidOrderingException {
        if (obj instanceof Orderable) {
            ((Orderable) obj).order(new Orderer(this));
        }
    }

    /* loaded from: classes2.dex */
    public static class Context {
        private final Description description;

        public Description getTarget() {
            return this.description;
        }

        private Context(Description description) {
            this.description = description;
        }
    }
}
