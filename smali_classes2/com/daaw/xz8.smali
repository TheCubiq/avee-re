.class public final Lcom/daaw/xz8;
.super Lcom/daaw/qy8;
.source ""


# instance fields
.field public final g:Lcom/daaw/a06;

.field public final synthetic h:Lcom/daaw/u32;


# direct methods
.method public constructor <init>(Lcom/daaw/u32;Ljava/lang/String;ILcom/daaw/a06;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xz8;->h:Lcom/daaw/u32;

    invoke-direct {p0, p2, p3}, Lcom/daaw/qy8;-><init>(Ljava/lang/String;I)V

    iput-object p4, p0, Lcom/daaw/xz8;->g:Lcom/daaw/a06;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/xz8;->g:Lcom/daaw/a06;

    invoke-virtual {v0}, Lcom/daaw/a06;->D()I

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final k(Ljava/lang/Long;Ljava/lang/Long;Lcom/daaw/we7;Z)Z
    .locals 10

    invoke-static {}, Lcom/daaw/wj8;->b()Z

    iget-object v0, p0, Lcom/daaw/xz8;->h:Lcom/daaw/u32;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/qy8;->a:Ljava/lang/String;

    sget-object v2, Lcom/daaw/m75;->W:Lcom/daaw/j65;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result v0

    iget-object v1, p0, Lcom/daaw/xz8;->g:Lcom/daaw/a06;

    invoke-virtual {v1}, Lcom/daaw/a06;->J()Z

    move-result v1

    iget-object v2, p0, Lcom/daaw/xz8;->g:Lcom/daaw/a06;

    invoke-virtual {v2}, Lcom/daaw/a06;->K()Z

    move-result v2

    iget-object v3, p0, Lcom/daaw/xz8;->g:Lcom/daaw/a06;

    invoke-virtual {v3}, Lcom/daaw/a06;->L()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v1, :cond_1

    if-nez v2, :cond_1

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    const/4 v2, 0x0

    if-eqz p4, :cond_3

    if-nez v1, :cond_3

    iget-object p1, p0, Lcom/daaw/xz8;->h:Lcom/daaw/u32;

    iget-object p1, p1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object p1

    iget p2, p0, Lcom/daaw/qy8;->b:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/xz8;->g:Lcom/daaw/a06;

    invoke-virtual {p3}, Lcom/daaw/a06;->M()Z

    move-result p3

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/daaw/xz8;->g:Lcom/daaw/a06;

    invoke-virtual {p3}, Lcom/daaw/a06;->D()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_2
    const-string p3, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"

    invoke-virtual {p1, p3, p2, v2}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v5

    :cond_3
    iget-object v6, p0, Lcom/daaw/xz8;->g:Lcom/daaw/a06;

    invoke-virtual {v6}, Lcom/daaw/a06;->E()Lcom/daaw/ds5;

    move-result-object v6

    invoke-virtual {v6}, Lcom/daaw/ds5;->J()Z

    move-result v7

    invoke-virtual {p3}, Lcom/daaw/we7;->T()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v6}, Lcom/daaw/ds5;->L()Z

    move-result v8

    if-nez v8, :cond_4

    iget-object v6, p0, Lcom/daaw/xz8;->h:Lcom/daaw/u32;

    iget-object v6, v6, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v6}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v6

    invoke-virtual {v6}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object v6

    iget-object v7, p0, Lcom/daaw/xz8;->h:Lcom/daaw/u32;

    iget-object v7, v7, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v7}, Lcom/daaw/dr6;->D()Lcom/daaw/xg5;

    move-result-object v7

    invoke-virtual {p3}, Lcom/daaw/we7;->I()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/daaw/xg5;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "No number filter for long property. property"

    :goto_2
    invoke-virtual {v6, v8, v7}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_4
    invoke-virtual {p3}, Lcom/daaw/we7;->E()J

    move-result-wide v8

    invoke-virtual {v6}, Lcom/daaw/ds5;->F()Lcom/daaw/tx5;

    move-result-object v2

    invoke-static {v8, v9, v2}, Lcom/daaw/qy8;->h(JLcom/daaw/tx5;)Ljava/lang/Boolean;

    move-result-object v2

    :goto_3
    invoke-static {v2, v7}, Lcom/daaw/qy8;->j(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v2

    goto/16 :goto_4

    :cond_5
    invoke-virtual {p3}, Lcom/daaw/we7;->S()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-virtual {v6}, Lcom/daaw/ds5;->L()Z

    move-result v8

    if-nez v8, :cond_6

    iget-object v6, p0, Lcom/daaw/xz8;->h:Lcom/daaw/u32;

    iget-object v6, v6, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v6}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v6

    invoke-virtual {v6}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object v6

    iget-object v7, p0, Lcom/daaw/xz8;->h:Lcom/daaw/u32;

    iget-object v7, v7, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v7}, Lcom/daaw/dr6;->D()Lcom/daaw/xg5;

    move-result-object v7

    invoke-virtual {p3}, Lcom/daaw/we7;->I()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/daaw/xg5;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "No number filter for double property. property"

    goto :goto_2

    :cond_6
    invoke-virtual {p3}, Lcom/daaw/we7;->D()D

    move-result-wide v8

    invoke-virtual {v6}, Lcom/daaw/ds5;->F()Lcom/daaw/tx5;

    move-result-object v2

    invoke-static {v8, v9, v2}, Lcom/daaw/qy8;->g(DLcom/daaw/tx5;)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_3

    :cond_7
    invoke-virtual {p3}, Lcom/daaw/we7;->V()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-virtual {v6}, Lcom/daaw/ds5;->N()Z

    move-result v8

    if-nez v8, :cond_a

    invoke-virtual {v6}, Lcom/daaw/ds5;->L()Z

    move-result v8

    if-nez v8, :cond_8

    iget-object v6, p0, Lcom/daaw/xz8;->h:Lcom/daaw/u32;

    iget-object v6, v6, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v6}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v6

    invoke-virtual {v6}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object v6

    iget-object v7, p0, Lcom/daaw/xz8;->h:Lcom/daaw/u32;

    iget-object v7, v7, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v7}, Lcom/daaw/dr6;->D()Lcom/daaw/xg5;

    move-result-object v7

    invoke-virtual {p3}, Lcom/daaw/we7;->I()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/daaw/xg5;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "No string or number filter defined. property"

    goto :goto_2

    :cond_8
    invoke-virtual {p3}, Lcom/daaw/we7;->J()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/daaw/ec8;->N(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-virtual {p3}, Lcom/daaw/we7;->J()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Lcom/daaw/ds5;->F()Lcom/daaw/tx5;

    move-result-object v6

    invoke-static {v2, v6}, Lcom/daaw/qy8;->i(Ljava/lang/String;Lcom/daaw/tx5;)Ljava/lang/Boolean;

    move-result-object v2

    goto/16 :goto_3

    :cond_9
    iget-object v6, p0, Lcom/daaw/xz8;->h:Lcom/daaw/u32;

    iget-object v6, v6, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v6}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v6

    invoke-virtual {v6}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object v6

    iget-object v7, p0, Lcom/daaw/xz8;->h:Lcom/daaw/u32;

    iget-object v7, v7, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v7}, Lcom/daaw/dr6;->D()Lcom/daaw/xg5;

    move-result-object v7

    invoke-virtual {p3}, Lcom/daaw/we7;->I()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/daaw/xg5;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p3}, Lcom/daaw/we7;->J()Ljava/lang/String;

    move-result-object v8

    const-string v9, "Invalid user property value for Numeric number filter. property, value"

    invoke-virtual {v6, v9, v7, v8}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :cond_a
    invoke-virtual {p3}, Lcom/daaw/we7;->J()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Lcom/daaw/ds5;->G()Lcom/daaw/q56;

    move-result-object v6

    iget-object v8, p0, Lcom/daaw/xz8;->h:Lcom/daaw/u32;

    iget-object v8, v8, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v8}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v8

    invoke-static {v2, v6, v8}, Lcom/daaw/qy8;->f(Ljava/lang/String;Lcom/daaw/q56;Lcom/daaw/om5;)Ljava/lang/Boolean;

    move-result-object v2

    goto/16 :goto_3

    :cond_b
    iget-object v6, p0, Lcom/daaw/xz8;->h:Lcom/daaw/u32;

    iget-object v6, v6, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v6}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v6

    invoke-virtual {v6}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object v6

    iget-object v7, p0, Lcom/daaw/xz8;->h:Lcom/daaw/u32;

    iget-object v7, v7, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v7}, Lcom/daaw/dr6;->D()Lcom/daaw/xg5;

    move-result-object v7

    invoke-virtual {p3}, Lcom/daaw/we7;->I()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/daaw/xg5;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "User property has no value, property"

    goto/16 :goto_2

    :goto_4
    iget-object v6, p0, Lcom/daaw/xz8;->h:Lcom/daaw/u32;

    iget-object v6, v6, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v6}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v6

    invoke-virtual {v6}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v6

    if-nez v2, :cond_c

    const-string v7, "null"

    goto :goto_5

    :cond_c
    move-object v7, v2

    :goto_5
    const-string v8, "Property filter result"

    invoke-virtual {v6, v8, v7}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v2, :cond_d

    return v4

    :cond_d
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v4, p0, Lcom/daaw/qy8;->c:Ljava/lang/Boolean;

    if-eqz v3, :cond_f

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_e

    goto :goto_6

    :cond_e
    return v5

    :cond_f
    :goto_6
    if-eqz p4, :cond_10

    iget-object p4, p0, Lcom/daaw/xz8;->g:Lcom/daaw/a06;

    invoke-virtual {p4}, Lcom/daaw/a06;->J()Z

    move-result p4

    if-eqz p4, :cond_11

    :cond_10
    iput-object v2, p0, Lcom/daaw/qy8;->d:Ljava/lang/Boolean;

    :cond_11
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-eqz p4, :cond_15

    if-eqz v1, :cond_15

    invoke-virtual {p3}, Lcom/daaw/we7;->U()Z

    move-result p4

    if-eqz p4, :cond_15

    invoke-virtual {p3}, Lcom/daaw/we7;->F()J

    move-result-wide p3

    if-eqz p1, :cond_12

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    :cond_12
    if-eqz v0, :cond_13

    iget-object p1, p0, Lcom/daaw/xz8;->g:Lcom/daaw/a06;

    invoke-virtual {p1}, Lcom/daaw/a06;->J()Z

    move-result p1

    if-eqz p1, :cond_13

    iget-object p1, p0, Lcom/daaw/xz8;->g:Lcom/daaw/a06;

    invoke-virtual {p1}, Lcom/daaw/a06;->K()Z

    move-result p1

    if-nez p1, :cond_13

    if-eqz p2, :cond_13

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    :cond_13
    iget-object p1, p0, Lcom/daaw/xz8;->g:Lcom/daaw/a06;

    invoke-virtual {p1}, Lcom/daaw/a06;->K()Z

    move-result p1

    if-eqz p1, :cond_14

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/qy8;->f:Ljava/lang/Long;

    goto :goto_7

    :cond_14
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/qy8;->e:Ljava/lang/Long;

    :cond_15
    :goto_7
    return v5
.end method
