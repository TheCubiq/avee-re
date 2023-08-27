.class Lcom/daaw/avee/Design/VisualizerDesign$12$1;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign$12;->invoke(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field object1:Ljava/lang/Object;

.field final synthetic this$1:Lcom/daaw/avee/Design/VisualizerDesign$12;

.field final synthetic val$loadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign$12;Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;)V
    .locals 0

    .line 439
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$12$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$12;

    iput-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$12$1;->val$loadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBitmapLoaded(Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 446
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$12$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$12;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerDesign$12;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerDesign;->access$600(Lcom/daaw/avee/Design/VisualizerDesign;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz v0, :cond_0

    .line 448
    new-instance v7, Lcom/daaw/avee/Design/VisualizerDesign$12$1$1;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/Design/VisualizerDesign$12$1$1;-><init>(Lcom/daaw/avee/Design/VisualizerDesign$12$1;Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->queueEvent(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setUserObject1(Ljava/lang/Object;)V
    .locals 0

    .line 458
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$12$1;->object1:Ljava/lang/Object;

    return-void
.end method
