.class public Lcom/daaw/z20$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/uj;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/z20;->d(Landroid/content/Context;Lcom/daaw/x20;ILjava/util/concurrent/Executor;Lcom/daaw/ld;)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/uj<",
        "Lcom/daaw/z20$e;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ld;


# direct methods
.method public constructor <init>(Lcom/daaw/ld;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/z20$b;->a:Lcom/daaw/ld;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/z20$e;

    invoke-virtual {p0, p1}, Lcom/daaw/z20$b;->b(Lcom/daaw/z20$e;)V

    return-void
.end method

.method public b(Lcom/daaw/z20$e;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Lcom/daaw/z20$e;

    const/4 v0, -0x3

    invoke-direct {p1, v0}, Lcom/daaw/z20$e;-><init>(I)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/z20$b;->a:Lcom/daaw/ld;

    invoke-virtual {v0, p1}, Lcom/daaw/ld;->b(Lcom/daaw/z20$e;)V

    return-void
.end method
