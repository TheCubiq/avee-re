.class public final Lcom/daaw/x48;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic q:Z

.field public final synthetic r:Lcom/google/android/gms/measurement/internal/zzkw;

.field public final synthetic s:Lcom/daaw/x78;


# direct methods
.method public constructor <init>(Lcom/daaw/x78;Lcom/google/android/gms/measurement/internal/zzq;ZLcom/google/android/gms/measurement/internal/zzkw;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/x48;->s:Lcom/daaw/x78;

    iput-object p2, p0, Lcom/daaw/x48;->p:Lcom/google/android/gms/measurement/internal/zzq;

    iput-boolean p3, p0, Lcom/daaw/x48;->q:Z

    iput-object p4, p0, Lcom/daaw/x48;->r:Lcom/google/android/gms/measurement/internal/zzkw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/x48;->s:Lcom/daaw/x78;

    invoke-static {v0}, Lcom/daaw/x78;->H(Lcom/daaw/x78;)Lcom/daaw/ua5;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v0

    const-string v1, "Discarding data. Failed to set user property"

    invoke-virtual {v0, v1}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/x48;->p:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/x48;->s:Lcom/daaw/x78;

    iget-boolean v2, p0, Lcom/daaw/x48;->q:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/daaw/x48;->r:Lcom/google/android/gms/measurement/internal/zzkw;

    :goto_0
    iget-object v3, p0, Lcom/daaw/x48;->p:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/x78;->q(Lcom/daaw/ua5;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzq;)V

    iget-object v0, p0, Lcom/daaw/x48;->s:Lcom/daaw/x78;

    invoke-static {v0}, Lcom/daaw/x78;->N(Lcom/daaw/x78;)V

    return-void
.end method
