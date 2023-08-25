.class public Lcom/daaw/avee/comp/playback/d$b;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/playback/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/d;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/d$b;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 13

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$b;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/playback/d;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->a(Lcom/daaw/avee/comp/playback/d;)J

    move-result-wide v1

    long-to-float v1, v1

    const v2, 0x3a83126f    # 0.001f

    mul-float v1, v1, v2

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->b(Lcom/daaw/avee/comp/playback/d;)J

    move-result-wide v3

    const-wide/16 v5, 0xa

    add-long/2addr v3, v5

    long-to-float v3, v3

    mul-float v3, v3, v2

    div-float/2addr v3, v1

    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    const/4 v2, 0x5

    const/4 v4, 0x4

    const/4 v7, 0x1

    const/4 v8, 0x0

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_8

    :pswitch_0
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->d(Lcom/daaw/avee/comp/playback/d;)V

    goto/16 :goto_8

    :pswitch_1
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->o(Lcom/daaw/avee/comp/playback/d;)V

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->c(Lcom/daaw/avee/comp/playback/d;)V

    goto/16 :goto_8

    :pswitch_2
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->n(Lcom/daaw/avee/comp/playback/d;)V

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/d;->q()V

    goto/16 :goto_8

    :pswitch_3
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->a(Lcom/daaw/avee/comp/playback/d;)J

    move-result-wide v1

    const-wide/16 v7, 0x0

    cmp-long p1, v1, v7

    if-ltz p1, :cond_a

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->i(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/e;->k()J

    move-result-wide v1

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->i(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/e;->l()J

    move-result-wide v7

    sub-long v1, v7, v1

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->a(Lcom/daaw/avee/comp/playback/d;)J

    move-result-wide v9

    const-wide/16 v11, 0x5dc

    add-long/2addr v9, v11

    cmp-long p1, v7, v9

    if-lez p1, :cond_1

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->a(Lcom/daaw/avee/comp/playback/d;)J

    move-result-wide v7

    add-long/2addr v7, v11

    cmp-long p1, v1, v7

    if-gtz p1, :cond_1

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->a(Lcom/daaw/avee/comp/playback/d;)J

    move-result-wide v3

    sub-long/2addr v1, v3

    sub-long/2addr v1, v5

    invoke-static {}, Lcom/daaw/br1;->F()J

    move-result-wide v3

    add-long/2addr v3, v1

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object p1

    invoke-interface {p1, v3, v4}, Lcom/daaw/avee/comp/playback/e$b;->m(J)V

    goto/16 :goto_8

    :cond_1
    invoke-virtual {p0, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->m(Lcom/daaw/avee/comp/playback/d;)J

    move-result-wide v0

    :goto_0
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto/16 :goto_8

    :pswitch_4
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->j(Lcom/daaw/avee/comp/playback/d;)I

    move-result p1

    if-ne p1, v4, :cond_2

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->i(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e;

    move-result-object p1

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->h(Lcom/daaw/avee/comp/playback/d;)F

    move-result v2

    neg-float v2, v2

    invoke-interface {p1, v2, v7}, Lcom/daaw/avee/comp/playback/e;->t(FI)Z

    move-result p1

    if-eqz p1, :cond_4

    :goto_1
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->i(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/e;->v()V

    goto :goto_2

    :cond_2
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->j(Lcom/daaw/avee/comp/playback/d;)I

    move-result p1

    if-ne p1, v2, :cond_3

    :goto_2
    invoke-static {v0, v8}, Lcom/daaw/avee/comp/playback/d;->k(Lcom/daaw/avee/comp/playback/d;I)I

    goto :goto_3

    :cond_3
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->j(Lcom/daaw/avee/comp/playback/d;)I

    move-result p1

    const/4 v2, 0x6

    if-ne p1, v2, :cond_4

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->i(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e;

    move-result-object p1

    neg-float v2, v3

    invoke-interface {p1, v2, v7}, Lcom/daaw/avee/comp/playback/e;->t(FI)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    :goto_3
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->j(Lcom/daaw/avee/comp/playback/d;)I

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {p0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    goto/16 :goto_7

    :pswitch_5
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->f(Lcom/daaw/avee/comp/playback/d;)I

    move-result p1

    const/4 v5, 0x2

    if-ne p1, v7, :cond_5

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->i(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e;

    move-result-object p1

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->h(Lcom/daaw/avee/comp/playback/d;)F

    move-result v1

    neg-float v1, v1

    invoke-interface {p1, v1, v8}, Lcom/daaw/avee/comp/playback/e;->t(FI)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->i(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/e;->stop()V

    :goto_4
    invoke-static {v0, v8}, Lcom/daaw/avee/comp/playback/d;->g(Lcom/daaw/avee/comp/playback/d;I)I

    goto :goto_6

    :cond_5
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->f(Lcom/daaw/avee/comp/playback/d;)I

    move-result p1

    if-ne p1, v5, :cond_6

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->i(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e;

    move-result-object p1

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->h(Lcom/daaw/avee/comp/playback/d;)F

    move-result v1

    neg-float v1, v1

    invoke-interface {p1, v1, v8}, Lcom/daaw/avee/comp/playback/e;->t(FI)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->i(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/e;->b()V

    goto :goto_4

    :cond_6
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->f(Lcom/daaw/avee/comp/playback/d;)I

    move-result p1

    if-ne p1, v1, :cond_7

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->i(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e;

    move-result-object p1

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->h(Lcom/daaw/avee/comp/playback/d;)F

    move-result v1

    invoke-interface {p1, v1, v8}, Lcom/daaw/avee/comp/playback/e;->t(FI)Z

    move-result p1

    if-eqz p1, :cond_9

    :goto_5
    goto :goto_4

    :cond_7
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->f(Lcom/daaw/avee/comp/playback/d;)I

    move-result p1

    if-ne p1, v4, :cond_8

    goto :goto_6

    :cond_8
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->f(Lcom/daaw/avee/comp/playback/d;)I

    move-result p1

    if-ne p1, v2, :cond_9

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->i(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e;

    move-result-object p1

    invoke-interface {p1, v3, v8}, Lcom/daaw/avee/comp/playback/e;->t(FI)Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_5

    :cond_9
    :goto_6
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->f(Lcom/daaw/avee/comp/playback/d;)I

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {p0, v5}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    :goto_7
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->b(Lcom/daaw/avee/comp/playback/d;)J

    move-result-wide v0

    goto/16 :goto_0

    :cond_a
    :goto_8
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
