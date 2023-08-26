.class Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;
.super Ljava/lang/Object;
.source "AlbumArtCore.java"

# interfaces
.implements Lcom/bumptech/glide/request/target/Target;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->loadASyncAlbumArtLarge2(ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;IIIIIIZLcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/request/target/Target<",
        "Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

.field final synthetic val$colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

.field final synthetic val$dataSource:Ljava/lang/String;

.field final synthetic val$loadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

.field final synthetic val$targetBoundsHeight:I

.field final synthetic val$targetBoundsWidth:I

.field final synthetic val$url0:Ljava/lang/String;

.field final synthetic val$url1:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;II)V
    .locals 0

    .line 770
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

    iput-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$loadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

    iput-object p3, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$dataSource:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$url0:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$url1:Ljava/lang/String;

    iput-object p6, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    iput p7, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$targetBoundsWidth:I

    iput p8, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$targetBoundsHeight:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRequest()Lcom/bumptech/glide/request/Request;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSize(Lcom/bumptech/glide/request/target/SizeReadyCallback;)V
    .locals 2

    .line 812
    iget v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$targetBoundsWidth:I

    if-lez v0, :cond_0

    iget v1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$targetBoundsHeight:I

    if-lez v1, :cond_0

    .line 813
    invoke-interface {p1, v0, v1}, Lcom/bumptech/glide/request/target/SizeReadyCallback;->onSizeReady(II)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x100

    .line 815
    invoke-interface {p1, v0, v0}, Lcom/bumptech/glide/request/target/SizeReadyCallback;->onSizeReady(II)V

    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 0

    return-void
.end method

.method public onLoadCleared(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public onLoadFailed(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 794
    iget-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$loadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

    iget-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$dataSource:Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$url0:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$url1:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, v2, p2, v0, v1}, Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;->onBitmapLoaded(Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onLoadStarted(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public onResourceReady(Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;Lcom/bumptech/glide/request/animation/GlideAnimation;)V
    .locals 6

    .line 799
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$loadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

    iget-object v2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$dataSource:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$url0:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$url1:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->val$colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->access$300(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;)V

    return-void
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Lcom/bumptech/glide/request/animation/GlideAnimation;)V
    .locals 0

    .line 770
    check-cast p1, Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;->onResourceReady(Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;Lcom/bumptech/glide/request/animation/GlideAnimation;)V

    return-void
.end method

.method public onStart()V
    .locals 0

    return-void
.end method

.method public onStop()V
    .locals 0

    return-void
.end method

.method public setRequest(Lcom/bumptech/glide/request/Request;)V
    .locals 0

    return-void
.end method
