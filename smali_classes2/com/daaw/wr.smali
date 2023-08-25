.class public Lcom/daaw/wr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/yb1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lcom/daaw/mn;)Lcom/daaw/tb1;
    .locals 14

    new-instance v3, Lcom/daaw/tb1$b;

    const/16 v0, 0x8

    const/4 v1, 0x4

    invoke-direct {v3, v0, v1}, Lcom/daaw/tb1$b;-><init>(II)V

    new-instance v4, Lcom/daaw/tb1$a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {v4, v0, v1}, Lcom/daaw/tb1$a;-><init>(ZZ)V

    invoke-interface {p0}, Lcom/daaw/mn;->a()J

    move-result-wide v0

    const p0, 0x36ee80

    int-to-long v5, p0

    add-long/2addr v5, v0

    new-instance p0, Lcom/daaw/tb1;

    const/4 v7, 0x0

    const/16 v8, 0xe10

    const-wide/high16 v9, 0x4024000000000000L    # 10.0

    const-wide v11, 0x3ff3333333333333L    # 1.2

    const/16 v13, 0x3c

    move-object v0, p0

    move-wide v1, v5

    move v5, v7

    move v6, v8

    move-wide v7, v9

    move-wide v9, v11

    move v11, v13

    invoke-direct/range {v0 .. v11}, Lcom/daaw/tb1;-><init>(JLcom/daaw/tb1$b;Lcom/daaw/tb1$a;IIDDI)V

    return-object p0
.end method


# virtual methods
.method public a(Lcom/daaw/mn;Lorg/json/JSONObject;)Lcom/daaw/tb1;
    .locals 0

    invoke-static {p1}, Lcom/daaw/wr;->b(Lcom/daaw/mn;)Lcom/daaw/tb1;

    move-result-object p1

    return-object p1
.end method
