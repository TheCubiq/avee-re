.class public Lcom/daaw/wn0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/wn0$a;
    }
.end annotation


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;

.field public static final c:[Ljava/lang/String;

.field public static final d:[Lcom/daaw/wn0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    const-string v0, "Constant"

    const-string v1, "Beat"

    const-string v2, "TotalTime"

    const-string v3, "TotalTimeBackward"

    const-string v4, "TotalTimeWhenPlaying"

    const-string v5, "TotalTimeAndBeat"

    const-string v6, "TrackPosition"

    const-string v7, "BeatRandomShake"

    const-string v8, "BeatCamShakeRotMore"

    const-string v9, "BeatCamShakeRotLess"

    const-string v10, "ConstantShakeRotMore"

    const-string v11, "ConstantShakeRotLess"

    const-string v12, "PeakBarIndex"

    const-string v13, "BeatTriggerAnim"

    filled-new-array/range {v0 .. v13}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/wn0;->a:[Ljava/lang/String;

    const-string v1, "Constant"

    const-string v2, "Beat"

    const-string v3, "TotalTime"

    const-string v4, "TotalTimeBackward"

    const-string v5, "TotalTimeWhenPlaying"

    const-string v6, "TotalTimeAndBeat"

    const-string v7, "TrackPosition"

    const-string v8, "BeatRandomShake"

    const-string v9, "BeatCamShakeMore"

    const-string v10, "BeatCamShakeLess"

    const-string v11, "ConstantShakeMore"

    const-string v12, "ConstantShake"

    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/wn0;->b:[Ljava/lang/String;

    const-string v1, "Nothing"

    const-string v2, "Beat"

    const-string v3, "TotalTime"

    const-string v4, "TotalTimeBackward"

    const-string v5, "TotalTimeWhenPlaying"

    const-string v6, "TotalTimeAndBeat"

    const-string v7, "TrackPosition"

    const-string v8, "BeatRandomShake"

    const-string v9, "BeatCamShakeRotMore"

    const-string v10, "BeatCamShakeRotLess"

    const-string v11, "ConstantShakeRotMore"

    const-string v12, "ConstantShakeRotLess"

    const-string v13, "BeatTriggerAnim"

    filled-new-array/range {v1 .. v13}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/wn0;->c:[Ljava/lang/String;

    const/16 v0, 0x14

    new-array v0, v0, [Lcom/daaw/wn0$a;

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v2, "IsPlaying"

    const-string v3, ""

    invoke-direct {v1, v2, v3, v3}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v2, "Constant"

    const-string v3, "X"

    const-string v4, "Y"

    invoke-direct {v1, v2, v3, v4}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v5, "Nothing"

    invoke-direct {v1, v5, v3, v4}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x2

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "Beat"

    const-string v4, "X Amount"

    const-string v5, "Y Amount"

    invoke-direct {v1, v3, v4, v5}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x3

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "TotalTime"

    const-string v4, "X Speed"

    const-string v5, "Y Speed"

    invoke-direct {v1, v3, v4, v5}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x4

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "TotalTimeBackward"

    invoke-direct {v1, v3, v4, v5}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x5

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "TotalTimeWhenPlaying"

    invoke-direct {v1, v3, v4, v5}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x6

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "TotalTimeAndBeat"

    const-string v4, "Speed"

    const-string v5, "Beat Amount"

    invoke-direct {v1, v3, v4, v5, v2}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/4 v3, 0x7

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "TrackPosition"

    const-string v5, "Amount"

    invoke-direct {v1, v3, v5, v5}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x8

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "BeatRandomShake"

    invoke-direct {v1, v3, v5, v4, v2}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v3, 0x9

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "BeatCamShakeMore"

    invoke-direct {v1, v3, v5, v4, v2}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v3, 0xa

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "BeatCamShakeLess"

    invoke-direct {v1, v3, v5, v4, v2}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v3, 0xb

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "BeatCamShakeRotMore"

    invoke-direct {v1, v3, v5, v4, v2}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v3, 0xc

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "BeatCamShakeRotLess"

    invoke-direct {v1, v3, v5, v4, v2}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v3, 0xd

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "ConstantShake"

    invoke-direct {v1, v3, v5, v4, v2}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v6, 0xe

    aput-object v1, v0, v6

    new-instance v1, Lcom/daaw/wn0$a;

    invoke-direct {v1, v3, v5, v4, v2}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v3, 0xf

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "ConstantShakeRotMore"

    invoke-direct {v1, v3, v5, v4, v2}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v3, 0x10

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "ConstantShakeRotLess"

    invoke-direct {v1, v3, v5, v4, v2}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v3, 0x11

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "PeakBarIndex"

    const-string v6, "Smoothness"

    invoke-direct {v1, v3, v5, v6, v2}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v3, 0x12

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/wn0$a;

    const-string v3, "BeatTriggerAnim"

    const-string v5, "Threshold"

    invoke-direct {v1, v3, v5, v4, v2}, Lcom/daaw/wn0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sput-object v0, Lcom/daaw/wn0;->d:[Lcom/daaw/wn0$a;

    return-void
.end method

.method public static a(Ljava/lang/String;)I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    :goto_0
    const/4 p0, -0x1

    goto/16 :goto_1

    :sswitch_0
    const-string v0, "BeatTriggerAnim"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/16 p0, 0x12

    goto/16 :goto_1

    :sswitch_1
    const-string v0, "BeatRandomShake"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/16 p0, 0x11

    goto/16 :goto_1

    :sswitch_2
    const-string v0, "TotalTime"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/16 p0, 0x10

    goto/16 :goto_1

    :sswitch_3
    const-string v0, "TotalTimeAndBeat"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/16 p0, 0xf

    goto/16 :goto_1

    :sswitch_4
    const-string v0, "PeakBarIndex"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/16 p0, 0xe

    goto/16 :goto_1

    :sswitch_5
    const-string v0, "IsPlaying"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/16 p0, 0xd

    goto/16 :goto_1

    :sswitch_6
    const-string v0, "BeatCamShakeRotMore"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/16 p0, 0xc

    goto/16 :goto_1

    :sswitch_7
    const-string v0, "BeatCamShakeRotLess"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    const/16 p0, 0xb

    goto/16 :goto_1

    :sswitch_8
    const-string v0, "ConstantShakeRotMore"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    const/16 p0, 0xa

    goto/16 :goto_1

    :sswitch_9
    const-string v0, "ConstantShakeRotLess"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 p0, 0x9

    goto/16 :goto_1

    :sswitch_a
    const-string v0, "Beat"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 p0, 0x8

    goto/16 :goto_1

    :sswitch_b
    const-string v0, "TotalTimeWhenPlaying"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/4 p0, 0x7

    goto :goto_1

    :sswitch_c
    const-string v0, "Constant"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/4 p0, 0x6

    goto :goto_1

    :sswitch_d
    const-string v0, "TotalTimeBackward"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/4 p0, 0x5

    goto :goto_1

    :sswitch_e
    const-string v0, "BeatCamShakeMore"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/4 p0, 0x4

    goto :goto_1

    :sswitch_f
    const-string v0, "BeatCamShakeLess"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/4 p0, 0x3

    goto :goto_1

    :sswitch_10
    const-string v0, "TrackPosition"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/4 p0, 0x2

    goto :goto_1

    :sswitch_11
    const-string v0, "ConstantShakeMore"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/4 p0, 0x1

    goto :goto_1

    :sswitch_12
    const-string v0, "ConstantShake"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_12

    goto/16 :goto_0

    :cond_12
    const/4 p0, 0x0

    :goto_1
    packed-switch p0, :pswitch_data_0

    return v1

    :pswitch_0
    const p0, 0x7f100061

    return p0

    :pswitch_1
    const p0, 0x7f10005b

    return p0

    :pswitch_2
    const p0, 0x7f1002bb

    return p0

    :pswitch_3
    const p0, 0x7f1002bc

    return p0

    :pswitch_4
    const p0, 0x7f1001e1

    return p0

    :pswitch_5
    const p0, 0x7f10012f

    return p0

    :pswitch_6
    const p0, 0x7f10005a

    return p0

    :pswitch_7
    const p0, 0x7f100059

    return p0

    :pswitch_8
    const p0, 0x7f100095

    return p0

    :pswitch_9
    const p0, 0x7f100094

    return p0

    :pswitch_a
    const p0, 0x7f100056

    return p0

    :pswitch_b
    const p0, 0x7f1002be

    return p0

    :pswitch_c
    const p0, 0x7f100091

    return p0

    :pswitch_d
    const p0, 0x7f1002bd

    return p0

    :pswitch_e
    const p0, 0x7f100058

    return p0

    :pswitch_f
    const p0, 0x7f100057

    return p0

    :pswitch_10
    const p0, 0x7f1002bf

    return p0

    :pswitch_11
    const p0, 0x7f100093

    return p0

    :pswitch_12
    const p0, 0x7f100092

    return p0

    :sswitch_data_0
    .sparse-switch
        -0x7575ae5e -> :sswitch_12
        -0x4bf69fe9 -> :sswitch_11
        -0x43d05c8c -> :sswitch_10
        -0x3dcfca5a -> :sswitch_f
        -0x3dcf309e -> :sswitch_e
        -0x3195f0ec -> :sswitch_d
        -0x1dfdb83c -> :sswitch_c
        -0x1010553d -> :sswitch_b
        0x1f87d6 -> :sswitch_a
        0x1796980e -> :sswitch_9
        0x179731ca -> :sswitch_8
        0x36a6e0e3 -> :sswitch_7
        0x36a77a9f -> :sswitch_6
        0x37783784 -> :sswitch_5
        0x48372a9e -> :sswitch_4
        0x4b0550dc -> :sswitch_3
        0x55098011 -> :sswitch_2
        0x5c3efa4d -> :sswitch_1
        0x5e00ee33 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/daaw/wn0;->e(Ljava/lang/String;)Lcom/daaw/wn0$a;

    move-result-object p0

    if-eqz p0, :cond_0

    iget-object p0, p0, Lcom/daaw/wn0$a;->b:Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/daaw/wn0;->e(Ljava/lang/String;)Lcom/daaw/wn0$a;

    move-result-object p0

    if-eqz p0, :cond_0

    iget-object p0, p0, Lcom/daaw/wn0$a;->c:Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0}, Lcom/daaw/wn0;->e(Ljava/lang/String;)Lcom/daaw/wn0$a;

    move-result-object p0

    if-eqz p0, :cond_0

    iget-boolean p0, p0, Lcom/daaw/wn0$a;->d:Z

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static e(Ljava/lang/String;)Lcom/daaw/wn0$a;
    .locals 3

    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/daaw/wn0;->d:[Lcom/daaw/wn0$a;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v2, v1, v0

    iget-object v2, v2, Lcom/daaw/wn0$a;->a:Ljava/lang/String;

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    aget-object p0, v1, v0

    return-object p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
