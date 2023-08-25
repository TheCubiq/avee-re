.class public final Lcom/daaw/wf;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/wf$a;
    }
.end annotation


# static fields
.field public static final e:Lcom/daaw/wf;


# instance fields
.field public final a:Lcom/daaw/ml1;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/il0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/q70;

.field public final d:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/wf$a;

    invoke-direct {v0}, Lcom/daaw/wf$a;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/wf$a;->b()Lcom/daaw/wf;

    move-result-object v0

    sput-object v0, Lcom/daaw/wf;->e:Lcom/daaw/wf;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/ml1;Ljava/util/List;Lcom/daaw/q70;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ml1;",
            "Ljava/util/List<",
            "Lcom/daaw/il0;",
            ">;",
            "Lcom/daaw/q70;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wf;->a:Lcom/daaw/ml1;

    iput-object p2, p0, Lcom/daaw/wf;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/daaw/wf;->c:Lcom/daaw/q70;

    iput-object p4, p0, Lcom/daaw/wf;->d:Ljava/lang/String;

    return-void
.end method

.method public static e()Lcom/daaw/wf$a;
    .locals 1

    new-instance v0, Lcom/daaw/wf$a;

    invoke-direct {v0}, Lcom/daaw/wf$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/daaw/uz0;
        tag = 0x4
    .end annotation

    iget-object v0, p0, Lcom/daaw/wf;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/daaw/q70;
    .locals 1
    .annotation build Lcom/daaw/uz0;
        tag = 0x3
    .end annotation

    iget-object v0, p0, Lcom/daaw/wf;->c:Lcom/daaw/q70;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation build Lcom/daaw/uz0;
        tag = 0x2
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/il0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/wf;->b:Ljava/util/List;

    return-object v0
.end method

.method public d()Lcom/daaw/ml1;
    .locals 1
    .annotation build Lcom/daaw/uz0;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lcom/daaw/wf;->a:Lcom/daaw/ml1;

    return-object v0
.end method

.method public f()[B
    .locals 1

    invoke-static {p0}, Lcom/daaw/sz0;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method
