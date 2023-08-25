.class public final synthetic Lcom/daaw/wr5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ir4;


# instance fields
.field public final synthetic p:Lcom/daaw/a74;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/a74;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wr5;->p:Lcom/daaw/a74;

    return-void
.end method


# virtual methods
.method public final zzl()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/wr5;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/t84;->zzp()V

    :cond_0
    return-void
.end method
