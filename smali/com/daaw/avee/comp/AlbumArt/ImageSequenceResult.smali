.class public Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;
.super Lcom/daaw/avee/comp/AlbumArt/ImageResult;
.source "ImageSequenceResult.java"


# instance fields
.field private advanceNextFrameCb:Lcom/daaw/avee/Common/Action;

.field private getFramesCountCb:Lcom/daaw/avee/Common/Func/Func;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private getNextFrameCb:Lcom/daaw/avee/Common/Func/Func;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private resetCurrentFrameCb:Lcom/daaw/avee/Common/Action;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Lcom/daaw/avee/Common/Func/Func;Lcom/daaw/avee/Common/Action;Lcom/daaw/avee/Common/Action;Lcom/daaw/avee/Common/Func/Func;Lcom/daaw/avee/Common/Action;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/daaw/avee/Common/Action;",
            "Lcom/daaw/avee/Common/Action;",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/avee/Common/Action;",
            ")V"
        }
    .end annotation

    .line 28
    invoke-direct {p0, p1, p6}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;-><init>(Landroid/graphics/Bitmap;Lcom/daaw/avee/Common/Action;)V

    .line 29
    iput-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;->getFramesCountCb:Lcom/daaw/avee/Common/Func/Func;

    .line 30
    iput-object p3, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;->resetCurrentFrameCb:Lcom/daaw/avee/Common/Action;

    .line 31
    iput-object p4, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;->advanceNextFrameCb:Lcom/daaw/avee/Common/Action;

    .line 32
    iput-object p5, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;->getNextFrameCb:Lcom/daaw/avee/Common/Func/Func;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;)Lcom/daaw/avee/Common/Func/Func;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;->getNextFrameCb:Lcom/daaw/avee/Common/Func/Func;

    return-object p0
.end method


# virtual methods
.method public advanceNextFrame()V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;->advanceNextFrameCb:Lcom/daaw/avee/Common/Action;

    invoke-interface {v0}, Lcom/daaw/avee/Common/Action;->onInvoke()V

    return-void
.end method

.method public getFramesCount()I
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;->getFramesCountCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {v0}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getNextFrame()Landroid/graphics/Bitmap;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;->getNextFrameCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {v0}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getNextFrame(Lcom/daaw/avee/Common/Action1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Action1<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .line 60
    new-instance v0, Lcom/daaw/avee/Common/VAsyncTask;

    new-instance v1, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$1;-><init>(Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;)V

    invoke-direct {v0, v1}, Lcom/daaw/avee/Common/VAsyncTask;-><init>(Lcom/daaw/avee/Common/VAsyncTask$TaskListener;)V

    .line 67
    new-instance v1, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$2;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$2;-><init>(Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;Lcom/daaw/avee/Common/Action1;)V

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/VAsyncTask;->RunParallel(Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V

    return-void
.end method

.method public getNextFrame2()Lcom/daaw/avee/Common/VAsyncTask2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/VAsyncTask2<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 83
    new-instance v0, Lcom/daaw/avee/Common/VAsyncTask2;

    new-instance v1, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$3;-><init>(Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;)V

    invoke-direct {v0, v1}, Lcom/daaw/avee/Common/VAsyncTask2;-><init>(Lcom/daaw/avee/Common/VAsyncTask2$TaskListener;)V

    .line 90
    new-instance v1, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$4;-><init>(Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;)V

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/VAsyncTask2;->RunParallel(Lcom/daaw/avee/Common/VAsyncTask2$ResultListener;)V

    return-object v0
.end method

.method public resetCurrentFrame()V
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;->resetCurrentFrameCb:Lcom/daaw/avee/Common/Action;

    invoke-interface {v0}, Lcom/daaw/avee/Common/Action;->onInvoke()V

    return-void
.end method
