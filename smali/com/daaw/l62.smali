.class public final Lcom/daaw/l62;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i42;


# instance fields
.field public final synthetic a:Lcom/daaw/i42;

.field public final synthetic b:Lcom/daaw/m62;


# direct methods
.method public constructor <init>(Lcom/daaw/m62;Lcom/daaw/i42;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/l62;->b:Lcom/daaw/m62;

    iput-object p2, p0, Lcom/daaw/l62;->a:Lcom/daaw/i42;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(J)Lcom/daaw/g42;
    .locals 8

    iget-object v0, p0, Lcom/daaw/l62;->a:Lcom/daaw/i42;

    invoke-interface {v0, p1, p2}, Lcom/daaw/i42;->b(J)Lcom/daaw/g42;

    move-result-object p1

    new-instance p2, Lcom/daaw/g42;

    new-instance v0, Lcom/daaw/j42;

    iget-object v1, p1, Lcom/daaw/g42;->a:Lcom/daaw/j42;

    iget-wide v2, v1, Lcom/daaw/j42;->a:J

    iget-wide v4, v1, Lcom/daaw/j42;->b:J

    iget-object v1, p0, Lcom/daaw/l62;->b:Lcom/daaw/m62;

    invoke-static {v1}, Lcom/daaw/m62;->a(Lcom/daaw/m62;)J

    move-result-wide v6

    add-long/2addr v4, v6

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/daaw/j42;-><init>(JJ)V

    new-instance v1, Lcom/daaw/j42;

    iget-object p1, p1, Lcom/daaw/g42;->b:Lcom/daaw/j42;

    iget-wide v2, p1, Lcom/daaw/j42;->a:J

    iget-wide v4, p1, Lcom/daaw/j42;->b:J

    iget-object p1, p0, Lcom/daaw/l62;->b:Lcom/daaw/m62;

    invoke-static {p1}, Lcom/daaw/m62;->a(Lcom/daaw/m62;)J

    move-result-wide v6

    add-long/2addr v4, v6

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/daaw/j42;-><init>(JJ)V

    invoke-direct {p2, v0, v1}, Lcom/daaw/g42;-><init>(Lcom/daaw/j42;Lcom/daaw/j42;)V

    return-object p2
.end method

.method public final zze()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/l62;->a:Lcom/daaw/i42;

    invoke-interface {v0}, Lcom/daaw/i42;->zze()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzh()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/l62;->a:Lcom/daaw/i42;

    invoke-interface {v0}, Lcom/daaw/i42;->zzh()Z

    move-result v0

    return v0
.end method
