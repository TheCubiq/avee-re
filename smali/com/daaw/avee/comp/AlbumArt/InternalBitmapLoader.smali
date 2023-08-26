.class public Lcom/daaw/avee/comp/AlbumArt/InternalBitmapLoader;
.super Ljava/lang/Object;
.source "InternalBitmapLoader.java"


# static fields
.field public static final InternalResPrefix:Ljava/lang/String; = "internalres:"

.field private static final InternalResPrefixPure:Ljava/lang/String; = "internalres"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getResIdFromPath(Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/16 v2, 0x3a

    .line 28
    invoke-static {p0, v2, v1}, Lcom/daaw/avee/Common/Utils;->stringSplitInTwo(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 30
    aget-object p0, v1, v0

    const-string v2, "internalres"

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 34
    invoke-static {}, Lcom/daaw/avee/Defines;->getInstance()Lcom/daaw/avee/Defines;

    move-result-object p0

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/Defines;->getDrawableResid(Ljava/lang/String;I)I

    move-result p0

    return p0

    :cond_1
    return v0
.end method

.method public static loadResIdBitmap(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;)V
    .locals 2

    .line 49
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 50
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    .line 54
    invoke-interface {p4, v1, p0, p1, p2}, Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;->onBitmapLoaded(Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 58
    :cond_1
    invoke-static {v0, p3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p3

    .line 60
    new-instance v0, Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    invoke-direct {v0, p3}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;-><init>(Landroid/graphics/Bitmap;)V

    .line 62
    invoke-interface {p4, v0, p0, p1, p2}, Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;->onBitmapLoaded(Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
