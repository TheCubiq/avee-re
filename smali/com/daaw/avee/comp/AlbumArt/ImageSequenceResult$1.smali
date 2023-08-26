.class Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$1;
.super Ljava/lang/Object;
.source "ImageSequenceResult.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$TaskListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;->getNextFrame(Lcom/daaw/avee/Common/Action1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/VAsyncTask$TaskListener<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$1;->this$0:Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Landroid/graphics/Bitmap;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    .line 63
    iget-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$1;->this$0:Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;

    invoke-static {p1}, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;->access$000(Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;)Lcom/daaw/avee/Common/Func/Func;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    return-object p1
.end method

.method public bridge synthetic onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Ljava/lang/Object;
    .locals 0

    .line 60
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$1;->onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method
