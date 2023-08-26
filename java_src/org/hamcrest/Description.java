package org.hamcrest;
/* loaded from: classes2.dex */
public interface Description {
    public static final Description NONE = new NullDescription();

    /* loaded from: classes2.dex */
    public static final class NullDescription implements Description {
        @Override // org.hamcrest.Description
        public Description appendDescriptionOf(SelfDescribing selfDescribing) {
            return this;
        }

        @Override // org.hamcrest.Description
        public Description appendList(String str, String str2, String str3, Iterable<? extends SelfDescribing> iterable) {
            return this;
        }

        @Override // org.hamcrest.Description
        public Description appendText(String str) {
            return this;
        }

        @Override // org.hamcrest.Description
        public Description appendValue(Object obj) {
            return this;
        }

        @Override // org.hamcrest.Description
        public <T> Description appendValueList(String str, String str2, String str3, Iterable<T> iterable) {
            return this;
        }

        @Override // org.hamcrest.Description
        public <T> Description appendValueList(String str, String str2, String str3, T... tArr) {
            return this;
        }

        public String toString() {
            return "";
        }
    }

    Description appendDescriptionOf(SelfDescribing selfDescribing);

    Description appendList(String str, String str2, String str3, Iterable<? extends SelfDescribing> iterable);

    Description appendText(String str);

    Description appendValue(Object obj);

    <T> Description appendValueList(String str, String str2, String str3, Iterable<T> iterable);

    <T> Description appendValueList(String str, String str2, String str3, T... tArr);
}
