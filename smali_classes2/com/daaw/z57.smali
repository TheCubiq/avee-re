.class public final Lcom/daaw/z57;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzaw;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/daaw/ob7;


# direct methods
.method public constructor <init>(Lcom/daaw/ob7;Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/z57;->c:Lcom/daaw/ob7;

    iput-object p2, p0, Lcom/daaw/z57;->a:Lcom/google/android/gms/measurement/internal/zzaw;

    iput-object p3, p0, Lcom/daaw/z57;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 30

    move-object/from16 v1, p0

    const-string v0, "_r"

    iget-object v2, v1, Lcom/daaw/z57;->c:Lcom/daaw/ob7;

    invoke-static {v2}, Lcom/daaw/ob7;->g3(Lcom/daaw/ob7;)Lcom/daaw/yb8;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/yb8;->c()V

    iget-object v2, v1, Lcom/daaw/z57;->c:Lcom/daaw/ob7;

    invoke-static {v2}, Lcom/daaw/ob7;->g3(Lcom/daaw/ob7;)Lcom/daaw/yb8;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/yb8;->d0()Lcom/daaw/n38;

    move-result-object v2

    iget-object v3, v1, Lcom/daaw/z57;->a:Lcom/google/android/gms/measurement/internal/zzaw;

    iget-object v13, v1, Lcom/daaw/z57;->b:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/daaw/rc7;->f()V

    invoke-static {}, Lcom/daaw/dr6;->t()V

    invoke-static {v3}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v13}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v4, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v4}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v4

    sget-object v5, Lcom/daaw/m75;->U:Lcom/daaw/j65;

    invoke-virtual {v4, v13, v5}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result v4

    const/4 v5, 0x0

    const/4 v14, 0x0

    if-nez v4, :cond_0

    iget-object v0, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object v0

    const-string v2, "Generating ScionPayload disabled. packageName"

    invoke-virtual {v0, v2, v13}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v14, v5, [B

    goto/16 :goto_c

    :cond_0
    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    const-string v6, "_iap"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    const-string v6, "_iapx"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v0, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object v0

    iget-object v2, v3, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    const-string v3, "Generating a payload for this event is not available. package_name, event_name"

    invoke-virtual {v0, v3, v13, v2}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_c

    :cond_1
    invoke-static {}, Lcom/daaw/e27;->D()Lcom/daaw/b17;

    move-result-object v6

    iget-object v4, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v4}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/uh2;->e0()V

    :try_start_0
    iget-object v4, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v4}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v4

    invoke-virtual {v4, v13}, Lcom/daaw/uh2;->R(Ljava/lang/String;)Lcom/daaw/qu7;

    move-result-object v4

    if-nez v4, :cond_2

    iget-object v0, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object v0

    const-string v3, "Log and bundle not available. package_name"

    invoke-virtual {v0, v3, v13}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    new-array v14, v5, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    iget-object v0, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/uh2;->f0()V

    goto/16 :goto_c

    :cond_2
    :try_start_1
    invoke-virtual {v4}, Lcom/daaw/qu7;->J()Z

    move-result v7

    if-nez v7, :cond_3

    iget-object v0, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object v0

    const-string v3, "Log and bundle disabled. package_name"

    invoke-virtual {v0, v3, v13}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/daaw/j47;->O1()Lcom/daaw/g37;

    move-result-object v15

    const/4 v11, 0x1

    invoke-virtual {v15, v11}, Lcom/daaw/g37;->W(I)Lcom/daaw/g37;

    const-string v7, "android"

    invoke-virtual {v15, v7}, Lcom/daaw/g37;->R(Ljava/lang/String;)Lcom/daaw/g37;

    invoke-virtual {v4}, Lcom/daaw/qu7;->d0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_4

    invoke-virtual {v4}, Lcom/daaw/qu7;->d0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v15, v7}, Lcom/daaw/g37;->v(Ljava/lang/String;)Lcom/daaw/g37;

    :cond_4
    invoke-virtual {v4}, Lcom/daaw/qu7;->f0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-virtual {v4}, Lcom/daaw/qu7;->f0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v15, v7}, Lcom/daaw/g37;->x(Ljava/lang/String;)Lcom/daaw/g37;

    :cond_5
    invoke-virtual {v4}, Lcom/daaw/qu7;->g0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v4}, Lcom/daaw/qu7;->g0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v15, v7}, Lcom/daaw/g37;->y(Ljava/lang/String;)Lcom/daaw/g37;

    :cond_6
    invoke-virtual {v4}, Lcom/daaw/qu7;->L()J

    move-result-wide v7

    const-wide/32 v9, -0x80000000

    cmp-long v12, v7, v9

    if-eqz v12, :cond_7

    invoke-virtual {v4}, Lcom/daaw/qu7;->L()J

    move-result-wide v7

    long-to-int v8, v7

    invoke-virtual {v15, v8}, Lcom/daaw/g37;->z(I)Lcom/daaw/g37;

    :cond_7
    invoke-virtual {v4}, Lcom/daaw/qu7;->W()J

    move-result-wide v7

    invoke-virtual {v15, v7, v8}, Lcom/daaw/g37;->N(J)Lcom/daaw/g37;

    invoke-virtual {v4}, Lcom/daaw/qu7;->U()J

    move-result-wide v7

    invoke-virtual {v15, v7, v8}, Lcom/daaw/g37;->H(J)Lcom/daaw/g37;

    invoke-virtual {v4}, Lcom/daaw/qu7;->i0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lcom/daaw/qu7;->b0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_8

    invoke-virtual {v15, v7}, Lcom/daaw/g37;->M(Ljava/lang/String;)Lcom/daaw/g37;

    goto :goto_2

    :cond_8
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_9

    invoke-virtual {v15, v8}, Lcom/daaw/g37;->u(Ljava/lang/String;)Lcom/daaw/g37;

    :cond_9
    :goto_2
    iget-object v7, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v7, v13}, Lcom/daaw/yb8;->V(Ljava/lang/String;)Lcom/daaw/cd2;

    move-result-object v7

    invoke-virtual {v4}, Lcom/daaw/qu7;->T()J

    move-result-wide v8

    invoke-virtual {v15, v8, v9}, Lcom/daaw/g37;->E(J)Lcom/daaw/g37;

    iget-object v8, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v8}, Lcom/daaw/dr6;->n()Z

    move-result v8

    if-eqz v8, :cond_a

    iget-object v8, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v8}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v8

    invoke-virtual {v15}, Lcom/daaw/g37;->i0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/daaw/qa2;->C(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_a

    sget-object v8, Lcom/daaw/vb2;->q:Lcom/daaw/vb2;

    invoke-virtual {v7, v8}, Lcom/daaw/cd2;->i(Lcom/daaw/vb2;)Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_a

    invoke-virtual {v15, v14}, Lcom/daaw/g37;->G(Ljava/lang/String;)Lcom/daaw/g37;

    :cond_a
    invoke-virtual {v7}, Lcom/daaw/cd2;->h()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v15, v8}, Lcom/daaw/g37;->D(Ljava/lang/String;)Lcom/daaw/g37;

    sget-object v8, Lcom/daaw/vb2;->q:Lcom/daaw/vb2;

    invoke-virtual {v7, v8}, Lcom/daaw/cd2;->i(Lcom/daaw/vb2;)Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-virtual {v4}, Lcom/daaw/qu7;->I()Z

    move-result v8

    if-eqz v8, :cond_b

    iget-object v8, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v8}, Lcom/daaw/yb8;->e0()Lcom/daaw/d88;

    move-result-object v8

    invoke-virtual {v4}, Lcom/daaw/qu7;->d0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9, v7}, Lcom/daaw/d88;->m(Ljava/lang/String;Lcom/daaw/cd2;)Landroid/util/Pair;

    move-result-object v8

    invoke-virtual {v4}, Lcom/daaw/qu7;->I()Z

    move-result v9

    if-eqz v9, :cond_b

    iget-object v9, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v9, :cond_b

    :try_start_2
    iget-object v9, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-wide v11, v3, Lcom/google/android/gms/measurement/internal/zzaw;->s:J

    invoke-static {v11, v12}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/daaw/n38;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v15, v9}, Lcom/daaw/g37;->X(Ljava/lang/String;)Lcom/daaw/g37;
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v8, :cond_b

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-virtual {v15, v8}, Lcom/daaw/g37;->P(Z)Lcom/daaw/g37;

    goto :goto_3

    :catch_0
    move-exception v0

    iget-object v3, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v3}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object v3

    const-string v4, "Resettable device id encryption failed"

    invoke-virtual {v0}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_b
    :goto_3
    iget-object v8, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v8}, Lcom/daaw/dr6;->A()Lcom/daaw/lm2;

    move-result-object v8

    invoke-virtual {v8}, Lcom/daaw/ud7;->j()V

    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v15, v8}, Lcom/daaw/g37;->F(Ljava/lang/String;)Lcom/daaw/g37;

    iget-object v8, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v8}, Lcom/daaw/dr6;->A()Lcom/daaw/lm2;

    move-result-object v8

    invoke-virtual {v8}, Lcom/daaw/ud7;->j()V

    sget-object v8, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v15, v8}, Lcom/daaw/g37;->Q(Ljava/lang/String;)Lcom/daaw/g37;

    iget-object v8, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v8}, Lcom/daaw/dr6;->A()Lcom/daaw/lm2;

    move-result-object v8

    invoke-virtual {v8}, Lcom/daaw/lm2;->o()J

    move-result-wide v8

    long-to-int v9, v8

    invoke-virtual {v15, v9}, Lcom/daaw/g37;->c0(I)Lcom/daaw/g37;

    iget-object v8, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v8}, Lcom/daaw/dr6;->A()Lcom/daaw/lm2;

    move-result-object v8

    invoke-virtual {v8}, Lcom/daaw/lm2;->p()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v15, v8}, Lcom/daaw/g37;->g0(Ljava/lang/String;)Lcom/daaw/g37;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    sget-object v8, Lcom/daaw/vb2;->r:Lcom/daaw/vb2;

    invoke-virtual {v7, v8}, Lcom/daaw/cd2;->i(Lcom/daaw/vb2;)Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-virtual {v4}, Lcom/daaw/qu7;->e0()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_c

    invoke-virtual {v4}, Lcom/daaw/qu7;->e0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    iget-wide v8, v3, Lcom/google/android/gms/measurement/internal/zzaw;->s:J

    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/daaw/n38;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v15, v7}, Lcom/daaw/g37;->w(Ljava/lang/String;)Lcom/daaw/g37;
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_c
    :try_start_5
    invoke-virtual {v4}, Lcom/daaw/qu7;->h0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_d

    invoke-virtual {v4}, Lcom/daaw/qu7;->h0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v15, v7}, Lcom/daaw/g37;->L(Ljava/lang/String;)Lcom/daaw/g37;

    :cond_d
    invoke-virtual {v4}, Lcom/daaw/qu7;->d0()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v8}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v8

    invoke-virtual {v8, v7}, Lcom/daaw/uh2;->c0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/daaw/mc8;

    const-string v11, "_lte"

    iget-object v12, v10, Lcom/daaw/mc8;->c:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    goto :goto_4

    :cond_f
    move-object v10, v14

    :goto_4
    const-wide/16 v24, 0x0

    if-eqz v10, :cond_10

    iget-object v9, v10, Lcom/daaw/mc8;->e:Ljava/lang/Object;

    if-nez v9, :cond_11

    :cond_10
    new-instance v9, Lcom/daaw/mc8;

    const-string v19, "auto"

    const-string v20, "_lte"

    iget-object v10, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v10}, Lcom/daaw/dr6;->b()Lcom/daaw/ag;

    move-result-object v10

    invoke-interface {v10}, Lcom/daaw/ag;->a()J

    move-result-wide v21

    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v23

    move-object/from16 v17, v9

    move-object/from16 v18, v7

    invoke-direct/range {v17 .. v23}, Lcom/daaw/mc8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v7, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v7}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v7

    invoke-virtual {v7, v9}, Lcom/daaw/uh2;->x(Lcom/daaw/mc8;)Z

    :cond_11
    iget-object v7, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v7}, Lcom/daaw/yb8;->g0()Lcom/daaw/ec8;

    move-result-object v7

    iget-object v9, v7, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v9}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v9

    invoke-virtual {v9}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v9

    const-string v10, "Checking account type status for ad personalization signals"

    invoke-virtual {v9, v10}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    iget-object v9, v7, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v9}, Lcom/daaw/dr6;->A()Lcom/daaw/lm2;

    move-result-object v9

    invoke-virtual {v9}, Lcom/daaw/lm2;->s()Z

    move-result v9

    const-wide/16 v10, 0x1

    if-eqz v9, :cond_14

    invoke-virtual {v4}, Lcom/daaw/qu7;->d0()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Lcom/daaw/qu7;->I()Z

    move-result v12

    if-eqz v12, :cond_14

    iget-object v12, v7, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v12}, Lcom/daaw/yb8;->a0()Lcom/daaw/gh6;

    move-result-object v12

    invoke-virtual {v12, v9}, Lcom/daaw/gh6;->B(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_14

    iget-object v12, v7, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v12}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v12

    invoke-virtual {v12}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object v12

    const-string v14, "Turning off ad personalization due to account type"

    invoke-virtual {v12, v14}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_13

    const-string v14, "_npa"

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v5, v17

    check-cast v5, Lcom/daaw/mc8;

    iget-object v5, v5, Lcom/daaw/mc8;->c:Ljava/lang/String;

    invoke-virtual {v14, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-interface {v12}, Ljava/util/Iterator;->remove()V

    goto :goto_6

    :cond_12
    const/4 v5, 0x0

    goto :goto_5

    :cond_13
    :goto_6
    new-instance v5, Lcom/daaw/mc8;

    const-string v19, "auto"

    const-string v20, "_npa"

    iget-object v7, v7, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v7}, Lcom/daaw/dr6;->b()Lcom/daaw/ag;

    move-result-object v7

    invoke-interface {v7}, Lcom/daaw/ag;->a()J

    move-result-wide v21

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v23

    move-object/from16 v17, v5

    move-object/from16 v18, v9

    invoke-direct/range {v17 .. v23}, Lcom/daaw/mc8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_14
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v5

    new-array v5, v5, [Lcom/daaw/we7;

    const/4 v7, 0x0

    :goto_7
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    if-ge v7, v9, :cond_15

    invoke-static {}, Lcom/daaw/we7;->G()Lcom/daaw/td7;

    move-result-object v9

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/daaw/mc8;

    iget-object v12, v12, Lcom/daaw/mc8;->c:Ljava/lang/String;

    invoke-virtual {v9, v12}, Lcom/daaw/td7;->x(Ljava/lang/String;)Lcom/daaw/td7;

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/daaw/mc8;

    iget-wide v10, v12, Lcom/daaw/mc8;->d:J

    invoke-virtual {v9, v10, v11}, Lcom/daaw/td7;->y(J)Lcom/daaw/td7;

    iget-object v10, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v10}, Lcom/daaw/yb8;->g0()Lcom/daaw/ec8;

    move-result-object v10

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/daaw/mc8;

    iget-object v11, v11, Lcom/daaw/mc8;->e:Ljava/lang/Object;

    invoke-virtual {v10, v9, v11}, Lcom/daaw/ec8;->K(Lcom/daaw/td7;Ljava/lang/Object;)V

    invoke-virtual {v9}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object v9

    check-cast v9, Lcom/daaw/we7;

    aput-object v9, v5, v7

    add-int/lit8 v7, v7, 0x1

    const-wide/16 v10, 0x1

    goto :goto_7

    :cond_15
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v15, v5}, Lcom/daaw/g37;->v0(Ljava/lang/Iterable;)Lcom/daaw/g37;

    invoke-static {v3}, Lcom/daaw/sn5;->b(Lcom/google/android/gms/measurement/internal/zzaw;)Lcom/daaw/sn5;

    move-result-object v5

    iget-object v7, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v7}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v7

    iget-object v8, v5, Lcom/daaw/sn5;->d:Landroid/os/Bundle;

    iget-object v9, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v9}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v9

    invoke-virtual {v9, v13}, Lcom/daaw/uh2;->Q(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Lcom/daaw/dd8;->z(Landroid/os/Bundle;Landroid/os/Bundle;)V

    iget-object v7, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v7}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v7

    iget-object v8, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v8}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v8

    invoke-virtual {v8, v13}, Lcom/daaw/qa2;->m(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v7, v5, v8}, Lcom/daaw/dd8;->A(Lcom/daaw/sn5;I)V

    iget-object v14, v5, Lcom/daaw/sn5;->d:Landroid/os/Bundle;

    const-string v5, "_c"

    const-wide/16 v7, 0x1

    invoke-virtual {v14, v5, v7, v8}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-object v5, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v5}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v5

    invoke-virtual {v5}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object v5

    const-string v7, "Marking in-app purchase as real-time"

    invoke-virtual {v5, v7}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    const-wide/16 v7, 0x1

    invoke-virtual {v14, v0, v7, v8}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v5, "_o"

    iget-object v7, v3, Lcom/google/android/gms/measurement/internal/zzaw;->r:Ljava/lang/String;

    invoke-virtual {v14, v5, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v5}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v5

    invoke-virtual {v15}, Lcom/daaw/g37;->i0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/daaw/dd8;->T(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_16

    iget-object v5, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v5}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v5

    const-wide/16 v7, 0x1

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const-string v8, "_dbg"

    invoke-virtual {v5, v14, v8, v7}, Lcom/daaw/dd8;->C(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v5, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v5}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v5

    invoke-virtual {v5, v14, v0, v7}, Lcom/daaw/dd8;->C(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_16
    iget-object v0, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v0

    iget-object v5, v3, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    invoke-virtual {v0, v13, v5}, Lcom/daaw/uh2;->V(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/to2;

    move-result-object v0

    if-nez v0, :cond_17

    new-instance v0, Lcom/daaw/to2;

    iget-object v5, v3, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    iget-wide v11, v3, Lcom/google/android/gms/measurement/internal/zzaw;->s:J

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v17, 0x0

    move-wide/from16 v21, v11

    move-wide/from16 v11, v17

    const-wide/16 v16, 0x0

    move-object/from16 v28, v15

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v23, v4

    move-object v4, v0

    move-object/from16 v27, v5

    move-object v5, v13

    move-object/from16 v29, v6

    move-object/from16 v6, v27

    move-object/from16 v26, v13

    move-object/from16 v27, v14

    const/4 v1, 0x0

    move-wide/from16 v13, v21

    invoke-direct/range {v4 .. v20}, Lcom/daaw/to2;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    move-wide/from16 v11, v24

    goto :goto_8

    :cond_17
    move-object/from16 v23, v4

    move-object/from16 v29, v6

    move-object/from16 v26, v13

    move-object/from16 v27, v14

    move-object/from16 v28, v15

    const/4 v1, 0x0

    iget-wide v4, v0, Lcom/daaw/to2;->f:J

    iget-wide v6, v3, Lcom/google/android/gms/measurement/internal/zzaw;->s:J

    invoke-virtual {v0, v6, v7}, Lcom/daaw/to2;->c(J)Lcom/daaw/to2;

    move-result-object v0

    move-wide v11, v4

    :goto_8
    iget-object v4, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v4}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/daaw/uh2;->p(Lcom/daaw/to2;)V

    new-instance v14, Lcom/daaw/on2;

    iget-object v5, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzaw;->r:Ljava/lang/String;

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    iget-wide v9, v3, Lcom/google/android/gms/measurement/internal/zzaw;->s:J

    move-object v4, v14

    move-object/from16 v7, v26

    move-object/from16 v13, v27

    invoke-direct/range {v4 .. v13}, Lcom/daaw/on2;-><init>(Lcom/daaw/dr6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    invoke-static {}, Lcom/daaw/it6;->H()Lcom/daaw/fs6;

    move-result-object v4

    iget-wide v5, v14, Lcom/daaw/on2;->d:J

    invoke-virtual {v4, v5, v6}, Lcom/daaw/fs6;->E(J)Lcom/daaw/fs6;

    iget-object v5, v14, Lcom/daaw/on2;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/daaw/fs6;->A(Ljava/lang/String;)Lcom/daaw/fs6;

    iget-wide v5, v14, Lcom/daaw/on2;->e:J

    invoke-virtual {v4, v5, v6}, Lcom/daaw/fs6;->D(J)Lcom/daaw/fs6;

    iget-object v5, v14, Lcom/daaw/on2;->f:Lcom/google/android/gms/measurement/internal/zzau;

    new-instance v6, Lcom/daaw/xp2;

    invoke-direct {v6, v5}, Lcom/daaw/xp2;-><init>(Lcom/google/android/gms/measurement/internal/zzau;)V

    :cond_18
    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_19

    invoke-virtual {v6}, Lcom/daaw/xp2;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/daaw/ix6;->H()Lcom/daaw/fw6;

    move-result-object v7

    invoke-virtual {v7, v5}, Lcom/daaw/fw6;->B(Ljava/lang/String;)Lcom/daaw/fw6;

    iget-object v8, v14, Lcom/daaw/on2;->f:Lcom/google/android/gms/measurement/internal/zzau;

    invoke-virtual {v8, v5}, Lcom/google/android/gms/measurement/internal/zzau;->u(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_18

    iget-object v8, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v8}, Lcom/daaw/yb8;->g0()Lcom/daaw/ec8;

    move-result-object v8

    invoke-virtual {v8, v7, v5}, Lcom/daaw/ec8;->J(Lcom/daaw/fw6;Ljava/lang/Object;)V

    invoke-virtual {v4, v7}, Lcom/daaw/fs6;->w(Lcom/daaw/fw6;)Lcom/daaw/fs6;

    goto :goto_9

    :cond_19
    move-object/from16 v5, v28

    invoke-virtual {v5, v4}, Lcom/daaw/g37;->w0(Lcom/daaw/fs6;)Lcom/daaw/g37;

    invoke-static {}, Lcom/daaw/e87;->D()Lcom/daaw/y57;

    move-result-object v6

    invoke-static {}, Lcom/daaw/cv6;->D()Lcom/daaw/gu6;

    move-result-object v7

    iget-wide v8, v0, Lcom/daaw/to2;->c:J

    invoke-virtual {v7, v8, v9}, Lcom/daaw/gu6;->s(J)Lcom/daaw/gu6;

    iget-object v0, v3, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    invoke-virtual {v7, v0}, Lcom/daaw/gu6;->t(Ljava/lang/String;)Lcom/daaw/gu6;

    invoke-virtual {v6, v7}, Lcom/daaw/y57;->s(Lcom/daaw/gu6;)Lcom/daaw/y57;

    invoke-virtual {v5, v6}, Lcom/daaw/g37;->T(Lcom/daaw/y57;)Lcom/daaw/g37;

    iget-object v0, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->T()Lcom/daaw/u32;

    move-result-object v6

    invoke-virtual/range {v23 .. v23}, Lcom/daaw/qu7;->d0()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v5}, Lcom/daaw/g37;->m0()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v4}, Lcom/daaw/fs6;->u()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {v4}, Lcom/daaw/fs6;->u()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual/range {v6 .. v11}, Lcom/daaw/u32;->l(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/daaw/g37;->r0(Ljava/lang/Iterable;)Lcom/daaw/g37;

    invoke-virtual {v4}, Lcom/daaw/fs6;->I()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-virtual {v4}, Lcom/daaw/fs6;->u()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/daaw/g37;->b0(J)Lcom/daaw/g37;

    invoke-virtual {v4}, Lcom/daaw/fs6;->u()J

    move-result-wide v3

    invoke-virtual {v5, v3, v4}, Lcom/daaw/g37;->I(J)Lcom/daaw/g37;

    :cond_1a
    invoke-virtual/range {v23 .. v23}, Lcom/daaw/qu7;->X()J

    move-result-wide v3

    cmp-long v0, v3, v24

    if-eqz v0, :cond_1b

    invoke-virtual {v5, v3, v4}, Lcom/daaw/g37;->U(J)Lcom/daaw/g37;

    :cond_1b
    invoke-virtual/range {v23 .. v23}, Lcom/daaw/qu7;->Z()J

    move-result-wide v6

    cmp-long v0, v6, v24

    if-eqz v0, :cond_1c

    invoke-virtual {v5, v6, v7}, Lcom/daaw/g37;->V(J)Lcom/daaw/g37;

    goto :goto_a

    :cond_1c
    cmp-long v0, v3, v24

    if-eqz v0, :cond_1d

    invoke-virtual {v5, v3, v4}, Lcom/daaw/g37;->V(J)Lcom/daaw/g37;

    :cond_1d
    :goto_a
    invoke-virtual/range {v23 .. v23}, Lcom/daaw/qu7;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/daaw/zm8;->b()Z

    iget-object v3, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v3}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v3

    sget-object v4, Lcom/daaw/m75;->n0:Lcom/daaw/j65;

    invoke-virtual {v3, v1, v4}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result v3

    if-eqz v3, :cond_1e

    iget-object v3, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v3}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v3

    sget-object v4, Lcom/daaw/m75;->p0:Lcom/daaw/j65;

    move-object/from16 v6, v26

    invoke-virtual {v3, v6, v4}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result v3

    if-eqz v3, :cond_1f

    if-eqz v0, :cond_1f

    invoke-virtual {v5, v0}, Lcom/daaw/g37;->a0(Ljava/lang/String;)Lcom/daaw/g37;

    goto :goto_b

    :cond_1e
    move-object/from16 v6, v26

    :cond_1f
    :goto_b
    invoke-virtual/range {v23 .. v23}, Lcom/daaw/qu7;->e()V

    invoke-virtual/range {v23 .. v23}, Lcom/daaw/qu7;->Y()J

    move-result-wide v3

    long-to-int v0, v3

    invoke-virtual {v5, v0}, Lcom/daaw/g37;->A(I)Lcom/daaw/g37;

    iget-object v0, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/qa2;->p()J

    const-wide/32 v3, 0x1212d

    invoke-virtual {v5, v3, v4}, Lcom/daaw/g37;->e0(J)Lcom/daaw/g37;

    iget-object v0, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->b()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->a()J

    move-result-wide v3

    invoke-virtual {v5, v3, v4}, Lcom/daaw/g37;->d0(J)Lcom/daaw/g37;

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/daaw/g37;->Z(Z)Lcom/daaw/g37;

    iget-object v0, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v0

    sget-object v3, Lcom/daaw/m75;->t0:Lcom/daaw/j65;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result v0

    if-eqz v0, :cond_20

    iget-object v0, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v5}, Lcom/daaw/g37;->i0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v5}, Lcom/daaw/yb8;->f(Ljava/lang/String;Lcom/daaw/g37;)V

    :cond_20
    move-object/from16 v0, v29

    invoke-virtual {v0, v5}, Lcom/daaw/b17;->s(Lcom/daaw/g37;)Lcom/daaw/b17;

    invoke-virtual {v5}, Lcom/daaw/g37;->p0()J

    move-result-wide v3

    move-object/from16 v7, v23

    invoke-virtual {v7, v3, v4}, Lcom/daaw/qu7;->C(J)V

    invoke-virtual {v5}, Lcom/daaw/g37;->o0()J

    move-result-wide v3

    invoke-virtual {v7, v3, v4}, Lcom/daaw/qu7;->z(J)V

    iget-object v3, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v3}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v3

    invoke-virtual {v3, v7}, Lcom/daaw/uh2;->o(Lcom/daaw/qu7;)V

    iget-object v3, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v3}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/uh2;->n()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    iget-object v3, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v3}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/uh2;->f0()V

    :try_start_6
    iget-object v3, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v3}, Lcom/daaw/yb8;->g0()Lcom/daaw/ec8;

    move-result-object v3

    invoke-virtual {v0}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object v0

    check-cast v0, Lcom/daaw/e27;

    invoke-virtual {v0}, Lcom/daaw/w48;->i()[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/daaw/ec8;->O([B)[B

    move-result-object v14
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_c

    :catch_1
    move-exception v0

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v2

    invoke-static {v6}, Lcom/daaw/om5;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Data loss. Failed to bundle and serialize. appId"

    invoke-virtual {v2, v4, v3, v0}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v14, v1

    goto :goto_c

    :catch_2
    move-exception v0

    :try_start_7
    iget-object v1, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object v1

    const-string v3, "app instance id encryption failed"

    invoke-virtual {v0}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v1, 0x0

    new-array v14, v1, [B
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_1

    :goto_c
    return-object v14

    :catchall_0
    move-exception v0

    iget-object v1, v2, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v1}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/uh2;->f0()V

    goto :goto_e

    :goto_d
    throw v0

    :goto_e
    goto :goto_d
.end method
