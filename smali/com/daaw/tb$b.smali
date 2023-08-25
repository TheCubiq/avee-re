.class public final Lcom/daaw/tb$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/tb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/tb$b$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/kz0;

.field public final b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/tb$b$a;Lcom/daaw/jt2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/tb$b$a;->d(Lcom/daaw/tb$b$a;)Lcom/daaw/kz0;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/tb$b;->a:Lcom/daaw/kz0;

    invoke-static {p1}, Lcom/daaw/tb$b$a;->e(Lcom/daaw/tb$b$a;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/tb$b;->b:Ljava/lang/String;

    return-void
.end method

.method public static a()Lcom/daaw/tb$b$a;
    .locals 2

    new-instance v0, Lcom/daaw/tb$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/tb$b$a;-><init>(Lcom/daaw/is2;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lcom/daaw/kz0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tb$b;->a:Lcom/daaw/kz0;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tb$b;->b:Ljava/lang/String;

    return-object v0
.end method
