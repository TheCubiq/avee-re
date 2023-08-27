.class public Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaFactory;
.super Ljava/lang/Object;
.source "AreaFactory.java"


# static fields
.field public static final typeNameNone:Ljava/lang/String; = "None"

.field public static final typeNames:[Ljava/lang/String;

.field public static final typeNamesAndNone:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "HorizontalLine"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v4, "Rectangle"

    const/4 v5, 0x1

    aput-object v4, v1, v5

    .line 17
    sput-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaFactory;->typeNames:[Ljava/lang/String;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const-string v6, "None"

    aput-object v6, v1, v3

    aput-object v2, v1, v5

    aput-object v4, v1, v0

    .line 24
    sput-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaFactory;->typeNamesAndNone:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;
    .locals 2

    .line 32
    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaFactory;->getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, -0x1

    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "HorizontalLine"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :sswitch_1
    const-string v1, "Rectangle3D"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x6

    goto :goto_0

    :sswitch_2
    const-string v1, "VerticalLine"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :sswitch_3
    const-string v1, "None"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :sswitch_4
    const-string v1, "Line"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x3

    goto :goto_0

    :sswitch_5
    const-string v1, "Rectangle"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x5

    goto :goto_0

    :sswitch_6
    const-string v1, "HorizontalLineRandom"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x2

    :cond_1
    :goto_0
    packed-switch v0, :pswitch_data_0

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown typeName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-object p1

    .line 48
    :pswitch_0
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;-><init>()V

    return-object p0

    .line 46
    :pswitch_1
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;-><init>()V

    return-object p0

    .line 44
    :pswitch_2
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaVerticalLine;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaVerticalLine;-><init>()V

    return-object p0

    .line 42
    :pswitch_3
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaVerticalLine;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaVerticalLine;-><init>()V

    return-object p0

    .line 40
    :pswitch_4
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaHorizontalLineRandDir;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaHorizontalLineRandDir;-><init>()V

    return-object p0

    .line 38
    :pswitch_5
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;-><init>()V

    return-object p0

    :pswitch_6
    const/4 p0, 0x0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x54ed86c5 -> :sswitch_6
        -0x45b832b1 -> :sswitch_5
        0x242414 -> :sswitch_4
        0x252358 -> :sswitch_3
        0x79f34aa -> :sswitch_2
        0x4789bc00 -> :sswitch_1
        0x6b75ca58 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const-string p0, "None"

    return-object p0

    .line 60
    :cond_0
    instance-of v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;

    if-eqz v0, :cond_1

    const-string p0, "HorizontalLine"

    return-object p0

    .line 62
    :cond_1
    instance-of v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaHorizontalLineRandDir;

    if-eqz v0, :cond_2

    const-string p0, "HorizontalLineRandom"

    return-object p0

    .line 64
    :cond_2
    instance-of v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaVerticalLine;

    if-eqz v0, :cond_3

    const-string p0, "Line"

    return-object p0

    .line 66
    :cond_3
    instance-of v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    if-eqz v0, :cond_4

    const-string p0, "Rectangle"

    return-object p0

    .line 68
    :cond_4
    instance-of p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;

    if-eqz p0, :cond_5

    const-string p0, "Rectangle3D"

    return-object p0

    :cond_5
    const-string p0, "unknown instance type"

    .line 71
    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const-string p0, "unk"

    return-object p0
.end method
