.class public final synthetic Lcom/daaw/um5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/l76;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/l76;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/um5;->a:Lcom/daaw/l76;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/um5;->a:Lcom/daaw/l76;

    check-cast p1, Landroid/os/Bundle;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzay;->zzb()Lcom/daaw/d04;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/daaw/d04;->n(Landroid/os/Bundle;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/l76;->a(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
