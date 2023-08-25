.class public Lcom/daaw/ix1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static b:Lcom/daaw/ix1;


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ix1;

    invoke-direct {v0}, Lcom/daaw/ix1;-><init>()V

    sput-object v0, Lcom/daaw/ix1;->b:Lcom/daaw/ix1;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/ix1;->a:Ljava/util/List;

    sget-object v0, Lcom/daaw/wo0;->a:Lcom/daaw/uw1;

    new-instance v1, Lcom/daaw/ix1$a;

    invoke-direct {v1, p0}, Lcom/daaw/ix1$a;-><init>(Lcom/daaw/ix1;)V

    iget-object v2, p0, Lcom/daaw/ix1;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/uw1;->b(Lcom/daaw/uw1$a;Ljava/util/List;)V

    return-void
.end method

.method public static a()Lcom/daaw/ix1;
    .locals 1

    sget-object v0, Lcom/daaw/ix1;->b:Lcom/daaw/ix1;

    return-object v0
.end method
