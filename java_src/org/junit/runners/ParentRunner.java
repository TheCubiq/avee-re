package org.junit.runners;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.FixMethodOrder;
import org.junit.internal.AssumptionViolatedException;
import org.junit.internal.Checks;
import org.junit.internal.runners.model.EachTestNotifier;
import org.junit.internal.runners.rules.RuleMemberValidator;
import org.junit.internal.runners.statements.RunAfters;
import org.junit.internal.runners.statements.RunBefores;
import org.junit.rules.RunRules;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.InvalidOrderingException;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.manipulation.Orderable;
import org.junit.runner.manipulation.Orderer;
import org.junit.runner.manipulation.Sorter;
import org.junit.runner.notification.RunNotifier;
import org.junit.runner.notification.StoppedByUserException;
import org.junit.runners.RuleContainer;
import org.junit.runners.model.FrameworkMember;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.InvalidTestClassError;
import org.junit.runners.model.MemberValueConsumer;
import org.junit.runners.model.RunnerScheduler;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;
import org.junit.validator.AnnotationsValidator;
import org.junit.validator.TestClassValidator;
/* loaded from: classes.dex */
public abstract class ParentRunner<T> extends Runner implements Filterable, Orderable {
    private static final List<TestClassValidator> VALIDATORS = Collections.singletonList(new AnnotationsValidator());
    private final Lock childrenLock = new ReentrantLock();
    private volatile List<T> filteredChildren = null;
    private volatile RunnerScheduler scheduler = new RunnerScheduler() { // from class: org.junit.runners.ParentRunner.1
        @Override // org.junit.runners.model.RunnerScheduler
        public void finished() {
        }

        @Override // org.junit.runners.model.RunnerScheduler
        public void schedule(Runnable runnable) {
            runnable.run();
        }
    };
    private final TestClass testClass;

    protected abstract Description describeChild(T t);

    protected abstract List<T> getChildren();

    protected boolean isIgnored(T t) {
        return false;
    }

    protected abstract void runChild(T t, RunNotifier runNotifier);

    /* JADX INFO: Access modifiers changed from: protected */
    public ParentRunner(Class<?> cls) throws InitializationError {
        this.testClass = createTestClass(cls);
        validate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ParentRunner(TestClass testClass) throws InitializationError {
        this.testClass = (TestClass) Checks.notNull(testClass);
        validate();
    }

    @Deprecated
    protected TestClass createTestClass(Class<?> cls) {
        return new TestClass(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void collectInitializationErrors(List<Throwable> list) {
        validatePublicVoidNoArgMethods(BeforeClass.class, true, list);
        validatePublicVoidNoArgMethods(AfterClass.class, true, list);
        validateClassRules(list);
        applyValidators(list);
    }

    private void applyValidators(List<Throwable> list) {
        if (getTestClass().getJavaClass() != null) {
            for (TestClassValidator testClassValidator : VALIDATORS) {
                list.addAll(testClassValidator.validateTestClass(getTestClass()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void validatePublicVoidNoArgMethods(Class<? extends Annotation> cls, boolean z, List<Throwable> list) {
        for (FrameworkMethod frameworkMethod : getTestClass().getAnnotatedMethods(cls)) {
            frameworkMethod.validatePublicVoidNoArg(z, list);
        }
    }

    private void validateClassRules(List<Throwable> list) {
        RuleMemberValidator.CLASS_RULE_VALIDATOR.validate(getTestClass(), list);
        RuleMemberValidator.CLASS_RULE_METHOD_VALIDATOR.validate(getTestClass(), list);
    }

    protected Statement classBlock(RunNotifier runNotifier) {
        Statement childrenInvoker = childrenInvoker(runNotifier);
        return !areAllChildrenIgnored() ? withInterruptIsolation(withClassRules(withAfterClasses(withBeforeClasses(childrenInvoker)))) : childrenInvoker;
    }

    private boolean areAllChildrenIgnored() {
        for (T t : getFilteredChildren()) {
            if (!isIgnored(t)) {
                return false;
            }
        }
        return true;
    }

    protected Statement withBeforeClasses(Statement statement) {
        List<FrameworkMethod> annotatedMethods = this.testClass.getAnnotatedMethods(BeforeClass.class);
        return annotatedMethods.isEmpty() ? statement : new RunBefores(statement, annotatedMethods, null);
    }

    protected Statement withAfterClasses(Statement statement) {
        List<FrameworkMethod> annotatedMethods = this.testClass.getAnnotatedMethods(AfterClass.class);
        return annotatedMethods.isEmpty() ? statement : new RunAfters(statement, annotatedMethods, null);
    }

    private Statement withClassRules(Statement statement) {
        List<TestRule> classRules = classRules();
        return classRules.isEmpty() ? statement : new RunRules(statement, classRules, getDescription());
    }

    protected List<TestRule> classRules() {
        ClassRuleCollector classRuleCollector = new ClassRuleCollector();
        this.testClass.collectAnnotatedMethodValues(null, ClassRule.class, TestRule.class, classRuleCollector);
        this.testClass.collectAnnotatedFieldValues(null, ClassRule.class, TestRule.class, classRuleCollector);
        return classRuleCollector.getOrderedRules();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Statement childrenInvoker(final RunNotifier runNotifier) {
        return new Statement() { // from class: org.junit.runners.ParentRunner.2
            @Override // org.junit.runners.model.Statement
            public void evaluate() {
                ParentRunner.this.runChildren(runNotifier);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Statement withInterruptIsolation(final Statement statement) {
        return new Statement() { // from class: org.junit.runners.ParentRunner.3
            @Override // org.junit.runners.model.Statement
            public void evaluate() throws Throwable {
                try {
                    statement.evaluate();
                } finally {
                    Thread.interrupted();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runChildren(final RunNotifier runNotifier) {
        RunnerScheduler runnerScheduler = this.scheduler;
        try {
            for (final T t : getFilteredChildren()) {
                runnerScheduler.schedule(new Runnable() { // from class: org.junit.runners.ParentRunner.4
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public void run() {
                        ParentRunner.this.runChild(t, runNotifier);
                    }
                });
            }
        } finally {
            runnerScheduler.finished();
        }
    }

    protected String getName() {
        return this.testClass.getName();
    }

    public final TestClass getTestClass() {
        return this.testClass;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void runLeaf(Statement statement, Description description, RunNotifier runNotifier) {
        EachTestNotifier eachTestNotifier = new EachTestNotifier(runNotifier, description);
        eachTestNotifier.fireTestStarted();
        try {
            try {
                statement.evaluate();
            } finally {
                eachTestNotifier.fireTestFinished();
            }
        } catch (AssumptionViolatedException e) {
            eachTestNotifier.addFailedAssumption(e);
        } catch (Throwable th) {
            eachTestNotifier.addFailure(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Annotation[] getRunnerAnnotations() {
        return this.testClass.getAnnotations();
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        Description createSuiteDescription;
        Class<?> javaClass = getTestClass().getJavaClass();
        if (javaClass == null || !javaClass.getName().equals(getName())) {
            createSuiteDescription = Description.createSuiteDescription(getName(), getRunnerAnnotations());
        } else {
            createSuiteDescription = Description.createSuiteDescription(javaClass, getRunnerAnnotations());
        }
        for (T t : getFilteredChildren()) {
            createSuiteDescription.addChild(describeChild(t));
        }
        return createSuiteDescription;
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        EachTestNotifier eachTestNotifier = new EachTestNotifier(runNotifier, getDescription());
        eachTestNotifier.fireTestSuiteStarted();
        try {
            try {
                try {
                    classBlock(runNotifier).evaluate();
                } catch (AssumptionViolatedException e) {
                    eachTestNotifier.addFailedAssumption(e);
                }
            } catch (StoppedByUserException e2) {
                throw e2;
            } catch (Throwable th) {
                eachTestNotifier.addFailure(th);
            }
            eachTestNotifier.fireTestSuiteFinished();
        } catch (Throwable th2) {
            eachTestNotifier.fireTestSuiteFinished();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        this.childrenLock.lock();
        try {
            ArrayList arrayList = new ArrayList(getFilteredChildren());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (shouldRun(filter, next)) {
                    try {
                        filter.apply(next);
                    } catch (NoTestsRemainException unused) {
                        it.remove();
                    }
                } else {
                    it.remove();
                }
            }
            this.filteredChildren = Collections.unmodifiableList(arrayList);
            if (this.filteredChildren.isEmpty()) {
                throw new NoTestsRemainException();
            }
        } finally {
            this.childrenLock.unlock();
        }
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        if (shouldNotReorder()) {
            return;
        }
        this.childrenLock.lock();
        try {
            for (T t : getFilteredChildren()) {
                sorter.apply(t);
            }
            ArrayList arrayList = new ArrayList(getFilteredChildren());
            Collections.sort(arrayList, comparator(sorter));
            this.filteredChildren = Collections.unmodifiableList(arrayList);
        } finally {
            this.childrenLock.unlock();
        }
    }

    @Override // org.junit.runner.manipulation.Orderable
    public void order(Orderer orderer) throws InvalidOrderingException {
        if (shouldNotReorder()) {
            return;
        }
        this.childrenLock.lock();
        try {
            List<T> filteredChildren = getFilteredChildren();
            LinkedHashMap linkedHashMap = new LinkedHashMap(filteredChildren.size());
            for (T t : filteredChildren) {
                Description describeChild = describeChild(t);
                List list = (List) linkedHashMap.get(describeChild);
                if (list == null) {
                    list = new ArrayList(1);
                    linkedHashMap.put(describeChild, list);
                }
                list.add(t);
                orderer.apply(t);
            }
            List<Description> order = orderer.order(linkedHashMap.keySet());
            ArrayList arrayList = new ArrayList(filteredChildren.size());
            for (Description description : order) {
                arrayList.addAll((Collection) linkedHashMap.get(description));
            }
            this.filteredChildren = Collections.unmodifiableList(arrayList);
        } finally {
            this.childrenLock.unlock();
        }
    }

    private boolean shouldNotReorder() {
        return getDescription().getAnnotation(FixMethodOrder.class) != null;
    }

    private void validate() throws InitializationError {
        ArrayList arrayList = new ArrayList();
        collectInitializationErrors(arrayList);
        if (!arrayList.isEmpty()) {
            throw new InvalidTestClassError(this.testClass.getJavaClass(), arrayList);
        }
    }

    private List<T> getFilteredChildren() {
        if (this.filteredChildren == null) {
            this.childrenLock.lock();
            try {
                if (this.filteredChildren == null) {
                    this.filteredChildren = Collections.unmodifiableList(new ArrayList(getChildren()));
                }
            } finally {
                this.childrenLock.unlock();
            }
        }
        return this.filteredChildren;
    }

    private boolean shouldRun(Filter filter, T t) {
        return filter.shouldRun(describeChild(t));
    }

    private Comparator<? super T> comparator(final Sorter sorter) {
        return (Comparator<T>) new Comparator<T>() { // from class: org.junit.runners.ParentRunner.5
            @Override // java.util.Comparator
            public int compare(T t, T t2) {
                return sorter.compare(ParentRunner.this.describeChild(t), ParentRunner.this.describeChild(t2));
            }
        };
    }

    public void setScheduler(RunnerScheduler runnerScheduler) {
        this.scheduler = runnerScheduler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class ClassRuleCollector implements MemberValueConsumer<TestRule> {
        final List<RuleContainer.RuleEntry> entries;

        private ClassRuleCollector() {
            this.entries = new ArrayList();
        }

        @Override // org.junit.runners.model.MemberValueConsumer
        public /* bridge */ /* synthetic */ void accept(FrameworkMember frameworkMember, TestRule testRule) {
            accept2((FrameworkMember<?>) frameworkMember, testRule);
        }

        /* renamed from: accept  reason: avoid collision after fix types in other method */
        public void accept2(FrameworkMember<?> frameworkMember, TestRule testRule) {
            ClassRule classRule = (ClassRule) frameworkMember.getAnnotation(ClassRule.class);
            this.entries.add(new RuleContainer.RuleEntry(testRule, 1, classRule != null ? Integer.valueOf(classRule.order()) : null));
        }

        public List<TestRule> getOrderedRules() {
            Collections.sort(this.entries, RuleContainer.ENTRY_COMPARATOR);
            ArrayList arrayList = new ArrayList(this.entries.size());
            for (RuleContainer.RuleEntry ruleEntry : this.entries) {
                arrayList.add((TestRule) ruleEntry.rule);
            }
            return arrayList;
        }
    }
}
