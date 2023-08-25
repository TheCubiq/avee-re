.class public final Lcom/daaw/h96;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/daaw/g77;


# direct methods
.method public constructor <init>(Lcom/daaw/ou3;Landroid/content/Context;Ljava/lang/String;Lcom/daaw/g77;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/h96;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/h96;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/h96;->c:Lcom/daaw/g77;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/16 v0, 0x2a

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/h96;->c:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/g96;

    invoke-direct {v1, p0}, Lcom/daaw/g96;-><init>(Lcom/daaw/h96;)V

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
