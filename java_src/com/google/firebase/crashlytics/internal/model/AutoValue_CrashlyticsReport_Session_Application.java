package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Application extends CrashlyticsReport.Session.Application {
    private final String displayVersion;
    private final String identifier;
    private final String installationUuid;
    private final CrashlyticsReport.Session.Application.Organization organization;
    private final String version;

    private AutoValue_CrashlyticsReport_Session_Application(String str, String str2, String str3, CrashlyticsReport.Session.Application.Organization organization, String str4) {
        this.identifier = str;
        this.version = str2;
        this.displayVersion = str3;
        this.organization = organization;
        this.installationUuid = str4;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public String getVersion() {
        return this.version;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public String getDisplayVersion() {
        return this.displayVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public CrashlyticsReport.Session.Application.Organization getOrganization() {
        return this.organization;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public String getInstallationUuid() {
        return this.installationUuid;
    }

    public String toString() {
        return "Application{identifier=" + this.identifier + ", version=" + this.version + ", displayVersion=" + this.displayVersion + ", organization=" + this.organization + ", installationUuid=" + this.installationUuid + "}";
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Application.Organization organization;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application) {
            CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
            if (this.identifier.equals(application.getIdentifier()) && this.version.equals(application.getVersion()) && ((str = this.displayVersion) != null ? str.equals(application.getDisplayVersion()) : application.getDisplayVersion() == null) && ((organization = this.organization) != null ? organization.equals(application.getOrganization()) : application.getOrganization() == null)) {
                String str2 = this.installationUuid;
                if (str2 == null) {
                    if (application.getInstallationUuid() == null) {
                        return true;
                    }
                } else if (str2.equals(application.getInstallationUuid())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.identifier.hashCode() ^ 1000003) * 1000003) ^ this.version.hashCode()) * 1000003;
        String str = this.displayVersion;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.Session.Application.Organization organization = this.organization;
        int hashCode3 = (hashCode2 ^ (organization == null ? 0 : organization.hashCode())) * 1000003;
        String str2 = this.installationUuid;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    protected CrashlyticsReport.Session.Application.Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Builder extends CrashlyticsReport.Session.Application.Builder {
        private String displayVersion;
        private String identifier;
        private String installationUuid;
        private CrashlyticsReport.Session.Application.Organization organization;
        private String version;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(CrashlyticsReport.Session.Application application) {
            this.identifier = application.getIdentifier();
            this.version = application.getVersion();
            this.displayVersion = application.getDisplayVersion();
            this.organization = application.getOrganization();
            this.installationUuid = application.getInstallationUuid();
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.identifier = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.version = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setDisplayVersion(String str) {
            this.displayVersion = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setOrganization(CrashlyticsReport.Session.Application.Organization organization) {
            this.organization = organization;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setInstallationUuid(String str) {
            this.installationUuid = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application build() {
            String str = "";
            if (this.identifier == null) {
                str = " identifier";
            }
            if (this.version == null) {
                str = str + " version";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_CrashlyticsReport_Session_Application(this.identifier, this.version, this.displayVersion, this.organization, this.installationUuid);
        }
    }
}
