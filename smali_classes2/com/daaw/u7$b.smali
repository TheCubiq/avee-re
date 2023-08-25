.class public final Lcom/daaw/u7$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lt0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/u7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/lt0<",
        "Lcom/daaw/lm$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/u7$b;

.field public static final b:Lcom/daaw/q00;

.field public static final c:Lcom/daaw/q00;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/u7$b;

    invoke-direct {v0}, Lcom/daaw/u7$b;-><init>()V

    sput-object v0, Lcom/daaw/u7$b;->a:Lcom/daaw/u7$b;

    const-string v0, "key"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$b;->b:Lcom/daaw/q00;

    const-string v0, "value"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/u7$b;->c:Lcom/daaw/q00;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/lm$c;

    check-cast p2, Lcom/daaw/mt0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/u7$b;->b(Lcom/daaw/lm$c;Lcom/daaw/mt0;)V

    return-void
.end method

.method public b(Lcom/daaw/lm$c;Lcom/daaw/mt0;)V
    .locals 2

    sget-object v0, Lcom/daaw/u7$b;->b:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/u7$b;->c:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/lm$c;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    return-void
.end method
