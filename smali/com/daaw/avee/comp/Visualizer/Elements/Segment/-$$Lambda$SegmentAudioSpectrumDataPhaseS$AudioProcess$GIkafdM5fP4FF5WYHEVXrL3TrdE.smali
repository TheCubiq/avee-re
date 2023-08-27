.class public final synthetic Lcom/daaw/avee/comp/Visualizer/Elements/Segment/-$$Lambda$SegmentAudioSpectrumDataPhaseS$AudioProcess$GIkafdM5fP4FF5WYHEVXrL3TrdE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

.field private final synthetic f$1:I

.field private final synthetic f$2:I

.field private final synthetic f$3:I

.field private final synthetic f$4:F

.field private final synthetic f$5:[Lcom/daaw/avee/Common/Signal;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;IIIF[Lcom/daaw/avee/Common/Signal;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/-$$Lambda$SegmentAudioSpectrumDataPhaseS$AudioProcess$GIkafdM5fP4FF5WYHEVXrL3TrdE;->f$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/-$$Lambda$SegmentAudioSpectrumDataPhaseS$AudioProcess$GIkafdM5fP4FF5WYHEVXrL3TrdE;->f$1:I

    iput p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/-$$Lambda$SegmentAudioSpectrumDataPhaseS$AudioProcess$GIkafdM5fP4FF5WYHEVXrL3TrdE;->f$2:I

    iput p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/-$$Lambda$SegmentAudioSpectrumDataPhaseS$AudioProcess$GIkafdM5fP4FF5WYHEVXrL3TrdE;->f$3:I

    iput p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/-$$Lambda$SegmentAudioSpectrumDataPhaseS$AudioProcess$GIkafdM5fP4FF5WYHEVXrL3TrdE;->f$4:F

    iput-object p6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/-$$Lambda$SegmentAudioSpectrumDataPhaseS$AudioProcess$GIkafdM5fP4FF5WYHEVXrL3TrdE;->f$5:[Lcom/daaw/avee/Common/Signal;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/-$$Lambda$SegmentAudioSpectrumDataPhaseS$AudioProcess$GIkafdM5fP4FF5WYHEVXrL3TrdE;->f$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/-$$Lambda$SegmentAudioSpectrumDataPhaseS$AudioProcess$GIkafdM5fP4FF5WYHEVXrL3TrdE;->f$1:I

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/-$$Lambda$SegmentAudioSpectrumDataPhaseS$AudioProcess$GIkafdM5fP4FF5WYHEVXrL3TrdE;->f$2:I

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/-$$Lambda$SegmentAudioSpectrumDataPhaseS$AudioProcess$GIkafdM5fP4FF5WYHEVXrL3TrdE;->f$3:I

    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/-$$Lambda$SegmentAudioSpectrumDataPhaseS$AudioProcess$GIkafdM5fP4FF5WYHEVXrL3TrdE;->f$4:F

    iget-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/-$$Lambda$SegmentAudioSpectrumDataPhaseS$AudioProcess$GIkafdM5fP4FF5WYHEVXrL3TrdE;->f$5:[Lcom/daaw/avee/Common/Signal;

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lambda$processTh$0$SegmentAudioSpectrumDataPhaseS$AudioProcess(IIIF[Lcom/daaw/avee/Common/Signal;)V

    return-void
.end method
