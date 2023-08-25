.class public final Lcom/daaw/it1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/daaw/ht1;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/z40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/z40<",
            "Lcom/daaw/hn;",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lcom/daaw/z40;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
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

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/it1;->a:Ljava/lang/Class;

    iput-object p2, p0, Lcom/daaw/it1;->b:Lcom/daaw/z40;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/it1;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public final b()Lcom/daaw/z40;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/z40<",
            "Lcom/daaw/hn;",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/it1;->b:Lcom/daaw/z40;

    return-object v0
.end method
