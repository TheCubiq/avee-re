.class public Lcom/daaw/f60$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/f60;->o(II)Lcom/daaw/x50;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/o41;

.field public final synthetic q:Lcom/daaw/f60;


# direct methods
.method public constructor <init>(Lcom/daaw/f60;Lcom/daaw/o41;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/f60$a;->q:Lcom/daaw/f60;

    iput-object p2, p0, Lcom/daaw/f60$a;->p:Lcom/daaw/o41;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/f60$a;->p:Lcom/daaw/o41;

    invoke-virtual {v0}, Lcom/daaw/o41;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/f60$a;->q:Lcom/daaw/f60;

    iget-object v1, p0, Lcom/daaw/f60$a;->p:Lcom/daaw/o41;

    invoke-virtual {v0, v1}, Lcom/daaw/f60;->r(Lcom/daaw/pj1;)Lcom/daaw/pj1;

    :cond_0
    return-void
.end method
