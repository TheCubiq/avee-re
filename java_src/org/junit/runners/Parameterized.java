package org.junit.runners;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InvalidTestClassError;
import org.junit.runners.model.TestClass;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runners.parameterized.ParametersRunnerFactory;
import org.junit.runners.parameterized.TestWithParameters;
/* loaded from: classes2.dex */
public class Parameterized extends Suite {

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface AfterParam {
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface BeforeParam {
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface Parameter {
        int value() default 0;
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface Parameters {
        String name() default "{index}";
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface UseParametersRunnerFactory {
        Class<? extends ParametersRunnerFactory> value() default BlockJUnit4ClassRunnerWithParametersFactory.class;
    }

    public Parameterized(Class<?> cls) throws Throwable {
        this(cls, new RunnersFactory(cls));
    }

    private Parameterized(Class<?> cls, RunnersFactory runnersFactory) throws Exception {
        super(cls, runnersFactory.createRunners());
        validateBeforeParamAndAfterParamMethods(Integer.valueOf(runnersFactory.parameterCount));
    }

    private void validateBeforeParamAndAfterParamMethods(Integer num) throws InvalidTestClassError {
        ArrayList arrayList = new ArrayList();
        validatePublicStaticVoidMethods(BeforeParam.class, num, arrayList);
        validatePublicStaticVoidMethods(AfterParam.class, num, arrayList);
        if (!arrayList.isEmpty()) {
            throw new InvalidTestClassError(getTestClass().getJavaClass(), arrayList);
        }
    }

    private void validatePublicStaticVoidMethods(Class<? extends Annotation> cls, Integer num, List<Throwable> list) {
        int length;
        for (FrameworkMethod frameworkMethod : getTestClass().getAnnotatedMethods(cls)) {
            frameworkMethod.validatePublicVoid(true, list);
            if (num != null && (length = frameworkMethod.getMethod().getParameterTypes().length) != 0 && length != num.intValue()) {
                list.add(new Exception("Method " + frameworkMethod.getName() + "() should have 0 or " + num + " parameter(s)"));
            }
        }
    }

    /* loaded from: classes2.dex */
    private static class AssumptionViolationRunner extends Runner {
        private final Description description;
        private final AssumptionViolatedException exception;

        AssumptionViolationRunner(TestClass testClass, String str, AssumptionViolatedException assumptionViolatedException) {
            Class<?> javaClass = testClass.getJavaClass();
            this.description = Description.createTestDescription(javaClass, str + "() assumption violation");
            this.exception = assumptionViolatedException;
        }

        @Override // org.junit.runner.Runner, org.junit.runner.Describable
        public Description getDescription() {
            return this.description;
        }

        @Override // org.junit.runner.Runner
        public void run(RunNotifier runNotifier) {
            runNotifier.fireTestAssumptionFailed(new Failure(this.description, this.exception));
        }
    }

    /* loaded from: classes2.dex */
    private static class RunnersFactory {
        private static final ParametersRunnerFactory DEFAULT_FACTORY = new BlockJUnit4ClassRunnerWithParametersFactory();
        private final List<Object> allParameters;
        private final int parameterCount;
        private final FrameworkMethod parametersMethod;
        private final Runner runnerOverride;
        private final TestClass testClass;

        private RunnersFactory(Class<?> cls) throws Throwable {
            List<Object> list;
            AssumptionViolationRunner assumptionViolationRunner;
            TestClass testClass = new TestClass(cls);
            this.testClass = testClass;
            FrameworkMethod parametersMethod = getParametersMethod(testClass);
            this.parametersMethod = parametersMethod;
            try {
                list = allParameters(this.testClass, parametersMethod);
                assumptionViolationRunner = null;
            } catch (AssumptionViolatedException e) {
                List<Object> emptyList = Collections.emptyList();
                AssumptionViolationRunner assumptionViolationRunner2 = new AssumptionViolationRunner(this.testClass, this.parametersMethod.getName(), e);
                list = emptyList;
                assumptionViolationRunner = assumptionViolationRunner2;
            }
            this.allParameters = list;
            this.runnerOverride = assumptionViolationRunner;
            this.parameterCount = list.isEmpty() ? 0 : normalizeParameters(this.allParameters.get(0)).length;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<Runner> createRunners() throws Exception {
            Runner runner = this.runnerOverride;
            if (runner != null) {
                return Collections.singletonList(runner);
            }
            return Collections.unmodifiableList(createRunnersForParameters(this.allParameters, ((Parameters) this.parametersMethod.getAnnotation(Parameters.class)).name(), getParametersRunnerFactory()));
        }

        private ParametersRunnerFactory getParametersRunnerFactory() throws InstantiationException, IllegalAccessException {
            UseParametersRunnerFactory useParametersRunnerFactory = (UseParametersRunnerFactory) this.testClass.getAnnotation(UseParametersRunnerFactory.class);
            if (useParametersRunnerFactory == null) {
                return DEFAULT_FACTORY;
            }
            return useParametersRunnerFactory.value().newInstance();
        }

        private TestWithParameters createTestWithNotNormalizedParameters(String str, int i, Object obj) {
            return createTestWithParameters(this.testClass, str, i, normalizeParameters(obj));
        }

        private static Object[] normalizeParameters(Object obj) {
            return obj instanceof Object[] ? (Object[]) obj : new Object[]{obj};
        }

        private static List<Object> allParameters(TestClass testClass, FrameworkMethod frameworkMethod) throws Throwable {
            Object invokeExplosively = frameworkMethod.invokeExplosively(null, new Object[0]);
            if (invokeExplosively instanceof List) {
                return (List) invokeExplosively;
            }
            if (invokeExplosively instanceof Collection) {
                return new ArrayList((Collection) invokeExplosively);
            }
            if (invokeExplosively instanceof Iterable) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : (Iterable) invokeExplosively) {
                    arrayList.add(obj);
                }
                return arrayList;
            } else if (invokeExplosively instanceof Object[]) {
                return Arrays.asList((Object[]) invokeExplosively);
            } else {
                throw parametersMethodReturnedWrongType(testClass, frameworkMethod);
            }
        }

        private static FrameworkMethod getParametersMethod(TestClass testClass) throws Exception {
            for (FrameworkMethod frameworkMethod : testClass.getAnnotatedMethods(Parameters.class)) {
                if (frameworkMethod.isStatic() && frameworkMethod.isPublic()) {
                    return frameworkMethod;
                }
            }
            throw new Exception("No public static parameters method on class " + testClass.getName());
        }

        private List<Runner> createRunnersForParameters(Iterable<Object> iterable, String str, ParametersRunnerFactory parametersRunnerFactory) throws Exception {
            try {
                List<TestWithParameters> createTestsForParameters = createTestsForParameters(iterable, str);
                ArrayList arrayList = new ArrayList();
                for (TestWithParameters testWithParameters : createTestsForParameters) {
                    arrayList.add(parametersRunnerFactory.createRunnerForTestWithParameters(testWithParameters));
                }
                return arrayList;
            } catch (ClassCastException unused) {
                throw parametersMethodReturnedWrongType(this.testClass, this.parametersMethod);
            }
        }

        private List<TestWithParameters> createTestsForParameters(Iterable<Object> iterable, String str) throws Exception {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : iterable) {
                arrayList.add(createTestWithNotNormalizedParameters(str, i, obj));
                i++;
            }
            return arrayList;
        }

        private static Exception parametersMethodReturnedWrongType(TestClass testClass, FrameworkMethod frameworkMethod) throws Exception {
            return new Exception(MessageFormat.format("{0}.{1}() must return an Iterable of arrays.", testClass.getName(), frameworkMethod.getName()));
        }

        private TestWithParameters createTestWithParameters(TestClass testClass, String str, int i, Object[] objArr) {
            String format = MessageFormat.format(str.replaceAll("\\{index\\}", Integer.toString(i)), objArr);
            return new TestWithParameters("[" + format + "]", testClass, Arrays.asList(objArr));
        }
    }
}
