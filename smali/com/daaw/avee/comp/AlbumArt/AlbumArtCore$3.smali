.class Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$3;
.super Ljava/lang/Object;
.source "AlbumArtCore.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$ResultListener;


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
        "Lcom/daaw/avee/Common/VAsyncTask$ResultListener<",
        "Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

.field final synthetic val$colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

.field final synthetic val$dataSource:Ljava/lang/String;

.field final synthetic val$loadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

.field final synthetic val$url0:Ljava/lang/String;

.field final synthetic val$url1:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;)V
    .locals 0

    .line 1005
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$3;->this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

    iput-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$3;->val$loadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

    iput-object p3, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$3;->val$dataSource:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$3;->val$url0:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$3;->val$url1:Ljava/lang/String;

    iput-object p6, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$3;->val$colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;Z)V
    .locals 6

    .line 1008
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$3;->val$loadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

    iget-object v2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$3;->val$dataSource:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$3;->val$url0:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$3;->val$url1:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$3;->val$colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->access$300(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;)V

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;Z)V
    .locals 0

    .line 1005
    check-cast p1, Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$3;->onResult(Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;Z)V

    return-void
.end method
