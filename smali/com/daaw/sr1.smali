.class public Lcom/daaw/sr1;
.super Lcom/daaw/dc1;
.source ""


# instance fields
.field public j:Lcom/daaw/vp;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/dc1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/vp;

    invoke-direct {p1}, Lcom/daaw/vp;-><init>()V

    iput-object p1, p0, Lcom/daaw/sr1;->j:Lcom/daaw/vp;

    return-void
.end method

.method public static synthetic B(Lcom/daaw/sr1;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0}, Lcom/daaw/sr1;->C()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private synthetic C()Ljava/lang/Boolean;
    .locals 1

    iget v0, p0, Lcom/daaw/dc1;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public D(IZ[F)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v0, p2, p3, v1}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    return-void
.end method

.method public E(Ljava/lang/String;Z[F)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/dc1;->l(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/sr1;->D(IZ[F)V

    return-void
.end method

.method public finalize()V
    .locals 2

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    iget-object v0, p0, Lcom/daaw/sr1;->j:Lcom/daaw/vp;

    new-instance v1, Lcom/daaw/rr1;

    invoke-direct {v1, p0}, Lcom/daaw/rr1;-><init>(Lcom/daaw/sr1;)V

    invoke-virtual {v0, v1}, Lcom/daaw/vp;->a(Lcom/daaw/w40;)V

    return-void
.end method
