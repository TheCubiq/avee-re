.class public final Lcom/daaw/e60;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/l41;
.implements Lcom/daaw/sd1;
.implements Lcom/daaw/b51;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/e60$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        "Z:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/l41;",
        "Lcom/daaw/sd1;",
        "Lcom/daaw/b51;"
    }
.end annotation


# static fields
.field public static final D:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/daaw/e60<",
            "****>;>;"
        }
    .end annotation
.end field


# instance fields
.field public A:Lcom/daaw/fx$c;

.field public B:J

.field public C:Lcom/daaw/e60$a;

.field public final a:Ljava/lang/String;

.field public b:Lcom/daaw/hi0;

.field public c:Landroid/graphics/drawable/Drawable;

.field public d:I

.field public e:I

.field public f:I

.field public g:Landroid/content/Context;

.field public h:Lcom/daaw/cn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cn1<",
            "TZ;>;"
        }
    .end annotation
.end field

.field public i:Lcom/daaw/ik0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ik0<",
            "TA;TT;TZ;TR;>;"
        }
    .end annotation
.end field

.field public j:Lcom/daaw/m41;

.field public k:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TA;"
        }
    .end annotation
.end field

.field public l:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TR;>;"
        }
    .end annotation
.end field

.field public m:Z

.field public n:Lcom/daaw/dz0;

.field public o:Lcom/daaw/pj1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/pj1<",
            "TR;>;"
        }
    .end annotation
.end field

.field public p:Lcom/daaw/q41;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/q41<",
            "-TA;TR;>;"
        }
    .end annotation
.end field

.field public q:F

.field public r:Lcom/daaw/fx;

.field public s:Lcom/daaw/g70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/g70<",
            "TR;>;"
        }
    .end annotation
.end field

.field public t:I

.field public u:I

.field public v:Lcom/daaw/wt;

.field public w:Landroid/graphics/drawable/Drawable;

.field public x:Landroid/graphics/drawable/Drawable;

.field public y:Z

.field public z:Lcom/daaw/z41;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/z41<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/tq1;->d(I)Ljava/util/Queue;

    move-result-object v0

    sput-object v0, Lcom/daaw/e60;->D:Ljava/util/Queue;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/e60;->a:Ljava/lang/String;

    return-void
.end method

.method public static m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string p0, " must not be null"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_0

    const-string p0, ", "

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-void
.end method

.method public static v(Lcom/daaw/ik0;Ljava/lang/Object;Lcom/daaw/hi0;Landroid/content/Context;Lcom/daaw/dz0;Lcom/daaw/pj1;FLandroid/graphics/drawable/Drawable;ILandroid/graphics/drawable/Drawable;ILandroid/graphics/drawable/Drawable;ILcom/daaw/q41;Lcom/daaw/m41;Lcom/daaw/fx;Lcom/daaw/cn1;Ljava/lang/Class;ZLcom/daaw/g70;IILcom/daaw/wt;)Lcom/daaw/e60;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            "Z:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/ik0<",
            "TA;TT;TZ;TR;>;TA;",
            "Lcom/daaw/hi0;",
            "Landroid/content/Context;",
            "Lcom/daaw/dz0;",
            "Lcom/daaw/pj1<",
            "TR;>;F",
            "Landroid/graphics/drawable/Drawable;",
            "I",
            "Landroid/graphics/drawable/Drawable;",
            "I",
            "Landroid/graphics/drawable/Drawable;",
            "I",
            "Lcom/daaw/q41<",
            "-TA;TR;>;",
            "Lcom/daaw/m41;",
            "Lcom/daaw/fx;",
            "Lcom/daaw/cn1<",
            "TZ;>;",
            "Ljava/lang/Class<",
            "TR;>;Z",
            "Lcom/daaw/g70<",
            "TR;>;II",
            "Lcom/daaw/wt;",
            ")",
            "Lcom/daaw/e60<",
            "TA;TT;TZ;TR;>;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/e60;->D:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/e60;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/e60;

    invoke-direct {v0}, Lcom/daaw/e60;-><init>()V

    :cond_0
    move-object v1, v0

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    move/from16 v12, p10

    move-object/from16 v13, p11

    move/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    move-object/from16 v17, p15

    move-object/from16 v18, p16

    move-object/from16 v19, p17

    move/from16 v20, p18

    move-object/from16 v21, p19

    move/from16 v22, p20

    move/from16 v23, p21

    move-object/from16 v24, p22

    invoke-virtual/range {v1 .. v24}, Lcom/daaw/e60;->q(Lcom/daaw/ik0;Ljava/lang/Object;Lcom/daaw/hi0;Landroid/content/Context;Lcom/daaw/dz0;Lcom/daaw/pj1;FLandroid/graphics/drawable/Drawable;ILandroid/graphics/drawable/Drawable;ILandroid/graphics/drawable/Drawable;ILcom/daaw/q41;Lcom/daaw/m41;Lcom/daaw/fx;Lcom/daaw/cn1;Ljava/lang/Class;ZLcom/daaw/g70;IILcom/daaw/wt;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 4

    sget-object v0, Lcom/daaw/e60$a;->t:Lcom/daaw/e60$a;

    iput-object v0, p0, Lcom/daaw/e60;->C:Lcom/daaw/e60$a;

    iget-object v0, p0, Lcom/daaw/e60;->p:Lcom/daaw/q41;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/e60;->k:Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/e60;->o:Lcom/daaw/pj1;

    invoke-virtual {p0}, Lcom/daaw/e60;->s()Z

    move-result v3

    invoke-interface {v0, p1, v1, v2, v3}, Lcom/daaw/q41;->a(Ljava/lang/Exception;Ljava/lang/Object;Lcom/daaw/pj1;Z)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/e60;->y(Ljava/lang/Exception;)V

    :cond_1
    return-void
.end method

.method public b()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/e60;->clear()V

    sget-object v0, Lcom/daaw/e60$a;->w:Lcom/daaw/e60$a;

    iput-object v0, p0, Lcom/daaw/e60;->C:Lcom/daaw/e60$a;

    return-void
.end method

.method public c()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/e60;->i:Lcom/daaw/ik0;

    iput-object v0, p0, Lcom/daaw/e60;->k:Ljava/lang/Object;

    iput-object v0, p0, Lcom/daaw/e60;->g:Landroid/content/Context;

    iput-object v0, p0, Lcom/daaw/e60;->o:Lcom/daaw/pj1;

    iput-object v0, p0, Lcom/daaw/e60;->w:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lcom/daaw/e60;->x:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lcom/daaw/e60;->c:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lcom/daaw/e60;->p:Lcom/daaw/q41;

    iput-object v0, p0, Lcom/daaw/e60;->j:Lcom/daaw/m41;

    iput-object v0, p0, Lcom/daaw/e60;->h:Lcom/daaw/cn1;

    iput-object v0, p0, Lcom/daaw/e60;->s:Lcom/daaw/g70;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/e60;->y:Z

    iput-object v0, p0, Lcom/daaw/e60;->A:Lcom/daaw/fx$c;

    sget-object v0, Lcom/daaw/e60;->D:Ljava/util/Queue;

    invoke-interface {v0, p0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    return-void
.end method

.method public clear()V
    .locals 3

    invoke-static {}, Lcom/daaw/tq1;->b()V

    iget-object v0, p0, Lcom/daaw/e60;->C:Lcom/daaw/e60$a;

    sget-object v1, Lcom/daaw/e60$a;->v:Lcom/daaw/e60$a;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/e60;->l()V

    iget-object v0, p0, Lcom/daaw/e60;->z:Lcom/daaw/z41;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/daaw/e60;->x(Lcom/daaw/z41;)V

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/e60;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/e60;->o:Lcom/daaw/pj1;

    invoke-virtual {p0}, Lcom/daaw/e60;->p()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/daaw/pj1;->k(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    iput-object v1, p0, Lcom/daaw/e60;->C:Lcom/daaw/e60$a;

    return-void
.end method

.method public d(Lcom/daaw/z41;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "*>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/Exception;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected to receive a Resource<R> with an object of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/e60;->l:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " inside, but instead got null."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/daaw/e60;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lcom/daaw/z41;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/daaw/e60;->l:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/e60;->k()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0, p1}, Lcom/daaw/e60;->x(Lcom/daaw/z41;)V

    sget-object p1, Lcom/daaw/e60$a;->s:Lcom/daaw/e60$a;

    iput-object p1, p0, Lcom/daaw/e60;->C:Lcom/daaw/e60$a;

    return-void

    :cond_2
    invoke-virtual {p0, p1, v0}, Lcom/daaw/e60;->w(Lcom/daaw/z41;Ljava/lang/Object;)V

    return-void

    :cond_3
    :goto_0
    invoke-virtual {p0, p1}, Lcom/daaw/e60;->x(Lcom/daaw/z41;)V

    new-instance v1, Ljava/lang/Exception;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected to receive an object of "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/daaw/e60;->l:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " but instead got "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ""

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    goto :goto_1

    :cond_4
    move-object v4, v3

    :goto_1
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "{"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "}"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " inside Resource{"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "}."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, " To indicate failure return a null Resource object, rather than a Resource object containing null data."

    :goto_2
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/daaw/e60;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public e()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/e60;->i()Z

    move-result v0

    return v0
.end method

.method public f(II)V
    .locals 16

    move-object/from16 v12, p0

    const-string v13, "GenericRequest"

    const/4 v14, 0x2

    invoke-static {v13, v14}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Got onSizeReady in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, v12, Lcom/daaw/e60;->B:J

    invoke-static {v1, v2}, Lcom/daaw/jl0;->a(J)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/daaw/e60;->t(Ljava/lang/String;)V

    :cond_0
    iget-object v0, v12, Lcom/daaw/e60;->C:Lcom/daaw/e60$a;

    sget-object v1, Lcom/daaw/e60$a;->r:Lcom/daaw/e60$a;

    if-eq v0, v1, :cond_1

    return-void

    :cond_1
    sget-object v0, Lcom/daaw/e60$a;->q:Lcom/daaw/e60$a;

    iput-object v0, v12, Lcom/daaw/e60;->C:Lcom/daaw/e60$a;

    iget v0, v12, Lcom/daaw/e60;->q:F

    move/from16 v1, p1

    int-to-float v1, v1

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v0, v12, Lcom/daaw/e60;->q:F

    move/from16 v1, p2

    int-to-float v1, v1

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget-object v0, v12, Lcom/daaw/e60;->i:Lcom/daaw/ik0;

    invoke-interface {v0}, Lcom/daaw/ik0;->f()Lcom/daaw/mq0;

    move-result-object v0

    iget-object v1, v12, Lcom/daaw/e60;->k:Ljava/lang/Object;

    invoke-interface {v0, v1, v2, v3}, Lcom/daaw/mq0;->a(Ljava/lang/Object;II)Lcom/daaw/ip;

    move-result-object v4

    if-nez v4, :cond_2

    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to load model: \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v12, Lcom/daaw/e60;->k:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Lcom/daaw/e60;->a(Ljava/lang/Exception;)V

    return-void

    :cond_2
    iget-object v0, v12, Lcom/daaw/e60;->i:Lcom/daaw/ik0;

    invoke-interface {v0}, Lcom/daaw/ik0;->b()Lcom/daaw/i51;

    move-result-object v7

    invoke-static {v13, v14}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "finished setup for calling load in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, v12, Lcom/daaw/e60;->B:J

    invoke-static {v5, v6}, Lcom/daaw/jl0;->a(J)D

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/daaw/e60;->t(Ljava/lang/String;)V

    :cond_3
    const/4 v15, 0x1

    iput-boolean v15, v12, Lcom/daaw/e60;->y:Z

    iget-object v0, v12, Lcom/daaw/e60;->r:Lcom/daaw/fx;

    iget-object v1, v12, Lcom/daaw/e60;->b:Lcom/daaw/hi0;

    iget-object v5, v12, Lcom/daaw/e60;->i:Lcom/daaw/ik0;

    iget-object v6, v12, Lcom/daaw/e60;->h:Lcom/daaw/cn1;

    iget-object v8, v12, Lcom/daaw/e60;->n:Lcom/daaw/dz0;

    iget-boolean v9, v12, Lcom/daaw/e60;->m:Z

    iget-object v10, v12, Lcom/daaw/e60;->v:Lcom/daaw/wt;

    move-object/from16 v11, p0

    invoke-virtual/range {v0 .. v11}, Lcom/daaw/fx;->g(Lcom/daaw/hi0;IILcom/daaw/ip;Lcom/daaw/jp;Lcom/daaw/cn1;Lcom/daaw/i51;Lcom/daaw/dz0;ZLcom/daaw/wt;Lcom/daaw/b51;)Lcom/daaw/fx$c;

    move-result-object v0

    iput-object v0, v12, Lcom/daaw/e60;->A:Lcom/daaw/fx$c;

    iget-object v0, v12, Lcom/daaw/e60;->z:Lcom/daaw/z41;

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v15, 0x0

    :goto_0
    iput-boolean v15, v12, Lcom/daaw/e60;->y:Z

    invoke-static {v13, v14}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "finished onSizeReady in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, v12, Lcom/daaw/e60;->B:J

    invoke-static {v1, v2}, Lcom/daaw/jl0;->a(J)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/daaw/e60;->t(Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public g()V
    .locals 3

    invoke-static {}, Lcom/daaw/jl0;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/e60;->B:J

    iget-object v0, p0, Lcom/daaw/e60;->k:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/e60;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    sget-object v0, Lcom/daaw/e60$a;->r:Lcom/daaw/e60$a;

    iput-object v0, p0, Lcom/daaw/e60;->C:Lcom/daaw/e60$a;

    iget v0, p0, Lcom/daaw/e60;->t:I

    iget v1, p0, Lcom/daaw/e60;->u:I

    invoke-static {v0, v1}, Lcom/daaw/tq1;->l(II)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/e60;->t:I

    iget v1, p0, Lcom/daaw/e60;->u:I

    invoke-virtual {p0, v0, v1}, Lcom/daaw/e60;->f(II)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/e60;->o:Lcom/daaw/pj1;

    invoke-interface {v0, p0}, Lcom/daaw/pj1;->e(Lcom/daaw/sd1;)V

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/e60;->i()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/e60;->r()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/e60;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/e60;->o:Lcom/daaw/pj1;

    invoke-virtual {p0}, Lcom/daaw/e60;->p()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/pj1;->i(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    const/4 v0, 0x2

    const-string v1, "GenericRequest"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "finished run method in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/daaw/e60;->B:J

    invoke-static {v1, v2}, Lcom/daaw/jl0;->a(J)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/e60;->t(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public i()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/e60;->C:Lcom/daaw/e60$a;

    sget-object v1, Lcom/daaw/e60$a;->s:Lcom/daaw/e60$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isCancelled()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/e60;->C:Lcom/daaw/e60$a;

    sget-object v1, Lcom/daaw/e60$a;->u:Lcom/daaw/e60$a;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/daaw/e60$a;->v:Lcom/daaw/e60$a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isRunning()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/e60;->C:Lcom/daaw/e60$a;

    sget-object v1, Lcom/daaw/e60$a;->q:Lcom/daaw/e60$a;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/daaw/e60$a;->r:Lcom/daaw/e60$a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/e60;->j:Lcom/daaw/m41;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lcom/daaw/m41;->d(Lcom/daaw/l41;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/e60;->j:Lcom/daaw/m41;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lcom/daaw/m41;->h(Lcom/daaw/l41;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public l()V
    .locals 1

    sget-object v0, Lcom/daaw/e60$a;->u:Lcom/daaw/e60$a;

    iput-object v0, p0, Lcom/daaw/e60;->C:Lcom/daaw/e60$a;

    iget-object v0, p0, Lcom/daaw/e60;->A:Lcom/daaw/fx$c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/fx$c;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/e60;->A:Lcom/daaw/fx$c;

    :cond_0
    return-void
.end method

.method public final n()Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Lcom/daaw/e60;->x:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/daaw/e60;->f:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/e60;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/daaw/e60;->f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/e60;->x:Landroid/graphics/drawable/Drawable;

    :cond_0
    iget-object v0, p0, Lcom/daaw/e60;->x:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final o()Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Lcom/daaw/e60;->c:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/daaw/e60;->d:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/e60;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/daaw/e60;->d:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/e60;->c:Landroid/graphics/drawable/Drawable;

    :cond_0
    iget-object v0, p0, Lcom/daaw/e60;->c:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final p()Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Lcom/daaw/e60;->w:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/daaw/e60;->e:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/e60;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/daaw/e60;->e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/e60;->w:Landroid/graphics/drawable/Drawable;

    :cond_0
    iget-object v0, p0, Lcom/daaw/e60;->w:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final q(Lcom/daaw/ik0;Ljava/lang/Object;Lcom/daaw/hi0;Landroid/content/Context;Lcom/daaw/dz0;Lcom/daaw/pj1;FLandroid/graphics/drawable/Drawable;ILandroid/graphics/drawable/Drawable;ILandroid/graphics/drawable/Drawable;ILcom/daaw/q41;Lcom/daaw/m41;Lcom/daaw/fx;Lcom/daaw/cn1;Ljava/lang/Class;ZLcom/daaw/g70;IILcom/daaw/wt;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ik0<",
            "TA;TT;TZ;TR;>;TA;",
            "Lcom/daaw/hi0;",
            "Landroid/content/Context;",
            "Lcom/daaw/dz0;",
            "Lcom/daaw/pj1<",
            "TR;>;F",
            "Landroid/graphics/drawable/Drawable;",
            "I",
            "Landroid/graphics/drawable/Drawable;",
            "I",
            "Landroid/graphics/drawable/Drawable;",
            "I",
            "Lcom/daaw/q41<",
            "-TA;TR;>;",
            "Lcom/daaw/m41;",
            "Lcom/daaw/fx;",
            "Lcom/daaw/cn1<",
            "TZ;>;",
            "Ljava/lang/Class<",
            "TR;>;Z",
            "Lcom/daaw/g70<",
            "TR;>;II",
            "Lcom/daaw/wt;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p2

    move-object/from16 v2, p17

    move-object v3, p1

    iput-object v3, v0, Lcom/daaw/e60;->i:Lcom/daaw/ik0;

    iput-object v1, v0, Lcom/daaw/e60;->k:Ljava/lang/Object;

    move-object v4, p3

    iput-object v4, v0, Lcom/daaw/e60;->b:Lcom/daaw/hi0;

    move-object/from16 v4, p12

    iput-object v4, v0, Lcom/daaw/e60;->c:Landroid/graphics/drawable/Drawable;

    move/from16 v4, p13

    iput v4, v0, Lcom/daaw/e60;->d:I

    invoke-virtual {p4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    iput-object v4, v0, Lcom/daaw/e60;->g:Landroid/content/Context;

    move-object v4, p5

    iput-object v4, v0, Lcom/daaw/e60;->n:Lcom/daaw/dz0;

    move-object v4, p6

    iput-object v4, v0, Lcom/daaw/e60;->o:Lcom/daaw/pj1;

    move v4, p7

    iput v4, v0, Lcom/daaw/e60;->q:F

    move-object v4, p8

    iput-object v4, v0, Lcom/daaw/e60;->w:Landroid/graphics/drawable/Drawable;

    move/from16 v4, p9

    iput v4, v0, Lcom/daaw/e60;->e:I

    move-object/from16 v4, p10

    iput-object v4, v0, Lcom/daaw/e60;->x:Landroid/graphics/drawable/Drawable;

    move/from16 v4, p11

    iput v4, v0, Lcom/daaw/e60;->f:I

    move-object/from16 v4, p14

    iput-object v4, v0, Lcom/daaw/e60;->p:Lcom/daaw/q41;

    move-object/from16 v4, p15

    iput-object v4, v0, Lcom/daaw/e60;->j:Lcom/daaw/m41;

    move-object/from16 v4, p16

    iput-object v4, v0, Lcom/daaw/e60;->r:Lcom/daaw/fx;

    iput-object v2, v0, Lcom/daaw/e60;->h:Lcom/daaw/cn1;

    move-object/from16 v4, p18

    iput-object v4, v0, Lcom/daaw/e60;->l:Ljava/lang/Class;

    move/from16 v4, p19

    iput-boolean v4, v0, Lcom/daaw/e60;->m:Z

    move-object/from16 v4, p20

    iput-object v4, v0, Lcom/daaw/e60;->s:Lcom/daaw/g70;

    move/from16 v4, p21

    iput v4, v0, Lcom/daaw/e60;->t:I

    move/from16 v4, p22

    iput v4, v0, Lcom/daaw/e60;->u:I

    move-object/from16 v4, p23

    iput-object v4, v0, Lcom/daaw/e60;->v:Lcom/daaw/wt;

    sget-object v5, Lcom/daaw/e60$a;->p:Lcom/daaw/e60$a;

    iput-object v5, v0, Lcom/daaw/e60;->C:Lcom/daaw/e60$a;

    if-eqz v1, :cond_3

    invoke-interface {p1}, Lcom/daaw/ik0;->f()Lcom/daaw/mq0;

    move-result-object v1

    const-string v5, "ModelLoader"

    const-string v6, "try .using(ModelLoader)"

    invoke-static {v5, v1, v6}, Lcom/daaw/e60;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/daaw/ik0;->b()Lcom/daaw/i51;

    move-result-object v1

    const-string v5, "Transcoder"

    const-string v6, "try .as*(Class).transcode(ResourceTranscoder)"

    invoke-static {v5, v1, v6}, Lcom/daaw/e60;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Transformation"

    const-string v5, "try .transform(UnitTransformation.get())"

    invoke-static {v1, v2, v5}, Lcom/daaw/e60;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p23 .. p23}, Lcom/daaw/wt;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lcom/daaw/jp;->a()Lcom/daaw/zw;

    move-result-object v1

    const-string v2, "SourceEncoder"

    const-string v5, "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)"

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lcom/daaw/jp;->d()Lcom/daaw/d51;

    move-result-object v1

    const-string v2, "SourceDecoder"

    const-string v5, "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)"

    :goto_0
    invoke-static {v2, v1, v5}, Lcom/daaw/e60;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p23 .. p23}, Lcom/daaw/wt;->b()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual/range {p23 .. p23}, Lcom/daaw/wt;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    invoke-interface {p1}, Lcom/daaw/jp;->e()Lcom/daaw/d51;

    move-result-object v1

    const-string v2, "CacheDecoder"

    const-string v5, "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)"

    invoke-static {v2, v1, v5}, Lcom/daaw/e60;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    invoke-virtual/range {p23 .. p23}, Lcom/daaw/wt;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Lcom/daaw/jp;->c()Lcom/daaw/e51;

    move-result-object v1

    const-string v2, "Encoder"

    const-string v3, "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)"

    invoke-static {v2, v1, v3}, Lcom/daaw/e60;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public r()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/e60;->C:Lcom/daaw/e60$a;

    sget-object v1, Lcom/daaw/e60$a;->t:Lcom/daaw/e60$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final s()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/e60;->j:Lcom/daaw/m41;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/daaw/m41;->a()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final t(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " this: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/daaw/e60;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final u()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/e60;->j:Lcom/daaw/m41;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/daaw/m41;->f(Lcom/daaw/l41;)V

    :cond_0
    return-void
.end method

.method public final w(Lcom/daaw/z41;Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "*>;TR;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/e60;->s()Z

    move-result v6

    sget-object v0, Lcom/daaw/e60$a;->s:Lcom/daaw/e60$a;

    iput-object v0, p0, Lcom/daaw/e60;->C:Lcom/daaw/e60$a;

    iput-object p1, p0, Lcom/daaw/e60;->z:Lcom/daaw/z41;

    iget-object v0, p0, Lcom/daaw/e60;->p:Lcom/daaw/q41;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/daaw/e60;->k:Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/e60;->o:Lcom/daaw/pj1;

    iget-boolean v4, p0, Lcom/daaw/e60;->y:Z

    move-object v1, p2

    move v5, v6

    invoke-interface/range {v0 .. v5}, Lcom/daaw/q41;->b(Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/pj1;ZZ)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/e60;->s:Lcom/daaw/g70;

    iget-boolean v1, p0, Lcom/daaw/e60;->y:Z

    invoke-interface {v0, v1, v6}, Lcom/daaw/g70;->a(ZZ)Lcom/daaw/f70;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/e60;->o:Lcom/daaw/pj1;

    invoke-interface {v1, p2, v0}, Lcom/daaw/pj1;->c(Ljava/lang/Object;Lcom/daaw/f70;)V

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/e60;->u()V

    const/4 p2, 0x2

    const-string v0, "GenericRequest"

    invoke-static {v0, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Resource ready in "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lcom/daaw/e60;->B:J

    invoke-static {v0, v1}, Lcom/daaw/jl0;->a(J)D

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, " size: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lcom/daaw/z41;->a()I

    move-result p1

    int-to-double v0, p1

    const-wide/high16 v2, 0x3eb0000000000000L    # 9.5367431640625E-7

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, " fromCache: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p1, p0, Lcom/daaw/e60;->y:Z

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/e60;->t(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final x(Lcom/daaw/z41;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/e60;->r:Lcom/daaw/fx;

    invoke-virtual {v0, p1}, Lcom/daaw/fx;->k(Lcom/daaw/z41;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/e60;->z:Lcom/daaw/z41;

    return-void
.end method

.method public final y(Ljava/lang/Exception;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/e60;->j()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/e60;->k:Ljava/lang/Object;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/e60;->o()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/e60;->n()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_2
    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/daaw/e60;->p()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_3
    iget-object v1, p0, Lcom/daaw/e60;->o:Lcom/daaw/pj1;

    invoke-interface {v1, p1, v0}, Lcom/daaw/pj1;->g(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
