.class Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$3;
.super Ljava/lang/Object;
.source "ImageSequenceResult.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask2$TaskListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;->getNextFrame2()Lcom/daaw/avee/Common/VAsyncTask2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/VAsyncTask2$TaskListener<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$3;->this$0:Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onExecuteInBg()Landroid/graphics/Bitmap;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$3;->this$0:Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;

    invoke-static {v0}, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;->access$000(Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;)Lcom/daaw/avee/Common/Func/Func;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public bridge synthetic onExecuteInBg()Ljava/lang/Object;
    .locals 1

    .line 83
    invoke-virtual {p0}, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$3;->onExecuteInBg()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
