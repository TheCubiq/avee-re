.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathFactory;
.super Ljava/lang/Object;
.source "SegmentPathFactory.java"


# static fields
.field public static final typeNameNone:Ljava/lang/String; = "None"

.field public static final typeNames:[Ljava/lang/String;

.field public static final typeNamesCelebration:[Ljava/lang/String;

.field public static final typeNamesClosedAndNone:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/4 v0, 0x4

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "HorizontalLine"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v4, "Circle"

    const/4 v5, 0x1

    aput-object v4, v1, v5

    const-string v6, "SidedPolygon"

    const/4 v7, 0x2

    aput-object v6, v1, v7

    const-string v8, "Letter"

    const/4 v9, 0x3

    aput-object v8, v1, v9

    .line 13
    sput-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathFactory;->typeNames:[Ljava/lang/String;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/String;

    aput-object v2, v1, v3

    aput-object v4, v1, v5

    aput-object v6, v1, v7

    aput-object v8, v1, v9

    const-string v2, "Year"

    aput-object v2, v1, v0

    .line 20
    sput-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathFactory;->typeNamesCelebration:[Ljava/lang/String;

    new-array v0, v9, [Ljava/lang/String;

    const-string v1, "None"

    aput-object v1, v0, v3

    aput-object v4, v0, v5

    aput-object v6, v0, v7

    .line 29
    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathFactory;->typeNamesClosedAndNone:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;
    .locals 7

    .line 37
    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathFactory;->getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, -0x1

    .line 39
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "Circle"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :sswitch_1
    const-string v1, "HorizontalLine"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "SidedPolygon"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x3

    goto :goto_0

    :sswitch_3
    const-string v1, "Year"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x5

    goto :goto_0

    :sswitch_4
    const-string v1, "None"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :sswitch_5
    const-string v1, "Letter"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x4

    :cond_1
    :goto_0
    if-eqz v0, :cond_7

    if-eq v0, v6, :cond_6

    if-eq v0, v5, :cond_5

    if-eq v0, v4, :cond_4

    if-eq v0, v3, :cond_3

    if-eq v0, v2, :cond_2

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown typeName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-object p1

    .line 51
    :cond_2
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathYear;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathYear;-><init>()V

    return-object p0

    .line 49
    :cond_3
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathLetter;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathLetter;-><init>()V

    return-object p0

    .line 47
    :cond_4
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;-><init>()V

    return-object p0

    .line 45
    :cond_5
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    return-object p0

    .line 43
    :cond_6
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathHorizontalLine;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathHorizontalLine;-><init>()V

    return-object p0

    :cond_7
    const/4 p0, 0x0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7889efba -> :sswitch_5
        0x252358 -> :sswitch_4
        0x29fc5d -> :sswitch_3
        0x5b925ead -> :sswitch_2
        0x6b75ca58 -> :sswitch_1
        0x7851a8f0 -> :sswitch_0
    .end sparse-switch
.end method

.method public static getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const-string p0, "None"

    return-object p0

    .line 63
    :cond_0
    instance-of v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathHorizontalLine;

    if-eqz v0, :cond_1

    const-string p0, "HorizontalLine"

    return-object p0

    .line 65
    :cond_1
    instance-of v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    if-eqz v0, :cond_2

    const-string p0, "Circle"

    return-object p0

    .line 67
    :cond_2
    instance-of v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    if-eqz v0, :cond_3

    const-string p0, "SidedPolygon"

    return-object p0

    .line 69
    :cond_3
    instance-of v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathLetter;

    if-eqz v0, :cond_4

    const-string p0, "Letter"

    return-object p0

    .line 71
    :cond_4
    instance-of p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathYear;

    if-eqz p0, :cond_5

    const-string p0, "Year"

    return-object p0

    :cond_5
    const-string p0, "unknown instance type"

    .line 74
    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const-string p0, "unk"

    return-object p0
.end method
