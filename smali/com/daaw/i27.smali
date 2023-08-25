.class public final Lcom/daaw/i27;
.super Lcom/daaw/lz6;
.source ""


# instance fields
.field public final synthetic r:Ljava/util/Iterator;

.field public final synthetic s:Lcom/daaw/ty6;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Lcom/daaw/ty6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/i27;->r:Ljava/util/Iterator;

    iput-object p2, p0, Lcom/daaw/i27;->s:Lcom/daaw/ty6;

    invoke-direct {p0}, Lcom/daaw/lz6;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    :cond_0
    iget-object v0, p0, Lcom/daaw/i27;->r:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/i27;->r:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/i27;->s:Lcom/daaw/ty6;

    invoke-interface {v1, v0}, Lcom/daaw/ty6;->zza(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/lz6;->b()Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
