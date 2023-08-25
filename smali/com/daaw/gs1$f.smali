.class public abstract Lcom/daaw/gs1$f;
.super Lcom/daaw/gs1$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/gs1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "f"
.end annotation


# instance fields
.field public a:[Lcom/daaw/bw0$b;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/daaw/gs1$e;-><init>(Lcom/daaw/gs1$a;)V

    iput-object v0, p0, Lcom/daaw/gs1$f;->a:[Lcom/daaw/bw0$b;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/gs1$f;->c:I

    return-void
.end method

.method public constructor <init>(Lcom/daaw/gs1$f;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/daaw/gs1$e;-><init>(Lcom/daaw/gs1$a;)V

    iput-object v0, p0, Lcom/daaw/gs1$f;->a:[Lcom/daaw/bw0$b;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/gs1$f;->c:I

    iget-object v0, p1, Lcom/daaw/gs1$f;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/gs1$f;->b:Ljava/lang/String;

    iget v0, p1, Lcom/daaw/gs1$f;->d:I

    iput v0, p0, Lcom/daaw/gs1$f;->d:I

    iget-object p1, p1, Lcom/daaw/gs1$f;->a:[Lcom/daaw/bw0$b;

    invoke-static {p1}, Lcom/daaw/bw0;->f([Lcom/daaw/bw0$b;)[Lcom/daaw/bw0$b;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/gs1$f;->a:[Lcom/daaw/bw0$b;

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/graphics/Path;)V
    .locals 1

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lcom/daaw/gs1$f;->a:[Lcom/daaw/bw0$b;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lcom/daaw/bw0$b;->e([Lcom/daaw/bw0$b;Landroid/graphics/Path;)V

    :cond_0
    return-void
.end method

.method public getPathData()[Lcom/daaw/bw0$b;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gs1$f;->a:[Lcom/daaw/bw0$b;

    return-object v0
.end method

.method public getPathName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gs1$f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public setPathData([Lcom/daaw/bw0$b;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gs1$f;->a:[Lcom/daaw/bw0$b;

    invoke-static {v0, p1}, Lcom/daaw/bw0;->b([Lcom/daaw/bw0$b;[Lcom/daaw/bw0$b;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/daaw/bw0;->f([Lcom/daaw/bw0$b;)[Lcom/daaw/bw0$b;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/gs1$f;->a:[Lcom/daaw/bw0$b;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/gs1$f;->a:[Lcom/daaw/bw0$b;

    invoke-static {v0, p1}, Lcom/daaw/bw0;->j([Lcom/daaw/bw0$b;[Lcom/daaw/bw0$b;)V

    :goto_0
    return-void
.end method
