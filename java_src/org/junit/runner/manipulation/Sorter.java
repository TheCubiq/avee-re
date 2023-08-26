package org.junit.runner.manipulation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.runner.Description;
/* loaded from: classes2.dex */
public class Sorter extends Ordering implements Comparator<Description> {
    public static final Sorter NULL = new Sorter(new Comparator<Description>() { // from class: org.junit.runner.manipulation.Sorter.1
        @Override // java.util.Comparator
        public int compare(Description description, Description description2) {
            return 0;
        }
    });
    private final Comparator<Description> comparator;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.junit.runner.manipulation.Ordering
    public boolean validateOrderingIsCorrect() {
        return false;
    }

    public Sorter(Comparator<Description> comparator) {
        this.comparator = comparator;
    }

    @Override // org.junit.runner.manipulation.Ordering
    public void apply(Object obj) {
        if (obj instanceof Sortable) {
            ((Sortable) obj).sort(this);
        }
    }

    @Override // java.util.Comparator
    public int compare(Description description, Description description2) {
        return this.comparator.compare(description, description2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.runner.manipulation.Ordering
    public final List<Description> orderItems(Collection<Description> collection) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, this);
        return arrayList;
    }
}
