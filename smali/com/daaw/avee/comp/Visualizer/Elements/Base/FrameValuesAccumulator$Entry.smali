.class Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;
.super Ljava/lang/Object;
.source "FrameValuesAccumulator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Entry"
.end annotation


# instance fields
.field barSmoothValues:[F

.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;)V
    .locals 0

    .line 293
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    new-array p1, p1, [F

    .line 295
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator$Entry;->barSmoothValues:[F

    return-void
.end method
