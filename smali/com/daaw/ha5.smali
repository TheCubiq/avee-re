.class public final Lcom/daaw/ha5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/jq4;

.field public final b:Lcom/daaw/ty4;

.field public final c:Lcom/daaw/vr4;

.field public final d:Lcom/daaw/ls4;

.field public final e:Lcom/daaw/xs4;

.field public final f:Lcom/daaw/uv4;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Lcom/daaw/ny4;

.field public final i:Lcom/daaw/ah4;

.field public final j:Lcom/google/android/gms/ads/internal/zzb;

.field public final k:Lcom/daaw/cx3;

.field public final l:Lcom/daaw/sl2;

.field public final m:Lcom/daaw/iv4;

.field public final n:Lcom/daaw/cq5;

.field public final o:Lcom/daaw/op6;

.field public final p:Lcom/daaw/kd5;

.field public final q:Lcom/daaw/on6;


# direct methods
.method public constructor <init>(Lcom/daaw/jq4;Lcom/daaw/vr4;Lcom/daaw/ls4;Lcom/daaw/xs4;Lcom/daaw/uv4;Ljava/util/concurrent/Executor;Lcom/daaw/ny4;Lcom/daaw/ah4;Lcom/google/android/gms/ads/internal/zzb;Lcom/daaw/cx3;Lcom/daaw/sl2;Lcom/daaw/iv4;Lcom/daaw/cq5;Lcom/daaw/op6;Lcom/daaw/kd5;Lcom/daaw/on6;Lcom/daaw/ty4;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lcom/daaw/ha5;->a:Lcom/daaw/jq4;

    move-object v1, p2

    iput-object v1, v0, Lcom/daaw/ha5;->c:Lcom/daaw/vr4;

    move-object v1, p3

    iput-object v1, v0, Lcom/daaw/ha5;->d:Lcom/daaw/ls4;

    move-object v1, p4

    iput-object v1, v0, Lcom/daaw/ha5;->e:Lcom/daaw/xs4;

    move-object v1, p5

    iput-object v1, v0, Lcom/daaw/ha5;->f:Lcom/daaw/uv4;

    move-object v1, p6

    iput-object v1, v0, Lcom/daaw/ha5;->g:Ljava/util/concurrent/Executor;

    move-object v1, p7

    iput-object v1, v0, Lcom/daaw/ha5;->h:Lcom/daaw/ny4;

    move-object v1, p8

    iput-object v1, v0, Lcom/daaw/ha5;->i:Lcom/daaw/ah4;

    move-object v1, p9

    iput-object v1, v0, Lcom/daaw/ha5;->j:Lcom/google/android/gms/ads/internal/zzb;

    move-object v1, p10

    iput-object v1, v0, Lcom/daaw/ha5;->k:Lcom/daaw/cx3;

    move-object v1, p11

    iput-object v1, v0, Lcom/daaw/ha5;->l:Lcom/daaw/sl2;

    move-object v1, p12

    iput-object v1, v0, Lcom/daaw/ha5;->m:Lcom/daaw/iv4;

    move-object v1, p13

    iput-object v1, v0, Lcom/daaw/ha5;->n:Lcom/daaw/cq5;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/daaw/ha5;->o:Lcom/daaw/op6;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/daaw/ha5;->p:Lcom/daaw/kd5;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/daaw/ha5;->q:Lcom/daaw/on6;

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/daaw/ha5;->b:Lcom/daaw/ty4;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/ha5;)Lcom/daaw/vr4;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ha5;->c:Lcom/daaw/vr4;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/ha5;)Lcom/daaw/iv4;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ha5;->m:Lcom/daaw/iv4;

    return-object p0
.end method

.method public static final j(Lcom/daaw/a74;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/f77;
    .locals 3

    new-instance v0, Lcom/daaw/e14;

    invoke-direct {v0}, Lcom/daaw/e14;-><init>()V

    invoke-interface {p0}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v1

    new-instance v2, Lcom/daaw/fa5;

    invoke-direct {v2, v0}, Lcom/daaw/fa5;-><init>(Lcom/daaw/e14;)V

    invoke-interface {v1, v2}, Lcom/daaw/t84;->E(Lcom/daaw/o84;)V

    const/4 v1, 0x0

    invoke-interface {p0, p1, p2, v1}, Lcom/daaw/a74;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic c()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ha5;->a:Lcom/daaw/jq4;

    invoke-virtual {v0}, Lcom/daaw/jq4;->onAdClicked()V

    return-void
.end method

.method public final synthetic d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ha5;->f:Lcom/daaw/uv4;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/uv4;->W(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic e()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ha5;->c:Lcom/daaw/vr4;

    invoke-virtual {v0}, Lcom/daaw/vr4;->zzb()V

    return-void
.end method

.method public final synthetic f(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/ha5;->j:Lcom/google/android/gms/ads/internal/zzb;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/zzb;->zza()V

    return-void
.end method

.method public final synthetic g(Lcom/daaw/a74;Lcom/daaw/a74;Ljava/util/Map;)V
    .locals 0

    iget-object p2, p0, Lcom/daaw/ha5;->i:Lcom/daaw/ah4;

    invoke-virtual {p2, p1}, Lcom/daaw/ah4;->c(Lcom/daaw/a74;)V

    return-void
.end method

.method public final synthetic h(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    iget-object p2, p0, Lcom/daaw/ha5;->j:Lcom/google/android/gms/ads/internal/zzb;

    invoke-virtual {p2}, Lcom/google/android/gms/ads/internal/zzb;->zza()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final i(Lcom/daaw/a74;ZLcom/daaw/bh3;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v8, p2

    move-object/from16 v9, p3

    invoke-interface/range {p1 .. p1}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v2

    new-instance v4, Lcom/daaw/y95;

    move-object v3, v4

    invoke-direct {v4, v0}, Lcom/daaw/y95;-><init>(Lcom/daaw/ha5;)V

    iget-object v4, v0, Lcom/daaw/ha5;->d:Lcom/daaw/ls4;

    iget-object v5, v0, Lcom/daaw/ha5;->e:Lcom/daaw/xs4;

    new-instance v7, Lcom/daaw/z95;

    move-object v6, v7

    invoke-direct {v7, v0}, Lcom/daaw/z95;-><init>(Lcom/daaw/ha5;)V

    new-instance v10, Lcom/daaw/aa5;

    move-object v7, v10

    invoke-direct {v10, v0}, Lcom/daaw/aa5;-><init>(Lcom/daaw/ha5;)V

    iget-object v10, v0, Lcom/daaw/ha5;->j:Lcom/google/android/gms/ads/internal/zzb;

    new-instance v12, Lcom/daaw/ga5;

    move-object v11, v12

    invoke-direct {v12, v0}, Lcom/daaw/ga5;-><init>(Lcom/daaw/ha5;)V

    iget-object v12, v0, Lcom/daaw/ha5;->k:Lcom/daaw/cx3;

    iget-object v13, v0, Lcom/daaw/ha5;->n:Lcom/daaw/cq5;

    iget-object v14, v0, Lcom/daaw/ha5;->o:Lcom/daaw/op6;

    iget-object v15, v0, Lcom/daaw/ha5;->p:Lcom/daaw/kd5;

    iget-object v1, v0, Lcom/daaw/ha5;->q:Lcom/daaw/on6;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/daaw/ha5;->b:Lcom/daaw/ty4;

    move-object/from16 v18, v1

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-interface/range {v2 .. v20}, Lcom/daaw/t84;->J(Lcom/google/android/gms/ads/internal/client/zza;Lcom/daaw/mf3;Lcom/google/android/gms/ads/internal/overlay/zzo;Lcom/daaw/of3;Lcom/google/android/gms/ads/internal/overlay/zzz;ZLcom/daaw/bh3;Lcom/google/android/gms/ads/internal/zzb;Lcom/daaw/iq3;Lcom/daaw/cx3;Lcom/daaw/cq5;Lcom/daaw/op6;Lcom/daaw/kd5;Lcom/daaw/on6;Lcom/daaw/rh3;Lcom/daaw/vy4;Lcom/daaw/qh3;Lcom/daaw/kh3;)V

    new-instance v1, Lcom/daaw/ba5;

    invoke-direct {v1, v0}, Lcom/daaw/ba5;-><init>(Lcom/daaw/ha5;)V

    move-object/from16 v2, p1

    invoke-interface {v2, v1}, Lcom/daaw/a74;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    new-instance v1, Lcom/daaw/ca5;

    invoke-direct {v1, v0}, Lcom/daaw/ca5;-><init>(Lcom/daaw/ha5;)V

    invoke-interface {v2, v1}, Lcom/daaw/a74;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget-object v1, Lcom/daaw/g93;->j2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/daaw/ha5;->l:Lcom/daaw/sl2;

    invoke-virtual {v1}, Lcom/daaw/sl2;->c()Lcom/daaw/ol2;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v3, v2

    check-cast v3, Landroid/view/View;

    invoke-interface {v1, v3}, Lcom/daaw/ol2;->zzn(Landroid/view/View;)V

    :cond_0
    iget-object v1, v0, Lcom/daaw/ha5;->h:Lcom/daaw/ny4;

    iget-object v3, v0, Lcom/daaw/ha5;->g:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object v1, v0, Lcom/daaw/ha5;->h:Lcom/daaw/ny4;

    new-instance v3, Lcom/daaw/da5;

    invoke-direct {v3, v2}, Lcom/daaw/da5;-><init>(Lcom/daaw/a74;)V

    iget-object v4, v0, Lcom/daaw/ha5;->g:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v3, v4}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object v1, v0, Lcom/daaw/ha5;->h:Lcom/daaw/ny4;

    move-object v3, v2

    check-cast v3, Landroid/view/View;

    invoke-virtual {v1, v3}, Lcom/daaw/ny4;->C0(Landroid/view/View;)V

    new-instance v1, Lcom/daaw/ea5;

    invoke-direct {v1, v0, v2}, Lcom/daaw/ea5;-><init>(Lcom/daaw/ha5;Lcom/daaw/a74;)V

    const-string v3, "/trackActiveViewUnit"

    invoke-interface {v2, v3, v1}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    iget-object v1, v0, Lcom/daaw/ha5;->i:Lcom/daaw/ah4;

    invoke-virtual {v1, v2}, Lcom/daaw/ah4;->e(Ljava/lang/Object;)V

    return-void
.end method
