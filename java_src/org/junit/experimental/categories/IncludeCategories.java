package org.junit.experimental.categories;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.experimental.categories.Categories;
import org.junit.runner.FilterFactory;
import org.junit.runner.FilterFactoryParams;
import org.junit.runner.manipulation.Filter;
/* loaded from: classes2.dex */
public final class IncludeCategories extends CategoryFilterFactory {
    @Override // org.junit.experimental.categories.CategoryFilterFactory, org.junit.runner.FilterFactory
    public /* bridge */ /* synthetic */ Filter createFilter(FilterFactoryParams filterFactoryParams) throws FilterFactory.FilterNotCreatedException {
        return super.createFilter(filterFactoryParams);
    }

    @Override // org.junit.experimental.categories.CategoryFilterFactory
    protected Filter createFilter(List<Class<?>> list) {
        return new IncludesAny(list);
    }

    /* loaded from: classes2.dex */
    private static class IncludesAny extends Categories.CategoryFilter {
        public IncludesAny(List<Class<?>> list) {
            this(new HashSet(list));
        }

        public IncludesAny(Set<Class<?>> set) {
            super(true, set, true, (Set<Class<?>>) null);
        }

        @Override // org.junit.experimental.categories.Categories.CategoryFilter, org.junit.runner.manipulation.Filter
        public String describe() {
            return "includes " + super.describe();
        }
    }
}
