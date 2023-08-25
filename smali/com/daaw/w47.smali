.class public final Lcom/daaw/w47;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/c57;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/c57<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final q:Lcom/daaw/f77;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/f77<",
            "+TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/c57;Lcom/daaw/f77;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/w47;->p:Lcom/daaw/c57;

    iput-object p2, p0, Lcom/daaw/w47;->q:Lcom/daaw/f77;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/w47;->p:Lcom/daaw/c57;

    invoke-static {v0}, Lcom/daaw/c57;->o(Lcom/daaw/c57;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/w47;->q:Lcom/daaw/f77;

    invoke-static {v0}, Lcom/daaw/c57;->p(Lcom/daaw/f77;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/daaw/c57;->l()Lcom/daaw/r47;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/w47;->p:Lcom/daaw/c57;

    invoke-virtual {v1, v2, p0, v0}, Lcom/daaw/r47;->f(Lcom/daaw/c57;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/w47;->p:Lcom/daaw/c57;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/c57;->t(Lcom/daaw/c57;Z)V

    :cond_1
    return-void
.end method
