.class Lcom/daaw/avee/MainActivity$10;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/MainActivity;->updateActionBar(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field object1:Ljava/lang/Object;

.field final synthetic this$0:Lcom/daaw/avee/MainActivity;


# direct methods
.method constructor <init>(Lcom/daaw/avee/MainActivity;)V
    .locals 0

    .line 1013
    iput-object p1, p0, Lcom/daaw/avee/MainActivity$10;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBitmapLoaded(Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1019
    invoke-static {p1}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->getNonPersistentBitmapSafe(Lcom/daaw/avee/comp/AlbumArt/ImageResult;)Landroid/graphics/Bitmap;

    move-result-object p2

    .line 1021
    invoke-static {p2}, Lcom/daaw/avee/Common/UtilsUI;->copyBitmapSafe(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 1028
    invoke-static {p1}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->closeSafe(Lcom/daaw/avee/comp/AlbumArt/ImageResult;)V

    return-void
.end method

.method public setUserObject1(Ljava/lang/Object;)V
    .locals 0

    .line 1033
    iput-object p1, p0, Lcom/daaw/avee/MainActivity$10;->object1:Ljava/lang/Object;

    return-void
.end method
