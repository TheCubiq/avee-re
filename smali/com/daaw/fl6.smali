.class public final Lcom/daaw/fl6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:J

.field public final b:Lcom/daaw/el6;

.field public c:J

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/el6;

    invoke-direct {v0}, Lcom/daaw/el6;-><init>()V

    iput-object v0, p0, Lcom/daaw/fl6;->b:Lcom/daaw/el6;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/fl6;->d:I

    iput v0, p0, Lcom/daaw/fl6;->e:I

    iput v0, p0, Lcom/daaw/fl6;->f:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/fl6;->a:J

    iput-wide v0, p0, Lcom/daaw/fl6;->c:J

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/daaw/fl6;->d:I

    return v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/fl6;->a:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/fl6;->c:J

    return-wide v0
.end method

.method public final d()Lcom/daaw/el6;
    .locals 3

    iget-object v0, p0, Lcom/daaw/fl6;->b:Lcom/daaw/el6;

    invoke-virtual {v0}, Lcom/daaw/el6;->a()Lcom/daaw/el6;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/fl6;->b:Lcom/daaw/el6;

    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/daaw/el6;->p:Z

    iput v2, v1, Lcom/daaw/el6;->q:I

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Created: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/daaw/fl6;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " Last accessed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/daaw/fl6;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " Accesses: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/fl6;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\nEntries retrieved: Valid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/fl6;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Stale: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/fl6;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/fl6;->c:J

    iget v0, p0, Lcom/daaw/fl6;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/fl6;->d:I

    return-void
.end method

.method public final g()V
    .locals 2

    iget v0, p0, Lcom/daaw/fl6;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/fl6;->f:I

    iget-object v0, p0, Lcom/daaw/fl6;->b:Lcom/daaw/el6;

    iget v1, v0, Lcom/daaw/el6;->q:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/daaw/el6;->q:I

    return-void
.end method

.method public final h()V
    .locals 2

    iget v0, p0, Lcom/daaw/fl6;->e:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/fl6;->e:I

    iget-object v0, p0, Lcom/daaw/fl6;->b:Lcom/daaw/el6;

    iput-boolean v1, v0, Lcom/daaw/el6;->p:Z

    return-void
.end method
