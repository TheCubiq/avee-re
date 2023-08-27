.class Lcom/daaw/avee/comp/playback/MediaPlaybackService$11;
.super Ljava/lang/Object;
.source "MediaPlaybackService.java"

# interfaces
.implements Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/MediaPlaybackService;->notifyPlaystateOrMetaChanged(ZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field object1:Ljava/lang/Object;

.field final synthetic this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V
    .locals 0

    .line 1191
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$11;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBitmapLoaded(Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1197
    invoke-static {p1}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->getNonPersistentBitmapSafe(Lcom/daaw/avee/comp/AlbumArt/ImageResult;)Landroid/graphics/Bitmap;

    move-result-object p2

    .line 1201
    invoke-static {p2}, Lcom/daaw/avee/Common/UtilsUI;->copyBitmapSafe(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p2

    .line 1203
    iget-object p3, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$11;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-static {p3, p2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->access$1000(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Landroid/graphics/Bitmap;)V

    .line 1205
    invoke-static {p1}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->closeSafe(Lcom/daaw/avee/comp/AlbumArt/ImageResult;)V

    return-void
.end method

.method public setUserObject1(Ljava/lang/Object;)V
    .locals 0

    .line 1210
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$11;->object1:Ljava/lang/Object;

    return-void
.end method
