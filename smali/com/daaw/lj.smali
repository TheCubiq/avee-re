.class public Lcom/daaw/lj;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/lj$b;
    }
.end annotation


# instance fields
.field public a:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/daaw/lj;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/qj;

.field public final c:Lcom/daaw/lj$b;

.field public d:Lcom/daaw/lj;

.field public e:I

.field public f:I

.field public g:Lcom/daaw/de1;


# direct methods
.method public constructor <init>(Lcom/daaw/qj;Lcom/daaw/lj$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/lj;->a:Ljava/util/HashSet;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/lj;->e:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/lj;->f:I

    iput-object p1, p0, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    iput-object p2, p0, Lcom/daaw/lj;->c:Lcom/daaw/lj$b;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/lj;IIZ)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/lj;->k()V

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p4, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/lj;->j(Lcom/daaw/lj;)Z

    move-result p4

    if-nez p4, :cond_1

    return v1

    :cond_1
    iput-object p1, p0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    iget-object p4, p1, Lcom/daaw/lj;->a:Ljava/util/HashSet;

    if-nez p4, :cond_2

    new-instance p4, Ljava/util/HashSet;

    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    iput-object p4, p1, Lcom/daaw/lj;->a:Ljava/util/HashSet;

    :cond_2
    iget-object p1, p0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    iget-object p1, p1, Lcom/daaw/lj;->a:Ljava/util/HashSet;

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-lez p2, :cond_3

    iput p2, p0, Lcom/daaw/lj;->e:I

    goto :goto_0

    :cond_3
    iput v1, p0, Lcom/daaw/lj;->e:I

    :goto_0
    iput p3, p0, Lcom/daaw/lj;->f:I

    return v0
.end method

.method public b()I
    .locals 3

    iget-object v0, p0, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->M()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lcom/daaw/lj;->f:I

    const/4 v2, -0x1

    if-le v0, v2, :cond_1

    iget-object v0, p0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    invoke-virtual {v0}, Lcom/daaw/qj;->M()I

    move-result v0

    if-ne v0, v1, :cond_1

    iget v0, p0, Lcom/daaw/lj;->f:I

    return v0

    :cond_1
    iget v0, p0, Lcom/daaw/lj;->e:I

    return v0
.end method

.method public final c()Lcom/daaw/lj;
    .locals 2

    sget-object v0, Lcom/daaw/lj$a;->a:[I

    iget-object v1, p0, Lcom/daaw/lj;->c:Lcom/daaw/lj$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    iget-object v1, p0, Lcom/daaw/lj;->c:Lcom/daaw/lj$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    return-object v0

    :pswitch_4
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public d()Lcom/daaw/qj;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    return-object v0
.end method

.method public e()Lcom/daaw/de1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lj;->g:Lcom/daaw/de1;

    return-object v0
.end method

.method public f()Lcom/daaw/lj;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    return-object v0
.end method

.method public g()Lcom/daaw/lj$b;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lj;->c:Lcom/daaw/lj$b;

    return-object v0
.end method

.method public h()Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/lj;->a:Ljava/util/HashSet;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/lj;

    invoke-virtual {v2}, Lcom/daaw/lj;->c()Lcom/daaw/lj;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/lj;->i()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(Lcom/daaw/lj;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/lj;->g()Lcom/daaw/lj$b;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/lj;->c:Lcom/daaw/lj$b;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_3

    sget-object v1, Lcom/daaw/lj$b;->u:Lcom/daaw/lj$b;

    if-ne v2, v1, :cond_2

    invoke-virtual {p1}, Lcom/daaw/lj;->d()Lcom/daaw/qj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/qj;->Q()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/lj;->d()Lcom/daaw/qj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/qj;->Q()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    return v0

    :cond_2
    return v3

    :cond_3
    sget-object v4, Lcom/daaw/lj$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/AssertionError;

    iget-object v0, p0, Lcom/daaw/lj;->c:Lcom/daaw/lj$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_0
    return v0

    :pswitch_1
    sget-object v2, Lcom/daaw/lj$b;->r:Lcom/daaw/lj$b;

    if-eq v1, v2, :cond_5

    sget-object v2, Lcom/daaw/lj$b;->t:Lcom/daaw/lj$b;

    if-ne v1, v2, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v2, 0x1

    :goto_1
    invoke-virtual {p1}, Lcom/daaw/lj;->d()Lcom/daaw/qj;

    move-result-object p1

    instance-of p1, p1, Lcom/daaw/k80;

    if-eqz p1, :cond_8

    if-nez v2, :cond_6

    sget-object p1, Lcom/daaw/lj$b;->x:Lcom/daaw/lj$b;

    if-ne v1, p1, :cond_7

    :cond_6
    const/4 v0, 0x1

    :cond_7
    move v2, v0

    :cond_8
    return v2

    :pswitch_2
    sget-object v2, Lcom/daaw/lj$b;->q:Lcom/daaw/lj$b;

    if-eq v1, v2, :cond_a

    sget-object v2, Lcom/daaw/lj$b;->s:Lcom/daaw/lj$b;

    if-ne v1, v2, :cond_9

    goto :goto_2

    :cond_9
    const/4 v2, 0x0

    goto :goto_3

    :cond_a
    :goto_2
    const/4 v2, 0x1

    :goto_3
    invoke-virtual {p1}, Lcom/daaw/lj;->d()Lcom/daaw/qj;

    move-result-object p1

    instance-of p1, p1, Lcom/daaw/k80;

    if-eqz p1, :cond_d

    if-nez v2, :cond_b

    sget-object p1, Lcom/daaw/lj$b;->w:Lcom/daaw/lj$b;

    if-ne v1, p1, :cond_c

    :cond_b
    const/4 v0, 0x1

    :cond_c
    move v2, v0

    :cond_d
    return v2

    :pswitch_3
    sget-object p1, Lcom/daaw/lj$b;->u:Lcom/daaw/lj$b;

    if-eq v1, p1, :cond_e

    sget-object p1, Lcom/daaw/lj$b;->w:Lcom/daaw/lj$b;

    if-eq v1, p1, :cond_e

    sget-object p1, Lcom/daaw/lj$b;->x:Lcom/daaw/lj$b;

    if-eq v1, p1, :cond_e

    const/4 v0, 0x1

    :cond_e
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public k()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/daaw/lj;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/lj;->e:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/lj;->f:I

    return-void
.end method

.method public l(Lcom/daaw/gd;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/lj;->g:Lcom/daaw/de1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/daaw/de1;

    sget-object v0, Lcom/daaw/de1$a;->p:Lcom/daaw/de1$a;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/daaw/de1;-><init>(Lcom/daaw/de1$a;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/lj;->g:Lcom/daaw/de1;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/de1;->d()V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    invoke-virtual {v1}, Lcom/daaw/qj;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/lj;->c:Lcom/daaw/lj$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
