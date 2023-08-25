.class public final Lcom/daaw/c12;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/f12;


# direct methods
.method public constructor <init>(Lcom/daaw/f12;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/c12;->p:Lcom/daaw/f12;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/c12;->p:Lcom/daaw/f12;

    invoke-static {v0}, Lcom/daaw/f12;->h3(Lcom/daaw/f12;)Lcom/daaw/e12;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/daaw/e12;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method
