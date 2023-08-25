.class public final Lcom/daaw/x14;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/c24;


# direct methods
.method public constructor <init>(Lcom/daaw/c24;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/x14;->p:Lcom/daaw/c24;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/x14;->p:Lcom/daaw/c24;

    invoke-static {v0}, Lcom/daaw/c24;->G(Lcom/daaw/c24;)Lcom/daaw/d24;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/daaw/c24;->J(Lcom/daaw/c24;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/c24;->G(Lcom/daaw/c24;)Lcom/daaw/d24;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/d24;->zzg()V

    iget-object v0, p0, Lcom/daaw/x14;->p:Lcom/daaw/c24;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/c24;->H(Lcom/daaw/c24;Z)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/x14;->p:Lcom/daaw/c24;

    invoke-static {v0}, Lcom/daaw/c24;->G(Lcom/daaw/c24;)Lcom/daaw/d24;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/d24;->zze()V

    :cond_1
    return-void
.end method
