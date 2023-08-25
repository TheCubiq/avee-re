.class public Lcom/daaw/xv;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    const-string v0, "Root"

    const-string v1, "AppLogo"

    const-string v2, "Text"

    const-string v3, "Bars"

    const-string v4, "Particles"

    const-string v5, "Image"

    const-string v6, "AudioProvider"

    const-string v7, "BlurEffect"

    const-string v8, "RgbSplitEffect"

    const-string v9, "MotionBlurEffect"

    const-string v10, "MirrorEffect"

    filled-new-array/range {v0 .. v10}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/xv;->a:[Ljava/lang/String;

    const-string v1, "Composition"

    const-string v2, "Text"

    const-string v3, "Bars"

    const-string v4, "Particles"

    const-string v5, "Image"

    const-string v6, "AudioProvider"

    const-string v7, "BlurEffect"

    const-string v8, "RgbSplitEffect"

    const-string v9, "MotionBlurEffect"

    const-string v10, "MirrorEffect"

    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/xv;->b:[Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/tv;)Lcom/daaw/tv;
    .locals 1

    invoke-static {p2}, Lcom/daaw/xv;->b(Lcom/daaw/tv;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p2

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    const/4 p1, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "MotionBlurEffect"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 p1, 0xb

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "StatText"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 p1, 0xa

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "MirrorEffect"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 p1, 0x9

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "AppLogo"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 p1, 0x8

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "Particles"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 p1, 0x7

    goto :goto_0

    :sswitch_5
    const-string v0, "BlurEffect"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 p1, 0x6

    goto :goto_0

    :sswitch_6
    const-string v0, "Image"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const/4 p1, 0x5

    goto :goto_0

    :sswitch_7
    const-string v0, "RgbSplitEffect"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const/4 p1, 0x4

    goto :goto_0

    :sswitch_8
    const-string v0, "Text"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    const/4 p1, 0x3

    goto :goto_0

    :sswitch_9
    const-string v0, "None"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    const/4 p1, 0x2

    goto :goto_0

    :sswitch_a
    const-string v0, "Bars"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    const/4 p1, 0x1

    goto :goto_0

    :sswitch_b
    const-string v0, "AudioProvider"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "unknown typeName: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    return-object p2

    :pswitch_0
    new-instance p0, Lcom/daaw/pq0;

    invoke-direct {p0}, Lcom/daaw/pq0;-><init>()V

    return-object p0

    :pswitch_1
    return-object v0

    :pswitch_2
    new-instance p0, Lcom/daaw/iq0;

    invoke-direct {p0}, Lcom/daaw/iq0;-><init>()V

    return-object p0

    :pswitch_3
    new-instance p0, Lcom/daaw/pl0;

    invoke-direct {p0}, Lcom/daaw/pl0;-><init>()V

    return-object p0

    :pswitch_4
    new-instance p0, Lcom/daaw/yv0;

    invoke-direct {p0}, Lcom/daaw/yv0;-><init>()V

    return-object p0

    :pswitch_5
    new-instance p0, Lcom/daaw/kc;

    invoke-direct {p0}, Lcom/daaw/kc;-><init>()V

    return-object p0

    :pswitch_6
    new-instance p0, Lcom/daaw/ze0;

    invoke-direct {p0}, Lcom/daaw/ze0;-><init>()V

    return-object p0

    :pswitch_7
    new-instance p0, Lcom/daaw/v51;

    invoke-direct {p0}, Lcom/daaw/v51;-><init>()V

    return-object p0

    :pswitch_8
    new-instance p0, Lcom/daaw/ok1;

    invoke-direct {p0}, Lcom/daaw/ok1;-><init>()V

    return-object p0

    :pswitch_9
    return-object v0

    :pswitch_a
    new-instance p0, Lcom/daaw/na1;

    invoke-direct {p0}, Lcom/daaw/na1;-><init>()V

    return-object p0

    :pswitch_b
    new-instance p0, Lcom/daaw/i7;

    invoke-direct {p0}, Lcom/daaw/i7;-><init>()V

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x7e6b0039 -> :sswitch_b
        0x1f7ae0 -> :sswitch_a
        0x252358 -> :sswitch_9
        0x27b94d -> :sswitch_8
        0x423ae5e -> :sswitch_7
        0x437b93b -> :sswitch_6
        0xbc988f8 -> :sswitch_5
        0xc23828d -> :sswitch_4
        0x33e2534c -> :sswitch_3
        0x461e5a50 -> :sswitch_2
        0x5264d9c1 -> :sswitch_1
        0x5754e14e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method public static b(Lcom/daaw/tv;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const-string p0, "None"

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/daaw/f61;

    if-eqz v0, :cond_1

    const-string p0, "Root"

    return-object p0

    :cond_1
    instance-of v0, p0, Lcom/daaw/pl0;

    if-eqz v0, :cond_2

    const-string p0, "AppLogo"

    return-object p0

    :cond_2
    instance-of v0, p0, Lcom/daaw/i7;

    if-eqz v0, :cond_3

    const-string p0, "AudioProvider"

    return-object p0

    :cond_3
    instance-of v0, p0, Lcom/daaw/ok1;

    if-eqz v0, :cond_4

    const-string p0, "Text"

    return-object p0

    :cond_4
    instance-of v0, p0, Lcom/daaw/na1;

    if-eqz v0, :cond_5

    const-string p0, "Bars"

    return-object p0

    :cond_5
    instance-of v0, p0, Lcom/daaw/yv0;

    if-eqz v0, :cond_6

    const-string p0, "Particles"

    return-object p0

    :cond_6
    instance-of v0, p0, Lcom/daaw/ze0;

    if-eqz v0, :cond_7

    const-string p0, "Image"

    return-object p0

    :cond_7
    instance-of v0, p0, Lcom/daaw/v51;

    if-eqz v0, :cond_8

    const-string p0, "RgbSplitEffect"

    return-object p0

    :cond_8
    instance-of v0, p0, Lcom/daaw/pq0;

    if-eqz v0, :cond_9

    const-string p0, "MotionBlurEffect"

    return-object p0

    :cond_9
    instance-of p0, p0, Lcom/daaw/iq0;

    if-eqz p0, :cond_a

    const-string p0, "MirrorEffect"

    return-object p0

    :cond_a
    const-string p0, "unknown instance type"

    invoke-static {p0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    const-string p0, "unk"

    return-object p0
.end method
