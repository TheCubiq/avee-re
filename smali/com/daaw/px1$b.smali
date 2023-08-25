.class public final Lcom/daaw/px1$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/px1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/daaw/px1$f;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Lcom/daaw/px1$e;

    invoke-direct {v0}, Lcom/daaw/px1$e;-><init>()V

    :goto_0
    iput-object v0, p0, Lcom/daaw/px1$b;->a:Lcom/daaw/px1$f;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, Lcom/daaw/px1$d;

    invoke-direct {v0}, Lcom/daaw/px1$d;-><init>()V

    goto :goto_0

    :cond_1
    const/16 v1, 0x14

    if-lt v0, v1, :cond_2

    new-instance v0, Lcom/daaw/px1$c;

    invoke-direct {v0}, Lcom/daaw/px1$c;-><init>()V

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/daaw/px1$f;

    invoke-direct {v0}, Lcom/daaw/px1$f;-><init>()V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public constructor <init>(Lcom/daaw/px1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Lcom/daaw/px1$e;

    invoke-direct {v0, p1}, Lcom/daaw/px1$e;-><init>(Lcom/daaw/px1;)V

    :goto_0
    iput-object v0, p0, Lcom/daaw/px1$b;->a:Lcom/daaw/px1$f;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, Lcom/daaw/px1$d;

    invoke-direct {v0, p1}, Lcom/daaw/px1$d;-><init>(Lcom/daaw/px1;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x14

    if-lt v0, v1, :cond_2

    new-instance v0, Lcom/daaw/px1$c;

    invoke-direct {v0, p1}, Lcom/daaw/px1$c;-><init>(Lcom/daaw/px1;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/daaw/px1$f;

    invoke-direct {v0, p1}, Lcom/daaw/px1$f;-><init>(Lcom/daaw/px1;)V

    goto :goto_0

    :goto_1
    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/px1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1$b;->a:Lcom/daaw/px1$f;

    invoke-virtual {v0}, Lcom/daaw/px1$f;->b()Lcom/daaw/px1;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/daaw/gg0;)Lcom/daaw/px1$b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/px1$b;->a:Lcom/daaw/px1$f;

    invoke-virtual {v0, p1}, Lcom/daaw/px1$f;->d(Lcom/daaw/gg0;)V

    return-object p0
.end method

.method public c(Lcom/daaw/gg0;)Lcom/daaw/px1$b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/px1$b;->a:Lcom/daaw/px1$f;

    invoke-virtual {v0, p1}, Lcom/daaw/px1$f;->f(Lcom/daaw/gg0;)V

    return-object p0
.end method
