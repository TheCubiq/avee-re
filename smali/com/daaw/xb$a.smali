.class public Lcom/daaw/xb$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/xb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/qy2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, ""

    iput-object p1, p0, Lcom/daaw/xb$a;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/xb;
    .locals 2

    new-instance v0, Lcom/daaw/xb;

    invoke-direct {v0}, Lcom/daaw/xb;-><init>()V

    iget v1, p0, Lcom/daaw/xb$a;->a:I

    invoke-static {v0, v1}, Lcom/daaw/xb;->e(Lcom/daaw/xb;I)V

    iget-object v1, p0, Lcom/daaw/xb$a;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/xb;->d(Lcom/daaw/xb;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/daaw/xb$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/xb$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(I)Lcom/daaw/xb$a;
    .locals 0

    iput p1, p0, Lcom/daaw/xb$a;->a:I

    return-object p0
.end method
