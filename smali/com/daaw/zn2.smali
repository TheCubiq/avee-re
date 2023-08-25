.class public final Lcom/daaw/zn2;
.super Lcom/daaw/no2;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/wm2;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hi2;II)V
    .locals 7

    const-string v2, "qfI1DhKUvYvonhmDhl2HtQbINO0xIIYvKgMRQgz52nQi898Sh8QDGcMkGv/U7x7x"

    const-string v3, "dGQnAya6a12xEk9RZqxizYv1KQcB0awlyegaC3HNbmw="

    const/16 v6, 0xc

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/daaw/no2;-><init>(Lcom/daaw/wm2;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hi2;II)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    const-wide/16 v1, -0x1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/hi2;->s(J)Lcom/daaw/hi2;

    iget-object v0, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    iget-object v1, p0, Lcom/daaw/no2;->f:Ljava/lang/reflect/Method;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/no2;->b:Lcom/daaw/wm2;

    invoke-virtual {v3}, Lcom/daaw/wm2;->b()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/hi2;->s(J)Lcom/daaw/hi2;

    return-void
.end method
