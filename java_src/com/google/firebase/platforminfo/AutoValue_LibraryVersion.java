package com.google.firebase.platforminfo;

import javax.annotation.Nonnull;
/* loaded from: classes.dex */
final class AutoValue_LibraryVersion extends LibraryVersion {
    private final String libraryName;
    private final String version;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_LibraryVersion(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.libraryName = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.version = str2;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    @Nonnull
    public String getLibraryName() {
        return this.libraryName;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    @Nonnull
    public String getVersion() {
        return this.version;
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.libraryName + ", version=" + this.version + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LibraryVersion) {
            LibraryVersion libraryVersion = (LibraryVersion) obj;
            return this.libraryName.equals(libraryVersion.getLibraryName()) && this.version.equals(libraryVersion.getVersion());
        }
        return false;
    }

    public int hashCode() {
        return ((this.libraryName.hashCode() ^ 1000003) * 1000003) ^ this.version.hashCode();
    }
}
