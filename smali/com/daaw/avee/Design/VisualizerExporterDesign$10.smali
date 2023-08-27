.class Lcom/daaw/avee/Design/VisualizerExporterDesign$10;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerExporterDesign;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/Design/PlaybackDesign;Lcom/daaw/avee/Design/MainUIDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Ljava/lang/Integer;",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

.field final synthetic val$playbackDesign:Lcom/daaw/avee/Design/PlaybackDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/Design/PlaybackDesign;)V
    .locals 0

    .line 464
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    iput-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$10;->val$playbackDesign:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Landroid/app/Activity;)V
    .locals 2

    .line 468
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 469
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$10;->val$playbackDesign:Lcom/daaw/avee/Design/PlaybackDesign;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lcom/daaw/avee/Design/PlaybackDesign;->onViewPagerPageSelected(Ljava/lang/Integer;Landroid/app/Activity;Z)V

    .line 470
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    new-instance p2, Lcom/daaw/avee/Common/StatusMsg;

    invoke-direct {p2}, Lcom/daaw/avee/Common/StatusMsg;-><init>()V

    invoke-static {p1, v1, p2, v1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$300(Lcom/daaw/avee/Design/VisualizerExporterDesign;ZLcom/daaw/avee/Common/StatusMsg;Z)V

    goto :goto_0

    .line 472
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$10;->val$playbackDesign:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1100()Z

    move-result v1

    invoke-virtual {v0, p1, p2, v1}, Lcom/daaw/avee/Design/PlaybackDesign;->onViewPagerPageSelected(Ljava/lang/Integer;Landroid/app/Activity;Z)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 464
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Landroid/app/Activity;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign$10;->invoke(Ljava/lang/Integer;Landroid/app/Activity;)V

    return-void
.end method
