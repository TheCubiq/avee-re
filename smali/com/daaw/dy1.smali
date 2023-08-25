.class public abstract Lcom/daaw/dy1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "AddedAbstractMethod"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Landroid/content/Context;)Lcom/daaw/dy1;
    .locals 0

    invoke-static {p0}, Lcom/daaw/ey1;->k(Landroid/content/Context;)Lcom/daaw/ey1;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/content/Context;Landroidx/work/a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/ey1;->e(Landroid/content/Context;Landroidx/work/a;)V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Lcom/daaw/qu0;
.end method

.method public final b(Lcom/daaw/oy1;)Lcom/daaw/qu0;
    .locals 0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/dy1;->c(Ljava/util/List;)Lcom/daaw/qu0;

    move-result-object p1

    return-object p1
.end method

.method public abstract c(Ljava/util/List;)Lcom/daaw/qu0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/daaw/oy1;",
            ">;)",
            "Lcom/daaw/qu0;"
        }
    .end annotation
.end method
