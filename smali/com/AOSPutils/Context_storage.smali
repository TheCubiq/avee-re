.class public Lcom/AOSPutils/Context_storage;
.super Ljava/lang/Object;
.source "Context_storage.java"


# static fields
.field static internalPath:Ljava/lang/String;

.field private static physicalPaths:[Ljava/lang/String;

.field static sdCardPath:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x15

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "/storage/sdcard1"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "/storage/extsdcard"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "/storage/sdcard0/external_sdcard"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "/mnt/extsdcard"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "/mnt/sdcard/external_sd"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "/mnt/external_sd"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "/mnt/media_rw/sdcard1"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "/removable/microsd"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "/mnt/emmc"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "/storage/external_SD"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "/storage/ext_sd"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "/storage/removable/sdcard1"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "/data/sdext"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "/data/sdext2"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "/data/sdext3"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "/data/sdext4"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "/sdcard1"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "/sdcard2"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "/storage/usbdisk0"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "/storage/usbdisk1"

    aput-object v2, v0, v1

    const/16 v1, 0x14

    const-string v2, "/storage/usbdisk2"

    aput-object v2, v0, v1

    .line 214
    sput-object v0, Lcom/AOSPutils/Context_storage;->physicalPaths:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static addAllArray(Ljava/util/List;[Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 233
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    .line 234
    aget-object v1, p1, v0

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static getExtSdCardPathsForActivity(Landroid/content/Context;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "external"

    .line 192
    invoke-virtual {p0, v0}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p0, v2

    if-eqz v3, :cond_1

    .line 194
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    const-string v5, "/Android/data"

    invoke-virtual {v4, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    if-gez v4, :cond_0

    .line 196
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unexpected external file dir: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    invoke-static {v4, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 198
    :cond_0
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 200
    :try_start_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 204
    :catch_0
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 208
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    const-string p0, "/storage/sdcard1"

    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method

.method public static getInternalStoragePath()Ljava/lang/String;
    .locals 2

    .line 70
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-static {v0, v1}, Lcom/AOSPutils/Context_storage;->trimEnd(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getInternalStoragePathOnce()Ljava/lang/String;
    .locals 1

    .line 63
    sget-object v0, Lcom/AOSPutils/Context_storage;->internalPath:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 64
    invoke-static {}, Lcom/AOSPutils/Context_storage;->getInternalStoragePath()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/AOSPutils/Context_storage;->internalPath:Ljava/lang/String;

    .line 66
    :cond_0
    sget-object v0, Lcom/AOSPutils/Context_storage;->internalPath:Ljava/lang/String;

    return-object v0
.end method

.method public static getPathFolderName(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const-string p0, "<unnamed>"

    return-object p0

    :cond_0
    if-eqz p1, :cond_2

    .line 38
    invoke-static {}, Lcom/AOSPutils/Context_storage;->getInternalStoragePathOnce()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const p0, 0x7f100069

    .line 39
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 40
    :cond_1
    invoke-static {p1}, Lcom/AOSPutils/Context_storage;->getSDCardPathOnce(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const p0, 0x7f10006c

    .line 41
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-string p1, "/"

    .line 45
    invoke-virtual {p0, p1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    .line 48
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p0
.end method

.method private static getSDCardPath(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 96
    invoke-static {p0}, Lcom/AOSPutils/Context_storage;->getStorageDirectories(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    .line 100
    invoke-static {}, Lcom/AOSPutils/Context_storage;->getInternalStoragePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 102
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/16 v3, 0x2f

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 104
    invoke-static {v2, v3}, Lcom/AOSPutils/Context_storage;->trimEnd(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    .line 105
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 106
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 110
    :cond_1
    sget-object p0, Lcom/AOSPutils/Context_storage;->physicalPaths:[Ljava/lang/String;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    .line 113
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v2, ""

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 115
    invoke-interface {p0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    move-object v2, v4

    goto :goto_1

    .line 122
    :cond_3
    invoke-static {v2, v3}, Lcom/AOSPutils/Context_storage;->trimEnd(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_5

    .line 123
    new-instance p0, Ljava/io/File;

    const-string v0, "/storage/sdcard1"

    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 124
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 125
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 128
    :cond_4
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p0

    if-lez p0, :cond_5

    const/4 p0, 0x0

    .line 129
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Ljava/lang/String;

    .line 132
    :cond_5
    invoke-static {v2, v3}, Lcom/AOSPutils/Context_storage;->trimEnd(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getSDCardPathOnce(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 87
    sget-object v0, Lcom/AOSPutils/Context_storage;->sdCardPath:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 88
    invoke-static {p0}, Lcom/AOSPutils/Context_storage;->getSDCardPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/AOSPutils/Context_storage;->sdCardPath:Ljava/lang/String;

    .line 89
    :cond_0
    sget-object p0, Lcom/AOSPutils/Context_storage;->sdCardPath:Ljava/lang/String;

    return-object p0
.end method

.method static getStorageDirectories(Landroid/content/Context;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 146
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "EXTERNAL_STORAGE"

    .line 147
    invoke-static {v1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SECONDARY_STORAGE"

    .line 148
    invoke-static {v2}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "EMULATED_STORAGE_TARGET"

    .line 149
    invoke-static {v3}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 150
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 151
    invoke-static {}, Lcom/AOSPutils/Context_storage;->isMarshmallowPlus()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 154
    invoke-static {p0, v0}, Lcom/AOSPutils/Context_storage;->getExtSdCardPathsForActivity(Landroid/content/Context;Ljava/util/List;)V

    goto :goto_2

    .line 157
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 158
    sget-object p0, Lcom/AOSPutils/Context_storage;->physicalPaths:[Ljava/lang/String;

    invoke-static {v0, p0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    goto :goto_2

    .line 160
    :cond_1
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 164
    :cond_2
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    const-string v1, "/"

    .line 165
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object p0

    .line 166
    array-length v1, p0

    const/4 v4, 0x1

    sub-int/2addr v1, v4

    aget-object p0, p0, v1

    const/4 v1, 0x0

    .line 169
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    const-string p0, ""

    .line 175
    :goto_1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 176
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 178
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 182
    :goto_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_5

    .line 183
    sget-object p0, Ljava/io/File;->pathSeparator:Ljava/lang/String;

    invoke-virtual {v2, p0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 184
    invoke-static {v0, p0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    :cond_5
    return-object v0
.end method

.method public static hasExternalSDCard(Landroid/content/Context;)Z
    .locals 1

    .line 137
    sget-object v0, Lcom/AOSPutils/Context_storage;->sdCardPath:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 138
    invoke-static {p0}, Lcom/AOSPutils/Context_storage;->getSDCardPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/AOSPutils/Context_storage;->sdCardPath:Ljava/lang/String;

    .line 140
    :cond_0
    sget-object p0, Lcom/AOSPutils/Context_storage;->sdCardPath:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method static isMarshmallowPlus()Z
    .locals 2

    .line 58
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static trimEnd(Ljava/lang/String;C)Ljava/lang/String;
    .locals 2

    .line 74
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    :goto_0
    if-lez v0, :cond_0

    add-int/lit8 v1, v0, -0x1

    .line 76
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, p1, :cond_0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 79
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
