.class public final synthetic Lcom/daaw/kt1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/jt1$b;->a:Lcom/daaw/jt1$b$a;

    return-void
.end method

.method public static a(Lcom/daaw/jt1$b;Ljava/lang/Class;)Lcom/daaw/ht1;
    .locals 0

    const-string p0, "modelClass"

    invoke-static {p1, p0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method."

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lcom/daaw/jt1$b;Ljava/lang/Class;Lcom/daaw/hn;)Lcom/daaw/ht1;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lcom/daaw/jt1$b;->a(Ljava/lang/Class;)Lcom/daaw/ht1;

    move-result-object p0

    return-object p0
.end method
