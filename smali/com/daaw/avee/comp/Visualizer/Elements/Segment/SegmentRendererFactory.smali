.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererFactory;
.super Ljava/lang/Object;
.source "SegmentRendererFactory.java"


# static fields
.field public static final typeNameNone:Ljava/lang/String; = "None"

.field public static final typeNames:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "None"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "Bars"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "Line"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "SharpBars"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "RoundBars"

    aput-object v2, v0, v1

    .line 12
    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererFactory;->typeNames:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;
    .locals 6

    .line 22
    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererFactory;->getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, -0x1

    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "RoundBars"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :sswitch_1
    const-string v1, "SharpBars"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x3

    goto :goto_0

    :sswitch_2
    const-string v1, "None"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :sswitch_3
    const-string v1, "Line"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :sswitch_4
    const-string v1, "Bars"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    :goto_0
    if-eqz v0, :cond_6

    if-eq v0, v5, :cond_5

    if-eq v0, v4, :cond_4

    if-eq v0, v3, :cond_3

    if-eq v0, v2, :cond_2

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown typeName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-object p1

    .line 34
    :cond_2
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;-><init>()V

    return-object p0

    .line 32
    :cond_3
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;-><init>()V

    return-object p0

    .line 30
    :cond_4
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    return-object p0

    .line 28
    :cond_5
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;-><init>()V

    return-object p0

    :cond_6
    const/4 p0, 0x0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x1f7ae0 -> :sswitch_4
        0x242414 -> :sswitch_3
        0x252358 -> :sswitch_2
        0x19b8e5aa -> :sswitch_1
        0x771cd54e -> :sswitch_0
    .end sparse-switch
.end method

.method public static getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const-string p0, "None"

    return-object p0

    .line 46
    :cond_0
    instance-of v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    if-eqz v0, :cond_1

    const-string p0, "Bars"

    return-object p0

    .line 48
    :cond_1
    instance-of v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    if-eqz v0, :cond_2

    const-string p0, "Line"

    return-object p0

    .line 50
    :cond_2
    instance-of v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;

    if-eqz v0, :cond_3

    const-string p0, "SharpBars"

    return-object p0

    .line 52
    :cond_3
    instance-of p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;

    if-eqz p0, :cond_4

    const-string p0, "RoundBars"

    return-object p0

    :cond_4
    const-string p0, "unknown instance type"

    .line 55
    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const-string p0, "unk"

    return-object p0
.end method
