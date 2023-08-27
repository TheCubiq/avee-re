.class Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$ProcessingData;
.super Ljava/lang/Object;
.source "SegmentAudioSpectrumDataPhaseS.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ProcessingData"
.end annotation


# instance fields
.field public frameTimeF:F

.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;

.field public visualisationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;FLcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)V
    .locals 0

    .line 1484
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$ProcessingData;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1486
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$ProcessingData;->frameTimeF:F

    .line 1487
    iput-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$ProcessingData;->visualisationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    return-void
.end method
