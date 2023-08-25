.class public final Lcom/daaw/ka5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;

.field public final e:Lcom/daaw/m08;

.field public final f:Lcom/daaw/m08;

.field public final g:Lcom/daaw/m08;

.field public final h:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ka5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/ka5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/ka5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/ka5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/ka5;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/ka5;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/ka5;->g:Lcom/daaw/m08;

    iput-object p8, p0, Lcom/daaw/ka5;->h:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 10

    new-instance v1, Lcom/daaw/p74;

    invoke-direct {v1}, Lcom/daaw/p74;-><init>()V

    iget-object v0, p0, Lcom/daaw/ka5;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/ka5;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/daaw/sl2;

    iget-object v0, p0, Lcom/daaw/ka5;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/ja3;

    iget-object v0, p0, Lcom/daaw/ka5;->e:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/u94;

    invoke-virtual {v0}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/ads/internal/zza;->zza()Lcom/google/android/gms/ads/internal/zza;

    move-result-object v6

    iget-object v0, p0, Lcom/daaw/ka5;->g:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/daaw/x33;

    iget-object v0, p0, Lcom/daaw/ka5;->h:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/daaw/jt4;

    new-instance v9, Lcom/daaw/ia5;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/daaw/ia5;-><init>(Lcom/daaw/p74;Landroid/content/Context;Lcom/daaw/sl2;Lcom/daaw/ja3;Lcom/google/android/gms/internal/ads/zzchu;Lcom/google/android/gms/ads/internal/zza;Lcom/daaw/x33;Lcom/daaw/jt4;)V

    return-object v9
.end method
