package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;
/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_FilesPayload_File extends CrashlyticsReport.FilesPayload.File {
    private final byte[] contents;
    private final String filename;

    private AutoValue_CrashlyticsReport_FilesPayload_File(String str, byte[] bArr) {
        this.filename = str;
        this.contents = bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public String getFilename() {
        return this.filename;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public byte[] getContents() {
        return this.contents;
    }

    public String toString() {
        return "File{filename=" + this.filename + ", contents=" + Arrays.toString(this.contents) + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.FilesPayload.File) {
            CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
            if (this.filename.equals(file.getFilename())) {
                if (Arrays.equals(this.contents, file instanceof AutoValue_CrashlyticsReport_FilesPayload_File ? ((AutoValue_CrashlyticsReport_FilesPayload_File) file).contents : file.getContents())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.filename.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.contents);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Builder extends CrashlyticsReport.FilesPayload.File.Builder {
        private byte[] contents;
        private String filename;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File.Builder setFilename(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.filename = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File.Builder setContents(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.contents = bArr;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File build() {
            String str = "";
            if (this.filename == null) {
                str = " filename";
            }
            if (this.contents == null) {
                str = str + " contents";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_CrashlyticsReport_FilesPayload_File(this.filename, this.contents);
        }
    }
}
