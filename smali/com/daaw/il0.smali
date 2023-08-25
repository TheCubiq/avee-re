.class public final Lcom/daaw/il0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/il0$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/daaw/il0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/dl0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/il0$a;

    invoke-direct {v0}, Lcom/daaw/il0$a;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/il0$a;->a()Lcom/daaw/il0;

    move-result-object v0

    sput-object v0, Lcom/daaw/il0;->c:Lcom/daaw/il0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/dl0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/il0;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/il0;->b:Ljava/util/List;

    return-void
.end method

.method public static c()Lcom/daaw/il0$a;
    .locals 1

    new-instance v0, Lcom/daaw/il0$a;

    invoke-direct {v0}, Lcom/daaw/il0$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation build Lcom/daaw/uz0;
        tag = 0x2
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/dl0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/il0;->b:Ljava/util/List;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/daaw/uz0;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lcom/daaw/il0;->a:Ljava/lang/String;

    return-object v0
.end method
