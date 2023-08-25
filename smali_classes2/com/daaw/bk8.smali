.class public final Lcom/daaw/bk8;
.super Lcom/daaw/me5;
.source ""


# instance fields
.field public final synthetic p:Lcom/daaw/tj1;


# direct methods
.method public constructor <init>(Lcom/daaw/pm8;Lcom/daaw/tj1;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/bk8;->p:Lcom/daaw/tj1;

    invoke-direct {p0}, Lcom/daaw/me5;-><init>()V

    return-void
.end method


# virtual methods
.method public final x1(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/appset/zzc;)V
    .locals 2

    if-eqz p2, :cond_0

    new-instance v0, Lcom/daaw/m5;

    invoke-virtual {p2}, Lcom/google/android/gms/appset/zzc;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/android/gms/appset/zzc;->zza()I

    move-result p2

    invoke-direct {v0, v1, p2}, Lcom/daaw/m5;-><init>(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object p2, p0, Lcom/daaw/bk8;->p:Lcom/daaw/tj1;

    invoke-static {p1, v0, p2}, Lcom/daaw/ck1;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/daaw/tj1;)V

    return-void
.end method
