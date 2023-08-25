.class public Lcom/daaw/aj1$a;
.super Lcom/daaw/nx;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/aj1;-><init>(Lcom/daaw/b61;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/nx<",
        "Lcom/daaw/yi1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lcom/daaw/aj1;


# direct methods
.method public constructor <init>(Lcom/daaw/aj1;Lcom/daaw/b61;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/aj1$a;->d:Lcom/daaw/aj1;

    invoke-direct {p0, p2}, Lcom/daaw/nx;-><init>(Lcom/daaw/b61;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic g(Lcom/daaw/ni1;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/daaw/yi1;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/aj1$a;->i(Lcom/daaw/ni1;Lcom/daaw/yi1;)V

    return-void
.end method

.method public i(Lcom/daaw/ni1;Lcom/daaw/yi1;)V
    .locals 3

    iget-object v0, p2, Lcom/daaw/yi1;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lcom/daaw/li1;->F(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Lcom/daaw/li1;->i(ILjava/lang/String;)V

    :goto_0
    const/4 v0, 0x2

    iget p2, p2, Lcom/daaw/yi1;->b:I

    int-to-long v1, p2

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/li1;->r(IJ)V

    return-void
.end method
