.class public final Lcom/daaw/gc3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final v:Lcom/daaw/gc3;

.field public static final w:Lcom/daaw/th8;


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:Ljava/lang/CharSequence;

.field public final c:Ljava/lang/CharSequence;

.field public final d:Ljava/lang/CharSequence;

.field public final e:Ljava/lang/CharSequence;

.field public final f:[B

.field public final g:Ljava/lang/Integer;

.field public final h:Ljava/lang/Integer;

.field public final i:Ljava/lang/Integer;

.field public final j:Ljava/lang/Integer;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final k:Ljava/lang/Integer;

.field public final l:Ljava/lang/Integer;

.field public final m:Ljava/lang/Integer;

.field public final n:Ljava/lang/Integer;

.field public final o:Ljava/lang/Integer;

.field public final p:Ljava/lang/Integer;

.field public final q:Ljava/lang/CharSequence;

.field public final r:Ljava/lang/CharSequence;

.field public final s:Ljava/lang/CharSequence;

.field public final t:Ljava/lang/CharSequence;

.field public final u:Ljava/lang/CharSequence;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/x93;

    invoke-direct {v0}, Lcom/daaw/x93;-><init>()V

    new-instance v1, Lcom/daaw/gc3;

    invoke-direct {v1, v0}, Lcom/daaw/gc3;-><init>(Lcom/daaw/x93;)V

    sput-object v1, Lcom/daaw/gc3;->v:Lcom/daaw/gc3;

    sget-object v0, Lcom/daaw/p73;->a:Lcom/daaw/p73;

    sput-object v0, Lcom/daaw/gc3;->w:Lcom/daaw/th8;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/x93;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/x93;->e(Lcom/daaw/x93;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->a:Ljava/lang/CharSequence;

    invoke-static {p1}, Lcom/daaw/x93;->O(Lcom/daaw/x93;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->b:Ljava/lang/CharSequence;

    invoke-static {p1}, Lcom/daaw/x93;->N(Lcom/daaw/x93;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->c:Ljava/lang/CharSequence;

    invoke-static {p1}, Lcom/daaw/x93;->M(Lcom/daaw/x93;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->d:Ljava/lang/CharSequence;

    invoke-static {p1}, Lcom/daaw/x93;->b(Lcom/daaw/x93;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->e:Ljava/lang/CharSequence;

    invoke-static {p1}, Lcom/daaw/x93;->p(Lcom/daaw/x93;)[B

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->f:[B

    invoke-static {p1}, Lcom/daaw/x93;->g(Lcom/daaw/x93;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->g:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/daaw/x93;->o(Lcom/daaw/x93;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->h:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/daaw/x93;->n(Lcom/daaw/x93;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->i:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/daaw/x93;->j(Lcom/daaw/x93;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->j:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/daaw/x93;->j(Lcom/daaw/x93;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->k:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/daaw/x93;->i(Lcom/daaw/x93;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->l:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/daaw/x93;->h(Lcom/daaw/x93;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->m:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/daaw/x93;->m(Lcom/daaw/x93;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->n:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/daaw/x93;->l(Lcom/daaw/x93;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->o:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/daaw/x93;->k(Lcom/daaw/x93;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->p:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/daaw/x93;->f(Lcom/daaw/x93;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->q:Ljava/lang/CharSequence;

    invoke-static {p1}, Lcom/daaw/x93;->P(Lcom/daaw/x93;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->r:Ljava/lang/CharSequence;

    invoke-static {p1}, Lcom/daaw/x93;->a(Lcom/daaw/x93;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->s:Ljava/lang/CharSequence;

    invoke-static {p1}, Lcom/daaw/x93;->c(Lcom/daaw/x93;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc3;->t:Ljava/lang/CharSequence;

    invoke-static {p1}, Lcom/daaw/x93;->d(Lcom/daaw/x93;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/gc3;->u:Ljava/lang/CharSequence;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/x93;Lcom/daaw/cb3;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/gc3;-><init>(Lcom/daaw/x93;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/x93;
    .locals 2

    new-instance v0, Lcom/daaw/x93;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/x93;-><init>(Lcom/daaw/gc3;Lcom/daaw/t83;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lcom/daaw/gc3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lcom/daaw/gc3;

    iget-object v2, p0, Lcom/daaw/gc3;->a:Ljava/lang/CharSequence;

    iget-object v3, p1, Lcom/daaw/gc3;->a:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/gc3;->b:Ljava/lang/CharSequence;

    iget-object v3, p1, Lcom/daaw/gc3;->b:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/gc3;->c:Ljava/lang/CharSequence;

    iget-object v3, p1, Lcom/daaw/gc3;->c:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/gc3;->d:Ljava/lang/CharSequence;

    iget-object v3, p1, Lcom/daaw/gc3;->d:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    invoke-static {v2, v2}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2, v2}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gc3;->e:Ljava/lang/CharSequence;

    iget-object v4, p1, Lcom/daaw/gc3;->e:Ljava/lang/CharSequence;

    invoke-static {v3, v4}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2, v2}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2, v2}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gc3;->f:[B

    iget-object v4, p1, Lcom/daaw/gc3;->f:[B

    invoke-static {v3, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gc3;->g:Ljava/lang/Integer;

    iget-object v4, p1, Lcom/daaw/gc3;->g:Ljava/lang/Integer;

    invoke-static {v3, v4}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2, v2}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gc3;->h:Ljava/lang/Integer;

    iget-object v4, p1, Lcom/daaw/gc3;->h:Ljava/lang/Integer;

    invoke-static {v3, v4}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gc3;->i:Ljava/lang/Integer;

    iget-object v4, p1, Lcom/daaw/gc3;->i:Ljava/lang/Integer;

    invoke-static {v3, v4}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2, v2}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2, v2}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gc3;->k:Ljava/lang/Integer;

    iget-object v4, p1, Lcom/daaw/gc3;->k:Ljava/lang/Integer;

    invoke-static {v3, v4}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gc3;->l:Ljava/lang/Integer;

    iget-object v4, p1, Lcom/daaw/gc3;->l:Ljava/lang/Integer;

    invoke-static {v3, v4}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gc3;->m:Ljava/lang/Integer;

    iget-object v4, p1, Lcom/daaw/gc3;->m:Ljava/lang/Integer;

    invoke-static {v3, v4}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gc3;->n:Ljava/lang/Integer;

    iget-object v4, p1, Lcom/daaw/gc3;->n:Ljava/lang/Integer;

    invoke-static {v3, v4}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gc3;->o:Ljava/lang/Integer;

    iget-object v4, p1, Lcom/daaw/gc3;->o:Ljava/lang/Integer;

    invoke-static {v3, v4}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gc3;->p:Ljava/lang/Integer;

    iget-object v4, p1, Lcom/daaw/gc3;->p:Ljava/lang/Integer;

    invoke-static {v3, v4}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gc3;->q:Ljava/lang/CharSequence;

    iget-object v4, p1, Lcom/daaw/gc3;->q:Ljava/lang/CharSequence;

    invoke-static {v3, v4}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gc3;->r:Ljava/lang/CharSequence;

    iget-object v4, p1, Lcom/daaw/gc3;->r:Ljava/lang/CharSequence;

    invoke-static {v3, v4}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gc3;->s:Ljava/lang/CharSequence;

    iget-object v4, p1, Lcom/daaw/gc3;->s:Ljava/lang/CharSequence;

    invoke-static {v3, v4}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2, v2}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2, v2}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gc3;->t:Ljava/lang/CharSequence;

    iget-object v4, p1, Lcom/daaw/gc3;->t:Ljava/lang/CharSequence;

    invoke-static {v3, v4}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2, v2}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/gc3;->u:Ljava/lang/CharSequence;

    iget-object p1, p1, Lcom/daaw/gc3;->u:Ljava/lang/CharSequence;

    invoke-static {v2, p1}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    const/16 v0, 0x1e

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/gc3;->a:Ljava/lang/CharSequence;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/daaw/gc3;->b:Ljava/lang/CharSequence;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/daaw/gc3;->c:Ljava/lang/CharSequence;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/daaw/gc3;->d:Ljava/lang/CharSequence;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/4 v1, 0x4

    const/4 v2, 0x0

    aput-object v2, v0, v1

    const/4 v1, 0x5

    aput-object v2, v0, v1

    iget-object v1, p0, Lcom/daaw/gc3;->e:Ljava/lang/CharSequence;

    const/4 v3, 0x6

    aput-object v1, v0, v3

    const/4 v1, 0x7

    aput-object v2, v0, v1

    const/16 v1, 0x8

    aput-object v2, v0, v1

    iget-object v1, p0, Lcom/daaw/gc3;->f:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v3, 0x9

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/daaw/gc3;->g:Ljava/lang/Integer;

    const/16 v3, 0xa

    aput-object v1, v0, v3

    const/16 v1, 0xb

    aput-object v2, v0, v1

    iget-object v1, p0, Lcom/daaw/gc3;->h:Ljava/lang/Integer;

    const/16 v3, 0xc

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/daaw/gc3;->i:Ljava/lang/Integer;

    const/16 v3, 0xd

    aput-object v1, v0, v3

    const/16 v1, 0xe

    aput-object v2, v0, v1

    const/16 v1, 0xf

    aput-object v2, v0, v1

    iget-object v1, p0, Lcom/daaw/gc3;->k:Ljava/lang/Integer;

    const/16 v3, 0x10

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/daaw/gc3;->l:Ljava/lang/Integer;

    const/16 v3, 0x11

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/daaw/gc3;->m:Ljava/lang/Integer;

    const/16 v3, 0x12

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/daaw/gc3;->n:Ljava/lang/Integer;

    const/16 v3, 0x13

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/daaw/gc3;->o:Ljava/lang/Integer;

    const/16 v3, 0x14

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/daaw/gc3;->p:Ljava/lang/Integer;

    const/16 v3, 0x15

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/daaw/gc3;->q:Ljava/lang/CharSequence;

    const/16 v3, 0x16

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/daaw/gc3;->r:Ljava/lang/CharSequence;

    const/16 v3, 0x17

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/daaw/gc3;->s:Ljava/lang/CharSequence;

    const/16 v3, 0x18

    aput-object v1, v0, v3

    const/16 v1, 0x19

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    aput-object v2, v0, v1

    iget-object v1, p0, Lcom/daaw/gc3;->t:Ljava/lang/CharSequence;

    const/16 v3, 0x1b

    aput-object v1, v0, v3

    const/16 v1, 0x1c

    aput-object v2, v0, v1

    iget-object v1, p0, Lcom/daaw/gc3;->u:Ljava/lang/CharSequence;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
