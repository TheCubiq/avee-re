.class public final Lcom/daaw/cs8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mt8;


# instance fields
.field public final a:Lcom/daaw/mt8;

.field public final b:J


# direct methods
.method public constructor <init>(Lcom/daaw/mt8;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cs8;->a:Lcom/daaw/mt8;

    iput-wide p2, p0, Lcom/daaw/cs8;->b:J

    return-void
.end method


# virtual methods
.method public final a(J)I
    .locals 3

    iget-object v0, p0, Lcom/daaw/cs8;->a:Lcom/daaw/mt8;

    iget-wide v1, p0, Lcom/daaw/cs8;->b:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lcom/daaw/mt8;->a(J)I

    move-result p1

    return p1
.end method

.method public final b(Lcom/daaw/a78;Lcom/daaw/ma7;I)I
    .locals 6

    iget-object v0, p0, Lcom/daaw/cs8;->a:Lcom/daaw/mt8;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/mt8;->b(Lcom/daaw/a78;Lcom/daaw/ma7;I)I

    move-result p1

    const/4 p3, -0x4

    if-ne p1, p3, :cond_0

    const-wide/16 v0, 0x0

    iget-wide v2, p2, Lcom/daaw/ma7;->e:J

    iget-wide v4, p0, Lcom/daaw/cs8;->b:J

    add-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p2, Lcom/daaw/ma7;->e:J

    return p3

    :cond_0
    return p1
.end method

.method public final c()Lcom/daaw/mt8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/cs8;->a:Lcom/daaw/mt8;

    return-object v0
.end method

.method public final zzd()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/cs8;->a:Lcom/daaw/mt8;

    invoke-interface {v0}, Lcom/daaw/mt8;->zzd()V

    return-void
.end method

.method public final zze()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/cs8;->a:Lcom/daaw/mt8;

    invoke-interface {v0}, Lcom/daaw/mt8;->zze()Z

    move-result v0

    return v0
.end method
