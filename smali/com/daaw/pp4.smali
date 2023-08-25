.class public final Lcom/daaw/pp4;
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

.field public final i:Lcom/daaw/m08;

.field public final j:Lcom/daaw/m08;

.field public final k:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pp4;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/pp4;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/pp4;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/pp4;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/pp4;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/pp4;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/pp4;->g:Lcom/daaw/m08;

    iput-object p8, p0, Lcom/daaw/pp4;->h:Lcom/daaw/m08;

    iput-object p9, p0, Lcom/daaw/pp4;->i:Lcom/daaw/m08;

    iput-object p10, p0, Lcom/daaw/pp4;->j:Lcom/daaw/m08;

    iput-object p11, p0, Lcom/daaw/pp4;->k:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/op4;
    .locals 13

    iget-object v0, p0, Lcom/daaw/pp4;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/daaw/en6;

    iget-object v0, p0, Lcom/daaw/pp4;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/u94;

    invoke-virtual {v0}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/pp4;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/si5;

    invoke-virtual {v0}, Lcom/daaw/si5;->a()Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/pp4;->d:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/yi5;

    invoke-virtual {v0}, Lcom/daaw/yi5;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/daaw/g93;->a()Ljava/util/List;

    move-result-object v6

    iget-object v0, p0, Lcom/daaw/pp4;->f:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/content/pm/PackageInfo;

    iget-object v0, p0, Lcom/daaw/pp4;->g:Lcom/daaw/m08;

    invoke-static {v0}, Lcom/daaw/vz7;->a(Lcom/daaw/m08;)Lcom/daaw/qz7;

    move-result-object v8

    iget-object v0, p0, Lcom/daaw/pp4;->h:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/f94;

    invoke-virtual {v0}, Lcom/daaw/f94;->a()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object v9

    iget-object v0, p0, Lcom/daaw/pp4;->i:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/pp4;->j:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/m76;

    invoke-virtual {v0}, Lcom/daaw/m76;->a()Lcom/daaw/l76;

    move-result-object v11

    iget-object v0, p0, Lcom/daaw/pp4;->k:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/cq4;

    invoke-virtual {v0}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v12

    new-instance v0, Lcom/daaw/op4;

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, Lcom/daaw/op4;-><init>(Lcom/daaw/en6;Lcom/google/android/gms/internal/ads/zzchu;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/List;Landroid/content/pm/PackageInfo;Lcom/daaw/qz7;Lcom/google/android/gms/ads/internal/util/zzg;Ljava/lang/String;Lcom/daaw/l76;Lcom/daaw/ri6;)V

    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/pp4;->a()Lcom/daaw/op4;

    move-result-object v0

    return-object v0
.end method
