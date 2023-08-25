.class public final Lcom/daaw/ta2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i42;


# instance fields
.field public final synthetic a:Lcom/daaw/ua2;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ua2;Lcom/daaw/sa2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ta2;->a:Lcom/daaw/ua2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(J)Lcom/daaw/g42;
    .locals 11

    iget-object v0, p0, Lcom/daaw/ta2;->a:Lcom/daaw/ua2;

    invoke-static {v0}, Lcom/daaw/ua2;->f(Lcom/daaw/ua2;)Lcom/daaw/gb2;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lcom/daaw/gb2;->f(J)J

    move-result-wide v1

    invoke-static {v0}, Lcom/daaw/ua2;->d(Lcom/daaw/ua2;)J

    move-result-wide v3

    invoke-static {v0}, Lcom/daaw/ua2;->c(Lcom/daaw/ua2;)J

    move-result-wide v5

    invoke-static {v0}, Lcom/daaw/ua2;->d(Lcom/daaw/ua2;)J

    move-result-wide v7

    invoke-static {v0}, Lcom/daaw/ua2;->e(Lcom/daaw/ua2;)J

    move-result-wide v9

    sub-long/2addr v5, v7

    mul-long v1, v1, v5

    div-long/2addr v1, v9

    invoke-static {v0}, Lcom/daaw/ua2;->d(Lcom/daaw/ua2;)J

    move-result-wide v7

    invoke-static {v0}, Lcom/daaw/ua2;->c(Lcom/daaw/ua2;)J

    move-result-wide v5

    add-long/2addr v3, v1

    const-wide/16 v0, -0x7530

    add-long/2addr v0, v3

    const-wide/16 v2, -0x1

    add-long v9, v5, v2

    move-wide v5, v0

    invoke-static/range {v5 .. v10}, Lcom/daaw/it5;->b0(JJJ)J

    move-result-wide v0

    new-instance v2, Lcom/daaw/g42;

    new-instance v3, Lcom/daaw/j42;

    invoke-direct {v3, p1, p2, v0, v1}, Lcom/daaw/j42;-><init>(JJ)V

    invoke-direct {v2, v3, v3}, Lcom/daaw/g42;-><init>(Lcom/daaw/j42;Lcom/daaw/j42;)V

    return-object v2
.end method

.method public final zze()J
    .locals 4

    iget-object v0, p0, Lcom/daaw/ta2;->a:Lcom/daaw/ua2;

    invoke-static {v0}, Lcom/daaw/ua2;->f(Lcom/daaw/ua2;)Lcom/daaw/gb2;

    move-result-object v1

    invoke-static {v0}, Lcom/daaw/ua2;->e(Lcom/daaw/ua2;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/daaw/gb2;->e(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzh()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
