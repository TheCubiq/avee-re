.class public Lcom/daaw/pv1$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ww1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ww1$a<",
        "Ljava/util/List<",
        "Lcom/daaw/sv1;",
        ">;",
        "Lcom/daaw/ir1<",
        "Ljava/util/List<",
        "Landroid/graphics/Bitmap;",
        ">;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$f;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)Lcom/daaw/ir1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/sv1;",
            ">;)",
            "Lcom/daaw/ir1<",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/ir1;

    new-instance v1, Lcom/daaw/pv1$f$a;

    invoke-direct {v1, p0, p1}, Lcom/daaw/pv1$f$a;-><init>(Lcom/daaw/pv1$f;Ljava/util/List;)V

    invoke-direct {v0, v1}, Lcom/daaw/ir1;-><init>(Lcom/daaw/ir1$c;)V

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/daaw/pv1$f;->a(Ljava/util/List;)Lcom/daaw/ir1;

    move-result-object p1

    return-object p1
.end method
