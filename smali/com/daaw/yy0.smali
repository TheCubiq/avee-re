.class public final Lcom/daaw/yy0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xy0;


# instance fields
.field public final a:Lcom/daaw/b61;

.field public final b:Lcom/daaw/nx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/nx<",
            "Lcom/daaw/wy0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/b61;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yy0;->a:Lcom/daaw/b61;

    new-instance v0, Lcom/daaw/yy0$a;

    invoke-direct {v0, p0, p1}, Lcom/daaw/yy0$a;-><init>(Lcom/daaw/yy0;Lcom/daaw/b61;)V

    iput-object v0, p0, Lcom/daaw/yy0;->b:Lcom/daaw/nx;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/wy0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/yy0;->a:Lcom/daaw/b61;

    invoke-virtual {v0}, Lcom/daaw/b61;->b()V

    iget-object v0, p0, Lcom/daaw/yy0;->a:Lcom/daaw/b61;

    invoke-virtual {v0}, Lcom/daaw/b61;->c()V

    :try_start_0
    iget-object v0, p0, Lcom/daaw/yy0;->b:Lcom/daaw/nx;

    invoke-virtual {v0, p1}, Lcom/daaw/nx;->h(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/yy0;->a:Lcom/daaw/b61;

    invoke-virtual {p1}, Lcom/daaw/b61;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/daaw/yy0;->a:Lcom/daaw/b61;

    invoke-virtual {p1}, Lcom/daaw/b61;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/daaw/yy0;->a:Lcom/daaw/b61;

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    throw p1
.end method

.method public b(Ljava/lang/String;)Ljava/lang/Long;
    .locals 4

    const-string v0, "SELECT long_value FROM Preference where `key`=?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/e61;->q(Ljava/lang/String;I)Lcom/daaw/e61;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Lcom/daaw/e61;->F(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, Lcom/daaw/e61;->i(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/yy0;->a:Lcom/daaw/b61;

    invoke-virtual {p1}, Lcom/daaw/b61;->b()V

    iget-object p1, p0, Lcom/daaw/yy0;->a:Lcom/daaw/b61;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lcom/daaw/to;->b(Lcom/daaw/b61;Lcom/daaw/mi1;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lcom/daaw/e61;->D()V

    return-object v2

    :catchall_0
    move-exception v1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lcom/daaw/e61;->D()V

    throw v1
.end method
