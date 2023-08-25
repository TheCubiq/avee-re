.class public Lcom/daaw/j7$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/j7;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/rw1$a<",
        "Lcom/daaw/sx;",
        "Lcom/daaw/rx;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/j7;


# direct methods
.method public constructor <init>(Lcom/daaw/j7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j7$f;->a:Lcom/daaw/j7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/sx;Lcom/daaw/rx;)V
    .locals 9

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p2

    sget v0, Lcom/daaw/j5;->B:I

    iget-boolean v1, p1, Lcom/daaw/sx;->a:Z

    invoke-virtual {p2, v0, v1}, Lcom/daaw/j5;->a0(IZ)V

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p2

    sget v0, Lcom/daaw/j5;->Q:I

    iget v1, p1, Lcom/daaw/sx;->b:I

    invoke-virtual {p2, v0, v1}, Lcom/daaw/j5;->c0(II)V

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p2

    sget v0, Lcom/daaw/j5;->m0:I

    iget-object v1, p1, Lcom/daaw/sx;->c:Lcom/daaw/lv;

    invoke-static {v1}, Lcom/daaw/lv;->e(Lcom/daaw/lv;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/daaw/j5;->g0(ILjava/lang/String;)V

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p2

    sget v0, Lcom/daaw/j5;->R:I

    iget v1, p1, Lcom/daaw/sx;->d:F

    const/high16 v2, 0x447a0000    # 1000.0f

    mul-float v1, v1, v2

    float-to-int v1, v1

    invoke-virtual {p2, v0, v1}, Lcom/daaw/j5;->c0(II)V

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p2

    sget v0, Lcom/daaw/j5;->S:I

    iget v1, p1, Lcom/daaw/sx;->e:F

    mul-float v1, v1, v2

    float-to-int v1, v1

    invoke-virtual {p2, v0, v1}, Lcom/daaw/j5;->c0(II)V

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p2

    sget v0, Lcom/daaw/j5;->T:I

    iget v1, p1, Lcom/daaw/sx;->g:F

    mul-float v1, v1, v2

    float-to-int v1, v1

    invoke-virtual {p2, v0, v1}, Lcom/daaw/j5;->c0(II)V

    new-instance p2, Lcom/daaw/avee/comp/playback/b$c;

    invoke-direct {p2}, Lcom/daaw/avee/comp/playback/b$c;-><init>()V

    iget-object v0, p1, Lcom/daaw/sx;->f:Lcom/daaw/lv;

    iget-object v0, v0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    array-length v1, v0

    new-array v1, v1, [F

    array-length v0, v0

    new-array v8, v0, [F

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p1, Lcom/daaw/sx;->f:Lcom/daaw/lv;

    iget-object v4, v3, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    array-length v5, v4

    if-ge v2, v5, :cond_0

    aget-object v3, v4, v2

    iget v3, v3, Lcom/daaw/lv$a;->a:F

    aput v3, v8, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/daaw/j7$f;->a:Lcom/daaw/j7;

    invoke-static {v2}, Lcom/daaw/j7;->b(Lcom/daaw/j7;)Lcom/daaw/lv;

    move-result-object v4

    iget-object v2, p0, Lcom/daaw/j7$f;->a:Lcom/daaw/j7;

    invoke-static {v2}, Lcom/daaw/j7;->c(Lcom/daaw/j7;)Lcom/daaw/lv;

    move-result-object v5

    iget v6, p1, Lcom/daaw/sx;->d:F

    iget v7, p1, Lcom/daaw/sx;->e:F

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move v5, v6

    move v6, v7

    move-object v7, v1

    invoke-static/range {v2 .. v8}, Lcom/daaw/px;->b(Lcom/daaw/lv;Lcom/daaw/lv;Lcom/daaw/lv;FF[F[F)V

    iget-boolean v2, p1, Lcom/daaw/sx;->a:Z

    iput-boolean v2, p2, Lcom/daaw/avee/comp/playback/b$c;->a:Z

    iput-boolean v0, p2, Lcom/daaw/avee/comp/playback/b$c;->b:Z

    const/4 v0, -0x1

    iput v0, p2, Lcom/daaw/avee/comp/playback/b$c;->c:I

    iput-object v1, p2, Lcom/daaw/avee/comp/playback/b$c;->d:[F

    iget p1, p1, Lcom/daaw/sx;->g:F

    iput p1, p2, Lcom/daaw/avee/comp/playback/b$c;->e:F

    sget-object p1, Lcom/daaw/avee/comp/playback/c;->y:Lcom/daaw/iw1;

    invoke-virtual {p1, p2}, Lcom/daaw/iw1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/sx;

    check-cast p2, Lcom/daaw/rx;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/j7$f;->a(Lcom/daaw/sx;Lcom/daaw/rx;)V

    return-void
.end method
