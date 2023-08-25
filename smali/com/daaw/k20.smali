.class public Lcom/daaw/k20;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ik0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        "Z:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/ik0<",
        "TA;TT;TZ;TR;>;"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/mq0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/mq0<",
            "TA;TT;>;"
        }
    .end annotation
.end field

.field public final q:Lcom/daaw/i51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/i51<",
            "TZ;TR;>;"
        }
    .end annotation
.end field

.field public final r:Lcom/daaw/jp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/jp<",
            "TT;TZ;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/mq0;Lcom/daaw/i51;Lcom/daaw/jp;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/mq0<",
            "TA;TT;>;",
            "Lcom/daaw/i51<",
            "TZ;TR;>;",
            "Lcom/daaw/jp<",
            "TT;TZ;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "ModelLoader must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/k20;->p:Lcom/daaw/mq0;

    const-string p1, "Transcoder must not be null"

    invoke-static {p2, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/k20;->q:Lcom/daaw/i51;

    const-string p1, "DataLoadProvider must not be null"

    invoke-static {p3, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p3, p0, Lcom/daaw/k20;->r:Lcom/daaw/jp;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/zw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/zw<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/k20;->r:Lcom/daaw/jp;

    invoke-interface {v0}, Lcom/daaw/jp;->a()Lcom/daaw/zw;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/i51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/i51<",
            "TZ;TR;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/k20;->q:Lcom/daaw/i51;

    return-object v0
.end method

.method public c()Lcom/daaw/e51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/e51<",
            "TZ;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/k20;->r:Lcom/daaw/jp;

    invoke-interface {v0}, Lcom/daaw/jp;->c()Lcom/daaw/e51;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/daaw/d51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/d51<",
            "TT;TZ;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/k20;->r:Lcom/daaw/jp;

    invoke-interface {v0}, Lcom/daaw/jp;->d()Lcom/daaw/d51;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/daaw/d51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/d51<",
            "Ljava/io/File;",
            "TZ;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/k20;->r:Lcom/daaw/jp;

    invoke-interface {v0}, Lcom/daaw/jp;->e()Lcom/daaw/d51;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/daaw/mq0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/mq0<",
            "TA;TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/k20;->p:Lcom/daaw/mq0;

    return-object v0
.end method
