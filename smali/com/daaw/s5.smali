.class public Lcom/daaw/s5;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "HorizontalLine"

    const-string v1, "Rectangle"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/daaw/s5;->a:[Ljava/lang/String;

    const-string v2, "None"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/s5;->b:[Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/daaw/pc0;)Lcom/daaw/pc0;
    .locals 2

    invoke-static {p1}, Lcom/daaw/s5;->b(Lcom/daaw/pc0;)Ljava/lang/String;

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
    const-string v1, "HorizontalLine"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x6

    goto :goto_0

    :sswitch_1
    const-string v1, "Rectangle3D"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x5

    goto :goto_0

    :sswitch_2
    const-string v1, "VerticalLine"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x4

    goto :goto_0

    :sswitch_3
    const-string v1, "None"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x3

    goto :goto_0

    :sswitch_4
    const-string v1, "Line"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_5
    const-string v1, "Rectangle"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_6
    const-string v1, "HorizontalLineRandom"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
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
    new-instance p0, Lcom/daaw/t5;

    invoke-direct {p0}, Lcom/daaw/t5;-><init>()V

    return-object p0

    :pswitch_1
    new-instance p0, Lcom/daaw/v5;

    invoke-direct {p0}, Lcom/daaw/v5;-><init>()V

    return-object p0

    :pswitch_2
    new-instance p0, Lcom/daaw/x5;

    invoke-direct {p0}, Lcom/daaw/x5;-><init>()V

    return-object p0

    :pswitch_3
    const/4 p0, 0x0

    return-object p0

    :pswitch_4
    new-instance p0, Lcom/daaw/x5;

    invoke-direct {p0}, Lcom/daaw/x5;-><init>()V

    return-object p0

    :pswitch_5
    new-instance p0, Lcom/daaw/w5;

    invoke-direct {p0}, Lcom/daaw/w5;-><init>()V

    return-object p0

    :pswitch_6
    new-instance p0, Lcom/daaw/u5;

    invoke-direct {p0}, Lcom/daaw/u5;-><init>()V

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

.method public static b(Lcom/daaw/pc0;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const-string p0, "None"

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/daaw/t5;

    if-eqz v0, :cond_1

    const-string p0, "HorizontalLine"

    return-object p0

    :cond_1
    instance-of v0, p0, Lcom/daaw/u5;

    if-eqz v0, :cond_2

    const-string p0, "HorizontalLineRandom"

    return-object p0

    :cond_2
    instance-of v0, p0, Lcom/daaw/x5;

    if-eqz v0, :cond_3

    const-string p0, "Line"

    return-object p0

    :cond_3
    instance-of v0, p0, Lcom/daaw/w5;

    if-eqz v0, :cond_4

    const-string p0, "Rectangle"

    return-object p0

    :cond_4
    instance-of p0, p0, Lcom/daaw/v5;

    if-eqz p0, :cond_5

    const-string p0, "Rectangle3D"

    return-object p0

    :cond_5
    const-string p0, "unknown instance type"

    invoke-static {p0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    const-string p0, "unk"

    return-object p0
.end method
