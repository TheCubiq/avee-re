package org.junit.runners.parameterized;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import org.junit.internal.runners.statements.RunAfters;
import org.junit.internal.runners.statements.RunBefores;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.Parameterized;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
/* loaded from: classes.dex */
public class BlockJUnit4ClassRunnerWithParameters extends BlockJUnit4ClassRunner {
    private final String name;
    private final Object[] parameters;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum InjectionType {
        CONSTRUCTOR,
        FIELD
    }

    public BlockJUnit4ClassRunnerWithParameters(TestWithParameters testWithParameters) throws InitializationError {
        super(testWithParameters.getTestClass());
        this.parameters = testWithParameters.getParameters().toArray(new Object[testWithParameters.getParameters().size()]);
        this.name = testWithParameters.getName();
    }

    /* renamed from: org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$junit$runners$parameterized$BlockJUnit4ClassRunnerWithParameters$InjectionType;

        static {
            int[] iArr = new int[InjectionType.values().length];
            $SwitchMap$org$junit$runners$parameterized$BlockJUnit4ClassRunnerWithParameters$InjectionType = iArr;
            try {
                iArr[InjectionType.CONSTRUCTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$junit$runners$parameterized$BlockJUnit4ClassRunnerWithParameters$InjectionType[InjectionType.FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public Object createTest() throws Exception {
        InjectionType injectionType = getInjectionType();
        int i = AnonymousClass1.$SwitchMap$org$junit$runners$parameterized$BlockJUnit4ClassRunnerWithParameters$InjectionType[injectionType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return createTestUsingFieldInjection();
            }
            throw new IllegalStateException("The injection type " + injectionType + " is not supported.");
        }
        return createTestUsingConstructorInjection();
    }

    private Object createTestUsingConstructorInjection() throws Exception {
        return getTestClass().getOnlyConstructor().newInstance(this.parameters);
    }

    private Object createTestUsingFieldInjection() throws Exception {
        List<FrameworkField> annotatedFieldsByParameter = getAnnotatedFieldsByParameter();
        if (annotatedFieldsByParameter.size() != this.parameters.length) {
            throw new Exception("Wrong number of parameters and @Parameter fields. @Parameter fields counted: " + annotatedFieldsByParameter.size() + ", available parameters: " + this.parameters.length + ".");
        }
        Object newInstance = getTestClass().getJavaClass().newInstance();
        for (FrameworkField frameworkField : annotatedFieldsByParameter) {
            Field field = frameworkField.getField();
            int value = ((Parameterized.Parameter) field.getAnnotation(Parameterized.Parameter.class)).value();
            try {
                field.set(newInstance, this.parameters[value]);
            } catch (IllegalAccessException e) {
                IllegalAccessException illegalAccessException = new IllegalAccessException("Cannot set parameter '" + field.getName() + "'. Ensure that the field '" + field.getName() + "' is public.");
                illegalAccessException.initCause(e);
                throw illegalAccessException;
            } catch (IllegalArgumentException e2) {
                throw new Exception(getTestClass().getName() + ": Trying to set " + field.getName() + " with the value " + this.parameters[value] + " that is not the right type (" + this.parameters[value].getClass().getSimpleName() + " instead of " + field.getType().getSimpleName() + ").", e2);
            }
        }
        return newInstance;
    }

    @Override // org.junit.runners.ParentRunner
    protected String getName() {
        return this.name;
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    protected String testName(FrameworkMethod frameworkMethod) {
        return frameworkMethod.getName() + getName();
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    protected void validateConstructor(List<Throwable> list) {
        validateOnlyOneConstructor(list);
        if (getInjectionType() != InjectionType.CONSTRUCTOR) {
            validateZeroArgConstructor(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public void validateFields(List<Throwable> list) {
        super.validateFields(list);
        if (getInjectionType() == InjectionType.FIELD) {
            List<FrameworkField> annotatedFieldsByParameter = getAnnotatedFieldsByParameter();
            int size = annotatedFieldsByParameter.size();
            int[] iArr = new int[size];
            for (FrameworkField frameworkField : annotatedFieldsByParameter) {
                int value = ((Parameterized.Parameter) frameworkField.getField().getAnnotation(Parameterized.Parameter.class)).value();
                if (value < 0 || value > annotatedFieldsByParameter.size() - 1) {
                    list.add(new Exception("Invalid @Parameter value: " + value + ". @Parameter fields counted: " + annotatedFieldsByParameter.size() + ". Please use an index between 0 and " + (annotatedFieldsByParameter.size() - 1) + "."));
                } else {
                    iArr[value] = iArr[value] + 1;
                }
            }
            for (int i = 0; i < size; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    list.add(new Exception("@Parameter(" + i + ") is never used."));
                } else if (i2 > 1) {
                    list.add(new Exception("@Parameter(" + i + ") is used more than once (" + i2 + ")."));
                }
            }
        }
    }

    @Override // org.junit.runners.ParentRunner
    protected Statement classBlock(RunNotifier runNotifier) {
        return withAfterParams(withBeforeParams(childrenInvoker(runNotifier)));
    }

    private Statement withBeforeParams(Statement statement) {
        List<FrameworkMethod> annotatedMethods = getTestClass().getAnnotatedMethods(Parameterized.BeforeParam.class);
        return annotatedMethods.isEmpty() ? statement : new RunBeforeParams(statement, annotatedMethods);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class RunBeforeParams extends RunBefores {
        RunBeforeParams(Statement statement, List<FrameworkMethod> list) {
            super(statement, list, null);
        }

        @Override // org.junit.internal.runners.statements.RunBefores
        protected void invokeMethod(FrameworkMethod frameworkMethod) throws Throwable {
            Object[] objArr;
            if (frameworkMethod.getMethod().getParameterTypes().length != 0) {
                objArr = BlockJUnit4ClassRunnerWithParameters.this.parameters;
            } else {
                objArr = null;
            }
            frameworkMethod.invokeExplosively(null, objArr);
        }
    }

    private Statement withAfterParams(Statement statement) {
        List<FrameworkMethod> annotatedMethods = getTestClass().getAnnotatedMethods(Parameterized.AfterParam.class);
        return annotatedMethods.isEmpty() ? statement : new RunAfterParams(statement, annotatedMethods);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class RunAfterParams extends RunAfters {
        RunAfterParams(Statement statement, List<FrameworkMethod> list) {
            super(statement, list, null);
        }

        @Override // org.junit.internal.runners.statements.RunAfters
        protected void invokeMethod(FrameworkMethod frameworkMethod) throws Throwable {
            Object[] objArr;
            if (frameworkMethod.getMethod().getParameterTypes().length != 0) {
                objArr = BlockJUnit4ClassRunnerWithParameters.this.parameters;
            } else {
                objArr = null;
            }
            frameworkMethod.invokeExplosively(null, objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.runners.ParentRunner
    public Annotation[] getRunnerAnnotations() {
        Annotation[] runnerAnnotations;
        Annotation[] annotationArr = new Annotation[runnerAnnotations.length - 1];
        int i = 0;
        for (Annotation annotation : super.getRunnerAnnotations()) {
            if (!annotation.annotationType().equals(RunWith.class)) {
                annotationArr[i] = annotation;
                i++;
            }
        }
        return annotationArr;
    }

    private List<FrameworkField> getAnnotatedFieldsByParameter() {
        return getTestClass().getAnnotatedFields(Parameterized.Parameter.class);
    }

    private InjectionType getInjectionType() {
        if (fieldsAreAnnotated()) {
            return InjectionType.FIELD;
        }
        return InjectionType.CONSTRUCTOR;
    }

    private boolean fieldsAreAnnotated() {
        return !getAnnotatedFieldsByParameter().isEmpty();
    }
}
