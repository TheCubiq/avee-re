.class public final Lcom/daaw/g68;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/tc8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/tc8;Lcom/daaw/z28;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/g68;->p:Lcom/daaw/tc8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/g68;->p:Lcom/daaw/tc8;

    invoke-virtual {v0}, Lcom/daaw/tc8;->b()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-static {}, Lcom/daaw/mq;->d()Lcom/daaw/ag;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/ag;->a()J

    move-result-wide v2

    cmp-long v4, v2, v0

    if-lez v4, :cond_0

    iget-object v0, p0, Lcom/daaw/g68;->p:Lcom/daaw/tc8;

    invoke-static {v0}, Lcom/daaw/tc8;->c(Lcom/daaw/tc8;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/tc8;->f(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
