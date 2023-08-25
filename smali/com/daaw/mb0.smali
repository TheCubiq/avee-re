.class public final Lcom/daaw/mb0;
.super Lcom/daaw/ua;
.source ""

# interfaces
.implements Lcom/daaw/pb0$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/mb0$b;
    }
.end annotation


# instance fields
.field public final A:Lcom/daaw/pb0;

.field public final B:Ljava/lang/Object;

.field public final u:Lcom/daaw/gb0;

.field public final v:Landroid/net/Uri;

.field public final w:Lcom/daaw/fb0;

.field public final x:Lcom/daaw/wi;

.field public final y:I

.field public final z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.hls"

    invoke-static {v0}, Lcom/daaw/vz;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lcom/daaw/fb0;Lcom/daaw/gb0;Lcom/daaw/wi;ILcom/daaw/pb0;ZLjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ua;-><init>()V

    iput-object p1, p0, Lcom/daaw/mb0;->v:Landroid/net/Uri;

    iput-object p2, p0, Lcom/daaw/mb0;->w:Lcom/daaw/fb0;

    iput-object p3, p0, Lcom/daaw/mb0;->u:Lcom/daaw/gb0;

    iput-object p4, p0, Lcom/daaw/mb0;->x:Lcom/daaw/wi;

    iput p5, p0, Lcom/daaw/mb0;->y:I

    iput-object p6, p0, Lcom/daaw/mb0;->A:Lcom/daaw/pb0;

    iput-boolean p7, p0, Lcom/daaw/mb0;->z:Z

    iput-object p8, p0, Lcom/daaw/mb0;->B:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/net/Uri;Lcom/daaw/fb0;Lcom/daaw/gb0;Lcom/daaw/wi;ILcom/daaw/pb0;ZLjava/lang/Object;Lcom/daaw/mb0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lcom/daaw/mb0;-><init>(Landroid/net/Uri;Lcom/daaw/fb0;Lcom/daaw/gb0;Lcom/daaw/wi;ILcom/daaw/pb0;ZLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/qo0;)V
    .locals 0

    check-cast p1, Lcom/daaw/kb0;

    invoke-virtual {p1}, Lcom/daaw/kb0;->y()V

    return-void
.end method

.method public d(Lcom/daaw/lb0;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-boolean v2, v1, Lcom/daaw/lb0;->m:Z

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_0

    iget-wide v5, v1, Lcom/daaw/lb0;->e:J

    invoke-static {v5, v6}, Lcom/daaw/dd;->b(J)J

    move-result-wide v5

    move-wide v10, v5

    goto :goto_0

    :cond_0
    move-wide v10, v3

    :goto_0
    iget v2, v1, Lcom/daaw/lb0;->c:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v2, v5, :cond_2

    if-ne v2, v6, :cond_1

    goto :goto_1

    :cond_1
    move-wide v8, v3

    goto :goto_2

    :cond_2
    :goto_1
    move-wide v8, v10

    :goto_2
    iget-wide v12, v1, Lcom/daaw/lb0;->d:J

    iget-object v2, v0, Lcom/daaw/mb0;->A:Lcom/daaw/pb0;

    invoke-interface {v2}, Lcom/daaw/pb0;->g()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-wide v14, v1, Lcom/daaw/lb0;->e:J

    iget-object v2, v0, Lcom/daaw/mb0;->A:Lcom/daaw/pb0;

    invoke-interface {v2}, Lcom/daaw/pb0;->f()J

    move-result-wide v18

    sub-long v18, v14, v18

    iget-boolean v2, v1, Lcom/daaw/lb0;->l:Z

    if-eqz v2, :cond_3

    iget-wide v14, v1, Lcom/daaw/lb0;->p:J

    add-long v14, v18, v14

    goto :goto_3

    :cond_3
    move-wide v14, v3

    :goto_3
    iget-object v2, v1, Lcom/daaw/lb0;->o:Ljava/util/List;

    cmp-long v5, v12, v3

    if-nez v5, :cond_5

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    const-wide/16 v16, 0x0

    goto :goto_4

    :cond_4
    const/4 v3, 0x0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x3

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/lb0$a;

    iget-wide v2, v2, Lcom/daaw/lb0$a;->t:J

    move-wide/from16 v16, v2

    :goto_4
    move-wide/from16 v2, v16

    goto :goto_5

    :cond_5
    move-wide v2, v12

    :goto_5
    new-instance v4, Lcom/daaw/od1;

    iget-wide v12, v1, Lcom/daaw/lb0;->p:J

    const/16 v20, 0x1

    iget-boolean v5, v1, Lcom/daaw/lb0;->l:Z

    xor-int/lit8 v21, v5, 0x1

    iget-object v5, v0, Lcom/daaw/mb0;->B:Ljava/lang/Object;

    move-object v7, v4

    move-wide/from16 v16, v12

    move-wide v12, v14

    move-wide/from16 v14, v16

    move-wide/from16 v16, v18

    move-wide/from16 v18, v2

    move-object/from16 v22, v5

    invoke-direct/range {v7 .. v22}, Lcom/daaw/od1;-><init>(JJJJJJZZLjava/lang/Object;)V

    goto :goto_7

    :cond_6
    cmp-long v2, v12, v3

    if-nez v2, :cond_7

    const-wide/16 v18, 0x0

    goto :goto_6

    :cond_7
    move-wide/from16 v18, v12

    :goto_6
    new-instance v4, Lcom/daaw/od1;

    iget-wide v14, v1, Lcom/daaw/lb0;->p:J

    const-wide/16 v16, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    iget-object v2, v0, Lcom/daaw/mb0;->B:Ljava/lang/Object;

    move-object v7, v4

    move-wide v12, v14

    move-object/from16 v22, v2

    invoke-direct/range {v7 .. v22}, Lcom/daaw/od1;-><init>(JJJJJJZZLjava/lang/Object;)V

    :goto_7
    new-instance v2, Lcom/daaw/hb0;

    iget-object v3, v0, Lcom/daaw/mb0;->A:Lcom/daaw/pb0;

    invoke-interface {v3}, Lcom/daaw/pb0;->i()Lcom/daaw/ib0;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lcom/daaw/hb0;-><init>(Lcom/daaw/ib0;Lcom/daaw/lb0;)V

    invoke-virtual {v0, v4, v2}, Lcom/daaw/ua;->n(Lcom/daaw/nl1;Ljava/lang/Object;)V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mb0;->A:Lcom/daaw/pb0;

    invoke-interface {v0}, Lcom/daaw/pb0;->j()V

    return-void
.end method

.method public g(Lcom/daaw/bp0$a;Lcom/daaw/l2;)Lcom/daaw/qo0;
    .locals 10

    iget v0, p1, Lcom/daaw/bp0$a;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->a(Z)V

    invoke-virtual {p0, p1}, Lcom/daaw/ua;->j(Lcom/daaw/bp0$a;)Lcom/daaw/cp0$a;

    move-result-object v6

    new-instance p1, Lcom/daaw/kb0;

    iget-object v2, p0, Lcom/daaw/mb0;->u:Lcom/daaw/gb0;

    iget-object v3, p0, Lcom/daaw/mb0;->A:Lcom/daaw/pb0;

    iget-object v4, p0, Lcom/daaw/mb0;->w:Lcom/daaw/fb0;

    iget v5, p0, Lcom/daaw/mb0;->y:I

    iget-object v8, p0, Lcom/daaw/mb0;->x:Lcom/daaw/wi;

    iget-boolean v9, p0, Lcom/daaw/mb0;->z:Z

    move-object v1, p1

    move-object v7, p2

    invoke-direct/range {v1 .. v9}, Lcom/daaw/kb0;-><init>(Lcom/daaw/gb0;Lcom/daaw/pb0;Lcom/daaw/fb0;ILcom/daaw/cp0$a;Lcom/daaw/l2;Lcom/daaw/wi;Z)V

    return-object p1
.end method

.method public m(Lcom/daaw/rz;Z)V
    .locals 1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/ua;->j(Lcom/daaw/bp0$a;)Lcom/daaw/cp0$a;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/mb0;->A:Lcom/daaw/pb0;

    iget-object v0, p0, Lcom/daaw/mb0;->v:Landroid/net/Uri;

    invoke-interface {p2, v0, p1, p0}, Lcom/daaw/pb0;->b(Landroid/net/Uri;Lcom/daaw/cp0$a;Lcom/daaw/pb0$d;)V

    return-void
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mb0;->A:Lcom/daaw/pb0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/pb0;->a()V

    :cond_0
    return-void
.end method
