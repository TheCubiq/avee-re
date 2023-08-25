.class public final Lcom/daaw/wf$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/wf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/daaw/ml1;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/il0;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lcom/daaw/q70;

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/wf$a;->a:Lcom/daaw/ml1;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/daaw/wf$a;->b:Ljava/util/List;

    iput-object v0, p0, Lcom/daaw/wf$a;->c:Lcom/daaw/q70;

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/wf$a;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/il0;)Lcom/daaw/wf$a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/wf$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Lcom/daaw/wf;
    .locals 5

    new-instance v0, Lcom/daaw/wf;

    iget-object v1, p0, Lcom/daaw/wf$a;->a:Lcom/daaw/ml1;

    iget-object v2, p0, Lcom/daaw/wf$a;->b:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/wf$a;->c:Lcom/daaw/q70;

    iget-object v4, p0, Lcom/daaw/wf$a;->d:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/wf;-><init>(Lcom/daaw/ml1;Ljava/util/List;Lcom/daaw/q70;Ljava/lang/String;)V

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lcom/daaw/wf$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/wf$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public d(Lcom/daaw/q70;)Lcom/daaw/wf$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/wf$a;->c:Lcom/daaw/q70;

    return-object p0
.end method

.method public e(Lcom/daaw/ml1;)Lcom/daaw/wf$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/wf$a;->a:Lcom/daaw/ml1;

    return-object p0
.end method
