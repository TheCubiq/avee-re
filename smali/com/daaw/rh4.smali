.class public final Lcom/daaw/rh4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lcom/daaw/a74;

.field public final c:Lcom/daaw/uh6;

.field public final d:I

.field public final e:Z

.field public final f:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/daaw/a74;Lcom/daaw/uh6;IZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rh4;->a:Landroid/view/View;

    iput-object p2, p0, Lcom/daaw/rh4;->b:Lcom/daaw/a74;

    iput-object p3, p0, Lcom/daaw/rh4;->c:Lcom/daaw/uh6;

    iput p4, p0, Lcom/daaw/rh4;->d:I

    iput-boolean p5, p0, Lcom/daaw/rh4;->e:Z

    iput-boolean p6, p0, Lcom/daaw/rh4;->f:Z

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/daaw/rh4;->d:I

    return v0
.end method

.method public final b()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rh4;->a:Landroid/view/View;

    return-object v0
.end method

.method public final c()Lcom/daaw/a74;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rh4;->b:Lcom/daaw/a74;

    return-object v0
.end method

.method public final d()Lcom/daaw/uh6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rh4;->c:Lcom/daaw/uh6;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/rh4;->e:Z

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/rh4;->f:Z

    return v0
.end method
