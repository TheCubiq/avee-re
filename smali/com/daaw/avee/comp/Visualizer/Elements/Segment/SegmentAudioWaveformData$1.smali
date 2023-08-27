.class Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData$1;
.super Ljava/lang/Object;
.source "SegmentAudioWaveformData.java"

# interfaces
.implements Lcom/daaw/avee/Common/ISimpleListFloat;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData$1;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(I)F
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData$1;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;->access$000(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;)[F

    move-result-object v0

    aget p1, v0, p1

    return p1
.end method

.method public size()I
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData$1;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;->access$000(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;)[F

    move-result-object v0

    array-length v0, v0

    return v0
.end method
