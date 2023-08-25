.class public final Lcom/daaw/xb;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/xb$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lcom/daaw/xb$a;
    .locals 2

    new-instance v0, Lcom/daaw/xb$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/xb$a;-><init>(Lcom/daaw/qy2;)V

    return-object v0
.end method

.method public static bridge synthetic d(Lcom/daaw/xb;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xb;->b:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic e(Lcom/daaw/xb;I)V
    .locals 0

    iput p1, p0, Lcom/daaw/xb;->a:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xb;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/daaw/xb;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/daaw/xb;->a:I

    invoke-static {v0}, Lcom/daaw/yx2;->i(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xb;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Response Code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", Debug Message: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
