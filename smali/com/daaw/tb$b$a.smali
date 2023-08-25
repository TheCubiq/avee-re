.class public Lcom/daaw/tb$b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/tb$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/daaw/kz0;

.field public b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/is2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic d(Lcom/daaw/tb$b$a;)Lcom/daaw/kz0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/tb$b$a;->a:Lcom/daaw/kz0;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/tb$b$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/daaw/tb$b$a;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a()Lcom/daaw/tb$b;
    .locals 2

    iget-object v0, p0, Lcom/daaw/tb$b$a;->a:Lcom/daaw/kz0;

    const-string v1, "ProductDetails is required for constructing ProductDetailsParams."

    invoke-static {v0, v1}, Lcom/daaw/jf8;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/tb$b$a;->b:Ljava/lang/String;

    const-string v1, "offerToken is required for constructing ProductDetailsParams."

    invoke-static {v0, v1}, Lcom/daaw/jf8;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/daaw/tb$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/tb$b;-><init>(Lcom/daaw/tb$b$a;Lcom/daaw/jt2;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/daaw/tb$b$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/tb$b$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Lcom/daaw/kz0;)Lcom/daaw/tb$b$a;
    .locals 1

    iput-object p1, p0, Lcom/daaw/tb$b$a;->a:Lcom/daaw/kz0;

    invoke-virtual {p1}, Lcom/daaw/kz0;->a()Lcom/daaw/kz0$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/kz0;->a()Lcom/daaw/kz0$a;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/daaw/kz0;->a()Lcom/daaw/kz0$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/kz0$a;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/tb$b$a;->b:Ljava/lang/String;

    :cond_0
    return-object p0
.end method
