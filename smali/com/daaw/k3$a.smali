.class public abstract Lcom/daaw/k3$a;
.super Lcom/daaw/k3$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/k3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/daaw/k3$f;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/k3$e<",
        "TT;TO;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/k3$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/xf;Ljava/lang/Object;Lcom/daaw/ej;Lcom/daaw/du0;)Lcom/daaw/k3$f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/Looper;",
            "Lcom/daaw/xf;",
            "TO;",
            "Lcom/daaw/ej;",
            "Lcom/daaw/du0;",
            ")TT;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "buildClient must be implemented"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/xf;Ljava/lang/Object;Lcom/daaw/y70$a;Lcom/daaw/y70$b;)Lcom/daaw/k3$f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/Looper;",
            "Lcom/daaw/xf;",
            "TO;",
            "Lcom/daaw/y70$a;",
            "Lcom/daaw/y70$b;",
            ")TT;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual/range {p0 .. p6}, Lcom/daaw/k3$a;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/xf;Ljava/lang/Object;Lcom/daaw/ej;Lcom/daaw/du0;)Lcom/daaw/k3$f;

    move-result-object p1

    return-object p1
.end method
