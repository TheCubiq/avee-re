package dagger.internal;

import javax.inject.Provider;
/* loaded from: classes2.dex */
public final class SingleCheck<T> implements Provider<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile Provider<T> provider;

    private SingleCheck(Provider<T> provider) {
        this.provider = provider;
    }

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.instance;
        if (t == UNINITIALIZED) {
            Provider<T> provider = this.provider;
            if (provider == null) {
                return (T) this.instance;
            }
            T t2 = provider.get();
            this.instance = t2;
            this.provider = null;
            return t2;
        }
        return t;
    }

    public static <P extends Provider<T>, T> Provider<T> provider(P p) {
        return ((p instanceof SingleCheck) || (p instanceof DoubleCheck)) ? p : new SingleCheck((Provider) Preconditions.checkNotNull(p));
    }
}
