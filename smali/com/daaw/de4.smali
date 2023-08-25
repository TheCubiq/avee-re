.class public Lcom/daaw/de4;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final A:Lcom/daaw/de4;

.field public static final B:Lcom/daaw/de4;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final C:Lcom/daaw/th8;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:Z

.field public final l:Lcom/daaw/y17;

.field public final m:I

.field public final n:Lcom/daaw/y17;

.field public final o:I

.field public final p:I

.field public final q:I

.field public final r:Lcom/daaw/y17;

.field public final s:Lcom/daaw/y17;

.field public final t:I

.field public final u:I

.field public final v:Z

.field public final w:Z

.field public final x:Z

.field public final y:Lcom/daaw/b27;

.field public final z:Lcom/daaw/d27;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/bd4;

    invoke-direct {v0}, Lcom/daaw/bd4;-><init>()V

    new-instance v1, Lcom/daaw/de4;

    invoke-direct {v1, v0}, Lcom/daaw/de4;-><init>(Lcom/daaw/bd4;)V

    sput-object v1, Lcom/daaw/de4;->A:Lcom/daaw/de4;

    sput-object v1, Lcom/daaw/de4;->B:Lcom/daaw/de4;

    sget-object v0, Lcom/daaw/yb4;->a:Lcom/daaw/yb4;

    sput-object v0, Lcom/daaw/de4;->C:Lcom/daaw/th8;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/bd4;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lcom/daaw/de4;->a:I

    iput v0, p0, Lcom/daaw/de4;->b:I

    iput v0, p0, Lcom/daaw/de4;->c:I

    iput v0, p0, Lcom/daaw/de4;->d:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/de4;->e:I

    iput v1, p0, Lcom/daaw/de4;->f:I

    iput v1, p0, Lcom/daaw/de4;->g:I

    iput v1, p0, Lcom/daaw/de4;->h:I

    invoke-static {p1}, Lcom/daaw/bd4;->c(Lcom/daaw/bd4;)I

    move-result v2

    iput v2, p0, Lcom/daaw/de4;->i:I

    invoke-static {p1}, Lcom/daaw/bd4;->b(Lcom/daaw/bd4;)I

    move-result v2

    iput v2, p0, Lcom/daaw/de4;->j:I

    invoke-static {p1}, Lcom/daaw/bd4;->l(Lcom/daaw/bd4;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/de4;->k:Z

    invoke-static {p1}, Lcom/daaw/bd4;->i(Lcom/daaw/bd4;)Lcom/daaw/y17;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/de4;->l:Lcom/daaw/y17;

    iput v1, p0, Lcom/daaw/de4;->m:I

    invoke-static {p1}, Lcom/daaw/bd4;->f(Lcom/daaw/bd4;)Lcom/daaw/y17;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/de4;->n:Lcom/daaw/y17;

    iput v1, p0, Lcom/daaw/de4;->o:I

    iput v0, p0, Lcom/daaw/de4;->p:I

    iput v0, p0, Lcom/daaw/de4;->q:I

    invoke-static {p1}, Lcom/daaw/bd4;->g(Lcom/daaw/bd4;)Lcom/daaw/y17;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/de4;->r:Lcom/daaw/y17;

    invoke-static {p1}, Lcom/daaw/bd4;->h(Lcom/daaw/bd4;)Lcom/daaw/y17;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/de4;->s:Lcom/daaw/y17;

    invoke-static {p1}, Lcom/daaw/bd4;->a(Lcom/daaw/bd4;)I

    move-result v0

    iput v0, p0, Lcom/daaw/de4;->t:I

    iput v1, p0, Lcom/daaw/de4;->u:I

    iput-boolean v1, p0, Lcom/daaw/de4;->v:Z

    iput-boolean v1, p0, Lcom/daaw/de4;->w:Z

    iput-boolean v1, p0, Lcom/daaw/de4;->x:Z

    invoke-static {p1}, Lcom/daaw/bd4;->j(Lcom/daaw/bd4;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/b27;->c(Ljava/util/Map;)Lcom/daaw/b27;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/de4;->y:Lcom/daaw/b27;

    invoke-static {p1}, Lcom/daaw/bd4;->k(Lcom/daaw/bd4;)Ljava/util/HashSet;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/d27;->r(Ljava/util/Collection;)Lcom/daaw/d27;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/de4;->z:Lcom/daaw/d27;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/daaw/de4;

    iget-boolean v2, p0, Lcom/daaw/de4;->k:Z

    iget-boolean v3, p1, Lcom/daaw/de4;->k:Z

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/daaw/de4;->i:I

    iget v3, p1, Lcom/daaw/de4;->i:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/daaw/de4;->j:I

    iget v3, p1, Lcom/daaw/de4;->j:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/daaw/de4;->l:Lcom/daaw/y17;

    iget-object v3, p1, Lcom/daaw/de4;->l:Lcom/daaw/y17;

    invoke-virtual {v2, v3}, Lcom/daaw/y17;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/de4;->n:Lcom/daaw/y17;

    iget-object v3, p1, Lcom/daaw/de4;->n:Lcom/daaw/y17;

    invoke-virtual {v2, v3}, Lcom/daaw/y17;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/de4;->r:Lcom/daaw/y17;

    iget-object v3, p1, Lcom/daaw/de4;->r:Lcom/daaw/y17;

    invoke-virtual {v2, v3}, Lcom/daaw/y17;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/de4;->s:Lcom/daaw/y17;

    iget-object v3, p1, Lcom/daaw/de4;->s:Lcom/daaw/y17;

    invoke-virtual {v2, v3}, Lcom/daaw/y17;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lcom/daaw/de4;->t:I

    iget v3, p1, Lcom/daaw/de4;->t:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/daaw/de4;->y:Lcom/daaw/b27;

    iget-object v3, p1, Lcom/daaw/de4;->y:Lcom/daaw/b27;

    invoke-virtual {v2, v3}, Lcom/daaw/b27;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/de4;->z:Lcom/daaw/d27;

    iget-object p1, p1, Lcom/daaw/de4;->z:Lcom/daaw/d27;

    invoke-virtual {v2, p1}, Lcom/daaw/d27;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/de4;->k:Z

    const v1, -0x3e773ea1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/daaw/de4;->i:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/daaw/de4;->j:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/de4;->l:Lcom/daaw/y17;

    invoke-virtual {v1}, Lcom/daaw/y17;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3c1

    iget-object v1, p0, Lcom/daaw/de4;->n:Lcom/daaw/y17;

    invoke-virtual {v1}, Lcom/daaw/y17;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3c1

    const v1, 0x7fffffff

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/de4;->r:Lcom/daaw/y17;

    invoke-virtual {v1}, Lcom/daaw/y17;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/de4;->s:Lcom/daaw/y17;

    invoke-virtual {v1}, Lcom/daaw/y17;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/daaw/de4;->t:I

    add-int/2addr v0, v1

    const v1, 0x1b4d89f

    mul-int v0, v0, v1

    iget-object v1, p0, Lcom/daaw/de4;->y:Lcom/daaw/b27;

    invoke-virtual {v1}, Lcom/daaw/b27;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/de4;->z:Lcom/daaw/d27;

    invoke-virtual {v1}, Lcom/daaw/d27;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
