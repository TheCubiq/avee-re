package org.junit.runners;

import org.junit.runners.model.InitializationError;
import org.junit.runners.model.TestClass;
/* loaded from: classes2.dex */
public final class JUnit4 extends BlockJUnit4ClassRunner {
    public JUnit4(Class<?> cls) throws InitializationError {
        super(new TestClass(cls));
    }
}
