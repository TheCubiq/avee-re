.class public Lcom/daaw/tb$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/tb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/tb$c$a;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/mv2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/tb$c;->b:I

    return-void
.end method

.method public static a()Lcom/daaw/tb$c$a;
    .locals 2

    new-instance v0, Lcom/daaw/tb$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/tb$c$a;-><init>(Lcom/daaw/ou2;)V

    return-object v0
.end method

.method public static bridge synthetic c(Lcom/daaw/tb$c;)Lcom/daaw/tb$c$a;
    .locals 2

    invoke-static {}, Lcom/daaw/tb$c;->a()Lcom/daaw/tb$c$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/tb$c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/tb$c$a;->c(Ljava/lang/String;)Lcom/daaw/tb$c$a;

    iget p0, p0, Lcom/daaw/tb$c;->b:I

    invoke-virtual {v0, p0}, Lcom/daaw/tb$c$a;->e(I)Lcom/daaw/tb$c$a;

    return-object v0
.end method

.method public static bridge synthetic e(Lcom/daaw/tb$c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tb$c;->a:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic f(Lcom/daaw/tb$c;I)V
    .locals 0

    iput p1, p0, Lcom/daaw/tb$c;->b:I

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Lcom/daaw/tb$c;->b:I

    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tb$c;->a:Ljava/lang/String;

    return-object v0
.end method
