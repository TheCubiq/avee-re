.class public final synthetic Lcom/daaw/hf8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/q31;


# instance fields
.field public final synthetic a:Lcom/daaw/pm8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/pm8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hf8;->a:Lcom/daaw/pm8;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/hf8;->a:Lcom/daaw/pm8;

    check-cast p1, Lcom/daaw/hl4;

    check-cast p2, Lcom/daaw/tj1;

    invoke-virtual {p1}, Lcom/daaw/pa;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/daaw/v07;

    new-instance v1, Lcom/google/android/gms/appset/zza;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Lcom/google/android/gms/appset/zza;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/daaw/bk8;

    invoke-direct {v2, v0, p2}, Lcom/daaw/bk8;-><init>(Lcom/daaw/pm8;Lcom/daaw/tj1;)V

    invoke-virtual {p1, v1, v2}, Lcom/daaw/v07;->M(Lcom/google/android/gms/appset/zza;Lcom/daaw/a86;)V

    return-void
.end method
