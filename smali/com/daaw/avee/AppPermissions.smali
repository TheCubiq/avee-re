.class public Lcom/daaw/avee/AppPermissions;
.super Ljava/lang/Object;
.source "AppPermissions.java"


# static fields
.field public static REQUEST_RECORD_AUDIO:I = 0x2

.field public static REQUEST_STORAGE:I = 0x1

.field public static REQUEST_STORAGE_AND_AUDIO:I = 0x4

.field public static REQUEST_WRITE_SETTINGS:I = 0x3


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isPermissionsGranted(Landroid/content/Context;Landroid/app/Activity;)Z
    .locals 6

    .line 23
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-lt v0, v2, :cond_6

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 24
    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v4, "android.permission.RECORD_AUDIO"

    .line 25
    invoke-virtual {p0, v4}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    const/4 v5, 0x0

    if-nez v2, :cond_2

    if-nez p0, :cond_2

    const/4 p0, 0x2

    new-array v5, p0, [Ljava/lang/String;

    aput-object v0, v5, v3

    aput-object v4, v5, v1

    .line 33
    sget p0, Lcom/daaw/avee/AppPermissions;->REQUEST_STORAGE_AND_AUDIO:I

    goto :goto_2

    :cond_2
    if-nez v2, :cond_3

    new-array v5, v1, [Ljava/lang/String;

    aput-object v0, v5, v3

    .line 37
    sget p0, Lcom/daaw/avee/AppPermissions;->REQUEST_STORAGE:I

    goto :goto_2

    :cond_3
    if-nez p0, :cond_4

    new-array v5, v1, [Ljava/lang/String;

    aput-object v4, v5, v3

    .line 41
    sget p0, Lcom/daaw/avee/AppPermissions;->REQUEST_RECORD_AUDIO:I

    goto :goto_2

    :cond_4
    const/4 p0, 0x0

    :goto_2
    if-eqz v5, :cond_6

    if-eqz p1, :cond_5

    .line 45
    invoke-static {p1, v5, p0}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    :cond_5
    return v3

    :cond_6
    return v1
.end method

.method public static isStoragePermissionGranted(Landroid/content/Context;Landroid/app/Activity;)Z
    .locals 3

    .line 58
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-lt v0, v2, :cond_2

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 59
    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    if-eqz p1, :cond_1

    new-array v1, v1, [Ljava/lang/String;

    aput-object v0, v1, p0

    .line 63
    sget v0, Lcom/daaw/avee/AppPermissions;->REQUEST_STORAGE:I

    invoke-static {p1, v1, v0}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    :cond_1
    return p0

    :cond_2
    return v1
.end method

.method public static is_RecordAudio_PermissionGranted(Landroid/content/Context;Landroid/app/Activity;)Z
    .locals 3

    .line 72
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-lt v0, v2, :cond_2

    const-string v0, "android.permission.RECORD_AUDIO"

    .line 73
    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    if-eqz p1, :cond_1

    new-array v1, v1, [Ljava/lang/String;

    aput-object v0, v1, p0

    .line 77
    sget v0, Lcom/daaw/avee/AppPermissions;->REQUEST_RECORD_AUDIO:I

    invoke-static {p1, v1, v0}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    :cond_1
    return p0

    :cond_2
    return v1
.end method

.method public static is_WRITE_SETTINGS_PermissionGranted(Landroid/content/Context;Landroid/app/Activity;)Z
    .locals 3

    .line 86
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-lt v0, v2, :cond_2

    const-string v0, "android.permission.WRITE_SETTINGS"

    .line 87
    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    if-eqz p1, :cond_1

    new-array v1, v1, [Ljava/lang/String;

    aput-object v0, v1, p0

    .line 91
    sget v0, Lcom/daaw/avee/AppPermissions;->REQUEST_WRITE_SETTINGS:I

    invoke-static {p1, v1, v0}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    :cond_1
    return p0

    :cond_2
    return v1
.end method
