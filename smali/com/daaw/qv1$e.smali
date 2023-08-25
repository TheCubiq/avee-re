.class public Lcom/daaw/qv1$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qv1;-><init>(Lcom/daaw/pv1;Lcom/daaw/xw0;Lcom/daaw/vm0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/xw1$a<",
        "Lcom/daaw/avee/comp/playback/a;",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/playback/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/qv1;


# direct methods
.method public constructor <init>(Lcom/daaw/qv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/avee/comp/playback/a;Ljava/lang/Integer;)Lcom/daaw/avee/comp/playback/a;
    .locals 7

    iget-object p1, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->k(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    new-instance v0, Lcom/daaw/avee/comp/playback/a;

    invoke-direct {v0}, Lcom/daaw/avee/comp/playback/a;-><init>()V

    invoke-static {p1, v0}, Lcom/daaw/qv1;->l(Lcom/daaw/qv1;Lcom/daaw/avee/comp/playback/a;)Lcom/daaw/avee/comp/playback/a;

    :cond_0
    invoke-static {}, Lcom/daaw/qv1;->h()Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {p1, v1}, Lcom/daaw/qv1;->m(Lcom/daaw/qv1;Z)Z

    return-object v0

    :cond_1
    iget-object p1, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->n(Lcom/daaw/qv1;)I

    move-result p1

    iget-object v2, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {v2}, Lcom/daaw/qv1;->o(Lcom/daaw/qv1;)I

    move-result v2

    sub-int/2addr p1, v2

    iget-object v2, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {v2}, Lcom/daaw/qv1;->a(Lcom/daaw/qv1;)I

    move-result v2

    if-ltz p1, :cond_c

    iget-object v3, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {v3}, Lcom/daaw/qv1;->n(Lcom/daaw/qv1;)I

    move-result v3

    iget-object v4, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {v4}, Lcom/daaw/qv1;->q(Lcom/daaw/qv1;)I

    move-result v4

    if-gt v3, v4, :cond_c

    iget-object v3, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {v3}, Lcom/daaw/qv1;->q(Lcom/daaw/qv1;)I

    move-result v3

    sub-int/2addr v3, v1

    const/4 v4, 0x0

    if-lt p1, v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    iget-object p1, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->s(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a$g;

    move-result-object p1

    invoke-static {}, Lcom/daaw/qv1;->t()J

    move-result-wide v5

    iput-wide v5, p1, Lcom/daaw/avee/comp/playback/a$g;->g:J

    iget-object p1, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->s(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a$g;

    move-result-object p1

    const-wide v5, 0x412e848000000000L    # 1000000.0

    int-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v5, v2

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-long v2, v2

    iput-wide v2, p1, Lcom/daaw/avee/comp/playback/a$h;->c:J

    iget-object p1, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->s(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a$g;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iput p2, p1, Lcom/daaw/avee/comp/playback/a$h;->d:I

    sget-object p1, Lcom/daaw/qv1;->R:Lcom/daaw/ow1;

    iget-object p2, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->k(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p2

    iget-object v2, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {v2}, Lcom/daaw/qv1;->s(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a$g;

    move-result-object v2

    invoke-virtual {p1, p2, v2, v0}, Lcom/daaw/ow1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/playback/a;

    iget-object p2, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->n(Lcom/daaw/qv1;)I

    move-result p2

    rem-int/lit8 p2, p2, 0xf

    if-nez p2, :cond_3

    iget-object p2, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->s(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a$g;

    move-result-object v2

    iget-wide v2, v2, Lcom/daaw/avee/comp/playback/a$g;->g:J

    invoke-static {p2, v2, v3}, Lcom/daaw/qv1;->u(Lcom/daaw/qv1;J)V

    :cond_3
    if-eqz p1, :cond_4

    iget-boolean p2, p1, Lcom/daaw/avee/comp/playback/a;->k:Z

    if-nez p2, :cond_a

    :cond_4
    if-nez v1, :cond_a

    const-wide/16 v1, 0x3e8

    const-string p2, "not capturedDataFully posMs: "

    new-instance v3, Ljava/lang/StringBuilder;

    if-eqz p1, :cond_5

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->s(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a$g;

    move-result-object p2

    iget-wide v5, p2, Lcom/daaw/avee/comp/playback/a$g;->g:J

    div-long/2addr v5, v1

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ", readjust and wait "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p1, Lcom/daaw/avee/comp/playback/a;->l:I

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " / "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/a;->b()I

    move-result p2

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->s(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a$g;

    move-result-object p2

    iget-wide v5, p2, Lcom/daaw/avee/comp/playback/a$g;->g:J

    div-long/2addr v5, v1

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ", readjust and wait, outData is null"

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-virtual {p2}, Lcom/daaw/qv1;->d0()V

    :goto_2
    const/16 p2, 0xa

    if-ge v4, p2, :cond_8

    if-eqz p1, :cond_6

    iget-object v1, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {v1, p1}, Lcom/daaw/qv1;->l(Lcom/daaw/qv1;Lcom/daaw/avee/comp/playback/a;)Lcom/daaw/avee/comp/playback/a;

    :cond_6
    sget-object p1, Lcom/daaw/qv1;->R:Lcom/daaw/ow1;

    iget-object v1, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {v1}, Lcom/daaw/qv1;->k(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {v2}, Lcom/daaw/qv1;->s(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a$g;

    move-result-object v2

    invoke-virtual {p1, v1, v2, v0}, Lcom/daaw/ow1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/playback/a;

    if-eqz p1, :cond_7

    iget-boolean v1, p1, Lcom/daaw/avee/comp/playback/a;->k:Z

    if-eqz v1, :cond_7

    goto :goto_3

    :cond_7
    const-wide/16 v1, 0x1f4

    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_8
    :goto_3
    if-lez v4, :cond_9

    const-string v0, "didn\'t got with first"

    invoke-static {v0}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    :cond_9
    if-lt v4, p2, :cond_a

    const-string p2, "failed to get capturedDataFully, gave up"

    invoke-static {p2}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->v(Lcom/daaw/qv1;)Lcom/daaw/wf1;

    move-result-object p2

    const-string v0, "warning: failed to get audio data for frame"

    invoke-virtual {p2, v0}, Lcom/daaw/wf1;->d(Ljava/lang/String;)V

    :cond_a
    if-eqz p1, :cond_b

    iget-object p2, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {p2, p1}, Lcom/daaw/qv1;->l(Lcom/daaw/qv1;Lcom/daaw/avee/comp/playback/a;)Lcom/daaw/avee/comp/playback/a;

    :cond_b
    iget-object p2, p0, Lcom/daaw/qv1$e;->a:Lcom/daaw/qv1;

    invoke-static {p2, p1}, Lcom/daaw/qv1;->x(Lcom/daaw/qv1;Lcom/daaw/avee/comp/playback/a;)Lcom/daaw/avee/comp/playback/a;

    return-object p1

    :cond_c
    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/avee/comp/playback/a;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/qv1$e;->a(Lcom/daaw/avee/comp/playback/a;Ljava/lang/Integer;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    return-object p1
.end method
