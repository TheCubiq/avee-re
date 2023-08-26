package org.junit.experimental.categories;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.runner.Description;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;
/* loaded from: classes2.dex */
public class Categories extends Suite {

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface ExcludeCategory {
        boolean matchAny() default true;

        Class<?>[] value() default {};
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface IncludeCategory {
        boolean matchAny() default true;

        Class<?>[] value() default {};
    }

    /* loaded from: classes2.dex */
    public static class CategoryFilter extends Filter {
        private final Set<Class<?>> excluded;
        private final boolean excludedAny;
        private final Set<Class<?>> included;
        private final boolean includedAny;

        public static CategoryFilter include(boolean z, Class<?>... clsArr) {
            return new CategoryFilter(z, clsArr, true, (Class<?>[]) null);
        }

        public static CategoryFilter include(Class<?> cls) {
            return include(true, cls);
        }

        public static CategoryFilter include(Class<?>... clsArr) {
            return include(true, clsArr);
        }

        public static CategoryFilter exclude(boolean z, Class<?>... clsArr) {
            return new CategoryFilter(true, (Class<?>[]) null, z, clsArr);
        }

        public static CategoryFilter exclude(Class<?> cls) {
            return exclude(true, cls);
        }

        public static CategoryFilter exclude(Class<?>... clsArr) {
            return exclude(true, clsArr);
        }

        public static CategoryFilter categoryFilter(boolean z, Set<Class<?>> set, boolean z2, Set<Class<?>> set2) {
            return new CategoryFilter(z, set, z2, set2);
        }

        @Deprecated
        public CategoryFilter(Class<?> cls, Class<?> cls2) {
            this.includedAny = true;
            this.excludedAny = true;
            this.included = Categories.nullableClassToSet(cls);
            this.excluded = Categories.nullableClassToSet(cls2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public CategoryFilter(boolean z, Set<Class<?>> set, boolean z2, Set<Class<?>> set2) {
            this.includedAny = z;
            this.excludedAny = z2;
            this.included = copyAndRefine(set);
            this.excluded = copyAndRefine(set2);
        }

        private CategoryFilter(boolean z, Class<?>[] clsArr, boolean z2, Class<?>[] clsArr2) {
            this.includedAny = z;
            this.excludedAny = z2;
            this.included = Categories.createSet(clsArr);
            this.excluded = Categories.createSet(clsArr2);
        }

        @Override // org.junit.runner.manipulation.Filter
        public String describe() {
            return toString();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("categories ");
            sb.append(this.included.isEmpty() ? "[all]" : this.included);
            if (!this.excluded.isEmpty()) {
                sb.append(" - ");
                sb.append(this.excluded);
            }
            return sb.toString();
        }

        @Override // org.junit.runner.manipulation.Filter
        public boolean shouldRun(Description description) {
            if (hasCorrectCategoryAnnotation(description)) {
                return true;
            }
            Iterator<Description> it = description.getChildren().iterator();
            while (it.hasNext()) {
                if (shouldRun(it.next())) {
                    return true;
                }
            }
            return false;
        }

        private boolean hasCorrectCategoryAnnotation(Description description) {
            Set<Class<?>> categories = categories(description);
            if (categories.isEmpty()) {
                return this.included.isEmpty();
            }
            if (!this.excluded.isEmpty()) {
                if (this.excludedAny) {
                    if (matchesAnyParentCategories(categories, this.excluded)) {
                        return false;
                    }
                } else if (matchesAllParentCategories(categories, this.excluded)) {
                    return false;
                }
            }
            if (this.included.isEmpty()) {
                return true;
            }
            if (this.includedAny) {
                return matchesAnyParentCategories(categories, this.included);
            }
            return matchesAllParentCategories(categories, this.included);
        }

        private boolean matchesAnyParentCategories(Set<Class<?>> set, Set<Class<?>> set2) {
            for (Class<?> cls : set2) {
                if (Categories.hasAssignableTo(set, cls)) {
                    return true;
                }
            }
            return false;
        }

        private boolean matchesAllParentCategories(Set<Class<?>> set, Set<Class<?>> set2) {
            for (Class<?> cls : set2) {
                if (!Categories.hasAssignableTo(set, cls)) {
                    return false;
                }
            }
            return true;
        }

        private static Set<Class<?>> categories(Description description) {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, directCategories(description));
            Collections.addAll(hashSet, directCategories(parentDescription(description)));
            return hashSet;
        }

        private static Description parentDescription(Description description) {
            Class<?> testClass = description.getTestClass();
            if (testClass == null) {
                return null;
            }
            return Description.createSuiteDescription(testClass);
        }

        private static Class<?>[] directCategories(Description description) {
            if (description == null) {
                return new Class[0];
            }
            Category category = (Category) description.getAnnotation(Category.class);
            return category == null ? new Class[0] : category.value();
        }

        private static Set<Class<?>> copyAndRefine(Set<Class<?>> set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (set != null) {
                linkedHashSet.addAll(set);
            }
            linkedHashSet.remove(null);
            return linkedHashSet;
        }
    }

    public Categories(Class<?> cls, RunnerBuilder runnerBuilder) throws InitializationError {
        super(cls, runnerBuilder);
        try {
            filter(CategoryFilter.categoryFilter(isAnyIncluded(cls), getIncludedCategory(cls), isAnyExcluded(cls), getExcludedCategory(cls)));
        } catch (NoTestsRemainException e) {
            throw new InitializationError(e);
        }
    }

    private static Set<Class<?>> getIncludedCategory(Class<?> cls) {
        IncludeCategory includeCategory = (IncludeCategory) cls.getAnnotation(IncludeCategory.class);
        return createSet(includeCategory == null ? null : includeCategory.value());
    }

    private static boolean isAnyIncluded(Class<?> cls) {
        IncludeCategory includeCategory = (IncludeCategory) cls.getAnnotation(IncludeCategory.class);
        return includeCategory == null || includeCategory.matchAny();
    }

    private static Set<Class<?>> getExcludedCategory(Class<?> cls) {
        ExcludeCategory excludeCategory = (ExcludeCategory) cls.getAnnotation(ExcludeCategory.class);
        return createSet(excludeCategory == null ? null : excludeCategory.value());
    }

    private static boolean isAnyExcluded(Class<?> cls) {
        ExcludeCategory excludeCategory = (ExcludeCategory) cls.getAnnotation(ExcludeCategory.class);
        return excludeCategory == null || excludeCategory.matchAny();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasAssignableTo(Set<Class<?>> set, Class<?> cls) {
        for (Class<?> cls2 : set) {
            if (cls.isAssignableFrom(cls2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Set<Class<?>> createSet(Class<?>[] clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            return Collections.emptySet();
        }
        for (Class<?> cls : clsArr) {
            if (cls == null) {
                throw new NullPointerException("has null category");
            }
        }
        return clsArr.length == 1 ? Collections.singleton(clsArr[0]) : new LinkedHashSet(Arrays.asList(clsArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Set<Class<?>> nullableClassToSet(Class<?> cls) {
        return cls == null ? Collections.emptySet() : Collections.singleton(cls);
    }
}
