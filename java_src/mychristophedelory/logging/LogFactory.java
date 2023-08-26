package mychristophedelory.logging;

import org.myapache.commons.logging.Log;
/* loaded from: classes2.dex */
public class LogFactory {
    public static Log getLog(Class<?> cls) {
        return new MyLog();
    }

    /* loaded from: classes2.dex */
    static class MyLog implements Log {
        @Override // org.myapache.commons.logging.Log
        public void debug(Object obj) {
        }

        @Override // org.myapache.commons.logging.Log
        public void debug(Object obj, Throwable th) {
        }

        @Override // org.myapache.commons.logging.Log
        public void error(Object obj) {
        }

        @Override // org.myapache.commons.logging.Log
        public void error(Object obj, Throwable th) {
        }

        @Override // org.myapache.commons.logging.Log
        public void fatal(Object obj) {
        }

        @Override // org.myapache.commons.logging.Log
        public void fatal(Object obj, Throwable th) {
        }

        @Override // org.myapache.commons.logging.Log
        public void info(Object obj) {
        }

        @Override // org.myapache.commons.logging.Log
        public void info(Object obj, Throwable th) {
        }

        @Override // org.myapache.commons.logging.Log
        public boolean isDebugEnabled() {
            return false;
        }

        @Override // org.myapache.commons.logging.Log
        public boolean isErrorEnabled() {
            return false;
        }

        @Override // org.myapache.commons.logging.Log
        public boolean isFatalEnabled() {
            return false;
        }

        @Override // org.myapache.commons.logging.Log
        public boolean isInfoEnabled() {
            return false;
        }

        @Override // org.myapache.commons.logging.Log
        public boolean isTraceEnabled() {
            return false;
        }

        @Override // org.myapache.commons.logging.Log
        public boolean isWarnEnabled() {
            return false;
        }

        @Override // org.myapache.commons.logging.Log
        public void trace(Object obj) {
        }

        @Override // org.myapache.commons.logging.Log
        public void trace(Object obj, Throwable th) {
        }

        @Override // org.myapache.commons.logging.Log
        public void warn(Object obj) {
        }

        @Override // org.myapache.commons.logging.Log
        public void warn(Object obj, Throwable th) {
        }

        MyLog() {
        }
    }
}
