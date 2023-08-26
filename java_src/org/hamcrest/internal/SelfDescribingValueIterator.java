package org.hamcrest.internal;

import java.util.Iterator;
import org.hamcrest.SelfDescribing;
/* loaded from: classes2.dex */
public class SelfDescribingValueIterator<T> implements Iterator<SelfDescribing> {
    private Iterator<T> values;

    public SelfDescribingValueIterator(Iterator<T> it) {
        this.values = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.values.hasNext();
    }

    @Override // java.util.Iterator
    public SelfDescribing next() {
        return new SelfDescribingValue(this.values.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.values.remove();
    }
}
