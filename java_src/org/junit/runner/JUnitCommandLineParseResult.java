package org.junit.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.internal.Classes;
import org.junit.runner.FilterFactory;
import org.junit.runners.model.InitializationError;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class JUnitCommandLineParseResult {
    private final List<String> filterSpecs = new ArrayList();
    private final List<Class<?>> classes = new ArrayList();
    private final List<Throwable> parserErrors = new ArrayList();

    JUnitCommandLineParseResult() {
    }

    public List<String> getFilterSpecs() {
        return Collections.unmodifiableList(this.filterSpecs);
    }

    public List<Class<?>> getClasses() {
        return Collections.unmodifiableList(this.classes);
    }

    public static JUnitCommandLineParseResult parse(String[] strArr) {
        JUnitCommandLineParseResult jUnitCommandLineParseResult = new JUnitCommandLineParseResult();
        jUnitCommandLineParseResult.parseArgs(strArr);
        return jUnitCommandLineParseResult;
    }

    private void parseArgs(String[] strArr) {
        parseParameters(parseOptions(strArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
        return new java.lang.String[0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String[] parseOptions(String... strArr) {
        String substring;
        int i = 0;
        while (true) {
            if (i == strArr.length) {
                break;
            }
            String str = strArr[i];
            if (str.equals("--")) {
                return copyArray(strArr, i + 1, strArr.length);
            }
            if (str.startsWith("--")) {
                if (str.startsWith("--filter=") || str.equals("--filter")) {
                    if (str.equals("--filter")) {
                        i++;
                        if (i < strArr.length) {
                            substring = strArr[i];
                        } else {
                            List<Throwable> list = this.parserErrors;
                            list.add(new CommandLineParserError(str + " value not specified"));
                            break;
                        }
                    } else {
                        substring = str.substring(str.indexOf(61) + 1);
                    }
                    this.filterSpecs.add(substring);
                } else {
                    List<Throwable> list2 = this.parserErrors;
                    list2.add(new CommandLineParserError("JUnit knows nothing about the " + str + " option"));
                }
                i++;
            } else {
                return copyArray(strArr, i, strArr.length);
            }
        }
    }

    private String[] copyArray(String[] strArr, int i, int i2) {
        String[] strArr2 = new String[i2 - i];
        for (int i3 = i; i3 != i2; i3++) {
            strArr2[i3 - i] = strArr[i3];
        }
        return strArr2;
    }

    void parseParameters(String[] strArr) {
        for (String str : strArr) {
            try {
                this.classes.add(Classes.getClass(str));
            } catch (ClassNotFoundException e) {
                this.parserErrors.add(new IllegalArgumentException("Could not find class [" + str + "]", e));
            }
        }
    }

    private Request errorReport(Throwable th) {
        return Request.errorReport(JUnitCommandLineParseResult.class, th);
    }

    public Request createRequest(Computer computer) {
        if (this.parserErrors.isEmpty()) {
            List<Class<?>> list = this.classes;
            return applyFilterSpecs(Request.classes(computer, (Class[]) list.toArray(new Class[list.size()])));
        }
        return errorReport(new InitializationError(this.parserErrors));
    }

    private Request applyFilterSpecs(Request request) {
        try {
            for (String str : this.filterSpecs) {
                request = request.filterWith(FilterFactories.createFilterFromFilterSpec(request, str));
            }
            return request;
        } catch (FilterFactory.FilterNotCreatedException e) {
            return errorReport(e);
        }
    }

    /* loaded from: classes2.dex */
    public static class CommandLineParserError extends Exception {
        private static final long serialVersionUID = 1;

        public CommandLineParserError(String str) {
            super(str);
        }
    }
}
