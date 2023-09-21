.class public Lcom/daaw/avee/comp/Common/MeasureDefs;
.super Ljava/lang/Object;
.source "MeasureDefs.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;
    }
.end annotation


# static fields
.field public static final Constant:Ljava/lang/String; = "Constant"

.field public static final Nothing:Ljava/lang/String; = "Nothing"

.field public static final beat:Ljava/lang/String; = "Beat"

.field public static final beatCamShakeLess:Ljava/lang/String; = "BeatCamShakeLess"

.field public static final beatCamShakeMore:Ljava/lang/String; = "BeatCamShakeMore"

.field public static final beatCamShakeRotLess:Ljava/lang/String; = "BeatCamShakeRotLess"

.field public static final beatCamShakeRotMore:Ljava/lang/String; = "BeatCamShakeRotMore"

.field public static final beatRandomShake:Ljava/lang/String; = "BeatRandomShake"

.field public static final beatTriggerAnim:Ljava/lang/String; = "BeatTriggerAnim"

.field public static final constantCamShakeLess:Ljava/lang/String; = "ConstantShake"

.field public static final constantCamShakeMore:Ljava/lang/String; = "ConstantShakeMore"

.field public static final constantCamShakeRotLess:Ljava/lang/String; = "ConstantShakeRotLess"

.field public static final constantCamShakeRotMore:Ljava/lang/String; = "ConstantShakeRotMore"

.field public static final isPlaying:Ljava/lang/String; = "IsPlaying"

.field public static final measures:[Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

.field public static final measures1d:[Ljava/lang/String;

.field public static final measures1dMVar:[Ljava/lang/String;

.field public static final measures2dMVar:[Ljava/lang/String;

.field public static final peakBarIndex:Ljava/lang/String; = "PeakBarIndex"

.field public static final textAlbum:Ljava/lang/String; = "{Album}"

.field public static final textArtist:Ljava/lang/String; = "{Artist}"

.field public static final textArtistAndTitle:Ljava/lang/String; = "{ArtistAndTitle}"

.field public static final textArtistOrTitle:Ljava/lang/String; = "{ArtistOrTitle}"

.field public static final textFps:Ljava/lang/String; = "{Fps}"

.field public static final textFrameTime:Ljava/lang/String; = "{FrameTime}"

.field public static final textGradualResLoad:Ljava/lang/String; = "{GradualResLoad}"

.field public static final textMarkedArtistAndTitle:Ljava/lang/String; = "{MarkedArtistAndTitle}"

.field public static final textRTSwitch:Ljava/lang/String; = "{RTSwitch}"

.field public static final textResLoad:Ljava/lang/String; = "{ResLoad}"

.field public static final textStatFlush:Ljava/lang/String; = "{StatFlush}"

.field public static final textTimeCurrent:Ljava/lang/String; = "{TimeCurrent}"

.field public static final textTimeLength:Ljava/lang/String; = "{TimeLength}"

.field public static final textTimeRemaining:Ljava/lang/String; = "{TimeRemaining}"

.field public static final textTitle:Ljava/lang/String; = "{Title}"

.field public static final textWaitResLoad:Ljava/lang/String; = "{WaitResLoad}"

.field public static final totalTime:Ljava/lang/String; = "TotalTime"

.field public static final totalTimeAndBeat:Ljava/lang/String; = "TotalTimeAndBeat"

.field public static final totalTimeBackward:Ljava/lang/String; = "TotalTimeBackward"

.field public static final TotalTimeAndBack:Ljava/lang/String; = "TotalTimeAndBack"

.field public static final totalTimeWhenPlaying:Ljava/lang/String; = "TotalTimeWhenPlaying"

.field public static final trackPosition:Ljava/lang/String; = "TrackPosition"


# direct methods
.method static constructor <clinit>()V
    .locals 22

    const/16 v0, 0xf

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "Constant"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "Beat"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v4, "TotalTime"

    const/4 v5, 0x2

    aput-object v4, v0, v5

    const-string v6, "TotalTimeBackward"

    const/4 v7, 0x3

    aput-object v6, v0, v7

    const-string v8, "TotalTimeWhenPlaying"

    const/4 v9, 0x4

    aput-object v8, v0, v9

    const-string v10, "TotalTimeAndBeat"

    const/4 v11, 0x5

    aput-object v10, v0, v11

    const-string v12, "TrackPosition"

    const/4 v13, 0x6

    aput-object v12, v0, v13

    const-string v14, "BeatRandomShake"

    const/4 v15, 0x7

    aput-object v14, v0, v15

    const-string v16, "BeatCamShakeRotMore"

    const/16 v17, 0x8

    aput-object v16, v0, v17

    const-string v16, "BeatCamShakeRotLess"

    const/16 v18, 0x9

    aput-object v16, v0, v18

    const-string v16, "ConstantShakeRotMore"

    const/16 v19, 0xa

    aput-object v16, v0, v19

    const-string v16, "ConstantShakeRotLess"

    const/16 v20, 0xb

    aput-object v16, v0, v20

    const-string v16, "PeakBarIndex"

    const/16 v15, 0xc

    aput-object v16, v0, v15

    const/16 v16, 0xd

    const-string v21, "BeatTriggerAnim"

    aput-object v21, v0, v16

    # TotalTimeAndBack

    const/16 v16, 0xe

    const-string v21, "TotalTimeAndBack"

    aput-object v21, v0, v16


    .line 86
    sput-object v0, Lcom/daaw/avee/comp/Common/MeasureDefs;->measures1dMVar:[Ljava/lang/String;

    const/16 v15, 0xd

    new-array v0, v15, [Ljava/lang/String;

    const/16 v15, 0xc

    const-string v16, "Constant"

    aput-object v16, v0, v2

    aput-object v1, v0, v3

    aput-object v4, v0, v5

    aput-object v6, v0, v7

    aput-object v8, v0, v9

    aput-object v10, v0, v11

    aput-object v12, v0, v13

    const/16 v16, 0x7

    aput-object v14, v0, v16

    const-string v16, "BeatCamShakeMore"

    aput-object v16, v0, v17

    const-string v16, "BeatCamShakeLess"

    aput-object v16, v0, v18

    const-string v16, "ConstantShakeMore"

    aput-object v16, v0, v19

    const-string v16, "ConstantShake"

    aput-object v16, v0, v20

    const-string v16, "TotalTimeAndBack"

    aput-object v16, v0, v15


    .line 103
    sput-object v0, Lcom/daaw/avee/comp/Common/MeasureDefs;->measures2dMVar:[Ljava/lang/String;

    const/16 v0, 0xe

    new-array v0, v0, [Ljava/lang/String;

    const-string v16, "Nothing"

    aput-object v16, v0, v2

    aput-object v1, v0, v3

    aput-object v4, v0, v5

    aput-object v6, v0, v7

    aput-object v8, v0, v9

    aput-object v10, v0, v11

    aput-object v12, v0, v13

    const/16 v16, 0x7

    aput-object v14, v0, v16

    const-string v16, "BeatCamShakeRotMore"

    aput-object v16, v0, v17

    const-string v16, "BeatCamShakeRotLess"

    aput-object v16, v0, v18

    const-string v16, "ConstantShakeRotMore"

    aput-object v16, v0, v19

    const-string v16, "ConstantShakeRotLess"

    aput-object v16, v0, v20

    const-string v16, "BeatTriggerAnim"

    aput-object v16, v0, v15

    const/16 v15, 0xd

    const-string v16, "TotalTimeAndBack"

    aput-object v16, v0, v15

    const/16 v15, 0xc

    .line 118
    sput-object v0, Lcom/daaw/avee/comp/Common/MeasureDefs;->measures1d:[Ljava/lang/String;

    const/16 v0, 0x14

    new-array v0, v0, [Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    .line 134
    new-instance v15, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v13, "IsPlaying"

    const-string v11, ""

    const-string v9, ""

    invoke-direct {v15, v13, v11, v9}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aput-object v15, v0, v2

    new-instance v2, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v9, "Constant"

    const-string v11, "X"

    const-string v13, "Y"

    invoke-direct {v2, v9, v11, v13}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v3

    new-instance v2, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v9, "Nothing"

    const-string v11, "X"

    const-string v13, "Y"

    invoke-direct {v2, v9, v11, v13}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v5

    new-instance v2, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v5, "X Amount"

    const-string v9, "Y Amount"

    invoke-direct {v2, v1, v5, v9}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v7

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v2, "X Speed"

    const-string v5, "Y Speed"

    invoke-direct {v1, v4, v2, v5}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x4

    aput-object v1, v0, v2

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v2, "X Speed"

    const-string v4, "Y Speed"

    invoke-direct {v1, v6, v2, v4}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x5

    aput-object v1, v0, v2

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v2, "X Speed"

    const-string v4, "Y Speed"

    invoke-direct {v1, v8, v2, v4}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x6

    aput-object v1, v0, v2

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v2, "Speed"

    const-string v4, "Beat Amount"

    invoke-direct {v1, v10, v2, v4, v3}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/4 v4, 0x7

    aput-object v1, v0, v4

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v4, "Amount"

    invoke-direct {v1, v12, v4, v4}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v17

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    invoke-direct {v1, v14, v4, v2, v3}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    aput-object v1, v0, v18

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v5, "BeatCamShakeMore"

    invoke-direct {v1, v5, v4, v2, v3}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    aput-object v1, v0, v19

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v5, "BeatCamShakeLess"

    invoke-direct {v1, v5, v4, v2, v3}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    aput-object v1, v0, v20

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v5, "BeatCamShakeRotMore"

    invoke-direct {v1, v5, v4, v2, v3}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v5, 0xc

    aput-object v1, v0, v5

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v5, "BeatCamShakeRotLess"

    invoke-direct {v1, v5, v4, v2, v3}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v5, 0xd

    aput-object v1, v0, v5

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v5, "ConstantShake"

    invoke-direct {v1, v5, v4, v2, v3}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v5, 0xe

    aput-object v1, v0, v5

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v5, "ConstantShake"

    invoke-direct {v1, v5, v4, v2, v3}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v5, 0xf

    aput-object v1, v0, v5

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v5, "ConstantShakeRotMore"

    invoke-direct {v1, v5, v4, v2, v3}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v5, 0x10

    aput-object v1, v0, v5

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v5, "ConstantShakeRotLess"

    invoke-direct {v1, v5, v4, v2, v3}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v5, 0x11

    aput-object v1, v0, v5

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v5, "PeakBarIndex"

    const-string v6, "Smoothness"

    invoke-direct {v1, v5, v4, v6, v3}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v4, 0x12

    aput-object v1, v0, v4

    new-instance v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    const-string v4, "BeatTriggerAnim"

    const-string v5, "Threshold"

    invoke-direct {v1, v4, v5, v2, v3}, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sput-object v0, Lcom/daaw/avee/comp/Common/MeasureDefs;->measures:[Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getHintArgA(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 174
    invoke-static {p0}, Lcom/daaw/avee/comp/Common/MeasureDefs;->getMeasureDefByName(Ljava/lang/String;)Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 175
    iget-object p0, p0, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;->argAHint:Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getHintArgB(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 182
    invoke-static {p0}, Lcom/daaw/avee/comp/Common/MeasureDefs;->getMeasureDefByName(Ljava/lang/String;)Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 183
    iget-object p0, p0, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;->argBHint:Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getHintArgBisUsedFor1d(Ljava/lang/String;)Z
    .locals 0

    .line 190
    invoke-static {p0}, Lcom/daaw/avee/comp/Common/MeasureDefs;->getMeasureDefByName(Ljava/lang/String;)Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 191
    iget-boolean p0, p0, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;->isBUsedFor1d:Z

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static getMeasureDefByName(Ljava/lang/String;)Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;
    .locals 3

    const/4 v0, 0x0

    .line 163
    :goto_0
    sget-object v1, Lcom/daaw/avee/comp/Common/MeasureDefs;->measures:[Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 165
    aget-object v1, v1, v0

    iget-object v1, v1, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;->name:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 166
    sget-object p0, Lcom/daaw/avee/comp/Common/MeasureDefs;->measures:[Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    aget-object p0, p0, v0

    return-object p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
