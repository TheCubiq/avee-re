.class public Lcom/daaw/yy0$a;
.super Lcom/daaw/nx;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/yy0;-><init>(Lcom/daaw/b61;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/nx<",
        "Lcom/daaw/wy0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lcom/daaw/yy0;


# direct methods
.method public constructor <init>(Lcom/daaw/yy0;Lcom/daaw/b61;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yy0$a;->d:Lcom/daaw/yy0;

    invoke-direct {p0, p2}, Lcom/daaw/nx;-><init>(Lcom/daaw/b61;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic g(Lcom/daaw/ni1;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/daaw/wy0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/yy0$a;->i(Lcom/daaw/ni1;Lcom/daaw/wy0;)V

    return-void
.end method

.method public i(Lcom/daaw/ni1;Lcom/daaw/wy0;)V
    .locals 3

    iget-object v0, p2, Lcom/daaw/wy0;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lcom/daaw/li1;->F(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Lcom/daaw/li1;->i(ILjava/lang/String;)V

    :goto_0
    iget-object p2, p2, Lcom/daaw/wy0;->b:Ljava/lang/Long;

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, Lcom/daaw/li1;->F(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/li1;->r(IJ)V

    :goto_1
    return-void
.end method
