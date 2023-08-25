.class public Lcom/daaw/ma1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "Waveform"

    const-string v1, "Spectrum"

    const-string v2, "Spectrum2"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/ma1;->a:[Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/daaw/fe0;)Lcom/daaw/fe0;
    .locals 3

    const-string v0, "None"

    invoke-static {p1, v0}, Lcom/daaw/ma1;->b(Lcom/daaw/fe0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    const/4 v1, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "Waveform"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "Spectrum2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "Spectrum"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown typeName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    if-nez p1, :cond_5

    new-instance p0, Lcom/daaw/ha1;

    invoke-direct {p0}, Lcom/daaw/ha1;-><init>()V

    return-object p0

    :cond_5
    return-object p1

    :pswitch_0
    new-instance p0, Lcom/daaw/ja1;

    invoke-direct {p0}, Lcom/daaw/ja1;-><init>()V

    return-object p0

    :pswitch_1
    new-instance p0, Lcom/daaw/ha1;

    invoke-direct {p0}, Lcom/daaw/ha1;-><init>()V

    return-object p0

    :pswitch_2
    const/4 p0, 0x0

    return-object p0

    :pswitch_3
    new-instance p0, Lcom/daaw/ga1;

    invoke-direct {p0}, Lcom/daaw/ga1;-><init>()V

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x7b41840f -> :sswitch_3
        0x252358 -> :sswitch_2
        0x13110261 -> :sswitch_1
        0x27dddf5d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Lcom/daaw/fe0;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    instance-of v0, p0, Lcom/daaw/ja1;

    if-eqz v0, :cond_1

    const-string p0, "Waveform"

    return-object p0

    :cond_1
    instance-of v0, p0, Lcom/daaw/ga1;

    if-eqz v0, :cond_2

    const-string p0, "Spectrum"

    return-object p0

    :cond_2
    instance-of p0, p0, Lcom/daaw/ha1;

    if-eqz p0, :cond_3

    const-string p0, "Spectrum2"

    return-object p0

    :cond_3
    const-string p0, "unknown instance type"

    invoke-static {p0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    return-object p1
.end method
