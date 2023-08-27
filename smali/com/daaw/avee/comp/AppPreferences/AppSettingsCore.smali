.class public Lcom/daaw/avee/comp/AppPreferences/AppSettingsCore;
.super Ljava/lang/Object;
.source "AppSettingsCore.java"


# static fields
.field static final scenesFolderName:Ljava/lang/String; = "scenes"

.field static final settingsFolderName:Ljava/lang/String; = "settings"

.field static final stringbigFileName:Ljava/lang/String; = "stringpack"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static CreateOrGetScenesFolder(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 30
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppSettingsCore;->GetLocalStorageDir()Ljava/io/File;

    move-result-object v0

    .line 33
    new-instance v1, Ljava/io/File;

    const-string v2, "scenes"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 34
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 36
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 37
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_1
    return-object v0
.end method

.method static GetLocalStorageDir()Ljava/io/File;
    .locals 1

    .line 21
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    .line 22
    invoke-static {v0}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    .line 24
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method static GetSettingsFolder()Ljava/io/File;
    .locals 3

    .line 53
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppSettingsCore;->GetLocalStorageDir()Ljava/io/File;

    move-result-object v0

    .line 56
    new-instance v1, Ljava/io/File;

    const-string v2, "settings"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 57
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_0
    return-object v1
.end method
