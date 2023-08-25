.class public final Lcom/daaw/il0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/il0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/dl0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/il0$a;->a:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/il0$a;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/il0;
    .locals 3

    new-instance v0, Lcom/daaw/il0;

    iget-object v1, p0, Lcom/daaw/il0$a;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/il0$a;->b:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/il0;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public b(Ljava/util/List;)Lcom/daaw/il0$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/dl0;",
            ">;)",
            "Lcom/daaw/il0$a;"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/il0$a;->b:Ljava/util/List;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/daaw/il0$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/il0$a;->a:Ljava/lang/String;

    return-object p0
.end method
