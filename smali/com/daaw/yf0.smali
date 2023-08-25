.class public final Lcom/daaw/yf0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/it1<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/yf0;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/di0;Lcom/daaw/z40;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/daaw/ht1;",
            ">(",
            "Lcom/daaw/di0<",
            "TT;>;",
            "Lcom/daaw/z40<",
            "-",
            "Lcom/daaw/hn;",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initializer"

    invoke-static {p2, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/yf0;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/it1;

    invoke-static {p1}, Lcom/daaw/bi0;->a(Lcom/daaw/di0;)Ljava/lang/Class;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Lcom/daaw/it1;-><init>(Ljava/lang/Class;Lcom/daaw/z40;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b()Lcom/daaw/jt1$b;
    .locals 3

    new-instance v0, Lcom/daaw/xf0;

    iget-object v1, p0, Lcom/daaw/yf0;->a:Ljava/util/List;

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/daaw/it1;

    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v1, [Lcom/daaw/it1;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/daaw/it1;

    invoke-direct {v0, v1}, Lcom/daaw/xf0;-><init>([Lcom/daaw/it1;)V

    return-object v0
.end method
