.class public abstract Lcom/daaw/rw6;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static j()Lcom/daaw/qw6;
    .locals 2

    new-instance v0, Lcom/daaw/tv6;

    invoke-direct {v0}, Lcom/daaw/tv6;-><init>()V

    const v1, 0x800053

    invoke-virtual {v0, v1}, Lcom/daaw/tv6;->d(I)Lcom/daaw/qw6;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {v0, v1}, Lcom/daaw/qw6;->e(F)Lcom/daaw/qw6;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/qw6;->c(I)Lcom/daaw/qw6;

    invoke-virtual {v0, v1}, Lcom/daaw/qw6;->f(Z)Lcom/daaw/qw6;

    return-object v0
.end method


# virtual methods
.method public abstract a()F
.end method

.method public abstract b()I
.end method

.method public abstract c()I
.end method

.method public abstract d()I
.end method

.method public abstract e()Landroid/os/IBinder;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()Ljava/lang/String;
.end method

.method public abstract i()Z
.end method
