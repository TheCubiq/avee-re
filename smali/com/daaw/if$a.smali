.class public final Lcom/daaw/if$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/d81;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/if;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final p:Lcom/daaw/if;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/if<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final q:Lcom/daaw/b81;

.field public final r:I

.field public s:Z

.field public final synthetic t:Lcom/daaw/if;


# direct methods
.method public constructor <init>(Lcom/daaw/if;Lcom/daaw/if;Lcom/daaw/b81;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/if<",
            "TT;>;",
            "Lcom/daaw/b81;",
            "I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/if$a;->t:Lcom/daaw/if;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/if$a;->p:Lcom/daaw/if;

    iput-object p3, p0, Lcom/daaw/if$a;->q:Lcom/daaw/b81;

    iput p4, p0, Lcom/daaw/if$a;->r:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 8

    iget-boolean v0, p0, Lcom/daaw/if$a;->s:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/if$a;->t:Lcom/daaw/if;

    invoke-static {v0}, Lcom/daaw/if;->y(Lcom/daaw/if;)Lcom/daaw/cp0$a;

    move-result-object v1

    iget-object v0, p0, Lcom/daaw/if$a;->t:Lcom/daaw/if;

    invoke-static {v0}, Lcom/daaw/if;->v(Lcom/daaw/if;)[I

    move-result-object v0

    iget v2, p0, Lcom/daaw/if$a;->r:I

    aget v2, v0, v2

    iget-object v0, p0, Lcom/daaw/if$a;->t:Lcom/daaw/if;

    invoke-static {v0}, Lcom/daaw/if;->w(Lcom/daaw/if;)[Lcom/google/android/exoplayer2/Format;

    move-result-object v0

    iget v3, p0, Lcom/daaw/if$a;->r:I

    aget-object v3, v0, v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/daaw/if$a;->t:Lcom/daaw/if;

    invoke-static {v0}, Lcom/daaw/if;->x(Lcom/daaw/if;)J

    move-result-wide v6

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/cp0$a;->c(ILcom/google/android/exoplayer2/Format;ILjava/lang/Object;J)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/if$a;->s:Z

    :cond_0
    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/if$a;->t:Lcom/daaw/if;

    invoke-static {v0}, Lcom/daaw/if;->u(Lcom/daaw/if;)[Z

    move-result-object v0

    iget v1, p0, Lcom/daaw/if$a;->r:I

    aget-boolean v0, v0, v1

    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-object v0, p0, Lcom/daaw/if$a;->t:Lcom/daaw/if;

    invoke-static {v0}, Lcom/daaw/if;->u(Lcom/daaw/if;)[Z

    move-result-object v0

    iget v1, p0, Lcom/daaw/if$a;->r:I

    const/4 v2, 0x0

    aput-boolean v2, v0, v1

    return-void
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/if$a;->t:Lcom/daaw/if;

    iget-boolean v1, v0, Lcom/daaw/if;->J:Z

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/daaw/if;->F()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/if$a;->q:Lcom/daaw/b81;

    invoke-virtual {v0}, Lcom/daaw/b81;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public j(Lcom/daaw/k30;Lcom/daaw/gq;Z)I
    .locals 7

    iget-object v0, p0, Lcom/daaw/if$a;->t:Lcom/daaw/if;

    invoke-virtual {v0}, Lcom/daaw/if;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x3

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/if$a;->q:Lcom/daaw/b81;

    iget-object v1, p0, Lcom/daaw/if$a;->t:Lcom/daaw/if;

    iget-boolean v4, v1, Lcom/daaw/if;->J:Z

    iget-wide v5, v1, Lcom/daaw/if;->I:J

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/b81;->y(Lcom/daaw/k30;Lcom/daaw/gq;ZZJ)I

    move-result p1

    const/4 p2, -0x4

    if-ne p1, p2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/if$a;->b()V

    :cond_1
    return p1
.end method

.method public n(J)I
    .locals 3

    iget-object v0, p0, Lcom/daaw/if$a;->t:Lcom/daaw/if;

    iget-boolean v0, v0, Lcom/daaw/if;->J:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/if$a;->q:Lcom/daaw/b81;

    invoke-virtual {v0}, Lcom/daaw/b81;->q()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    iget-object p1, p0, Lcom/daaw/if$a;->q:Lcom/daaw/b81;

    invoke-virtual {p1}, Lcom/daaw/b81;->g()I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/if$a;->q:Lcom/daaw/b81;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1, v1}, Lcom/daaw/b81;->f(JZZ)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    const/4 p1, 0x0

    :cond_1
    :goto_0
    if-lez p1, :cond_2

    invoke-virtual {p0}, Lcom/daaw/if$a;->b()V

    :cond_2
    return p1
.end method
