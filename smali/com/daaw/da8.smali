.class public final Lcom/daaw/da8;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final a:Lcom/daaw/d18;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/g64;[B)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Lcom/daaw/d18;

    const/4 v0, 0x0

    invoke-direct {p3, p1, p2, v0}, Lcom/daaw/d18;-><init>(Landroid/content/Context;Lcom/daaw/g64;[B)V

    iput-object p3, p0, Lcom/daaw/da8;->a:Lcom/daaw/d18;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/d78;)Lcom/daaw/da8;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/da8;->a:Lcom/daaw/d18;

    iget-boolean v1, v0, Lcom/daaw/d18;->q:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lcom/daaw/uo4;->f(Z)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/daaw/bx7;

    invoke-direct {v1, p1}, Lcom/daaw/bx7;-><init>(Lcom/daaw/d78;)V

    iput-object v1, v0, Lcom/daaw/d18;->f:Lcom/daaw/iz6;

    return-object p0
.end method

.method public final b(Lcom/daaw/zv8;)Lcom/daaw/da8;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/da8;->a:Lcom/daaw/d18;

    iget-boolean v1, v0, Lcom/daaw/d18;->q:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lcom/daaw/uo4;->f(Z)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/daaw/dy7;

    invoke-direct {v1, p1}, Lcom/daaw/dy7;-><init>(Lcom/daaw/zv8;)V

    iput-object v1, v0, Lcom/daaw/d18;->e:Lcom/daaw/iz6;

    return-object p0
.end method

.method public final c()Lcom/daaw/ga8;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/da8;->a:Lcom/daaw/d18;

    iget-boolean v1, v0, Lcom/daaw/d18;->q:Z

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-static {v1}, Lcom/daaw/uo4;->f(Z)V

    iput-boolean v2, v0, Lcom/daaw/d18;->q:Z

    new-instance v1, Lcom/daaw/ga8;

    invoke-direct {v1, v0}, Lcom/daaw/ga8;-><init>(Lcom/daaw/d18;)V

    return-object v1
.end method
