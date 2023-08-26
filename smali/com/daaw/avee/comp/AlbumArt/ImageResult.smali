.class public Lcom/daaw/avee/comp/AlbumArt/ImageResult;
.super Ljava/lang/Object;
.source "ImageResult.java"


# instance fields
.field bitmap:Landroid/graphics/Bitmap;

.field private closeCb:Lcom/daaw/avee/Common/Action;


# direct methods
.method constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->bitmap:Landroid/graphics/Bitmap;

    const/4 p1, 0x0

    .line 19
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->closeCb:Lcom/daaw/avee/Common/Action;

    return-void
.end method

.method constructor <init>(Landroid/graphics/Bitmap;Lcom/daaw/avee/Common/Action;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->bitmap:Landroid/graphics/Bitmap;

    .line 25
    iput-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->closeCb:Lcom/daaw/avee/Common/Action;

    return-void
.end method

.method public static closeSafe(Lcom/daaw/avee/comp/AlbumArt/ImageResult;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 51
    invoke-virtual {p0}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->close()V

    :cond_0
    return-void
.end method

.method private getNonPersistentBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public static getNonPersistentBitmapSafe(Lcom/daaw/avee/comp/AlbumArt/ImageResult;)Landroid/graphics/Bitmap;
    .locals 0

    if-eqz p0, :cond_0

    .line 46
    invoke-direct {p0}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->getNonPersistentBitmap()Landroid/graphics/Bitmap;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public advanceNextFrame()V
    .locals 0

    return-void
.end method

.method public cloneImageResult()Lcom/daaw/avee/comp/AlbumArt/ImageResult;
    .locals 0

    return-object p0
.end method

.method protected close()V
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->closeCb:Lcom/daaw/avee/Common/Action;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/avee/Common/Action;->onInvoke()V

    :cond_0
    return-void
.end method

.method public getFramesCount()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getNextFrame()Landroid/graphics/Bitmap;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getNextFrame(Lcom/daaw/avee/Common/Action1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Action1<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->bitmap:Landroid/graphics/Bitmap;

    invoke-interface {p1, v0}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    return-void
.end method

.method public getNextFrame2()Lcom/daaw/avee/Common/VAsyncTask2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/VAsyncTask2<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public resetCurrentFrame()V
    .locals 0

    return-void
.end method
