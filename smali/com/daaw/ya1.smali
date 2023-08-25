.class public Lcom/daaw/ya1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-string v0, "None"

    const-string v1, "Bars"

    const-string v2, "Line"

    const-string v3, "SharpBars"

    const-string v4, "RoundBars"

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/ya1;->a:[Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/daaw/he0;)Lcom/daaw/he0;
    .locals 2

    invoke-static {p1}, Lcom/daaw/ya1;->b(Lcom/daaw/he0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    const/4 v0, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "RoundBars"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x4

    goto :goto_0

    :sswitch_1
    const-string v1, "SharpBars"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x3

    goto :goto_0

    :sswitch_2
    const-string v1, "None"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_3
    const-string v1, "Line"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_4
    const-string v1, "Bars"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown typeName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    return-object p1

    :pswitch_0
    new-instance p0, Lcom/daaw/ab1;

    invoke-direct {p0}, Lcom/daaw/ab1;-><init>()V

    return-object p0

    :pswitch_1
    new-instance p0, Lcom/daaw/bb1;

    invoke-direct {p0}, Lcom/daaw/bb1;-><init>()V

    return-object p0

    :pswitch_2
    const/4 p0, 0x0

    return-object p0

    :pswitch_3
    new-instance p0, Lcom/daaw/za1;

    invoke-direct {p0}, Lcom/daaw/za1;-><init>()V

    return-object p0

    :pswitch_4
    new-instance p0, Lcom/daaw/wa1;

    invoke-direct {p0}, Lcom/daaw/wa1;-><init>()V

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1f7ae0 -> :sswitch_4
        0x242414 -> :sswitch_3
        0x252358 -> :sswitch_2
        0x19b8e5aa -> :sswitch_1
        0x771cd54e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Lcom/daaw/he0;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const-string p0, "None"

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/daaw/wa1;

    if-eqz v0, :cond_1

    const-string p0, "Bars"

    return-object p0

    :cond_1
    instance-of v0, p0, Lcom/daaw/za1;

    if-eqz v0, :cond_2

    const-string p0, "Line"

    return-object p0

    :cond_2
    instance-of v0, p0, Lcom/daaw/bb1;

    if-eqz v0, :cond_3

    const-string p0, "SharpBars"

    return-object p0

    :cond_3
    instance-of p0, p0, Lcom/daaw/ab1;

    if-eqz p0, :cond_4

    const-string p0, "RoundBars"

    return-object p0

    :cond_4
    const-string p0, "unknown instance type"

    invoke-static {p0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    const-string p0, "unk"

    return-object p0
.end method
