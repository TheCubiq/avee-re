package org.junit.rules;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;
/* loaded from: classes2.dex */
public interface TestRule {
    Statement apply(Statement statement, Description description);
}
