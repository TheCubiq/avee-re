.class public final Lcom/daaw/aj6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/th6;

.field public final b:Lcom/daaw/wh6;

.field public final c:Lcom/daaw/cq5;

.field public final d:Lcom/daaw/op6;

.field public final e:Lcom/daaw/to6;


# direct methods
.method public constructor <init>(Lcom/daaw/cq5;Lcom/daaw/op6;Lcom/daaw/th6;Lcom/daaw/wh6;Lcom/daaw/to6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/daaw/aj6;->a:Lcom/daaw/th6;

    iput-object p4, p0, Lcom/daaw/aj6;->b:Lcom/daaw/wh6;

    iput-object p1, p0, Lcom/daaw/aj6;->c:Lcom/daaw/cq5;

    iput-object p2, p0, Lcom/daaw/aj6;->d:Lcom/daaw/op6;

    iput-object p5, p0, Lcom/daaw/aj6;->e:Lcom/daaw/to6;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 2

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lcom/daaw/aj6;->b(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;I)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/aj6;->a:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->k0:Z

    if-nez v0, :cond_0

    iget-object p2, p0, Lcom/daaw/aj6;->d:Lcom/daaw/op6;

    iget-object v0, p0, Lcom/daaw/aj6;->e:Lcom/daaw/to6;

    invoke-virtual {p2, p1, v0}, Lcom/daaw/op6;->c(Ljava/lang/String;Lcom/daaw/to6;)V

    return-void

    :cond_0
    new-instance v0, Lcom/daaw/eq5;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/ag;->a()J

    move-result-wide v2

    iget-object v1, p0, Lcom/daaw/aj6;->b:Lcom/daaw/wh6;

    iget-object v4, v1, Lcom/daaw/wh6;->b:Ljava/lang/String;

    move-object v1, v0

    move-object v5, p1

    move v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/daaw/eq5;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/daaw/aj6;->c:Lcom/daaw/cq5;

    invoke-virtual {p1, v0}, Lcom/daaw/cq5;->u(Lcom/daaw/eq5;)V

    return-void
.end method

.method public final c(Ljava/util/List;I)V
    .locals 1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0, p2}, Lcom/daaw/aj6;->b(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    return-void
.end method
