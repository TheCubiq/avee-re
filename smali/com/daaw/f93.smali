.class public final synthetic Lcom/daaw/f93;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/iz6;


# instance fields
.field public final synthetic p:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/f93;->p:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/f93;->p:Landroid/content/Context;

    sget-object v1, Lcom/daaw/g93;->a:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->e(Landroid/content/Context;)V

    const/4 v0, 0x0

    return-object v0
.end method
