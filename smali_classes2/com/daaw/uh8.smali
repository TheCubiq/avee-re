.class public final Lcom/daaw/uh8;
.super Lcom/daaw/k3$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/k3$a<",
        "Lcom/daaw/hl4;",
        "Lcom/daaw/k3$d$c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/k3$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/xf;Ljava/lang/Object;Lcom/daaw/ej;Lcom/daaw/du0;)Lcom/daaw/k3$f;
    .locals 6

    check-cast p4, Lcom/daaw/k3$d$c;

    new-instance p4, Lcom/daaw/hl4;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/daaw/hl4;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/xf;Lcom/daaw/ej;Lcom/daaw/du0;)V

    return-object p4
.end method
