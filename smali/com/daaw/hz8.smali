.class public final Lcom/daaw/hz8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i42;


# instance fields
.field public final a:Lcom/daaw/kz8;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J


# direct methods
.method public constructor <init>(Lcom/daaw/kz8;JJJJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hz8;->a:Lcom/daaw/kz8;

    iput-wide p2, p0, Lcom/daaw/hz8;->b:J

    iput-wide p6, p0, Lcom/daaw/hz8;->c:J

    iput-wide p8, p0, Lcom/daaw/hz8;->d:J

    iput-wide p10, p0, Lcom/daaw/hz8;->e:J

    iput-wide p12, p0, Lcom/daaw/hz8;->f:J

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/hz8;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/hz8;->f:J

    return-wide v0
.end method

.method public static bridge synthetic c(Lcom/daaw/hz8;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/hz8;->e:J

    return-wide v0
.end method

.method public static bridge synthetic d(Lcom/daaw/hz8;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/hz8;->c:J

    return-wide v0
.end method

.method public static bridge synthetic f(Lcom/daaw/hz8;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/hz8;->d:J

    return-wide v0
.end method


# virtual methods
.method public final b(J)Lcom/daaw/g42;
    .locals 13

    iget-object v0, p0, Lcom/daaw/hz8;->a:Lcom/daaw/kz8;

    invoke-interface {v0, p1, p2}, Lcom/daaw/kz8;->a(J)J

    move-result-wide v1

    iget-wide v5, p0, Lcom/daaw/hz8;->c:J

    iget-wide v7, p0, Lcom/daaw/hz8;->d:J

    iget-wide v9, p0, Lcom/daaw/hz8;->e:J

    iget-wide v11, p0, Lcom/daaw/hz8;->f:J

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v12}, Lcom/daaw/jz8;->f(JJJJJJ)J

    move-result-wide v0

    new-instance v2, Lcom/daaw/g42;

    new-instance v3, Lcom/daaw/j42;

    invoke-direct {v3, p1, p2, v0, v1}, Lcom/daaw/j42;-><init>(JJ)V

    invoke-direct {v2, v3, v3}, Lcom/daaw/g42;-><init>(Lcom/daaw/j42;Lcom/daaw/j42;)V

    return-object v2
.end method

.method public final g(J)J
    .locals 1

    iget-object v0, p0, Lcom/daaw/hz8;->a:Lcom/daaw/kz8;

    invoke-interface {v0, p1, p2}, Lcom/daaw/kz8;->a(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final zze()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/hz8;->b:J

    return-wide v0
.end method

.method public final zzh()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
