.class public Lcom/daaw/oe0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V::",
        "Ljava/util/List<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public c:Lcom/daaw/gz1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/gz1<",
            "TT;TV;>;"
        }
    .end annotation
.end field

.field public d:Lcom/daaw/w40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/w40<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/gz1$a;Lcom/daaw/w40;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/daaw/gz1$a<",
            "TT;>;",
            "Lcom/daaw/w40<",
            "TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/gz1;

    invoke-direct {v0, p3, p4}, Lcom/daaw/gz1;-><init>(Lcom/daaw/gz1$a;Lcom/daaw/w40;)V

    iput-object v0, p0, Lcom/daaw/oe0;->c:Lcom/daaw/gz1;

    iput-object p4, p0, Lcom/daaw/oe0;->d:Lcom/daaw/w40;

    iput-object p1, p0, Lcom/daaw/oe0;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/oe0;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/ir1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/ir1<",
            "Lcom/daaw/lo1<",
            "TV;",
            "Lcom/daaw/wf1;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/oe0;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/oe0;->b:Ljava/lang/String;

    new-instance v2, Lcom/daaw/oe0$a;

    invoke-direct {v2, p0}, Lcom/daaw/oe0$a;-><init>(Lcom/daaw/oe0;)V

    const/16 v3, 0x2d0

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/tc1;->g(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/s40;I)Lcom/daaw/ir1;

    move-result-object v0

    return-object v0
.end method
