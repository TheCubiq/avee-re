.class Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$2;
.super Ljava/lang/Object;
.source "ImageSequenceResult.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$ResultListener;


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
        "Lcom/daaw/avee/Common/VAsyncTask$ResultListener<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;

.field final synthetic val$onLoadedNextFrame:Lcom/daaw/avee/Common/Action1;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;Lcom/daaw/avee/Common/Action1;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$2;->this$0:Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;

    iput-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$2;->val$onLoadedNextFrame:Lcom/daaw/avee/Common/Action1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Landroid/graphics/Bitmap;Z)V
    .locals 0

    .line 70
    iget-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$2;->val$onLoadedNextFrame:Lcom/daaw/avee/Common/Action1;

    invoke-interface {p2, p1}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;Z)V
    .locals 0

    .line 67
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$2;->onResult(Landroid/graphics/Bitmap;Z)V

    return-void
.end method
