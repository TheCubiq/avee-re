.class public final Lcom/daaw/ob6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/g77;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ob6;->a:Lcom/daaw/g77;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/16 v0, 0x33

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ob6;->a:Lcom/daaw/g77;

    sget-object v1, Lcom/daaw/nb6;->a:Lcom/daaw/nb6;

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
