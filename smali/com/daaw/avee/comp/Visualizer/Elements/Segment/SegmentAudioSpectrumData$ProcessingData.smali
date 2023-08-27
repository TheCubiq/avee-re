.class Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$ProcessingData;
.super Ljava/lang/Object;
.source "SegmentAudioSpectrumData.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ProcessingData"
.end annotation


# instance fields
.field private frameTimeF:F

.field private visualisationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;


# direct methods
.method public constructor <init>(FLcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)V
    .locals 0

    .line 1449
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1451
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$ProcessingData;->frameTimeF:F

    .line 1452
    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$ProcessingData;->visualisationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$ProcessingData;)F
    .locals 0

    .line 1443
    iget p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$ProcessingData;->frameTimeF:F

    return p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$ProcessingData;)Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;
    .locals 0

    .line 1443
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$ProcessingData;->visualisationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    return-object p0
.end method
