.class public Lcom/daaw/iy1$a;
.super Lcom/daaw/nx;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/iy1;-><init>(Lcom/daaw/b61;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/nx<",
        "Lcom/daaw/gy1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lcom/daaw/iy1;


# direct methods
.method public constructor <init>(Lcom/daaw/iy1;Lcom/daaw/b61;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/iy1$a;->d:Lcom/daaw/iy1;

    invoke-direct {p0, p2}, Lcom/daaw/nx;-><init>(Lcom/daaw/b61;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic g(Lcom/daaw/ni1;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/daaw/gy1;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/iy1$a;->i(Lcom/daaw/ni1;Lcom/daaw/gy1;)V

    return-void
.end method

.method public i(Lcom/daaw/ni1;Lcom/daaw/gy1;)V
    .locals 2

    iget-object v0, p2, Lcom/daaw/gy1;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lcom/daaw/li1;->F(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Lcom/daaw/li1;->i(ILjava/lang/String;)V

    :goto_0
    iget-object p2, p2, Lcom/daaw/gy1;->b:Ljava/lang/String;

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, Lcom/daaw/li1;->F(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v0, p2}, Lcom/daaw/li1;->i(ILjava/lang/String;)V

    :goto_1
    return-void
.end method
