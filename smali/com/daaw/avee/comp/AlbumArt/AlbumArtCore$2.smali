.class Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$2;
.super Ljava/lang/Object;
.source "AlbumArtCore.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$TaskListener;


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
        "Lcom/daaw/avee/Common/VAsyncTask$TaskListener<",
        "Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

.field final synthetic val$creator0Final:Lcom/bumptech/glide/DrawableRequestBuilder;

.field final synthetic val$targetBoundsHeight:I

.field final synthetic val$targetBoundsWidth:I


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Lcom/bumptech/glide/DrawableRequestBuilder;II)V
    .locals 0

    .line 961
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$2;->this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

    iput-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$2;->val$creator0Final:Lcom/bumptech/glide/DrawableRequestBuilder;

    iput p3, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$2;->val$targetBoundsWidth:I

    iput p4, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$2;->val$targetBoundsHeight:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;",
            ">;)",
            "Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;"
        }
    .end annotation

    .line 975
    iget-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$2;->val$creator0Final:Lcom/bumptech/glide/DrawableRequestBuilder;

    .line 981
    iget v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$2;->val$targetBoundsWidth:I

    iget v1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$2;->val$targetBoundsHeight:I

    invoke-virtual {p1, v0, v1}, Lcom/bumptech/glide/DrawableRequestBuilder;->into(II)Lcom/bumptech/glide/request/FutureTarget;

    move-result-object p1

    const-wide/16 v0, 0x2328

    .line 984
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v2}, Lcom/bumptech/glide/request/FutureTarget;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 990
    invoke-virtual {p1}, Ljava/util/concurrent/TimeoutException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 988
    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->printStackTrace()V

    goto :goto_0

    :catch_2
    move-exception p1

    .line 986
    invoke-virtual {p1}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_0
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method public bridge synthetic onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Ljava/lang/Object;
    .locals 0

    .line 961
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$2;->onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;

    move-result-object p1

    return-object p1
.end method
