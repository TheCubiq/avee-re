package org.junit.internal;

import org.junit.Assert;
/* loaded from: classes2.dex */
public class InexactComparisonCriteria extends ComparisonCriteria {
    public Object fDelta;

    public InexactComparisonCriteria(double d) {
        this.fDelta = Double.valueOf(d);
    }

    public InexactComparisonCriteria(float f) {
        this.fDelta = Float.valueOf(f);
    }

    @Override // org.junit.internal.ComparisonCriteria
    protected void assertElementsEqual(Object obj, Object obj2) {
        if (obj instanceof Double) {
            Assert.assertEquals(((Double) obj).doubleValue(), ((Double) obj2).doubleValue(), ((Double) this.fDelta).doubleValue());
        } else {
            Assert.assertEquals(((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) this.fDelta).floatValue());
        }
    }
}
