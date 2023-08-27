.class Lcom/daaw/avee/Design/VisualizerDesign$12$1$1;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign$12$1;->onBitmapLoaded(Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/daaw/avee/Design/VisualizerDesign$12$1;

.field final synthetic val$imageResult:Lcom/daaw/avee/comp/AlbumArt/ImageResult;

.field final synthetic val$url0:Ljava/lang/String;

.field final synthetic val$url00:Ljava/lang/String;

.field final synthetic val$url1:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign$12$1;Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 448
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$12$1$1;->this$2:Lcom/daaw/avee/Design/VisualizerDesign$12$1;

    iput-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$12$1$1;->val$imageResult:Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    iput-object p3, p0, Lcom/daaw/avee/Design/VisualizerDesign$12$1$1;->val$url00:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/avee/Design/VisualizerDesign$12$1$1;->val$url0:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/avee/Design/VisualizerDesign$12$1$1;->val$url1:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 451
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$12$1$1;->this$2:Lcom/daaw/avee/Design/VisualizerDesign$12$1;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerDesign$12$1;->val$loadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerDesign$12$1$1;->val$imageResult:Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign$12$1$1;->val$url00:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign$12$1$1;->val$url0:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/avee/Design/VisualizerDesign$12$1$1;->val$url1:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;->onBitmapLoaded(Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
