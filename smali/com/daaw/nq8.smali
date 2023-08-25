.class public final Lcom/daaw/nq8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mt8;


# instance fields
.field public final a:Lcom/daaw/mt8;

.field public b:Z

.field public final synthetic c:Lcom/daaw/oq8;


# direct methods
.method public constructor <init>(Lcom/daaw/oq8;Lcom/daaw/mt8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nq8;->c:Lcom/daaw/oq8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/nq8;->a:Lcom/daaw/mt8;

    return-void
.end method


# virtual methods
.method public final a(J)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/nq8;->c:Lcom/daaw/oq8;

    invoke-virtual {v0}, Lcom/daaw/oq8;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x3

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/nq8;->a:Lcom/daaw/mt8;

    invoke-interface {v0, p1, p2}, Lcom/daaw/mt8;->a(J)I

    move-result p1

    return p1
.end method

.method public final b(Lcom/daaw/a78;Lcom/daaw/ma7;I)I
    .locals 10

    iget-object v0, p0, Lcom/daaw/nq8;->c:Lcom/daaw/oq8;

    invoke-virtual {v0}, Lcom/daaw/oq8;->i()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/nq8;->b:Z

    const/4 v2, 0x4

    const/4 v3, -0x4

    if-eqz v0, :cond_1

    invoke-virtual {p2, v2}, Lcom/daaw/i37;->c(I)V

    return v3

    :cond_1
    iget-object v0, p0, Lcom/daaw/nq8;->a:Lcom/daaw/mt8;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/mt8;->b(Lcom/daaw/a78;Lcom/daaw/ma7;I)I

    move-result p3

    const/4 v0, -0x5

    const-wide/high16 v4, -0x8000000000000000L

    if-ne p3, v0, :cond_5

    iget-object p2, p1, Lcom/daaw/a78;->a:Lcom/daaw/f92;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget p3, p2, Lcom/daaw/f92;->B:I

    const/4 v1, 0x0

    if-nez p3, :cond_2

    iget p3, p2, Lcom/daaw/f92;->C:I

    if-eqz p3, :cond_4

    const/4 p3, 0x0

    :cond_2
    iget-object v2, p0, Lcom/daaw/nq8;->c:Lcom/daaw/oq8;

    iget-wide v2, v2, Lcom/daaw/oq8;->t:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_3

    goto :goto_0

    :cond_3
    iget v1, p2, Lcom/daaw/f92;->C:I

    :goto_0
    invoke-virtual {p2}, Lcom/daaw/f92;->b()Lcom/daaw/b72;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/daaw/b72;->c(I)Lcom/daaw/b72;

    invoke-virtual {p2, v1}, Lcom/daaw/b72;->d(I)Lcom/daaw/b72;

    invoke-virtual {p2}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object p2

    iput-object p2, p1, Lcom/daaw/a78;->a:Lcom/daaw/f92;

    :cond_4
    return v0

    :cond_5
    iget-object p1, p0, Lcom/daaw/nq8;->c:Lcom/daaw/oq8;

    iget-wide v6, p1, Lcom/daaw/oq8;->t:J

    cmp-long v0, v6, v4

    if-eqz v0, :cond_8

    if-ne p3, v3, :cond_6

    iget-wide v8, p2, Lcom/daaw/ma7;->e:J

    cmp-long v0, v8, v6

    if-gez v0, :cond_7

    :cond_6
    if-ne p3, v1, :cond_8

    invoke-virtual {p1}, Lcom/daaw/oq8;->zzb()J

    move-result-wide v0

    cmp-long p1, v0, v4

    if-nez p1, :cond_8

    iget-boolean p1, p2, Lcom/daaw/ma7;->d:Z

    if-nez p1, :cond_8

    :cond_7
    invoke-virtual {p2}, Lcom/daaw/i37;->b()V

    invoke-virtual {p2, v2}, Lcom/daaw/i37;->c(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/nq8;->b:Z

    return v3

    :cond_8
    return p3
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/nq8;->b:Z

    return-void
.end method

.method public final zzd()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/nq8;->a:Lcom/daaw/mt8;

    invoke-interface {v0}, Lcom/daaw/mt8;->zzd()V

    return-void
.end method

.method public final zze()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/nq8;->c:Lcom/daaw/oq8;

    invoke-virtual {v0}, Lcom/daaw/oq8;->i()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/nq8;->a:Lcom/daaw/mt8;

    invoke-interface {v0}, Lcom/daaw/mt8;->zze()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
