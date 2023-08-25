.class public final Lcom/daaw/t14;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Lcom/daaw/c24;


# direct methods
.method public constructor <init>(Lcom/daaw/c24;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/t14;->r:Lcom/daaw/c24;

    iput-object p2, p0, Lcom/daaw/t14;->p:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/t14;->q:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/t14;->r:Lcom/daaw/c24;

    invoke-static {v0}, Lcom/daaw/c24;->G(Lcom/daaw/c24;)Lcom/daaw/d24;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/daaw/c24;->G(Lcom/daaw/c24;)Lcom/daaw/d24;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/t14;->p:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/t14;->q:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/daaw/d24;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
