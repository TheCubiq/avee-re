.class public final Lcom/daaw/d52;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i42;


# instance fields
.field public final a:J

.field public final synthetic b:Lcom/daaw/g52;


# direct methods
.method public constructor <init>(Lcom/daaw/g52;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/d52;->b:Lcom/daaw/g52;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/daaw/d52;->a:J

    return-void
.end method


# virtual methods
.method public final b(J)Lcom/daaw/g42;
    .locals 8

    iget-object v0, p0, Lcom/daaw/d52;->b:Lcom/daaw/g52;

    invoke-static {v0}, Lcom/daaw/g52;->b(Lcom/daaw/g52;)[Lcom/daaw/j52;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2}, Lcom/daaw/j52;->a(J)Lcom/daaw/g42;

    move-result-object v0

    const/4 v1, 0x1

    :goto_0
    iget-object v2, p0, Lcom/daaw/d52;->b:Lcom/daaw/g52;

    invoke-static {v2}, Lcom/daaw/g52;->b(Lcom/daaw/g52;)[Lcom/daaw/j52;

    move-result-object v3

    array-length v3, v3

    if-ge v1, v3, :cond_1

    invoke-static {v2}, Lcom/daaw/g52;->b(Lcom/daaw/g52;)[Lcom/daaw/j52;

    move-result-object v2

    aget-object v2, v2, v1

    invoke-virtual {v2, p1, p2}, Lcom/daaw/j52;->a(J)Lcom/daaw/g42;

    move-result-object v2

    iget-object v3, v2, Lcom/daaw/g42;->a:Lcom/daaw/j42;

    iget-wide v3, v3, Lcom/daaw/j42;->b:J

    iget-object v5, v0, Lcom/daaw/g42;->a:Lcom/daaw/j42;

    iget-wide v5, v5, Lcom/daaw/j42;->b:J

    cmp-long v7, v3, v5

    if-gez v7, :cond_0

    move-object v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final zze()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/d52;->a:J

    return-wide v0
.end method

.method public final zzh()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
