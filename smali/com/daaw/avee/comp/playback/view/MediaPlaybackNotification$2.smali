.class final Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$2;
.super Ljava/lang/Object;
.source "MediaPlaybackNotification.java"

# interfaces
.implements Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->updateNotificationViewsImg(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/Common/Action1;Lcom/daaw/avee/Common/Func/Func;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field private object1:Ljava/lang/Object;

.field final synthetic val$onImageViewSet:Lcom/daaw/avee/Common/Action1;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Common/Action1;)V
    .locals 0

    .line 297
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$2;->val$onImageViewSet:Lcom/daaw/avee/Common/Action1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBitmapLoaded(Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 303
    invoke-static {p1}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->getNonPersistentBitmapSafe(Lcom/daaw/avee/comp/AlbumArt/ImageResult;)Landroid/graphics/Bitmap;

    move-result-object p2

    .line 305
    invoke-static {p2}, Lcom/daaw/avee/Common/UtilsUI;->copyBitmapSafe(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p2

    .line 307
    iget-object p3, p0, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$2;->val$onImageViewSet:Lcom/daaw/avee/Common/Action1;

    invoke-interface {p3, p2}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    .line 309
    invoke-static {p1}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->closeSafe(Lcom/daaw/avee/comp/AlbumArt/ImageResult;)V

    return-void
.end method

.method public setUserObject1(Ljava/lang/Object;)V
    .locals 0

    .line 314
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$2;->object1:Ljava/lang/Object;

    return-void
.end method
