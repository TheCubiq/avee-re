.class public Lcom/daaw/ol0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ol0;-><init>(Lcom/daaw/az0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ol0;


# direct methods
.method public constructor <init>(Lcom/daaw/ol0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ol0$c;->a:Lcom/daaw/ol0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 12

    sget-object v0, Lcom/daaw/nc0;->g:Lcom/daaw/vw1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ol0$c;->a:Lcom/daaw/ol0;

    invoke-static {v0}, Lcom/daaw/ol0;->c(Lcom/daaw/ol0;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/ol0$c;->a:Lcom/daaw/ol0;

    invoke-static {v0}, Lcom/daaw/ol0;->e(Lcom/daaw/ol0;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/daaw/ol0$c;->a:Lcom/daaw/ol0;

    invoke-static {v0}, Lcom/daaw/ol0;->g(Lcom/daaw/ol0;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/ol0$c;->a:Lcom/daaw/ol0;

    invoke-static {v0}, Lcom/daaw/ol0;->i(Lcom/daaw/ol0;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    invoke-static {}, Lcom/daaw/b5;->d()J

    move-result-wide v0

    invoke-static {}, Lcom/daaw/b5;->c()J

    move-result-wide v2

    const/4 v4, 0x0

    const-wide/16 v5, 0x1388

    const/4 v7, 0x1

    cmp-long v8, v2, v5

    if-lez v8, :cond_3

    const/4 v8, 0x1

    goto :goto_0

    :cond_3
    const/4 v8, 0x0

    :goto_0
    const-wide/32 v9, 0xea60

    cmp-long v11, v2, v9

    if-lez v11, :cond_4

    const/4 v4, 0x1

    :cond_4
    const/4 v9, -0x1

    if-eqz v8, :cond_5

    const-wide/16 v10, 0x2710

    cmp-long v8, v0, v10

    if-lez v8, :cond_5

    const-wide/16 v10, 0x4e20

    cmp-long v8, v0, v10

    if-gez v8, :cond_5

    iget-object v8, p0, Lcom/daaw/ol0$c;->a:Lcom/daaw/ol0;

    invoke-static {v8}, Lcom/daaw/ol0;->g(Lcom/daaw/ol0;)Z

    move-result v8

    if-nez v8, :cond_5

    iget-object v8, p0, Lcom/daaw/ol0$c;->a:Lcom/daaw/ol0;

    invoke-static {v8, v7}, Lcom/daaw/ol0;->h(Lcom/daaw/ol0;Z)Z

    iget-object v8, p0, Lcom/daaw/ol0$c;->a:Lcom/daaw/ol0;

    invoke-static {v8}, Lcom/daaw/ol0;->a(Lcom/daaw/ol0;)Ljava/lang/ref/WeakReference;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz v8, :cond_5

    invoke-virtual {v8, v7, v9}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->q(II)V

    :cond_5
    if-eqz v4, :cond_6

    const-wide/16 v10, 0x3a98

    sub-long v10, v2, v10

    cmp-long v4, v0, v10

    if-lez v4, :cond_6

    sub-long/2addr v2, v5

    cmp-long v4, v0, v2

    if-gez v4, :cond_6

    iget-object v0, p0, Lcom/daaw/ol0$c;->a:Lcom/daaw/ol0;

    invoke-static {v0}, Lcom/daaw/ol0;->i(Lcom/daaw/ol0;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/daaw/ol0$c;->a:Lcom/daaw/ol0;

    invoke-static {v0, v7}, Lcom/daaw/ol0;->j(Lcom/daaw/ol0;Z)Z

    iget-object v0, p0, Lcom/daaw/ol0$c;->a:Lcom/daaw/ol0;

    invoke-static {v0}, Lcom/daaw/ol0;->a(Lcom/daaw/ol0;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz v0, :cond_6

    invoke-virtual {v0, v7, v9}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->q(II)V

    :cond_6
    return-void
.end method
