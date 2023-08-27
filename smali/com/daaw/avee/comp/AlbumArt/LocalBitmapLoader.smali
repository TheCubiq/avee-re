.class public Lcom/daaw/avee/comp/AlbumArt/LocalBitmapLoader;
.super Ljava/lang/Object;
.source "LocalBitmapLoader.java"


# static fields
.field public static final Prefix:Ljava/lang/String; = "local:"

.field private static final PrefixPure:Ljava/lang/String; = "local"

.field public static final Separator:C = ':'


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getFileNameFromPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/16 v2, 0x3a

    .line 15
    invoke-static {p0, v2, v1}, Lcom/daaw/avee/Common/Utils;->stringSplitInTwo(Ljava/lang/String;I[Ljava/lang/String;)V

    const/4 p0, 0x0

    .line 17
    aget-object p0, v1, p0

    const-string v2, "local"

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    .line 19
    aget-object p0, v1, p0

    return-object p0

    :cond_1
    return-object v0
.end method
