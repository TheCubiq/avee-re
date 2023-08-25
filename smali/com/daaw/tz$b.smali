.class public final Lcom/daaw/tz$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/tz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/daaw/yw0;

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/daaw/bx0$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/wm1;

.field public final d:Z

.field public final e:I

.field public final f:I

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z


# direct methods
.method public constructor <init>(Lcom/daaw/yw0;Lcom/daaw/yw0;Ljava/util/Set;Lcom/daaw/wm1;ZIIZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/yw0;",
            "Lcom/daaw/yw0;",
            "Ljava/util/Set<",
            "Lcom/daaw/bx0$a;",
            ">;",
            "Lcom/daaw/wm1;",
            "ZIIZZZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tz$b;->a:Lcom/daaw/yw0;

    iput-object p3, p0, Lcom/daaw/tz$b;->b:Ljava/util/Set;

    iput-object p4, p0, Lcom/daaw/tz$b;->c:Lcom/daaw/wm1;

    iput-boolean p5, p0, Lcom/daaw/tz$b;->d:Z

    iput p6, p0, Lcom/daaw/tz$b;->e:I

    iput p7, p0, Lcom/daaw/tz$b;->f:I

    iput-boolean p8, p0, Lcom/daaw/tz$b;->g:Z

    iput-boolean p9, p0, Lcom/daaw/tz$b;->h:Z

    const/4 p3, 0x0

    const/4 p4, 0x1

    if-nez p10, :cond_1

    iget p5, p2, Lcom/daaw/yw0;->f:I

    iget p6, p1, Lcom/daaw/yw0;->f:I

    if-eq p5, p6, :cond_0

    goto :goto_0

    :cond_0
    const/4 p5, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p5, 0x1

    :goto_1
    iput-boolean p5, p0, Lcom/daaw/tz$b;->i:Z

    iget-object p5, p2, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iget-object p6, p1, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    if-ne p5, p6, :cond_3

    iget-object p5, p2, Lcom/daaw/yw0;->b:Ljava/lang/Object;

    iget-object p6, p1, Lcom/daaw/yw0;->b:Ljava/lang/Object;

    if-eq p5, p6, :cond_2

    goto :goto_2

    :cond_2
    const/4 p5, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 p5, 0x1

    :goto_3
    iput-boolean p5, p0, Lcom/daaw/tz$b;->j:Z

    iget-boolean p5, p2, Lcom/daaw/yw0;->g:Z

    iget-boolean p6, p1, Lcom/daaw/yw0;->g:Z

    if-eq p5, p6, :cond_4

    const/4 p5, 0x1

    goto :goto_4

    :cond_4
    const/4 p5, 0x0

    :goto_4
    iput-boolean p5, p0, Lcom/daaw/tz$b;->k:Z

    iget-object p2, p2, Lcom/daaw/yw0;->i:Lcom/daaw/xm1;

    iget-object p1, p1, Lcom/daaw/yw0;->i:Lcom/daaw/xm1;

    if-eq p2, p1, :cond_5

    const/4 p3, 0x1

    :cond_5
    iput-boolean p3, p0, Lcom/daaw/tz$b;->l:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/tz$b;->j:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/daaw/tz$b;->f:I

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/tz$b;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/bx0$a;

    iget-object v2, p0, Lcom/daaw/tz$b;->a:Lcom/daaw/yw0;

    iget-object v3, v2, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iget-object v2, v2, Lcom/daaw/yw0;->b:Ljava/lang/Object;

    iget v4, p0, Lcom/daaw/tz$b;->f:I

    invoke-interface {v1, v3, v2, v4}, Lcom/daaw/bx0$a;->v(Lcom/daaw/nl1;Ljava/lang/Object;I)V

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/tz$b;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/tz$b;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/bx0$a;

    iget v2, p0, Lcom/daaw/tz$b;->e:I

    invoke-interface {v1, v2}, Lcom/daaw/bx0$a;->e(I)V

    goto :goto_1

    :cond_2
    iget-boolean v0, p0, Lcom/daaw/tz$b;->l:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/tz$b;->c:Lcom/daaw/wm1;

    iget-object v1, p0, Lcom/daaw/tz$b;->a:Lcom/daaw/yw0;

    iget-object v1, v1, Lcom/daaw/yw0;->i:Lcom/daaw/xm1;

    iget-object v1, v1, Lcom/daaw/xm1;->d:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/daaw/wm1;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/tz$b;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/bx0$a;

    iget-object v2, p0, Lcom/daaw/tz$b;->a:Lcom/daaw/yw0;

    iget-object v3, v2, Lcom/daaw/yw0;->h:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v2, v2, Lcom/daaw/yw0;->i:Lcom/daaw/xm1;

    iget-object v2, v2, Lcom/daaw/xm1;->c:Lcom/daaw/um1;

    invoke-interface {v1, v3, v2}, Lcom/daaw/bx0$a;->m(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/um1;)V

    goto :goto_2

    :cond_3
    iget-boolean v0, p0, Lcom/daaw/tz$b;->k:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/daaw/tz$b;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/bx0$a;

    iget-object v2, p0, Lcom/daaw/tz$b;->a:Lcom/daaw/yw0;

    iget-boolean v2, v2, Lcom/daaw/yw0;->g:Z

    invoke-interface {v1, v2}, Lcom/daaw/bx0$a;->d(Z)V

    goto :goto_3

    :cond_4
    iget-boolean v0, p0, Lcom/daaw/tz$b;->i:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/daaw/tz$b;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/bx0$a;

    iget-boolean v2, p0, Lcom/daaw/tz$b;->h:Z

    iget-object v3, p0, Lcom/daaw/tz$b;->a:Lcom/daaw/yw0;

    iget v3, v3, Lcom/daaw/yw0;->f:I

    invoke-interface {v1, v2, v3}, Lcom/daaw/bx0$a;->s(ZI)V

    goto :goto_4

    :cond_5
    iget-boolean v0, p0, Lcom/daaw/tz$b;->g:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/daaw/tz$b;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/bx0$a;

    invoke-interface {v1}, Lcom/daaw/bx0$a;->g()V

    goto :goto_5

    :cond_6
    return-void
.end method
