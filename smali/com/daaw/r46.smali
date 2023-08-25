.class public final Lcom/daaw/r46;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Lcom/daaw/sh6;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Lcom/daaw/sh6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/r46;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/r46;->b:Lcom/daaw/sh6;

    return-void
.end method


# virtual methods
.method public final synthetic a()Lcom/daaw/s46;
    .locals 2

    new-instance v0, Lcom/daaw/s46;

    iget-object v1, p0, Lcom/daaw/r46;->b:Lcom/daaw/sh6;

    invoke-direct {v0, v1}, Lcom/daaw/s46;-><init>(Lcom/daaw/sh6;)V

    return-object v0
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0x19

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/r46;->a:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/q46;

    invoke-direct {v1, p0}, Lcom/daaw/q46;-><init>(Lcom/daaw/r46;)V

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
