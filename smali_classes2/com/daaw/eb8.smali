.class public final Lcom/daaw/eb8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic b:Lcom/daaw/yb8;


# direct methods
.method public constructor <init>(Lcom/daaw/yb8;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/eb8;->b:Lcom/daaw/yb8;

    iput-object p2, p0, Lcom/daaw/eb8;->a:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/eb8;->b:Lcom/daaw/yb8;

    iget-object v1, p0, Lcom/daaw/eb8;->a:Lcom/google/android/gms/measurement/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzq;->p:Ljava/lang/String;

    invoke-static {v1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/yb8;->V(Ljava/lang/String;)Lcom/daaw/cd2;

    move-result-object v0

    sget-object v1, Lcom/daaw/vb2;->r:Lcom/daaw/vb2;

    invoke-virtual {v0, v1}, Lcom/daaw/cd2;->i(Lcom/daaw/vb2;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/eb8;->a:Lcom/google/android/gms/measurement/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzq;->K:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/cd2;->b(Ljava/lang/String;)Lcom/daaw/cd2;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/cd2;->i(Lcom/daaw/vb2;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/eb8;->b:Lcom/daaw/yb8;

    iget-object v1, p0, Lcom/daaw/eb8;->a:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v0, v1}, Lcom/daaw/yb8;->S(Lcom/google/android/gms/measurement/internal/zzq;)Lcom/daaw/qu7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/qu7;->e0()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/eb8;->b:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v0

    const-string v1, "Analytics storage consent denied. Returning null app instance id"

    invoke-virtual {v0, v1}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method
