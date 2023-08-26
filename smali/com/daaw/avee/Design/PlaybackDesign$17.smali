.class Lcom/daaw/avee/Design/PlaybackDesign$17;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign;-><init>(Lcom/daaw/avee/Design/StationsDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent5$Handler<",
        "Landroid/content/Context;",
        "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;",
        "Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign;)V
    .locals 0

    .line 257
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$17;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/content/Context;Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 7

    .line 273
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$17;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PlaybackDesign;->access$100(Lcom/daaw/avee/Design/PlaybackDesign;)Landroid/os/Handler;

    move-result-object p1

    new-instance v6, Lcom/daaw/avee/Design/PlaybackDesign$17$1;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/Design/PlaybackDesign$17$1;-><init>(Lcom/daaw/avee/Design/PlaybackDesign$17;Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {p1, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 257
    check-cast p1, Landroid/content/Context;

    check-cast p2, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    check-cast p3, Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

    check-cast p4, Ljava/lang/Integer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/avee/Design/PlaybackDesign$17;->invoke(Landroid/content/Context;Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method
