.class public final Lcom/daaw/ka6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Ljava/util/List;

.field public final c:Lcom/daaw/n83;


# direct methods
.method public constructor <init>(Lcom/daaw/n83;Lcom/daaw/g77;Ljava/util/List;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ka6;->c:Lcom/daaw/n83;

    iput-object p2, p0, Lcom/daaw/ka6;->a:Lcom/daaw/g77;

    iput-object p3, p0, Lcom/daaw/ka6;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/16 v0, 0x30

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ka6;->a:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/ja6;

    invoke-direct {v1, p0}, Lcom/daaw/ja6;-><init>(Lcom/daaw/ka6;)V

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
