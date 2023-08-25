.class public final Lcom/daaw/xw3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/f77;


# direct methods
.method public constructor <init>(Lcom/daaw/yw3;Lcom/daaw/f77;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/xw3;->a:Lcom/daaw/f77;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/lang/Void;

    invoke-static {}, Lcom/daaw/yw3;->d()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/xw3;->a:Lcom/daaw/f77;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    invoke-static {}, Lcom/daaw/yw3;->d()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/xw3;->a:Lcom/daaw/f77;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
