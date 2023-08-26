package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread extends CrashlyticsReport.Session.Event.Application.Execution.Thread {
    private final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> frames;
    private final int importance;
    private final String name;

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(String str, int i, ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> immutableList) {
        this.name = str;
        this.importance = i;
        this.frames = immutableList;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public String getName() {
        return this.name;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public int getImportance() {
        return this.importance;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames() {
        return this.frames;
    }

    public String toString() {
        return "Thread{name=" + this.name + ", importance=" + this.importance + ", frames=" + this.frames + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
            return this.name.equals(thread.getName()) && this.importance == thread.getImportance() && this.frames.equals(thread.getFrames());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.importance) * 1000003) ^ this.frames.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {
        private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> frames;
        private Integer importance;
        private String name;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setName(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.name = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setImportance(int i) {
            this.importance = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setFrames(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> immutableList) {
            if (immutableList == null) {
                throw new NullPointerException("Null frames");
            }
            this.frames = immutableList;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread build() {
            String str = "";
            if (this.name == null) {
                str = " name";
            }
            if (this.importance == null) {
                str = str + " importance";
            }
            if (this.frames == null) {
                str = str + " frames";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(this.name, this.importance.intValue(), this.frames);
        }
    }
}
