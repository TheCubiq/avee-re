.class public final Lcom/daaw/ad5;
.super Lcom/daaw/l75;
.source ""


# instance fields
.field public final synthetic t:Landroid/app/Activity;

.field public final synthetic u:Lcom/daaw/dj5;


# direct methods
.method public constructor <init>(Lcom/daaw/dj5;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ad5;->u:Lcom/daaw/dj5;

    iput-object p2, p0, Lcom/daaw/ad5;->t:Landroid/app/Activity;

    iget-object p1, p1, Lcom/daaw/dj5;->p:Lcom/daaw/gk5;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/daaw/l75;-><init>(Lcom/daaw/gk5;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ad5;->u:Lcom/daaw/dj5;

    iget-object v0, v0, Lcom/daaw/dj5;->p:Lcom/daaw/gk5;

    invoke-static {v0}, Lcom/daaw/gk5;->s(Lcom/daaw/gk5;)Lcom/daaw/ju3;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ju3;

    iget-object v1, p0, Lcom/daaw/ad5;->t:Landroid/app/Activity;

    invoke-static {v1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v1

    iget-wide v2, p0, Lcom/daaw/l75;->q:J

    invoke-interface {v0, v1, v2, v3}, Lcom/daaw/ju3;->onActivityResumed(Lcom/daaw/yd0;J)V

    return-void
.end method
