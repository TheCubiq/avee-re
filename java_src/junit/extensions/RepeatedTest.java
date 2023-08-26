package junit.extensions;

import junit.framework.Test;
import junit.framework.TestResult;
/* loaded from: classes2.dex */
public class RepeatedTest extends TestDecorator {
    private int fTimesRepeat;

    public RepeatedTest(Test test, int i) {
        super(test);
        if (i < 0) {
            throw new IllegalArgumentException("Repetition count must be >= 0");
        }
        this.fTimesRepeat = i;
    }

    @Override // junit.extensions.TestDecorator, junit.framework.Test
    public int countTestCases() {
        return super.countTestCases() * this.fTimesRepeat;
    }

    @Override // junit.extensions.TestDecorator, junit.framework.Test
    public void run(TestResult testResult) {
        for (int i = 0; i < this.fTimesRepeat && !testResult.shouldStop(); i++) {
            super.run(testResult);
        }
    }

    @Override // junit.extensions.TestDecorator
    public String toString() {
        return super.toString() + "(repeated)";
    }
}
