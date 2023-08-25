.class public final Lcom/daaw/va2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/bb2;


# instance fields
.field public final a:Lcom/daaw/w09;

.field public final b:Lcom/daaw/v09;

.field public c:J

.field public d:J


# direct methods
.method public constructor <init>(Lcom/daaw/w09;Lcom/daaw/v09;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/va2;->a:Lcom/daaw/w09;

    iput-object p2, p0, Lcom/daaw/va2;->b:Lcom/daaw/v09;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lcom/daaw/va2;->c:J

    iput-wide p1, p0, Lcom/daaw/va2;->d:J

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/k09;)J
    .locals 6

    iget-wide v0, p0, Lcom/daaw/va2;->d:J

    const-wide/16 v2, -0x1

    const-wide/16 v4, 0x0

    cmp-long p1, v0, v4

    if-ltz p1, :cond_0

    iput-wide v2, p0, Lcom/daaw/va2;->d:J

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    neg-long v0, v0

    return-wide v0

    :cond_0
    return-wide v2
.end method

.method public final b(J)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/va2;->b:Lcom/daaw/v09;

    iget-object v0, v0, Lcom/daaw/v09;->a:[J

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1, v1}, Lcom/daaw/it5;->N([JJZZ)I

    move-result p1

    aget-wide p1, v0, p1

    iput-wide p1, p0, Lcom/daaw/va2;->d:J

    return-void
.end method

.method public final c(J)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/va2;->c:J

    return-void
.end method

.method public final zze()Lcom/daaw/i42;
    .locals 5

    iget-wide v0, p0, Lcom/daaw/va2;->c:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    new-instance v0, Lcom/daaw/u09;

    iget-object v1, p0, Lcom/daaw/va2;->a:Lcom/daaw/w09;

    iget-wide v2, p0, Lcom/daaw/va2;->c:J

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/u09;-><init>(Lcom/daaw/w09;J)V

    return-object v0
.end method
