.class public final Lcom/daaw/nf5;
.super Lcom/daaw/cw3;
.source ""


# instance fields
.field public final synthetic p:Lcom/daaw/pf5;


# direct methods
.method public constructor <init>(Lcom/daaw/pf5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nf5;->p:Lcom/daaw/pf5;

    invoke-direct {p0}, Lcom/daaw/cw3;-><init>()V

    return-void
.end method


# virtual methods
.method public final zze(I)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/nf5;->p:Lcom/daaw/pf5;

    invoke-static {v0}, Lcom/daaw/pf5;->c(Lcom/daaw/pf5;)Lcom/daaw/ef5;

    move-result-object v1

    invoke-static {v0}, Lcom/daaw/pf5;->b(Lcom/daaw/pf5;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3, p1}, Lcom/daaw/ef5;->m(JI)V

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/nf5;->p:Lcom/daaw/pf5;

    invoke-static {v0}, Lcom/daaw/pf5;->c(Lcom/daaw/pf5;)Lcom/daaw/ef5;

    move-result-object v1

    invoke-static {v0}, Lcom/daaw/pf5;->b(Lcom/daaw/pf5;)J

    move-result-wide v2

    iget p1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    invoke-virtual {v1, v2, v3, p1}, Lcom/daaw/ef5;->m(JI)V

    return-void
.end method

.method public final zzg()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/nf5;->p:Lcom/daaw/pf5;

    invoke-static {v0}, Lcom/daaw/pf5;->c(Lcom/daaw/pf5;)Lcom/daaw/ef5;

    move-result-object v1

    invoke-static {v0}, Lcom/daaw/pf5;->b(Lcom/daaw/pf5;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/daaw/ef5;->p(J)V

    return-void
.end method
