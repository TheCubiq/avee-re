.class public Lcom/daaw/pa1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;

.field public static final c:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-string v0, "HorizontalLine"

    const-string v1, "Circle"

    const-string v2, "SidedPolygon"

    const-string v3, "Letter"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v4

    sput-object v4, Lcom/daaw/pa1;->a:[Ljava/lang/String;

    const-string v4, "Year"

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/pa1;->b:[Ljava/lang/String;

    const-string v0, "None"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/pa1;->c:[Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/daaw/ge0;)Lcom/daaw/ge0;
    .locals 2

    invoke-static {p1}, Lcom/daaw/pa1;->b(Lcom/daaw/ge0;)Ljava/lang/String;

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
    const-string v1, "Circle"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x5

    goto :goto_0

    :sswitch_1
    const-string v1, "HorizontalLine"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x4

    goto :goto_0

    :sswitch_2
    const-string v1, "SidedPolygon"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x3

    goto :goto_0

    :sswitch_3
    const-string v1, "Year"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_4
    const-string v1, "None"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_5
    const-string v1, "Letter"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
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
    new-instance p0, Lcom/daaw/oa1;

    invoke-direct {p0}, Lcom/daaw/oa1;-><init>()V

    return-object p0

    :pswitch_1
    new-instance p0, Lcom/daaw/ra1;

    invoke-direct {p0}, Lcom/daaw/ra1;-><init>()V

    return-object p0

    :pswitch_2
    new-instance p0, Lcom/daaw/ta1;

    invoke-direct {p0}, Lcom/daaw/ta1;-><init>()V

    return-object p0

    :pswitch_3
    new-instance p0, Lcom/daaw/va1;

    invoke-direct {p0}, Lcom/daaw/va1;-><init>()V

    return-object p0

    :pswitch_4
    const/4 p0, 0x0

    return-object p0

    :pswitch_5
    new-instance p0, Lcom/daaw/sa1;

    invoke-direct {p0}, Lcom/daaw/sa1;-><init>()V

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x7889efba -> :sswitch_5
        0x252358 -> :sswitch_4
        0x29fc5d -> :sswitch_3
        0x5b925ead -> :sswitch_2
        0x6b75ca58 -> :sswitch_1
        0x7851a8f0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Lcom/daaw/ge0;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const-string p0, "None"

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/daaw/ra1;

    if-eqz v0, :cond_1

    const-string p0, "HorizontalLine"

    return-object p0

    :cond_1
    instance-of v0, p0, Lcom/daaw/oa1;

    if-eqz v0, :cond_2

    const-string p0, "Circle"

    return-object p0

    :cond_2
    instance-of v0, p0, Lcom/daaw/ta1;

    if-eqz v0, :cond_3

    const-string p0, "SidedPolygon"

    return-object p0

    :cond_3
    instance-of v0, p0, Lcom/daaw/sa1;

    if-eqz v0, :cond_4

    const-string p0, "Letter"

    return-object p0

    :cond_4
    instance-of p0, p0, Lcom/daaw/va1;

    if-eqz p0, :cond_5

    const-string p0, "Year"

    return-object p0

    :cond_5
    const-string p0, "unknown instance type"

    invoke-static {p0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    const-string p0, "unk"

    return-object p0
.end method
