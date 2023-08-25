.class public final Lcom/daaw/o$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

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
.field public final p:Lcom/daaw/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/o<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final q:Lcom/daaw/fk0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/fk0<",
            "+TV;>;"
        }
    .end annotation
.end field


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/o$g;->p:Lcom/daaw/o;

    iget-object v0, v0, Lcom/daaw/o;->p:Ljava/lang/Object;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/o$g;->q:Lcom/daaw/fk0;

    invoke-static {v0}, Lcom/daaw/o;->k(Lcom/daaw/fk0;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/daaw/o;->u:Lcom/daaw/o$b;

    iget-object v2, p0, Lcom/daaw/o$g;->p:Lcom/daaw/o;

    invoke-virtual {v1, v2, p0, v0}, Lcom/daaw/o$b;->b(Lcom/daaw/o;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/o$g;->p:Lcom/daaw/o;

    invoke-static {v0}, Lcom/daaw/o;->h(Lcom/daaw/o;)V

    :cond_1
    return-void
.end method
