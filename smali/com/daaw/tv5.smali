.class public final synthetic Lcom/daaw/tv5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o84;


# instance fields
.field public final synthetic p:Lcom/daaw/ma5;

.field public final synthetic q:Lcom/daaw/a74;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ma5;Lcom/daaw/a74;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tv5;->p:Lcom/daaw/ma5;

    iput-object p2, p0, Lcom/daaw/tv5;->q:Lcom/daaw/a74;

    return-void
.end method


# virtual methods
.method public final zza(Z)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/tv5;->p:Lcom/daaw/ma5;

    iget-object v0, p0, Lcom/daaw/tv5;->q:Lcom/daaw/a74;

    invoke-virtual {p1}, Lcom/daaw/ma5;->b()V

    invoke-interface {v0}, Lcom/daaw/a74;->v0()V

    invoke-interface {v0}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/t84;->zzp()V

    return-void
.end method
