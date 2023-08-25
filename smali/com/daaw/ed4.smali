.class public final Lcom/daaw/ed4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tf6;


# instance fields
.field public final a:Lcom/daaw/bb4;

.field public final b:Lcom/daaw/ed4;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;

.field public final e:Lcom/daaw/m08;

.field public final f:Lcom/daaw/m08;

.field public final g:Lcom/daaw/m08;

.field public final h:Lcom/daaw/m08;

.field public final i:Lcom/daaw/m08;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bb4;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzq;Lcom/daaw/dd4;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/daaw/ed4;->b:Lcom/daaw/ed4;

    iput-object p1, p0, Lcom/daaw/ed4;->a:Lcom/daaw/bb4;

    invoke-static {p2}, Lcom/daaw/xz7;->a(Ljava/lang/Object;)Lcom/daaw/wz7;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/ed4;->c:Lcom/daaw/m08;

    invoke-static {p4}, Lcom/daaw/xz7;->a(Ljava/lang/Object;)Lcom/daaw/wz7;

    move-result-object p4

    iput-object p4, p0, Lcom/daaw/ed4;->d:Lcom/daaw/m08;

    invoke-static {p3}, Lcom/daaw/xz7;->a(Ljava/lang/Object;)Lcom/daaw/wz7;

    move-result-object p3

    iput-object p3, p0, Lcom/daaw/ed4;->e:Lcom/daaw/m08;

    invoke-static {p1}, Lcom/daaw/bb4;->y0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object p5

    new-instance v0, Lcom/daaw/bz5;

    invoke-direct {v0, p5}, Lcom/daaw/bz5;-><init>(Lcom/daaw/m08;)V

    invoke-static {v0}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object p5

    iput-object p5, p0, Lcom/daaw/ed4;->f:Lcom/daaw/m08;

    invoke-static {p1}, Lcom/daaw/bb4;->Z(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v0

    new-instance v1, Lcom/daaw/ug6;

    invoke-direct {v1, v0}, Lcom/daaw/ug6;-><init>(Lcom/daaw/m08;)V

    invoke-static {v1}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v7

    iput-object v7, p0, Lcom/daaw/ed4;->g:Lcom/daaw/m08;

    invoke-static {p1}, Lcom/daaw/bb4;->N(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v2

    invoke-static {p1}, Lcom/daaw/bb4;->J(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v3

    invoke-static {}, Lcom/daaw/ti6;->a()Lcom/daaw/ti6;

    move-result-object v6

    new-instance v8, Lcom/daaw/rf6;

    move-object v0, v8

    move-object v1, p2

    move-object v4, p5

    move-object v5, v7

    invoke-direct/range {v0 .. v6}, Lcom/daaw/rf6;-><init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V

    invoke-static {v8}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v4

    iput-object v4, p0, Lcom/daaw/ed4;->h:Lcom/daaw/m08;

    invoke-static {p1}, Lcom/daaw/bb4;->d0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object p1

    new-instance v8, Lcom/daaw/jz5;

    move-object v0, v8

    move-object v2, p4

    move-object v3, p3

    move-object v5, p5

    move-object v6, v7

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/daaw/jz5;-><init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V

    invoke-static {v8}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ed4;->i:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/iz5;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ed4;->i:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/iz5;

    return-object v0
.end method
