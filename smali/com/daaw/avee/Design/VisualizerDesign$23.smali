.class Lcom/daaw/avee/Design/VisualizerDesign$23;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR1$Handler<",
        "Landroid/content/Context;",
        "Lcom/daaw/avee/comp/Common/TrackDurationInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 743
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$23;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/content/Context;)Lcom/daaw/avee/comp/Common/TrackDurationInfo;
    .locals 2

    .line 746
    new-instance p1, Lcom/daaw/avee/comp/Common/TrackDurationInfo;

    invoke-direct {p1}, Lcom/daaw/avee/comp/Common/TrackDurationInfo;-><init>()V

    .line 750
    invoke-static {}, Lcom/daaw/avee/Design/AppDesign;->getTrackPositionForRendering()J

    move-result-wide v0

    long-to-float v0, v0

    iput v0, p1, Lcom/daaw/avee/comp/Common/TrackDurationInfo;->trackPositionMs:F

    .line 751
    invoke-static {}, Lcom/daaw/avee/Design/AppDesign;->getTrackDurationForRendering()J

    move-result-wide v0

    long-to-float v0, v0

    iput v0, p1, Lcom/daaw/avee/comp/Common/TrackDurationInfo;->durationMs:F

    .line 752
    iget v0, p1, Lcom/daaw/avee/comp/Common/TrackDurationInfo;->trackPositionMs:F

    iget v1, p1, Lcom/daaw/avee/comp/Common/TrackDurationInfo;->durationMs:F

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p1, Lcom/daaw/avee/comp/Common/TrackDurationInfo;->progress:F

    .line 753
    iget v0, p1, Lcom/daaw/avee/comp/Common/TrackDurationInfo;->progress:F

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p1, Lcom/daaw/avee/comp/Common/TrackDurationInfo;->progress:F

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 743
    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/VisualizerDesign$23;->invoke(Landroid/content/Context;)Lcom/daaw/avee/comp/Common/TrackDurationInfo;

    move-result-object p1

    return-object p1
.end method
