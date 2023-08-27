.class Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$4;
.super Ljava/lang/Object;
.source "ImageSequenceResult.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask2$ResultListener;


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
        "Lcom/daaw/avee/Common/VAsyncTask2$ResultListener<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$4;->this$0:Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Landroid/graphics/Bitmap;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .line 90
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult$4;->onResult(Landroid/graphics/Bitmap;)V

    return-void
.end method
